package com.caiocesarmods.caiocesarbiomes.World.worldgen.placers;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.DoublePlantBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.blockplacer.BlockPlacer;
import net.minecraft.world.gen.blockplacer.BlockPlacerType;

import java.util.Random;

public class DoublePlantPlacer extends BlockPlacer {
    public static final Codec<DoublePlantPlacer> CODEC;
    public static final DoublePlantPlacer PLACER = new DoublePlantPlacer();

    protected BlockPlacerType<?> getBlockPlacerType() {
        return BlockPlacerType.DOUBLE_PLANT;
    }

    public void place(IWorld world, BlockPos pos, BlockState state, Random random) {
        ((DoublePlantBlock)state.getBlock()).placeAt(world, pos, 2);
    }
    
    protected BlockPlacerType<?> type() {
        return null;
    }

    static {
        CODEC = Codec.unit(() -> {
            return PLACER;
        });
    }
}
