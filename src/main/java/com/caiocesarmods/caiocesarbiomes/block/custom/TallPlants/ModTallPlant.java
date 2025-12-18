package com.caiocesarmods.caiocesarbiomes.block.custom.TallPlants;

import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoublePlantBlock;
import net.minecraft.block.SoundType;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.ToolType;

public class ModTallPlant extends DoublePlantBlock {
    public ModTallPlant() {
        super(Properties.from(Blocks.ROSE_BUSH).hardnessAndResistance(0.2f).tickRandomly()
                .sound(SoundType.PLANT).harvestTool(ToolType.HOE).notSolid());
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(ModPlants.GARDENIA_BUSH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.CHINESE_HIBISCUS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.BAY_LAUREL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.BAY_LAUREL_FLOWERING.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.SPIDER_LILY.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.MANZANITA_BUSH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.ALOE_VERA.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.CREOSOTE_BUSH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.CREOSOTE_FLOWERING_BUSH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.CANNA_LILY_PURPLE_RED.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.CANNA_LILY_RED.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.CANNA_LILY_YELLOW.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.PALM_LILY.get(), RenderType.getCutout());

    }

    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return  state.matchesBlock(Blocks.COARSE_DIRT) || state.matchesBlock(Blocks.GRASS_BLOCK)
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

