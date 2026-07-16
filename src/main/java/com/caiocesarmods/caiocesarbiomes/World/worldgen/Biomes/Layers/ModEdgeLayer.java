package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Layers;

import com.caiocesarmods.caiocesarbiomes.Api.ModBiomes;
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

    private boolean replaceBiomeEdge(int[] outBiomeId, int north, int east, int south, int west, int center) {;

        return fromBiome.isPresent() && toBiome.isPresent() && this.replaceBiomeEdge(outBiomeId, north, east, south, west, center,
                Registry.BIOME.getId(fromBiome.get()), Registry.BIOME.getId(toBiome.get()));

    }

    private boolean replaceBiomeEdgeIfNecessary(int[] outId, int northBiomeId, int southBiomeId, int eastBiomeId, int westBiomeId, int biomeId, int fromBiome, int toBiome) {
        if (!LayerUtil.isSame(biomeId, fromBiome)) {
            return false;
        } else {
            if (this.canBiomesBeNeighbors(northBiomeId, fromBiome) && this.canBiomesBeNeighbors(southBiomeId, fromBiome) && this.canBiomesBeNeighbors(westBiomeId, fromBiome) && this.canBiomesBeNeighbors(eastBiomeId, fromBiome)) {
                outId[0] = biomeId;
            } else {
                outId[0] = toBiome;
            }

            return true;
        }
    }

    private boolean replaceBiomeEdge(int[] outId, int northBiomeId, int eastBiomeId, int southBiomeId, int westBiomeId, int biomeId, Optional<Biome> fromBiome, Optional<Biome> toBiome) {
    }

    private boolean replaceBiomeEdge(int[] outId, int northBiomeId, int eastBiomeId, int southBiomeId, int westBiomeId, int biomeId,
                                     Optional<Biome> fromBiome, int toBiome) {

        return fromBiome.isPresent() && this.replaceBiomeEdge(outId, northBiomeId, eastBiomeId, southBiomeId, westBiomeId, biomeId,
                Registry.BIOME.getId(fromBiome.get()), toBiome);
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

    private boolean canBiomesBeNeighbors(int biomeIdA, int biomeIdB) {
        if (LayerUtil.areBiomesSimilar(biomeIdA, biomeIdB)) {
            return true;
        } else {
            Biome biomeA = Registry.BIOME.byId(biomeIdA);
            Biome biomeB = Registry.BIOME.byId(biomeIdB);
            if (biomeA != null && biomeB != null) {
                Biome.TempCategory catA = biomeA.getTemperatureCategory();
                Biome.TempCategory catB = biomeB.getTemperatureCategory();
                return catA == catB || catA == Biome.TempCategory.MEDIUM || catB == Biome.TempCategory.MEDIUM;
            } else {
                return false;
            }
        }
    }
}
