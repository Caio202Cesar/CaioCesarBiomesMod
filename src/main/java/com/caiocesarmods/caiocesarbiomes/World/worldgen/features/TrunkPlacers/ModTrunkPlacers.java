package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.TrunkPlacers;

import com.mojang.serialization.Codec;
import net.minecraft.world.gen.trunkplacer.AbstractTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.TrunkPlacerType;

import java.lang.reflect.Method;

public class ModTrunkPlacers {

    public static final TrunkPlacerType<BaobabTrunkPlacer> BAOBAB =
            new TrunkPlacerType<>(BaobabTrunkPlacer.CODEC);

    public static final TrunkPlacerType<DesertRoseTrunkPlacer> DESERT_ROSE =
            new TrunkPlacerType<>(DesertRoseTrunkPlacer.CODEC);

    private static <P extends AbstractTrunkPlacer> TrunkPlacerType<P> register(
            String name,
            Codec<P> codec) {
        try {
            Method m = TrunkPlacerType.class.getDeclaredMethod(
                    "register",
                    String.class,
                    Codec.class
            );
            m.setAccessible(true);

            return (TrunkPlacerType<P>) m.invoke(null, name, codec);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

