package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;

import javax.annotation.Nullable;
import java.util.*;

public class ModBiomeRegistry {

    private static final Map<ResourceLocation, BiomeDefinition> DEFINITIONS = new HashMap<>();

    /**
     * Prevents this utility class from being instantiated.
     */
    private ModBiomeRegistry() {
    }

    /**
     * Registers one or more biome definitions.
     */
    public static void register(BiomeDefinition... definitions) {
        for (BiomeDefinition definition : definitions) {

            ResourceLocation id = definition.getBiome();

            if (DEFINITIONS.containsKey(id)) {
                throw new IllegalStateException("Biome definition already registered: " + id);
            }

            DEFINITIONS.put(id, definition);
        }
    }

    @Nullable
    public static BiomeFamily getFamily(ResourceLocation biome) {

        BiomeDefinition definition = get(biome);

        return definition != null ? definition.getFamily() : null;
    }

    public static boolean isFamily(ResourceLocation biome, BiomeFamily family) {

        BiomeFamily biomeFamily = getFamily(biome);

        return biomeFamily == family;
    }

    private static final Int2ObjectMap<BiomeDefinition> DEFINITIONS_BY_ID =
            new Int2ObjectOpenHashMap<>();

    public static BiomeDefinition byId(int id) {
        return DEFINITIONS_BY_ID.get(id);
    }

    public static void register(BiomeDefinition definition) {

        Biome biome = WorldGenRegistries.BIOME.getOrDefault(definition.getBiome());

        definition.setBiomeObject(biome);

        DEFINITIONS.put(definition.getBiome(), definition);
        DEFINITIONS_BY_ID.put(WorldGenRegistries.BIOME.getId(biome), definition);
    }

    /**
     * Returns the biome definition for the given biome ID.
     */
    @Nullable
    public static BiomeDefinition get(ResourceLocation biome) {
        return DEFINITIONS.get(biome);
    }

    /**
     * Returns true if the biome has a registered definition.
     */
    public static boolean hasDefinition(ResourceLocation biome) {
        return DEFINITIONS.containsKey(biome);
    }

    /**
     * Returns a specific variant of the given biome, or null if it does not exist.
     */
    @Nullable
    public static ResourceLocation getVariant(ResourceLocation biome, BiomeVariant variant) {

        BiomeDefinition definition = get(biome);

        return definition != null ? definition.getVariant(variant) : null;
    }

    public static boolean hasVariant(ResourceLocation biome, BiomeVariant variant) {

        BiomeDefinition definition = get(biome);

        return definition != null && definition.hasVariant(variant);
    }

    public static Collection<BiomeDefinition> getDefinitions() {
        return Collections.unmodifiableCollection(DEFINITIONS.values());
    }

    public static boolean isRegistered(ResourceLocation biome) {
        return DEFINITIONS.containsKey(biome);
    }

        /**
         * Returns the beach variant of the biome, or null if none exists.
         */
    @Nullable
    public static ResourceLocation getBeach(ResourceLocation biome) {
        return getVariant(biome, BiomeVariant.BEACH);
    }

    /**
     * Returns the river variant of the biome, or null if none exists.
     */
    @Nullable
    public static ResourceLocation getRiver(ResourceLocation biome) {
        return getVariant(biome, BiomeVariant.RIVER);
    }

    /**
     * Returns all registered biome instances that currently exist in the registry.
     */
    public static List<Biome> getBiomes(Registry<Biome> registry) {

        List<Biome> biomes = new ArrayList<>();

        for (BiomeDefinition definition : DEFINITIONS.values()) {

            registry.getOptional(definition.getBiome()).ifPresent(biomes::add);

        }

        return biomes;
    }
}
