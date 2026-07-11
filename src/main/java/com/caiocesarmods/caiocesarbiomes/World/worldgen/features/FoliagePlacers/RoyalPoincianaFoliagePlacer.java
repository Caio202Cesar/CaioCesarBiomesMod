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
                            .and(Codec.intRange(1, 4)
                                    .fieldOf("height")
                                    .forGetter(fp -> fp.height))
                            .and(Codec.intRange(2, 16)
                                    .fieldOf("canopy_radius")
                                    .forGetter(fp -> fp.canopyRadius))
                            .apply(instance, RoyalPoincianaFoliagePlacer::new));

    protected final int height;
    protected final int canopyRadius;

    public RoyalPoincianaFoliagePlacer(
            FeatureSpread radius,
            FeatureSpread offset,
            int height,
            int canopyRadius) {

        super(radius, offset);

        this.height = height;
        this.canopyRadius = canopyRadius;
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

        int baseRadius = this.canopyRadius;

        // Two foliage layers
        for (int y = 0; y <= 1; y++) {

            double scale = (y == 0) ? 1.0D : 0.94D;

            double rx = baseRadius * scale;
            double rz = rx * (1.25D + random.nextDouble() * 0.20D);

            int maxX = (int)Math.ceil(rx);
            int maxZ = (int)Math.ceil(rz);

            for (int x = -maxX; x <= maxX; x++) {
                for (int z = -maxZ; z <= maxZ; z++) {

                    double dx = x / rx;
                    double dz = z / rz;

                    double dist = dx * dx + dz * dz;

                    if (dist > 1.0D)
                        continue;

                    // Thin only the very outer rim
                    if (dist > 0.96D && random.nextFloat() < 0.35F)
                        continue;

                    int yOffset = 0;

                    // Slight umbrella droop
                    if (dist > 0.80D)
                        yOffset = -1;

                    if (dist > 0.95D && random.nextFloat() < 0.35F)
                        yOffset = -2;

                    BlockPos pos = center.add(x, y + yOffset, z);

                    placeLeaf(world, random, config, pos, leaves, box);

                    // Small protrusions around the edge
                    if (dist > 0.88D && random.nextFloat() < 0.10F) {

                        int px = x + random.nextInt(3) - 1;
                        int pz = z + random.nextInt(3) - 1;

                        BlockPos extra = center.add(px, y + yOffset, pz);

                        placeLeaf(world, random, config, extra, leaves, box);
                    }

                    // Very rare hanging leaves
                    if (dist > 0.95D && random.nextFloat() < 0.03F) {

                        placeLeaf(world, random, config,
                                pos.down(),
                                leaves,
                                box);
                    }
                }
            }
        }
    }

    private void placeLeaf(IWorldGenerationReader world,
                           Random random,
                           BaseTreeFeatureConfig config,
                           BlockPos pos,
                           Set<BlockPos> leaves,
                           MutableBoundingBox box) {

        if (TreeFeature.isReplaceableAt(world, pos)) {

            BlockState state = config.leavesProvider
                    .getBlockState(random, pos)
                    .with(LeavesBlock.PERSISTENT, true)
                    .with(LeavesBlock.DISTANCE, 1);

            world.setBlockState(pos, state, 19);

            leaves.add(pos);
            box.expandTo(new MutableBoundingBox(pos, pos));
        }
    }
}
