package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

public class ModBiomeRelationships {
    public static void register() {

        BiomeRelationshipRegistry.register(
                ModBiomes.MEDITERRANEAN_OAK_WOODLAND,
                ModBiomes.MEDITERRANEAN_OAK_SPARSE_WOODLAND,
                RelationshipType.EDGE,
                4,
                7,
                6);

        BiomeRelationshipRegistry.register(
                ModBiomes.MEDITERRANEAN_OAK_WOODLAND,
                ModBiomes.MEDITERRANEAN_SCRUBLAND_BEACH,
                RelationshipType.BEACH,
                0,
                0,
                0);
    }

}
