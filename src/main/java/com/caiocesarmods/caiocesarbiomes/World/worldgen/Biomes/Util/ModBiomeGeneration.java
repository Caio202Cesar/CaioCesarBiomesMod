package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.*;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

import static net.minecraftforge.common.BiomeDictionary.Type.*;

public class ModBiomeGeneration {
    public static void generateBiomes() {
        addBiome(MediterraneanConiferSavannaBiome.MEDITERRANEAN_CONIFER_SAVANNA.get(), BiomeManager.BiomeType.WARM, 26, OVERWORLD, SPARSE, DRY,
                SAVANNA, CONIFEROUS);

        addBiome(OliveGroveBiome.OLIVE_GROVE.get(), BiomeManager.BiomeType.WARM, 13, OVERWORLD, SPARSE, DRY, SAVANNA);

        addBiome(MediterraneanOakWoodlandBiome.MEDITERRANEAN_OAK_WOODLAND.get(), BiomeManager.BiomeType.WARM, 50,
                OVERWORLD, DRY, SPARSE, FOREST);

        addBiome(MediterraneanFruitingScrublandBiome.MEDITERRANEAN_FRUITING_SCRUBLAND.get(), BiomeManager.BiomeType.WARM, 26, OVERWORLD, SPARSE, DRY,
                SAVANNA);

        addBiome(OleanderGardensBiome.OLEANDER_GARDENS.get(), BiomeManager.BiomeType.WARM, 9, OVERWORLD,
                SPARSE, DRY, SAVANNA);

        addBiome(MediterraneanCorkOakSavanna.CORK_OAK_SAVANNA.get(), BiomeManager.BiomeType.WARM, 20, OVERWORLD, SPARSE, DRY,
                SAVANNA);

        addBiome(SubtropicalSeasonalForestBiome.SUBTROPICAL_SEASONAL_FOREST.get(), BiomeManager.BiomeType.WARM, 30, OVERWORLD, FOREST, LUSH, DENSE);

        addBiome(TropicalSeasonalForestBiome.TROPICAL_SEASONAL_FOREST.get(), BiomeManager.BiomeType.WARM, 30, OVERWORLD, HOT, FOREST, LUSH, DENSE);

        addBiome(SubtropicalLaurelForestBiome.SUBTROPICAL_LAUREL_FOREST.get(), BiomeManager.BiomeType.WARM, 20, OVERWORLD, FOREST, LUSH, DENSE);

        addBiome(SubtropicalLaurelJungleBiome.SUBTROPICAL_LAUREL_JUNGLE.get(), BiomeManager.BiomeType.WARM, 9, OVERWORLD, FOREST, LUSH, WET, DENSE, JUNGLE, RARE);

        addBiome(CoastalSubtropicalDesertBiome.COAST_SUBTROPICAL_DESERT.get(), BiomeManager.BiomeType.DESERT, 6, OVERWORLD, SANDY, DRY, RARE, SPOOKY);

        addBiome(TropicalDesertBiome.TROPICAL_DESERT.get(), BiomeManager.BiomeType.DESERT_LEGACY, 27, OVERWORLD, SANDY, HOT, DRY, RARE);
    }

    private static void addBiome(Biome biome, BiomeManager.BiomeType type, int weight, BiomeDictionary.Type... types) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(ForgeRegistries.Keys.BIOMES,
                Objects.requireNonNull(ForgeRegistries.BIOMES.getKey(biome)));

        BiomeDictionary.addTypes(key, types);
        BiomeManager.addBiome(type, new BiomeManager.BiomeEntry(key, weight));
    }
}

