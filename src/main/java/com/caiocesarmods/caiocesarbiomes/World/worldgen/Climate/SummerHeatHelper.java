package com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class SummerHeatHelper {
    private SummerHeatHelper() {}

    public static SummerHeat get(World world, BlockPos pos) {

        Biome biome = world.getBiome(pos);

        SummerTemperatureBuilder climate = (SummerTemperatureBuilder) (Object) biome;

        return SummerHeat.fromTemperature(
                climate.getSummerTemperature(pos));
    }
}
