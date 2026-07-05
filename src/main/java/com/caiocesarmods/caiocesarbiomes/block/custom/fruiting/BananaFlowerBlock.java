package com.caiocesarmods.caiocesarbiomes.block.custom.fruiting;


import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import net.minecraft.block.*;
import net.minecraft.block.material.PushReaction;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class BananaFlowerBlock extends Block {
    public BananaFlowerBlock() {
        super(Properties.from(Blocks.BEEHIVE).zeroHardnessAndResistance().tickRandomly()
                .sound(SoundType.WET_GRASS).notSolid().harvestTool(ToolType.HOE).setRequiresTool());
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
        super.randomTick(state, worldIn, pos, random);

        double chance = 0.025f;

        if (random.nextDouble() < chance) {
            worldIn.setBlockState(pos, TreeBlocks.BANANA_GREEN_BUNCH.get().getDefaultState());

        }
    }

    @Override
    public boolean isValidPosition(BlockState state, IWorldReader world, BlockPos pos) {
        BlockState above = world.getBlockState(pos.up());

        return above.getBlock() == TreeBlocks.BANANA_STALK.get()
                || above.getBlock() == TreeBlocks.BANANA_GREEN_BUNCH.get()
                || above.getBlock() == TreeBlocks.BANANA_BUNCH.get();
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(TreeBlocks.BANANA_FLOWER.get(), RenderType.getCutout());

    }

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 50;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 10;
    }

    public PushReaction getPushReaction(BlockState state) {
        return PushReaction.DESTROY;
    }
}
