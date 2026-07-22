package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import net.minecraft.util.ResourceLocation;

import java.util.*;

public class BiomeRelationshipRegistry {
    private static final Map<ResourceLocation, List<BiomeRelationship>> RELATIONSHIPS = new HashMap<>();

    public static void register(BiomeRelationship relationship) {
        RELATIONSHIPS
                .computeIfAbsent(
                        relationship.getParent(),
                        k -> new ArrayList<>())
                .add(relationship);
    }

    public static void register(
            ResourceLocation parent,
            ResourceLocation child,
            RelationshipType type,
            int chance) {

        register(new BiomeRelationship(parent, child, type, chance));
    }

    public static List<BiomeRelationship> getRelationships(ResourceLocation biome) {

        return RELATIONSHIPS.getOrDefault(
                biome,
                Collections.emptyList());
    }

    public static Optional<BiomeRelationship> getRelationship(
            ResourceLocation biome,
            RelationshipType type) {

        return getRelationships(biome)
                .stream()
                .filter(r -> r.getType() == type)
                .findFirst();
    }

    public static void clear() {
        RELATIONSHIPS.clear();
    }
}
