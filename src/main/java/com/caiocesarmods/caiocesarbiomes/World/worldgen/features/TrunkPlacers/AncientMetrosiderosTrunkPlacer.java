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

public class AncientMetrosiderosTrunkPlacer extends AbstractTrunkPlacer {
    public static final Codec<AncientMetrosiderosTrunkPlacer> CODEC =
            RecordCodecBuilder.create(instance ->
                    getAbstractTrunkCodec(instance)
                            .and(Codec.intRange(4, 8)
                                    .fieldOf("branches")
                                    .forGetter(tp -> tp.branchCount))
                            .and(Codec.intRange(4, 16)
                                    .fieldOf("branch_length")
                                    .forGetter(tp -> tp.branchLength))
                            .apply(instance, AncientMetrosiderosTrunkPlacer::new));

    private final int branchCount;
    private final int branchLength;

    public AncientMetrosiderosTrunkPlacer(int baseHeight,
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
        return ModTrunkPlacers.ANCIENT_METROSIDEROS;
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

        //----------------------------------------
        // Ancient multi-stem 2x2 trunk
        //----------------------------------------

        int[] offX = {0, 1, 0, 1};
        int[] offZ = {0, 0, 1, 1};

        int dominantStem = rand.nextInt(4);

        BlockPos[] topPositions = new BlockPos[4];

        for (int y = 0; y < treeHeight; y++) {

            for (int stem = 0; stem < 4; stem++) {

                if (stem != dominantStem &&
                        y > 2 &&
                        rand.nextFloat() < 0.25F) {

                    int nx = offX[stem] + rand.nextInt(3) - 1;
                    int nz = offZ[stem] + rand.nextInt(3) - 1;

                    nx = MathHelper.clamp(nx, -2, 3);
                    nz = MathHelper.clamp(nz, -2, 3);

                    boolean connected = false;

                    for (int other = 0; other < 4; other++) {

                        if (other == stem)
                            continue;

                        if (Math.abs(nx - offX[other]) <= 1 &&
                                Math.abs(nz - offZ[other]) <= 1) {

                            connected = true;
                            break;
                        }
                    }

                    if (connected) {
                        offX[stem] = nx;
                        offZ[stem] = nz;
                    }
                }

                BlockPos logPos = startPos.add(offX[stem], y, offZ[stem]);

                placeLog(reader, rand, logPos, logs, box, config);

                topPositions[stem] = logPos;

                //----------------------------------
                // Buttressed base
                //----------------------------------

                if (y < 3) {

                    if (rand.nextFloat() < 0.45F)
                        placeLog(reader, rand, logPos.west(), logs, box, config);

                    if (rand.nextFloat() < 0.45F)
                        placeLog(reader, rand, logPos.north(), logs, box, config);
                }
            }
        }

        //----------------------------------------
        // Branches
        //----------------------------------------

        double startAngle = rand.nextDouble() * Math.PI * 2D;

        for (int i = 0; i < branchCount; i++) {

            BlockPos branchStart =
                    topPositions[rand.nextInt(topPositions.length)]
                            .down(rand.nextInt(5));

            double angle =
                    startAngle +
                            (Math.PI * 2D * i) / branchCount;

            angle += (rand.nextDouble() - 0.5D) * Math.toRadians(35);

            int currentLength =
                    branchLength - 2 + rand.nextInt(5);

            double x = branchStart.getX() + 0.5;
            double y = branchStart.getY();
            double z = branchStart.getZ() + 0.5;

            double dx = Math.cos(angle);
            double dz = Math.sin(angle);

            BlockPos lastPos = branchStart;

            boolean forked = false;

            for (int step = 0; step < currentLength; step++) {

                x += dx;
                z += dz;

                //----------------------------------
                // Strong upward growth
                //----------------------------------

                if (step < currentLength * 0.65) {

                    if (rand.nextFloat() < 0.70F)
                        y++;

                } else {

                    if (rand.nextFloat() < 0.18F)
                        y++;

                    if (rand.nextFloat() < 0.08F)
                        y--;
                }

                double curve =
                        step < currentLength / 2
                                ? Math.toRadians(10)
                                : Math.toRadians(6);

                angle += (rand.nextDouble() - 0.5D) * curve;

                dx = Math.cos(angle);
                dz = Math.sin(angle);

                lastPos = new BlockPos(
                        MathHelper.floor(x),
                        MathHelper.floor(y),
                        MathHelper.floor(z));

                placeLog(reader, rand, lastPos, logs, box, config);

                //----------------------------------
                // Thick branch bases
                //----------------------------------

                if (step < 6) {

                    if (Math.abs(dx) > Math.abs(dz)) {

                        placeLog(reader, rand,
                                lastPos.east(),
                                logs,
                                box,
                                config);

                    } else {

                        placeLog(reader, rand,
                                lastPos.south(),
                                logs,
                                box,
                                config);
                    }
                }

                //----------------------------------
                // Single fork
                //----------------------------------

                if (!forked &&
                        step > currentLength / 2 &&
                        rand.nextFloat() < 0.35F) {

                    forked = true;

                    double forkAngle =
                            angle +
                                    (rand.nextBoolean()
                                            ? Math.toRadians(30)
                                            : -Math.toRadians(30));

                    double fx = lastPos.getX();
                    double fy = lastPos.getY();
                    double fz = lastPos.getZ();

                    double fdx = Math.cos(forkAngle);
                    double fdz = Math.sin(forkAngle);

                    BlockPos forkEnd = lastPos;

                    int forkLength = 3 + rand.nextInt(4);

                    for (int j = 0; j < forkLength; j++) {

                        fx += fdx;
                        fz += fdz;

                        if (rand.nextFloat() < 0.30F)
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

                    foliages.add(new FoliagePlacer.Foliage(forkEnd, 0, false));
                }
            }

            //----------------------------------------
            // Foliage
            //----------------------------------------

            foliages.add(new FoliagePlacer.Foliage(lastPos, 0, false));

            if (rand.nextBoolean())
                foliages.add(new FoliagePlacer.Foliage(lastPos.up(), 0, false));

            if (rand.nextBoolean())
                foliages.add(new FoliagePlacer.Foliage(lastPos.east(), 0, false));

            if (rand.nextBoolean())
                foliages.add(new FoliagePlacer.Foliage(lastPos.south(), 0, false));
        }

        return foliages;
    }

    private void placeLog(IWorldGenerationReader reader,
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