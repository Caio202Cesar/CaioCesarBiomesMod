package com.caiocesarmods.caiocesarbiomes.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class DateBunchBlock extends Block {
    public DateBunchBlock() {
        super(Properties.create(Material.PLANTS).hardnessAndResistance(0.2F).tickRandomly()
                .sound(SoundType.WET_GRASS).harvestTool(ToolType.HOE));
    }

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 1;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 1;
    }

}
