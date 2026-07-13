package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.layers;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.BiomeDefinition;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.BiomeResolver;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.BiomeVariant;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.ModBiomeRegistry;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.ICastleTransformer;

public enum CustomShoreLayer implements ICastleTransformer {
    INSTANCE;

    private Registry<Biome> registry;


    public void setup(Registry<Biome> registry) {
        this.registry = registry;
    }


    @Override
    public int apply(INoiseRandom rand,
                     int north,
                     int east,
                     int south,
                     int west,
                     int center) {

        if (isOcean(center)) {
            return center;
        }

        if (!touchesOcean(north, east, south, west)) {
            return center;
        }

        return getBeach(center);
    }


    private boolean touchesOcean(int north, int east, int south, int west) {
        return isOcean(north)
                || isOcean(east)
                || isOcean(south)
                || isOcean(west);
    }


    private boolean isOcean(int biomeId) {

        Biome biome = BiomeResolver.getBiomeById(registry, biomeId);

        if (biome == null) {
            return false;
        }

        ResourceLocation id = BiomeResolver.getLocation(registry, biome);

        return id != null &&
                id.getNamespace().equals("minecraft") &&
                (
                        id.getPath().contains("ocean")
                );
    }


    private int getBeach(int biomeId) {

        Biome currentBiome = BiomeResolver.getBiomeById(registry, biomeId);

        if (currentBiome == null) {
            return biomeId;
        }


        ResourceLocation id = BiomeResolver.getLocation(registry, currentBiome);

        if (id == null) {
            return biomeId;
        }


        BiomeDefinition definition = ModBiomeRegistry.get(id);

        if (definition == null) {
            return biomeId;
        }


        ResourceLocation beach = definition.getVariant(BiomeVariant.BEACH);

        if (beach == null) {
            return biomeId;
        }


        Biome beachBiome = BiomeResolver.getBiome(registry, beach);

        if (beachBiome == null) {
            return biomeId;
        }


        return BiomeResolver.getRawId(registry, beachBiome);
    }
}