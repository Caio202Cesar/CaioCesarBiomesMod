package com.caiocesarmods.caiocesarbiomes.block.custom.crops;

import net.minecraft.block.*;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class CropLeavesBlock extends LeavesBlock implements IGrowable {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_0_3;

    public CropLeavesBlock(LeavesBlock.Properties builder) {
        super(builder);
        this.setDefaultState(this.getDefaultState().with(AGE, 0));
    }

    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    public int getMaxAge() {
        return 3;
    }

    protected int getAge(BlockState state) {
        return state.get(this.getAgeProperty());
    }

    public BlockState withAge(BlockState state, int age) {
        return state.with(AGE, age);
    }

    public boolean isMaxAge(BlockState state) {
        return state.get(this.getAgeProperty()) >= this.getMaxAge();
    }

    public boolean ticksRandomly(BlockState state) {
        return !this.isMaxAge(state);
    }

    public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
        super.randomTick(state, worldIn, pos, random); // keeps leaf decay working

        if (worldIn.isAreaLoaded(pos, 1)) {
            int age = state.get(AGE);

            if (age < getMaxAge()) {
                if (random.nextInt(20) == 0) {
                    worldIn.setBlockState(pos, withAge(state, age + 1), 2);
                }
            }
        }
    }

    @Override
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return false;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
        return false;
    }

    @Override
    public void grow(ServerWorld worldIn, Random rand, BlockPos pos, BlockState state) {

    }
}
