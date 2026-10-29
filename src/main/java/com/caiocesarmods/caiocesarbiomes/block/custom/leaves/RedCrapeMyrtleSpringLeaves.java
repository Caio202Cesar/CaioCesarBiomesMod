package com.caiocesarmods.caiocesarbiomes.block.custom.leaves;

import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import com.caiocesarmods.caioclimates.Seasons.Season;
import com.caiocesarmods.caioclimates.Seasons.SeasonalPhase;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IForgeShearable;

import java.util.Random;

public class RedCrapeMyrtleSpringLeaves extends LeavesBlock implements IForgeShearable {
    public RedCrapeMyrtleSpringLeaves(Properties properties) {
        super(properties);
    }


    public boolean ticksRandomly(BlockState state) {
        return true;
    }

    /**
     * Performs a random tick on a block.
     *
     * @param state
     * @param worldIn
     * @param pos
     * @param random
     */

    @Override
    public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
        String currentSeason = Season.getSeason(worldIn.getDayTime());
        String currentPhase = SeasonalPhase.getPhase(worldIn.getDayTime());

        Biome biome = worldIn.getBiome(pos);
        float temp = biome.getTemperature(pos);

        //Pattern for tropical biomes' flowering
        if (temp >= 0.9F) {
            if ("SUMMER".equals(currentSeason) && random.nextInt(15) == 0) {

                int distance = state.get(LeavesBlock.DISTANCE);
                boolean persistent = state.get(LeavesBlock.PERSISTENT);

                worldIn.setBlockState(pos, TreeBlocks.RED_CRAPE_MYRTLE_LEAVES.get()
                        .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
                return;

            }

            if ("SPRING".equals(currentSeason) && random.nextInt(45) == 0) {

                int distance = state.get(LeavesBlock.DISTANCE);
                boolean persistent = state.get(LeavesBlock.PERSISTENT);

                worldIn.setBlockState(pos, TreeBlocks.RED_CRAPE_MYRTLE_LEAVES.get()
                        .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
                return;

            }

            if ("FALL".equals(currentSeason) && random.nextInt(45) == 0) {

                int distance = state.get(LeavesBlock.DISTANCE);
                boolean persistent = state.get(LeavesBlock.PERSISTENT);

                worldIn.setBlockState(pos, TreeBlocks.RED_CRAPE_MYRTLE_LEAVES.get()
                        .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
                return;

            }
        }

        //Pattern for tropical deciduous behavior
        if (temp > 0.95F) {
            if ("WINTER".equals(currentSeason) && random.nextInt(45) == 0) {
                int distance = state.get(LeavesBlock.DISTANCE);
                boolean persistent = state.get(LeavesBlock.PERSISTENT);

                worldIn.setBlockState(pos, TreeBlocks.RED_CRAPE_MYRTLE_WINTER_BRANCHES.get()
                        .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
                return;
            }
        }

        //Pattern for zone 11 biomes
        if (temp > 0.89F && temp < 0.95) {
            if ("WINTER".equals(currentSeason) && random.nextInt(25) == 0) {
                int distance = state.get(LeavesBlock.DISTANCE);
                boolean persistent = state.get(LeavesBlock.PERSISTENT);

                worldIn.setBlockState(pos, TreeBlocks.RED_CRAPE_MYRTLE_FALL_LEAVES.get()
                        .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
                return;
            }
        }

        // Pattern for subtropical biomes
        if (temp < 0.9F && temp > 0.79F) {
            if ("MID_FALL".equals(currentPhase) && random.nextInt(75) == 0) {
                int distance = state.get(LeavesBlock.DISTANCE);
                boolean persistent = state.get(LeavesBlock.PERSISTENT);

                worldIn.setBlockState(pos, TreeBlocks.RED_CRAPE_MYRTLE_FALL_LEAVES.get()
                        .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
            }

            if ("LATE_FALL".equals(currentPhase) && random.nextInt(35) == 0) {
                int distance = state.get(LeavesBlock.DISTANCE);
                boolean persistent = state.get(LeavesBlock.PERSISTENT);

                worldIn.setBlockState(pos, TreeBlocks.RED_CRAPE_MYRTLE_FALL_LEAVES.get()
                        .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
            }

            if ("WINTER".equals(currentSeason) && random.nextInt(5) == 0) {
                int distance = state.get(LeavesBlock.DISTANCE);
                boolean persistent = state.get(LeavesBlock.PERSISTENT);

                worldIn.setBlockState(pos, TreeBlocks.RED_CRAPE_MYRTLE_FALL_LEAVES.get()
                        .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
            }

            if ("SUMMER".equals(currentPhase) && random.nextInt(25) == 0) {
                int distance = state.get(LeavesBlock.DISTANCE);
                boolean persistent = state.get(LeavesBlock.PERSISTENT);

                worldIn.setBlockState(pos, TreeBlocks.RED_CRAPE_MYRTLE_LEAVES.get()
                        .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
            }
        }

        // Pattern for temperate biomes
        if (temp < 0.79F) {
            if ("FALL".equals(currentSeason) && random.nextInt(25) == 0) {
                int distance = state.get(LeavesBlock.DISTANCE);
                boolean persistent = state.get(LeavesBlock.PERSISTENT);

                worldIn.setBlockState(pos, TreeBlocks.RED_CRAPE_MYRTLE_FALL_LEAVES.get()
                        .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
                return;
            }

            if ("WINTER".equals(currentSeason) && random.nextInt(2) == 0) {
                int distance = state.get(LeavesBlock.DISTANCE);
                boolean persistent = state.get(LeavesBlock.PERSISTENT);

                worldIn.setBlockState(pos, TreeBlocks.RED_CRAPE_MYRTLE_FALL_LEAVES.get()
                        .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
                return;
            }

            if ("SUMMER".equals(currentSeason) && random.nextInt(25) == 0) {
                int distance = state.get(LeavesBlock.DISTANCE);
                boolean persistent = state.get(LeavesBlock.PERSISTENT);

                worldIn.setBlockState(pos, TreeBlocks.RED_CRAPE_MYRTLE_LEAVES.get()
                        .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
                return;
            }
        }
    }


    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 90;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 100;
    }
}
