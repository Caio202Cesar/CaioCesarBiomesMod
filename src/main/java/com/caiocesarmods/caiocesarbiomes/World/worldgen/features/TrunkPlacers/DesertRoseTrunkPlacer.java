package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.TrunkPlacers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.trunkplacer.AbstractTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.TrunkPlacerType;

public class DesertRoseTrunkPlacer extends AbstractTrunkPlacer {

    public static final Codec<DesertRoseTrunkPlacer> CODEC =
            RecordCodecBuilder.create(instance ->
                    getAbstractTrunkCodec(instance)
                            .apply(instance, DesertRoseTrunkPlacer::new));

    public DesertRoseTrunkPlacer(
            int baseHeight,
            int heightRandA,
            int heightRandB) {

        super(baseHeight, heightRandA, heightRandB);
    }

    @Override
    protected TrunkPlacerType<?> getPlacerType() {
        return ModTrunkPlacers.DESERT_ROSE;
    }

    @Override
    public List<FoliagePlacer.Foliage> getFoliages(
            IWorldGenerationReader reader,
            Random rand,
            int treeHeight,
            BlockPos pos,
            Set<BlockPos> logs,
            MutableBoundingBox box,
            BaseTreeFeatureConfig config) {

        List<FoliagePlacer.Foliage> foliage = new ArrayList<>();

        /*
         * MAIN CAUDEX
         */

        for (int y = 0; y < treeHeight; y++) {

            int radius;

            if (y < treeHeight * 0.25F) {
                radius = 3; // 7x7 swollen base
            }
            else if (y < treeHeight * 0.60F) {
                radius = 2; // 5x5 middle trunk
            }
            else {
                radius = 1; // 3x3 upper trunk
            }

            for (int x = -radius; x <= radius; x++) {
                for (int z = -radius; z <= radius; z++) {

                    if (x * x + z * z > radius * radius) {
                        continue;
                    }

                    func_236911_a_(
                            reader,
                            rand,
                            pos.add(x, y, z),
                            logs,
                            box,
                            config
                    );
                }
            }
        }

        /*
         * MULTI-STEM EFFECT
         */

        BlockPos crownBase = pos.up(treeHeight - 2);

        for (int y = treeHeight / 2; y < treeHeight; y++) {

            func_236911_a_(
                    reader,
                    rand,
                    pos.add(1, y, 0),
                    logs,
                    box,
                    config
            );

            func_236911_a_(
                    reader,
                    rand,
                    pos.add(-1, y, 0),
                    logs,
                    box,
                    config
            );
        }

        /*
         * PRIMARY BRANCHES
         */

        Direction[] directions = {
                Direction.NORTH,
                Direction.SOUTH,
                Direction.EAST,
                Direction.WEST
        };

        for (Direction dir : directions) {

            BlockPos current = crownBase;

            int length = 2 + rand.nextInt(3);

            for (int i = 0; i < length; i++) {

                current = current.offset(dir);

                if (rand.nextBoolean()) {
                    current = current.up();
                }

                func_236911_a_(
                        reader,
                        rand,
                        current,
                        logs,
                        box,
                        config
                );
            }

            /*
             * Secondary branch
             */

            if (rand.nextFloat() < 0.7F) {

                BlockPos fork = current;

                Direction sideDir;

                if (dir == Direction.NORTH || dir == Direction.SOUTH) {
                    sideDir = rand.nextBoolean()
                            ? Direction.EAST
                            : Direction.WEST;
                } else {
                    sideDir = rand.nextBoolean()
                            ? Direction.NORTH
                            : Direction.SOUTH;
                }

                int forkLength = 1 + rand.nextInt(2);

                for (int i = 0; i < forkLength; i++) {

                    fork = fork.offset(sideDir).up();

                    func_236911_a_(
                            reader,
                            rand,
                            fork,
                            logs,
                            box,
                            config
                    );
                }

                foliage.add(
                        new FoliagePlacer.Foliage(
                                fork,
                                0,
                                false
                        )
                );
            }

            foliage.add(
                    new FoliagePlacer.Foliage(
                            current,
                            0,
                            false
                    )
            );
        }

        /*
         * Central flowering crown
         */

        foliage.add(
                new FoliagePlacer.Foliage(
                        crownBase.up(),
                        0,
                        false
                )
        );

        return foliage;
    }
}
