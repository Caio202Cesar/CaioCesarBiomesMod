package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.layers;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.INoiseRandom;

public class ModBiomeLayers {

    private ModBiomeLayers() {}

    public static void setup(Registry<Biome> registry) {

        CustomShoreLayer.INSTANCE.setup(registry);

    }

    public static int applyShore(
            INoiseRandom rand,
            int north,
            int east,
            int south,
            int west,
            int center) {

        return CustomShoreLayer.INSTANCE.apply(
                rand,
                north,
                east,
                south,
                west,
                center
        );
    }
}
