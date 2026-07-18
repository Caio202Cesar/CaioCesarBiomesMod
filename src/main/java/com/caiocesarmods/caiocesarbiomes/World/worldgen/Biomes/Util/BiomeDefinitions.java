package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

public class BiomeDefinitions {
    public static void register() {

        ModBiomeRegistry.register(
                BiomeDefinition.builder(ModResourceLocations.MEDITERRANEAN_OAK_WOODLAND)
                        .family(BiomeFamily.MEDITERRANEAN)
                        .variant(BiomeVariant.SPARSE, ModResourceLocations.MEDITERRANEAN_OAK_SPARSE_WOODLAND)
                        .build());
    }
}
