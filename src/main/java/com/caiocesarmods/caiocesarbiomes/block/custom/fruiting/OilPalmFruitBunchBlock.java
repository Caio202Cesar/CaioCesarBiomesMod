package com.caiocesarmods.caiocesarbiomes.block.custom.fruiting;


import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
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
import net.minecraftforge.common.IForgeShearable;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class OilPalmFruitBunchBlock extends Block implements IForgeShearable {
    public OilPalmFruitBunchBlock() {
        super(Properties.from(Blocks.BEEHIVE).hardnessAndResistance(0.2F).tickRandomly()
                .sound(SoundType.WET_GRASS).notSolid().harvestTool(ToolType.AXE).setRequiresTool());
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
        if (random.nextFloat() < 0.0025F) {

            worldIn.destroyBlock(pos, true);

        }
    }

    @Override
    public boolean isValidPosition(BlockState state, IWorldReader world, BlockPos pos) {
        BlockState above = world.getBlockState(pos.up());

        return above.getBlock() == TreeBlocks.OIL_PALM_LEAVES.get();
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(TreeBlocks.OIL_PALM_FRUIT_BUNCH.get(), RenderType.getCutout());

    }

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 1;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 1;
    }

    public PushReaction getPushReaction(BlockState state) {
        return PushReaction.DESTROY;
    }
}
