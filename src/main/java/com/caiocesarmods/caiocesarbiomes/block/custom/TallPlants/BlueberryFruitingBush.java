package com.caiocesarmods.caiocesarbiomes.block.custom.TallPlants;

import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoublePlantBlock;
import net.minecraft.block.SoundType;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.ToolType;

public class BlueberryFruitingBush extends DoublePlantBlock {
    public BlueberryFruitingBush() {
        super(Properties.from(Blocks.ROSE_BUSH).hardnessAndResistance(0.2f).tickRandomly()
                .sound(SoundType.PLANT).harvestTool(ToolType.HOE).notSolid());
    }

    public boolean ticksRandomly(BlockState state) {
        return true;
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit) {
        if (!world.isRemote()) {
            // Determine which half is clicked
            boolean isUpper = state.get(HALF) == DoubleBlockHalf.UPPER;
            BlockPos lowerPos = isUpper ? pos.down() : pos;
            BlockPos upperPos = isUpper ? pos : pos.up();

            // Drop the fruit
            ItemStack fruit = new ItemStack(ModItems.BLUEBERRIES.get());
            InventoryHelper.spawnItemStack(world, pos.getX(), pos.getY(), pos.getZ(), fruit);

            // Replace both parts with the non-fruiting variant (normal bush)
            BlockState normalLower = ModPlants.BLUEBERRY_BUSH.get().getDefaultState().with(HALF, DoubleBlockHalf.LOWER);
            BlockState normalUpper = ModPlants.BLUEBERRY_BUSH.get().getDefaultState().with(HALF, DoubleBlockHalf.UPPER);

            world.setBlockState(lowerPos, normalLower, 18);
            world.setBlockState(upperPos, normalUpper, 18);

            return ActionResultType.SUCCESS;
        }

        return ActionResultType.CONSUME;
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
        RenderTypeLookup.setRenderLayer(ModPlants.BLUEBERRY_FRUITING_BUSH.get(), RenderType.getCutout());

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

