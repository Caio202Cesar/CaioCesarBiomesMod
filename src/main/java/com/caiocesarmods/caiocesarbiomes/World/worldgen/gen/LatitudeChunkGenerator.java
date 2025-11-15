package com.caiocesarmods.caiocesarbiomes.World.worldgen.gen;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.LatitudeBiomeProvider;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryLookupCodec;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.*;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.settings.DimensionStructuresSettings;

import java.util.function.Supplier;

public class LatitudeChunkGenerator extends ChunkGenerator {

    public static final Codec<LatitudeChunkGenerator> CODEC =
            RecordCodecBuilder.create(builder -> builder.group(
                    RegistryLookupCodec.getLookUpCodec(Registry.BIOME_KEY).forGetter(g -> g.biomeRegistry),
                    RegistryLookupCodec.getLookUpCodec(Registry.NOISE_SETTINGS_KEY).forGetter(g -> g.dimensionRegistry),
                    Codec.LONG.fieldOf("seed").forGetter(g -> g.seed)
            ).apply(builder, LatitudeChunkGenerator::new));

    private final Registry<Biome> biomeRegistry;
    private final Registry<DimensionSettings> dimensionRegistry;
    private final long seed;

    private final NoiseChunkGenerator delegate;

    public LatitudeChunkGenerator(
            Registry<Biome> biomeRegistry,
            Registry<DimensionSettings> dimensionRegistry,
            long seed
    ) {
        super(new LatitudeBiomeProvider(biomeRegistry),
                new DimensionStructuresSettings(true));

        this.biomeRegistry = biomeRegistry;
        this.dimensionRegistry = dimensionRegistry;
        this.seed = seed;

        // Use overworld noise settings
        Supplier<DimensionSettings> dimSettings =
                () -> dimensionRegistry.getOrThrow(DimensionSettings.OVERWORLD);

        // Create Vanilla terrain generator inside
        this.delegate = new NoiseChunkGenerator(
                getBiomeProvider(),
                seed,
                dimSettings
        );
    }

    @Override
    protected Codec<? extends ChunkGenerator> func_230347_a_() {
        return CODEC;
    }

    @Override
    public ChunkGenerator func_230349_a_(long newSeed) {
        return new LatitudeChunkGenerator(biomeRegistry, dimensionRegistry, newSeed);
    }

    @Override
    public void generateSurface(WorldGenRegion region, IChunk chunk) {
        delegate.generateSurface(region, chunk);
    }

    @Override
    public void func_230352_b_(IWorld world, StructureManager structures, IChunk chunk) {
        delegate.func_230352_b_(world, structures, chunk);
    }

    @Override
    public int getHeight(int x, int z, Heightmap.Type heightmapType) {
        return delegate.getHeight(x, z, heightmapType);
    }

    @Override
    public IBlockReader func_230348_a_(int x, int z) {
        return delegate.func_230348_a_(x, z);
    }
}