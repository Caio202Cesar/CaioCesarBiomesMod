package com.caiocesarmods.caiocesarbiomes.World.worldgen.placers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.foliageplacer.FoliagePlacerType;

import java.util.Random;
import java.util.Set;

public class ColumnarPineFoliagePlacer extends FoliagePlacer {
    public static final Codec<ColumnarPineFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    FeatureSpread.CODEC.fieldOf("radius").forGetter(placer -> placer.radius),
                    FeatureSpread.CODEC.fieldOf("offset").forGetter(placer -> placer.offset),
                    FeatureSpread.CODEC.fieldOf("trunk_height").forGetter(placer -> placer.trunkHeight)
            ).apply(instance, ColumnarPineFoliagePlacer::new)
    );

    private final FeatureSpread trunkHeight;

    public ColumnarPineFoliagePlacer(FeatureSpread radius, FeatureSpread offset, FeatureSpread trunkHeight) {
        super(radius, offset);
        this.trunkHeight = trunkHeight;
    }

    @Override
    protected FoliagePlacerType<?> getPlacerType() {
        return ModFoliagePlacers.COLUMNAR_PINE_FOLIAGE_PLACER.get();
    }

    @Override
    protected void func_230372_a_(IWorldGenerationReader world, Random random, BaseTreeFeatureConfig config, int trunkHeight, Foliage foliage, int foliageHeight, int radius, Set<BlockPos> leaves, int offset, MutableBoundingBox boundingBox) {
        BlockPos basePos = foliage.func_236763_a_(); // Starting position for foliage

        // Place leaves around the entire trunk, adjusting radius to maintain a columnar shape
        for (int dy = 0; dy <= trunkHeight; dy++) {
            BlockPos levelPos = basePos.up(dy);
            placeLeavesAroundTrunk(world, random, config, levelPos, radius, leaves, boundingBox);
        }

        // Cap the foliage at the top with a cross pattern for a clean column top
        placeTopFoliageCap(world, random, config, basePos.up(trunkHeight), leaves, boundingBox);
    }

    private void placeLeavesAroundTrunk(IWorldGenerationReader world, Random random, BaseTreeFeatureConfig config, BlockPos trunkPos, int radius, Set<BlockPos> leaves, MutableBoundingBox boundingBox) {
        // Place a tight 3x3 ring of leaves around each trunk block
        for (int dx = -radius; dx <= radius; dx++) {
            for (int dz = -radius; dz <= radius; dz++) {
                if (Math.abs(dx) != radius || Math.abs(dz) != radius || radius <= 0) {
                    BlockPos leafPos = trunkPos.add(dx, 0, dz);
                    placeLeafIfAir(world, random, config, leafPos, leaves, boundingBox);
                }
            }
        }
    }

    private void placeTopFoliageCap(IWorldGenerationReader world, Random random, BaseTreeFeatureConfig config, BlockPos pos, Set<BlockPos> leaves, MutableBoundingBox boundingBox) {
        // Place a cross-pattern of leaves at the top
        placeLeafIfAir(world, random, config, pos, leaves, boundingBox);
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
        return Math.max(4, trunkHeight - this.trunkHeight.getSpread(random)); // Adjust foliage height as needed
    }

    @Override
    protected boolean func_230373_a_(Random random, int dx, int y, int dz, int radius, boolean large) {
        return (dx * dx + dz * dz) > radius * radius; // Controls leaf skipping for slender shape
    }
}


