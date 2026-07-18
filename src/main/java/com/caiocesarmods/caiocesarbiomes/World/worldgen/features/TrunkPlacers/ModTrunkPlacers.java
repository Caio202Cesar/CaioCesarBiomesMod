package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.TrunkPlacers;

import com.mojang.serialization.Codec;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.trunkplacer.AbstractTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.TrunkPlacerType;

import java.lang.reflect.Method;

public class ModTrunkPlacers {

    public static final TrunkPlacerType<BaobabTrunkPlacer> BAOBAB =
            Registry.register(
                    Registry.TRUNK_REPLACER,
                    "caiocesarbiomes:baobab_trunk",
                    new TrunkPlacerType<>(BaobabTrunkPlacer.CODEC)
            );

    public static final TrunkPlacerType<DesertRoseTrunkPlacer> DESERT_ROSE =
            Registry.register(
                    Registry.TRUNK_REPLACER,
                    "caiocesarbiomes:desert_rose_trunk",
                    new TrunkPlacerType<>(DesertRoseTrunkPlacer.CODEC)
            );

    public static final TrunkPlacerType<UmbrellaTrunkPlacer> UMBRELLA =
            Registry.register(
                    Registry.TRUNK_REPLACER,
                    "caiocesarbiomes:umbrella_trunk",
                    new TrunkPlacerType<>(UmbrellaTrunkPlacer.CODEC)
            );

    public static final TrunkPlacerType<AncientMetrosiderosTrunkPlacer> ANCIENT_METROSIDEROS =
            Registry.register(
                    Registry.TRUNK_REPLACER,
                    "caiocesarbiomes:ancient_metrosideros_trunk",
                    new TrunkPlacerType<>(AncientMetrosiderosTrunkPlacer.CODEC)
            );

    public static final TrunkPlacerType<CoastalLeaningTrunkPlacer> COASTAL_LEANING =
            Registry.register(
                    Registry.TRUNK_REPLACER,
                    "caiocesarbiomes:coastal_leaning_trunk",
                    new TrunkPlacerType<>(CoastalLeaningTrunkPlacer.CODEC)
            );

    public static final TrunkPlacerType<JapaneseBlackPineTrunkPlacer> JAPANESE_BLACK_PINE =
            Registry.register(
                    Registry.TRUNK_REPLACER,
                    "caiocesarbiomes:japanese_black_pine_trunk",
                    new TrunkPlacerType<>(JapaneseBlackPineTrunkPlacer.CODEC)
            );

    static {
        System.out.println("REGISTERING CUSTOM TRUNK PLACERS");
    }

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

