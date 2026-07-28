package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate.BiomeClimate;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;

public final class VanillaBiomeTweaks {

    private VanillaBiomeTweaks() {}

    public static void apply(RegistryKey<Biome> key, Biome biome) {

        BiomeClimate climate =
                (BiomeClimate)(Object) biome;

        BiomeAccessor accessor =
                (BiomeAccessor)(Object) biome;

        if (key == Biomes.DESERT) {

            climate.setSummerBaseTemperature(2.7F);

            accessor.setTemperature(2.2F);
            accessor.setDownfall(0.0F);
            accessor.setPrecipitation(Biome.RainType.NONE);

        }

        else if (key == Biomes.BEACH) {

            climate.setSummerBaseTemperature(1.5F);

            accessor.setTemperature(1.1F);

        }

        else if (key == Biomes.SWAMP) {

            climate.setSummerBaseTemperature(1.8F);

            accessor.setDownfall(1.0F);

        }
    }
}
