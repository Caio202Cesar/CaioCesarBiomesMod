package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate.SummerHeat;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;

public interface MutableBiomeClimate {

    float getSummerBaseTemperature();

    void setSummerBaseTemperature(float temperature);

    float getSummerTemperature(BlockPos pos);

    SummerHeat getSummerHeat(BlockPos pos);

    Biome.Climate getClimate();

    void setClimate(Biome.Climate climate);

}
