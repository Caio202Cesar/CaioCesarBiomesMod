package com.caiocesarmods.caiocesarbiomes.World.worldgen.gen;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.*;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.settings.DimensionStructuresSettings;

public class LatitudeChunkGenerator extends ChunkGenerator {

    public static final Codec<LatitudeChunkGenerator> CODEC = RecordCodecBuilder.create(builder ->
            builder.group(
                    BiomeProvider.CODEC.fieldOf("biome_source").forGetter(g -> g.biomeProvider),
                    Codec.LONG.fieldOf("seed").forGetter(g -> g.seed)
            ).apply(builder, LatitudeChunkGenerator::new)
    );

    private final long seed;
    private final NoiseChunkGenerator delegate;   // <-- THIS WAS MISSING


    public LatitudeChunkGenerator(BiomeProvider biomeProvider, long seed) {
        // 1.16.5 ChunkGenerator constructor requires:
        // (BiomeProvider, DimensionStructuresSettings)
        super(biomeProvider, new DimensionStructuresSettings(true));

        this.seed = seed;

        // 1.16.5 NoiseChunkGenerator constructor:
        // (BiomeProvider, long seed, Supplier<DimensionSettings>)
        this.delegate = new NoiseChunkGenerator(
                biomeProvider,
                seed,
                () -> DimensionSettings.getDefaultDimensionSettings()  // OVERWORLD settings
        );
    }


    @Override
    protected Codec<? extends ChunkGenerator> func_230347_a_() {
        return CODEC;
    }


    @Override
    public ChunkGenerator func_230349_a_(long newSeed) {
        // Must use newSeed, not old seed
        return new LatitudeChunkGenerator(this.biomeProvider, newSeed);
    }


    @Override
    public void generateSurface(WorldGenRegion region, IChunk chunk) {
        delegate.generateSurface(region, chunk);
    }


    @Override
    public void func_230352_b_(IWorld world, StructureManager structureManager, IChunk chunk) {
        delegate.func_230352_b_(world, structureManager, chunk);
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