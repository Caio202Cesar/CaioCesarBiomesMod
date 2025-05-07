package com.caiocesarmods.caiocesarbiomes.block.custom.leaves;

import com.caiocesarmods.caiocesarbiomes.Seasons.Season;
import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class DateLeaves extends LeavesBlock {
    public DateLeaves(Properties properties) {
        super(properties);
    }

    public boolean ticksRandomly(BlockState state) {
        return true;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
        super.randomTick(state, worldIn, pos, random);
        String currentSeason = Season.getSeason(worldIn.getDayTime());

        if ("SUMMER".equals(currentSeason) && random.nextFloat() < 0.00225f) {
            BlockPos belowPos = pos.down();
            BlockState belowState = worldIn.getBlockState(belowPos);

            // Check if the space below is air
            if (belowState.isAir()) {
                worldIn.setBlockState(belowPos, ModPlants.DATE_BUNCH.get().getDefaultState(), 2);
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

