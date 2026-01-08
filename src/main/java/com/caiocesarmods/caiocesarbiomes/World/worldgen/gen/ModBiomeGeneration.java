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
        addBiome(MediterraneanConiferSavannaBiome.MEDITERRANEAN_CONIFER_SAVANNA.get(), BiomeManager.BiomeType.WARM, 25, OVERWORLD, SPARSE, CONIFEROUS);

        addBiome(OliveGroveBiome.OLIVE_GROVE.get(), BiomeManager.BiomeType.WARM, 23, OVERWORLD, SPARSE);

        addBiome(MediterraneanOakWoodlandBiome.MEDITERRANEAN_OAK_WOODLAND.get(), BiomeManager.BiomeType.WARM, 25, DENSE,
                OVERWORLD);

        addBiome(MediterraneanScrublandBiome.MEDITERRANEAN_SCRUBLAND.get(), BiomeManager.BiomeType.WARM, 25, OVERWORLD, SPARSE);

        addBiome(OleanderGardensBiome.OLEANDER_GARDENS.get(), BiomeManager.BiomeType.WARM, 20, OVERWORLD,
                SPARSE);

        addBiome(CorkOakSavannaBiome.CORK_OAK_SAVANNA.get(), BiomeManager.BiomeType.WARM, 25, OVERWORLD, SPARSE, DRY,
                SAVANNA);

        addBiome(SubtropicalSeasonalForestBiome.SUBTROPICAL_SEASONAL_FOREST.get(), BiomeManager.BiomeType.WARM, 25, OVERWORLD, FOREST, LUSH, DENSE);

        addBiome(BunyaPineSubtropicalSeasonalForestBiome.BUNYA_PINE_SUBTROPICAL_SEASONAL_FOREST.get(), BiomeManager.BiomeType.WARM, 12, OVERWORLD, FOREST,
                LUSH, DENSE, CONIFEROUS);
        addBiome(SubtropicalLaurelForestBiome.SUBTROPICAL_LAUREL_FOREST.get(), BiomeManager.BiomeType.WARM, 25, OVERWORLD, FOREST, LUSH, DENSE);

        addBiome(SubtropicalLaurelJungleBiome.SUBTROPICAL_LAUREL_JUNGLE.get(), BiomeManager.BiomeType.WARM, 20, OVERWORLD, LUSH, DENSE, JUNGLE, WET);

        addBiome(BunyaPineSubtropicalLaurelForestBiome.BUNYA_PINE_SUBTROPICAL_LAUREL_FOREST.get(), BiomeManager.BiomeType.WARM, 12, OVERWORLD, FOREST, LUSH, DENSE, CONIFEROUS);

        addBiome(BunyaPineSubtropicalLaurelJungleBiome.BUNYA_PINE_SUBTROPICAL_LAUREL_JUNGLE.get(), BiomeManager.BiomeType.WARM, 12, OVERWORLD, LUSH, DENSE, JUNGLE, WET, CONIFEROUS);

        addBiome(BambooSubtropicalLaurelJungleBiome.BAMBOO_SUBTROPICAL_LAUREL_JUNGLE.get(), BiomeManager.BiomeType.WARM, 3, OVERWORLD, LUSH,
                DENSE, JUNGLE, WET, RARE);

        addBiome(TropicalSeasonalForestBiome.TROPICAL_SEASONAL_FOREST.get(), BiomeManager.BiomeType.DESERT, 25, OVERWORLD, HOT, FOREST, LUSH, DENSE);

        addBiome(CoastalSubtropicalDesertBiome.COAST_SUBTROPICAL_DESERT.get(), BiomeManager.BiomeType.DESERT, 20, OVERWORLD, SANDY, DRY, SPOOKY);

        addBiome(CoastalSubtropicalDesertLomas.COAST_SUBTROPICAL_DESERT_LOMAS.get(), BiomeManager.BiomeType.DESERT, 17, OVERWORLD, DRY, LUSH);

        addBiome(MontaneLaurelGroveBiome.MONTANE_LAUREL_GROVE.get(), BiomeManager.BiomeType.WARM, 20, OVERWORLD, SPARSE, MOUNTAIN, LUSH, HILLS);

        addBiome(SubtropicalExtremeHillsBiome.SUBTROPICAL_EXTREME_HILLS.get(), BiomeManager.BiomeType.WARM, 20, OVERWORLD, SPARSE, MOUNTAIN, LUSH, HILLS);

        addBiome(GravelTundraBiome.GRAVEL_TUNDRA.get(), BiomeManager.BiomeType.ICY, 25, OVERWORLD, COLD, DRY);

        addBiome(TussockTundraBiome.TUSSOCK_TUNDRA.get(), BiomeManager.BiomeType.ICY, 25, OVERWORLD, COLD, WET);

        addBiome(SahelBiome.SAHEL.get(), BiomeManager.BiomeType.DESERT, 25, OVERWORLD, HOT, DRY, SPARSE);

        addBiome(EucalyptusSahelBiome.EUCALYPTUS_SAHEL.get(), BiomeManager.BiomeType.DESERT, 4, OVERWORLD, HOT, DRY, SPARSE, RARE);

        addBiome(SocotraTropicalDryland.SOCOTRA_DRYLAND.get(), BiomeManager.BiomeType.DESERT, 10, OVERWORLD, HOT, DRY, SPARSE, RARE);

        addBiome(TropicalBeachBiome.TROPICAL_BEACH.get(), BiomeManager.BiomeType.DESERT, 25, OVERWORLD, HOT, BEACH, SANDY);

        addBiome(JapaneseMapleGroveBiome.JAPANESE_MAPLE_GROVE.get(), BiomeManager.BiomeType.COOL, 20, OVERWORLD, FOREST, LUSH);

        addBiome(HemiborealForestBiome.HEMIBOREAL_FOREST.get(), BiomeManager.BiomeType.COOL, 25, OVERWORLD, COLD);

        addBiome(TropicalEucalyptusDryForestBiome.TROPICAL_EUCALYPTUS_DRY_FOREST.get(), BiomeManager.BiomeType.DESERT, 23, OVERWORLD, FOREST, HOT, DRY, DENSE);

        addBiome(EucalyptusSavanna.EUCALYPTUS_SAVANNA.get(), BiomeManager.BiomeType.DESERT, 3, OVERWORLD, SAVANNA, HOT, DRY, SPARSE, RARE);

        addBiome(SubtropicalEucalyptusDryForestBiome.SUBTROPICAL_EUCALYPTUS_DRY_FOREST.get(), BiomeManager.BiomeType.WARM, 23, OVERWORLD, FOREST, DRY, DENSE);

        addBiome(SubtropicalPineDryForestBiome.SUBTROPICAL_PINE_DRY_FOREST.get(), BiomeManager.BiomeType.WARM, 20, OVERWORLD, FOREST, DRY, DENSE);

        addBiome(EucalyptusPlainsBiome.EUCALYPTUS_PLAINS.get(), BiomeManager.BiomeType.WARM, 25, OVERWORLD, PLAINS, SPARSE);

        addBiome(HotMediterraneanBeachBiome.HOT_MEDITERRANEAN_BEACH.get(), BiomeManager.BiomeType.WARM, 25, OVERWORLD, BEACH, SANDY);

        addBiome(MediterraneanConiferSavannaBiomeBeach.MEDITERRANEAN_CONIFER_SAVANNA_BEACH.get(), BiomeManager.BiomeType.WARM, 25, OVERWORLD, BEACH, SANDY);

        addBiome(HumidSubtropicalBeachBiome.HUMID_SUBTROPICAL_BEACH.get(), BiomeManager.BiomeType.WARM, 25, OVERWORLD, BEACH, SANDY, WET, LUSH);

        addBiome(SouthernBeechForestBiome.SOUTHERN_BEECH_FOREST.get(), BiomeManager.BiomeType.ICY, 20, OVERWORLD, COLD);

        addBiome(LushSouthernTundraBiome.LUSH_SOUTHERN_TUNDRA.get(), BiomeManager.BiomeType.ICY, 20, OVERWORLD, COLD);

        addBiome(DryTropicalBeachBiome.DRY_TROPICAL_BEACH.get(), BiomeManager.BiomeType.DESERT, 25, OVERWORLD, HOT, BEACH, DRY, SANDY);

        addBiome(TropicalDesertBiome.TROPICAL_DESERT.get(), BiomeManager.BiomeType.DESERT, 25, OVERWORLD, HOT, DRY, SANDY);

        addBiome(TemperateDesert.TEMPERATE_DESERT.get(), BiomeManager.BiomeType.COOL, 23, OVERWORLD, DRY, SANDY);

        addBiome(StonyMediterraneanShoreBiome.STONY_MEDITERRANEAN_SHORE.get(), BiomeManager.BiomeType.WARM, 20, OVERWORLD, BEACH);

        addBiome(CookPineIslandBiome.COOK_PINE_ISLAND.get(), BiomeManager.BiomeType.DESERT, 20, HOT, OVERWORLD, SAVANNA);

        addBiome(PewenConiferousGrove.PEWEN_CONIFEROUS_GROVE.get(), BiomeManager.BiomeType.COOL, 25, OVERWORLD, MOUNTAIN, CONIFEROUS);

        addBiome(HemiborealSteppeBiome.HEMIBOREAL_STEPPE.get(), BiomeManager.BiomeType.COOL, 20, COLD, OVERWORLD);

        addBiome(MonsoonFicusTropicalForest.MONSOON_FICUS_FOREST.get(), BiomeManager.BiomeType.DESERT, 25, OVERWORLD, HOT, FOREST, JUNGLE, WET, LUSH, DENSE);

        addBiome(TemperateRainforest.TEMPERATE_RAINFOREST.get(), BiomeManager.BiomeType.COOL, 25, OVERWORLD, FOREST, LUSH);

        addBiome(TropicalBambooMarsh.TROPICAL_BAMBOO_MARSH.get(), BiomeManager.BiomeType.DESERT, 20, HOT, OVERWORLD, WET, DENSE, LUSH, SWAMP);

        addBiome(SaltDesertBiome.SALT_DESERT.get(), BiomeManager.BiomeType.DESERT, 15, OVERWORLD, HOT, DRY, WASTELAND);

        addBiome(VolcanicSiteBiome.VOLCANIC_SITE.get(), BiomeManager.BiomeType.DESERT, 18, OVERWORLD, WASTELAND, SPOOKY, MOUNTAIN);

        addBiome(InactiveVolcanicSiteBiome.INACTIVE_VOLCANIC_SITE.get(), BiomeManager.BiomeType.DESERT, 18, OVERWORLD, WASTELAND, SPOOKY, MOUNTAIN);

        addBiome(GinkgoForestBiome.GINKGO_FOREST.get(), BiomeManager.BiomeType.COOL, 18, OVERWORLD, FOREST, LUSH);

    }

    private static void addBiome(Biome biome, BiomeManager.BiomeType type, int weight, BiomeDictionary.Type... types) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(ForgeRegistries.Keys.BIOMES,
                Objects.requireNonNull(ForgeRegistries.BIOMES.getKey(biome)));

        System.out.println("Registering biome: " + key);

        BiomeDictionary.addTypes(key, types);
        BiomeManager.addBiome(type, new BiomeManager.BiomeEntry(key, weight));
    }

}

