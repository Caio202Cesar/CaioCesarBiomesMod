package com.caiocesarmods.caiocesarbiomes.Climate;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;

import java.util.List;

public enum ClimaticZone {
    TROPICAL, SUBTROPICAL, TEMPERATE, TAIGA, POLAR;

    public static ClimaticZone getZone(int z) {
        if (Math.abs(z) < 2000) return TROPICAL;
        if (Math.abs(z) < 6000) return SUBTROPICAL;
        if (Math.abs(z) < 10000) return TEMPERATE;
        if (Math.abs(z) < 14000) return TAIGA;
        return POLAR;
    }

    public static float applyAltitudeModifier(float baseTemperature, int y) {
        if (y > 140) return baseTemperature - 0.2f; //Colder/cooler biomes at higher altitudes
        if (y < 80) return baseTemperature + 0.2f; //Hotter/warmer biomes at lower altitudes
        return baseTemperature;
    }
}
