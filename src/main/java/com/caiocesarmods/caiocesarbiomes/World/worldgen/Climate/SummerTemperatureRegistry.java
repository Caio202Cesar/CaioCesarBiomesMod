package com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashMap;
import java.util.Map;

public class SummerTemperatureRegistry {
    private static final Map<ResourceLocation, Float> SUMMER_TEMPERATURES = new HashMap<>();


    public static void register(ResourceLocation biome, float temperature) {
        SUMMER_TEMPERATURES.put(biome, temperature);
    }


    public static float get(Biome biome) {

        ResourceLocation id = ForgeRegistries.BIOMES.getKey(biome);

        Float value = SUMMER_TEMPERATURES.get(id);

        if (value == null) {
            throw new IllegalStateException(
                    "Missing summer temperature for biome: " + id
            );
        }

        return value;
    }
}
