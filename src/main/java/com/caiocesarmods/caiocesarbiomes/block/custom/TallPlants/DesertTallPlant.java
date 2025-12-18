package com.caiocesarmods.caiocesarbiomes.block.custom.TallPlants;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoublePlantBlock;
import net.minecraft.block.SoundType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.ToolType;

public class DesertTallPlant extends DoublePlantBlock {
    public DesertTallPlant() {
        super(Properties.from(Blocks.ROSE_BUSH).hardnessAndResistance(0.2f).tickRandomly()
                .sound(SoundType.PLANT).harvestTool(ToolType.HOE).notSolid());
    }


    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return  state.matchesBlock(Blocks.COARSE_DIRT) || state.matchesBlock(Blocks.RED_SAND)
                || state.matchesBlock(Blocks.DIRT) || state.matchesBlock(Blocks.SAND) ;
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

