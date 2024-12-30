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

public class SubtropicalForestPlant extends BushBlock {

    public SubtropicalForestPlant() {
        super(FlowerBlock.Properties.from(Blocks.FERN).tickRandomly().doesNotBlockMovement().notSolid()
                .zeroHardnessAndResistance().sound(SoundType.PLANT).harvestTool(ToolType.HOE));
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(ModBlocks.BUSH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.AGAPANTHUS_PURPLE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.AGAPANTHUS_WHITE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.AZALEA_ORANGE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.AZALEA_RED.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.AZALEA_PURPLE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.AZALEA_PINK.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.AZALEA_MAGENTA.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.AZALEA_GREEN.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.AZALEA_WHITE.get(), RenderType.getCutout());


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
