package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features;

import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Features;

public class ModDefaultBiomeFeatures extends DefaultBiomeFeatures {
    public static void withMediterraneanFlowers(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.FLOWER_MEDITERRANEAN);
    }
    public static void withSavannaPlants(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.PATCH_SAVANNA);
    }
    public static void withSavannaTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.SAVANNA_EXTRA_VEGETATION);
    }
    public static void withMediterraneanBeachFlowers(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.BEACH_FLOWER_MEDITERRANEAN);
    }
    public static void withMediterraneanOakTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.MEDITERRANEAN_OAK_TREES);
    }
    public static void withOleanderShrubs(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.OLEANDER_SHRUBS);
    }
    public static void withSabalPalms(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.SABAL_PALMS);
    }
    public static void withSocotraTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.SOCOTRA_TREES);
    }
    public static void withScrublandOleanderShrubs(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.SCRUBLAND_OLEANDER_SHRUBS);
    }
    public static void withScrublandTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.TREES_SCRUBLAND);
    }
    public static void withContinentalMapleTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.MIXED_CONTINENTAL_MAPLE_TREES);
    }
    public static void withMediterraneanConiferTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.MEDITERRANEAN_CONIFER_TREES);
    }
    public static void withWesternHemlock(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.WESTERN_HEMLOCK_TREES);
    }
    public static void withTemperateRainforestTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.TREES_TEMPERATE_RAINFOREST);
    }
    public static void withTemperateRainforestShrubs(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.TEMPERATE_RAINFOREST_SHRUBS);
    }
    public static void withRainforestChestnuts(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.RAINFOREST_CHESTNUT_TREES);
    }
    public static void withCrapeMyrtles(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.CRAPE_MYRTLE_TREES);
    }
    public static void withCasuarinaTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.CASUARINA_TREES);
    }
    public static void withSubtropicalPlaneTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.SUBTROPICAL_FOREST_PLANE_TREES);
    }
    public static void withFigTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.FIG_TREES);
    }
    public static void withSubtropicalVanillaOak(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.SUBTROPICAL_FOREST_OAKS);
    }
    public static void withJapaneseGroveFlowers(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.JAPANESE_GROVE_FLOWERS);
    }
    public static void withScrublandConifers(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.SCRUBLAND_MEDITERRANEAN_CONIFERS);
    }
    public static void withHemiborealForestVegetation(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.MIXED_CONTINENTAL_FOREST_TREES);
    }
    public static void withSubtropicalBambooVegetation(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.BAMBOO);
    }
    public static void withIndianCoralTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.INDIAN_CORAL_TREES);
    }
    public static void withTemperateTallPlants(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.TEMPERATE_TALL_PLANTS_VEGETATION);
    }
    public static void withTropicalForestDeciduousTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.TROPICAL_FOREST_DECIDUOUS_TREES);
    }
    public static void withSubtropicalLaurelForestTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.SUBTROPICAL_LAUREL_FOREST_TREES);
    }
    public static void withSubtropicalEucalyptusForestTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.SUBTROPICAL_EUCALYPTUS_FOREST_TREES);
    }
    public static void withJungleOcoteaTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.JUNGLE_OCOTEA_TREES);
    }
    public static void withForestOcoteaTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.FOREST_OCOTEA_TREES);
    }
    public static void withHighlandOcoteaTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.HIGHLAND_OCOTEA_TREES);
    }
    public static void withDesertRose(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.PATCH_DESERT_ROSE);
    }
    public static void withHumidSubtropicalPlants(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.HUMID_SUBTROPICAL_PLANTS);
    }
    public static void withDeciduousSubtropicalForestTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.DECIDUOUS_SUBTROPICAL_FOREST_TREES);
    }
    public static void withJapaneseMapleTree(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.JAPANESE_MAPLE);
    }
    public static void withCanaryPineTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.CANARY_PINE_TREES);
    }
    public static void withTropicalSteepeTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.TROPICAL_STEEPE_TREES);
    }
    public static void withStrawberryTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.STRAWBERRY_TREES);
    }
    public static void withHumidSubtropicalBeachVegetation(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.HUMID_SUBTROPICAL_BEACH_VEGETATION);
    }
    public static void withOakShrubs(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.OAK_SHRUBS);
    }
    public static void withTropicalPineIslandTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.TROPICAL_PINE_ISLAND_TREES);
    }
    public static void withTropicalPineIslandFigTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.TROPICAL_PINE_ISLAND_JUNGLE_FIGS);
    }
    public static void withSouthernBeechVegetation(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.SOUTHERN_BEECH_FOREST_VEGETATION);
    }
    public static void withTropicalJungleFruitTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.TROPICAL_JUNGLE_FRUIT_TREES);
    }
    public static void withSubtropicalTallPlants(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.SUBTROPICAL_TALL_PLANT_VEGETATION);
    }
    public static void withTropicalPlants(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.TROPICAL_PLANTS);
    }
    public static void withTropicalBeachTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.TROPICAL_BEACH_TREES);
    }
    public static void withCamelliaAndTeaTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.CAMELLIA_TREES);
    }
    public static void withBunyaPines(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.BUNYA_PINES);
    }
    public static void withTropicalTallPlants(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.TROPICAL_TALL_PLANTS_VEGETATION);
    }
    public static void withTemperateRainforestPlants(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.TEMPERATE_RAINFOREST_PLANTS);
    }
    public static void withTropicalCitrusTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.TROPICAL_FOREST_CITRUS_TREES);
    }
    public static void withSubtropicalCitrusTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.SUBTROPICAL_FOREST_CITRUS_TREES);
    }
    public static void withCrabappleTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.CRABAPPLE_TREES);
    }
    public static void withHollyTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.HOLLY_TREES);
    }
    public static void withJungleFicuses(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.JUNGLE_FIG_TREES);
    }
    public static void withMonkeyPuzzleTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.MONKEY_PUZZLE_TREES);
    }
    public static void withTemperateFruitTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.TEMPERATE_FRUIT_TREES);
    }
    public static void withMediterraneanSavannaFruitTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.MEDITERRANEAN_SAVANNA_FRUIT_TREES);
    }
    public static void withJapaneseGroveTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.JAPANESE_GROVE_TREES);
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
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.MEDITERRANEAN_SAVANNA_SMALL_TREES);
    }
    public static void withEucalyptusTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.EUCALYPTUS_TREES);
    }
    public static void withPlainsEucalyptusTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.PLAINS_EUCALYPTUS_TREES);
    }
    public static void withPlainsSubtropicalTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.PLAINS_SUBTROPICAL_TREES);
    }
    public static void withPohutukawaTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.POHUTUKAWA_TREES);
    }
}

