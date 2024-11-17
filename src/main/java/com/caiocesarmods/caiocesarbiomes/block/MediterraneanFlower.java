package com.caiocesarmods.caiocesarbiomes.block;

import net.minecraft.block.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.ToolType;

public class MediterraneanFlower extends BushBlock {

    public MediterraneanFlower() {
        super(FlowerBlock.Properties.from(Blocks.DANDELION).tickRandomly().doesNotBlockMovement().notSolid()
                .zeroHardnessAndResistance().sound(SoundType.PLANT).harvestTool(ToolType.HOE));
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(ModBlocks.ANIS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.BASIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_BASIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.CINERARIA.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.FENNEL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.LAVENDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.MARJORAN.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.OREGANO.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.ROSEMARY.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.SAGE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.SANTOLINA.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.THYME.get(), RenderType.getCutout());
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
