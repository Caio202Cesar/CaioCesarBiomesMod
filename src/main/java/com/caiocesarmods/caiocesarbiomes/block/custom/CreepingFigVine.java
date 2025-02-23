package com.caiocesarmods.caiocesarbiomes.block.custom;

import com.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.IForgeShearable;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class CreepingFigVine extends VineBlock implements IForgeShearable {
    public CreepingFigVine() {
        super(AbstractBlock.Properties.from(Blocks.VINE).tickRandomly().doesNotBlockMovement().notSolid()
                .zeroHardnessAndResistance().sound(SoundType.VINE).harvestTool(ToolType.HOE));
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

        double chance = 0.007;

        if (random.nextDouble() < chance) {

            BlockState currentState = state;
            BlockState newState = ModBlocks.CREEPING_FIG_FRUITING_VINE.get().getDefaultState();

            worldIn.setBlockState(pos, ModBlocks.CREEPING_FIG_FRUITING_VINE.get().getDefaultState());

            newState = newState.with(VineBlock.NORTH, currentState.get(VineBlock.NORTH)).with(VineBlock.EAST, currentState.get(VineBlock.EAST))
                    .with(VineBlock.SOUTH, currentState.get(VineBlock.SOUTH)).with(VineBlock.WEST, currentState.get(VineBlock.WEST));

            worldIn.setBlockState(pos, newState, 3);
        }
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(ModBlocks.CREEPING_FIG_VINE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.CREEPING_FIG_FRUITING_VINE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.CREEPING_FIG_RIPE_FRUITING_VINE.get(), RenderType.getCutout());
    }

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 55;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 85;
    }

    public PlantType getPlantType(IBlockReader world, BlockPos pos) {
        return PlantType.PLAINS;
    }
}


