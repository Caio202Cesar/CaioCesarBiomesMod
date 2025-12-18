package com.caiocesarmods.caiocesarbiomes.block.custom.plants;

import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
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
        RenderTypeLookup.setRenderLayer(ModPlants.ANIS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.BASIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.PURPLE_BASIL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.CINERARIA.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.FENNEL.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.LAVENDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.MARJORAN.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.OREGANO.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.ROSEMARY.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.SAGE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.SANTOLINA.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.THYME.get(), RenderType.getCutout());
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
