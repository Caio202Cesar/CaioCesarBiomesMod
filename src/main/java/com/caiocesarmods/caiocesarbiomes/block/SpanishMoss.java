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

public class SpanishMoss extends VineBlock {
    public SpanishMoss() {
        super(AbstractBlock.Properties.from(Blocks.VINE).tickRandomly().doesNotBlockMovement().notSolid()
                .zeroHardnessAndResistance().sound(SoundType.VINE).harvestTool(ToolType.HOE));
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(ModBlocks.SPANISH_MOSS.get(), RenderType.getCutout());
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
