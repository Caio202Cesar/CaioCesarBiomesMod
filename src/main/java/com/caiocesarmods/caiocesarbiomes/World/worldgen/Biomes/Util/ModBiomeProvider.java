package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.mojang.serialization.Codec;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

public class ModBiomeProvider extends BiomeProvider {

    private final Registry<Biome> registry;

    public ModBiomeProvider(Registry<Biome> registry) {

        super(
                ModBiomeRegistry.getBiomes(registry)
        );

        this.registry = registry;
    }


    @Override
    public Biome getNoiseBiome(int x, int y, int z) {

        System.out.println(
                "Biome requested at: " + x + " " + z
        );

        ResourceLocation id = new ResourceLocation(
                CaioCesarBiomesMod.MOD_ID,
                "subtropical_laurel_forest"
        );

        return BiomeResolver.getBiome(registry, id);
    }


    public Registry<Biome> getRegistry() {
        return this.registry;
    }


    @Override
    protected Codec<? extends BiomeProvider> getBiomeProviderCodec() {
        return ModBiomeProviders.CAIO_CESAR;
    }


    @Override
    public BiomeProvider getBiomeProvider(long seed) {
        return this;
    }
}