package com.caiocesarmods.caiocesarbiomes.World.worldgen.placers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
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

    @Override
    protected void func_230372_a_(IWorldGenerationReader world, Random random, BaseTreeFeatureConfig config, int trunkHeight, Foliage foliage, int foliageHeight, int radius, Set<BlockPos> leaves, int offset, MutableBoundingBox boundingBox) {
        // Position from which leaves start covering the trunk
        BlockPos basePos = foliage.func_236763_a_();

        // Cover the trunk with leaves from the base to the top
        for (int dy = 0; dy < trunkHeight; dy++) {
            BlockPos trunkPos = basePos.up(dy);
            placeLeavesAround(world, random, config, trunkPos, leaves, boundingBox);
        }

        // Decide randomly which option to use for the top leaves
        if (random.nextBoolean()) {
            // Option 1: Column of 1-3 leaves at the top of the trunk
            addTopLeafColumn(world, random, config, basePos.up(trunkHeight), leaves, boundingBox);
        } else {
            // Option 2: Cross pattern leaves at the top
            placeTopLeaves(world, random, config, basePos.up(trunkHeight), leaves, boundingBox);
        }
    }

    private void placeLeavesAround(IWorldGenerationReader world, Random random, BaseTreeFeatureConfig config, BlockPos trunkPos, Set<BlockPos> leaves, MutableBoundingBox boundingBox) {
        // Generate a 3x3 ring of leaves around each trunk block
        for (int dx = -1; dx <= 1; dx++) {
            for (int dz = -1; dz <= 1; dz++) {
                if (dx != 0 || dz != 0) { // Skip trunk position itself
                    BlockPos leafPos = trunkPos.add(dx, 0, dz);
                    placeLeafIfAir(world, random, config, leafPos, leaves, boundingBox);
                }
            }
        }
    }

    private void addTopLeafColumn(IWorldGenerationReader world, Random random, BaseTreeFeatureConfig config, BlockPos topTrunkPos, Set<BlockPos> leaves, MutableBoundingBox boundingBox) {
        // Option 1: Column of 1-2 leaves at the top of the trunk
        for (int i = 1; i <= 3; i++) {
            BlockPos leafPos = topTrunkPos.up(i);
            placeLeafIfAir(world, random, config, leafPos, leaves, boundingBox);
        }
    }

    private void placeTopLeaves(IWorldGenerationReader world, Random random, BaseTreeFeatureConfig config, BlockPos pos, Set<BlockPos> leaves, MutableBoundingBox boundingBox) {
        // Option 2: Cross pattern leaves around the top, including a leaf block in the center
        for (int dy = 0; dy < MathHelper.nextInt(random, 1, 3); dy++) {
            BlockPos leafPos = pos.up(dy);

            // Place a leaf in the center
            placeLeafIfAir(world, random, config, leafPos, leaves, boundingBox);

            // Place the cross pattern (North, South, East, West) around the center
            placeCrossPatternLeaves(world, random, config, leafPos, leaves, boundingBox);
        }
    }

    private void placeCrossPatternLeaves(IWorldGenerationReader world, Random random, BaseTreeFeatureConfig config, BlockPos pos, Set<BlockPos> leaves, MutableBoundingBox boundingBox) {
        // Cross pattern around the trunk for the second half of the top canopy
        placeLeafIfAir(world, random, config, pos.north(), leaves, boundingBox);
        placeLeafIfAir(world, random, config, pos.south(), leaves, boundingBox);
        placeLeafIfAir(world, random, config, pos.east(), leaves, boundingBox);
        placeLeafIfAir(world, random, config, pos.west(), leaves, boundingBox);
    }

    private void placeLeafIfAir(IWorldGenerationReader world, Random random, BaseTreeFeatureConfig config, BlockPos pos, Set<BlockPos> leaves, MutableBoundingBox boundingBox) {
        if (world.hasBlockState(pos, state -> state.isAir((IBlockReader) world, pos))) {
            world.setBlockState(pos, config.leavesProvider.getBlockState(random, pos), 19);
            leaves.add(pos);
            boundingBox.expandTo(new MutableBoundingBox(pos, pos));
        }
    }

    @Override
    public int func_230374_a_(Random random, int trunkHeight, BaseTreeFeatureConfig config) {
        return MathHelper.nextInt(random, 3, 5); // Adjust foliage height if needed
    }

    @Override
    protected boolean func_230373_a_(Random random, int dx, int y, int dz, int radius, boolean large) {
        return false; // Uniform placement without skipping
    }
}