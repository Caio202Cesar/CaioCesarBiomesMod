package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes;

import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

import static net.minecraftforge.common.BiomeDictionary.Type.*;

public class ModBiomeGeneration {
    public static void generateBiomes() {
        addBiome(MediterraneanConiferSavannaBiome.MEDITERRANEAN_CONIFER_SAVANNA.get(), BiomeManager.BiomeType.WARM, 26, HOT, SPARSE, DRY,
                SAVANNA, CONIFEROUS, LUSH);
        addBiome(OliveGroveBiome.OLIVE_GROVE.get(), BiomeManager.BiomeType.WARM, 13, HOT, SPARSE, DRY,
                SAVANNA, LUSH);
    }

    private static void addBiome(Biome biome, BiomeManager.BiomeType type, int weight, BiomeDictionary.Type... types) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(ForgeRegistries.Keys.BIOMES,
                Objects.requireNonNull(ForgeRegistries.BIOMES.getKey(biome)));

        BiomeDictionary.addTypes(key, types);
        BiomeManager.addBiome(type, new BiomeManager.BiomeEntry(key, weight));
    }
}

