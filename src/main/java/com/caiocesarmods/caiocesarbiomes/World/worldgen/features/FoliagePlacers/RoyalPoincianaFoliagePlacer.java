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

public class RoyalPoincianaFoliagePlacer extends FoliagePlacer {

    public static final Codec<RoyalPoincianaFoliagePlacer> CODEC =
            RecordCodecBuilder.create(instance ->
                    func_242830_b(instance)
                            .and(Codec.intRange(2, 16)
                                    .fieldOf("height")
                                    .forGetter(fp -> fp.height))
                            .apply(instance, RoyalPoincianaFoliagePlacer::new));

    protected final int height;

    public RoyalPoincianaFoliagePlacer(FeatureSpread radius,
                                       FeatureSpread offset,
                                       int height) {
        super(radius, offset);
        this.height = height;
    }

    @Override
    protected FoliagePlacerType<?> getPlacerType() {
        return ModFoliagePlacer.ROYAL_POINCIANA_FOLIAGE_PLACER.get();
    }

    @Override
    public int func_230374_a_(Random random,
                             int trunkHeight,
                             BaseTreeFeatureConfig config) {
        return height;
    }

    @Override
    protected boolean func_230373_a_(Random random,
                                         int localX,
                                         int localY,
                                         int localZ,
                                         int radius,
                                         boolean giantTrunk) {
        return false;
    }

    @Override
    protected void func_230372_a_(IWorldGenerationReader world,
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

        int baseRadius = radius + 2;

        // Only THREE layers
        for (int y = 0; y <= 1; y++) {

            double scale;

            switch (y) {
                case -1:
                    scale = 0.94;
                    break;

                case 0:
                    scale = 1.00;
                    break;

                default: // +1
                    scale = 0.92;
                    break;
            }

            double rx = baseRadius * scale;
            double rz = rx * 1.18; // slightly wider in Z

            int maxX = (int)Math.ceil(rx);
            int maxZ = (int)Math.ceil(rz);

            for (int x = -maxX; x <= maxX; x++) {
                for (int z = -maxZ; z <= maxZ; z++) {

                    double dx = x / rx;
                    double dz = z / rz;

                    double dist = dx * dx + dz * dz;

                    if (dist > 1.0)
                        continue;

                    // Feather the outer rim
                    if (dist > 0.93F && random.nextFloat() < 0.20F)
                        continue;

                    BlockPos pos = center.add(x, y, z);

                    placeLeaf(world, random, config, (BlockPos) leaves, (Set<BlockPos>) pos, box);

                    // Very occasional hanging leaves
                    if (dist > 0.88 && random.nextFloat() < 0.08F) {

                        placeLeaf(world, random, config,
                                (BlockPos) leaves,
                                (Set<BlockPos>) pos.down(),
                                box);
                    }

                    // Tiny protrusions to avoid a perfect ellipse
                    if (dist > 0.90 && random.nextFloat() < 0.12F) {

                        int px = x + random.nextInt(3) - 1;
                        int pz = z + random.nextInt(3) - 1;

                        BlockPos extra = center.add(px, y, pz);

                        placeLeaf(world, random, config,
                                (BlockPos) leaves,
                                (Set<BlockPos>) extra,
                                box);
                    }
                }
            }
        }
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
}
