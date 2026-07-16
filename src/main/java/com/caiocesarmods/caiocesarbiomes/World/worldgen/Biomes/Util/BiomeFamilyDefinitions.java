package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import com.caiocesarmods.caiocesarbiomes.Api.ModBiomes;

public class BiomeFamilyDefinitions {

    public static void register() {

        BiomeFamilyRegistry.register(

                BiomeFamilyDefinition.builder(BiomeFamily.TROPICAL_RAINFOREST)
                        .beach(ModResourceLocations.TROPICAL_BEACH)
                        //.river(ModBiomes.TROPICAL_RIVER)
                        .build(),

                BiomeFamilyDefinition.builder(BiomeFamily.MEDITERRANEAN)
                        .beach(ModResourceLocations.MEDITERRANEAN_BEACH)
                        //.river(ModBiomes.MEDITERRANEAN_RIVER)
                        .build()

        );
    }
}
