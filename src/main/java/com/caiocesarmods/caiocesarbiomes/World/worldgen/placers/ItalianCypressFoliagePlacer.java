package com.caiocesarmods.caiocesarbiomes.World.worldgen.placers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.foliageplacer.FoliagePlacerType;

import java.util.Random;
import java.util.Set;

public class ItalianCypressFoliagePlacer extends FoliagePlacer {
    public static final Codec<ItalianCypressFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    FeatureSpread.CODEC.fieldOf("radius").forGetter(placer -> placer.radius),
                    FeatureSpread.CODEC.fieldOf("offset").forGetter(placer -> placer.offset)
            ).apply(instance, ItalianCypressFoliagePlacer::new)
    );

    public ItalianCypressFoliagePlacer(FeatureSpread radius, FeatureSpread offset) {
        super(radius, offset);
    }

    @Override
    protected FoliagePlacerType<?> getPlacerType() {
        return ModFoliagePlacers.ITALIAN_CYPRESS_FOLIAGE_PLACER.get();
    }

    protected void func_230372_a_(IWorldGenerationReader world, Random random, BaseTreeFeatureConfig config, int trunkHeight, Foliage foliage, int foliageHeight, int radius, Set<BlockPos> leaves, int offset, MutableBoundingBox boundingBox) {
        BlockPos startPos = foliage.func_236763_a_(); // Start foliage from base

        // Loop through each level of the trunk to cover with leaves
        for (int dy = 1; dy <= trunkHeight; dy++) {
            BlockPos currentPos = startPos.up(dy);
            placeLeavesAroundTrunk(world, random, config, currentPos, leaves, boundingBox);
        }

        // Optional: Add top foliage with a cross pattern
        placeTopLeaves(world, random, config, startPos.up(trunkHeight + 1), leaves, boundingBox);
    }

    @Override
    public int func_230374_a_(Random p_230374_1_, int p_230374_2_, BaseTreeFeatureConfig p_230374_3_) {
        return 0;
    }

    @Override
    protected boolean func_230373_a_(Random p_230373_1_, int p_230373_2_, int p_230373_3_, int p_230373_4_, int p_230373_5_, boolean p_230373_6_) {
        return false;
    }

    private void placeLeavesAroundTrunk(IWorldGenerationReader world, Random random, BaseTreeFeatureConfig config, BlockPos pos, Set<BlockPos> leaves, MutableBoundingBox boundingBox) {
        for (int dx = -1; dx <= 1; dx++) {
            for (int dz = -1; dz <= 1; dz++) {
                BlockPos leafPos = pos.add(dx, 0, dz);

                // Skip the trunk position itself but place leaves around it
                if ((dx != 0 || dz != 0) && world.hasBlockState(leafPos, state -> state.isAir() || state.getMaterial().isReplaceable())) {
                    placeLeafAt(world, random, config, leafPos, leaves, boundingBox);
                }
            }
        }
    }

    // Place top leaves in a cross pattern for a distinct upper canopy effect
    private void placeTopLeaves(IWorldGenerationReader world, Random random, BaseTreeFeatureConfig config, BlockPos pos, Set<BlockPos> leaves, MutableBoundingBox boundingBox) {
        for (int dy = 0; dy < MathHelper.nextInt(random, 1, 3); dy++) {
            BlockPos leafPos = pos.up(dy);
            placeCrossPatternLeaves(world, random, config, leafPos, leaves, boundingBox);
        }
    }

    // Cross pattern for the upper foliage
    private void placeCrossPatternLeaves(IWorldGenerationReader world, Random random, BaseTreeFeatureConfig config, BlockPos pos, Set<BlockPos> leaves, MutableBoundingBox boundingBox) {
        placeLeafAt(world, random, config, pos.north(), leaves, boundingBox);
        placeLeafAt(world, random, config, pos.south(), leaves, boundingBox);
        placeLeafAt(world, random, config, pos.east(), leaves, boundingBox);
        placeLeafAt(world, random, config, pos.west(), leaves, boundingBox);
    }

    private void placeLeafAt(IWorldGenerationReader world, Random random, BaseTreeFeatureConfig config, BlockPos pos, Set<BlockPos> leaves, MutableBoundingBox boundingBox) {
        if (world.hasBlockState(pos, state -> state.isAir())) {
            world.setBlockState(pos, config.leavesProvider.getBlockState(random, pos), 19);
            leaves.add(pos);
            boundingBox.expandTo(new MutableBoundingBox(pos, pos));
        }
    }
}
