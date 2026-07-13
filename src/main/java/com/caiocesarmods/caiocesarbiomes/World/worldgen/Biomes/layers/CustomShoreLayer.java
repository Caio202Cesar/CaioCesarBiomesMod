package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.layers;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.HotMediterraneanBeachBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.MediterraneanScrublandBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.ModBiomeRegistry;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.LayerUtil;
import net.minecraft.world.gen.layer.traits.ICastleTransformer;

public enum CustomShoreLayer implements ICastleTransformer {
    INSTANCE;

    @Override
    public int apply(INoiseRandom rand,
                     int north,
                     int east,
                     int south,
                     int west,
                     int center) {

        // Oceans stay oceans.
        if (isOcean(center)) {
            return center;
        }

        // Only generate beaches when touching an ocean.
        if (!touchesOcean(north, east, south, west)) {
            return center;
        }

        return getBeach(center);
    }

    private static boolean touchesOcean(int north, int east, int south, int west) {
        return isOcean(north)
                || isOcean(east)
                || isOcean(south)
                || isOcean(west);
    }

    // Copied from LayerUtil.
    private static boolean isOcean(int biome) {
        return biome == 44
                || biome == 45
                || biome == 0
                || biome == 46
                || biome == 10
                || biome == 47
                || biome == 48
                || biome == 24
                || biome == 49
                || biome == 50;
    }


    private static int getBeach(int biome) {

        ResourceLocation id = registry.getKey(currentBiome);

        BiomeDefinition definition = ModBiomeRegistry.get(id);

        if (definition != null) {
            ResourceLocation beach = definition.getVariant(BiomeVariant.BEACH);

            if (beach != null) {
                return biomeIdFromResourceLocation(beach);
            }
        }

        return biome;
    }
}
