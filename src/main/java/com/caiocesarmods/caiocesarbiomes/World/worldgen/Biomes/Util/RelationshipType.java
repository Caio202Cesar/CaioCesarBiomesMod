package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.LayerUtil;

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
        public Integer apply(BiomeRelationship relationship,
                             INoiseRandom random,
                             int north,
                             int west,
                             int south,
                             int east,
                             int center) {

            ResourceLocation centerBiome = biomeId(center);

            if (!CERRADO.equals(centerBiome))
                return center;

            boolean amazonEdge = false;
            boolean caatinga = false;

            int[] neighbours = {
                    north,
                    south,
                    east,
                    west
            };

            for (int neighbour : neighbours) {

                ResourceLocation biome = biomeId(neighbour);

                if (AMAZON_RAINFOREST_EDGE.equals(biome))
                    amazonEdge = true;

                if (CAATINGA.equals(biome))
                    caatinga = true;
            }

            if (amazonEdge && caatinga) {

                System.out.println(
                        "[TRANSITION] CERRADO -> COCAL_FOREST"
                );

                return WorldGenRegistries.BIOME
                        .getOptional(COCAL_FOREST)
                        .map(WorldGenRegistries.BIOME::getId)
                        .orElse(center);
            }

            return center;
        }
    },

    BRIDGE {
        @Override
        public Integer apply(BiomeRelationship relationship,
                             INoiseRandom random,
                             int north,
                             int west,
                             int south,
                             int east,
                             int center) {

            ResourceLocation centerBiome = biomeId(center);

            if (AMAZON_RAINFOREST_EDGE.equals(centerBiome)) {

                boolean caatinga =
                        CAATINGA.equals(biomeId(north))
                                || CAATINGA.equals(biomeId(south))
                                || CAATINGA.equals(biomeId(east))
                                || CAATINGA.equals(biomeId(west));

                if (caatinga) {
                    return WorldGenRegistries.BIOME
                            .getOptional(COCAL_FOREST)
                            .map(WorldGenRegistries.BIOME::getId)
                            .orElse(center);
                }
            }

            if (CAATINGA.equals(centerBiome)) {

                boolean amazonEdge =
                        AMAZON_RAINFOREST_EDGE.equals(biomeId(north))
                                || AMAZON_RAINFOREST_EDGE.equals(biomeId(south))
                                || AMAZON_RAINFOREST_EDGE.equals(biomeId(east))
                                || AMAZON_RAINFOREST_EDGE.equals(biomeId(west));

                if (amazonEdge) {
                    return WorldGenRegistries.BIOME
                            .getOptional(COCAL_FOREST)
                            .map(WorldGenRegistries.BIOME::getId)
                            .orElse(center);
                }
            }

            return center;
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
