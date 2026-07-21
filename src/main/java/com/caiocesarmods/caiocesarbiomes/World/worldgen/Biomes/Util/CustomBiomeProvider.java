package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.BambooSubtropicalLaurelJungleBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.DryTropicalBeachBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.MediterraneanScrublandBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.Layers.CustomLayer;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.gen.layer.Layer;
import net.minecraft.world.gen.layer.LayerUtil;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class CustomBiomeProvider extends BiomeProvider {
    public static final Codec<CustomBiomeProvider> CODEC =
            RecordCodecBuilder.create(instance ->
                    instance.group(
                            Codec.LONG.fieldOf("seed")
                                    .stable()
                                    .forGetter(provider -> provider.seed)
                    ).apply(instance, instance.stable(CustomBiomeProvider::new)));

    private final long seed;
    private final CustomLayer biomeLayer;

    private static Stream<Supplier<Biome>> createBiomeStream() {
        return Stream.concat(
                WorldGenRegistries.BIOME.stream()
                        .filter(biome -> {
                            ResourceLocation id = WorldGenRegistries.BIOME.getKey(biome);
                            return id != null &&
                                    id.getNamespace().equals(CaioCesarBiomesMod.MOD_ID);
                        })
                        .map(biome -> () -> biome),

                BiomeManager.getAdditionalOverworldBiomes().stream()
                        .map(key -> () -> WorldGenRegistries.BIOME.getOrThrow(key))
        );
    }

    public CustomBiomeProvider(long seed) {
        super(createBiomeStream());

        this.seed = seed;
        this.biomeLayer = CustomLayerUtil.createLayers(seed);
    }

    @Override
    protected Codec<? extends BiomeProvider> getBiomeProviderCodec() {
        return CODEC;
    }

    @Override
    public BiomeProvider getBiomeProvider(long seed) {
        return new CustomBiomeProvider(seed);
    }

    @Override
    public Biome getNoiseBiome(int x, int y, int z) {
        return biomeLayer.getBiome(x, z);
    }
}
