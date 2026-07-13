package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.mojang.serialization.Codec;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.ArrayList;

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

        ResourceLocation id = new ResourceLocation(
                CaioCesarBiomesMod.MOD_ID,
                "subtropical_laurel_forest"
        );

        return BiomeResolver.getBiome(
                registry,
                id
        );
    }

    public Registry<Biome> getRegistry() {
        return this.registry;
    }

    @Override
    protected Codec<? extends BiomeProvider> getBiomeProviderCodec() {
        return null;
    }


    @Override
    public BiomeProvider getBiomeProvider(long seed) {
        return this;
    }
}