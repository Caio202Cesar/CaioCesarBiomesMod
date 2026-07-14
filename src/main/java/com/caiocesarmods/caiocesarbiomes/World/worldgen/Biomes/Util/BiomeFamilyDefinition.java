package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.RegistryObject;

import javax.annotation.Nullable;

public class BiomeFamilyDefinition {

    private final BiomeFamily family;
    private final ResourceLocation beach;
    private final ResourceLocation river;

    private BiomeFamilyDefinition(Builder builder) {
        this.family = builder.family;
        this.beach = builder.beach;
        this.river = builder.river;
    }

    /**
     * Returns the biome family.
     */
    public BiomeFamily getFamily() {
        return family;
    }

    /**
     * Returns the beach biome for this family.
     */
    @Nullable
    public ResourceLocation getBeach() {
        return beach;
    }

    /**
     * Returns true if this family has a beach biome.
     */
    public boolean hasBeach() {
        return beach != null;
    }

    /**
     * Returns the river biome for this family.
     */
    @Nullable
    public ResourceLocation getRiver() {
        return river;
    }

    /**
     * Returns true if this family has a river biome.
     */
    public boolean hasRiver() {
        return river != null;
    }

    public static Builder builder(BiomeFamily family) {
        return new Builder(family);
    }

    public static class Builder {

        private final BiomeFamily family;

        private ResourceLocation beach;
        private ResourceLocation river;

        private Builder(BiomeFamily family) {
            this.family = family;
        }

        public Builder beach(ResourceLocation beach) {
            this.beach = beach;
            return this;
        }

        public Builder beach(RegistryObject<Biome> beach) {
            return beach(beach.getId());
        }

        public Builder beach(RegistryKey<Biome> beach) {
            return beach(beach.getLocation());
        }

        public Builder river(ResourceLocation river) {
            this.river = river;
            return this;
        }

        public Builder river(RegistryObject<Biome> river) {
            return river(river.getId());
        }

        public Builder river(RegistryKey<Biome> river) {
            return river(river.getLocation());
        }

        public BiomeFamilyDefinition build() {
            return new BiomeFamilyDefinition(this);
        }
    }
}
