package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.TrunkPlacers;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.trunkplacer.AbstractTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.TrunkPlacerType;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class CoastalLeaningTrunkPlacer extends AbstractTrunkPlacer {

    public static final Codec<CoastalLeaningTrunkPlacer> CODEC =
            RecordCodecBuilder.create(instance ->
                    getAbstractTrunkCodec(instance)
                            .and(Codec.intRange(3, 6)
                                    .fieldOf("branches")
                                    .forGetter(tp -> tp.branchCount))
                            .and(Codec.intRange(4, 10)
                                    .fieldOf("branch_length")
                                    .forGetter(tp -> tp.branchLength))
                            .apply(instance, CoastalLeaningTrunkPlacer::new));

    private final int branchCount;
    private final int branchLength;

    public CoastalLeaningTrunkPlacer(
            int baseHeight,
            int heightRandA,
            int heightRandB,
            int branchCount,
            int branchLength) {

        super(baseHeight, heightRandA, heightRandB);

        this.branchCount = branchCount;
        this.branchLength = branchLength;
    }

    @Override
    protected TrunkPlacerType<?> getPlacerType() {
        return ModTrunkPlacers.COASTAL_LEANING;
    }

    @Override
    public List<FoliagePlacer.Foliage> getFoliages(
            IWorldGenerationReader reader,
            Random rand,
            int treeHeight,
            BlockPos startPos,
            Set<BlockPos> logs,
            MutableBoundingBox box,
            BaseTreeFeatureConfig config) {

        List<FoliagePlacer.Foliage> foliages = Lists.newArrayList();

        func_236909_a_(reader, startPos.down());

        //-----------------------------------
        // Leaning trunk
        //-----------------------------------

        int trunkX = 0;
        int trunkZ = 0;

        for (int y = 0; y < treeHeight; y++) {

            if (y > 2 && rand.nextFloat() < 0.30F) {

                trunkX += rand.nextInt(3) - 1;
                trunkZ += rand.nextInt(3) - 1;

                trunkX = MathHelper.clamp(trunkX, -2, 2);
                trunkZ = MathHelper.clamp(trunkZ, -2, 2);
            }

            BlockPos logPos = startPos.add(trunkX, y, trunkZ);

            placeLog(reader, rand, logPos, logs, box, config);

            // slight buttress near ground

            if (y < 2) {

                if (rand.nextFloat() < 0.40F)
                    placeLog(reader, rand, logPos.west(), logs, box, config);

                if (rand.nextFloat() < 0.40F)
                    placeLog(reader, rand, logPos.north(), logs, box, config);
            }
        }

        BlockPos trunkTop = startPos.add(trunkX, treeHeight - 1, trunkZ);

        //-----------------------------------
        // Scaffold branches
        //-----------------------------------

        double startAngle = rand.nextDouble() * Math.PI * 2;

        for (int i = 0; i < branchCount; i++) {

            BlockPos branchStart = trunkTop.down(rand.nextInt(3));

            double angle =
                    startAngle +
                            (Math.PI * 2 * i) / branchCount;

            angle += (rand.nextDouble() - 0.5D)
                    * Math.toRadians(30);

            int length =
                    branchLength - 1 + rand.nextInt(3);

            double x = branchStart.getX() + 0.5;
            double y = branchStart.getY();
            double z = branchStart.getZ() + 0.5;

            double dx = Math.cos(angle);
            double dz = Math.sin(angle);

            BlockPos lastPos = branchStart;

            boolean forked = false;

            for (int step = 0; step < length; step++) {

                x += dx;
                z += dz;

                if (step < length * 0.60) {

                    if (rand.nextFloat() < 0.70F)
                        y++;

                } else {

                    if (rand.nextFloat() < 0.20F)
                        y++;

                    if (rand.nextFloat() < 0.10F)
                        y--;
                }

                angle +=
                        (rand.nextDouble() - 0.5D)
                                * Math.toRadians(8);

                dx = Math.cos(angle);
                dz = Math.sin(angle);

                lastPos = new BlockPos(
                        MathHelper.floor(x),
                        MathHelper.floor(y),
                        MathHelper.floor(z));

                placeLog(reader, rand,
                        lastPos,
                        logs,
                        box,
                        config);

                //--------------------------------
                // Thick base
                //--------------------------------

                if (step < 3) {

                    if (Math.abs(dx) > Math.abs(dz))
                        placeLog(reader, rand,
                                lastPos.east(),
                                logs,
                                box,
                                config);
                    else
                        placeLog(reader, rand,
                                lastPos.south(),
                                logs,
                                box,
                                config);
                }

                //--------------------------------
                // One fork
                //--------------------------------

                if (!forked &&
                        step > length / 2 &&
                        rand.nextFloat() < 0.35F) {

                    forked = true;

                    double forkAngle =
                            angle +
                                    (rand.nextBoolean()
                                            ? Math.toRadians(25)
                                            : -Math.toRadians(25));

                    double fx = lastPos.getX();
                    double fy = lastPos.getY();
                    double fz = lastPos.getZ();

                    double fdx = Math.cos(forkAngle);
                    double fdz = Math.sin(forkAngle);

                    BlockPos forkEnd = lastPos;

                    int forkLength = 3 + rand.nextInt(3);

                    for (int j = 0; j < forkLength; j++) {

                        fx += fdx;
                        fz += fdz;

                        if (rand.nextFloat() < 0.25F)
                            fy++;

                        forkEnd = new BlockPos(
                                MathHelper.floor(fx),
                                MathHelper.floor(fy),
                                MathHelper.floor(fz));

                        placeLog(reader,
                                rand,
                                forkEnd,
                                logs,
                                box,
                                config);
                    }

                    foliages.add(
                            new FoliagePlacer.Foliage(
                                    forkEnd,
                                    0,
                                    false));
                }
            }

            foliages.add(
                    new FoliagePlacer.Foliage(
                            lastPos,
                            0,
                            false));

            if (rand.nextBoolean())
                foliages.add(
                        new FoliagePlacer.Foliage(
                                lastPos.up(),
                                0,
                                false));

            if (rand.nextFloat() < 0.40F)
                foliages.add(
                        new FoliagePlacer.Foliage(
                                lastPos.east(),
                                0,
                                false));
        }

        return foliages;
    }

    private void placeLog(
            IWorldGenerationReader reader,
            Random rand,
            BlockPos pos,
            Set<BlockPos> logs,
            MutableBoundingBox box,
            BaseTreeFeatureConfig config) {

        func_236911_a_(
                reader,
                rand,
                pos,
                logs,
                box,
                config);
    }
}
