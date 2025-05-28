package com.caiocesarmods.caiocesarbiomes.World.worldgen.gen;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.ModFeatures;
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
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class ModPlantGeneration {

    public static void generatePlants(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());

        if (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.SWAMP.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.SWAMP_HILLS.getLocation())))) {

            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> ModFeatures.SWAMP_PLANT_VEGETATION
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(
                            new AtSurfaceWithExtraConfig(9, 0.25f, 2))));
        }

        if (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.BADLANDS.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.BADLANDS_PLATEAU.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.MODIFIED_BADLANDS_PLATEAU.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.BADLANDS_PLATEAU.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.WOODED_BADLANDS_PLATEAU.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.MODIFIED_WOODED_BADLANDS_PLATEAU.getLocation())))))))) {

            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> ModFeatures.BADLANDS_TALL_VEGETATION
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(
                            new AtSurfaceWithExtraConfig(6, 0.25f, 2))));
        }

        if (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.FOREST.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.FLOWER_FOREST.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.WOODED_HILLS.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.BIRCH_FOREST.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.TALL_BIRCH_FOREST.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.DARK_FOREST.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.DARK_FOREST_HILLS.getLocation()))))))))) {

            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> ModFeatures.TEMPERATE_TALL_PLANTS_VEGETATION
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(
                            new AtSurfaceWithExtraConfig(6, 0.25f, 2))));
        }

        if (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.SWAMP.getLocation()))
                || (key.equals(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, Biomes.SWAMP_HILLS.getLocation())))) {

            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> ModFeatures.SWAMP_TALL_PLANTS_VEGETATION
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(
                            new AtSurfaceWithExtraConfig(5, 0.25f, 2))));
        }
    }
}
