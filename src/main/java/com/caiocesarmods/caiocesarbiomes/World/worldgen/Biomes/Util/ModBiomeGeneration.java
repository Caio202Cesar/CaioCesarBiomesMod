package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.ContinentalTemperateBiomes.GinkgoForestBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.ContinentalTemperateBiomes.HemiborealForestBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.ContinentalTemperateBiomes.HemiborealSteppeBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.ContinentalTemperateBiomes.JapaneseMapleGroveBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.MildDesertBiomes.CoastalSubtropicalDesertBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.SpecialBiomes.InactiveVolcanicSiteBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.SpecialBiomes.SaltDesertBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.SpecialBiomes.VolcanicSiteBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.SubtropicalBiomes.*;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.TemperateBiomes.MagellanicSubpolarForestBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.TemperateBiomes.TemperateDesert;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.TemperateBiomes.TemperateRainforest;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.TropicalBiomes.*;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.TundraBiomes.GravelTundraBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.TundraBiomes.LushSouthernTundraBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.TundraBiomes.TussockTundraBiome;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

import static net.minecraftforge.common.BiomeDictionary.Type.*;

public class ModBiomeGeneration {
    public static void generateBiomes() {
        ///Mediterranean
        addBiome(MediterraneanConiferSavannaBiome.MEDITERRANEAN_CONIFER_SAVANNA.get(), BiomeManager.BiomeType.WARM, 25, OVERWORLD, SPARSE,
                CONIFEROUS, PLATEAU);
        addBiome(OliveGroveBiome.OLIVE_GROVE.get(), BiomeManager.BiomeType.WARM, 23, OVERWORLD, SPARSE);
        addBiome(MediterraneanOakWoodlandBiome.MEDITERRANEAN_OAK_WOODLAND.get(), BiomeManager.BiomeType.WARM, 25, DENSE, OVERWORLD);
        addBiome(MediterraneanScrublandBiome.MEDITERRANEAN_SCRUBLAND.get(), BiomeManager.BiomeType.WARM, 25, OVERWORLD, SPARSE);
        addBiome(OleanderGardensBiome.OLEANDER_GARDENS.get(), BiomeManager.BiomeType.WARM, 20, OVERWORLD, SPARSE);
        addBiome(CorkOakSavannaBiome.CORK_OAK_SAVANNA.get(), BiomeManager.BiomeType.WARM, 25, OVERWORLD, SPARSE, DRY, SAVANNA);
        addBiome(MediterraneanPineForestBiome.MEDITERRANEAN_PINE_FOREST.get(), BiomeManager.BiomeType.WARM, 20, OVERWORLD, FOREST, DRY,
                DENSE, PLATEAU);

        ///Humid Subtropical
        addBiome(SubtropicalSeasonalForestBiome.SUBTROPICAL_LUCIDOPHYLLOUS_OAK_FOREST.get(), BiomeManager.BiomeType.WARM, 25, OVERWORLD, LUSH, DENSE);
        addBiome(SubtropicalLaurelForestBiome.SUBTROPICAL_LAUREL_FOREST.get(), BiomeManager.BiomeType.WARM, 25, OVERWORLD, LUSH, DENSE);
        addBiome(SubtropicalLaurelJungleBiome.SUBTROPICAL_LAUREL_JUNGLE.get(), BiomeManager.BiomeType.WARM, 20, OVERWORLD, LUSH, DENSE, JUNGLE, WET);
        addBiome(MontaneLaurelGroveBiome.MONTANE_LAUREL_GROVE.get(), BiomeManager.BiomeType.WARM, 20, OVERWORLD, SPARSE, MOUNTAIN, LUSH, HILLS);
        addBiome(SubtropicalExtremeHillsBiome.SUBTROPICAL_EXTREME_HILLS.get(), BiomeManager.BiomeType.WARM, 20, OVERWORLD, SPARSE, MOUNTAIN, LUSH, HILLS);
        addBiome(SubtropicalEucalyptusForestBiome.SUBTROPICAL_EUCALYPTUS_FOREST.get(), BiomeManager.BiomeType.WARM, 23, OVERWORLD, FOREST, DRY, DENSE);
        addBiome(EucalyptusPlainsBiome.EUCALYPTUS_PLAINS.get(), BiomeManager.BiomeType.WARM, 25, OVERWORLD, PLAINS, SPARSE);
        addBiome(ValdivianTemperateRainforest.VALDIVIAN_TEMPERATE_RAINFOREST.get(), BiomeManager.BiomeType.WARM, 25, OVERWORLD, LUSH, WET, DENSE, JUNGLE);
        addBiome(PewenConiferousGrove.PEWEN_CONIFEROUS_GROVE.get(), BiomeManager.BiomeType.WARM, 25, OVERWORLD, LUSH, WET, DENSE, JUNGLE, MOUNTAIN);
        addBiome(HumidSubtropicalPineForest.HUMID_SUBTROPICAL_PINE_FOREST.get(), BiomeManager.BiomeType.WARM, 25, OVERWORLD, FOREST, CONIFEROUS, LUSH, DENSE);

        /// Tropical
        addBiome(TropicalSeasonalForestBiome.TROPICAL_SEASONAL_FOREST.get(), BiomeManager.BiomeType.DESERT, 25, OVERWORLD, HOT, FOREST, LUSH, DENSE);
        addBiome(TropicalEucalyptusDryForestBiome.TROPICAL_EUCALYPTUS_DRY_FOREST.get(), BiomeManager.BiomeType.DESERT, 23, OVERWORLD, FOREST, HOT, DRY, DENSE);
        addBiome(EucalyptusSavanna.EUCALYPTUS_SAVANNA.get(), BiomeManager.BiomeType.DESERT, 20, OVERWORLD, SAVANNA, HOT, DRY, SPARSE, RARE);
        addBiome(CookPineIslandBiome.COOK_PINE_ISLAND.get(), BiomeManager.BiomeType.DESERT, 20, HOT, OVERWORLD);
        addBiome(TropicalIslandBiome.TROPICAL_ISLAND.get(), BiomeManager.BiomeType.DESERT, 20, HOT, OVERWORLD);
        addBiome(MonsoonFicusTropicalForest.MONSOON_FICUS_FOREST.get(), BiomeManager.BiomeType.DESERT, 25, OVERWORLD, HOT, FOREST, JUNGLE, WET, LUSH, DENSE);
        addBiome(TropicalBambooMarsh.TROPICAL_BAMBOO_MARSH.get(), BiomeManager.BiomeType.DESERT, 20, HOT, OVERWORLD, WET, DENSE, LUSH, SWAMP);
        addBiome(MontaneCloudJungle.MONTANE_CLOUD_JUNGLE.get(), BiomeManager.BiomeType.DESERT, 20, HOT, JUNGLE, OVERWORLD, WET, DENSE, LUSH, MOUNTAIN);

        /// Arid
        addBiome(CoastalSubtropicalDesertBiome.COAST_SUBTROPICAL_DESERT.get(), BiomeManager.BiomeType.DESERT, 20, OVERWORLD, SANDY, DRY, SPOOKY);
        addBiome(SahelBiome.TROPICAL_XERIC_SCRUBLAND.get(), BiomeManager.BiomeType.DESERT, 25, OVERWORLD, HOT, DRY, SPARSE);
        addBiome(EucalyptusSahelBiome.EUCALYPTUS_SAHEL.get(), BiomeManager.BiomeType.DESERT, 4, OVERWORLD, HOT, DRY, SPARSE, RARE);
        addBiome(SocotraTropicalDryland.SOCOTRA_DRYLAND.get(), BiomeManager.BiomeType.DESERT, 10, OVERWORLD, HOT, DRY, SPARSE, RARE);
        addBiome(TropicalDesertBiome.TROPICAL_DESERT.get(), BiomeManager.BiomeType.DESERT, 25, OVERWORLD, HOT, DRY, SANDY);
        addBiome(TemperateDesert.TEMPERATE_DESERT.get(), BiomeManager.BiomeType.WARM, 23, OVERWORLD, DRY, SANDY);
        addBiome(HemiborealSteppeBiome.HEMIBOREAL_STEPPE.get(), BiomeManager.BiomeType.COOL, 20, COLD, OVERWORLD);
        addBiome(SaltDesertBiome.SALT_DESERT.get(), BiomeManager.BiomeType.DESERT, 15, OVERWORLD, HOT, DRY, WASTELAND);

        /// Tundra
        addBiome(GravelTundraBiome.GRAVEL_TUNDRA.get(), BiomeManager.BiomeType.ICY, 25, OVERWORLD, COLD, DRY);
        addBiome(TussockTundraBiome.TUSSOCK_TUNDRA.get(), BiomeManager.BiomeType.ICY, 25, OVERWORLD, COLD, DRY);
        addBiome(LushSouthernTundraBiome.LUSH_SOUTHERN_TUNDRA.get(), BiomeManager.BiomeType.ICY, 20, OVERWORLD, COLD);

        ///Cold temperate
        addBiome(JapaneseMapleGroveBiome.JAPANESE_MAPLE_GROVE.get(), BiomeManager.BiomeType.COOL, 20, OVERWORLD, FOREST, LUSH, COLD);
        addBiome(HemiborealForestBiome.HEMIBOREAL_FOREST.get(), BiomeManager.BiomeType.COOL, 25, OVERWORLD, COLD);
        addBiome(MagellanicSubpolarForestBiome.SOUTHERN_BEECH_FOREST.get(), BiomeManager.BiomeType.COOL, 20, OVERWORLD, COLD);
        addBiome(GinkgoForestBiome.GINKGO_FOREST.get(), BiomeManager.BiomeType.COOL, 18, OVERWORLD, FOREST, LUSH);

        /// Warm temperate
        addBiome(TemperateRainforest.TEMPERATE_RAINFOREST.get(), BiomeManager.BiomeType.WARM, 25, OVERWORLD, FOREST, LUSH);

        /// Volcanic
        addBiome(VolcanicSiteBiome.VOLCANIC_SITE.get(), BiomeManager.BiomeType.DESERT_LEGACY, 18, OVERWORLD, WASTELAND, SPOOKY, MOUNTAIN);
        addBiome(InactiveVolcanicSiteBiome.INACTIVE_VOLCANIC_SITE.get(), BiomeManager.BiomeType.DESERT_LEGACY, 1, OVERWORLD, WASTELAND, SPOOKY, MOUNTAIN, RARE);

    }

    private static void addBiome(Biome biome, BiomeManager.BiomeType type, int weight, BiomeDictionary.Type... types) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(ForgeRegistries.Keys.BIOMES,
                Objects.requireNonNull(ForgeRegistries.BIOMES.getKey(biome)));

        System.out.println("Registering biome: " + key);

        BiomeDictionary.addTypes(key, types);
        BiomeManager.addBiome(type, new BiomeManager.BiomeEntry(key, weight));
    }

}

