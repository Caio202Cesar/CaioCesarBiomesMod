package com.caiocesarmods.caiocesarbiomes.block;

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
        RenderTypeLookup.setRenderLayer(ModBlocks.GARDENIA_BUSH.get(), RenderType.getCutout());

    }

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 80;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 60;
    }

    public PlantType getPlantType(IBlockReader world, BlockPos pos) {
        return PlantType.DESERT;
    }
}

