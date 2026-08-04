package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.LayerUtil;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.ModBiomes.*;

public enum RelationshipType {

    EDGE {
        @Override
        public Integer apply(BiomeRelationship relationship,
                             INoiseRandom random,
                             int north,
                             int west,
                             int south,
                             int east,
                             int center) {
            
            ResourceLocation centerFamily = family(center);

            System.out.println(
                    "CENTER=" + biomeName(center) +
                            " CF=" + centerFamily +
                            " NF=" + family(north) +
                            " SF=" + family(south) +
                            " EF=" + family(east) +
                            " WF=" + family(west)
            );

            if (centerFamily == null)
                return center;

            if (!(centerFamily.equals(family(north))
                    && centerFamily.equals(family(south))
                    && centerFamily.equals(family(east))
                    && centerFamily.equals(family(west)))) {

                return WorldGenRegistries.BIOME
                        .getOptional(relationship.getChild())
                        .map(WorldGenRegistries.BIOME::getId)
                        .orElse(center);
            }

            return null;
        }
    },

    TRANSITIONAL_EDGE {

        @Override
        public Integer apply(
                BiomeRelationship relationship,
                INoiseRandom random,
                int north,
                int west,
                int south,
                int east,
                int center) {

            ResourceLocation centerBiome = biomeId(center);

            if (!relationship.getParent().equals(centerBiome))
                return center;

            Set<ResourceLocation> required = relationship.getRequiredNeighbours();

            if (required.isEmpty()) {
                // No neighbour requirements.
                return WorldGenRegistries.BIOME
                        .getOptional(relationship.getChild())
                        .map(WorldGenRegistries.BIOME::getId)
                        .orElse(center);
            }

            int found = 0;

            int[] neighbours = {
                    north,
                    south,
                    east,
                    west
            };

            for (int neighbour : neighbours) {

                ResourceLocation biome = biomeId(neighbour);

                if (required.contains(biome))
                    found++;
            }

            boolean success;

            switch (relationship.getMatchMode()) {

                case ALL:
                    success = found >= required.size();
                    break;

                case ANY:
                    success = found > 0;
                    break;

                default:
                    success = false;
            }

            if (!success)
                return center;

            System.out.println(
                    "[TRANSITION] "
                            + centerBiome
                            + " -> "
                            + relationship.getChild());

            return WorldGenRegistries.BIOME
                    .getOptional(relationship.getChild())
                    .map(WorldGenRegistries.BIOME::getId)
                    .orElse(center);
        }
    },

    SUB_BIOME {
        @Override
        public Integer apply(BiomeRelationship relationship,
                             INoiseRandom random,
                             int north,
                             int west,
                             int south,
                             int east,
                             int center) {

            if (random.random(relationship.getChance()) == 0) {

                return WorldGenRegistries.BIOME
                        .getOptional(relationship.getChild())
                        .map(WorldGenRegistries.BIOME::getId)
                        .orElse(center);
            }

            return null;
        }
    },

    BEACH {
        @Override
        public Integer apply(
                BiomeRelationship relationship,
                INoiseRandom random,
        int north,
        int west,
        int south,
        int east,
        int center) {

            return WorldGenRegistries.BIOME
                    .getOptional(relationship.getChild())
                    .map(WorldGenRegistries.BIOME::getId)
                    .orElse(center);
        }
    },

    HILL {
        @Override
        public Integer apply(
                BiomeRelationship relationship,
                INoiseRandom random,
                int north,
                int west,
                int south,
                int east,
                int center) {

            if (random.random(relationship.getChance()) != 0)
                return null;

            return WorldGenRegistries.BIOME
                    .getOptional(relationship.getChild())
                    .map(WorldGenRegistries.BIOME::getId)
                    .orElse(center);
        }
    },

    RARE {
        @Override
        public Integer apply(
                BiomeRelationship relationship,
                INoiseRandom random,
                int north,
                int west,
                int south,
                int east,
                int center) {

            if (random.random(relationship.getChance()) == 0) {

                return WorldGenRegistries.BIOME
                        .getOptional(relationship.getChild())
                        .map(WorldGenRegistries.BIOME::getId)
                        .orElse(center);
            }

            return null;
        }
    },

    HIGHLAND {
        @Override
        public Integer apply(
                BiomeRelationship relationship,
                INoiseRandom random,
                int north,
                int west,
                int south,
                int east,
                int center) {

            // Highland generation is handled by RelationshipLayer.
            return null;
        }
    };

    private static String biomeName(int id) {
        Biome biome = WorldGenRegistries.BIOME.getByValue(id);

        if (biome == null) {
            return "null(" + id + ")";
        }

        ResourceLocation key = WorldGenRegistries.BIOME.getKey(biome);

        return key == null ? "unknown(" + id + ")" : key.toString();
    }

    private static ResourceLocation family(int biomeId) {

        Biome biome = WorldGenRegistries.BIOME.getByValue(biomeId);

        if (biome == null)
            return new ResourceLocation("minecraft", "unknown");

        ResourceLocation id = WorldGenRegistries.BIOME.getKey(biome);

        if (id == null)
            return new ResourceLocation("minecraft", "unknown");

        return BiomeFamilyRegistry.getFamily(id);
    }

    private static int id(RegistryKey<Biome> key) {
        return WorldGenRegistries.BIOME.getId(
                WorldGenRegistries.BIOME.getOrThrow(key));
    }

    private static ResourceLocation biomeId(int biomeId) {

        Biome biome = WorldGenRegistries.BIOME.getByValue(biomeId);

        if (biome == null)
            return null;

        return WorldGenRegistries.BIOME.getKey(biome);
    }

    public abstract Integer apply(
            BiomeRelationship relationship,
            INoiseRandom random,
            int north,
            int west,
            int south,
            int east,
            int center);
}
