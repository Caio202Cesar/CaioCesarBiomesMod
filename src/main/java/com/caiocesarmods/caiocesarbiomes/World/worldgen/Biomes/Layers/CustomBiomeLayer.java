package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Layers;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.BiomeDefinition;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.ModBiomeRegistry;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.IC0Transformer;

public enum CustomBiomeLayer implements IC0Transformer {
    INSTANCE;

    @Override
    public int apply(INoiseRandom context, int value) {

        BiomeDefinition definition = ModBiomeRegistry.byId(value);

        if (definition == null) {
            return value;
        }

        // choose variant...

        return value;
    }
}
