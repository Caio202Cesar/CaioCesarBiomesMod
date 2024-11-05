package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features;

import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;

public class ModDefaultBiomeFeatures extends DefaultBiomeFeatures {
    public static void withMediterraneanFlowers(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.FLOWER_MEDITERRANEAN);
    }
    public static void withMediterraneanOakTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.MEDITERRANEAN_OAK_TREES);
    }
    public static void withOleanderShrubs(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.OLEANDER_SHRUBS);
    }
    public static void withScrublandTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.TREES_SCRUBLAND);
    }
    public static void withMediterraneanConiferTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.MEDITERRANEAN_CONIFER_TREES);
    }
    public static void withCrapeMyrtles(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.CRAPE_MYRTLE_TREES);
    }
    public static void withSubtropicalVanillaOak(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.SUBTROPICAL_FOREST_OAKS);
    }
    public static void withAvocadoTree(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.AVOCADO_TREE);
    }
    public static void withElderberryTree(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.ELDERBERRY_TREE);
    }
    public static void withItalianCypressTree(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.ITALIAN_CYPRESS_TREE);
    }
    public static void withIndianCoralTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.INDIAN_CORAL_TREES);
    }
    public static void withTropicalForestDeciduousTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.TROPICAL_FOREST_DECIDUOUS_TREES);
    }
    public static void withSubtropicalForestDeciduousTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.SUBTROPICAL_FOREST_TREES);
    }
    public static void withJungleOcoteaTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.JUNGLE_OCOTEA_TREES);
    }
    public static void withForestOcoteaTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.FOREST_OCOTEA_TREES);
    }
    public static void withGardeniaBush(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.PATCH_GARDENIA_PLANT);
    }
    public static void withHumidSubtropicalPlants(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.HUMID_SUBTROPICAL_PLANTS);
}}

