package com.caiocesarmods.caiocesarbiomes.block.custom;

import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
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

public class MediterraneanBeachFlower extends BushBlock {

    public MediterraneanBeachFlower() {
        super(Properties.from(Blocks.DANDELION).tickRandomly().doesNotBlockMovement().notSolid()
                .zeroHardnessAndResistance().sound(SoundType.PLANT).harvestTool(ToolType.HOE));
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(ModPlants.PINK_CISTUS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.WHITE_CISTUS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.POTTED_PINK_CISTUS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.POTTED_WHITE_CISTUS.get(), RenderType.getCutout());
    }

    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return state.matchesBlock(Blocks.GRASS_BLOCK) || state.matchesBlock(Blocks.DIRT)
                || state.matchesBlock(Blocks.COARSE_DIRT) || state.matchesBlock(Blocks.SAND)
                || state.matchesBlock(Blocks.GRAVEL) || state.matchesBlock(Blocks.SAND);
    }

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 80;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 60;
    }

    public PlantType getPlantType(IBlockReader world, BlockPos pos) {
        return PlantType.BEACH;
    }
}
