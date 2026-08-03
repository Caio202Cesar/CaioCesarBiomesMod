package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import net.minecraft.world.biome.Biomes;

import java.util.Set;

public class ModBiomeRelationships {
    public static void register() {

        ///Mediterranean
        //Oak Woodland
        BiomeRelationshipRegistry.register(
                ModBiomes.MEDITERRANEAN_OAK_WOODLAND,
                ModBiomes.MEDITERRANEAN_OAK_SPARSE_WOODLAND,
                RelationshipType.EDGE,
                4,
                7,
                6,
                false,
                false,
                null);

        BiomeRelationshipRegistry.register(
                ModBiomes.MEDITERRANEAN_OAK_WOODLAND,
                ModBiomes.MEDITERRANEAN_SCRUBLAND_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);

        BiomeRelationshipRegistry.register(
                ModBiomes.MEDITERRANEAN_OAK_SPARSE_WOODLAND,
                ModBiomes.MEDITERRANEAN_SCRUBLAND_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);

        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.MEDITERRANEAN_OAK_WOODLAND,
                ModBiomes.MEDITERRANEAN_SCRUBLAND_RIVER);

        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.MEDITERRANEAN_OAK_SPARSE_WOODLAND,
                ModBiomes.MEDITERRANEAN_SCRUBLAND_RIVER);

        //Mediterranean Scrubland
        BiomeRelationshipRegistry.register(
                ModBiomes.MEDITERRANEAN_SCRUBLAND,
                ModBiomes.MEDITERRANEAN_SCRUBLAND_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);

        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.MEDITERRANEAN_SCRUBLAND,
                ModBiomes.MEDITERRANEAN_SCRUBLAND_RIVER);

        /// Oleander Gardens
        BiomeRelationshipRegistry.register(
                ModBiomes.OLEANDER_GARDENS,
                ModBiomes.MEDITERRANEAN_SCRUBLAND_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);

        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.OLEANDER_GARDENS,
                ModBiomes.MEDITERRANEAN_SCRUBLAND_RIVER);

        //Coniferous (Zone 9)
        BiomeRelationshipRegistry.register(
                ModBiomes.MEDITERRANEAN_PINE_FOREST,
                ModBiomes.CONIFEROUS_MEDITERRANEAN_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);

        BiomeRelationshipRegistry.register(
                ModBiomes.MEDITERRANEAN_CONIFEROUS_SAVANNA,
                ModBiomes.CONIFEROUS_MEDITERRANEAN_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);

        //Zone 9
        BiomeRelationshipRegistry.register(
                ModBiomes.CORK_OAK_SAVANNA,
                ModBiomes.CORK_OAK_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);

        BiomeRelationshipRegistry.register(
                ModBiomes.OLIVE_GROVE,
                ModBiomes.OLIVE_GROVE_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);

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
                false,
                false,
                null);
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
                true,
                false,
                null);

        //Tropical Seasonal Forest
        BiomeRelationshipRegistry.register(
                ModBiomes.TROPICAL_SEASONAL_FOREST,
                ModBiomes.TROPICAL_SAVANNA_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);

        //Savanna
        BiomeRelationshipRegistry.register(
                Biomes.SAVANNA,
                ModBiomes.TROPICAL_SAVANNA_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);
        BiomeRelationshipRegistry.register(
                Biomes.SAVANNA_PLATEAU,
                ModBiomes.TROPICAL_SAVANNA_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);
        BiomeRelationshipRegistry.register(
                Biomes.SHATTERED_SAVANNA,
                ModBiomes.TROPICAL_SAVANNA_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);
        BiomeRelationshipRegistry.register(
                Biomes.SHATTERED_SAVANNA_PLATEAU,
                ModBiomes.TROPICAL_SAVANNA_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);

        //Jungle
        BiomeRelationshipRegistry.register(
                Biomes.JUNGLE,
                ModBiomes.TROPICAL_WET_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);
        BiomeRelationshipRegistry.register(
                Biomes.JUNGLE_EDGE,
                ModBiomes.TROPICAL_WET_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);
        BiomeRelationshipRegistry.register(
                Biomes.JUNGLE_HILLS,
                ModBiomes.TROPICAL_WET_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);
        BiomeRelationshipRegistry.register(
                Biomes.MODIFIED_JUNGLE,
                ModBiomes.TROPICAL_WET_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);
        BiomeRelationshipRegistry.register(
                Biomes.MODIFIED_JUNGLE_EDGE,
                ModBiomes.TROPICAL_WET_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);
        BiomeRelationshipRegistry.register(
                Biomes.BAMBOO_JUNGLE,
                ModBiomes.BAMBOO_TROPICAL_WET_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);
        BiomeRelationshipRegistry.register(
                Biomes.BAMBOO_JUNGLE_HILLS,
                ModBiomes.BAMBOO_TROPICAL_WET_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);

        //Tropical islands
        BiomeRelationshipRegistry.register(
                ModBiomes.TROPICAL_PINE_ISLAND,
                ModBiomes.TROPICAL_WET_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);
        BiomeRelationshipRegistry.register(
                ModBiomes.TROPICAL_ISLAND,
                ModBiomes.TROPICAL_WET_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);

        //Subtropical
        BiomeRelationshipRegistry.register(
                ModBiomes.LAUREL_FOREST,
                ModBiomes.MONTANE_LAUREL_GROVE,
                RelationshipType.HILL,
                5,
                30,
                17,
                false,
                false,
                null);
        BiomeRelationshipRegistry.register(
                ModBiomes.LAUREL_JUNGLE,
                ModBiomes.MONTANE_LAUREL_GROVE,
                RelationshipType.HILL,
                5,
                30,
                17,
                false,
                false,
                null);
        BiomeRelationshipRegistry.register(
                ModBiomes.BAMBOO_SUBTROPICAL_LAUREL_JUNGLE,
                ModBiomes.MONTANE_LAUREL_GROVE,
                RelationshipType.HILL,
                5,
                30,
                17,
                false,
                false,
                null);
        BiomeRelationshipRegistry.register(
                ModBiomes.LAUREL_FOREST,
                ModBiomes.LAUREL_FOREST_SUBTROPICAL_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.LAUREL_FOREST,
                ModBiomes.LAUREL_FOREST_RIVER);
        BiomeRelationshipRegistry.register(
                ModBiomes.LAUREL_JUNGLE,
                ModBiomes.LAUREL_FOREST_SUBTROPICAL_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.LAUREL_JUNGLE,
                ModBiomes.LAUREL_FOREST_RIVER);
        BiomeRelationshipRegistry.register(
                ModBiomes.MONTANE_LAUREL_GROVE,
                ModBiomes.LAUREL_FOREST_SUBTROPICAL_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.MONTANE_LAUREL_GROVE,
                ModBiomes.LAUREL_FOREST_RIVER);
        BiomeRelationshipRegistry.register(
                ModBiomes.BAMBOO_SUBTROPICAL_LAUREL_JUNGLE,
                ModBiomes.LAUREL_FOREST_SUBTROPICAL_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.BAMBOO_SUBTROPICAL_LAUREL_JUNGLE,
                ModBiomes.LAUREL_FOREST_RIVER);

        BiomeRelationshipRegistry.register(
                ModBiomes.SUBTROPICAL_LUCIDOPHYLLOUS_OAK_FOREST,
                ModBiomes.SUBTROPICAL_LUCIDOPHYLLOUS_OAK_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.SUBTROPICAL_LUCIDOPHYLLOUS_OAK_FOREST,
                ModBiomes.SUBTROPICAL_LUCIDOPHYLLOUS_OAK_RIVER);

        /// Deserts
        //Temperate Desert
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.TEMPERATE_DESERT,
                ModBiomes.TEMPERATE_DESERT_RIVER);

        BiomeRelationshipRegistry.register(
                ModBiomes.TEMPERATE_DESERT,
                ModBiomes.TEMPERATE_DESERT_OASIS,
                RelationshipType.RARE,
                15,
                15,
                2,
                false,
                false,
                null);

        BiomeRelationshipRegistry.register(
                ModBiomes.COASTAL_SUBTROPICAL_DESERT,
                ModBiomes.FOG_OASIS,
                RelationshipType.SUB_BIOME,
                3,
                0,
                6,
                false,
                false,
                null);

        /// Tundra
        BiomeRelationshipRegistry.register(
                ModBiomes.TUSSOCK_TUNDRA,
                ModBiomes.TUSSOCK_TUNDRA_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);

        /// Brazillian Biomes
        BiomeRelationshipRegistry.register(
                ModBiomes.AMAZON_RAINFOREST,
                ModBiomes.AMAZON_RAINFOREST_EDGE,
                RelationshipType.EDGE,
                4,
                15,
                6,
                false,
                false,
                null);

       BiomeRelationshipRegistry.registerRiver(
                ModBiomes.AMAZON_RAINFOREST,
                ModBiomes.AMAZON_VARZEA_FOREST);

        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.AMAZON_RAINFOREST,
                ModBiomes.BLACK_AMAZON_RIVER);

        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.AMAZON_RAINFOREST_EDGE,
                ModBiomes.AMAZON_VARZEA_FOREST);

        //Restinga
        BiomeRelationshipRegistry.register(
                ModBiomes.DUNAS_RESTINGA,
                ModBiomes.RESTINGA_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);

        //Atlantic Forest
        BiomeRelationshipRegistry.register(
                ModBiomes.ATLANTIC_FOREST,
                ModBiomes.SERRA_DO_MAR_FOREST,
                RelationshipType.HILL,
                2,
                36,
                10,
                false,
                false,
                null);

        BiomeRelationshipRegistry.register(
                ModBiomes.ATLANTIC_FOREST,
                ModBiomes.ATLANTIC_FOREST_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);

        BiomeRelationshipRegistry.register(
                ModBiomes.SERRA_DO_MAR_FOREST,
                ModBiomes.ATLANTIC_FOREST_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);

        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.ATLANTIC_FOREST,
                ModBiomes.ATLANTIC_FOREST_RIVER);

        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.SERRA_DO_MAR_FOREST,
                ModBiomes.ATLANTIC_FOREST_RIVER);

        //Pampas
        BiomeRelationshipRegistry.register(
                ModBiomes.PAMPAS,
                ModBiomes.PAMPAS_COASTAL_FIELDS,
                RelationshipType.SUB_BIOME,
                4,
                15,
                5,
                false,
                false,
                null);

        BiomeRelationshipRegistry.register(
                ModBiomes.PAMPAS_COASTAL_FIELDS,
                ModBiomes.BUTIA_PAMPAS,
                RelationshipType.SUB_BIOME,
                4,
                15,
                10,
                false,
                false,
                null);

        BiomeRelationshipRegistry.register(
                ModBiomes.PAMPAS,
                ModBiomes.COXILHAS,
                RelationshipType.SUB_BIOME,
                2,
                25,
                10,
                false,
                false,
                null);

        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.PAMPAS,
                ModBiomes.PAMPAS_RIVER);

        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.PAMPAS_COASTAL_FIELDS,
                ModBiomes.PAMPAS_RIVER);

        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.COXILHAS,
                ModBiomes.PAMPAS_RIVER);

        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.BUTIA_PAMPAS,
                ModBiomes.PAMPAS_RIVER);

        BiomeRelationshipRegistry.register(
                ModBiomes.PAMPAS,
                ModBiomes.PAMPAS_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);

        BiomeRelationshipRegistry.register(
                ModBiomes.PAMPAS_COASTAL_FIELDS,
                ModBiomes.PAMPAS_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);

        BiomeRelationshipRegistry.register(
                ModBiomes.COXILHAS,
                ModBiomes.PAMPAS_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);

        BiomeRelationshipRegistry.register(
                ModBiomes.BUTIA_PAMPAS,
                ModBiomes.PAMPAS_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true,
                false,
                null);

        //Cocal Forest
        new BiomeRelationship(
                ModBiomes.CERRADO,
                ModBiomes.COCAL_FOREST,
                RelationshipType.TRANSITIONAL_EDGE,
                1,
                0,
                0,
                false,
                false,
                MatchMode.ALL,
                ModBiomes.AMAZON_RAINFOREST_EDGE,
                ModBiomes.CAATINGA
        );

        new BiomeRelationship(
                ModBiomes.AMAZON_RAINFOREST_EDGE,
                ModBiomes.COCAL_FOREST,
                RelationshipType.TRANSITIONAL_EDGE,
                1,
                0,
                0,
                false,
                false,
                MatchMode.ANY,
                ModBiomes.CAATINGA
        );
    }
}
