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
    private final long seed;

    // Cached biome lists by tag
    private final List<RegistryKey<Biome>> polarBiomes;
    private final List<RegistryKey<Biome>> taigaBiomes;
    private final List<RegistryKey<Biome>> coldBiomes;
    private final List<RegistryKey<Biome>> temperateBiomes;
    private final List<RegistryKey<Biome>> subtropicalBiomes;
    private final List<RegistryKey<Biome>> tropicalBiomes;

    // tunables
    private static final double LATITUDE_SCALE = 1.0 / 10000.0; // z * LATITUDE_SCALE -> normalized lat
    private static final double NOISE_SCALE = 1.0 / 2000.0; // noise sampling scale (coarser = bigger patches)
    private static final double NOISE_AMPLITUDE = 0.08; // how much noise shifts the normalized latitude

    public LatitudeBiomeProvider(Registry<Biome> registry, long seed) {
        // Provide full list to parent (required)
        super(registry.stream().collect(Collectors.toList()));
        this.biomeRegistry = registry;
        this.seed = seed;

        polarBiomes = getBiomesFromTag("caiocesarbiomes:polar");
        taigaBiomes = getBiomesFromTag("caiocesarbiomes:taiga");
        coldBiomes = getBiomesFromTag("caiocesarbiomes:cold_temperate");
        temperateBiomes = getBiomesFromTag("caiocesarbiomes:temperate");
        subtropicalBiomes = getBiomesFromTag("caiocesarbiomes:subtropical");
        tropicalBiomes = getBiomesFromTag("caiocesarbiomes:tropical");
    }

    // Convenience constructor used by codec fallback (keeps 0 seed)
    public LatitudeBiomeProvider(Registry<Biome> registry) {
        this(registry, 0L);
    }

    private List<RegistryKey<Biome>> getBiomesFromTag(String tagId) {
        ResourceLocation tagLoc = new ResourceLocation(tagId);

        ITagCollection<Biome> tagCollection =
                TagCollectionManager.getManager().getCustomTypeCollection(ForgeRegistries.BIOMES);

        ITag<Biome> tag = tagCollection.getTagByID(tagLoc);

        if (tag == null || tag.getAllElements().isEmpty()) {
            System.err.println("[LatitudeBiomeProvider] Warning: missing or empty biome tag " + tagId);
            return Collections.emptyList();
        }

        return tag.getAllElements().stream()
                .map(biome -> {
                    ResourceLocation key = ForgeRegistries.BIOMES.getKey(biome);
                    return RegistryKey.getOrCreateKey(Registry.BIOME_KEY, key);
                })
                .collect(Collectors.toList());
    }

    @Override
    public Biome getNoiseBiome(int x, int y, int z) {
        // Use z as "latitude" axis. Compute normalized latitude (0 = equator, 1 = pole).
        // Keep sign if you want hemisphere differences; use Math.abs if you want symmetry.
        double latNorm = Math.abs(z) * LATITUDE_SCALE; // optionally remove Math.abs for hemisphere
        // Add smooth noise to break straight lines
        double noise = smoothValueNoise(x * NOISE_SCALE, z * NOISE_SCALE, seed);
        double latWithNoise = latNorm + (noise * NOISE_AMPLITUDE);

        // pick band
        List<RegistryKey<Biome>> band = pickBand(latWithNoise);

        if (band.isEmpty()) {
            return biomeRegistry.getOrDefault(Biomes.PLAINS.getLocation());
        }

        // pick deterministic index based on x,z,seed so neighboring samples are coherent
        int idx = deterministicIndexForPos(x, z, seed, band.size());
        RegistryKey<Biome> chosen = band.get(idx);
        return biomeRegistry.getOrDefault(chosen.getLocation());
    }

    private int deterministicIndexForPos(int x, int z, long seed, int mod) {
        long hash = mix64((long)x * 341873128712L ^ (long)z * 132897987541L ^ seed);
        int idx = (int) (Math.floorMod(hash, mod));
        return idx;
    }

    // Simple smooth value noise (bilinear interpolation over a hashed grid)
    private double smoothValueNoise(double fx, double fz, long seed) {
        int x0 = floorToInt(fx);
        int z0 = floorToInt(fz);
        int x1 = x0 + 1;
        int z1 = z0 + 1;

        double sx = fx - x0;
        double sz = fz - z0;

        double n00 = hashToDouble(x0, z0, seed);
        double n10 = hashToDouble(x1, z0, seed);
        double n01 = hashToDouble(x0, z1, seed);
        double n11 = hashToDouble(x1, z1, seed);

        double ix0 = lerp(n00, n10, smoothstep(sx));
        double ix1 = lerp(n01, n11, smoothstep(sx));
        double value = lerp(ix0, ix1, smoothstep(sz));
        return value; // in range [-1,1]
    }

    private int floorToInt(double v) {
        int i = (int) Math.floor(v);
        return i;
    }

    private double smoothstep(double t) {
        // 3t^2 - 2t^3
        return t * t * (3.0 - 2.0 * t);
    }

    private double lerp(double a, double b, double t) {
        return a + t * (b - a);
    }

    // Convert lattice hashed value -> [-1,1]
    private double hashToDouble(int x, int z, long seed) {
        long h = x;
        h = h * 0x9E3779B97F4A7C15L + mix64((long) z ^ seed);
        long mixed = mix64(h);
        // take 53 bits mantissa into double
        double d = (double) (mixed >>> 11) / (double) (1L << 53);
        return d * 2.0 - 1.0;
    }

    // 64-bit mix, from SplitMix64
    private long mix64(long z) {
        z = (z ^ (z >>> 30)) * 0xBF58476D1CE4E5B9L;
        z = (z ^ (z >>> 27)) * 0x94D049BB133111EBL;
        z = z ^ (z >>> 31);
        return z;
    }

    private List<RegistryKey<Biome>> pickBand(double latNorm) {
        // latNorm expected to grow with distance from equator; adjust thresholds to taste
        if (latNorm > 0.85) return polarBiomes;
        if (latNorm > 0.70) return taigaBiomes;
        if (latNorm > 0.55) return coldBiomes;
        if (latNorm > 0.35) return temperateBiomes;
        if (latNorm > 0.20) return subtropicalBiomes;
        return tropicalBiomes;
    }

    @Override
    protected Codec<? extends BiomeProvider> getBiomeProviderCodec() {
        // Return a simple unit codec fallback. If you want data-driven, implement a Codec that includes seed/configs.
        return Codec.unit(() -> new LatitudeBiomeProvider(WorldGenRegistries.BIOME));
    }

    @Override
    public BiomeProvider getBiomeProvider(long seed) {
        // Create a new provider that uses the real world seed so selections are deterministic
        return new LatitudeBiomeProvider(biomeRegistry, seed);
    }
}
