package com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class SummerTemperature {

    public static float get(World world, BlockPos pos) {

        Biome biome = world.getBiome(pos);

        float temperature = biome.getTemperature();

        temperature += getAltitudeModifier(pos);

        return temperature;
    }


    private static float getAltitudeModifier(BlockPos pos) {

        int altitude = pos.getY() - 64;

        return altitude * -0.005F;
    }
}

