package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.Layers;

import com.caiocesarmods.caiocesarbiomes.Api.ModBiomes;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.ICastleTransformer;
import net.minecraft.world.gen.layer.LayerUtil;
import net.minecraftforge.fml.RegistryObject;

public enum ModEdgeLayer implements ICastleTransformer {

    INSTANCE;

    @Override
    public int apply(INoiseRandom random,
                     int north,
                     int west,
                     int south,
                     int east,
                     int center) {

        // Mediterranean Oak Woodland -> Sparse Woodland edge
        if (replaceEdge(
                north, west, south, east, center,
                ModBiomes.mediterranean_oak_woodland,
                ModBiomes.mediterranean_oak_sparse_woodland)) {

            return biomeId(ModBiomes.mediterranean_oak_sparse_woodland);
        }

        return center;
    }

    private boolean replaceEdge(
            int north,
            int west,
            int south,
            int east,
            int center,
            java.util.Optional<Biome> base,
            java.util.Optional<Biome> edge) {

        if (!base.isPresent() || !edge.isPresent())
            return false;

        int baseId = WorldGenRegistries.BIOME.getId(base.get());

        if (center != baseId)
            return false;

        return !(LayerUtil.areBiomesSimilar(north, baseId)
                && LayerUtil.areBiomesSimilar(south, baseId)
                && LayerUtil.areBiomesSimilar(east, baseId)
                && LayerUtil.areBiomesSimilar(west, baseId));
    }

    private int biomeId(java.util.Optional<Biome> biome) {
        return WorldGenRegistries.BIOME.getId(biome.get());
    }
}
