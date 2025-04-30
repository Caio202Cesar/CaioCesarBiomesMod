package com.caiocesarmods.caiocesarbiomes.World.worldgen.gen;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.ModDefaultBiomeFeatures;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.TreeFeatures;
import com.caiocesarmods.caiocesarbiomes.block.custom.tree.DatePalmTree;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

public class ModTreeGeneration {

    public static void generateTrees(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());

        // Check if the biome is the Vanilla Desert or a specific modded biome
        if (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.DESERT.getLocation()))
                || event.getName().toString().equals("caiocesarbiomes:tropical_desert")) {

            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> TreeFeatures.SUBTROPICAL_DESERT_TREES
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(
                            new AtSurfaceWithExtraConfig(5, 0.25f, 2))));
        }

        if (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.FOREST.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.FLOWER_FOREST.getLocation())))) {

            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> TreeFeatures.FOREST_EXTRA_VEGETATION
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(
                            new AtSurfaceWithExtraConfig(5, 0.25f, 2))));
        }

        if (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.JUNGLE.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.JUNGLE_EDGE.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.JUNGLE_HILLS.getLocation()))))) {

            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> TreeFeatures.JUNGLE_EXTRA_VEGETATION
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(
                            new AtSurfaceWithExtraConfig(5, 0.25f, 2))));
        }

        if (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.BAMBOO_JUNGLE.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.BAMBOO_JUNGLE_HILLS.getLocation())))) {

            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> TreeFeatures.JUNGLE_EXTRA_VEGETATION
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(
                            new AtSurfaceWithExtraConfig(5, 0.25f, 2))));
        }

        if (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.MODIFIED_JUNGLE.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.MODIFIED_JUNGLE_EDGE.getLocation())))) {

            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> TreeFeatures.JUNGLE_EXTRA_VEGETATION
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(
                            new AtSurfaceWithExtraConfig(5, 0.25f, 2))));
        }

        if (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.DARK_FOREST.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.DARK_FOREST_HILLS.getLocation())))) {

            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> TreeFeatures.DARK_FOREST_EXTRA_VEGETATION
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(
                            new AtSurfaceWithExtraConfig(5, 0.25f, 2))));
        }

        if (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.SAVANNA.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.SAVANNA_PLATEAU.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.SHATTERED_SAVANNA.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.SHATTERED_SAVANNA_PLATEAU.getLocation())))))) {

            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> TreeFeatures.SAVANNA_EXTRA_VEGETATION
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(
                            new AtSurfaceWithExtraConfig(1, 0.1F, 1))));
        }

        if (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.SWAMP.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.SWAMP_HILLS.getLocation())))) {

            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> TreeFeatures.SWAMP_EXTRA_VEGETATION
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(
                            new AtSurfaceWithExtraConfig(5, 0.25f, 2))));
        }

        if (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.PLAINS.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.SUNFLOWER_PLAINS.getLocation())))) {

            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> TreeFeatures.PLAINS_EXTRA_VEGETATION
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(
                            new AtSurfaceWithExtraConfig(0, 0.2f, 2))));
        }

        if (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.WOODED_BADLANDS_PLATEAU.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.MODIFIED_WOODED_BADLANDS_PLATEAU.getLocation())))) {

            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> TreeFeatures.WOODED_BADLANDS_VEGETATION
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(
                            new AtSurfaceWithExtraConfig(6, 0.1f, 1))));
        }

        if (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.BADLANDS.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.ERODED_BADLANDS.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.MODIFIED_BADLANDS_PLATEAU.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.BADLANDS_PLATEAU.getLocation())))))) {

            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> TreeFeatures.LOWLAND_BADLANDS_VEGETATION
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(
                            new AtSurfaceWithExtraConfig(6, 0.1f, 1))));
        }

        if (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.BIRCH_FOREST.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.BIRCH_FOREST_HILLS.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.TALL_BIRCH_FOREST.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.TALL_BIRCH_HILLS.getLocation())))))) {

            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> TreeFeatures.BIRCH_FOREST_EXTRA_VEGETATION
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(
                            new AtSurfaceWithExtraConfig(6, 0.1f, 1))));
        }
    }
}
