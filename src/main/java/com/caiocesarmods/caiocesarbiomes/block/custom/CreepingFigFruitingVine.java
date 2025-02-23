package com.caiocesarmods.caiocesarbiomes.block.custom;

import com.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.VineBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.IForgeShearable;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class CreepingFigFruitingVine extends VineBlock implements IForgeShearable {
    public CreepingFigFruitingVine() {
        super(Properties.from(Blocks.VINE).tickRandomly().doesNotBlockMovement().notSolid()
                .zeroHardnessAndResistance().sound(SoundType.VINE).harvestTool(ToolType.HOE));
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


