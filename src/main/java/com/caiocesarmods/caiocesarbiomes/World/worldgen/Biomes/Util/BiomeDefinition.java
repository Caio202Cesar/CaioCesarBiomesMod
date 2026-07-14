package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import net.minecraft.util.ResourceLocation;

import java.util.Map;

import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.RegistryObject;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.EnumMap;

public class BiomeDefinition {

    private final ResourceLocation biome;
    private final BiomeFamily family;
    private final Map<BiomeVariant, ResourceLocation> variants;

    private BiomeDefinition(Builder builder) {
        this.biome = builder.biome;
        this.family = builder.family;
        this.variants = Collections.unmodifiableMap(new EnumMap<>(builder.variants));
    }

    /**
     * Returns the biome ID.
     */
    public ResourceLocation getBiome() {
        return biome;
    }

    /**
     * Returns the biome family.
     */
    public BiomeFamily getFamily() {
        return family;
    }

    /**
     * Returns true if this biome belongs to the given family.
     */
    public boolean isFamily(BiomeFamily family) {
        return this.family == family;
    }

    /**
     * Returns the requested biome variant, or null if none exists.
     */
    @Nullable
    public ResourceLocation getVariant(BiomeVariant variant) {
        return variants.get(variant);
    }

    /**
     * Returns true if this biome has the requested variant.
     */
    public boolean hasVariant(BiomeVariant variant) {
        return variants.containsKey(variant);
    }

    /**
     * Returns the hills variant.
     */
    @Nullable
    public ResourceLocation getHills() {
        return getVariant(BiomeVariant.HILLS);
    }

    /**
     * Returns true if this biome has a hills variant.
     */
    public boolean hasHills() {
        return hasVariant(BiomeVariant.HILLS);
    }

    /**
     * Returns the highlands variant.
     */
    @Nullable
    public ResourceLocation getHighlands() {
        return getVariant(BiomeVariant.HIGHLANDS);
    }

    public boolean hasHighlands() {
        return hasVariant(BiomeVariant.HIGHLANDS);
    }

    /**
     * Returns the mountains variant.
     */
    @Nullable
    public ResourceLocation getMountains() {
        return getVariant(BiomeVariant.MOUNTAINS);
    }

    public boolean hasMountains() {
        return hasVariant(BiomeVariant.MOUNTAINS);
    }

    /**
     * Returns the plateau variant.
     */
    @Nullable
    public ResourceLocation getPlateau() {
        return getVariant(BiomeVariant.PLATEAU);
    }

    public boolean hasPlateau() {
        return hasVariant(BiomeVariant.PLATEAU);
    }

    /**
     * Returns the wooded highlands variant.
     */
    @Nullable
    public ResourceLocation getWoodedHighlands() {
        return getVariant(BiomeVariant.WOODED_HIGHLANDS);
    }

    public boolean hasWoodedHighlands() {
        return hasVariant(BiomeVariant.WOODED_HIGHLANDS);
    }

    /**
     * Returns the foothills variant.
     */
    @Nullable
    public ResourceLocation getFoothills() {
        return getVariant(BiomeVariant.FOOTHILLS);
    }

    public boolean hasFoothills() {
        return hasVariant(BiomeVariant.FOOTHILLS);
    }

    /**
     * Returns the cliffs variant.
     */
    @Nullable
    public ResourceLocation getCliffs() {
        return getVariant(BiomeVariant.CLIFFS);
    }

    public boolean hasCliffs() {
        return hasVariant(BiomeVariant.CLIFFS);
    }

    /**
     * Returns the dense variant.
     */
    @Nullable
    public ResourceLocation getDense() {
        return getVariant(BiomeVariant.DENSE);
    }

    public boolean hasDense() {
        return hasVariant(BiomeVariant.DENSE);
    }

    /**
     * Returns the sparse variant.
     */
    @Nullable
    public ResourceLocation getSparse() {
        return getVariant(BiomeVariant.SPARSE);
    }

    public boolean hasSparse() {
        return hasVariant(BiomeVariant.SPARSE);
    }

    /**
     * Returns the volcanic variant.
     */
    @Nullable
    public ResourceLocation getVolcanic() {
        return getVariant(BiomeVariant.VOLCANIC);
    }

    public boolean hasVolcanic() {
        return hasVariant(BiomeVariant.VOLCANIC);
    }

    /**
     * Creates a builder.
     */
    public static Builder builder(ResourceLocation biome) {
        return new Builder(biome);
    }

    public static class Builder {

        private final ResourceLocation biome;
        private BiomeFamily family = BiomeFamily.NONE;

        private final EnumMap<BiomeVariant, ResourceLocation> variants =
                new EnumMap<>(BiomeVariant.class);

        private Builder(ResourceLocation biome) {
            this.biome = biome;
        }

        public Builder family(BiomeFamily family) {
            this.family = family;
            return this;
        }

        public Builder variant(BiomeVariant variant, ResourceLocation biome) {
            variants.put(variant, biome);
            return this;
        }

        public Builder variant(BiomeVariant variant, RegistryObject<Biome> biome) {
            return variant(variant, biome.getId());
        }

        public Builder variant(BiomeVariant variant, RegistryKey<Biome> biome) {
            return variant(variant, biome.getLocation());
        }

        public BiomeDefinition build() {
            return new BiomeDefinition(this);
        }
    }
}
