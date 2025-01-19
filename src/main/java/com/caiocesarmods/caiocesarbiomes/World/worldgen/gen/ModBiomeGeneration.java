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
                SAVANNA, CONIFEROUS);

        addBiome(OliveGroveBiome.OLIVE_GROVE.get(), BiomeManager.BiomeType.WARM, 8, OVERWORLD, SPARSE, DRY, SAVANNA);

        addBiome(MediterraneanOakWoodlandBiome.MEDITERRANEAN_OAK_WOODLAND.get(), BiomeManager.BiomeType.WARM, 15, DRY, DENSE,
                OVERWORLD);

        addBiome(MediterraneanScrublandBiome.MEDITERRANEAN_SCRUBLAND.get(), BiomeManager.BiomeType.WARM, 14, OVERWORLD, SPARSE, DRY,
                SAVANNA);

        addBiome(OleanderGardensBiome.OLEANDER_GARDENS.get(), BiomeManager.BiomeType.WARM, 4, OVERWORLD,
                SPARSE, DRY, SAVANNA, RARE);

        addBiome(CorkOakSavannaBiome.CORK_OAK_SAVANNA.get(), BiomeManager.BiomeType.WARM, 9, OVERWORLD, SPARSE, DRY,
                SAVANNA);

        addBiome(SubtropicalSeasonalForestBiome.SUBTROPICAL_SEASONAL_FOREST.get(), BiomeManager.BiomeType.WARM, 15, OVERWORLD, FOREST, LUSH, DENSE);

        addBiome(SubtropicalSeasonalForestHillsBiome.SUBTROPICAL_SEASONAL_FOREST_HILLS.get(), BiomeManager.BiomeType.WARM, 15, OVERWORLD, FOREST,
                LUSH, DENSE, HILLS);

        addBiome(TropicalSeasonalForestBiome.TROPICAL_SEASONAL_FOREST.get(), BiomeManager.BiomeType.DESERT, 11, OVERWORLD, HOT, FOREST, LUSH, DENSE);

        addBiome(SubtropicalLaurelForestBiome.SUBTROPICAL_LAUREL_FOREST.get(), BiomeManager.BiomeType.WARM, 7, OVERWORLD, FOREST, LUSH, DENSE);

        addBiome(SubtropicalLaurelJungleBiome.SUBTROPICAL_LAUREL_JUNGLE.get(), BiomeManager.BiomeType.WARM, 4, OVERWORLD, LUSH, DENSE, JUNGLE, WET, RARE);

        addBiome(CoastalSubtropicalDesertBiome.COAST_SUBTROPICAL_DESERT.get(), BiomeManager.BiomeType.DESERT, 3, OVERWORLD, SANDY, DRY, RARE, SPOOKY);

        addBiome(TropicalDesertBiome.TROPICAL_DESERT.get(), BiomeManager.BiomeType.DESERT, 10, OVERWORLD, SANDY, HOT, DRY, SANDY);

        addBiome(BambooSubtropicalLaurelJungleBiome.BAMBOO_SUBTROPICAL_LAUREL_JUNGLE.get(), BiomeManager.BiomeType.WARM, 2, OVERWORLD, LUSH,
                DENSE, JUNGLE, WET, RARE);

        addBiome(MontaneLaurelGroveBiome.MONTANE_LAUREL_GROVE.get(), BiomeManager.BiomeType.WARM, 4, OVERWORLD, SPARSE, MOUNTAIN,
                RARE, LUSH, HILLS);

        addBiome(GravelTundraBiome.GRAVEL_TUNDRA.get(), BiomeManager.BiomeType.ICY, 10, OVERWORLD, COLD, DRY);

        addBiome(TussockTundraBiome.TUSSOCK_TUNDRA.get(), BiomeManager.BiomeType.ICY, 8, OVERWORLD, COLD, WET);

        addBiome(SahelBiome.SAHEL.get(), BiomeManager.BiomeType.DESERT, 13, OVERWORLD, HOT, DRY, SPARSE);

        addBiome(EucalyptusSahelBiome.EUCALYPTUS_SAHEL.get(), BiomeManager.BiomeType.DESERT, 13, OVERWORLD, HOT, DRY, SPARSE);

        addBiome(TropicalBeachBiome.TROPICAL_BEACH.get(), BiomeManager.BiomeType.DESERT, 12, OVERWORLD, HOT, BEACH, SANDY);

        addBiome(SubtropicalCoastalBeachBiome.SUBTROPICAL_COASTAL_BEACH.get(), BiomeManager.BiomeType.WARM, 4, OVERWORLD, BEACH, SANDY, RARE);

        addBiome(JapaneseMapleGroveBiome.JAPANESE_MAPLE_GROVE.get(), BiomeManager.BiomeType.COOL, 4, OVERWORLD, FOREST, LUSH, RARE);

        addBiome(HemiborealForestBiome.HEMIBOREAL_FOREST.get(), BiomeManager.BiomeType.COOL, 15, OVERWORLD, FOREST, LUSH, COLD);

        addBiome(TropicalEucalyptusDryForestBiome.TROPICAL_EUCALYPTUS_DRY_FOREST.get(), BiomeManager.BiomeType.DESERT, 8, OVERWORLD, FOREST, HOT, DRY, DENSE);

        addBiome(SubtropicalEucalyptusDryForestBiome.SUBTROPICAL_EUCALYPTUS_DRY_FOREST.get(), BiomeManager.BiomeType.WARM, 12, OVERWORLD, FOREST, DRY, DENSE);

        addBiome(EucalyptusPlainsBiome.EUCALYPTUS_PLAINS.get(), BiomeManager.BiomeType.WARM, 15, OVERWORLD, PLAINS, DRY, SPARSE);

        addBiome(HotMediterraneanBeachBiome.HOT_MEDITERRANEAN_BEACH.get(), BiomeManager.BiomeType.WARM, 10, OVERWORLD, BEACH, SANDY);

        addBiome(HumidSubtropicalBeachBiome.HUMID_SUBTROPICAL_BEACH.get(), BiomeManager.BiomeType.WARM, 12, OVERWORLD, BEACH, SANDY, WET, LUSH);

        addBiome(SouthernBeechForestBiome.SOUTHERN_BEECH_FOREST.get(), BiomeManager.BiomeType.ICY, 7, OVERWORLD, COLD, FOREST, WET, DENSE, LUSH);

        addBiome(LushSouthernTundraBiome.LUSH_SOUTHERN_TUNDRA.get(), BiomeManager.BiomeType.ICY, 8, OVERWORLD, COLD, WET, LUSH);

        addBiome(DryTropicalBeachBiome.DRY_TROPICAL_BEACH.get(), BiomeManager.BiomeType.DESERT, 14, OVERWORLD, HOT, BEACH, DRY, SANDY);

        addBiome(StonyMediterraneanShoreBiome.STONY_MEDITERRANEAN_SHORE.get(), BiomeManager.BiomeType.WARM, 9, OVERWORLD, BEACH);

        addBiome(CookPineIslandBiome.COOK_PINE_ISLAND.get(), BiomeManager.BiomeType.DESERT, 4, HOT, OVERWORLD, SAVANNA, RARE);

        addBiome(PewenConiferousGrove.PEWEN_CONIFEROUS_GROVE.get(), BiomeManager.BiomeType.COOL, 8, COLD, OVERWORLD, MOUNTAIN, CONIFEROUS);

        addBiome(HemiborealSteppeBiome.HEMIBOREAL_STEPPE.get(), BiomeManager.BiomeType.COOL, 12, COLD, OVERWORLD, DRY, PLAINS, SPARSE);

        addBiome(MonsoonFicusTropicalForest.MONSOON_FICUS_FOREST.get(), BiomeManager.BiomeType.DESERT, 10, OVERWORLD, HOT, FOREST, WET, LUSH, DENSE);

        addBiome(TemperateRainforest.TEMPERATE_RAINFOREST.get(), BiomeManager.BiomeType.COOL, 15, OVERWORLD, COLD, CONIFEROUS, WET, LUSH, DENSE, FOREST);

    }

    private static void addBiome(Biome biome, BiomeManager.BiomeType type, int weight, BiomeDictionary.Type... types) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(ForgeRegistries.Keys.BIOMES,
                Objects.requireNonNull(ForgeRegistries.BIOMES.getKey(biome)));

        System.out.println("Registering biome: " + key);

        BiomeDictionary.addTypes(key, types);
        BiomeManager.addBiome(type, new BiomeManager.BiomeEntry(key, weight));
    }

}

