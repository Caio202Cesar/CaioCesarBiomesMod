package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;

import java.util.*;

public class BiomeRelationshipRegistry {
    private static final Map<ResourceLocation, List<BiomeRelationship>> RELATIONSHIPS = new HashMap<>();
    private static final Map<ResourceLocation, List<BiomeRelationship>> PARENTS = new HashMap<>();

    public static void register(BiomeRelationship relationship) {
        RELATIONSHIPS
                .computeIfAbsent(
                        relationship.getParent(),
                        k -> new ArrayList<>())
                .add(relationship);

        PARENTS
                .computeIfAbsent(
                        relationship.getChild(),
                        k -> new ArrayList<>())
                .add(relationship);
    }

    //Mod -> Mod
    public static void register(
            ResourceLocation parent,
            ResourceLocation child,
            RelationshipType type,
            int chance,
            int edgeSize,
            int priority,
            int minNeighbourMatches,
            boolean beach,
            boolean river,
            MatchMode matchMode,
            float noiseThreshold,
            ResourceLocation... requiredNeighbours) {

        register(new BiomeRelationship(
                parent,
                child,
                type,
                chance,
                edgeSize,
                priority,
                minNeighbourMatches,
                beach,
                river,
                matchMode,
                noiseThreshold,
                requiredNeighbours));
    }

    public static void registerRiver(ResourceLocation parent, ResourceLocation child) {
        register(new BiomeRelationship(
                parent,
                child,
                null,
                0,
                0,
                0,
                0,
                false,   // beach
                true, // river
                null,
                0));
    }

    public static void registerBeach(ResourceLocation parent, ResourceLocation child) {
        register(new BiomeRelationship(
                parent,
                child,
                RelationshipType.BEACH,
                0,
                0,
                0,
                0,
                true,
                false,
                null,
                0));
    }

    //Vanilla -> Mod
    public static void register(
            RegistryKey<Biome> parent,
            ResourceLocation child,
            RelationshipType type,
            int chance,
            int edgeSize,
            int priority,
            int minNeighbourMatches,
            boolean beach,
            boolean river,
            MatchMode matchMode,
            float noiseThreshold,
            ResourceLocation... requiredNeighbours) {

        register(
                parent.getLocation(),
                child,
                type,
                chance,
                edgeSize,
                priority,
                minNeighbourMatches,
                beach,
                river,
                matchMode,
                noiseThreshold,
                requiredNeighbours);
    }

    public static void registerRiver(RegistryKey<Biome> parent, ResourceLocation child) {
        register(new BiomeRelationship(
                parent.getLocation(),
                child,
                null,
                0,
                0,
                0,
                0,
                false,   // beach
                true, // river
                null,
                0));
    }

    public static void registerBeach(RegistryKey<Biome> parent, ResourceLocation child) {
        register(new BiomeRelationship(
                parent.getLocation(),
                child,
                RelationshipType.BEACH,
                0,
                0,
                0,
                0,
                true,
                false,
                null,
                0));
    }

    //Vanilla -> Vanilla
    public static void register(
            RegistryKey<Biome> parent,
            RegistryKey<Biome> child,
            RelationshipType type,
            int chance,
            int edgeSize,
            int priority,
            int minNeighbourMatches,
            boolean beach,
            boolean river,
            MatchMode matchMode,
            float noiseThreshold,
            ResourceLocation... requiredNeighbours) {

        register(
                parent.getLocation(),
                child.getLocation(),
                type,
                chance,
                edgeSize,
                priority,
                minNeighbourMatches,
                beach,
                river,
                matchMode,
                noiseThreshold,
                requiredNeighbours);
    }

    public static void registerRiver(RegistryKey<Biome> parent, RegistryKey<Biome> child) {
        register(new BiomeRelationship(
                parent.getLocation(),
                child.getLocation(),
                null,
                0,
                0,
                0,
                0,
                false,   // beach
                true, // river
                null,
                0));
    }

    public static void registerBeach(RegistryKey<Biome> parent, RegistryKey<Biome> child) {
        register(new BiomeRelationship(
                parent.getLocation(),
                child.getLocation(),
                RelationshipType.BEACH,
                0,
                0,
                0,
                0,
                true,
                false,
                null,
                0));
    }

    //Mod -> Vanilla
    public static void register(
            ResourceLocation parent,
            RegistryKey<Biome> child,
            RelationshipType type,
            int chance,
            int edgeSize,
            int priority,
            int minNeighbourMatches,
            boolean beach,
            boolean river,
            MatchMode matchMode,
            float noiseThreshold,
            ResourceLocation... requiredNeighbours) {

        register(
                parent,
                child.getLocation(),
                type,
                chance,
                edgeSize,
                priority,
                minNeighbourMatches,
                beach,
                river,
                matchMode,
                noiseThreshold,
                requiredNeighbours);
    }

    public static void registerRiver(ResourceLocation parent, RegistryKey<Biome> child) {
        register(new BiomeRelationship(
                parent,
                child.getLocation(),
                null,
                0,
                0,
                0,
                0,
                false,   // beach
                true,    // river
                null,
                0));
    }

    public static void registerBeach(ResourceLocation parent, RegistryKey<Biome> child) {
        register(new BiomeRelationship(
                parent,
                child.getLocation(),
                RelationshipType.BEACH,
                0,
                0,
                0,
                0,
                true,
                false,
                null,
                0));
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

    public static Optional<BiomeRelationship> getRiverRelationship(ResourceLocation biome) {

        return getRelationships(biome)
                .stream()
                .filter(BiomeRelationship::isRiver)
                .findFirst();
    }

    public static Optional<BiomeRelationship> getParentRelationship(
            ResourceLocation biome,
            RelationshipType type) {

        return PARENTS
                .getOrDefault(biome, Collections.emptyList())
                .stream()
                .filter(r -> r.getType() == type)
                .findFirst();
    }

    public static void clear() {
        RELATIONSHIPS.clear();
    }
}
