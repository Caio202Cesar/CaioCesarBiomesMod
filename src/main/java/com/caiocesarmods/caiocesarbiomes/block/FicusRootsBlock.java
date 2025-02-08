package com.caiocesarmods.caiocesarbiomes.block;

import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class FicusRootsBlock extends Block implements IGrowable {
    public FicusRootsBlock(Properties properties) {
        super(properties);
    }
    /**
     * Whether this IGrowable can grow
     *
     * @param worldIn
     * @param pos
     * @param state
     * @param isClient
     */
    @Override
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld worldIn, Random rand, BlockPos pos, BlockState state) {
        BlockPos down = pos.down();
        if (worldIn.isAirBlock(down)) {
            worldIn.setBlockState(down, ModBlocks.FICUS_ROOTS_PLANT.get().getDefaultState(), 2);
        }
    }
}
