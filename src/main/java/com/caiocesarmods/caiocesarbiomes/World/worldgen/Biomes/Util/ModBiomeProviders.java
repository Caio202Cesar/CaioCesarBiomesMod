package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryLookupCodec;

public class ModBiomeProviders {

    public static final Codec<ModBiomeProvider> CAIO_CESAR =
            RecordCodecBuilder.create(instance ->
                    instance.group(
                            RegistryLookupCodec
                                    .getLookUpCodec(Registry.BIOME_KEY)
                                    .fieldOf("biomes")
                                    .forGetter(ModBiomeProvider::getRegistry)
                    ).apply(
                            instance,
                            ModBiomeProvider::new
                    )
            );


    public static void register() {

        Registry.register(
                Registry.BIOME_PROVIDER_CODEC,
                new ResourceLocation(
                        CaioCesarBiomesMod.MOD_ID,
                        "caio_cesar"
                ),
                CAIO_CESAR
        );
    }
}
