package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.Layers;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.BiomeDefinition;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.BiomeVariant;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.ModBiomeRegistry;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.IC0Transformer;

public enum CustomBiomeLayer implements IC0Transformer {

    INSTANCE;

    @Override
    public int apply(INoiseRandom random, int biomeId) {

        // Leave oceans alone
        /*if (CustomLayerUtil.isOcean(biomeId)) {
            return biomeId;
        }*/

        Biome biome = WorldGenRegistries.BIOME.getByValue(biomeId);

        if (biome == null) {
            return biomeId;
        }

        ResourceLocation id = WorldGenRegistries.BIOME.getKey(biome);

        if (id == null) {
            return biomeId;
        }

        BiomeDefinition definition = ModBiomeRegistry.get(id);

        if (definition == null) {
            return biomeId;
        }

        // 1 chance in 8 of becoming the sparse variant
        if (definition.hasVariant(BiomeVariant.SPARSE) && random.random(8) == 0) {

            ResourceLocation sparseId = definition.getVariant(BiomeVariant.SPARSE);

            return WorldGenRegistries.BIOME
                    .getOptional(sparseId)
                    .map(WorldGenRegistries.BIOME::getId)
                    .orElse(biomeId);
        }

        return biomeId;
    }
}