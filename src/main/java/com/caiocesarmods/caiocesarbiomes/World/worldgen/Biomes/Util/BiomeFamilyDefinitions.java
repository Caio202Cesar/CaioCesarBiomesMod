package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

public class BiomeFamilyDefinitions {

    public static void register() {

        BiomeFamilyRegistry.register(

                BiomeFamilyDefinition.builder(BiomeFamily.TROPICAL_RAINFOREST)
                        .beach(ModBiomes.TROPICAL_BEACH)
                        //.river(ModBiomes.TROPICAL_RIVER)
                        .build(),

                BiomeFamilyDefinition.builder(BiomeFamily.MEDITERRANEAN)
                        .beach(ModBiomes.MEDITERRANEAN_BEACH)
                        //.river(ModBiomes.MEDITERRANEAN_RIVER)
                        .build()

        );
    }
}
