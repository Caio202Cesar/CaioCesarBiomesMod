package com.caiocesarmods.caiocesarbiomes.block.custom.TallPlants;

import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
import net.minecraft.block.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.ToolType;

public class DesertRosePlant extends DoublePlantBlock {
    public DesertRosePlant() {
        super(AbstractBlock.Properties.from(Blocks.CHORUS_PLANT).hardnessAndResistance(0.2f).tickRandomly()
                .sound(SoundType.PLANT).harvestTool(ToolType.HOE));
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(ModPlants.DESERT_ROSE_PLANT.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.PENCIL_TREE.get(), RenderType.getCutout());

    }

    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return  state.matchesBlock(Blocks.COARSE_DIRT) || state.matchesBlock(Blocks.SAND)
                || state.matchesBlock(Blocks.RED_SAND) || state.matchesBlock(Blocks.DIRT)
                || state.matchesBlock(Blocks.GRASS_BLOCK);
    }

    public PlantType getPlantType(IBlockReader world, BlockPos pos) {
        return PlantType.DESERT;
    }
}

