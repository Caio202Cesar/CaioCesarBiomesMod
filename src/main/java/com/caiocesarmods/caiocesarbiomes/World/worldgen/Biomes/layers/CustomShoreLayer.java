package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.layers;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.HotMediterraneanBeachBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.MediterraneanScrublandBiome;
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

    private static final int MEDITERRANEAN_SCRUBLAND =
            WorldGenRegistries.BIOME.getId(
                    MediterraneanScrublandBiome.MEDITERRANEAN_SCRUBLAND.get());

    private static final int MEDITERRANEAN_SCRUBLAND_BEACH =
            WorldGenRegistries.BIOME.getId(
                    HotMediterraneanBeachBiome.HOT_MEDITERRANEAN_BEACH.get());

    private static int getBeach(int biome) {

        // ---------- Tropical ----------
        if (LayerUtil.areBiomesSimilar(biome, MEDITERRANEAN_SCRUBLAND)) {

            return MEDITERRANEAN_SCRUBLAND_BEACH;
        }

        return biome;
    }
}
