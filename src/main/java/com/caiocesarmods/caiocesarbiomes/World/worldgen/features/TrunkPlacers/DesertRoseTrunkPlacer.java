package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.TrunkPlacers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.trunkplacer.AbstractTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.TrunkPlacerType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Collections;

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

            if (y < treeHeight * 0.20F)
                radius = 2;
            else if (y < treeHeight * 0.55F)
                radius = 2;
            else
                radius = 1;

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

        /*
         * PRIMARY BRANCHES
         */

        List<Direction> availableDirections = new ArrayList<>();
        availableDirections.add(Direction.NORTH);
        availableDirections.add(Direction.SOUTH);
        availableDirections.add(Direction.EAST);
        availableDirections.add(Direction.WEST);

        Collections.shuffle(availableDirections, rand);

        int branchCount = 3 + rand.nextInt(2); // 3-4 main branches

        for (int branch = 0; branch < branchCount; branch++) {

            Direction dir = availableDirections.get(branch);

            BlockPos current = crownBase;

            int length = 2 + rand.nextInt(3);

            for (int i = 0; i < length; i++) {

                current = current.offset(dir);

                // Most segments rise
                if (rand.nextFloat() < 0.75F) {
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
             * Optional fork
             */

            if (rand.nextFloat() < 0.45F) {

                Direction sideDir;

                if (dir.getAxis() == Direction.Axis.Z) {
                    sideDir = rand.nextBoolean()
                            ? Direction.EAST
                            : Direction.WEST;
                } else {
                    sideDir = rand.nextBoolean()
                            ? Direction.NORTH
                            : Direction.SOUTH;
                }

                BlockPos fork = current;

                int forkLength = 1 + rand.nextInt(2);

                for (int i = 0; i < forkLength; i++) {

                    fork = fork.offset(sideDir);

                    if (rand.nextFloat() < 0.75F) {
                        fork = fork.up();
                    }

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

        return foliage;
    }
}
