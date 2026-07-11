package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.TrunkPlacers;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.trunkplacer.AbstractTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.TrunkPlacerType;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class UmbrellaTrunkPlacer extends AbstractTrunkPlacer {
    public static final Codec<UmbrellaTrunkPlacer> CODEC =
            RecordCodecBuilder.create(instance ->
                    getAbstractTrunkCodec(instance)
                            .and(Codec.intRange(4, 8)
                                    .fieldOf("branches")
                                    .forGetter(tp -> tp.branchCount))
                            .and(Codec.intRange(4, 16)
                                    .fieldOf("branch_length")
                                    .forGetter(tp -> tp.branchLength))
                            .apply(instance, UmbrellaTrunkPlacer::new));

    private final int branchCount;
    private final int branchLength;

    public UmbrellaTrunkPlacer(int baseHeight,
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
        return ModTrunkPlacers.UMBRELLA;
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

        // Dirt
        func_236909_a_(reader, startPos.down());

        //----------------------------------------
        // 2x2 Trunk
        //----------------------------------------

        for (int y = 0; y < treeHeight; y++) {

            placeLog(reader, rand, startPos.add(0, y, 0), logs, box, config);
            placeLog(reader, rand, startPos.add(1, y, 0), logs, box, config);
            placeLog(reader, rand, startPos.add(0, y, 1), logs, box, config);
            placeLog(reader, rand, startPos.add(1, y, 1), logs, box, config);
        }

        //----------------------------------------
        // Branch starting positions
        //----------------------------------------

        BlockPos[] starts = {
                startPos.add(0, treeHeight - 1, 0),
                startPos.add(1, treeHeight - 1, 0),
                startPos.add(0, treeHeight - 1, 1),
                startPos.add(1, treeHeight - 1, 1),

                startPos.add(0, treeHeight - 2, 0),
                startPos.add(1, treeHeight - 2, 0),
                startPos.add(0, treeHeight - 2, 1),
                startPos.add(1, treeHeight - 2, 1),

                startPos.add(0, treeHeight - 3, 0),
                startPos.add(1, treeHeight - 3, 0),
                startPos.add(0, treeHeight - 3, 1),
                startPos.add(1, treeHeight - 3, 1)
        };

        double startAngle = rand.nextDouble() * Math.PI * 2D;

        //----------------------------------------
        // Scaffold branches
        //----------------------------------------

        for (int i = 0; i < branchCount; i++) {

            BlockPos branchStart = starts[i % starts.length];

            double angle =
                    startAngle +
                            (Math.PI * 2D * i) / branchCount;

            // Add a random deviation of ±10°
            angle += (rand.nextDouble() - 0.5D) * Math.toRadians(20.0);

            double x = branchStart.getX() + 0.5;
            double y = branchStart.getY();
            double z = branchStart.getZ() + 0.5;

            double dx = Math.cos(angle);
            double dz = Math.sin(angle);

            BlockPos lastPos = branchStart;

            for (int step = 0; step < branchLength; step++) {

                x += dx;
                z += dz;

                // Nearly horizontal
                if (rand.nextFloat() < 0.12F)
                    y++;

                // Gentle curvature
                angle += (rand.nextFloat() - 0.5F) * 0.08F;

                dx = Math.cos(angle);
                dz = Math.sin(angle);

                lastPos = new BlockPos(
                        MathHelper.floor(x),
                        MathHelper.floor(y),
                        MathHelper.floor(z));

                placeLog(reader, rand, lastPos, logs, box, config);

                // Thick base of the branch
                if (step < 3) {

                    if (Math.abs(dx) > Math.abs(dz)) {
                        placeLog(reader, rand,
                                lastPos.add(0, 0, 1),
                                logs, box, config);
                    } else {
                        placeLog(reader, rand,
                                lastPos.add(1, 0, 0),
                                logs, box, config);
                    }
                }
            }

            foliages.add(new FoliagePlacer.Foliage(lastPos, 0, false));
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