package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Layers;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.ModBiomeRegistry;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.ICastleTransformer;

public enum CustomBeachLayer implements ICastleTransformer {
    INSTANCE;

    private static final IntSet field_242942_b = new IntOpenHashSet(new int[]{26, 11, 12, 13, 140, 30, 31, 158, 10});
    private static final IntSet field_242943_c = new IntOpenHashSet(new int[]{168, 169, 21, 22, 23, 149, 151});

    private static final int BEACH =
            WorldGenRegistries.BIOME.getId(
                    WorldGenRegistries.BIOME.getOrThrow(Biomes.BEACH));

    private static final int SNOWY_BEACH =
            WorldGenRegistries.BIOME.getId(
                    WorldGenRegistries.BIOME.getOrThrow(Biomes.SNOWY_BEACH));

    private static final int STONE_SHORE =
            WorldGenRegistries.BIOME.getId(
                    WorldGenRegistries.BIOME.getOrThrow(Biomes.STONE_SHORE));

    @Override
    public int apply(INoiseRandom context, int north, int west, int south, int east, int center) {
        if (center == 14) {
            if (CustomLayerUtil.isShallowOcean(north) || CustomLayerUtil.isShallowOcean(west) ||
                    CustomLayerUtil.isShallowOcean(south) || CustomLayerUtil.isShallowOcean(east)) {
                return getReplacementBeach(center, SNOWY_BEACH);
            }
        } else if (field_242943_c.contains(center)) {
            if (!isJungleCompatible(north) || !isJungleCompatible(west) || !isJungleCompatible(south) || !isJungleCompatible(east)) {
                return 23;
            }

            if (CustomLayerUtil.isOcean(north) || CustomLayerUtil.isOcean(west) || CustomLayerUtil.isOcean(south) || CustomLayerUtil.isOcean(east)) {
                return getReplacementBeach(center, BEACH);
            }
        } else if (center != 3 && center != 34 && center != 20) {
            if (field_242942_b.contains(center)) {
                if (!CustomLayerUtil.isOcean(center) && (CustomLayerUtil.isOcean(north) || CustomLayerUtil.isOcean(west) ||
                        CustomLayerUtil.isOcean(south) || CustomLayerUtil.isOcean(east))) {
                    return 26;
                }
            } else if (center != 37 && center != 38) {
                if (!CustomLayerUtil.isOcean(center) && center != 7 && center != 6 && (CustomLayerUtil.isOcean(north)
                        || CustomLayerUtil.isOcean(west)
                        || CustomLayerUtil.isOcean(south) || CustomLayerUtil.isOcean(east))) {
                    return 16;
                }
            } else if (!CustomLayerUtil.isOcean(north) && !CustomLayerUtil.isOcean(west) && !CustomLayerUtil.isOcean(south)
                    && !CustomLayerUtil.isOcean(east) && (!this.isMesa(north) || !this.isMesa(west) || !this.isMesa(south) || !this.isMesa(east))) {
                return 2;
            }
        } else if (!CustomLayerUtil.isOcean(center) && (CustomLayerUtil.isOcean(north) || CustomLayerUtil.isOcean(west)
                || CustomLayerUtil.isOcean(south) || CustomLayerUtil.isOcean(east))) {
            return getReplacementBeach(center, STONE_SHORE);
        }

        return center;
    }

    private static int getReplacementBeach(int sourceBiomeId, int fallbackBeach) {

        Biome biome = WorldGenRegistries.BIOME.getByValue(sourceBiomeId);

        if (biome == null)
            return fallbackBeach;

        ResourceLocation id = WorldGenRegistries.BIOME.getKey(biome);

        if (id == null)
            return fallbackBeach;

        if (!ModBiomeRegistry.hasDefinition(id))
            return fallbackBeach;

        ResourceLocation beach = ModBiomeRegistry.getBeach(id);

        if (beach == null)
            return fallbackBeach;

        return WorldGenRegistries.BIOME
                .getOptional(beach)
                .map(WorldGenRegistries.BIOME::getId)
                .orElse(fallbackBeach);
    }

    private static boolean isJungleCompatible(int p_151631_0_) {
        return field_242943_c.contains(p_151631_0_) || p_151631_0_ == 4 || p_151631_0_ == 5 || CustomLayerUtil.isOcean(p_151631_0_);
    }

    private boolean isMesa(int p_151633_1_) {
        return p_151633_1_ == 37 || p_151633_1_ == 38 || p_151633_1_ == 39 || p_151633_1_ == 165 || p_151633_1_ == 166 || p_151633_1_ == 167;
    }
}
