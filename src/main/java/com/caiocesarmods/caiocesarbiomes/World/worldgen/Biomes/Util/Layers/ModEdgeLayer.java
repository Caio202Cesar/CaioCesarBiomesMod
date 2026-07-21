package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.Layers;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.ModBiomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.ICastleTransformer;

public enum ModEdgeLayer implements ICastleTransformer {

    INSTANCE;

    @Override
    public int apply(INoiseRandom random,
                     int north,
                     int west,
                     int south,
                     int east,
                     int center) {

        int mediterranean_oak_dense = biomeId(ModBiomes.MEDITERRANEAN_OAK_WOODLAND);
        int mediterranean_oak_sparse = biomeId(ModBiomes.MEDITERRANEAN_OAK_SPARSE_WOODLAND);

        if (mediterranean_oak_dense == -1 || mediterranean_oak_sparse == -1)
            return center;

        if (center != mediterranean_oak_dense)
            return center;

        if (north != mediterranean_oak_dense ||
                south != mediterranean_oak_dense ||
                east != mediterranean_oak_dense ||
                west != mediterranean_oak_dense) {

            return mediterranean_oak_sparse;
        }

        return center;
    }

    private int biomeId(ResourceLocation id) {
        return WorldGenRegistries.BIOME
                .getOptional(id)
                .map(WorldGenRegistries.BIOME::getId)
                .orElse(-1);
    }
}