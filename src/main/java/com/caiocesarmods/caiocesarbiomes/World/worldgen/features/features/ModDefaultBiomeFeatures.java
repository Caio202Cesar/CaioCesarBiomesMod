package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features;

import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Features;

public class ModDefaultBiomeFeatures {
    public static void withMediterraneanFlowers(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.FLOWER_MEDITERRANEAN);
    }
    public static void withSavannaPlants(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.PATCH_SAVANNA);
    }
    public static void withSavannaTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.SAVANNA_EXTRA_VEGETATION);
    }
    public static void withPlumeriaTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.PLUMERIA_TREES);
    }
    public static void withMediterraneanBeachFlowers(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.BEACH_FLOWER_MEDITERRANEAN);
    }
    public static void withMediterraneanOakTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.MEDITERRANEAN_OAK_TREES);
    }
    public static void withMediterraneanSparseOakTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.MEDITERRANEAN_SPARSE_OAK_TREES);
    }
    public static void withOleanderShrubs(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.OLEANDER_SHRUBS);
    }
    public static void withSabalPalms(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.SABAL_PALMS);
    }
    public static void withSocotraTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.SOCOTRA_TREES);
    }
    public static void withScrublandOleanderShrubs(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.SCRUBLAND_OLEANDER_SHRUBS);
    }
    public static void withScrublandTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.TREES_SCRUBLAND);
    }
    public static void withContinentalMapleTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.MIXED_CONTINENTAL_MAPLE_TREES);
    }
    public static void withMediterraneanConiferTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.MEDITERRANEAN_CONIFER_TREES);
    }
    public static void withWesternHemlock(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.WESTERN_HEMLOCK_TREES);
    }
    public static void withTemperateRainforestTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.TREES_TEMPERATE_RAINFOREST);
    }
    public static void withTemperateRainforestShrubs(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.TEMPERATE_RAINFOREST_SHRUBS);
    }
    public static void withRainforestChestnuts(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.RAINFOREST_CHESTNUT_TREES);
    }
    public static void withCrapeMyrtles(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.CRAPE_MYRTLE_TREES);
    }
    public static void withCasuarinaTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.CASUARINA_TREES);
    }
    public static void withSubtropicalForestOaks(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.SUBTROPICAL_FOREST_OAKS);
    }
    public static void withJapaneseGroveFlowers(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.JAPANESE_GROVE_FLOWERS);
    }
    public static void withScrublandConifers(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.SCRUBLAND_MEDITERRANEAN_CONIFERS);
    }
    public static void withHemiborealForestVegetation(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.MIXED_CONTINENTAL_FOREST_TREES);
    }
    public static void withSubtropicalBambooVegetation(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.BAMBOO);
    }
    public static void withIndianCoralTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.INDIAN_CORAL_TREES);
    }
    public static void withTemperateTallPlants(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.TEMPERATE_TALL_PLANTS_VEGETATION);
    }
    public static void withMagellanicTemperateTallPlants(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.MAGELLANIC_TALL_VEGETATION);
    }
    public static void withTropicalForestDeciduousTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.TROPICAL_FOREST_DECIDUOUS_TREES);
    }
    public static void withSubtropicalLaurelForestTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.SUBTROPICAL_LAUREL_FOREST_TREES);
    }
    /*public static void withSubtropicalEucalyptusForestTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.SUBTROPICAL_EUCALYPTUS_FOREST_TREES);
    }*/
    public static void withJungleOcoteaTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.JUNGLE_OCOTEA_TREES);
    }
    public static void withForestOcoteaTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.FOREST_OCOTEA_TREES);
    }
    public static void withHighlandOcoteaTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.HIGHLAND_OCOTEA_TREES);
    }
    public static void withDesertRose(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.PATCH_DESERT_ROSE);
    }
    public static void withHumidSubtropicalPlants(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.HUMID_SUBTROPICAL_PLANTS);
    }

    public static void withJapaneseMapleTree(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.JAPANESE_MAPLE);
    }
    public static void withMediterraneanPineForestTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.MEDITERRANEAN_PINE_FOREST_TREES);
    }
    public static void withTropicalSteepeTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.TROPICAL_STEEPE_TREES);
    }
    public static void withHumidSubtropicalBeachVegetation(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.HUMID_SUBTROPICAL_BEACH_VEGETATION);
    }
    public static void withOakShrubs(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.OAK_SHRUBS);
    }
    public static void withTropicalPineIslandTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.TROPICAL_PINE_ISLAND_TREES);
    }
    public static void withTropicalPineIslandFigTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.TROPICAL_PINE_ISLAND_JUNGLE_FIGS);
    }
    public static void withSouthernBeechVegetation(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.SOUTHERN_BEECH_FOREST_VEGETATION);
    }
    public static void withChileanBellflower(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.COIHUE_TREES_WITH_BELLFLOWER);
    }
    public static void withTropicalJungleFruitTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.TROPICAL_JUNGLE_FRUIT_TREES);
    }
    public static void withSubtropicalTallPlants(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.SUBTROPICAL_TALL_PLANT_VEGETATION);
    }
    public static void withTropicalPlants(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.TROPICAL_PLANTS);
    }
    public static void withTropicalBeachTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.TROPICAL_BEACH_TREES);
    }
    public static void withCoconutTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.COCONUT_TREES);
    }
    public static void withCamelliaAndTeaTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.CAMELLIA_TREES);
    }
    public static void withBunyaPines(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.BUNYA_PINES);
    }
    public static void withTropicalTallPlants(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.TROPICAL_TALL_PLANTS_VEGETATION);
    }
    public static void withTemperateRainforestPlants(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.TEMPERATE_RAINFOREST_PLANTS);
    }
    public static void withTemperateMagellanicPlants(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.TEMPERATE_MAGELLANIC_FLORA);
    }
    public static void withTropicalCitrusTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.TROPICAL_FOREST_CITRUS_TREES);
    }
    public static void withSubtropicalCitrusTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.SUBTROPICAL_FOREST_CITRUS_TREES);
    }
    public static void withTeakTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.TEAK_TREES);
    }
    public static void withHollyTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.HOLLY_TREES);
    }
    public static void withJungleFicuses(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.JUNGLE_FIG_TREES);
    }
    public static void withMonkeyPuzzleTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.MONKEY_PUZZLE_FOREST_TREES);
    }
    public static void withTemperateFruitTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.TEMPERATE_FRUIT_TREES);
    }
    public static void withJapaneseGroveTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.JAPANESE_GROVE_TREES);
    }
    public static void withTussockGrass(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.PATCH_TUSSOCK);
    }
    public static void withColdSteepeGrass(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.PATCH_DRY_STEPPE);
    }
    public static void withMediterraneanShrubs(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.MEDITERRANEAN_SHRUB_VEGETATION);
    }
    public static void withMediterraneanSavannaSmallTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.MEDITERRANEAN_SAVANNA_SMALL_TREES);
    }
    public static void withEucalyptusTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.EUCALYPTUS_TREES);
    }
    public static void withPlainsEucalyptusTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.PLAINS_EUCALYPTUS_TREES);
    }
    public static void withOakSubtropicalBeachVegetation(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.OAK_SUBTROPICAL_BEACH_VEGETATION);
    }
}

