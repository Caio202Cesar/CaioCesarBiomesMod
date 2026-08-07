package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import net.minecraft.world.biome.Biomes;

import java.util.Set;

import static com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.MatchMode.ANY;
import static com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.ModBiomes.ARAUCARIA_PLATEAU;

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
                0,
                false,
                false,
                null);
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.MEDITERRANEAN_OAK_WOODLAND,
                ModBiomes.MEDITERRANEAN_SCRUBLAND_BEACH);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.MEDITERRANEAN_OAK_WOODLAND,
                ModBiomes.MEDITERRANEAN_SCRUBLAND_RIVER);
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.MEDITERRANEAN_OAK_SPARSE_WOODLAND,
                ModBiomes.MEDITERRANEAN_SCRUBLAND_BEACH);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.MEDITERRANEAN_OAK_SPARSE_WOODLAND,
                ModBiomes.MEDITERRANEAN_SCRUBLAND_RIVER);

        //Mediterranean Scrubland
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.MEDITERRANEAN_SCRUBLAND,
                ModBiomes.MEDITERRANEAN_SCRUBLAND_BEACH);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.MEDITERRANEAN_SCRUBLAND,
                ModBiomes.MEDITERRANEAN_SCRUBLAND_RIVER);

        //Oleander Gardens
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.OLEANDER_GARDENS,
                ModBiomes.MEDITERRANEAN_SCRUBLAND_BEACH);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.OLEANDER_GARDENS,
                ModBiomes.MEDITERRANEAN_SCRUBLAND_RIVER);

        //Coniferous (Zone 9)
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.MEDITERRANEAN_PINE_FOREST,
                ModBiomes.CONIFEROUS_MEDITERRANEAN_BEACH);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.MEDITERRANEAN_PINE_FOREST,
                ModBiomes.MEDITERRANEAN_SAVANNA_RIVER);

        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.MEDITERRANEAN_CONIFEROUS_SAVANNA,
                ModBiomes.CONIFEROUS_MEDITERRANEAN_BEACH);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.MEDITERRANEAN_CONIFEROUS_SAVANNA,
                ModBiomes.MEDITERRANEAN_SAVANNA_RIVER);

        //Zone 9
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.CORK_OAK_SAVANNA,
                ModBiomes.CORK_OAK_BEACH);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.CORK_OAK_SAVANNA,
                ModBiomes.MEDITERRANEAN_SAVANNA_RIVER);

        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.OLIVE_GROVE,
                ModBiomes.OLIVE_GROVE_BEACH);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.OLIVE_GROVE,
                ModBiomes.MEDITERRANEAN_SAVANNA_RIVER);

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
                2,
                false,
                false,
                null);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.TROPICAL_BAMBOO_MARSH,
                ModBiomes.TROPICAL_BAMBOO_MARSH_RIVER); //This is different from the bamboo jungle river.
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.TROPICAL_BAMBOO_MARSH,
                ModBiomes.BAMBOO_TROPICAL_WET_BEACH);

        //Tropical Seasonal Forest
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.TROPICAL_SEASONAL_FOREST,
                ModBiomes.TROPICAL_SAVANNA_BEACH);

        //Savanna
        BiomeRelationshipRegistry.registerBeach(
                Biomes.SAVANNA,
                ModBiomes.TROPICAL_SAVANNA_BEACH);
        BiomeRelationshipRegistry.registerBeach(
                Biomes.SAVANNA_PLATEAU,
                ModBiomes.TROPICAL_SAVANNA_BEACH);
        BiomeRelationshipRegistry.registerBeach(
                Biomes.SHATTERED_SAVANNA,
                ModBiomes.TROPICAL_SAVANNA_BEACH);
        BiomeRelationshipRegistry.registerBeach(
                Biomes.SHATTERED_SAVANNA_PLATEAU,
                ModBiomes.TROPICAL_SAVANNA_BEACH);

        //Jungle
        BiomeRelationshipRegistry.registerBeach(
                Biomes.JUNGLE,
                ModBiomes.TROPICAL_WET_BEACH);
        BiomeRelationshipRegistry.registerBeach(
                Biomes.JUNGLE_EDGE,
                ModBiomes.TROPICAL_WET_BEACH);
        BiomeRelationshipRegistry.registerBeach(
                Biomes.JUNGLE_HILLS,
                ModBiomes.TROPICAL_WET_BEACH);
        BiomeRelationshipRegistry.registerBeach(
                Biomes.MODIFIED_JUNGLE,
                ModBiomes.TROPICAL_WET_BEACH);
        BiomeRelationshipRegistry.registerBeach(
                Biomes.MODIFIED_JUNGLE_EDGE,
                ModBiomes.TROPICAL_WET_BEACH);
        BiomeRelationshipRegistry.registerBeach(
                Biomes.BAMBOO_JUNGLE,
                ModBiomes.BAMBOO_TROPICAL_WET_BEACH);
        BiomeRelationshipRegistry.registerBeach(
                Biomes.BAMBOO_JUNGLE_HILLS,
                ModBiomes.BAMBOO_TROPICAL_WET_BEACH);

        //Tropical islands
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.TROPICAL_PINE_ISLAND,
                ModBiomes.TROPICAL_WET_BEACH);
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.TROPICAL_ISLAND,
                ModBiomes.TROPICAL_WET_BEACH);

        ///Subtropical
        //Laurel Forest
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.LAUREL_FOREST,
                ModBiomes.LAUREL_FOREST_SUBTROPICAL_BEACH);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.LAUREL_FOREST,
                ModBiomes.LAUREL_FOREST_RIVER);

        BiomeRelationshipRegistry.register(
                ModBiomes.MONTANE_LAUREL_GROVE,
                ModBiomes.LAUREL_FOREST,
                RelationshipType.EDGE,
                4,
                15,
                6,
                0,
                false,
                false,
                null);
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.MONTANE_LAUREL_GROVE,
                ModBiomes.LAUREL_FOREST_SUBTROPICAL_BEACH);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.MONTANE_LAUREL_GROVE,
                ModBiomes.LAUREL_FOREST_RIVER);

        BiomeRelationshipRegistry.register(
                ModBiomes.SUBTROPICAL_EXTREME_HILLS,
                ModBiomes.LAUREL_JUNGLE,
                RelationshipType.EDGE,
                4,
                15,
                6,
                0,
                false,
                false,
                null);
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.SUBTROPICAL_EXTREME_HILLS,
                ModBiomes.LAUREL_JUNGLE_SUBTROPICAL_BEACH);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.SUBTROPICAL_EXTREME_HILLS,
                ModBiomes.LAUREL_FOREST_RIVER);

        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.LAUREL_JUNGLE,
                ModBiomes.LAUREL_JUNGLE_SUBTROPICAL_BEACH);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.LAUREL_JUNGLE,
                ModBiomes.LAUREL_FOREST_RIVER);

        BiomeRelationshipRegistry.register(
                ModBiomes.LAUREL_JUNGLE,
                ModBiomes.BAMBOO_SUBTROPICAL_LAUREL_JUNGLE,
                RelationshipType.RARE,
                15,
                15,
                2,
                3,
                false,
                false,
                null);
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.BAMBOO_SUBTROPICAL_LAUREL_JUNGLE,
                ModBiomes.LAUREL_JUNGLE_SUBTROPICAL_BEACH);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.BAMBOO_SUBTROPICAL_LAUREL_JUNGLE,
                ModBiomes.LAUREL_FOREST_RIVER);

        //Lucidophyllous oak forest
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.SUBTROPICAL_LUCIDOPHYLLOUS_OAK_FOREST,
                ModBiomes.SUBTROPICAL_LUCIDOPHYLLOUS_OAK_BEACH);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.SUBTROPICAL_LUCIDOPHYLLOUS_OAK_FOREST,
                ModBiomes.SUBTROPICAL_LUCIDOPHYLLOUS_OAK_RIVER);

        //Humid subtropical pine forest
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.SUBTROPICAL_PINE_FOREST,
                ModBiomes.SUBTROPICAL_PINE_BEACH);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.SUBTROPICAL_PINE_FOREST,
                ModBiomes.SUBTROPICAL_PINE_RIVER);

        //Eucalyptus Plains
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.EUCALYPTUS_PLAINS,
                ModBiomes.EUCALYPTUS_PLAINS_BEACH);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.EUCALYPTUS_PLAINS,
                ModBiomes.EUCALYPTUS_PLAINS_RIVER);

        //Chilean Temperate Biomes
        BiomeRelationshipRegistry.register(
                ModBiomes.PEWEN_CONIFEROUS_GROVE,
                ModBiomes.VALDIVIAN_TEMPERATE_RAINFOREST,
                RelationshipType.EDGE,
                4,
                15,
                6,
                0,
                false,
                false,
                null);
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.PEWEN_CONIFEROUS_GROVE,
                ModBiomes.VALDIVIAN_TEMPERATE_RAINFOREST_BEACH);
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.VALDIVIAN_TEMPERATE_RAINFOREST,
                ModBiomes.VALDIVIAN_TEMPERATE_RAINFOREST_BEACH);

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
                3,
                false,
                false,
                null);

        BiomeRelationshipRegistry.register(
                ModBiomes.COASTAL_SUBTROPICAL_DESERT,
                ModBiomes.FOG_OASIS,
                RelationshipType.RARE,
                15,
                15,
                2,
                3,
                false,
                false,
                null);

        /// Tundra
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.TUSSOCK_TUNDRA,
                ModBiomes.TUSSOCK_TUNDRA_BEACH);

        /// Brazillian Biomes
        BiomeRelationshipRegistry.register(
                ModBiomes.AMAZON_RAINFOREST,
                ModBiomes.AMAZON_RAINFOREST_EDGE,
                RelationshipType.EDGE,
                4,
                15,
                6,
                0,
                false,
                false,
                null);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.AMAZON_RAINFOREST_EDGE,
                ModBiomes.AMAZON_VARZEA_FOREST);
       BiomeRelationshipRegistry.registerRiver(
                ModBiomes.AMAZON_RAINFOREST,
                ModBiomes.AMAZON_VARZEA_FOREST);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.AMAZON_RAINFOREST,
                ModBiomes.BLACK_AMAZON_RIVER);

        //Restinga
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.DUNAS_RESTINGA,
                ModBiomes.RESTINGA_BEACH);

        //Atlantic Forest
        BiomeRelationshipRegistry.register(
                ModBiomes.SERRA_DO_MAR_FOREST,
                ModBiomes.ATLANTIC_FOREST,
                RelationshipType.EDGE,
                4,
                15,
                6,
                0,
                false,
                false,
                null);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.SERRA_DO_MAR_FOREST,
                ModBiomes.ATLANTIC_FOREST_RIVER);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.SERRA_DO_MAR_FOREST,
                ModBiomes.ATLANTIC_FOREST_BEACH);
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.ATLANTIC_FOREST,
                ModBiomes.ATLANTIC_FOREST_BEACH);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.ATLANTIC_FOREST,
                ModBiomes.ATLANTIC_FOREST_RIVER);

        //Pampas
        BiomeRelationshipRegistry.register(
                ModBiomes.PAMPAS_COASTAL_FIELDS,
                ModBiomes.BUTIA_PAMPAS,
                RelationshipType.SUB_BIOME,
                4,
                15,
                10,
                3,
                false,
                false,
                null);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.PAMPAS_COASTAL_FIELDS,
                ModBiomes.PAMPAS_COASTAL_FIELDS_RIVER);
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.PAMPAS_COASTAL_FIELDS,
                ModBiomes.PAMPAS_COASTAL_FIELDS_BEACH);

        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.BUTIA_PAMPAS,
                ModBiomes.PAMPAS_COASTAL_FIELDS_RIVER);
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.BUTIA_PAMPAS,
                ModBiomes.PAMPAS_COASTAL_FIELDS_BEACH);

        BiomeRelationshipRegistry.register(
                ModBiomes.PAMPAS,
                ModBiomes.COXILHAS,
                RelationshipType.SUB_BIOME,
                4,
                15,
                10,
                3,
                false,
                false,
                null);
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.PAMPAS,
                ModBiomes.PAMPAS_RIVER);
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.PAMPAS,
                ModBiomes.PAMPAS_BEACH);

        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.COXILHAS,
                ModBiomes.PAMPAS_RIVER);
        BiomeRelationshipRegistry.registerBeach(
                ModBiomes.COXILHAS,
                ModBiomes.PAMPAS_BEACH);

        //Cocal Forest
        new BiomeRelationship(
                ModBiomes.CERRADO,
                ModBiomes.COCAL_FOREST,
                RelationshipType.TRANSITIONAL_EDGE,
                1,
                0,
                0,
                2,
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
                1,
                false,
                false,
                ANY,
                ModBiomes.CAATINGA
        );

        /*
        new BiomeRelationship(
                ModBiomes.ARAUCARIA_PLATEAU,
                ModBiomes.GOATBEARD_GRASS_FIELDS,
                RelationshipType.TRANSITIONAL_EDGE,
                1,
                0,
                0,
                1,
                false,
                false,
                ANY,
                ModBiomes.PAMPAS
        );*/
    }
}
