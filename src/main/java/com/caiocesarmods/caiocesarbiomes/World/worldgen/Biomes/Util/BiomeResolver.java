package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;

import javax.annotation.Nullable;

public final class BiomeResolver {

    private BiomeResolver() {
    }

    /**
     * Returns the family of a biome.
     */
    @Nullable
    public static BiomeFamily getFamily(ResourceLocation biome) {
        BiomeDefinition definition = ModBiomeRegistry.get(biome);
        return definition != null ? definition.getFamily() : null;
    }

    @Nullable
    public static Biome getBeachBiome(Biome biome) {
        ResourceLocation id = WorldGenRegistries.BIOME.getKey(biome);

        if (id == null)
            return null;

        ResourceLocation beach = getBeach(id);

        if (beach == null)
            return null;

        return WorldGenRegistries.BIOME.getOptional(beach).orElse(null);
    }

    /**
     * Returns a biome variant (HILLS, PLATEAU, MOUNTAINS, etc.).
     */
    @Nullable
    public static ResourceLocation getVariant(ResourceLocation biome, BiomeVariant variant) {
        return ModBiomeRegistry.getVariant(biome, variant);
    }

    /**
     * Returns the beach biome for the biome's family.
     */
    @Nullable
    public static ResourceLocation getBeach(ResourceLocation biome) {

        BiomeFamily family = getFamily(biome);

        if (family == null) {
            return null;
        }

        return BiomeFamilyRegistry.getBeach(family);
    }

    /**
     * Returns the river biome for the biome's family.
     */
    @Nullable
    public static ResourceLocation getRiver(ResourceLocation biome) {

        BiomeFamily family = getFamily(biome);

        if (family == null) {
            return null;
        }

        return BiomeFamilyRegistry.getRiver(family);
    }

    /**
     * Returns the hills variant.
     */
    @Nullable
    public static ResourceLocation getHills(ResourceLocation biome) {
        return getVariant(biome, BiomeVariant.HILLS);
    }

    /**
     * Returns the mountains variant.
     */
    @Nullable
    public static ResourceLocation getMountains(ResourceLocation biome) {
        return getVariant(biome, BiomeVariant.MOUNTAINS);
    }

    /**
     * Returns the plateau variant.
     */
    @Nullable
    public static ResourceLocation getPlateau(ResourceLocation biome) {
        return getVariant(biome, BiomeVariant.PLATEAU);
    }

    /**
     * Returns the highlands variant.
     */
    @Nullable
    public static ResourceLocation getHighlands(ResourceLocation biome) {
        return getVariant(biome, BiomeVariant.HIGHLANDS);
    }

    /**
     * Returns the wooded highlands variant.
     */
    @Nullable
    public static ResourceLocation getWoodedHighlands(ResourceLocation biome) {
        return getVariant(biome, BiomeVariant.WOODED_HIGHLANDS);
    }

    /**
     * Returns the foothills variant.
     */
    @Nullable
    public static ResourceLocation getFoothills(ResourceLocation biome) {
        return getVariant(biome, BiomeVariant.FOOTHILLS);
    }

    /**
     * Returns the cliffs variant.
     */
    @Nullable
    public static ResourceLocation getCliffs(ResourceLocation biome) {
        return getVariant(biome, BiomeVariant.CLIFFS);
    }

    /**
     * Returns the dense variant.
     */
    @Nullable
    public static ResourceLocation getDense(ResourceLocation biome) {
        return getVariant(biome, BiomeVariant.DENSE);
    }

    /**
     * Returns the sparse variant.
     */
    @Nullable
    public static ResourceLocation getSparse(ResourceLocation biome) {
        return getVariant(biome, BiomeVariant.SPARSE);
    }

    /**
     * Returns the volcanic variant.
     */
    @Nullable
    public static ResourceLocation getVolcanic(ResourceLocation biome) {
        return getVariant(biome, BiomeVariant.VOLCANIC);
    }
}