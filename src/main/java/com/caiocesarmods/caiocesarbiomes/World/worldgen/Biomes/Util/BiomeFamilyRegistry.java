package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;
import java.util.EnumMap;
import java.util.Map;

public class BiomeFamilyRegistry {
    private static final Map<BiomeFamily, BiomeFamilyDefinition> DEFINITIONS = new EnumMap<>(BiomeFamily.class);

    private BiomeFamilyRegistry() {
    }

    /**
     * Registers one or more biome family definitions.
     */
    public static void register(BiomeFamilyDefinition... definitions) {

        for (BiomeFamilyDefinition definition : definitions) {

            BiomeFamily family = definition.getFamily();

            if (DEFINITIONS.containsKey(family)) {
                throw new IllegalStateException("Biome family already registered: " + family);
            }

            DEFINITIONS.put(family, definition);
        }
    }

    /**
     * Returns the definition for the given family.
     */
    @Nullable
    public static BiomeFamilyDefinition get(BiomeFamily family) {
        return DEFINITIONS.get(family);
    }

    /**
     * Returns true if the family has a definition.
     */
    public static boolean hasDefinition(BiomeFamily family) {
        return DEFINITIONS.containsKey(family);
    }

    /**
     * Returns the beach biome for the family.
     */
    @Nullable
    public static ResourceLocation getBeach(BiomeFamily family) {

        BiomeFamilyDefinition definition = get(family);

        if (definition == null) {
            return null;
        }

        return definition.getBeach();
    }

    /**
     * Returns the river biome for the family.
     */
    @Nullable
    public static ResourceLocation getRiver(BiomeFamily family) {

        BiomeFamilyDefinition definition = get(family);

        if (definition == null) {
            return null;
        }

        return definition.getRiver();
    }
}
