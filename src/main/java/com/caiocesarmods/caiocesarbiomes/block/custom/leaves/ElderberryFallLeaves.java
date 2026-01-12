package com.caiocesarmods.caiocesarbiomes.block.custom.leaves;

import com.caiocesarmods.caiocesarbiomes.Seasons.Season;
import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IForgeShearable;

import java.util.Random;
import java.util.function.Supplier;

public class ElderberryFallLeaves extends LeavesBlock implements IForgeShearable {
    public ElderberryFallLeaves(Properties properties) {
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

        Biome biome = worldIn.getBiome(pos);
        float temp = biome.getTemperature(pos);

        //Pattern for tropical climates
        if (temp < 0.94F && "WINTER".equals(currentSeason) && random.nextInt(15) == 0) {

            int distance = state.get(LeavesBlock.DISTANCE);
            boolean persistent = state.get(LeavesBlock.PERSISTENT);

            worldIn.setBlockState(pos, TreeBlocks.ELDERBERRY_LEAVES.get()
                    .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
            return;

        }

        if (temp < 0.94F && "SPRING".equals(currentSeason) && random.nextInt(5) == 0) {

            int distance = state.get(LeavesBlock.DISTANCE);
            boolean persistent = state.get(LeavesBlock.PERSISTENT);

            worldIn.setBlockState(pos, TreeBlocks.ELDERBERRY_LEAVES.get()
                    .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
            return;

        }

        //Pattern for temperate climates
        if (temp < 0.79F && "WINTER".equals(currentSeason) && random.nextInt(15) == 0) {

            int distance = state.get(LeavesBlock.DISTANCE);
            boolean persistent = state.get(LeavesBlock.PERSISTENT);

            worldIn.setBlockState(pos, TreeBlocks.ELDERBERRY_WINTER_BRANCHES.get()
                    .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
            return;

        }

        if (temp < 0.79F && "SPRING".equals(currentSeason) && random.nextInt(5) == 0) {

            int distance = state.get(LeavesBlock.DISTANCE);
            boolean persistent = state.get(LeavesBlock.PERSISTENT);

            worldIn.setBlockState(pos, TreeBlocks.ELDERBERRY_WINTER_BRANCHES.get()
                    .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
            return;

        }

        if (temp < 0.79F && "SUMMER".equals(currentSeason) && random.nextInt(2) == 0) {

            int distance = state.get(LeavesBlock.DISTANCE);
            boolean persistent = state.get(LeavesBlock.PERSISTENT);

            worldIn.setBlockState(pos, TreeBlocks.ELDERBERRY_WINTER_BRANCHES.get()
                    .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);

        }
    }


    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 90;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 100;
    }
}
