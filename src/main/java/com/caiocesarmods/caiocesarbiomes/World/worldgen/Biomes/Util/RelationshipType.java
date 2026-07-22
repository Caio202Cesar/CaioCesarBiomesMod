package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.LayerUtil;

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

            if (!(LayerUtil.areBiomesSimilar(north, center)
                    && LayerUtil.areBiomesSimilar(south, center)
                    && LayerUtil.areBiomesSimilar(east, center)
                    && LayerUtil.areBiomesSimilar(west, center))) {

                return WorldGenRegistries.BIOME
                        .getOptional(relationship.getChild())
                        .map(WorldGenRegistries.BIOME::getId)
                        .orElse(center);
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

            return center;
        }
    }; /*

    BEACH {
        @Override
        public Integer apply(BiomeRelationship relationship,
                         INoiseRandom random,
                         int north,
                         int west,
                         int south,
                         int east,
                         int center) {

            if (RelationshipUtil.isOcean(north)
                    || RelationshipUtil.isOcean(south)
                    || RelationshipUtil.isOcean(east)
                    || RelationshipUtil.isOcean(west)) {

                return WorldGenRegistries.BIOME
                        .getOptional(relationship.getChild())
                        .map(WorldGenRegistries.BIOME::getId)
                        .orElse(center);
            }

            return center;
        }

    };

    HILLS {
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

            return center;
        }
    },

    RIVER {
        @Override
        public Integer apply(BiomeRelationship relationship,
                         INoiseRandom random,
                         int north,
                         int west,
                         int south,
                         int east,
                         int center) {

            if (LayerUtil.isRiver(north)
                    || LayerUtil.isRiver(south)
                    || LayerUtil.isRiver(east)
                    || LayerUtil.isRiver(west)) {

                return WorldGenRegistries.BIOME
                        .getOptional(relationship.getChild())
                        .map(WorldGenRegistries.BIOME::getId)
                        .orElse(center);
            }

            return center;
        }
    };

    private static int id(RegistryKey<Biome> key) {
        return WorldGenRegistries.BIOME.getId(
                WorldGenRegistries.BIOME.getOrThrow(key));
    }

    public static class RelationshipUtil {

        public static boolean isOcean(int biomeId) {
            return LayerUtil.areBiomesSimilar(biomeId, id(Biomes.OCEAN))
                    || LayerUtil.areBiomesSimilar(biomeId, id(Biomes.DEEP_OCEAN))
                    || LayerUtil.areBiomesSimilar(biomeId, id(Biomes.COLD_OCEAN))
                    || LayerUtil.areBiomesSimilar(biomeId, id(Biomes.DEEP_COLD_OCEAN))
                    || LayerUtil.areBiomesSimilar(biomeId, id(Biomes.FROZEN_OCEAN))
                    || LayerUtil.areBiomesSimilar(biomeId, id(Biomes.DEEP_FROZEN_OCEAN))
                    || LayerUtil.areBiomesSimilar(biomeId, id(Biomes.LUKEWARM_OCEAN))
                    || LayerUtil.areBiomesSimilar(biomeId, id(Biomes.DEEP_LUKEWARM_OCEAN))
                    || LayerUtil.areBiomesSimilar(biomeId, id(Biomes.WARM_OCEAN))
                    || LayerUtil.areBiomesSimilar(biomeId, id(Biomes.DEEP_WARM_OCEAN));
        }
    }*/

    public abstract Integer apply(
            BiomeRelationship relationship,
            INoiseRandom random,
            int north,
            int west,
            int south,
            int east,
            int center);
}
