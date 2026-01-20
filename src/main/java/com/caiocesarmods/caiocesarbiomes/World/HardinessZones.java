package com.caiocesarmods.caiocesarbiomes.World;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

import java.util.HashMap;
import java.util.Map;

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

    private static final Map<ResourceLocation, String> SAPLING_ZONES = new HashMap<>();

    static {
        // VANILLA
        SAPLING_ZONES.put(new ResourceLocation("minecraft", "birch_sapling"), "min 3, max 8");
        SAPLING_ZONES.put(new ResourceLocation("minecraft", "spruce_sapling"), "min 2, max 8");
        SAPLING_ZONES.put(new ResourceLocation("minecraft", "jungle_sapling"), "min 11");
        SAPLING_ZONES.put(new ResourceLocation("minecraft", "acacia_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("minecraft", "dark_oak_sapling"), "min 4, max 10");

        // YOUR MOD
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "marula_sapling"), "10");

        // OTHER MODS
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "jabuticaba_sapling"), "9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "sapucaia_sapling"), "10");
    }

    public static String getZoneForSapling(ResourceLocation id) {
        return SAPLING_ZONES.getOrDefault(id, "Unknown Zone");
    }

}
