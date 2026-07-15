package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Layers;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.BiomeDefinition;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.BiomeVariant;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.ModBiomeRegistry;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.area.IArea;
import net.minecraft.world.gen.layer.LayerUtil;
import net.minecraft.world.gen.layer.traits.IAreaTransformer2;
import net.minecraft.world.gen.layer.traits.IDimOffset0Transformer;

public enum CustomMixRiverLayer implements IAreaTransformer2, IDimOffset0Transformer {
    INSTANCE;

    private static final int RIVER =
            WorldGenRegistries.BIOME.getId(
                    WorldGenRegistries.BIOME.getOrThrow(Biomes.RIVER));

    private static final int FROZEN_RIVER =
            WorldGenRegistries.BIOME.getId(
                    WorldGenRegistries.BIOME.getOrThrow(Biomes.FROZEN_RIVER));

    private static final int SNOWY_TUNDRA =
            WorldGenRegistries.BIOME.getId(
                    WorldGenRegistries.BIOME.getOrThrow(Biomes.SNOWY_TUNDRA));

    private static final int MUSHROOM_FIELDS =
            WorldGenRegistries.BIOME.getId(
                    WorldGenRegistries.BIOME.getOrThrow(Biomes.MUSHROOM_FIELDS));

    private static final int MUSHROOM_FIELD_SHORE =
            WorldGenRegistries.BIOME.getId(
                    WorldGenRegistries.BIOME.getOrThrow(Biomes.MUSHROOM_FIELD_SHORE));

    @Override
    public int apply(INoiseRandom random,
                     IArea biomeArea,
                     IArea riverArea,
                     int x,
                     int z) {

        int biomeId = biomeArea.getValue(getOffsetX(x), getOffsetZ(z));
        int riverId = riverArea.getValue(getOffsetX(x), getOffsetZ(z));

        // Oceans never receive rivers
        if (CustomLayerUtil.isOcean(biomeId)) {
            return biomeId;
        }

        // No river here
        if (riverId != RIVER) {
            return biomeId;
        }

        // Vanilla frozen river
        if (biomeId == SNOWY_TUNDRA) {
            return FROZEN_RIVER;
        }

        // Vanilla mushroom shore
        if (biomeId == MUSHROOM_FIELDS || biomeId == MUSHROOM_FIELD_SHORE) {
            return MUSHROOM_FIELD_SHORE;
        }

        // Look up the biome definition
        Biome biome = WorldGenRegistries.BIOME.getByValue(biomeId);

        if (biome == null)
            return biomeId;

        ResourceLocation key = WorldGenRegistries.BIOME.getKey(biome);

        BiomeDefinition definition = ModBiomeRegistry.get(key);

        if (definition != null) {

            ResourceLocation riverBiomeId = definition.getVariant(BiomeVariant.RIVER);

            if (riverBiomeId != null) {

                Biome riverBiome = WorldGenRegistries.BIOME.getOptional(riverBiomeId).orElse(null);

                if (riverBiome != null) {
                    return WorldGenRegistries.BIOME.getId(riverBiome);
                }
            }
        }

        // No custom river registered
        return biomeId;
    }
}