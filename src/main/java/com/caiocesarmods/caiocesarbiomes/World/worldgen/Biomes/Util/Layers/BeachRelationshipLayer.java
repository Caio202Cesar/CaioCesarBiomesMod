package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.Layers;

import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.ICastleTransformer;

public enum BeachRelationshipLayer implements ICastleTransformer {

    INSTANCE;

    @Override
    public int apply(INoiseRandom random,
                     int north,
                     int west,
                     int south,
                     int east,
                     int center) {

        // Only process BEACH

        return center;
    }
}
