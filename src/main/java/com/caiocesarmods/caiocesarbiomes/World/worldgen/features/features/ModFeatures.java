package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features;

import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import com.google.common.collect.ImmutableList;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
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

public class ModFeatures extends Features implements IFeatureConfig {

    public static final ConfiguredFeature<?, ?> FLOWER_MEDITERRANEAN = register("flower_mediterranean",
            Feature.FLOWER.withConfiguration(ModFeatures.Configs.MEDITERRANEAN_FLOWER_CONFIG).withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(4));

    public static final ConfiguredFeature<?, ?> TAIGA_PLANTS = register("taiga_plants",
            Feature.FLOWER.withConfiguration(Configs.TAIGA_PLANT_CONFIG).withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(4));

    public static final ConfiguredFeature<?, ?> DESERT_VEGETATION = register("desert_vegetation",
            Feature.FLOWER.withConfiguration(Configs.DESERT_PLANT_CONFIG).withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(4));

    public static final ConfiguredFeature<?, ?> PATCH_MOUNTAIN = register("patch_mountain",
            Feature.FLOWER.withConfiguration(Configs.MOUNTAIN_PLANT_CONFIG).withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(2));

    public static final ConfiguredFeature<?, ?> PATCH_SAVANNA = register("patch_savanna",
            Feature.FLOWER.withConfiguration(Configs.SAVANNA_PLANT_CONFIG).withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(7));

    public static final ConfiguredFeature<?, ?> SWAMP_PLANT_VEGETATION = register("swamp_plants",
            Feature.FLOWER.withConfiguration(Configs.SWAMP_PLANT_CONFIG).withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(10));

    public static final ConfiguredFeature<?, ?> TEMPERATE_RAINFOREST_PLANTS = register("temperate_rainforest_plants",
            Feature.FLOWER.withConfiguration(Configs.TEMPERATE_FOREST_PLANT_CONFIG).withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(4));

    public static final ConfiguredFeature<?, ?> JAPANESE_GROVE_FLOWERS = register("japanese_grove_plants",
            Feature.FLOWER.withConfiguration(Configs.JAPANESE_GROVE_PLANTS_CONFIG).withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(4));

    public static final ConfiguredFeature<?, ?> BEACH_FLOWER_MEDITERRANEAN = register("beach_flower_mediterranean",
            Feature.FLOWER.withConfiguration(ModFeatures.Configs.MEDITERRANEAN_BEACH_FLOWER_CONFIG).withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(4));

