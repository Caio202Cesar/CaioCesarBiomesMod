package com.caiocesarmods.caiocesarbiomes.World.worldgen.gen;

import com.mojang.serialization.Codec;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ITagCollection;
import net.minecraft.tags.TagCollectionManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryLookupCodec;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LatitudeBiomeProvider extends BiomeProvider {

    public static final Codec<LatitudeBiomeProvider> CODEC =
            RegistryLookupCodec.getLookUpCodec(Registry.BIOME_KEY)
                    .xmap(LatitudeBiomeProvider::new, p -> p.biomeRegistry)
                    .codec();

    private final Registry<Biome> biomeRegistry;

    // Tag IDs
    private static final ResourceLocation TROPICAL_ID      = new ResourceLocation("latitude", "tropical");
    private static final ResourceLocation SUBTROPIC_ID     = new ResourceLocation("latitude", "subtropical");
    private static final ResourceLocation TEMPERATE_ID     = new ResourceLocation("latitude", "temperate");
    private static final ResourceLocation COLD_TEMP_ID     = new ResourceLocation("latitude", "cold_temperate");
    private static final ResourceLocation TAIGA_ID         = new ResourceLocation("latitude", "taiga");
    private static final ResourceLocation POLAR_ID         = new ResourceLocation("latitude", "polar");

    // Cached biome lists
    private final List<Biome> tropicalBiomes;
    private final List<Biome> subtropicalBiomes;
    private final List<Biome> temperateBiomes;
    private final List<Biome> coldTemperateBiomes;
    private final List<Biome> taigaBiomes;
    private final List<Biome> polarBiomes;

    // -----------------------------------------------------------

    public LatitudeBiomeProvider(Registry<Biome> biomeRegistry) {
        super(biomeRegistry.stream().collect(Collectors.toList())); // required but unused in our logic
        this.biomeRegistry = biomeRegistry;

        // Load tags ONCE at construction:
        tropicalBiomes        = loadTagBiomes(TROPICAL_ID);
        subtropicalBiomes     = loadTagBiomes(SUBTROPIC_ID);
        temperateBiomes       = loadTagBiomes(TEMPERATE_ID);
        coldTemperateBiomes   = loadTagBiomes(COLD_TEMP_ID);
        taigaBiomes           = loadTagBiomes(TAIGA_ID);
        polarBiomes           = loadTagBiomes(POLAR_ID);
    }

    // -----------------------------------------------------------
    // Loads biomes from a tag for Forge 1.16.5
    // -----------------------------------------------------------

    private List<Biome> loadTagBiomes(ResourceLocation id) {
        ITagCollection<Biome> collection =
                TagCollectionManager.getManager()
                        .getCustomTypeCollection(ForgeRegistries.BIOMES);

        ITag<Biome> tag = collection.getTagByID(id);

        if (tag == null || tag.getAllElements().isEmpty()) {
            System.err.println("[Latitude] Warning: Missing or empty biome tag: " + id);
            return Collections.emptyList();
        }

        return tag.getAllElements();
    }

    // -----------------------------------------------------------
    // Latitude-based biome selection
    // -----------------------------------------------------------

    @Override
    public Biome getNoiseBiome(int x, int y, int z) {
        double lat = Math.abs(z) / 6000.0;  // 6k blocks equator → pole

        List<Biome> candidates;

        if (lat < 0.15)        candidates = tropicalBiomes;
        else if (lat < 0.30)   candidates = subtropicalBiomes;
        else if (lat < 0.55)   candidates = temperateBiomes;
        else if (lat < 0.75)   candidates = coldTemperateBiomes;
        else if (lat < 0.90)   candidates = taigaBiomes;
        else                   candidates = polarBiomes;

        return pickBiome(candidates, x, z);
    }

    private Biome pickBiome(List<Biome> list, int x, int z) {
        if (list == null || list.isEmpty())
            return biomeRegistry.getOrDefault(Biomes.OCEAN.getLocation());

        // Stable random based on world coords:
        long hash = (long)x * 341873128712L + (long)z * 132897987541L;
        int idx = (int)Math.floorMod(hash, list.size());
        return list.get(idx);
    }

    // -----------------------------------------------------------
    // Provider codec / seed
    // -----------------------------------------------------------

    @Override
    protected Codec<? extends BiomeProvider> getBiomeProviderCodec() {
        return CODEC;
    }

    @Override
    public BiomeProvider getBiomeProvider(long seed) {
        // Our biome distribution does NOT depend on seed
        return this;
    }
}
