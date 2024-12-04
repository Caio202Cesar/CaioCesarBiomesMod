package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features;

import com.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import com.google.common.collect.ImmutableList;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockplacer.DoublePlantBlockPlacer;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.blockstateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;

import java.util.function.Supplier;

import static com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.TreeFeatures.ITALIAN_CYPRESS_TREE;

public class ModFeatures extends Features implements IFeatureConfig {

    public static final ConfiguredFeature<?, ?> FLOWER_MEDITERRANEAN = register("flower_mediterranean",
            Feature.FLOWER.withConfiguration(ModFeatures.Configs.MEDITERRANEAN_FLOWER_CONFIG).withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(4));


    private static final ImmutableList<Supplier<ConfiguredFeature<?, ?>>> SUBTROPICAL_FOREST_FLOWER_VEGETATION_LIST = ImmutableList.of(() -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModFeatures.States.ROSE_BUSH), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    }, () -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModFeatures.States.GARDENIA), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    });

    private static final ImmutableList<Supplier<ConfiguredFeature<?, ?>>> MEDITERRANEAN_SHRUB_VEGETATION_LIST = ImmutableList.of(() -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModFeatures.States.ROSE_BUSH), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    }, () -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.BAY_LAUREL), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    }, () -> {
                return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.BAY_LAUREL_FLOWERING), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
            });

    public static final ConfiguredFeature<?, ?> SUBTROPICAL_FOREST_OAKS = register("subtropical_oak_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(OAK_BEES_002.withChance(0.025641026F),
                    FANCY_OAK.withChance(0.30769232F), FANCY_OAK_BEES_002.withChance(0.33333334F)), OAK)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> HUMID_SUBTROPICAL_PLANTS = register("humid_subtropical_plants",
            Feature.FLOWER.withConfiguration(ModFeatures.Configs.HUMID_SUBTROPICAL_PLANTS_CONFIG).withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(4));

    public static final ConfiguredFeature<?, ?> TROPICAL_PLANTS = register("tropical_plants",
            Feature.FLOWER.withConfiguration(ModFeatures.Configs.TROPICAL_PLANTS_CONFIG).withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(6));

    public static final ConfiguredFeature<?, ?> PATCH_DESERT_ROSE = register("patch_desert_rose",
            Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.DESERT_ROSE),
                            new DoublePlantBlockPlacer())).tries(64).preventProjection().build()).withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(2));

    public static final ConfiguredFeature<?, ?> PATCH_TUSSOCK = register("patch_tussock",
            Feature.FLOWER.withConfiguration(ModFeatures.Configs.TUSSOCK_GRASS_CONFIG).withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(100));

    public static final ConfiguredFeature<?, ?> PATCH_TROPICAL_HIBISCUS = register("patch_tropical_hibiscus",
            Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.TROPICAL_HIBISCUS),
                            new DoublePlantBlockPlacer())).tries(64).preventProjection().build()).withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(2));

    public static final ConfiguredFeature<?, ?> SUBTROPICAL_FOREST_FLOWER_VEGETATION = register("subtropical_forest_flower_vegetation",
            Feature.SIMPLE_RANDOM_SELECTOR.withConfiguration(new SingleRandomFeature(SUBTROPICAL_FOREST_FLOWER_VEGETATION_LIST)).countSpread(FeatureSpread.create(-3, 4))
                    .withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(5));

    public static final ConfiguredFeature<?, ?> MEDITERRANEAN_SHRUB_VEGETATION = register("mediterranean_shrub_vegetation",
            Feature.SIMPLE_RANDOM_SELECTOR.withConfiguration(new SingleRandomFeature(MEDITERRANEAN_SHRUB_VEGETATION_LIST)).countSpread(FeatureSpread.create(-3, 4))
                    .withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(5));


    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String key, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, key, configuredFeature);
    }

    public static final class Configs {
        public static final BlockClusterFeatureConfig MEDITERRANEAN_FLOWER_CONFIG =
                (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider())
                        .addWeightedBlockstate(States.ANIS, 1)
                        .addWeightedBlockstate(States.CINERARIA, 1)
                        .addWeightedBlockstate(States.SAGE, 1)
                        .addWeightedBlockstate(States.FENNEL, 1)
                        .addWeightedBlockstate(States.LAVENDER, 1)
                        .addWeightedBlockstate(States.SANTOLINA, 1)
                        .addWeightedBlockstate(States.MARJORAN, 1)
                        .addWeightedBlockstate(States.OREGANO, 1)
                        .addWeightedBlockstate(States.ROSEMARY, 1)
                        .addWeightedBlockstate(States.THYME, 1)
                        .addWeightedBlockstate(States.OXEYE_DAISY, 1),
                        SimpleBlockPlacer.PLACER)).tries(64).build();

        public static final BlockClusterFeatureConfig HUMID_SUBTROPICAL_PLANTS_CONFIG =
                (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider())
                        .addWeightedBlockstate(States.BUSH, 5)
                        .addWeightedBlockstate(States.AGAPANTHUS_PURPLE, 1)
                        .addWeightedBlockstate(States.AGAPANTHUS_WHITE, 1)
                        .addWeightedBlockstate(States.ALLIUM, 1)
                        .addWeightedBlockstate(States.BLUE_ORCHID, 1)
                        .addWeightedBlockstate(States.OXEYE_DAISY, 1),
        SimpleBlockPlacer.PLACER)).tries(64).build();

        public static final BlockClusterFeatureConfig TROPICAL_PLANTS_CONFIG =
                (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider())
                        .addWeightedBlockstate(States.BASIL, 1)
                        .addWeightedBlockstate(States.AGAPANTHUS_PURPLE, 1)
                        .addWeightedBlockstate(States.AGAPANTHUS_WHITE, 1)
                        .addWeightedBlockstate(States.BLUE_ORCHID, 1)
                        .addWeightedBlockstate(States.PURPLE_BASIL, 1),
        SimpleBlockPlacer.PLACER)).tries(64).build();

        public static final BlockClusterFeatureConfig TUSSOCK_GRASS_CONFIG =
                (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider())
                        .addWeightedBlockstate(States.TUSSOCK_GRASS, 6),
                        SimpleBlockPlacer.PLACER)).tries(64).build();
    }


    public static final class States {
        protected static final BlockState ANIS = ModBlocks.ANIS.get().getDefaultState();
        protected static final BlockState SAGE = ModBlocks.SAGE.get().getDefaultState();
        protected static final BlockState BASIL = ModBlocks.BASIL.get().getDefaultState();
        protected static final BlockState PURPLE_BASIL = ModBlocks.PURPLE_BASIL.get().getDefaultState();
        protected static final BlockState CINERARIA = ModBlocks.CINERARIA.get().getDefaultState();
        protected static final BlockState FENNEL = ModBlocks.FENNEL.get().getDefaultState();
        protected static final BlockState LAVENDER = ModBlocks.LAVENDER.get().getDefaultState();
        protected static final BlockState SANTOLINA = ModBlocks.SANTOLINA.get().getDefaultState();
        protected static final BlockState MARJORAN = ModBlocks.MARJORAN.get().getDefaultState();
        protected static final BlockState OREGANO = ModBlocks.OREGANO.get().getDefaultState();
        protected static final BlockState ROSEMARY = ModBlocks.ROSEMARY.get().getDefaultState();
        protected static final BlockState THYME = ModBlocks.THYME.get().getDefaultState();
        protected static final BlockState GARDENIA = ModBlocks.GARDENIA_BUSH.get().getDefaultState();
        protected static final BlockState BUSH = ModBlocks.BUSH.get().getDefaultState();
        protected static final BlockState AGAPANTHUS_PURPLE = ModBlocks.AGAPANTHUS_PURPLE.get().getDefaultState();
        protected static final BlockState AGAPANTHUS_WHITE = ModBlocks.AGAPANTHUS_WHITE.get().getDefaultState();
        protected static final BlockState DESERT_ROSE = ModBlocks.DESERT_ROSE_PLANT.get().getDefaultState();
        protected static final BlockState ROSE_BUSH = Blocks.ROSE_BUSH.getDefaultState();
        protected static final BlockState ALLIUM = Blocks.ALLIUM.getDefaultState();
        protected static final BlockState BLUE_ORCHID = Blocks.BLUE_ORCHID.getDefaultState();
        protected static final BlockState OXEYE_DAISY = Blocks.OXEYE_DAISY.getDefaultState();
        protected static final BlockState TROPICAL_HIBISCUS = ModBlocks.CHINESE_HIBISCUS.get().getDefaultState();
        protected static final BlockState COBBLESTONE = Blocks.COBBLESTONE.getDefaultState();
        protected static final BlockState TUSSOCK_GRASS = ModBlocks.TUSSOCK_GRASS.get().getDefaultState();
        protected static final BlockState BAY_LAUREL = ModBlocks.BAY_LAUREL.get().getDefaultState();
        protected static final BlockState BAY_LAUREL_FLOWERING = ModBlocks.BAY_LAUREL_FLOWERING.get().getDefaultState();

    }

}
