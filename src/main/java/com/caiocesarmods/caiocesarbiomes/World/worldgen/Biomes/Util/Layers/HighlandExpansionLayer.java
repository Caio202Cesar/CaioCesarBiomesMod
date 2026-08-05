package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.Layers;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.BiomeRelationship;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.BiomeRelationshipRegistry;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.RelationshipType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.ICastleTransformer;

import java.util.Optional;

public enum HighlandExpansionLayer implements ICastleTransformer {

    INSTANCE;

    @Override
    public int apply(
            INoiseRandom random,
            int north,
            int west,
            int south,
            int east,
            int center) {

        ResourceLocation centerBiome = biomeId(center);

        if (BiomeRelationshipRegistry
                .getParentRelationship(centerBiome, RelationshipType.HIGHLAND)
                .isPresent())
            return center;

        if (centerBiome == null)
            return center;

        int highlandNeighbours = 0;
        ResourceLocation candidate = null;
        BiomeRelationship candidateRelationship = null;

        int[] neighbours = {
                north,
                south,
                east,
                west
        };

        for (int neighbour : neighbours) {

            ResourceLocation neighbourId = biomeId(neighbour);

            if (neighbourId == null)
                continue;

            Optional<BiomeRelationship> relationship =
                    BiomeRelationshipRegistry.getParentRelationship(
                            neighbourId,
                            RelationshipType.HIGHLAND);

            if (!relationship.isPresent())
                continue;

            BiomeRelationship rel = relationship.get();

            if (!rel.getParent().equals(centerBiome))
                continue;

            double noiseValue = random.random(10000) / 10000.0;

            if (noiseValue < rel.getNoiseThreshold())
                continue;

            highlandNeighbours++;
            candidate = neighbourId;
            candidateRelationship = rel;

        }

        if (highlandNeighbours < 2)
            return center;

        if (random.random(3) != 0)
            return center;

        if (random.random(4) != 0)
            return center;

        if (candidateRelationship == null)
            return center;

        return WorldGenRegistries.BIOME
                .getOptional(candidateRelationship.getChild())
                .map(WorldGenRegistries.BIOME::getId)
                .orElse(center);
    }

    private static ResourceLocation biomeId(int biomeId) {

        Biome biome = WorldGenRegistries.BIOME.getByValue(biomeId);

        if (biome == null)
            return null;

        return WorldGenRegistries.BIOME.getKey(biome);
    }
}
