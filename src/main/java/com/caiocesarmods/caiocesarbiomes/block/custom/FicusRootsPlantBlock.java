package com.caiocesarmods.caiocesarbiomes.block.custom;

import com.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class FicusRootsPlantBlock extends BushBlock {
    public FicusRootsPlantBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        BlockPos down = pos.down();
        if (world.isAirBlock(down) && random.nextFloat() < 0.25F) { // 25% chance to grow
            world.setBlockState(down, this.getDefaultState(), 2);
        }
    }

    @Override
    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return state.getBlock() == ModBlocks.FICUS_ROOTS.get() || state.getBlock() == this;
    }

}
