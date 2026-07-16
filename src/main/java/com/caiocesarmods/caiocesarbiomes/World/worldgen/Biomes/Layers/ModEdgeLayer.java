package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Layers;

import com.caiocesarmods.caiocesarbiomes.Api.ModBiomes;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.ICastleTransformer;
import net.minecraft.world.gen.layer.LayerUtil;

import java.util.Optional;

public enum ModEdgeLayer implements ICastleTransformer {

    INSTANCE;

    @Override
    public int apply(INoiseRandom context, int north, int west, int south, int east, int center) {
        int[] outBiomeId = new int[1];
        
        if (this.replaceBiomeEdge(outBiomeId, north, east, south, west, center, ModBiomes.mediterranean_oak_woodland,
                ModBiomes.mediterranean_oak_sparse_woodland)) { return outBiomeId[0];
        }

        return center;
    }

    private boolean replaceBiomeEdge(int[] outId, int northBiomeId, int eastBiomeId, int southBiomeId, int westBiomeId, int biomeId,
                                     Optional<Biome> fromBiome, Optional<Biome> toBiome) {

        return fromBiome.isPresent() && toBiome.isPresent() && this.replaceBiomeEdge(outId, northBiomeId, eastBiomeId, southBiomeId, westBiomeId, biomeId,
                WorldGenRegistries.BIOME.getId(fromBiome.get()), WorldGenRegistries.BIOME.getId(toBiome.get()));

    }

    private boolean replaceBiomeEdge(int[] outId, int northBiomeId, int eastBiomeId, int southBiomeId, int westBiomeId, int biomeId,
                                     Optional<Biome> fromBiome, int toBiome) {

        return fromBiome.isPresent() && this.replaceBiomeEdge(outId, northBiomeId, eastBiomeId, southBiomeId, westBiomeId, biomeId,
                WorldGenRegistries.BIOME.getId(fromBiome.get()), toBiome);
    }

    private boolean replaceBiomeEdge(int[] outId, int northBiomeId, int eastBiomeId, int southBiomeId, int westBiomeId,
                                     int biomeId, int fromBiome, int toBiome) {
        if (biomeId != fromBiome) {
            return false;
        } else {
            if (LayerUtil.areBiomesSimilar(northBiomeId, fromBiome) && LayerUtil.areBiomesSimilar(eastBiomeId, fromBiome)
                    && LayerUtil.areBiomesSimilar(westBiomeId, fromBiome) && LayerUtil.areBiomesSimilar(southBiomeId, fromBiome)) {
                outId[0] = biomeId;
            } else {
                outId[0] = toBiome;
            }

            return true;
        }
    }
}
