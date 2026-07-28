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

        ///Tropical
        //Mangrove beach - "indochina and bangladesh mangroves"

        //Bamboo marsh
        BiomeRelationshipRegistry.register(
                Biomes.BAMBOO_JUNGLE,
                ModBiomes.TROPICAL_BAMBOO_MARSH,
                RelationshipType.SUB_BIOME,
                3,
                0,
                1,
                false, false);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.TROPICAL_BAMBOO_MARSH,
                ModBiomes.TROPICAL_BAMBOO_MARSH_RIVER); //This is different from the bamboo jungle river.
        BiomeRelationshipRegistry.register(
                ModBiomes.TROPICAL_BAMBOO_MARSH,
                ModBiomes.BAMBOO_TROPICAL_WET_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);

        //Tropical Seasonal Forest
        BiomeRelationshipRegistry.register(
                ModBiomes.TROPICAL_SEASONAL_FOREST,
                ModBiomes.TROPICAL_SAVANNA_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);

        //Savanna
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

        //Jungle
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

        //Tropical islands
        BiomeRelationshipRegistry.register(
                ModBiomes.TROPICAL_PINE_ISLAND,
                ModBiomes.TROPICAL_WET_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);
        BiomeRelationshipRegistry.register(
                ModBiomes.TROPICAL_ISLAND,
                ModBiomes.TROPICAL_WET_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);


        /// Tundra
        BiomeRelationshipRegistry.register(
                ModBiomes.TUSSOCK_TUNDRA,
                ModBiomes.TUSSOCK_TUNDRA_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);


        /// Brazillian Biomes
        BiomeRelationshipRegistry.register(
                ModBiomes.AMAZON_RAINFOREST,
                ModBiomes.AMAZON_RAINFOREST_EDGE,
                RelationshipType.EDGE,
                7,
                17,
                6,
                false, false);

        BiomeRelationshipRegistry.register(
                ModBiomes.AMAZON_RAINFOREST,
                ModBiomes.AMAZON_VARZEA_FOREST,
                RelationshipType.SUB_BIOME,
                8,
                0,
                6,
                false, false);

        BiomeRelationshipRegistry.register(
                ModBiomes.DUNAS_RESTINGA,
                ModBiomes.RESTINGA_BEACH,
                RelationshipType.BEACH,
                8,
                0,
                6,
                true, false);

        BiomeRelationshipRegistry.register(
                ModBiomes.PAMPAS,
                ModBiomes.PAMPAS_COAST,
                RelationshipType.SUB_BIOME,
                8,
                0,
                6,
                false, false);

        BiomeRelationshipRegistry.register(
                ModBiomes.PAMPAS,
                ModBiomes.COXILHAS,
                RelationshipType.SUB_BIOME,
                8,
                0,
                6,
                false, false);

        BiomeRelationshipRegistry.register(
                ModBiomes.PAMPAS,
                ModBiomes.BUTIA_PAMPAS,
                RelationshipType.SUB_BIOME,
                4,
                0,
                6,
                false, false);

        /*BiomeRelationshipRegistry.registerRiver(
                ModBiomes.AMAZON_RAINFOREST,
                ModBiomes.BLACK_RIVER);

        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.AMAZON_VARZEA_FOREST,
                ModBiomes.AMAZON_SOLIMON_RIVER);*/
    }
}
