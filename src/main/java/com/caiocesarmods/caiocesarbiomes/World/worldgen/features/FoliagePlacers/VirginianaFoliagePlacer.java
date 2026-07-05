package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.FoliagePlacers;

import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
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

public class VirginianaFoliagePlacer extends FoliagePlacer {
    public static final Codec<VirginianaFoliagePlacer> CODEC =
            RecordCodecBuilder.create(instance ->
                    func_242830_b(instance)
                            .apply(instance, VirginianaFoliagePlacer::new));

    public VirginianaFoliagePlacer(FeatureSpread radius, FeatureSpread offset) {
        super(radius, offset);
    }

    @Override
    protected FoliagePlacerType<?> getPlacerType() {
        return ModFoliagePlacer.VIRGINIANA_FOLIAGE_PLACER.get();
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

        BlockPos center = foliage.func_236763_a_();

        generateBlob(world, random, config, foliage, leaves, box,
                center, 5, 2);

        generateBlob(world, random, config, foliage, leaves, box,
                center.add(3, -1, 0), 3, 1);

        generateBlob(world, random, config, foliage, leaves, box,
                center.add(-3, -1, 0), 3, 1);

        generateBlob(world, random, config, foliage, leaves, box,
                center.add(0, -1, 3), 3, 1);

        generateBlob(world, random, config, foliage, leaves, box,
                center.add(0, -1, -3), 3, 1);
    }

    @Override
    public int func_230374_a_(
            Random random,
            int trunkHeight,
            BaseTreeFeatureConfig config) {

        return 4;
    }

    @Override
    protected boolean func_230373_a_(
            Random random,
            int x,
            int y,
            int z,
            int radius,
            boolean giantTrunk) {

        double dist = Math.sqrt(x * x + z * z);

        if (dist > radius - 1) {
            return random.nextInt(3) == 0;
        }

        if (dist > radius - 2) {
            return random.nextInt(8) == 0;
        }

        return false;
    }

    private void placeLeaf(
            IWorldGenerationReader world,
            Random random,
            BaseTreeFeatureConfig config,
            BlockPos pos,
            Set<BlockPos> leaves,
            MutableBoundingBox box) {

        if (TreeFeature.isReplaceableAt(world, pos)) {

            BlockState leafState = config.leavesProvider
                    .getBlockState(random, pos)
                    .with(LeavesBlock.PERSISTENT, true)
                    .with(LeavesBlock.DISTANCE, 1);

            world.setBlockState(pos, leafState, 19);

            leaves.add(pos);
            box.expandTo(new MutableBoundingBox(pos, pos));
        }
    }

    private void generateBlob(
            IWorldGenerationReader world,
            Random random,
            BaseTreeFeatureConfig config,
            Foliage foliage,
            Set<BlockPos> leaves,
            MutableBoundingBox box,
            BlockPos center,
            int radius,
            int height) {

        for (int y = -height; y <= height; y++) {

            int layerRadius = radius - Math.abs(y);

            for (int x = -layerRadius; x <= layerRadius; x++) {
                for (int z = -layerRadius; z <= layerRadius; z++) {

                    double dist = Math.sqrt(x * x + z * z);

                    if (dist > layerRadius)
                        continue;

                    boolean edge = dist > layerRadius - 1;

                    if (edge && random.nextFloat() < 0.35F)
                        continue;

                    BlockPos pos = center.add(x, y, z);

                    placeLeaf(world, random, config, pos, leaves, box);
                }
            }
        }
    }
}
