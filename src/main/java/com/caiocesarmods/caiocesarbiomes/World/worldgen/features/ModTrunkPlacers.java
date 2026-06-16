package com.caiocesarmods.caiocesarbiomes.World.worldgen.features;

import com.mojang.serialization.Codec;
import net.minecraft.world.gen.trunkplacer.AbstractTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.TrunkPlacerType;

public class ModTrunkPlacers {

    public static final TrunkPlacerType<BaobabTrunkPlacer> BAOBAB =
            register("baobab", BaobabTrunkPlacer.CODEC);

    private static <P extends AbstractTrunkPlacer> TrunkPlacerType<P> register(
            String name,
            Codec<P> codec) {

        return null;
    }
}

