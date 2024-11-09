package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features;

import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.IFeatureConfig;

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
    public static void withScrublandCypress(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.SCRUBLAND_ITALIAN_CYPRESS);
    }
    public static void withSubtropicalBambooVegetation(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.BAMBOO);
    }
    public static void withIndianCoralTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.INDIAN_CORAL_TREES);
    }
    public static void withTropicalForestDeciduousTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.TROPICAL_FOREST_DECIDUOUS_TREES);
    }
    public static void withSubtropicalForestTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.SUBTROPICAL_FOREST_TREES);
    }
    public static void withJungleOcoteaTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.JUNGLE_OCOTEA_TREES);
    }
    public static void withForestOcoteaTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.FOREST_OCOTEA_TREES);
    }
    public static void withHighlandOcoteaTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.HIGHLAND_OCOTEA_TREE);
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
    public static void withTropicalDesertTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.TROPICAL_DESERT_TREES);
    }
    public static void withOakShrubs(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.OAK_SHRUBS);
    }
    public static void withTropicalFruitTrees(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.TROPICAL_FRUIT_TREES);
    }
    public static void withSubtropicalForestFlowers(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModFeatures.SUBTROPICAL_FOREST_FLOWER_VEGETATION);
    }
}

