package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

public class ModBiomeRelationships {
    public static void register() {

        //Mediterranean
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

        BiomeRelationshipRegistry.register(
                ModBiomes.MEDITERRANEAN_SCRUBLAND,
                ModBiomes.MEDITERRANEAN_SCRUBLAND_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);

        BiomeRelationshipRegistry.register(
                ModBiomes.OLEANDER_GARDENS,
                ModBiomes.STONY_MEDITERRANEAN_SHORE,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);

        BiomeRelationshipRegistry.register(
                ModBiomes.MEDITERRANEAN_PINE_FOREST,
                ModBiomes.CONIFEROUS_STONY_MEDITERRANEAN_SHORE,
                RelationshipType.BEACH,
                0,
                0,
                0,
                true, false);

        BiomeRelationshipRegistry.register(
                ModBiomes.MEDITERRANEAN_CONIFEROUS_SAVANNA,
                ModBiomes.CONIFEROUS_STONY_MEDITERRANEAN_SHORE,
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
        /*
        BiomeRelationshipRegistry.registerRiver(
                ModBiomes.TROPICAL_BAMBOO_MARSH,
                ModBiomes.TROPICAL_BAMBOO_MARSH_RIVER);*/
    }

}
