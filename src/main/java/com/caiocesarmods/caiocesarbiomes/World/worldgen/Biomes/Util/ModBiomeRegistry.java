package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.layers.BiomeDefinition;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

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
}
