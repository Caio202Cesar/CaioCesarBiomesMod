package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features;

import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Features;

public class ModDefaultBiomeFeatures {
    public static void withMediterraneanFlowers(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.FLOWER_WARM);
    }
}
