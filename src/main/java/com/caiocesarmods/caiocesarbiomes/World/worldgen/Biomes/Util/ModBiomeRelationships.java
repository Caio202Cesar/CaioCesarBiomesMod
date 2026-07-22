package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

public class ModBiomeRelationships {
    public static void register() {

        BiomeRelationshipRegistry.register(
                ModBiomes.MEDITERRANEAN_OAK_WOODLAND,
                ModBiomes.MEDITERRANEAN_OAK_SPARSE_WOODLAND,
                RelationshipType.SUB_BIOME,
                4);

        // More relationships...
    }

}
