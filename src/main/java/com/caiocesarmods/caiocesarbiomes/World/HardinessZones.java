package com.caiocesarmods.caiocesarbiomes.World;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class HardinessZones {

    public static float getAdjustedTemperature(World world, BlockPos pos) {
        Biome biome = world.getBiome(pos);
        float baseTemp = biome.getTemperature(pos);

        // Example altitude modifier: -0.0015 per block above Y=64
        int y = pos.getY();
        float altitudeModifier = 0f;

        if (y > 64) {
            altitudeModifier = (y - 64) * -0.0015f;
        }

        return baseTemp + altitudeModifier;
    }

    public static int getZone(World world, BlockPos pos) {
        float temp = getAdjustedTemperature(world, pos);

        if (temp < 0.0f) return 0; //Subzero zone
        if (temp < 0.15f) return 1; //Always snow
        if (temp < 0.29f) return 2; //Border taiga
        if (temp < 0.39f) return 3; //Taiga
        if (temp < 0.49f) return 4; //Border continental temperate
        if (temp < 0.59f) return 5; //Continental temperate
        if (temp < 0.69f) return 6; //Continental temperate
        if (temp < 0.74f) return 7; //Temperate
        if (temp < 0.79f) return 8; //Temperate
        if (temp < 0.84f) return 9; //Border subtropical
        if (temp < 0.89f) return 10; //Subtropical
        if (temp < 0.94f) return 11; //Border tropical
        return 12; //Tropical
    }

}
