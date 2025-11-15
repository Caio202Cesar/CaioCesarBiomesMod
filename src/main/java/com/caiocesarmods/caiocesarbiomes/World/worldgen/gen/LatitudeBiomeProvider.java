package com.caiocesarmods.caiocesarbiomes.World.worldgen.gen;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.Codec;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ITagCollection;
import net.minecraft.tags.ITagCollectionSupplier;
import net.minecraft.tags.TagCollectionManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.gen.SimplexNoiseGenerator;
import net.minecraftforge.registries.ForgeRegistries;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class LatitudeBiomeProvider extends BiomeProvider {

    private final long seed;

    private final List<Biome> polarBiomes;
    private final List<Biome> taigaBiomes;
    private final List<Biome> coldBiomes;
    private final List<Biome> temperateBiomes;
    private final List<Biome> warmBiomes;
    private final List<Biome> tropicalBiomes;

    private final SimplexNoiseGenerator latitudeNoise;
    private final Gson gson = new Gson();

    public static final Codec<LatitudeBiomeProvider> CODEC =
            Codec.LONG.fieldOf("seed").xmap(LatitudeBiomeProvider::new, p -> p.seed).codec();

    public LatitudeBiomeProvider(long seed) {
        // super expects a Collection<Biome> of possible biomes — use all known biomes
        super(new ArrayList<>(ForgeRegistries.BIOMES.getValues()));
        this.seed = seed;

        // load from mod resources (data/<modid>/tags/worldgen/biome/<name>.json)
        this.polarBiomes     = loadTagBiomes("caiocesarbiomes:polar");
        this.taigaBiomes      = loadTagBiomes("caiocesarbiomes:taiga");
        this.coldBiomes      = loadTagBiomes("caiocesarbiomes:cold_temperate");
        this.temperateBiomes = loadTagBiomes("caiocesarbiomes:temperate");
        this.warmBiomes      = loadTagBiomes("caiocesarbiomes:subtropical");
        this.tropicalBiomes  = loadTagBiomes("caiocesarbiomes:tropical");

        this.latitudeNoise = new SimplexNoiseGenerator(new Random(seed));
    }

    /**
     * Tries to load tag JSON from classpath resource:
     * /data/<namespace>/tags/worldgen/biome/<path>.json
     *
     * Supports nested tags (values that start with '#namespace:tagname').
     */
    private List<Biome> loadTagBiomes(String tagId) {
        Set<ResourceLocation> seenTags = new HashSet<>();
        Set<ResourceLocation> biomeIds = new LinkedHashSet<>(); // keep order; avoid duplicates
        resolveTagRecursive(tagId, seenTags, biomeIds);

        List<Biome> biomes = new ArrayList<>();
        for (ResourceLocation loc : biomeIds) {
            Biome b = ForgeRegistries.BIOMES.getValue(loc);
            if (b != null) biomes.add(b);
        }
        return biomes;
    }

    private void resolveTagRecursive(String tagId, Set<ResourceLocation> seenTags, Set<ResourceLocation> outBiomeIds) {
        ResourceLocation tagRL = new ResourceLocation(tagId);
        if (seenTags.contains(tagRL)) return; // avoid cycles
        seenTags.add(tagRL);

        // build resource path: data/<namespace>/tags/worldgen/biome/<path>.json
        String namespace = tagRL.getNamespace();
        String path = tagRL.getPath();
        String resourcePath = String.format("data/%s/tags/worldgen/biome/%s.json", namespace, path);

        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(resourcePath);
        if (is == null) {
            // try class' classloader as fallback
            is = LatitudeBiomeProvider.class.getResourceAsStream("/" + resourcePath);
        }
        if (is == null) {
            // not found in JAR — silently return (you can log)
            return;
        }

        try (BufferedReader r = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
            JsonObject obj = gson.fromJson(r, JsonObject.class);
            if (obj == null) return;

            // values array can contain entries like "minecraft:plains" or "#mod:othertag"
            if (obj.has("values") && obj.get("values").isJsonArray()) {
                JsonArray arr = obj.getAsJsonArray("values");
                for (JsonElement e : arr) {
                    if (!e.isJsonPrimitive()) continue;
                    String s = e.getAsString().trim();
                    if (s.isEmpty()) continue;

                    if (s.startsWith("#")) {
                        // nested tag: "#namespace:othertag" or "#othertag" (default namespace)
                        String nested = s.substring(1);
                        // if nested has no namespace, assume same namespace as parent tag
                        if (!nested.contains(":")) {
                            nested = namespace + ":" + nested;
                        }
                        resolveTagRecursive(nested, seenTags, outBiomeIds);
                    } else {
                        // biome entry
                        ResourceLocation biomeRL = new ResourceLocation(s);
                        outBiomeIds.add(biomeRL);
                    }
                }
            }
        } catch (Exception ex) {
            // silent fail — you can log with your logger
            ex.printStackTrace();
        }
    }

    @Override
    public Biome getNoiseBiome(int x, int y, int z) {
        double raw = latitudeNoise.getValue(x * 0.001, z * 0.001);
        double lat = MathHelper.clamp(raw, -1.0, 1.0);

        if (lat < -0.6) return chooseFrom(polarBiomes);
        if (lat < -0.4) return chooseFrom(taigaBiomes);
        if (lat < -0.2) return chooseFrom(coldBiomes);
        if (lat <  0.2) return chooseFrom(temperateBiomes);
        if (lat <  0.6) return chooseFrom(warmBiomes);
        return chooseFrom(tropicalBiomes);
    }

    private Biome chooseFrom(List<Biome> pool) {
        if (pool == null || pool.isEmpty()) {
            return ForgeRegistries.BIOMES.getValue(new ResourceLocation("minecraft:plains"));
        }
        // deterministic selection based on seed and position
        int idx = (int) (Math.abs(seed ^ pool.size()) % pool.size());
        return pool.get(idx);
    }

    @Override
    protected Codec<? extends BiomeProvider> getBiomeProviderCodec() {
        return CODEC;
    }

    @Override
    public BiomeProvider getBiomeProvider(long seed) {
        return new LatitudeBiomeProvider(seed);
    }
}