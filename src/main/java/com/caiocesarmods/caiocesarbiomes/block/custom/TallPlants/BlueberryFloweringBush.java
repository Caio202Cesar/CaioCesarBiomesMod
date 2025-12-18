package com.caiocesarmods.caiocesarbiomes.block.custom.TallPlants;

import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoublePlantBlock;
import net.minecraft.block.SoundType;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class BlueberryFloweringBush extends DoublePlantBlock {
    public BlueberryFloweringBush() {
        super(Properties.from(Blocks.ROSE_BUSH).hardnessAndResistance(0.2f).tickRandomly()
                .sound(SoundType.PLANT).harvestTool(ToolType.HOE).notSolid());
    }

    public boolean ticksRandomly(BlockState state) {
        return true;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(50) != 0) return; // 20% chance

        DoubleBlockHalf half = state.get(HALF);
        BlockPos lowerPos = (half == DoubleBlockHalf.LOWER) ? pos : pos.down();
        BlockPos upperPos = lowerPos.up();

        BlockState lowerState = world.getBlockState(lowerPos);
        BlockState upperState = world.getBlockState(upperPos);

        // Make sure it's the correct bush before replacing
        if (lowerState.getBlock() == this && upperState.getBlock() == this &&
                lowerState.get(HALF) == DoubleBlockHalf.LOWER && upperState.get(HALF) == DoubleBlockHalf.UPPER) {

            // Set both flowering states together, avoiding neighbor updates
            world.setBlockState(lowerPos, ModPlants.BLUEBERRY_FRUITING_BUSH.get().getDefaultState().with(HALF, DoubleBlockHalf.LOWER), 18);
            world.setBlockState(upperPos, ModPlants.BLUEBERRY_FRUITING_BUSH.get().getDefaultState().with(HALF, DoubleBlockHalf.UPPER), 18);
        }
    }

    @Override
    public boolean isValidPosition(BlockState state, IWorldReader world, BlockPos pos) {
        if (state.get(HALF) == DoubleBlockHalf.UPPER) {
            BlockState below = world.getBlockState(pos.down());
            return below.getBlock() == this && below.get(HALF) == DoubleBlockHalf.LOWER;
        } else {
            BlockPos down = pos.down();
            return world.getBlockState(down).isSolidSide(world, down, Direction.UP);
        }
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(ModPlants.BLUEBERRY_FLOWERING_BUSH.get(), RenderType.getCutout());

    }

    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return state.matchesBlock(Blocks.GRASS_BLOCK)
                || state.matchesBlock(Blocks.DIRT) || state.matchesBlock(Blocks.FARMLAND);
    }

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 80;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 60;
    }

    public PlantType getPlantType(IBlockReader world, BlockPos pos) {
        return PlantType.PLAINS;
    }
}

