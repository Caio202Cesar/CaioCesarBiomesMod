package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

import javax.annotation.Nullable;
import java.util.*;

public class ModBiomeRegistry {

    private static final Map<ResourceLocation, BiomeDefinition> DEFINITIONS = new HashMap<>();

    public static void register(BiomeDefinition... definitions) {
        for (BiomeDefinition definition : definitions) {
            DEFINITIONS.put(definition.getBiome(), definition);
        }
    }

    @Nullable
    public static BiomeDefinition get(ResourceLocation biome) {
        return DEFINITIONS.get(biome);
    }

    public static boolean hasDefinition(ResourceLocation biome) {
        return DEFINITIONS.containsKey(biome);
    }

    public static List<Biome> getBiomes(Registry<Biome> registry) {

        List<Biome> biomes = new ArrayList<>();

        for (BiomeDefinition definition : DEFINITIONS.values()) {

            registry.getOptional(definition.getBiome())
                    .ifPresent(biomes::add);

        }

        return biomes;
    }
}
