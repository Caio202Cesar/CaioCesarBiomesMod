package com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate;

import net.minecraft.util.math.BlockPos;

public interface BiomeSummerTemperature {
    float getSummerBaseTemperature();

    void setSummerBaseTemperature(float temperature);

    float getSummerTemperature(BlockPos pos);
}