    private static final ImmutableList<Supplier<ConfiguredFeature<?, ?>>> SUBTROPICAL_TALL_PLANT_VEGETATION_LIST = ImmutableList.of(() -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModFeatures.States.ROSE_BUSH), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    }, () -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModFeatures.States.GARDENIA), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    }, () -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.BLUEBERRY_BUSH), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    }, () -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.CANNA_LILY_YELLOW), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    }, () -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.CANNA_LILY_RED), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    }, () -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.CANNA_LILY_PURPLE_RED), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    });

    private static final ImmutableList<Supplier<ConfiguredFeature<?, ?>>> TROPICAL_TALL_PLANTS_LIST = ImmutableList.of(() -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.TROPICAL_HIBISCUS), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    }, () -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.SPIDER_LILY), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    }, () -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.CANNA_LILY_PURPLE_RED), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    }, () -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.CANNA_LILY_RED), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    }, () -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.CANNA_LILY_YELLOW), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    }, () -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.PALM_LILY), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
});

    private static final ImmutableList<Supplier<ConfiguredFeature<?, ?>>> BADLANDS_TALL_PLANTS = ImmutableList.of(() -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.MANZANITA_BUSH), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    });

    private static final ImmutableList<Supplier<ConfiguredFeature<?, ?>>> TEMPERATE_TALL_PLANTS_LIST = ImmutableList.of(() -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.BLUEBERRY_BUSH), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    });

    private static final ImmutableList<Supplier<ConfiguredFeature<?, ?>>> SWAMP_TALL_PLANTS_LIST = ImmutableList.of(() -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.BLUEBERRY_BUSH), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    }, () -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.SPIDER_LILY), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    }, () -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.CANNA_LILY_YELLOW), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    }, () -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.CANNA_LILY_RED), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    }, () -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.CANNA_LILY_PURPLE_RED), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    });

    private static final ImmutableList<Supplier<ConfiguredFeature<?, ?>>> DESERT_TALL_PLANTS_LIST = ImmutableList.of(() -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.CREOSOTE), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    }, () -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.CREOSOTE_FLOWERING), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    });

    private static final ImmutableList<Supplier<ConfiguredFeature<?, ?>>> SAVANNA_TALL_PLANTS_LIST = ImmutableList.of(() -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.ALOE_VERA), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    }, () -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.PENCIL_TREE), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    });

    private static final ImmutableList<Supplier<ConfiguredFeature<?, ?>>> SAHEL_TALL_PLANTS_LIST = ImmutableList.of(() -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.DESERT_ROSE), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
    }, () -> {
        return Feature.RANDOM_PATCH.withConfiguration((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.PENCIL_TREE), new DoublePlantBlockPlacer())).tries(64).preventProjection().build());
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

    public static final ConfiguredFeature<?, ?> PATCH_TUSSOCK = register("patch_tussock",
            Feature.FLOWER.withConfiguration(ModFeatures.Configs.TUSSOCK_GRASS_CONFIG).withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(100));

    public static final ConfiguredFeature<?, ?> PATCH_DRY_STEPPE = register("patch_dry_steppe",
            Feature.FLOWER.withConfiguration(Configs.STEPPE_GRASS_CONFIG).withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(100));

    public static final ConfiguredFeature<?, ?> SUBTROPICAL_TALL_PLANT_VEGETATION = register("subtropical_tall_plant_vegetation",
            Feature.SIMPLE_RANDOM_SELECTOR.withConfiguration(new SingleRandomFeature(SUBTROPICAL_TALL_PLANT_VEGETATION_LIST)).countSpread(FeatureSpread.create(-3, 4))
                    .withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(5));

    public static final ConfiguredFeature<?, ?> MEDITERRANEAN_SHRUB_VEGETATION = register("mediterranean_shrub_vegetation",
            Feature.SIMPLE_RANDOM_SELECTOR.withConfiguration(new SingleRandomFeature(MEDITERRANEAN_SHRUB_VEGETATION_LIST)).countSpread(FeatureSpread.create(-3, 4))
                    .withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(5));

    public static final ConfiguredFeature<?, ?> TROPICAL_TALL_PLANTS_VEGETATION = register("tropical_tall_plants_vegetation",
            Feature.SIMPLE_RANDOM_SELECTOR.withConfiguration(new SingleRandomFeature(TROPICAL_TALL_PLANTS_LIST)).countSpread(FeatureSpread.create(-3, 4))
                    .withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(10));

    public static final ConfiguredFeature<?, ?> BADLANDS_TALL_VEGETATION = register("badlands_tall_vegetation",
            Feature.SIMPLE_RANDOM_SELECTOR.withConfiguration(new SingleRandomFeature(BADLANDS_TALL_PLANTS)).countSpread(FeatureSpread.create(-3, 4))
                    .withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(5));

    public static final ConfiguredFeature<?, ?> TEMPERATE_TALL_PLANTS_VEGETATION = register("temperate_tall_plants_vegetation",
            Feature.SIMPLE_RANDOM_SELECTOR.withConfiguration(new SingleRandomFeature(TEMPERATE_TALL_PLANTS_LIST)).countSpread(FeatureSpread.create(-3, 4))
                    .withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(5));

    public static final ConfiguredFeature<?, ?> SWAMP_TALL_PLANTS_VEGETATION = register("swamp_tall_plants_vegetation",
            Feature.SIMPLE_RANDOM_SELECTOR.withConfiguration(new SingleRandomFeature(SWAMP_TALL_PLANTS_LIST)).countSpread(FeatureSpread.create(-3, 4))
                    .withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(5));

    public static final ConfiguredFeature<?, ?> SAVANNA_TALL_PLANTS_VEGETATION = register("savanna_tall_plants_vegetation",
            Feature.SIMPLE_RANDOM_SELECTOR.withConfiguration(new SingleRandomFeature(SAVANNA_TALL_PLANTS_LIST)).countSpread(FeatureSpread.create(-3, 4))
                    .withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(5));

    public static final ConfiguredFeature<?, ?> TALL_DESERT_VEGETATION = register("tall_desert_vegetation",
            Feature.SIMPLE_RANDOM_SELECTOR.withConfiguration(new SingleRandomFeature(DESERT_TALL_PLANTS_LIST)).countSpread(FeatureSpread.create(-3, 4))
                    .withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(5));

    public static final ConfiguredFeature<?, ?> PATCH_DESERT_ROSE = register("sahel_tall_vegetation",
            Feature.SIMPLE_RANDOM_SELECTOR.withConfiguration(new SingleRandomFeature(SAHEL_TALL_PLANTS_LIST)).countSpread(FeatureSpread.create(-3, 4))
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

        public static final BlockClusterFeatureConfig MEDITERRANEAN_BEACH_FLOWER_CONFIG =
                (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider())
                        .addWeightedBlockstate(States.WHITE_CISTUS, 1)
                        .addWeightedBlockstate(States.PINK_CISTUS, 1),
                        SimpleBlockPlacer.PLACER)).tries(64).build();

        public static final BlockClusterFeatureConfig JAPANESE_GROVE_PLANTS_CONFIG =
                (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider())
                        .addWeightedBlockstate(States.RED_AZALEA, 2)
                        .addWeightedBlockstate(States.ORANGE_AZALEA, 3)
                        .addWeightedBlockstate(States.PURPLE_AZALEA, 1)
                        .addWeightedBlockstate(States.MAGENTA_AZALEA, 3)
                        .addWeightedBlockstate(States.PINK_AZALEA, 3)
                        .addWeightedBlockstate(States.GREEN_AZALEA, 1)
                        .addWeightedBlockstate(States.WHITE_AZALEA, 2),
                        SimpleBlockPlacer.PLACER)).tries(64).build();

        public static final BlockClusterFeatureConfig HUMID_SUBTROPICAL_PLANTS_CONFIG =
                (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider())
                        .addWeightedBlockstate(States.BUSH, 5)
                        .addWeightedBlockstate(States.AGAPANTHUS_PURPLE, 2)
                        .addWeightedBlockstate(States.AGAPANTHUS_WHITE, 2)
                        .addWeightedBlockstate(States.ALLIUM, 2)
                        .addWeightedBlockstate(States.BLUE_ORCHID, 1)
                        .addWeightedBlockstate(States.OXEYE_DAISY, 1)
                        .addWeightedBlockstate(States.RED_AZALEA, 2)
                        .addWeightedBlockstate(States.ORANGE_AZALEA, 1)
                        .addWeightedBlockstate(States.PURPLE_AZALEA, 1)
                        .addWeightedBlockstate(States.MAGENTA_AZALEA, 1)
                        .addWeightedBlockstate(States.PINK_AZALEA, 1)
                        .addWeightedBlockstate(States.GREEN_AZALEA, 1)
                        .addWeightedBlockstate(States.WHITE_AZALEA, 2)
                        .addWeightedBlockstate(States.SAW_PALMETTO, 5),
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
                        .addWeightedBlockstate(States.TUSSOCK_GRASS, 10),
                        SimpleBlockPlacer.PLACER)).tries(64).build();

        public static final BlockClusterFeatureConfig SWAMP_PLANT_CONFIG =
                (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider())
                        .addWeightedBlockstate(States.SAW_PALMETTO, 7)
                        .addWeightedBlockstate(States.BALD_CYPRESS_ROOTS_LARGE, 5)
                        .addWeightedBlockstate(States.BALD_CYPRESS_ROOTS_SMALL, 5)
                        .addWeightedBlockstate(States.INKBERRY_BUSH, 3)
                        .addWeightedBlockstate(States.INKBERRY_FRUITING_BUSH, 3)
                        .addWeightedBlockstate(States.AGAPANTHUS_WHITE, 1)
                        .addWeightedBlockstate(States.AGAPANTHUS_PURPLE, 1),
                        SimpleBlockPlacer.PLACER)).tries(64).build();

        public static final BlockClusterFeatureConfig STEPPE_GRASS_CONFIG =
                (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider())
                        .addWeightedBlockstate(States.DRY_STEPPE_GRASS, 10),
                        SimpleBlockPlacer.PLACER)).tries(64).build();

        public static final BlockClusterFeatureConfig TEMPERATE_FOREST_PLANT_CONFIG =
                (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider())
                        .addWeightedBlockstate(States.INKBERRY_BUSH, 7)
                        .addWeightedBlockstate(States.INKBERRY_FRUITING_BUSH, 7)
                        .addWeightedBlockstate(States.BLACK_CURRANT_BUSH, 4)
                        .addWeightedBlockstate(States.RED_CURRANT_BUSH, 4)
                        .addWeightedBlockstate(States.DAFFODIL_WHITE, 7)
                        .addWeightedBlockstate(States.DAFFODIL_YELLOW, 7)
                        .addWeightedBlockstate(States.RED_AZALEA, 2)
                        .addWeightedBlockstate(States.ORANGE_AZALEA, 3)
                        .addWeightedBlockstate(States.PURPLE_AZALEA, 1)
                        .addWeightedBlockstate(States.MAGENTA_AZALEA, 3)
                        .addWeightedBlockstate(States.PINK_AZALEA, 3)
                        .addWeightedBlockstate(States.GREEN_AZALEA, 1)
                        .addWeightedBlockstate(States.WHITE_AZALEA, 2)
                        .addWeightedBlockstate(States.HYACINTH, 7),
                        SimpleBlockPlacer.PLACER)).tries(64).build();

        public static final BlockClusterFeatureConfig TAIGA_PLANT_CONFIG =
                (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider())
                        .addWeightedBlockstate(States.CLOUDBERRY, 1)
                        .addWeightedBlockstate(States.FRUITING_CLOUDBERRY, 1)
                        .addWeightedBlockstate(States.FLOWERING_CLOUDBERRY, 1)
                        .addWeightedBlockstate(States.CLUBMOSS, 4)
                        .addWeightedBlockstate(States.RED_CURRANT_BUSH, 3)
                        .addWeightedBlockstate(States.BLACK_CURRANT_BUSH, 2)
                        .addWeightedBlockstate(States.BUNCHBERRY, 5)
                        .addWeightedBlockstate(States.BUNCHBERRY_FRUITING, 5)
                        .addWeightedBlockstate(States.BUNCHBERRY_FLOWERING, 5),
                        SimpleBlockPlacer.PLACER)).tries(64).build();

        public static final BlockClusterFeatureConfig MOUNTAIN_PLANT_CONFIG =
                (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider())
                        .addWeightedBlockstate(States.EDELWEISS, 2)
                        .addWeightedBlockstate(States.LUPINUS, 7)
                        .addWeightedBlockstate(States.BUNCHBERRY_FLOWERING, 4)
                        .addWeightedBlockstate(States.BUNCHBERRY_FRUITING, 4)
                        .addWeightedBlockstate(States.BUNCHBERRY, 4),
                        SimpleBlockPlacer.PLACER)).tries(64).build();

        public static final BlockClusterFeatureConfig SAVANNA_PLANT_CONFIG =
                (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider())
                        .addWeightedBlockstate(States.CALABASH_VINE, 2)
                        .addWeightedBlockstate(States.AGAPANTHUS_PURPLE, 3)
                        .addWeightedBlockstate(States.AGAPANTHUS_WHITE, 3)
                        .addWeightedBlockstate(States.SNAKE_PLANT, 3),
                        SimpleBlockPlacer.PLACER)).tries(64).build();

        public static final BlockClusterFeatureConfig DESERT_PLANT_CONFIG =
                (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider())
                        .addWeightedBlockstate(States.STUART_DESERT_PEA, 1)
                        .addWeightedBlockstate(States.BARREL_CACTUS, 5),
                        SimpleBlockPlacer.PLACER)).tries(64).build();
    }


    public static final class States {
        protected static final BlockState ANIS = ModPlants.ANIS.get().getDefaultState();
        protected static final BlockState SAGE = ModPlants.SAGE.get().getDefaultState();
        protected static final BlockState BASIL = ModPlants.BASIL.get().getDefaultState();
        protected static final BlockState PURPLE_BASIL = ModPlants.PURPLE_BASIL.get().getDefaultState();
        protected static final BlockState CINERARIA = ModPlants.CINERARIA.get().getDefaultState();
        protected static final BlockState FENNEL = ModPlants.FENNEL.get().getDefaultState();
        protected static final BlockState LAVENDER = ModPlants.LAVENDER.get().getDefaultState();
        protected static final BlockState SANTOLINA = ModPlants.SANTOLINA.get().getDefaultState();
        protected static final BlockState MARJORAN = ModPlants.MARJORAN.get().getDefaultState();
        protected static final BlockState OREGANO = ModPlants.OREGANO.get().getDefaultState();
        protected static final BlockState ROSEMARY = ModPlants.ROSEMARY.get().getDefaultState();
        protected static final BlockState THYME = ModPlants.THYME.get().getDefaultState();
        protected static final BlockState GARDENIA = ModPlants.GARDENIA_BUSH.get().getDefaultState();
        protected static final BlockState BUSH = ModPlants.BUSH.get().getDefaultState();
        protected static final BlockState AGAPANTHUS_PURPLE = ModPlants.AGAPANTHUS_PURPLE.get().getDefaultState();
        protected static final BlockState AGAPANTHUS_WHITE = ModPlants.AGAPANTHUS_WHITE.get().getDefaultState();
        protected static final BlockState DESERT_ROSE = ModPlants.DESERT_ROSE_PLANT.get().getDefaultState();
        protected static final BlockState ROSE_BUSH = Blocks.ROSE_BUSH.getDefaultState();
        protected static final BlockState ALLIUM = Blocks.ALLIUM.getDefaultState();
        protected static final BlockState BLUE_ORCHID = Blocks.BLUE_ORCHID.getDefaultState();
        protected static final BlockState OXEYE_DAISY = Blocks.OXEYE_DAISY.getDefaultState();
        protected static final BlockState TROPICAL_HIBISCUS = ModPlants.CHINESE_HIBISCUS.get().getDefaultState();
        protected static final BlockState TUSSOCK_GRASS = ModPlants.TUSSOCK_GRASS.get().getDefaultState();
        protected static final BlockState BAY_LAUREL = ModPlants.BAY_LAUREL.get().getDefaultState();
        protected static final BlockState BAY_LAUREL_FLOWERING = ModPlants.BAY_LAUREL_FLOWERING.get().getDefaultState();
        protected static final BlockState PINK_CISTUS = ModPlants.PINK_CISTUS.get().getDefaultState();
        protected static final BlockState WHITE_CISTUS = ModPlants.WHITE_CISTUS.get().getDefaultState();
        protected static final BlockState WHITE_AZALEA = ModPlants.AZALEA_WHITE.get().getDefaultState();
        protected static final BlockState GREEN_AZALEA = ModPlants.AZALEA_GREEN.get().getDefaultState();
        protected static final BlockState PURPLE_AZALEA = ModPlants.AZALEA_PURPLE.get().getDefaultState();
        protected static final BlockState RED_AZALEA = ModPlants.AZALEA_RED.get().getDefaultState();
        protected static final BlockState MAGENTA_AZALEA = ModPlants.AZALEA_MAGENTA.get().getDefaultState();
        protected static final BlockState ORANGE_AZALEA = ModPlants.AZALEA_ORANGE.get().getDefaultState();
        protected static final BlockState PINK_AZALEA = ModPlants.AZALEA_PINK.get().getDefaultState();
        protected static final BlockState RED_CURRANT_BUSH = ModPlants.RED_CURRANT_SHRUB.get().getDefaultState();
        protected static final BlockState BLACK_CURRANT_BUSH = ModPlants.BLACK_CURRANT_SHRUB.get().getDefaultState();
        protected static final BlockState SPIDER_LILY = ModPlants.SPIDER_LILY.get().getDefaultState();
        protected static final BlockState BLUEBERRY_BUSH = ModPlants.BLUEBERRY_BUSH.get().getDefaultState();
        protected static final BlockState SAW_PALMETTO = ModPlants.SAW_PALMETTO.get().getDefaultState();
        protected static final BlockState BALD_CYPRESS_ROOTS_LARGE = TreeBlocks.BALD_CYPRESS_AERIAL_ROOT_LARGE.get().getDefaultState();
        protected static final BlockState BALD_CYPRESS_ROOTS_SMALL = TreeBlocks.BALD_CYPRESS_AERIAL_ROOT_SMALL.get().getDefaultState();
        protected static final BlockState DRY_STEPPE_GRASS = ModPlants.DRY_STEPPE_GRASS.get().getDefaultState();
        protected static final BlockState MANZANITA_BUSH = ModPlants.MANZANITA_BUSH.get().getDefaultState();
        protected static final BlockState INKBERRY_BUSH = ModPlants.INKBERRY_BUSH.get().getDefaultState();
        protected static final BlockState INKBERRY_FRUITING_BUSH = ModPlants.INKBERRY_FRUITING_BUSH.get().getDefaultState();
        protected static final BlockState CLOUDBERRY = ModPlants.CLOUDBERRY_PLANT.get().getDefaultState();
        protected static final BlockState FRUITING_CLOUDBERRY = ModPlants.CLOUDBERRY_FRUITING_PLANT.get().getDefaultState();
        protected static final BlockState FLOWERING_CLOUDBERRY = ModPlants.CLOUDBERRY_FLOWERING_PLANT.get().getDefaultState();
        protected static final BlockState EDELWEISS = ModPlants.EDELWEISS.get().getDefaultState();
        protected static final BlockState LUPINUS = ModPlants.LUPINUS.get().getDefaultState();
        protected static final BlockState CLUBMOSS = ModPlants.CLUBMOSS.get().getDefaultState();
        protected static final BlockState CALABASH_VINE = ModPlants.CALABASH_VINE.get().getDefaultState();
        protected static final BlockState SNAKE_PLANT = ModPlants.SNAKE_PLANT.get().getDefaultState();
        protected static final BlockState HYACINTH = ModPlants.HYACINTH.get().getDefaultState();
        protected static final BlockState DAFFODIL_WHITE = ModPlants.DAFFODIL_WHITE.get().getDefaultState();
        protected static final BlockState DAFFODIL_YELLOW = ModPlants.DAFFODIL_YELLOW.get().getDefaultState();
        protected static final BlockState STUART_DESERT_PEA = ModPlants.STUART_DESERT_PEA.get().getDefaultState();
        protected static final BlockState BARREL_CACTUS = ModPlants.BARREL_CACTUS.get().getDefaultState();
        protected static final BlockState CANNA_LILY_YELLOW = ModPlants.CANNA_LILY_YELLOW.get().getDefaultState();
        protected static final BlockState CANNA_LILY_RED = ModPlants.CANNA_LILY_RED.get().getDefaultState();
        protected static final BlockState CANNA_LILY_PURPLE_RED = ModPlants.CANNA_LILY_PURPLE_RED.get().getDefaultState();
        protected static final BlockState BUNCHBERRY = ModPlants.BUNCHBERRY_PLANT.get().getDefaultState();
        protected static final BlockState BUNCHBERRY_FLOWERING = ModPlants.BUNCHBERRY_FLOWERING_PLANT.get().getDefaultState();
        protected static final BlockState BUNCHBERRY_FRUITING = ModPlants.BUNCHBERRY_FRUITING_PLANT.get().getDefaultState();
        protected static final BlockState ALOE_VERA = ModPlants.ALOE_VERA.get().getDefaultState();
        protected static final BlockState PENCIL_TREE = ModPlants.PENCIL_TREE.get().getDefaultState();
        protected static final BlockState PALM_LILY = ModPlants.PALM_LILY.get().getDefaultState();
        protected static final BlockState CREOSOTE = ModPlants.CREOSOTE_BUSH.get().getDefaultState();
        protected static final BlockState CREOSOTE_FLOWERING = ModPlants.CREOSOTE_FLOWERING_BUSH.get().getDefaultState();


    }
}
