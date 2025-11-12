package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import com.mojang.serialization.Codec;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ITagCollection;
import net.minecraft.tags.ITagCollectionSupplier;
import net.minecraft.tags.TagCollectionManager;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class LatitudeBiomeProvider extends BiomeProvider {
    private final Registry<Biome> biomeRegistry;
    private final Random random = new Random();

    // Cached biome lists by tag
    private final List<RegistryKey<Biome>> polarBiomes;
    private final List<RegistryKey<Biome>> taigaBiomes;
    private final List<RegistryKey<Biome>> coldBiomes;
    private final List<RegistryKey<Biome>> temperateBiomes;
    private final List<RegistryKey<Biome>> subtropicalBiomes;
    private final List<RegistryKey<Biome>> tropicalBiomes;

    public LatitudeBiomeProvider(Registry<Biome> registry) {
        // Pass all biomes in the registry to the parent
        super(registry.stream().collect(Collectors.toList()));
        this.biomeRegistry = registry;

        polarBiomes = getBiomesFromTag("caiocesarbiomes:polar");
        taigaBiomes = getBiomesFromTag("caiocesarbiomes:taiga");
        coldBiomes = getBiomesFromTag("caiocesarbiomes:cold_temperate");
        temperateBiomes = getBiomesFromTag("caiocesarbiomes:temperate");
        subtropicalBiomes = getBiomesFromTag("caiocesarbiomes:subtropical");
        tropicalBiomes = getBiomesFromTag("caiocesarbiomes:tropical");
    }

    /**
     * Loads all biomes inside a biome tag (1.16.5-style)
     */
    private List<RegistryKey<Biome>> getBiomesFromTag(String tagId) {
        ResourceLocation tagLoc = new ResourceLocation(tagId);

        // Access the biome tag collection via ForgeRegistries
        ITagCollection<Biome> tagCollection =
                TagCollectionManager.getManager().getCustomTypeCollection(ForgeRegistries.BIOMES);

        ITag<Biome> tag = tagCollection.getTagByID(tagLoc);

        if (tag == null || tag.getAllElements().isEmpty()) {
            System.err.println("[LatitudeBiomeProvider] Warning: missing or empty biome tag " + tagId);
            return Collections.emptyList();
        }

        return tag.getAllElements().stream()
                .map(biome -> RegistryKey.getOrCreateKey(Registry.BIOME_KEY, biomeRegistry.getKey(biome)))
                .collect(Collectors.toList());
    }

    /**
     * Returns a biome based on world Z (latitude)
     */
    @Override
    public Biome getNoiseBiome(int x, int y, int z) {
        double latNorm = Math.abs(z) / 10000.0; // 0 = equator, 1 = poles
        List<RegistryKey<Biome>> band = pickBand(latNorm);

        if (band.isEmpty()) {
            return biomeRegistry.getOrDefault(Biomes.PLAINS.getLocation());
        }

        RegistryKey<Biome> chosen = band.get(random.nextInt(band.size()));
        return biomeRegistry.getOrDefault(chosen.getLocation());
    }

    private List<RegistryKey<Biome>> pickBand(double latNorm) {
        if (latNorm > 0.85) return polarBiomes;
        if (latNorm > 0.70) return taigaBiomes;
        if (latNorm > 0.55) return coldBiomes;
        if (latNorm > 0.35) return temperateBiomes;
        if (latNorm > 0.20) return subtropicalBiomes;
        return tropicalBiomes;
    }

    @Override
    protected Codec<? extends BiomeProvider> getBiomeProviderCodec() {
        // You can return a custom codec for data-driven configs later
        return Codec.unit(() -> new LatitudeBiomeProvider(WorldGenRegistries.BIOME));
    }

    @Override
    public BiomeProvider getBiomeProvider(long seed) {
        return new LatitudeBiomeProvider(biomeRegistry);
    }
}
