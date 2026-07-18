package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.Layers;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.BiomeDefinition;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.BiomeVariant;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.ModBiomeRegistry;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.IC0Transformer;

public enum CustomSubBiomeLayer implements IC0Transformer {

    INSTANCE;

    @Override
    public int apply(INoiseRandom random, int biomeId) {

        Biome biome = WorldGenRegistries.BIOME.getByValue(biomeId);

        if (biome == null)
            return biomeId;

        ResourceLocation id = WorldGenRegistries.BIOME.getKey(biome);

        BiomeDefinition definition = ModBiomeRegistry.get(id);

        if (definition == null)
            return biomeId;

        ResourceLocation variant = definition.getVariant(BiomeVariant.SPARSE);

        if (variant == null)
            return biomeId;

        // About 1 in 8 chunks become the variant.
        if (random.random(8) != 0)
            return biomeId;

        return WorldGenRegistries.BIOME
                .getOptional(variant)
                .map(WorldGenRegistries.BIOME::getId)
                .orElse(biomeId);
    }
}
