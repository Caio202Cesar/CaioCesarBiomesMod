package com.caiocesarmods.caiocesarbiomes.block.custom.Vines;

import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import net.minecraft.block.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Random;

public class PohutukawaBeardBlock extends Block implements IGrowable {
    public PohutukawaBeardBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextFloat() < 0.78f) {
            BlockPos belowPos = pos.down();
            BlockState belowState = world.getBlockState(belowPos);

            // Check if the space below is air
            if (belowState.isAir()) {
                world.setBlockState(belowPos, TreeBlocks.POHUTUKAWA_BEARD.get().getDefaultState(), 2);
            }
        }
    }

    @Override
    public BlockState updatePostPlacement(BlockState state,
                                          Direction facing,
                                          BlockState facingState,
                                          IWorld world,
                                          BlockPos currentPos,
                                          BlockPos facingPos) {

        // Only care when the block above changes
        if (facing == Direction.UP && !isValidPosition(state, world, currentPos)) {
            return Blocks.AIR.getDefaultState();
        }

        return super.updatePostPlacement(state, facing, facingState, world, currentPos, facingPos);
    }

    @Override
    public boolean isValidPosition(BlockState state, IWorldReader world, BlockPos pos) {
        BlockState above = world.getBlockState(pos.up());

        return above.getBlock() == TreeBlocks.POHUTUKAWA_LEAVES.get()
                || above.getBlock() == TreeBlocks.POHUTUKAWA_FLOWERING_LEAVES.get()
                || above.getBlock() == TreeBlocks.POHUTUKAWA_SPARSE_FLOWERING_LEAVES.get()
                || above.getBlock() == TreeBlocks.POHUTUKAWA_BEARD.get();
    }

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
            worldIn.setBlockState(down, TreeBlocks.POHUTUKAWA_BEARD.get().getDefaultState(), 2);
        }
    }

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 10;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 20;
    }
}
