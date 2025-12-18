package com.caiocesarmods.caiocesarbiomes.block.custom.plants;

import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.BushBlock;
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

import static net.minecraft.block.Blocks.CHORUS_PLANT;

public class BaldCypressAerialRoot extends BushBlock {
    public BaldCypressAerialRoot() {
        super(Properties.from(CHORUS_PLANT).hardnessAndResistance(0.2f).tickRandomly().sound(SoundType.WOOD)
                .harvestTool(ToolType.AXE));
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(TreeBlocks.BALD_CYPRESS_AERIAL_ROOT_LARGE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TreeBlocks.BALD_CYPRESS_AERIAL_ROOT_SMALL.get(), RenderType.getCutout());

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
