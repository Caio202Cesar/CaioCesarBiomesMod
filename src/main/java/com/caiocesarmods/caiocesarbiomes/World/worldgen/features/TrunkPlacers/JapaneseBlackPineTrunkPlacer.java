package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.TrunkPlacers;

import com.google.common.collect.Lists;
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

import java.util.*;

public class JapaneseBlackPineTrunkPlacer extends AbstractTrunkPlacer {
    public static final Codec<JapaneseBlackPineTrunkPlacer> CODEC =
            RecordCodecBuilder.create(instance ->
                    getAbstractTrunkCodec(instance)
                            .apply(instance, JapaneseBlackPineTrunkPlacer::new));

    public JapaneseBlackPineTrunkPlacer(int p_i232060_1_, int p_i232060_2_, int p_i232060_3_) {
        super(p_i232060_1_, p_i232060_2_, p_i232060_3_);
    }

    @Override
    protected TrunkPlacerType<?> getPlacerType() {
        return ModTrunkPlacers.JAPANESE_BLACK_PINE;
    }

    @Override
    public List<FoliagePlacer.Foliage> getFoliages(
            IWorldGenerationReader reader,
            Random rand,
            int treeHeight,
            BlockPos startPos,
            Set<BlockPos> changedBlocks,
            MutableBoundingBox box,
            BaseTreeFeatureConfig config) {

        List<FoliagePlacer.Foliage> foliage = Lists.newArrayList();
        List<BlockPos> branchTips = new ArrayList<>();

        List<BlockPos> mainLeader = new ArrayList<>();
        List<BlockPos> secondaryLeader = new ArrayList<>();

        //------------------------------------------------------------
        // Build the main trunk
        //------------------------------------------------------------

        BlockPos.Mutable trunk = startPos.toMutable();

        int leanX = 0;
        int leanZ = 0;

        int forkHeight = 2 + rand.nextInt(3);

        BlockPos forkOrigin = null;

        for (int y = 0; y < treeHeight; y++) {

            BlockPos current = trunk.toImmutable();

            placeLog(
                    reader,
                    rand,
                    current,
                    changedBlocks,
                    box,
                    config);

            mainLeader.add(current);

            if (y == forkHeight)
                forkOrigin = current;

            if (y > treeHeight * 0.40F) {

                if (rand.nextFloat() < 0.12F)
                    leanX = rand.nextInt(3) - 1;

                if (rand.nextFloat() < 0.12F)
                    leanZ = rand.nextInt(3) - 1;
            }

            if (y < treeHeight - 1)
                trunk.move(leanX, 1, leanZ);
        }

        //------------------------------------------------------------
        // Secondary leader
        //------------------------------------------------------------

        if (forkOrigin != null) {

            Direction forkDir = Direction.Plane.HORIZONTAL.random(rand);

            BlockPos.Mutable leader = forkOrigin.toMutable();

            int sideLeanX = forkDir.getXOffset();
            int sideLeanZ = forkDir.getZOffset();

            int secondaryHeight = treeHeight - forkHeight - 2;

            for (int i = 0; i < secondaryHeight; i++) {

                if (rand.nextFloat() < 0.30F)
                    leader.move(forkDir);

                leader.move(Direction.UP);

                BlockPos pos = leader.toImmutable();

                placeLog(
                        reader,
                        rand,
                        pos,
                        changedBlocks,
                        box,
                        config);

                secondaryLeader.add(pos);

                if (i > secondaryHeight * 0.55F) {

                    if (rand.nextFloat() < 0.18F)
                        leader.move(sideLeanX, 0, sideLeanZ);
                }
            }
        }

        //------------------------------------------------------------
        // Branch generation
        //------------------------------------------------------------

        List<BlockPos> origins = new ArrayList<>();

        for (int i = (int)(mainLeader.size() * 0.55F);
             i < mainLeader.size() - 2;
             i += 3 + rand.nextInt(2)) {

            origins.add(mainLeader.get(i));
        }

        for (int i = secondaryLeader.size() / 3;
             i < secondaryLeader.size() - 1;
             i += 3 + rand.nextInt(2)) {

            origins.add(secondaryLeader.get(i));
        }

        Collections.shuffle(origins, rand);

        for (BlockPos origin : origins) {

            List<Direction> directions = new ArrayList<>(
                    Arrays.asList(
                            Direction.NORTH,
                            Direction.SOUTH,
                            Direction.EAST,
                            Direction.WEST));

            Collections.shuffle(directions, rand);

            int branchCount = 1 + rand.nextInt(2);

            for (int i = 0; i < branchCount; i++) {

                makeBranch(
                        reader,
                        rand,
                        origin,
                        directions.get(i),
                        changedBlocks,
                        box,
                        config,
                        branchTips);
            }
        }

        //------------------------------------------------------------
        // Trunk foliage
        //------------------------------------------------------------

        foliage.add(
                new FoliagePlacer.Foliage(
                        mainLeader.get(mainLeader.size() - 1),
                        0,
                        false));

        if (!secondaryLeader.isEmpty()) {

            foliage.add(
                    new FoliagePlacer.Foliage(
                            secondaryLeader.get(secondaryLeader.size() - 1),
                            0,
                            false));
        }

        //------------------------------------------------------------
        // Branch foliage
        //------------------------------------------------------------

        for (BlockPos tip : branchTips) {

            foliage.add(
                    new FoliagePlacer.Foliage(
                            tip,
                            0,
                            false));

            foliage.add(
                    new FoliagePlacer.Foliage(
                            tip.up(),
                            0,
                            false));

            if (rand.nextFloat() < 0.45F) {

                foliage.add(
                        new FoliagePlacer.Foliage(
                                tip.offset(Direction.Plane.HORIZONTAL.random(rand)),
                                0,
                                false));
            }
        }

        return foliage;
    }

