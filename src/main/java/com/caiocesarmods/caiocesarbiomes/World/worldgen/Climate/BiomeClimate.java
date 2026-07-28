package com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate;

import net.minecraft.util.math.BlockPos;

public interface BiomeClimate {
    // Base values
    float getSummerBaseTemperature();
    void setSummerBaseTemperature(float temperature);

    // Effective values
    float getSummerTemperature(BlockPos pos);

    // Classifications
    SummerHeat getSummerHeat(BlockPos pos);

}
