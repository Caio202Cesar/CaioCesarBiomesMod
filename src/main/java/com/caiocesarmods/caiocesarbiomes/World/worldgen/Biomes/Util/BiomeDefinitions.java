package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biomes;

public class BiomeDefinitions {

    public static void register() {

        ModBiomeRegistry.register(
                BiomeDefinition.builder(Biomes.JUNGLE.getLocation())
                        .family(BiomeFamily.TROPICAL_RAINFOREST)
                        .variant(BiomeVariant.BEACH, new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "tropical_beach"))
                        .variant(BiomeVariant.HIGHLANDS, Biomes.JUNGLE_HILLS.getLocation())
                        .build()
        );

        ModBiomeRegistry.register(
                BiomeDefinition.builder(new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "mediterranean_scrubland"))
                        .family(BiomeFamily.MEDITERRANEAN)
                        .variant(BiomeVariant.BEACH, new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "hot_mediterranean_beach"))
                        .build()
        );
    }
}
