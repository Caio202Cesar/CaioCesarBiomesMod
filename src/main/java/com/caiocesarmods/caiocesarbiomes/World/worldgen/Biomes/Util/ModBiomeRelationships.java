package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import net.minecraft.world.biome.Biomes;

public class ModBiomeRelationships {
    public static void register() {

        ///Mediterranean Oak Woodland
        BiomeRelationshipRegistry.register(
                ModBiomes.MEDITERRANEAN_OAK_WOODLAND,
                ModBiomes.MEDITERRANEAN_OAK_SPARSE_WOODLAND,
                RelationshipType.EDGE,
                4,
                7,
                6,
                false, false);

        BiomeRelationshipRegistry.register(
                ModBiomes.MEDITERRANEAN_OAK_WOODLAND,
                ModBiomes.MEDITERRANEAN_SCRUBLAND_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);

        BiomeRelationshipRegistry.register(
                ModBiomes.MEDITERRANEAN_OAK_SPARSE_WOODLAND,
                ModBiomes.MEDITERRANEAN_SCRUBLAND_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);

        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.MEDITERRANEAN_OAK_WOODLAND,
                ModBiomes.MEDITERRANEAN_OAK_WOODLAND_RIVER);

        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.MEDITERRANEAN_OAK_SPARSE_WOODLAND,
                ModBiomes.MEDITERRANEAN_OAK_WOODLAND_RIVER);

        ///Mediterranean Scrubland
        BiomeRelationshipRegistry.register(
                ModBiomes.MEDITERRANEAN_SCRUBLAND,
                ModBiomes.MEDITERRANEAN_SCRUBLAND_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);

        /// Oleander Gardens
        BiomeRelationshipRegistry.register(
                ModBiomes.OLEANDER_GARDENS,
                ModBiomes.MEDITERRANEAN_SCRUBLAND_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);

        BiomeRelationshipRegistry.register(
                ModBiomes.MEDITERRANEAN_PINE_FOREST,
                ModBiomes.CONIFEROUS_MEDITERRANEAN_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);

        BiomeRelationshipRegistry.register(
                ModBiomes.MEDITERRANEAN_CONIFEROUS_SAVANNA,
                ModBiomes.CONIFEROUS_MEDITERRANEAN_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);

        BiomeRelationshipRegistry.register(
                ModBiomes.CORK_OAK_SAVANNA,
                ModBiomes.CORK_OAK_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);

        BiomeRelationshipRegistry.register(
                ModBiomes.OLIVE_GROVE,
                ModBiomes.OLIVE_GROVE_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);

        //Tropical
        //Mangrove beach - "indochina and bangladesh mangroves"
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.TROPICAL_BAMBOO_MARSH,
                ModBiomes.TROPICAL_BAMBOO_MARSH_RIVER);
        BiomeRelationshipRegistry.register(
                ModBiomes.TROPICAL_BAMBOO_MARSH,
                ModBiomes.BAMBOO_TROPICAL_WET_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);

        BiomeRelationshipRegistry.register(
                ModBiomes.TROPICAL_SEASONAL_FOREST,
                ModBiomes.TROPICAL_SAVANNA_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);

        BiomeRelationshipRegistry.register(
                Biomes.SAVANNA,
                ModBiomes.TROPICAL_SAVANNA_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);
        BiomeRelationshipRegistry.register(
                Biomes.SAVANNA_PLATEAU,
                ModBiomes.TROPICAL_SAVANNA_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);
        BiomeRelationshipRegistry.register(
                Biomes.SHATTERED_SAVANNA,
                ModBiomes.TROPICAL_SAVANNA_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);
        BiomeRelationshipRegistry.register(
                Biomes.SHATTERED_SAVANNA_PLATEAU,
                ModBiomes.TROPICAL_SAVANNA_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);

        BiomeRelationshipRegistry.register(
                Biomes.JUNGLE,
                ModBiomes.TROPICAL_WET_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);
        BiomeRelationshipRegistry.register(
                Biomes.JUNGLE_EDGE,
                ModBiomes.TROPICAL_WET_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);
        BiomeRelationshipRegistry.register(
                Biomes.JUNGLE_HILLS,
                ModBiomes.TROPICAL_WET_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);
        BiomeRelationshipRegistry.register(
                Biomes.MODIFIED_JUNGLE,
                ModBiomes.TROPICAL_WET_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);
        BiomeRelationshipRegistry.register(
                Biomes.MODIFIED_JUNGLE_EDGE,
                ModBiomes.TROPICAL_WET_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);
        BiomeRelationshipRegistry.register(
                Biomes.BAMBOO_JUNGLE,
                ModBiomes.BAMBOO_TROPICAL_WET_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);
        BiomeRelationshipRegistry.register(
                Biomes.BAMBOO_JUNGLE_HILLS,
                ModBiomes.BAMBOO_TROPICAL_WET_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);
    }
}
