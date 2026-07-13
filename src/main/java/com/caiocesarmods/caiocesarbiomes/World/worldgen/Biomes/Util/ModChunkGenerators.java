package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.settings.DimensionStructuresSettings;

public class ModChunkGenerators {

    public static final Codec<ModChunkGenerator> CAIO_CESAR =
            RecordCodecBuilder.create(instance ->
                    instance.group(
                            BiomeProvider.CODEC
                                    .fieldOf("biome_source")
                                    .forGetter(ChunkGenerator::getBiomeProvider),

                            DimensionStructuresSettings.field_236190_a_.fieldOf("settings")
                                    .forGetter(ModChunkGenerator::getStructureSettings)

                    ).apply(
                            instance,
                            ModChunkGenerator::new
                    )
            );


    public static void register() {

        Registry.register(
                Registry.CHUNK_GENERATOR_CODEC,
                new ResourceLocation(
                        CaioCesarBiomesMod.MOD_ID,
                        "caio_cesar"
                ),
                CAIO_CESAR
        );
    }
}
