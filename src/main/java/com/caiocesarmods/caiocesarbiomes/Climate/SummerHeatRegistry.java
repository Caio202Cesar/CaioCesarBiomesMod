package com.caiocesarmods.caiocesarbiomes.Climate;

import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.Biome;

import java.util.HashMap;
import java.util.Map;

public class SummerHeatRegistry {
    private static final Map<RegistryKey<Biome>, SummerHeat> MAP = new HashMap<>();

    public static void register(RegistryKey<Biome> biome, SummerHeat heat) {
        MAP.put(biome, heat);
    }

    public static SummerHeat get(RegistryKey<Biome> biome) {
        return MAP.getOrDefault(biome, SummerHeat.HOT);
    }
}
