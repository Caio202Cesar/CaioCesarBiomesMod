package com.caiocesarmods.caiocesarbiomes.World;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class HardinessZones {
    public static int getZone(World world, BlockPos pos) {
        Biome biome = world.getBiome(pos);
        float baseTemp = biome.getTemperature(pos);

        if (baseTemp < 0.0f) return 0; //Subzero zone
        if (baseTemp < 0.16f) return 1; //Always snow
        if (baseTemp < 0.3f) return 2; //Border taiga
        if (baseTemp < 0.4f) return 3; //Taiga
        if (baseTemp < 0.5f) return 4; //Border continental temperate
        if (baseTemp < 0.6f) return 5; //Continental temperate
        if (baseTemp < 0.7f) return 6; //Continental temperate
        if (baseTemp < 0.75f) return 7; //Temperate
        if (baseTemp < 0.8f) return 8; //Temperate
        if (baseTemp < 0.85f) return 9; //Border subtropical
        if (baseTemp < 0.9f) return 10; //Subtropical
        if (baseTemp < 0.95f) return 11; //Border tropical
        return 12; //Tropical
    }

}
