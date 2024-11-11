package com.caiocesarmods.caiocesarbiomes.World.worldgen.gen;

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
        addBiome(MediterraneanConiferSavannaBiome.MEDITERRANEAN_CONIFER_SAVANNA.get(), BiomeManager.BiomeType.WARM, 12, OVERWORLD, SPARSE, DRY,
                SAVANNA);

        addBiome(OliveGroveBiome.OLIVE_GROVE.get(), BiomeManager.BiomeType.WARM, 8, OVERWORLD, SPARSE, DRY, SAVANNA);

        addBiome(MediterraneanOakWoodlandBiome.MEDITERRANEAN_OAK_WOODLAND.get(), BiomeManager.BiomeType.WARM, 15,
                OVERWORLD, DRY, FOREST);

        addBiome(MediterraneanScrublandBiome.MEDITERRANEAN_SCRUBLAND.get(), BiomeManager.BiomeType.WARM, 14, OVERWORLD, SPARSE, DRY,
                SAVANNA);

        addBiome(OleanderGardensBiome.OLEANDER_GARDENS.get(), BiomeManager.BiomeType.WARM, 4, OVERWORLD,
                SPARSE, DRY, SAVANNA, RARE);

        addBiome(MediterraneanCorkOakSavanna.CORK_OAK_SAVANNA.get(), BiomeManager.BiomeType.WARM, 9, OVERWORLD, SPARSE, DRY,
                SAVANNA);

        addBiome(SubtropicalSeasonalForestBiome.SUBTROPICAL_SEASONAL_FOREST.get(), BiomeManager.BiomeType.WARM, 15, OVERWORLD, FOREST, LUSH, DENSE);

        addBiome(TropicalSeasonalForestBiome.TROPICAL_SEASONAL_FOREST.get(), BiomeManager.BiomeType.WARM, 11, OVERWORLD, HOT, FOREST, LUSH, DENSE);

        addBiome(SubtropicalLaurelForestBiome.SUBTROPICAL_LAUREL_FOREST.get(), BiomeManager.BiomeType.WARM, 7, OVERWORLD, FOREST, LUSH, DENSE);

        addBiome(SubtropicalLaurelJungleBiome.SUBTROPICAL_LAUREL_JUNGLE.get(), BiomeManager.BiomeType.WARM, 4, OVERWORLD, LUSH, DENSE, JUNGLE, WET, RARE);

        addBiome(CoastalSubtropicalDesertBiome.COAST_SUBTROPICAL_DESERT.get(), BiomeManager.BiomeType.DESERT, 3, OVERWORLD, SANDY, DRY, RARE, SPOOKY);

        addBiome(TropicalDesertBiome.TROPICAL_DESERT.get(), BiomeManager.BiomeType.DESERT, 10, OVERWORLD, SANDY, HOT, DRY, SANDY);

        addBiome(BambooSubtropicalLaurelJungleBiome.BAMBOO_SUBTROPICAL_LAUREL_JUNGLE.get(), BiomeManager.BiomeType.WARM, 2, OVERWORLD, LUSH,
                DENSE, JUNGLE, WET, RARE);

        addBiome(MontaneLaurelGroveBiome.MONTANE_LAUREL_GROVE.get(), BiomeManager.BiomeType.WARM, 4, OVERWORLD, SPARSE, MOUNTAIN,
                RARE, LUSH);

        addBiome(GravelTundraBiome.GRAVEL_TUNDRA.get(), BiomeManager.BiomeType.ICY, 10, OVERWORLD, COLD);

        addBiome(SahelBiome.SAHEL.get(), BiomeManager.BiomeType.DESERT, 13, OVERWORLD, HOT, DRY, SPARSE);

        addBiome(TropicalBeachBiome.TROPICAL_BEACH.get(), BiomeManager.BiomeType.WARM, 12, OVERWORLD, HOT, BEACH, SANDY);
    }

    private static void addBiome(Biome biome, BiomeManager.BiomeType type, int weight, BiomeDictionary.Type... types) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(ForgeRegistries.Keys.BIOMES,
                Objects.requireNonNull(ForgeRegistries.BIOMES.getKey(biome)));

        System.out.println("Registering biome: " + key);

        BiomeDictionary.addTypes(key, types);
        BiomeManager.addBiome(type, new BiomeManager.BiomeEntry(key, weight));
    }

}

