package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Layers;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.BiomeResolver;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.ICastleTransformer;

public enum CustomShoreLayer implements ICastleTransformer {
    INSTANCE;

    private static final int STONE_SHORE =
            WorldGenRegistries.BIOME.getId(
                    WorldGenRegistries.BIOME.getOrThrow(Biomes.STONE_SHORE));

    private static final int SNOWY_BEACH =
            WorldGenRegistries.BIOME.getId(
                    WorldGenRegistries.BIOME.getOrThrow(Biomes.SNOWY_BEACH));

    @Override
    public int apply(INoiseRandom random,
                     int north,
                     int west,
                     int south,
                     int east,
                     int center) {

        if (CustomLayerUtil.isOcean(center)) {
            return center;
        }

        if (!touchesOcean(north, west, south, east)) {
            return center;
        }

        Biome biome = WorldGenRegistries.BIOME.getByValue(center);

        if (biome == null) {
            return center;
        }

        // Snow biomes always use snowy beach
        if (biome.getPrecipitation() == Biome.RainType.SNOW) {
            return SNOWY_BEACH;
        }

        // Mountains use stone shore
        if (biome.getCategory() == Biome.Category.EXTREME_HILLS) {
            return STONE_SHORE;
        }

        // Look for a registered beach variant
        ResourceLocation biomeId = WorldGenRegistries.BIOME.getKey(biome);

        if (biomeId != null) {

            ResourceLocation beachId = BiomeResolver.getBeach(biomeId);

            if (beachId != null) {

                Biome beach = WorldGenRegistries.BIOME.getOptional(beachId).orElse(null);

                if (beach != null) {
                    return WorldGenRegistries.BIOME.getId(beach);
                }
            }
        }

        // No beach variant registered
        return center;
    }

    private static boolean touchesOcean(int north, int west, int south, int east) {
        return CustomLayerUtil.isOcean(north)
                || CustomLayerUtil.isOcean(west)
                || CustomLayerUtil.isOcean(south)
                || CustomLayerUtil.isOcean(east);
    }
}
