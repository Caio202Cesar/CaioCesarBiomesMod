package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

public class ModBiomeFamilies {
    public static void register() {

        // Mediterranean Oak Woodland family

        BiomeFamilyRegistry.register(
                ModBiomes.MEDITERRANEAN_OAK_WOODLAND,
                ModBiomes.MEDITERRANEAN_OAK_WOODLAND);

        BiomeFamilyRegistry.register(
                ModBiomes.MEDITERRANEAN_OAK_SPARSE_WOODLAND,
                ModBiomes.MEDITERRANEAN_OAK_WOODLAND);

    }
}
