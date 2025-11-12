package com.caiocesarmods.caiocesarbiomes.World.worldgen.gen;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.LatitudeBiomeProvider;
import com.mojang.serialization.Codec;
import net.minecraft.util.registry.Registry;
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


    private final NoiseChunkGenerator delegate;
    private final Registry<Biome> biomeRegistry;
    private final long seed;

    public LatitudeChunkGenerator(Registry<Biome> biomeRegistry,
                                  Registry<DimensionSettings> dimensionSettingsRegistry,
                                  long seed) {
        // 1.16.5 requires DimensionStructuresSettings, not Supplier<DimensionSettings>
        super(new LatitudeBiomeProvider(biomeRegistry), new DimensionStructuresSettings(true));

        this.biomeRegistry = biomeRegistry;
        this.seed = seed;

        // Create the default overworld settings supplier
        Supplier<DimensionSettings> dimensionSettings =
                () -> dimensionSettingsRegistry.getOrThrow(DimensionSettings.OVERWORLD);

        // Create the delegate NoiseChunkGenerator (does the actual terrain generation)
        this.delegate = new NoiseChunkGenerator(
                new LatitudeBiomeProvider(biomeRegistry),
                seed,
                dimensionSettings
        );
    }

    // == Codec getter ==
    @Override
    protected Codec<? extends ChunkGenerator> func_230347_a_() {
        return Codec.unit(() -> this);
    }

    // == Return new instance for different seed ==
    @Override
    public ChunkGenerator func_230349_a_(long newSeed) {
        return new LatitudeChunkGenerator(biomeRegistry, null, newSeed);
    }

    // == Surface generation ==
    @Override
    public void generateSurface(WorldGenRegion region, IChunk chunk) {
        delegate.generateSurface(region, chunk);
    }

    // == Base terrain generation ==
    @Override
    public void func_230352_b_(IWorld world, StructureManager structureManager, IChunk chunk) {
        delegate.func_230352_b_(world, structureManager, chunk);
    }

    // == Height queries ==
    @Override
    public int getHeight(int x, int z, Heightmap.Type heightmapType) {
        return delegate.getHeight(x, z, heightmapType);
    }

    // == Block reader access ==
    @Override
    public IBlockReader func_230348_a_(int x, int z) {
        return delegate.func_230348_a_(x, z);
    }
}