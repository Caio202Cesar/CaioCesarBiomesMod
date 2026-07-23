package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import net.minecraft.util.ResourceLocation;

import java.util.Map;

public class BiomeFamilyRegistry {
    Map<ResourceLocation, ResourceLocation> BIOME_TO_FAMILY;

    public static void register(ResourceLocation biome, ResourceLocation family) {
        register(
                ModBiomes.MEDITERRANEAN_OAK_WOODLAND,
                ModBiomes.MEDITERRANEAN_OAK_WOODLAND
        );

        register(
                ModBiomes.MEDITERRANEAN_OAK_SPARSE_WOODLAND,
                ModBiomes.MEDITERRANEAN_OAK_WOODLAND
        );
    }
}
