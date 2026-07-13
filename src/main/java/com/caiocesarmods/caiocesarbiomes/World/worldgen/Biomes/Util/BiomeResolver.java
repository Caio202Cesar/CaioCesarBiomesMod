package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

import javax.annotation.Nullable;
import java.util.Optional;

public final class BiomeResolver {

    private BiomeResolver() {
    }


    @Nullable
    public static Biome getBiome(Registry<Biome> registry, ResourceLocation location) {
        Optional<Biome> biome = registry.getOptional(location);
        return biome.orElse(null);
    }


    public static RegistryKey<Biome> getKey(ResourceLocation location) {
        return RegistryKey.getOrCreateKey(Registry.BIOME_KEY, location);
    }

    @Nullable
    public static Biome getBiomeById(Registry<Biome> registry, int id) {

        for (Biome biome : registry) {

            if (registry.getId(biome) == id) {
                return biome;
            }
        }

        return null;
    }

    @Nullable
    public static Biome getBiome(Registry<Biome> registry, RegistryKey<Biome> key) {
        return registry.getValueForKey(key);
    }


    @Nullable
    public static ResourceLocation getLocation(Registry<Biome> registry, Biome biome) {
        return registry.getKey(biome);
    }


    public static int getRawId(Registry<Biome> registry, Biome biome) {
        return registry.getId(biome);
    }
}
