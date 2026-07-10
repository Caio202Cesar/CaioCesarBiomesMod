package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.FoliagePlacers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.feature.TreeFeature;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.foliageplacer.FoliagePlacerType;

import java.util.Random;
import java.util.Set;

public class YewFoliagePlacer extends FoliagePlacer {

    public static final Codec<YewFoliagePlacer> CODEC =
            RecordCodecBuilder.create(instance ->
                    func_242830_b(instance)
                            .apply(instance, YewFoliagePlacer::new));

    public YewFoliagePlacer(FeatureSpread radius, FeatureSpread offset) {
        super(radius, offset);
    }

    @Override
    protected FoliagePlacerType<?> getPlacerType() {
        return ModFoliagePlacer.YEW_FOLIAGE_PLACER.get();
    }

    @Override
    protected void func_230372_a_(
            IWorldGenerationReader world,
            Random random,
            BaseTreeFeatureConfig config,
            int trunkHeight,
            Foliage foliage,
            int foliageHeight,
            int radius,
            Set<BlockPos> leaves,
            int offset,
            MutableBoundingBox box) {

        BlockPos tip = foliage.func_236763_a_();

        int canopyHeight = trunkHeight - 1;

        for (int y = 0; y < canopyHeight; y++) {

            // Distance from the ground.
            float t = (float) y / (canopyHeight - 1);

            int layerRadius;

            if (t < 0.08F) {
                // Very bottom
                layerRadius = 2;
            } else if (t < 0.18F) {
                layerRadius = 3;
            } else if (t < 0.28F) {
                layerRadius = 4;
            } else if (t < 0.78F) {
                // Broad cylindrical body
                layerRadius = 5;
            } else if (t < 0.90F) {
                // Begin rounding toward the top
                layerRadius = 4;
            } else if (t < 0.97F) {
                layerRadius = 3;
            } else {
                // Rounded tip
                layerRadius = 2;
            }

            placeLayer(
                    world,
                    random,
                    config,
                    tip.down(canopyHeight - 1 - y),
                    layerRadius,
                    leaves,
                    box
            );
        }
    }

    @Override
    public int func_230374_a_(Random random,
                              int trunkHeight,
                              BaseTreeFeatureConfig config) {

        return 14;
    }

    @Override
    protected boolean func_230373_a_(Random random,
                                     int x,
                                     int y,
                                     int z,
                                     int radius,
                                     boolean giantTrunk) {
        return false;
    }

    private void placeLayer(
            IWorldGenerationReader world,
            Random random,
            BaseTreeFeatureConfig config,
            BlockPos center,
            int radius,
            Set<BlockPos> leaves,
            MutableBoundingBox box) {

        for (int x = -radius; x <= radius; x++) {
            for (int z = -radius; z <= radius; z++) {

                double dist = Math.sqrt(x * x + z * z);

                if (dist > radius)
                    continue;

                // Slightly irregular outline
                if (dist > radius - 0.25 && random.nextFloat() < 0.15F)
                    continue;

                BlockPos pos = center.add(x, 0, z);

                if (TreeFeature.isReplaceableAt(world, pos)) {

                    BlockState state = config.leavesProvider
                            .getBlockState(random, pos)
                            .with(LeavesBlock.PERSISTENT, true)
                            .with(LeavesBlock.DISTANCE, 1);

                    world.setBlockState(pos, state, 19);

                    leaves.add(pos);
                    box.expandTo(new MutableBoundingBox(pos, pos));

                    // Occasional little vertical tufts
                    if (dist > radius - 1 && random.nextInt(20) == 0) {

                        BlockPos up = pos.up();

                        if (TreeFeature.isReplaceableAt(world, up)) {

                            world.setBlockState(up, state, 19);

                            leaves.add(up);
                            box.expandTo(new MutableBoundingBox(up, up));
                        }
                    }
                }
            }
        }
    }
}