    private void makeBranch(
            IWorldGenerationReader reader,
            Random rand,
            BlockPos origin,
            Direction dir,
            Set<BlockPos> changedBlocks,
            MutableBoundingBox box,
            BaseTreeFeatureConfig config,
            List<BlockPos> branchTips) {

        int length = 5 + rand.nextInt(4); // 5–8 blocks

        BlockPos.Mutable branch = origin.toMutable();

        int horizontalX = dir.getXOffset();
        int horizontalZ = dir.getZOffset();

        int sagStart = length / 3;
        int riseStart = (length * 2) / 3;

        for (int step = 0; step < length; step++) {

            //----------------------------------------------------
            // Horizontal advance
            //----------------------------------------------------

            branch.move(horizontalX, 0, horizontalZ);

            //----------------------------------------------------
            // Thick branch base
            //----------------------------------------------------

            if (step < 2) {

                for (Direction side : Direction.Plane.HORIZONTAL) {

                    if (side != dir && side != dir.getOpposite()) {

                        placeLog(
                                reader,
                                rand,
                                branch.toImmutable().offset(side),
                                changedBlocks,
                                box,
                                config);
                    }
                }
            }

            //----------------------------------------------------
            // Slight downward sag
            //----------------------------------------------------

            if (step >= sagStart && step < riseStart) {

                if (rand.nextFloat() < 0.35F) {

                    branch.move(Direction.DOWN);

                }

            }

            //----------------------------------------------------
            // Upward recovery near the tip
            //----------------------------------------------------

            if (step >= riseStart) {

                branch.move(Direction.UP);

                if (rand.nextFloat() < 0.25F) {

                    branch.move(horizontalX, 0, horizontalZ);

                }
            }

            //----------------------------------------------------
            // Small natural waviness
            //----------------------------------------------------

            if (step > 1 && step < riseStart && rand.nextFloat() < 0.15F) {

                Direction side =
                        rand.nextBoolean()
                                ? dir.rotateY()
                                : dir.rotateYCCW();

                branch.move(side);

            }

            //----------------------------------------------------
            // Place branch log
            //----------------------------------------------------

            placeLog(
                    reader,
                    rand,
                    branch.toImmutable(),
                    changedBlocks,
                    box,
                    config);
        }

        //--------------------------------------------------------
        // Upturned terminal shoot
        //--------------------------------------------------------

        int shoot = 1 + rand.nextInt(2);

        for (int i = 0; i < shoot; i++) {

            branch.move(Direction.UP);

            placeLog(
                    reader,
                    rand,
                    branch.toImmutable(),
                    changedBlocks,
                    box,
                    config);
        }

        //--------------------------------------------------------
        // Foliage attachment
        //--------------------------------------------------------

        branchTips.add(branch.toImmutable());
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
