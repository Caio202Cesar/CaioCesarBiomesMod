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
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class BananaGreenBunchBlock extends Block {
    public BananaGreenBunchBlock() {
        super(Properties.from(Blocks.BEEHIVE).zeroHardnessAndResistance().tickRandomly()
                .sound(SoundType.WET_GRASS).notSolid().doesNotBlockMovement().harvestTool(ToolType.HOE));
    }

    public boolean ticksRandomly(BlockState state) {
        return true;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
        super.randomTick(state, worldIn, pos, random);

        double chance = 0.00255f;

        if (random.nextDouble() < chance) {
            worldIn.setBlockState(pos, TreeBlocks.BANANA_BUNCH.get().getDefaultState());
        }

        if (random.nextFloat() < 0.9f) {
            BlockPos belowPos = pos.down();
            BlockState belowState = worldIn.getBlockState(belowPos);

            // Check if the space below is air
            if (belowState.isAir()) {
                worldIn.setBlockState(belowPos, TreeBlocks.BANANA_FLOWER.get().getDefaultState(), 2);
            }
        }
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(TreeBlocks.BANANA_GREEN_BUNCH.get(), RenderType.getCutout());

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
