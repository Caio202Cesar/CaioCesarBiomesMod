package com.caiocesarmods.caiocesarbiomes.World.worldgen.gen;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.TreeFeatures;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.function.Supplier;

public class ModTreeGeneration {

    public static void generateTrees(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());

        // Check if the biome is the Vanilla Desert or a specific modded biome
        if (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.DESERT.getLocation()))) {

            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> TreeFeatures.SUBTROPICAL_DESERT_TREES
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(
                            new AtSurfaceWithExtraConfig(2, 0.1F, 5))));
        }

        if (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.FOREST.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.FLOWER_FOREST.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.WOODED_HILLS.getLocation()))))) {

            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> TreeFeatures.FOREST_EXTRA_VEGETATION
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(
                            new AtSurfaceWithExtraConfig(5, 0.25f, 2))));
        }

        if (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.JUNGLE.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.BAMBOO_JUNGLE.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.MODIFIED_JUNGLE.getLocation()))))) {

            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> TreeFeatures.JUNGLE_EXTRA_VEGETATION
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(
                            new AtSurfaceWithExtraConfig(5, 0.25f, 2))));
        }

        if (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.JUNGLE_EDGE.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.MODIFIED_JUNGLE_EDGE.getLocation())))) {

            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> TreeFeatures.JUNGLE_EDGE_EXTRA_VEGETATION
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(
                            new AtSurfaceWithExtraConfig(2, 0.1f, 1))));
        }

        if (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.JUNGLE_HILLS.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.BAMBOO_JUNGLE_HILLS.getLocation())))) {

            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> TreeFeatures.JUNGLE_HILLS_EXTRA_VEGETATION
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
                            new AtSurfaceWithExtraConfig(0, 0.2f, 5))));
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

        if (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.MOUNTAINS.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.MOUNTAIN_EDGE.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.MODIFIED_GRAVELLY_MOUNTAINS.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.WOODED_MOUNTAINS.getLocation())))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.SNOWY_MOUNTAINS.getLocation())))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.GRAVELLY_MOUNTAINS.getLocation())))
        ))) {

            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> TreeFeatures.MOUNTAIN_EXTRA_VEGETATION
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(
                            new AtSurfaceWithExtraConfig(7, 0.1f, 3))));
        }

        if (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.TAIGA.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.SNOWY_TAIGA_MOUNTAINS.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.TAIGA_MOUNTAINS.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.TAIGA_HILLS.getLocation())))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.SNOWY_TAIGA.getLocation())))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.SNOWY_TAIGA_HILLS.getLocation()))))))
        {


            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> TreeFeatures.TAIGA_EXTRA_VEGETATION
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(
                            new AtSurfaceWithExtraConfig(3, 0.1f, 3))));
        }

        if (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.GIANT_TREE_TAIGA.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.GIANT_SPRUCE_TAIGA.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.GIANT_SPRUCE_TAIGA_HILLS.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.GIANT_TREE_TAIGA_HILLS.getLocation()))))))
        {


            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> TreeFeatures.MEGA_TAIGA_EXTRA_VEGETATION
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(
                            new AtSurfaceWithExtraConfig(7, 0.1f, 3))));
        }
    }
}
