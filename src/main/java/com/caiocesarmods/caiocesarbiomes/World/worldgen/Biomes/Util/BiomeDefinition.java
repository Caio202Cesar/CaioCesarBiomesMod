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

    public ResourceLocation getBiome() {
        return biome;
    }

    public BiomeFamily getFamily() {
        return family;
    }

    @Nullable
    public ResourceLocation getVariant(BiomeVariant variant) {
        return variants.get(variant);
    }

    public boolean hasVariant(BiomeVariant variant) {
        return variants.containsKey(variant);
    }

    public Map<BiomeVariant, ResourceLocation> getVariants() {
        return variants;
    }

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
            return variant(variant, biome.getLocation()); // or biome.getLocation() depending on mappings
        }

        public BiomeDefinition build() {
            return new BiomeDefinition(this);
        }
    }
}
