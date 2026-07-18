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
        List<BlockPos> trunkPositions = new ArrayList<>();

        BlockPos.Mutable trunk = startPos.toMutable();

        int leanX = 0;
        int leanZ = 0;

        for(int y = 0; y < treeHeight; y++) {

            BlockPos trunkPos = trunk.toImmutable();
            trunkPositions.add(trunkPos);

            // place trunk block
            func_236909_a_(reader, trunk);

            if(y < 3){

                for(Direction side : Direction.Plane.HORIZONTAL){

                    BlockPos thick = trunkPos.offset(side);

                    func_236909_a_(
                            reader, thick);

                }
            }

            /*
             * Gradual upper trunk movement
             */
            if(y > treeHeight * 0.35F){

                if(rand.nextFloat() < 0.20F){

                    leanX = Math.max(-1, Math.min(1, leanX + rand.nextInt(3)-1));

                }


                if(rand.nextFloat() < 0.20F){

                    leanZ = Math.max(-1, Math.min(1, leanZ + rand.nextInt(3)-1));

                }

            }

            if(y < treeHeight - 1){

                trunk.move(
                        leanX,
                        1,
                        leanZ
                );

            }

            if(y < treeHeight * 0.25F && rand.nextFloat() < 0.5F){

                BlockPos extra = trunk.toImmutable()
                        .offset(Direction.Plane.HORIZONTAL.random(rand));

                func_236909_a_(reader, extra);

            }

            // Apply the lean every few blocks
            if(y % 2 == 0){

                trunk.move(
                        leanX,
                        1,
                        leanZ
                );

            }
            else{

                trunk.move(Direction.UP);

            }

        }

        //Branches

        int branchCount = 3 + rand.nextInt(3);

        List<Integer> branchLevels = new ArrayList<>();

        int current = (int)(treeHeight * 0.50F);

        while(branchLevels.size() < branchCount && current < treeHeight - 2){

            branchLevels.add(current);

            current += 2 + rand.nextInt(2);

        }

        Direction[] dirs = {
                Direction.NORTH,
                Direction.EAST,
                Direction.SOUTH,
                Direction.WEST
        };

        int rotation = rand.nextInt(4);

        for(int level : branchLevels){

            if(level >= trunkPositions.size())
                continue;

            BlockPos origin = trunkPositions.get(level);

            int branches = 2 + rand.nextInt(2); // 2 or 3

            for(int b = 0; b < branches; b++){

                Direction dir = dirs[(rotation + b * 2) % 4];

                makeBranch(
                        reader,
                        rand,
                        origin,
                        dir,
                        changedBlocks,
                        box,
                        config,
                        foliage
                );

            }

            rotation++;
        }

        BlockPos top = startPos.up(treeHeight);

        foliage.add(
                new FoliagePlacer.Foliage(
                        top,
                        1,
                        false
                )
        );


        for(Direction d : Direction.Plane.HORIZONTAL){

            foliage.add(
                    new FoliagePlacer.Foliage(
                            top.offset(d, 2),
                            1,
                            false
                    )
            );

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
            List<FoliagePlacer.Foliage> foliage
    ){

        int length = 6 + rand.nextInt(3);

        BlockPos.Mutable branch = origin.toMutable();


        for(int step = 0; step < length; step++){

            branch.move(dir);


            // scaffold section
            if(step < length - 2){

                // occasional downward sag
                if(step > 1 && rand.nextFloat() < 0.25F){
                    branch.move(Direction.DOWN);
                }

                if(step < 2){

                    for(Direction side : Direction.Plane.HORIZONTAL){

                        BlockPos thick =
                                branch.toImmutable()
                                        .offset(side);

                        func_236909_a_(reader, thick);

                    }

                }

            }


            // terminal upward growth
            else{

                branch.move(Direction.UP);

            }


            func_236909_a_(reader, branch
            );

        }

        foliage.add(
                new FoliagePlacer.Foliage(
                        branch.toImmutable(),
                        1,
                        false
                )
        );
    }
}
