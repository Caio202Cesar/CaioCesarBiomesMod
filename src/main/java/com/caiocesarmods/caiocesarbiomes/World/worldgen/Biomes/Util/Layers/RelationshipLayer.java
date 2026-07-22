package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.Layers;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.BiomeRelationship;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.BiomeRelationshipRegistry;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.ICastleTransformer;

public enum RelationshipLayer implements ICastleTransformer {

    INSTANCE;

    @Override
    public int apply(INoiseRandom random,
                     int north,
                     int west,
                     int south,
                     int east,
                     int center) {

        Biome biome = WorldGenRegistries.BIOME.getByValue(center);

        if (biome == null)
            return center;

        ResourceLocation id = WorldGenRegistries.BIOME.getKey(biome);

        if (id == null)
            return center;

        for (BiomeRelationship relationship :
                BiomeRelationshipRegistry.getRelationships(id)) {

            int result = relationship.getType().apply(
                    relationship,
                    random,
                    north,
                    west,
                    south,
                    east,
                    center);

            if (result != center)
                return result;
        }

        return center;
    }
}