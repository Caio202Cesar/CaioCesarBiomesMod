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
                            BiomeProvider.CODEC.fieldOf("biome_source")
                                    .forGetter(generator -> generator.biomeProvider),

                            DimensionStructuresSettings.field_236193_a_
                                    .forGetter(generator -> generator.func_235957_b_())
                    ).apply(
                            instance,
                            ModChunkGenerator::new
                    )
            );

    protected Codec<? extends ChunkGenerator> func_230347_a_() {
        return ModChunkGenerators.CAIO_CESAR;
    }

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
