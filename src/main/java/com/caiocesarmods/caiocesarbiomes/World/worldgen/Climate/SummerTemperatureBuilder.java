package com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;

public interface SummerTemperatureBuilder {
    // Base values
    void setSummerBaseTemperature(float temperature);

    Biome.Builder summerBaseTemperature(float temperature);

    float getSummerBaseTemperature();

    // Effective values
    float getSummerTemperature(BlockPos pos);

    // Classifications
    SummerHeat getSummerHeat(BlockPos pos);

}
