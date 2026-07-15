package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biomes;

public class BiomeDefinitions {
    public static void register() {

        ModBiomeRegistry.register(
                BiomeDefinition.builder(ModBiomes.JUNGLE)
                        .family(BiomeFamily.TROPICAL_RAINFOREST)
                        .variant(BiomeVariant.BEACH, ModBiomes.TROPICAL_BEACH)
                        .build()
        );

        BiomeDefinition.builder(ModBiomes.MEDITERRANEAN_SCRUBLAND)
                .variant(BiomeVariant.BEACH, ModBiomes.MEDITERRANEAN_BEACH)
                .build();
    }
}
