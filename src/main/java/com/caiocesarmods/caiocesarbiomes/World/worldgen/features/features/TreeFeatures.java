package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.FoliagePlacers.*;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.TreeDecorators.*;
import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import com.google.common.collect.ImmutableList;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.*;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator;
import net.minecraft.world.gen.trunkplacer.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.OptionalInt;

import static net.minecraft.world.gen.feature.Features.*;

public class TreeFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, CaioCesarBiomesMod.MOD_ID);

    //Weeping Willow
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> WEEPING_WILLOW_BIG = register("big_weeping_willow",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.WEEPING_WILLOW_LOG),
                    new SimpleBlockStateProvider(States.WEEPING_WILLOW_LEAVES),
                    new WeepingFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0)),
                    new DarkOakTrunkPlacer(8,   4, 2),
                    new TwoLayerFeature(1, 0, 2)).setIgnoreVines().build())));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> WEEPING_WILLOW_FANCY = register("weeping_willow_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.WEEPING_WILLOW_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.WEEPING_WILLOW_LEAVES),
                    new WeepingFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0)),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));


    //Holm Oak Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> HOLM_OAK_TREE = register("holm_oak_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.HOLM_OAK_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.HOLM_OAK_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> HOLM_OAK_FANCY_TREE = register("holm_oak_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.HOLM_OAK_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.HOLM_OAK_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Cork Oak Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CORK_OAK_TREE = register("cork_oak_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CORK_OAK_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.CORK_OAK_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CORK_OAK_FANCY_TREE = register("cork_oak_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.CORK_OAK_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.CORK_OAK_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Oak Bushes
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CORK_OAK_SHRUB = register("cork_oak_shrub",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CORK_OAK_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.CORK_OAK_LEAVES),
                    new BushFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(1), 2),
                    new StraightTrunkPlacer(1, 0, 0),
                    new TwoLayerFeature(0, 0, 0))).setIgnoreVines()
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> HOLM_OAK_SHRUB = register("holm_oak_shrub",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.HOLM_OAK_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.HOLM_OAK_LEAVES),
                    new BushFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(1), 2),
                    new StraightTrunkPlacer(1, 0, 0),
                    new TwoLayerFeature(0, 0, 0))).setIgnoreVines()
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> OAK_SHRUB = register("oak_shrub",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.OAK_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.OAK_LEAVES),
                    new BushFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(1), 2),
                    new StraightTrunkPlacer(1, 0, 0),
                    new TwoLayerFeature(0, 0, 0))).setIgnoreVines()
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> RED_OAK_SHRUB = register("red_oak_shrub",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.OAK_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.RED_OAK_LEAVES),
                    new BushFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(1), 2),
                    new StraightTrunkPlacer(1, 0, 0),
                    new TwoLayerFeature(0, 0, 0))).setIgnoreVines()
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES).build()));

    //Oleander Shrubs
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> RED_OLEANDER_SHRUB = register("red_oleander_shrub",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.OLEANDER_LOG),
                    new SimpleBlockStateProvider(States.RED_OLEANDER_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(2, 1, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> WHITE_OLEANDER_SHRUB = register("white_oleander_shrub",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.OLEANDER_LOG),
                    new SimpleBlockStateProvider(States.WHITE_OLEANDER_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(2, 1, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PINK_OLEANDER_SHRUB = register("pink_oleander_shrub",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.OLEANDER_LOG),
                    new SimpleBlockStateProvider(States.PINK_OLEANDER_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(2, 1, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> DARK_PINK_OLEANDER_SHRUB = register("dark_pink_oleander_shrub",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.OLEANDER_LOG),
                    new SimpleBlockStateProvider(States.DARK_PINK_OLEANDER_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(2, 1, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Ocotea Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> OCOTEA_FOREST_TREE = register("forest_ocotea_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.OCOTEA_FOREST_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.OCOTEA_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> OCOTEA_FOREST_FANCY_TREE = register("forest_ocotea_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.OCOTEA_FOREST_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.OCOTEA_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0),
                    new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> OCOTEA_FOREST_FANCY_TREE_WITH_CREEPING_FIG = register(
            "forest_ocotea_fancy_tree_with_creeping_fig",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.OCOTEA_FOREST_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.OCOTEA_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0),
                    new TwoLayerFeature(0, 0, 0, OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING)
                    .setDecorators(ImmutableList.of(CreepingFigTrunkDecorator.INSTANCE)).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> OCOTEA_JUNGLE_TREE_CREEPING_FIG = register("fig_jungle_ocotea_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.OCOTEA_JUNGLE_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.OCOTEA_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new MegaJungleTrunkPlacer(8, 16, 8),
                    new TwoLayerFeature(2, 0, 1)))
                    .setDecorators(ImmutableList.of(CreepingFigTrunkDecorator.INSTANCE)).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> OCOTEA_JUNGLE_FANCY_TREE_CREEPING_FIG = register("fig_jungle_ocotea_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.OCOTEA_JUNGLE_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.OCOTEA_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new MegaJungleTrunkPlacer(8, 16, 8),
                    new TwoLayerFeature(2, 0, 1)))
                    .setDecorators(ImmutableList.of(CreepingFigTrunkDecorator.INSTANCE)).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> OCOTEA_JUNGLE_TREE = register("jungle_ocotea_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.OCOTEA_JUNGLE_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.OCOTEA_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new MegaJungleTrunkPlacer(8, 16, 8),
                    new TwoLayerFeature(2, 0, 1))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> OCOTEA_JUNGLE_FANCY_TREE = register("jungle_ocotea_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.OCOTEA_JUNGLE_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.OCOTEA_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new MegaJungleTrunkPlacer(8, 16, 8),
                    new TwoLayerFeature(2, 0, 1))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> HIGHLAND_OCOTEA_TREE = register("highland_ocotea_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.OCOTEA_JUNGLE_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.OCOTEA_LEAVES),
                    new DarkOakFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0)),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    new ThreeLayerFeature(1, 1, 0, 1, 2,
                            OptionalInt.empty()))).setMaxWaterDepth(Integer.MAX_VALUE).setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> HIGHLAND_OCOTEA_TREE_WITH_CREEPING_VINE = register("highland_ocotea_tree_with_creeping_vine",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.OCOTEA_JUNGLE_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.OCOTEA_LEAVES),
                    new DarkOakFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0)),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    new ThreeLayerFeature(1, 1, 0, 1, 2, OptionalInt.empty()))).setMaxWaterDepth(Integer.MAX_VALUE)
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING).setDecorators(ImmutableList.of(CreepingFigTrunkDecorator.INSTANCE,
                            Features.Placements.BEES_002_PLACEMENT)).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> HIGHLAND_OCOTEA_TREE_WITH_KIWI = register("highland_ocotea_tree_with_kiwi",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.OCOTEA_JUNGLE_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.OCOTEA_LEAVES),
                    new DarkOakFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0)),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    new ThreeLayerFeature(1, 1, 0, 1, 2, OptionalInt.empty()))).setMaxWaterDepth(Integer.MAX_VALUE)
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING).setDecorators(ImmutableList.of(KiwiVineTrunkDecorator.INSTANCE,
                            Features.Placements.BEES_002_PLACEMENT)).build()));

    //Mesquite Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> MESQUITE_TREE = register("mesquite_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.MESQUITE_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.MESQUITE_LEAVES),
                    new JungleFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new ForkyTrunkPlacer(6, 4, 3),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_002_PLACEMENT)).setIgnoreVines().build()));

    //Coast Cottonwood Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> COAST_COTTONWOOD_TREE = register("coast_cottonwood_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.COAST_COTTONWOOD_LOG),
                    new SimpleBlockStateProvider(States.COAST_COTTONWOOD_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> COAST_COTTONWOOD_FANCY_TREE = register("coast_cottonwood_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.COAST_COTTONWOOD_LOG),
                    new SimpleBlockStateProvider(States.COAST_COTTONWOOD_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Fig Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> FIG_TREE = register("fig_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.FIG_LOG),
                    new SimpleBlockStateProvider(States.FIG_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> FORKY_FIG_TREE = register("forky_fig_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.FIG_LOG),
                    new SimpleBlockStateProvider(States.FIG_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new ForkyTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> WHITE_FIG_TREE = register("white_fig_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.FIG_LOG),
                    new SimpleBlockStateProvider(States.WHITE_FIG_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new ForkyTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Olive Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> OLIVE_TREE = register("olive_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.OLIVE_LOG),
                    new SimpleBlockStateProvider(States.OLIVE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> BIG_OLIVE_TREE = register("olive_big_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.OLIVE_LOG),
                    new SimpleBlockStateProvider(States.OLIVE_LEAVES),
                    new DarkOakFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0)),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    new TwoLayerFeature(0, 0, 0, OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Tropical Almond Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> TROPICAL_ALMOND_BIG_TREE = register("tropical_almond_big_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.TROPICAL_ALMOND_LOG),
                    new SimpleBlockStateProvider(States.TROPICAL_ALMOND_LEAVES),
                    new JungleFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new MegaJungleTrunkPlacer(10, 18, 4),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> TROPICAL_ALMOND_TREE = register("tropical_almond_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.TROPICAL_ALMOND_LOG),
                    new SimpleBlockStateProvider(States.TROPICAL_ALMOND_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(1), 3),
                    new StraightTrunkPlacer(8, 6, 0),
                    new TwoLayerFeature(2, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> TROPICAL_ALMOND_WITH_PEPPERCORN = register("tropical_almond_with_peppercorn",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.TROPICAL_ALMOND_LOG),
                    new SimpleBlockStateProvider(States.TROPICAL_ALMOND_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(1), 3),
                    new StraightTrunkPlacer(8, 6, 0),
                    new TwoLayerFeature(2, 0, 1))).setDecorators(ImmutableList.of(PeppercornVineTrunkDecorator.INSTANCE)).build()));

    //Southern Magnolia Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SOUTHERN_MAGNOLIA_TREE = register("southern_magnolia_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.SOUTHERN_MAGNOLIA_LOG),
                    new SimpleBlockStateProvider(States.SOUTHERN_MAGNOLIA_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), FeatureSpread.create(6)),
                    new StraightTrunkPlacer(5, 3, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_002_PLACEMENT)).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SOUTHERN_MAGNOLIA_WITH_KIWI = register("southern_magnolia_with_kiwi",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.SOUTHERN_MAGNOLIA_LOG),
                    new SimpleBlockStateProvider(States.SOUTHERN_MAGNOLIA_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), FeatureSpread.create(6)),
                    new StraightTrunkPlacer(5, 3, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(KiwiVineTrunkDecorator.INSTANCE, Features.Placements.BEES_002_PLACEMENT )).build()));

    //Pomegranate Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> POMEGRANATE_TREE = register("pomegranate_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.POMEGRANATE_LOG),
                    new SimpleBlockStateProvider(States.POMEGRANATE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Crape Myrtle Trees
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> RED_CRAPE_MYRTLE_TREE = register("red_crape_myrtle_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.MYRTLE_LOG),
                    new SimpleBlockStateProvider(States.RED_CRAPE_MYRTLE_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setDecorators(ImmutableList.of(Features.Placements.BEES_002_PLACEMENT))
                    .build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PURPLE_CRAPE_MYRTLE_TREE = register("purple_crape_myrtle_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.MYRTLE_LOG),
                    new SimpleBlockStateProvider(States.PURPLE_CRAPE_MYRTLE_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setDecorators(ImmutableList.of(Features.Placements.BEES_002_PLACEMENT))
                    .build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> WHITE_CRAPE_MYRTLE_TREE = register("white_crape_myrtle_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.MYRTLE_LOG),
                    new SimpleBlockStateProvider(States.WHITE_CRAPE_MYRTLE_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setDecorators(ImmutableList.of(Features.Placements.BEES_002_PLACEMENT))
                    .build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PINK_CRAPE_MYRTLE_TREE = register("pink_crape_myrtle_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.MYRTLE_LOG),
                    new SimpleBlockStateProvider(States.PINK_CRAPE_MYRTLE_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setDecorators(ImmutableList.of(Features.Placements.BEES_002_PLACEMENT))
                    .build()));

    //Southern Wax Myrtle Shrub
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SOUTHERN_WAX_MYRTLE_SHRUB = register("southern_wax_myrtle_shrub",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.MYRTLE_LOG),
                    new SimpleBlockStateProvider(States.SOUTHERN_WAX_MYRTLE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(2, 1, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Stone Pine
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> STONE_PINE_TREE = register("stone_pine_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.STONE_PINE_LOG),
                    new SimpleBlockStateProvider(States.STONE_PINE_LEAVES),
                    new DarkOakFoliagePlacer(FeatureSpread.create(1), FeatureSpread.create(0)),
                    new ForkyTrunkPlacer(8, 6, 0), new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> STONE_PINE_TREE2 = register("stone_pine_tree2",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.STONE_PINE_LOG),
                    new SimpleBlockStateProvider(States.STONE_PINE_LEAVES),
                    new DarkOakFoliagePlacer(FeatureSpread.create(1), FeatureSpread.create(0)),
                    new StraightTrunkPlacer(8, 6, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Indian Coral Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> INDIAN_CORAL_TREE = register("indian_coral_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.ERYTHRINA_LOG),
                    new SimpleBlockStateProvider(States.INDIAN_CORAL_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_0002_PLACEMENT)).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> INDIAN_CORAL_FANCY_TREE = register("indian_coral_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.ERYTHRINA_LOG),
                    new SimpleBlockStateProvider(States.INDIAN_CORAL_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setDecorators(ImmutableList.of(Features.Placements.BEES_005_PLACEMENT))
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Avocado Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> AVOCADO_TREE = register("avocado_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.AVOCADO_LOG),
                    new SimpleBlockStateProvider(States.AVOCADO_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setDecorators(ImmutableList.of(Features.Placements.BEES_002_PLACEMENT))
                    .setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CREEPING_FIG_AVOCADO_TREE = register("creeping_fig_avocado_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.AVOCADO_LOG),
                    new SimpleBlockStateProvider(States.AVOCADO_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING)
                    .setDecorators(ImmutableList.of(CreepingFigTrunkDecorator.INSTANCE, Features.Placements.BEES_002_PLACEMENT)).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PEPPERCORN_AVOCADO_TREE = register("peppercorn_avocado_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.AVOCADO_LOG),
                    new SimpleBlockStateProvider(States.AVOCADO_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING)
                    .setDecorators(ImmutableList.of(PeppercornVineTrunkDecorator.INSTANCE, Features.Placements.BEES_002_PLACEMENT)).build()));

    //Crabapple Trees
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PINK_CRABAPPLE_TREE = register("pink_crabapple_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CRABAPPLE_LOG),
                    new SimpleBlockStateProvider(States.PINK_CRABAPPLE_BLOSSOM),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_005_PLACEMENT)).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> WHITE_CRABAPPLE_TREE = register("white_crabapple_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CRABAPPLE_LOG),
                    new SimpleBlockStateProvider(States.WHITE_CRABAPPLE_BLOSSOM),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_005_PLACEMENT)).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> RED_CRABAPPLE_TREE = register("red_crabapple_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CRABAPPLE_LOG),
                    new SimpleBlockStateProvider(States.RED_CRABAPPLE_BLOSSOM),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_005_PLACEMENT)).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SAPLING_PINK_CRABAPPLE_TREE = register("sapling_pink_crabapple_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CRABAPPLE_LOG),
                    new SimpleBlockStateProvider(States.PINK_CRABAPPLE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_005_PLACEMENT)).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SAPLING_WHITE_CRABAPPLE_TREE = register("sapling_white_crabapple_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CRABAPPLE_LOG),
                    new SimpleBlockStateProvider(States.WHITE_CRABAPPLE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_005_PLACEMENT)).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SAPLING_RED_CRABAPPLE_TREE = register("sapling_red_crabapple_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CRABAPPLE_LOG),
                    new SimpleBlockStateProvider(States.RED_CRABAPPLE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_005_PLACEMENT)).setIgnoreVines().build()));

    //Loquat Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> LOQUAT_TREE = register("loquat_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.LOQUAT_LOG),
                    new SimpleBlockStateProvider(States.LOQUAT_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_0002_PLACEMENT)).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> LOQUAT_TREE_WITH_KIWI = register("loquat_tree_with_kiwi",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.LOQUAT_LOG),
                    new SimpleBlockStateProvider(States.LOQUAT_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(KiwiVineTrunkDecorator.INSTANCE, Features.Placements.BEES_0002_PLACEMENT)).setIgnoreVines().build()));

    //Elderberry Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> ELDERBERRY_TREE = register("elderberry_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.ELDERBERRY_LOG),
                    new SimpleBlockStateProvider(States.ELDERBERRY_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(3, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_0002_PLACEMENT)).setIgnoreVines().build()));

    //Strawberry Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> STRAWBERRY_TREE1 = register("strawberry_tree1",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.STRAWBERRY_TREE_LOG),
                    new SimpleBlockStateProvider(States.STRAWBERRY_TREE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> STRAWBERRY_TREE2 = register("strawberry_tree2",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.STRAWBERRY_TREE_LOG),
                    new SimpleBlockStateProvider(States.STRAWBERRY_TREE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(3), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(6, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Italian Cypress Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> ITALIAN_CYPRESS_TREE = register("italian_cypress_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.ITALIAN_CYPRESS_LOG),
                    new SimpleBlockStateProvider(States.ITALIAN_CYPRESS_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(1, 0), FeatureSpread.create(1, 1), FeatureSpread.create(1, 0)),
                    new StraightTrunkPlacer(16, 2, 1),
                    new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build()));

    //Red Kapok Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> RED_KAPOK_TREE = register("red_kapok_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.JUNGLE_LOG),
                    new SimpleBlockStateProvider(States.RED_KAPOK_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Forest Acacia Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> FOREST_ACACIA_TREE = register("forest_acacia_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.ACACIA_LOG),
                    new SimpleBlockStateProvider(States.ACACIA_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Japanese Maple Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> JAPANESE_MAPLE_TREE = register("japanese_maple_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.JAPANESE_MAPLE_LOG),
                    new SimpleBlockStateProvider(States.JAPANESE_MAPLE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new ForkyTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Mulberry Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> MULBERRY_TREE = register("mulberry_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.MULBERRY_LOG),
                    new SimpleBlockStateProvider(States.MULBERRY_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> MULBERRY_TREE_WITH_KIWI = register("mulberry_tree_with_kiwi",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.MULBERRY_LOG),
                    new SimpleBlockStateProvider(States.MULBERRY_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setDecorators(ImmutableList.of(KiwiVineTrunkDecorator.INSTANCE))
                    .setIgnoreVines().build()));

    //Kiwi vined subtropical forest trees
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> OCOTEA_TREE_WITH_KIWI = register("forest_ocotea_tree_with_kiwi",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.OCOTEA_FOREST_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.OCOTEA_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(KiwiVineTrunkDecorator.INSTANCE)).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> OAK_TREE_WITH_KIWI = register("oak_tree_with_kiwi",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.OAK_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.OAK_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(KiwiVineTrunkDecorator.INSTANCE)).build()));

    //Starfruit Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> STARFRUIT_TREE = register("starfruit_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.STARFRUIT_LOG),
                    new SimpleBlockStateProvider(States.STARFRUIT_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setDecorators(ImmutableList.of(Features.Placements.BEES_0002_PLACEMENT))
                    .setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> STARFRUIT_TREE_WITH_KIWI = register("starfruit_tree_with_kiwi",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.STARFRUIT_LOG),
                    new SimpleBlockStateProvider(States.STARFRUIT_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(KiwiVineTrunkDecorator.INSTANCE))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_0002_PLACEMENT)).setIgnoreVines().build()));

    //Camellia Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CAMELLIA_TREE = register("camellia_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CAMELLIA_LOG),
                    new SimpleBlockStateProvider(States.CAMELLIA_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));


    //Tea Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> TEA_TREE = register("tea_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CAMELLIA_LOG),
                    new SimpleBlockStateProvider(States.TEA_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(1), 2),
                    new StraightTrunkPlacer(2, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));


    //Citrus Trees - Mandarin
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> MANDARIN_TREE = register("mandarin_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CITRUS_LOG),
                    new SimpleBlockStateProvider(States.MANDARIN_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_002_PLACEMENT)).setIgnoreVines().build()));


    //Citrus Trees - Orange
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> ORANGE_TREE = register("orange_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CITRUS_LOG),
                    new SimpleBlockStateProvider(States.ORANGE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_002_PLACEMENT)).setIgnoreVines().build()));


    //Citrus Trees - Lemon
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> LEMON_TREE = register("lemon_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CITRUS_LOG),
                    new SimpleBlockStateProvider(States.LEMON_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(3), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(6, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_002_PLACEMENT))
                    .setIgnoreVines().build()));


    //Citrus Trees - Limes
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> TAHITI_LIME_TREE = register("tahiti_lime_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CITRUS_LOG),
                    new SimpleBlockStateProvider(States.TAHITI_LIME_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(3), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(6, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_002_PLACEMENT)).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> TAHITI_LIME_TREE_WITH_PEPPER_VINE = register("tahiti_lime_tree_with_pepper_vine",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CITRUS_LOG),
                    new SimpleBlockStateProvider(States.TAHITI_LIME_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(3), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(6, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_002_PLACEMENT,
                            PeppercornVineTrunkDecorator.INSTANCE)).setIgnoreVines().build()));

    //Citrus Trees - Citron
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CITRON_TREE = register("citron_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CITRUS_LOG),
                    new SimpleBlockStateProvider(States.CITRON_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(6, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_002_PLACEMENT)).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CITRON_TREE_WITH_PEPPER_VINE = register("citron_tree_with_pepper_vine",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CITRUS_LOG),
                    new SimpleBlockStateProvider(States.CITRON_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(6, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_002_PLACEMENT,
                            PeppercornVineTrunkDecorator.INSTANCE)).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> BUDDHA_HAND_TREE = register("buddha_hand_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CITRUS_LOG),
                    new SimpleBlockStateProvider(States.BUDDAH_HAND_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_002_PLACEMENT)).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> BUDDHA_HAND_TREE_WITH_PEPPER_VINE = register("buddha_hand_tree_with_pepper_vine",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CITRUS_LOG),
                    new SimpleBlockStateProvider(States.BUDDAH_HAND_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_002_PLACEMENT,
                            PeppercornVineTrunkDecorator.INSTANCE)).setIgnoreVines().build()));

    //Citrus Trees - Lemon
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> GRAPEFRUIT_TREE = register("grapefruit_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CITRUS_LOG),
                    new SimpleBlockStateProvider(States.GRAPEFRUIT_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(3), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(6, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> GRAPEFRUIT_TREE_WITH_KIWI = register("grapefruit_tree_with_kiwi",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CITRUS_LOG),
                    new SimpleBlockStateProvider(States.GRAPEFRUIT_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(3), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(6, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(KiwiVineTrunkDecorator.INSTANCE)).setIgnoreVines().build()));

    //Southern Live Oak
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SOUTHERN_LIVE_OAK_TREE = register("southern_live_oak_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.LIVE_OAK_LOG),
                    new SimpleBlockStateProvider(States.LIVE_OAK_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setMaxWaterDepth(1).setHeightmap(Heightmap.Type.MOTION_BLOCKING)
                    .setDecorators(ImmutableList.of(SpanishMossLeavesDecorator.INSTANCE, SpanishMossTrunkDecorator.INSTANCE)).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SOUTHERN_LIVE_OAK_TREE_WITHOUT_MOSS = register("southern_live_oak_tree_without_moss",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.LIVE_OAK_LOG),
                    new SimpleBlockStateProvider(States.LIVE_OAK_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setMaxWaterDepth(1).setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SOUTHERN_LIVE_OAK_WITH_CREEPING_FIG = register("southern_live_oak_with_creeping_fig",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.LIVE_OAK_LOG),
                    new SimpleBlockStateProvider(States.LIVE_OAK_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING)
                    .setDecorators(ImmutableList.of(SpanishMossLeavesDecorator.INSTANCE, CreepingFigTrunkDecorator.INSTANCE)).build()));

    //Royal Poinciana Tree (Tropical Deciduous Forest)
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> ROYAL_POINCIANA_TREE = register("royal_poinciana",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.ROYAL_POINCIANA_LOG),
                    new SimpleBlockStateProvider(States.ROYAL_POINCIANA_LEAVES),
                    new AcaciaFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0)),
                    new ForkyTrunkPlacer(5, 2, 2),
                    new TwoLayerFeature(1, 0, 2))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> ROYAL_POINCIANA_BIG_TREE = register("royal_poinciana_big_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.ROYAL_POINCIANA_LOG),
                    new SimpleBlockStateProvider(States.ROYAL_POINCIANA_LEAVES),
                    new DarkOakFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0)),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    new TwoLayerFeature(0, 0, 0, OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Tamarind Tree (Tropical Deciduous Forest)
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> TAMARIND_TREE = register("tamarind_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.TAMARIND_LOG),
                    new SimpleBlockStateProvider(States.TAMARIND_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> TAMARIND_TREE_WITH_PEPPER_VINE = register("tamarind_tree_with_pepper_vine",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.TAMARIND_LOG),
                    new SimpleBlockStateProvider(States.TAMARIND_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setDecorators(ImmutableList.of(PeppercornVineTrunkDecorator.INSTANCE))
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Eucalyptus Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> EUCALYPTUS_TALL_TREE = register("eucalyptus_tall_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.EUCALYPTUS_LOG),
                    new SimpleBlockStateProvider(States.EUCALYPTUS_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(5, 2, 6),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines()
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_002_PLACEMENT)).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> EUCALYPTUS_FANCY_TREE = register("eucalyptus_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.EUCALYPTUS_LOG),
                    new SimpleBlockStateProvider(States.EUCALYPTUS_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING)
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_005_PLACEMENT)).build()));

    //Casuarina Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PINE_LIKE_CASUARINA_TREE = register("pine_like_casuarina_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CASUARINA_LOG),
                    new SimpleBlockStateProvider(States.CASUARINA_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(3, 0), FeatureSpread.create(3, 2), FeatureSpread.create(3, 0)),
                    new StraightTrunkPlacer(16, 2, 1),
                    new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PEPPERCORN_CASUARINA_TREE = register("casuarina_tree_with_peppercorn",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CASUARINA_LOG),
                    new SimpleBlockStateProvider(States.CASUARINA_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(3, 0), FeatureSpread.create(3, 2), FeatureSpread.create(3, 0)),
                    new StraightTrunkPlacer(16, 2, 1),
                    new TwoLayerFeature(2, 0, 2))).setDecorators(ImmutableList.of(PeppercornVineTrunkDecorator.INSTANCE))
                    .setIgnoreVines().build()));

    //Pohutukawa
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> POHUTUKAWA_TREE = register("pohutukawa_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.POHUTUKAWA_LOG),
                    new SimpleBlockStateProvider(States.POHUTUKAWA_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setDecorators(ImmutableList.of(Features.Placements.BEES_005_PLACEMENT))
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> POHUTUKAWA_TREE_WITH_CREEPING_FIG = register("pohutukawa_tree_with_creeping_fig",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.POHUTUKAWA_LOG),
                    new SimpleBlockStateProvider(States.POHUTUKAWA_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING)
                    .setDecorators(ImmutableList.of(CreepingFigTrunkDecorator.INSTANCE, Placements.BEES_005_PLACEMENT)).build()));

    //Cherry Plum Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CHERRY_PLUM_TREE = register("cherry_plum_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PLUM_LOG),
                    new SimpleBlockStateProvider(States.CHERRY_PLUM_FLOWERING_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(5, 2, 0),
                    new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setDecorators(ImmutableList.of(Features.Placements.BEES_002_PLACEMENT))
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CHERRY_PLUM_FANCY_TREE = register("cherry_plum_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PLUM_LOG),
                    new SimpleBlockStateProvider(States.CHERRY_PLUM_FLOWERING_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(5, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setDecorators(ImmutableList.of(Features.Placements.BEES_002_PLACEMENT))
                    .build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SAPLING_CHERRY_PLUM_TREE = register("sapling_cherry_plum_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PLUM_LOG),
                    new SimpleBlockStateProvider(States.CHERRY_PLUM_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(5, 2, 0),
                    new TwoLayerFeature(0, 0, 0,
                            OptionalInt.of(4)))).setDecorators(ImmutableList.of(Features.Placements.BEES_002_PLACEMENT))
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SAPLING_CHERRY_PLUM_FANCY_TREE = register("sapling_cherry_plum_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PLUM_LOG),
                    new SimpleBlockStateProvider(States.CHERRY_PLUM_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(5, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setDecorators(ImmutableList.of(Features.Placements.BEES_002_PLACEMENT))
                    .build()));

    //Southern Beech
    // Shrub composes the "Mossy Tundra" vegetation, as it shall be renamed to Green Tundra biome and have forest stones.
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SOUTHERN_BEECH_SHRUB = register("southern_beech_shrub",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.NOTHOFAGUS_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.SOUTHERN_BEECH_LEAVES),
                    new BushFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(1), 2),
                    new StraightTrunkPlacer(1, 0, 0),
                    new TwoLayerFeature(0, 0, 0))).setIgnoreVines()
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SOUTHERN_BEECH_TREE = register("southern_beech_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.NOTHOFAGUS_LOG),
                    new SimpleBlockStateProvider(States.SOUTHERN_BEECH_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 4),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(0, 0, 0,
                            OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Black Poplar Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> LOMBARDY_POPLAR_TREE = register("lombardy_poplar_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.BLACK_POPLAR_LOG),
                    new SimpleBlockStateProvider(States.BLACK_POPLAR_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(1, 0), FeatureSpread.create(2, 2), FeatureSpread.create(2, 0)),
                    new StraightTrunkPlacer(12, 2, 1),
                    new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> BLACK_POPLAR_FANCY_TREE = register("black_poplar_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.BLACK_POPLAR_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.BLACK_POPLAR_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Araucaria Trees
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> COOK_PINE_TREE = register("cook_pine_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.ARAUCARIA_LOG),
                    new SimpleBlockStateProvider(States.COOK_PINE_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(2, 0), FeatureSpread.create(2, 2), FeatureSpread.create(2, 0)),
                    new StraightTrunkPlacer(19, 2, 1),
                    new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> COOK_PINE_WITH_PEPPER_VINE = register("cook_pine_tree_with_pepper_vine",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.ARAUCARIA_LOG),
                    new SimpleBlockStateProvider(States.COOK_PINE_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(2, 0), FeatureSpread.create(2, 2), FeatureSpread.create(2, 0)),
                    new StraightTrunkPlacer(19, 2, 1),
                    new TwoLayerFeature(2, 0, 2)))
                    .setDecorators(ImmutableList.of(PeppercornVineTrunkDecorator.INSTANCE, PeppercornVineTrunkDecorator.INSTANCE))
                    .setIgnoreVines().build()));

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> NORFOLK_ISLAND_PINE_TREE = register("norfolk_island_pine_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.ARAUCARIA_LOG),
                    new SimpleBlockStateProvider(States.NORFOLK_PINE_LEAVES),
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(13, 4)),
                    new StraightTrunkPlacer(16, 2, 1),
                    new TwoLayerFeature(1, 1, 2)))
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> NORFOLK_ISLAND_PINE_WITH_PEPPER_VINE =
            register("norfolk_island_pine_with_pepper_vine",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.ARAUCARIA_LOG),
                    new SimpleBlockStateProvider(States.NORFOLK_PINE_LEAVES),
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(13, 4)),
                    new StraightTrunkPlacer(16, 2, 1),
                    new TwoLayerFeature(1, 1, 2)))
                    .setDecorators(ImmutableList.of(PeppercornVineTrunkDecorator.INSTANCE, PeppercornVineTrunkDecorator.INSTANCE,
                            new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).setIgnoreVines().build()));

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> MONKEY_PUZZLE_TREE = register("monkey_puzzle_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.ARAUCARIA_LOG),
                    new SimpleBlockStateProvider(States.MONKEY_PUZZLE_LEAVES),
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(3, 4)),
                    new GiantTrunkPlacer(13, 2, 14),
                    new TwoLayerFeature(1, 1, 2)))
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> YOUNG_MONKEY_PUZZLE_TREE = register("young_monkey_puzzle_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.ARAUCARIA_LOG),
                    new SimpleBlockStateProvider(States.MONKEY_PUZZLE_LEAVES),
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(13, 4)),
                    new StraightTrunkPlacer(6, 2, 14),
                    new TwoLayerFeature(1, 1, 2)))
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> BUNYA_PINE_TREE = register("bunya_pine_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.ARAUCARIA_LOG),
                    new SimpleBlockStateProvider(States.BUNYA_PINE_LEAVES),
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(4, 5)),
                    new GiantTrunkPlacer(13, 2, 14),
                    new TwoLayerFeature(1, 1, 2)))
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> YOUNG_BUNYA_PINE_TREE = register("young_bunya_pine_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.ARAUCARIA_LOG),
                    new SimpleBlockStateProvider(States.BUNYA_PINE_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(3, 0), FeatureSpread.create(3, 3), FeatureSpread.create(3, 0)),
                    new StraightTrunkPlacer(6, 2, 14),
                    new TwoLayerFeature(1, 1, 2)))
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));


    //Jungle Fig Trees
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> WEEPING_FIG_TREE = register("weeping_fig_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.JUNGLE_FIG_LOG),
                    new SimpleBlockStateProvider(States.WEEPING_FIG_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> BIG_WEEPING_FIG_TREE = register("weeping_fig_big_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.JUNGLE_FIG_LOG),
                    new SimpleBlockStateProvider(States.WEEPING_FIG_LEAVES),
                    new DarkOakFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0)),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    new TwoLayerFeature(0, 0, 0, OptionalInt.of(4))))
                    .setDecorators(ImmutableList.of(FicusRootsDecorator.INSTANCE))
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> WEEPING_FIG_WITH_CREEPING_FIG = register("creeping_fig_weeping_fig_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.JUNGLE_FIG_LOG),
                    new SimpleBlockStateProvider(States.WEEPING_FIG_LEAVES),
                    new DarkOakFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0)),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    new TwoLayerFeature(0, 0, 0, OptionalInt.of(4))))
                    .setDecorators(ImmutableList.of(FicusRootsDecorator.INSTANCE, CreepingFigTrunkDecorator.INSTANCE, CreepingFigLeavesDecorator.INSTANCE))
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> INDIAN_LAUREL_TREE = register("indian_laurel_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.JUNGLE_FIG_LOG),
                    new SimpleBlockStateProvider(States.INDIAN_LAUREL_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> BIG_INDIAN_LAUREL_TREE = register("indian_laurel_big_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.JUNGLE_FIG_LOG),
                    new SimpleBlockStateProvider(States.INDIAN_LAUREL_LEAVES),
                    new DarkOakFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0)),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    new TwoLayerFeature(0, 0, 0, OptionalInt.of(4))))
                    .setDecorators(ImmutableList.of(FicusRootsDecorator.INSTANCE))
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> INDIAN_LAUREL_WITH_CREEPING_FIG = register("creeping_fig_indian_laurel_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.JUNGLE_FIG_LOG),
                    new SimpleBlockStateProvider(States.INDIAN_LAUREL_LEAVES),
                    new DarkOakFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0)),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    new TwoLayerFeature(0, 0, 0, OptionalInt.of(4))))
                    .setDecorators(ImmutableList.of(FicusRootsDecorator.INSTANCE, CreepingFigTrunkDecorator.INSTANCE, CreepingFigLeavesDecorator.INSTANCE))
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> RUBBER_TREE = register("rubber_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.JUNGLE_FIG_LOG),
                    new SimpleBlockStateProvider(States.RUBBER_TREE_LEAVES),
                    new DarkOakFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0)),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    new TwoLayerFeature(0, 0, 0, OptionalInt.of(4))))
                    .setDecorators(ImmutableList.of(FicusRootsDecorator.INSTANCE))
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> RUBBER_TREE_WITH_CREEPING_FIG = register("creeping_fig_rubber_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.JUNGLE_FIG_LOG),
                    new SimpleBlockStateProvider(States.RUBBER_TREE_LEAVES),
                    new DarkOakFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0)),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    new TwoLayerFeature(0, 0, 0, OptionalInt.of(4))))
                    .setDecorators(ImmutableList.of(FicusRootsDecorator.INSTANCE, CreepingFigTrunkDecorator.INSTANCE, CreepingFigLeavesDecorator.INSTANCE))
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PEPPERCORN_RUBBER_TREE = register("peppercorn_rubber_fig",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.JUNGLE_FIG_LOG),
                    new SimpleBlockStateProvider(States.RUBBER_TREE_LEAVES),
                    new DarkOakFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0)),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    new TwoLayerFeature(0, 0, 0, OptionalInt.of(4))))
                    .setDecorators(ImmutableList.of(FicusRootsDecorator.INSTANCE, PeppercornVineTrunkDecorator.INSTANCE))
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    //Jungle Figs with Peppercorn Vine
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PEPPERCORN_WEEPING_FIG_TREE = register("weeping_fig_peppercorn",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.JUNGLE_FIG_LOG),
                    new SimpleBlockStateProvider(States.WEEPING_FIG_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(PeppercornVineTrunkDecorator.INSTANCE)).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PEPPERCORN_BIG_WEEPING_FIG_TREE = register("peppercorn_big_weeping_fig",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.JUNGLE_FIG_LOG),
                    new SimpleBlockStateProvider(States.WEEPING_FIG_LEAVES),
                    new DarkOakFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0)),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    new TwoLayerFeature(0, 0, 0, OptionalInt.of(4))))
                    .setDecorators(ImmutableList.of(FicusRootsDecorator.INSTANCE, PeppercornVineTrunkDecorator.INSTANCE))
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PEPPERCORN_INDIAN_LAUREL_TREE = register("peppercorn_indian_laurel",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.JUNGLE_FIG_LOG),
                    new SimpleBlockStateProvider(States.INDIAN_LAUREL_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setDecorators(ImmutableList.of(PeppercornVineTrunkDecorator.INSTANCE)).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PEPPERCORN_BIG_INDIAN_LAUREL_TREE = register("peppercorn_indian_laurel_big",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.JUNGLE_FIG_LOG),
                    new SimpleBlockStateProvider(States.INDIAN_LAUREL_LEAVES),
                    new DarkOakFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0)),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    new TwoLayerFeature(0, 0, 0, OptionalInt.of(4))))
                    .setDecorators(ImmutableList.of(FicusRootsDecorator.INSTANCE, PeppercornVineTrunkDecorator.INSTANCE))
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Holly Trees
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> HOLLY_TREE1 = register("holly_tree1",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.ILEX_LOG),
                    new SimpleBlockStateProvider(States.HOLLY_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(2, 1), FeatureSpread.create(0, 2),
                            FeatureSpread.create(1, 1)),
                    new StraightTrunkPlacer(5, 2, 1),
                    new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> HOLLY_TREE2 = register("holly_tree1",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.ILEX_LOG),
                    new SimpleBlockStateProvider(States.HOLLY_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Red Oak Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> RED_OAK_TREE = register("red_oak_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.OAK_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.RED_OAK_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> RED_OAK_FANCY_TREE = register("red_oak_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.OAK_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.RED_OAK_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    //Only in zone 8/temperate swamp
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PIN_RED_OAK_TREE = register("pin_red_oak_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.OAK_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.RED_OAK_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(2, 1),
                            FeatureSpread.create(0, 2), FeatureSpread.create(1, 1)),
                    new StraightTrunkPlacer(5, 2, 1),
                    new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> KIWI_PIN_RED_OAK_TREE = register("kiwi_pin_red_oak_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.OAK_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.RED_OAK_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(2, 1),
                            FeatureSpread.create(0, 2), FeatureSpread.create(1, 1)),
                    new StraightTrunkPlacer(5, 2, 1),
                    new TwoLayerFeature(2, 0, 2)))
                    .setDecorators(ImmutableList.of(KiwiVineTrunkDecorator.INSTANCE)).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CREEPING_FIG_PIN_RED_OAK_TREE = register("creeping_fig_pin_red_oak_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.OAK_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.RED_OAK_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(2, 1),
                            FeatureSpread.create(0, 2), FeatureSpread.create(1, 1)),
                    new StraightTrunkPlacer(5, 2, 1),
                    new TwoLayerFeature(2, 0, 2)))
                    .setDecorators(ImmutableList.of(CreepingFigTrunkDecorator.INSTANCE)).setIgnoreVines().build()));

    //Yew Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> YEW_TREE = register("yew_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.YEW_LOG),
                    new SimpleBlockStateProvider(States.YEW_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(3), FeatureSpread.create(0), 3),
                    new MegaJungleTrunkPlacer(6, 2, 0),
                    new TwoLayerFeature(0, 0, 0,
                            OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING)
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> YEW_TREE_WITH_IVY = register("yew_tree_with_ivy",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.YEW_LOG),
                    new SimpleBlockStateProvider(States.YEW_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(3), FeatureSpread.create(0), 3),
                    new MegaJungleTrunkPlacer(6, 2, 0),
                    new TwoLayerFeature(0, 0, 0,
                            OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING).setDecorators(ImmutableList.of(IvyTrunkDecorator.INSTANCE,
                    new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));

    //Dragon Blood Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> DRAGON_BLOOD_TREE = register("dragon_blood_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.DRAGON_BLOOD_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.DRAGON_BLOOD_LEAVES),
                    new JungleFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 2),
                    new GiantTrunkPlacer(9, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Western Hemlock Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> WESTERN_HEMLOCK_TREE = register("western_hemlock_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.WESTERN_HEMLOCK_LOG),
                    new SimpleBlockStateProvider(States.WESTERN_HEMLOCK_LEAVES),
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(13, 4)),
                    new StraightTrunkPlacer(17, 2, 10),
                    new TwoLayerFeature(1, 1, 2)))
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> WESTERN_HEMLOCK_TREE_TALL = register("western_hemlock_tall_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.WESTERN_HEMLOCK_LOG),
                    new SimpleBlockStateProvider(States.WESTERN_HEMLOCK_LEAVES),
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(13, 4)),
                    new StraightTrunkPlacer(14, 2, 14),
                    new TwoLayerFeature(1, 1, 2)))
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> WESTERN_HEMLOCK_WITH_CREEPING_FIG = register("western_hemlock_with_creeping_fig",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.WESTERN_HEMLOCK_LOG),
                    new SimpleBlockStateProvider(States.WESTERN_HEMLOCK_LEAVES),
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(13, 4)),
                    new StraightTrunkPlacer(17, 2, 10),
                    new TwoLayerFeature(1, 1, 2)))
                    .setDecorators(ImmutableList.of(CreepingFigTrunkDecorator.INSTANCE,
                            new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> WESTERN_HEMLOCK_WITH_IVY = register("western_hemlock_with_ivy",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.WESTERN_HEMLOCK_LOG),
                    new SimpleBlockStateProvider(States.WESTERN_HEMLOCK_LEAVES),
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(13, 4)),
                    new StraightTrunkPlacer(17, 2, 10),
                    new TwoLayerFeature(1, 1, 2)))
                    .setDecorators(ImmutableList.of(IvyTrunkDecorator.INSTANCE,
                            new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));

    //Cooper Beech Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> COOPER_BEECH_TREE = register("cooper_beech_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.BEECH_LOG),
                    new SimpleBlockStateProvider(States.COOPER_BEECH_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 4),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(0, 0, 0,
                            OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> COOPER_BEECH_BIG_TREE = register("cooper_beech_big_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.BEECH_LOG),
                    new SimpleBlockStateProvider(States.COOPER_BEECH_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 4),
                    new MegaJungleTrunkPlacer(6, 2, 0),
                    new TwoLayerFeature(0, 0, 0,
                            OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Sycamore fig tree (native of dry biomes, it has Fig Log and fancy tree shape and must grow in Savannah, Tropical Desert or mediterranean dry scrub)
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SYCAMORE_FIG_TREE = register("sycamore_fig_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.FIG_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.SYCAMORE_FIG_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SYCAMORE_FIG_FANCY_TREE = register("sycamore_fig_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.FIG_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.SYCAMORE_FIG_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SYCAMORE_FIG_ANCIENT_TREE = register("ancient_sycamore_fig_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.FIG_LOG),
                    new SimpleBlockStateProvider(States.SYCAMORE_FIG_LEAVES),
                    new DarkOakFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0)),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    new TwoLayerFeature(0, 0, 0, OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Plane tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PLANE_TREE = register("plane_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PLANE_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.PLANE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_0002_PLACEMENT)).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PLANE_FANCY_TREE = register("plane_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.PLANE_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.PLANE_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setDecorators(ImmutableList.of(Features.Placements.BEES_0002_PLACEMENT))
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PLANE_TREE_WITH_KIWI = register("plane_tree_with_kiwi",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PLANE_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.PLANE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(KiwiVineTrunkDecorator.INSTANCE, Features.Placements.BEES_005_PLACEMENT))
                    .setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PLANE_FANCY_TREE_WITH_IVY = register("ivy_plane_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.PLANE_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.PLANE_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setDecorators(ImmutableList.of(IvyTrunkDecorator.INSTANCE,
                            Features.Placements.BEES_0002_PLACEMENT))
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PLANE_TREE_WITH_IVY = register("plane_tree_with_ivy",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PLANE_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.PLANE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(IvyTrunkDecorator.INSTANCE, Features.Placements.BEES_005_PLACEMENT))
                    .setIgnoreVines().build()));

    //Desert Rose Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SOCOTRA_DESERT_ROSE_TREE = register("socotra_desert_rose_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.DESERT_ROSE_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.DESERT_ROSE_LEAVES),
                    new DarkOakFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0)),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    new TwoLayerFeature(0, 0, 0, OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Acacia-like conifers
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> JAPANESE_PINE_TREE = register("japanese_pine_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.JAPANESE_PINE_LOG),
                    new SimpleBlockStateProvider(States.JAPANESE_PINE_LEAVES),
                    new AcaciaFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0)),
                    new ForkyTrunkPlacer(5, 2, 2),
                    new TwoLayerFeature(1, 0, 2))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CHINESE_RED_PINE_TREE = register("chinese_pine_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CHINESE_RED_PINE_LOG),
                    new SimpleBlockStateProvider(States.CHINESE_RED_PINE_LEAVES),
                    new AcaciaFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0)),
                    new ForkyTrunkPlacer(5, 2, 2),
                    new TwoLayerFeature(1, 0, 2))).setIgnoreVines().build()));

    /*public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> MONTEREY_CYPRESS_TREE = register("monterey_cypress_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.MONTEREY_CYPRESS_LOG),
                    new SimpleBlockStateProvider(States.MONTEREY_CYPRESS_LEAVES),
                    new AcaciaFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0)),
                    new ForkyTrunkPlacer(5, 2, 2),
                    new TwoLayerFeature(1, 0, 2))).setIgnoreVines().build()));*/

    //Socotra Cucumber Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SOCOTRA_CUCUMBER_TREE = register("socotra_cucumber_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.SOCOTRA_CUCUMBER_LOG),
                    new SimpleBlockStateProvider(States.SOCOTRA_CUCUMBER_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 4),
                    new MegaJungleTrunkPlacer(3, 13, 0),
                    new TwoLayerFeature(0, 0, 0,
                            OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING)
                    .setDecorators(ImmutableList.of(CucumberTreeVinesDecorator.INSTANCE)).build()));

    //Sabal Palm
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SABAL_PALM_TREE = register("sabal_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.SABAL_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.SABAL_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(8, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SABAL_PALM_FANCY_TREE = register("sabal_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.SABAL_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.SABAL_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(8, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).build()));

    //Date Palm
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> DATE_PALM_TREE = register("date_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.DATE_LOG),
                    new SimpleBlockStateProvider(States.DATE_LEAVES),
                    new DateFoliagePlacer(FeatureSpread.create(1), FeatureSpread.create(0)),
                    new StraightTrunkPlacer(10, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CANARY_DATE_PALM_TREE = register("canary_date_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CANARY_DATE_LOG),
                    new SimpleBlockStateProvider(States.CANARY_DATE_LEAVES),
                    new CanaryDateFoliagePlacer(FeatureSpread.create(1), FeatureSpread.create(0)),
                    new GiantTrunkPlacer(13, 4, 0),
                    new TwoLayerFeature(1, 0, 1))).build()));

    //Coconut Palm
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> COCONUT_PALM_TREE = register("coconut_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.COCONUT_LOG),
                    new SimpleBlockStateProvider(States.COCONUT_LEAVES),
                    new CoconutFoliagePlacer(FeatureSpread.create(1), FeatureSpread.create(0)),
                    new StraightTrunkPlacer(10, 20, 4),
                    new TwoLayerFeature(1, 0, 1))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SMALL_COCONUT_PALM_TREE = register("small_coconut_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.COCONUT_LOG),
                    new SimpleBlockStateProvider(States.COCONUT_LEAVES),
                    new CoconutFoliagePlacer(FeatureSpread.create(1), FeatureSpread.create(0)),
                    new StraightTrunkPlacer(10, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SMALL_COCONUT_PALM_WITH_PEPPERCORN = register("small_coconut_tree_with_peppercorn",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.COCONUT_LOG),
                    new SimpleBlockStateProvider(States.COCONUT_LEAVES),
                    new CoconutFoliagePlacer(FeatureSpread.create(1), FeatureSpread.create(0)),
                    new StraightTrunkPlacer(10, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setDecorators(ImmutableList.of(PeppercornVineTrunkDecorator.INSTANCE)).build()));


    //Sweet Chestnut
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SWEET_CHESTNUT_TREE = register("sweet_chestnut_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.SWEET_CHESTNUT_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.SWEET_CHESTNUT_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines()
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_005_PLACEMENT)).setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    //The big chestnut variant spawns only in Temperate Rainforest, Roofed Forests, Subtropical Jungle and Laurel Montane Grove.
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> BIG_SWEET_CHESTNUT_TREE = register("sweet_chestnut_big_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.SWEET_CHESTNUT_LOG),
                    new SimpleBlockStateProvider(States.SWEET_CHESTNUT_LEAVES),
                    new DarkOakFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0)),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    new TwoLayerFeature(0, 0, 0, OptionalInt.of(4))))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_002_PLACEMENT)).setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Carob Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CAROB_TREE = register("carob_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CAROB_LOG),
                    new SimpleBlockStateProvider(States.CAROB_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new ForkyTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Pistachio Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PISTACHIO_TREE = register("pistachio_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PISTACHIO_LOG),
                    new SimpleBlockStateProvider(States.PISTACHIO_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(3), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).build()));

    //Oak with Ivy
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> OAK_TREE_WITH_IVY = register("oak_with_ivy",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.OAK_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.OAK_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> FANCY_OAK_TREE_WITH_IVY = register("fancy_oak_with_ivy",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.OAK_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.OAK_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setDecorators(ImmutableList.of(IvyTrunkDecorator.INSTANCE))
                    .setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> DARK_OAK_WITH_IVY = register("dark_oak_with_ivy",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.DARK_OAK_LOG),
                    new SimpleBlockStateProvider(States.DARK_OAK_LEAVES),
                    new DarkOakFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0)),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    new ThreeLayerFeature(1, 1, 0, 1, 2,
                            OptionalInt.empty()))).setDecorators(ImmutableList.of(IvyTrunkDecorator.INSTANCE))
                    .setMaxWaterDepth(Integer.MAX_VALUE).setHeightmap(Heightmap.Type.MOTION_BLOCKING)
                    .setIgnoreVines().build()));

    //Pecan
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PECAN_TREE = register("pecan_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PECAN_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.PECAN_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PECAN_FANCY_TREE = register("pecan_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.PECAN_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.PECAN_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Mango
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> MANGO_FANCY_TREE = register("mango_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.MANGO_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.MANGO_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> MANGO_TREE = register("mango_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.MANGO_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.MANGO_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Walnut
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> WALNUT_FANCY_TREE = register("walnut_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.WALNUT_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.WALNUT_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> WALNUT_TREE = register("walnut_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.WALNUT_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.WALNUT_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Juniper
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> JUNIPER_TREE = register("juniper_tree", Feature.TREE.withConfiguration((
            new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.JUNIPER_LOG),
                    new SimpleBlockStateProvider(States.JUNIPER_LEAVES),
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(13, 4)),
                    new GiantTrunkPlacer(6, 2, 14),
                    new TwoLayerFeature(1, 1, 2)))
            .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> JUNIPER_SHRUB = register("juniper_shrub",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.JUNIPER_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.JUNIPER_LEAVES),
                    new BushFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(1), 2),
                    new StraightTrunkPlacer(1, 0, 0),
                    new TwoLayerFeature(0, 0, 0))).setIgnoreVines()
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES).build()));

    //Pinyon
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PINYON_TREE  = register("pinyon_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.PINYON_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.PINYON_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(7, 9, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING)
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));

    //Ginkgo
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CONIC_GINKGO_TREE = register("conic_ginkgo_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.GINKGO_LOG),
                    new SimpleBlockStateProvider(States.GINKGO_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), FeatureSpread.create(6)),
                    new StraightTrunkPlacer(8, 3, 0),
                    new TwoLayerFeature(1, 0, 1))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> BLOB_GINKGO_TREE = register("ginkgo_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.GINKGO_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.GINKGO_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> GINKGO_FANCY_TREE = register("ginkgo_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.GINKGO_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.GINKGO_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));


    //Red Maple Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> RED_MAPLE_TREE = register("tall_red_maple_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.JAPANESE_MAPLE_LOG),
                    new SimpleBlockStateProvider(States.RED_MAPLE_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), FeatureSpread.create(6)),
                    new StraightTrunkPlacer(8, 3, 0),
                    new TwoLayerFeature(1, 0, 1))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> RED_MAPLE_TREE_WITH_KIWI = register("red_maple_tree_with_kiwi",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.JAPANESE_MAPLE_LOG),
                    new SimpleBlockStateProvider(States.RED_MAPLE_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), FeatureSpread.create(6)),
                    new StraightTrunkPlacer(8, 3, 0),
                    new TwoLayerFeature(1, 0, 1))).setDecorators(ImmutableList.of((KiwiVineTrunkDecorator.INSTANCE))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> RED_MAPLE_TREE_WITH_CREEPING_FIG = register("red_maple_tree_with_creeping_fig",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.JAPANESE_MAPLE_LOG),
                    new SimpleBlockStateProvider(States.RED_MAPLE_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), FeatureSpread.create(6)),
                    new StraightTrunkPlacer(8, 3, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(CreepingFigTrunkDecorator.INSTANCE)).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> BLOB_RED_MAPLE_TREE = register("red_maple_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.JAPANESE_MAPLE_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.RED_MAPLE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> RED_MAPLE_FANCY_TREE = register("red_maple_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.JAPANESE_MAPLE_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.RED_MAPLE_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Douglas Fir
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> GIANT_DOUGLAS_FIR_TREE = register("giant_douglas_fir",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.DOUGLAS_FIR_LOG),
                    new SimpleBlockStateProvider(States.DOUGLAS_FIR_LEAVES),
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(13, 4)),
                    new GiantTrunkPlacer(13, 2, 14),
                    new TwoLayerFeature(1, 1, 2)))
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> DOUGLAS_FIR_TREE = register("douglas_fir",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.DOUGLAS_FIR_LOG),
                    new SimpleBlockStateProvider(States.DOUGLAS_FIR_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(2, 1), FeatureSpread.create(0, 2),
                            FeatureSpread.create(1, 1)),
                    new StraightTrunkPlacer(5, 2, 1),
                    new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build()));


    //Blue Spruce
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> BLUE_SPRUCE = register("blue_spruce",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.SPRUCE_LOG),
                    new SimpleBlockStateProvider(States.BLUE_SPRUCE_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(2, 1), FeatureSpread.create(0, 2),
                            FeatureSpread.create(1, 1)),
                    new StraightTrunkPlacer(5, 2, 1),
                    new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build()));

    //Ponderosa Pine
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PONDEROSA_PINE_TREE = register("ponderosa_pine_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PONDEROSA_PINE_LOG),
                    new SimpleBlockStateProvider(States.PONDEROSA_PINE_LEAVES),
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(13, 4)),
                    new StraightTrunkPlacer(17, 2, 10),
                    new TwoLayerFeature(1, 1, 2)))
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PONDEROSA_PINE_TREE_TALL = register("ponderosa_pine_tall_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PONDEROSA_PINE_LOG),
                    new SimpleBlockStateProvider(States.PONDEROSA_PINE_LEAVES),
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(13, 4)),
                    new StraightTrunkPlacer(14, 2, 14),
                    new TwoLayerFeature(1, 1, 2)))
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));

    //Canary Pine
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CANARY_PINE_TREE = register("canary_pine_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CANARY_PINE_LOG),
                    new SimpleBlockStateProvider(States.CANARY_PINE_LEAVES),
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(13, 4)),
                    new StraightTrunkPlacer(10, 2, 10),
                    new TwoLayerFeature(1, 1, 2)))
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CANARY_PINE_TREE_TALL = register("canary_pine_tall_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CANARY_PINE_LOG),
                    new SimpleBlockStateProvider(States.CANARY_PINE_LEAVES),
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(13, 4)),
                    new StraightTrunkPlacer(14, 2, 14),
                    new TwoLayerFeature(1, 1, 2)))
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));

    //Rowan Trees
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> ROWAN_TREE1 = register("rowan_tree1",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.ROWAN_LOG),
                    new SimpleBlockStateProvider(States.ROWAN_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(3), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(6, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_005_PLACEMENT)).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> ROWAN_TREE2 = register("rowan_tree2",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.ROWAN_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.ROWAN_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_0002_PLACEMENT)).setIgnoreVines().build()));

    //Almond Trees
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> ALMOND_TREE1 = register("almond_tree1",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PLUM_LOG),
                    new SimpleBlockStateProvider(States.ALMOND_BLOSSOM),
                    new BlobFoliagePlacer(FeatureSpread.create(3), FeatureSpread.create(2), 3),
                    new StraightTrunkPlacer(6, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_005_PLACEMENT)).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> ALMOND_TREE2 = register("almond_tree2",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PLUM_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.ALMOND_BLOSSOM),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_0002_PLACEMENT)).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SAPLING_ALMOND_TREE1 = register("sapling_almond_tree1",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PLUM_LOG),
                    new SimpleBlockStateProvider(States.ALMOND_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(3), FeatureSpread.create(2), 3),
                    new StraightTrunkPlacer(6, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_005_PLACEMENT)).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SAPLING_ALMOND_TREE2 = register("sapling_almond_tree2",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PLUM_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.ALMOND_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_0002_PLACEMENT)).setIgnoreVines().build()));

    //Hazelnut Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> HAZELNUT_TREE = register("hazelnut_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.HAZELNUT_LOG),
                    new SimpleBlockStateProvider(States.HAZELNUT_SPRING_BLOOM),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SAPLING_HAZELNUT_TREE = register("sapling_hazelnut_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.HAZELNUT_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.HAZELNUT_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Sausage Tree (savanna)
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SAUSAGE_TREE = register("sausage_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.SAUSAGE_TREE_LOG),
                    new SimpleBlockStateProvider(States.SAUSAGE_TREE_LEAVES),
                    new AcaciaFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0)),
                    new ForkyTrunkPlacer(5, 2, 2),
                    new TwoLayerFeature(1, 0, 2))).setIgnoreVines().build()));

    //Hawthorn
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> HAWTHORN_TREE = register("hawthorn_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.HAWTHORN_LOG),
                    new SimpleBlockStateProvider(States.HAWTHORN_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(3), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(0, 0, 0,
                            OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Breadfruit (jungle)
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> BREADFRUIT_TREE = register("breadfruit_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.JUNGLE_LOG),
                    new SimpleBlockStateProvider(States.BREADFRUIT_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(3), FeatureSpread.create(4), FeatureSpread.create(6)),
                    new StraightTrunkPlacer(12, 6, 0),
                    new TwoLayerFeature(1, 0, 1))).build()));

    //Durian (jungle)
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> DURIAN_TREE = register("durian_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.JUNGLE_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.DURIAN_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> DURIAN_TREE_PEPPER_VINE = register("durian_tree_with_pepper_vine",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.JUNGLE_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.DURIAN_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setDecorators(ImmutableList.of(PeppercornVineTrunkDecorator.INSTANCE))
                    .setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Marula (savanna)
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> MARULA_TREE = register("marula_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.MARULA_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.MARULA_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Bismarck Palm (savanna)
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> TALL_BISMARCK_PALM = register("bismarck_palm_tall",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.BISMARCK_PALM_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.BISMARCK_PALM_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(10, 2, 4),
                    new TwoLayerFeature(1, 0, 1))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> BISMARCK_PALM = register("bismarck_palm",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.BISMARCK_PALM_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.BISMARCK_PALM_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(6, 2, 4),
                    new TwoLayerFeature(1, 0, 1))).build()));

    //Oil Palm (tropical deciduous forest)
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> OIL_PALM_TREE = register("oil_palm_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.OIL_PALM_LOG),
                    new SimpleBlockStateProvider(States.OIL_PALM_LEAVES),
                    new OilPalmFoliagePlacer(FeatureSpread.create(1), FeatureSpread.create(0)),
                    new StraightTrunkPlacer(10, 4, 0),
                    new TwoLayerFeature(1, 0, 1))).build()));

    //Jackalberry Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> JACKALBERRY_FANCY_TREE = register("jackalberry_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.PERSIMMON_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.JACKALBERRY_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> JACKALBERRY_TREE = register("jackalberry_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PERSIMMON_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.JACKALBERRY_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Mountain Biome
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> MUGO_PINE_SHRUB = register("mugo_pine_shrub",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.MUGO_PINE_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.MUGO_PINE_LEAVES),
                    new BushFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(1), 2),
                    new StraightTrunkPlacer(1, 0, 0),
                    new TwoLayerFeature(0, 0, 0))).setIgnoreVines()
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> MUGO_PINE_TREE = register("mugo_pine_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.MUGO_PINE_LOG),
                    new SimpleBlockStateProvider(States.MUGO_PINE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new ForkyTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> MOUNTAIN_HEMLOCK_TREE = register("mountain_hemlock_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.WESTERN_HEMLOCK_LOG),
                    new SimpleBlockStateProvider(States.MOUNTAIN_HEMLOCK_LEAVES),
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(13, 4)),
                    new StraightTrunkPlacer(17, 2, 10),
                    new TwoLayerFeature(1, 1, 2)))
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> MOUNTAIN_HEMLOCK_TREE_TALL = register("mountain_hemlock_tall_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.WESTERN_HEMLOCK_LOG),
                    new SimpleBlockStateProvider(States.MOUNTAIN_HEMLOCK_LEAVES),
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(13, 4)),
                    new StraightTrunkPlacer(14, 2, 14),
                    new TwoLayerFeature(1, 1, 2)))
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SUBALPINE_FIR = register("subalpine_fir",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.SUBALPINE_FIR_LOG),
                    new SimpleBlockStateProvider(States.SUBALPINE_FIR_LEAVES),
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(17, 2)),
                    new StraightTrunkPlacer(17, 2, 10),
                    new TwoLayerFeature(1, 1, 2)))
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).setIgnoreVines().build()));

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> WHITE_FIR = register("white_fir",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.SUBALPINE_FIR_LOG),
                    new SimpleBlockStateProvider(States.WHITE_FIR_LEAVES),
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(17, 2)),
                    new StraightTrunkPlacer(17, 2, 10),
                    new TwoLayerFeature(1, 1, 2)))
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).setIgnoreVines().build()));

    //Southern yellow pines
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SLASH_PINE = register("slash_pine",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.SLASH_PINE_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.SLASH_PINE_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING)
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> LOBLOLLY_PINE = register("loblolly_pine",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.SLASH_PINE_LOG),
                    new SimpleBlockStateProvider(States.LOBLOLLY_PINE_LEAVES),
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(13, 4)),
                    new StraightTrunkPlacer(14, 2, 14),
                    new TwoLayerFeature(1, 1, 2)))
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> TALL_LOBLOLLY_PINE = register("tall_loblolly_pine",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.SLASH_PINE_LOG),
                    new SimpleBlockStateProvider(States.LOBLOLLY_PINE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(3), FeatureSpread.create(1), 3),
                    new StraightTrunkPlacer(16, 5, 2),
                    new TwoLayerFeature(2, 0, 2)))
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));



    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PEPPERCORN_JUNGLE_TREE = register("peppercorn_jungle_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.JUNGLE_LOG),
                    new SimpleBlockStateProvider(States.JUNGLE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 8, 0),
                    new TwoLayerFeature(1, 0, 1)))
                    .setDecorators(ImmutableList.of(PeppercornVineTrunkDecorator.INSTANCE))
                    .setIgnoreVines().build()));

    //Persimmon
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PERSIMMON_FANCY_TREE = register("persimmon_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.PERSIMMON_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.PERSIMMON_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PERSIMMON_TREE = register("persimmon_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PERSIMMON_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.PERSIMMON_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Bald Cypress
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> BALD_CYPRESS = register("bald_cypress",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.BALD_CYPRESS_LOG),
                    new SimpleBlockStateProvider(States.BALD_CYPRESS_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(2, 1), FeatureSpread.create(0, 2),
                            FeatureSpread.create(1, 1)),
                    new StraightTrunkPlacer(7, 2, 1),
                    new TwoLayerFeature(2, 0, 2)))
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL))))
                    .setMaxWaterDepth(2).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> MEGA_BALD_CYPRESS = register("mega_bald_cypress",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.BALD_CYPRESS_LOG),
                    new SimpleBlockStateProvider(States.BALD_CYPRESS_LEAVES),
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(13, 4)),
                    new GiantTrunkPlacer(16, 5, 4),
                    new TwoLayerFeature(1, 1, 2)))
                    .setMaxWaterDepth(2).setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SPANISH_MOSS_BALD_CYPRESS = register("spanish_moss_bald_cypress",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.BALD_CYPRESS_LOG),
                    new SimpleBlockStateProvider(States.BALD_CYPRESS_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(2, 1), FeatureSpread.create(0, 2),
                            FeatureSpread.create(1, 1)),
                    new StraightTrunkPlacer(7, 2, 1),
                    new TwoLayerFeature(2, 0, 2)))
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)),
                            SpanishMossLeavesDecorator.INSTANCE))
                    .setMaxWaterDepth(2).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SPANISH_MOSS_MEGA_BALD_CYPRESS = register("spanish_moss_mega_bald_cypress",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.BALD_CYPRESS_LOG),
                    new SimpleBlockStateProvider(States.BALD_CYPRESS_LEAVES),
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(13, 4)),
                    new GiantTrunkPlacer(16, 5, 4),
                    new TwoLayerFeature(1, 1, 2)))
                    .setMaxWaterDepth(2).setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)),
                            SpanishMossLeavesDecorator.INSTANCE)).build()));

    //Fremont Poplar
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> FREMONT_POPLAR_TREE = register("fremont_poplar_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.BLACK_POPLAR_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.FREMONT_POPLAR_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Aspen
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> ASPEN_TREE = register("aspen_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.BIRCH_LOG),
                    new SimpleBlockStateProvider(States.ASPEN_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), FeatureSpread.create(6)),
                    new StraightTrunkPlacer(10, 3, 0),
                    new TwoLayerFeature(1, 0, 1))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> TAIGA_ASPEN_TREE = register("taiga_aspen_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.BIRCH_LOG),
                    new SimpleBlockStateProvider(States.ASPEN_TAIGA_SPRING_BRANCHES),
                    new SpruceFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), FeatureSpread.create(6)),
                    new StraightTrunkPlacer(10, 3, 0),
                    new TwoLayerFeature(1, 0, 1))).build()));

    //Larch
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> LARCH_TREE = register("larch_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.LARCH_LOG),
                    new SimpleBlockStateProvider(States.LARCH_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(2, 1), FeatureSpread.create(0, 2),
                            FeatureSpread.create(1, 1)),
                    new StraightTrunkPlacer(5, 2, 1),
                    new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> TALL_LARCH_TREE = register("tall_larch",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.LARCH_LOG),
                    new SimpleBlockStateProvider(States.LARCH_LEAVES),
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(13, 4)),
                    new StraightTrunkPlacer(13, 2, 14),
                    new TwoLayerFeature(1, 1, 2)))
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> TAIGA_LARCH_TREE = register("taiga_larch_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.LARCH_LOG),
                    new SimpleBlockStateProvider(States.LARCH_TAIGA_SPRING_BRANCHES),
                    new SpruceFoliagePlacer(FeatureSpread.create(2, 1), FeatureSpread.create(0, 2),
                            FeatureSpread.create(1, 1)),
                    new StraightTrunkPlacer(5, 2, 1),
                    new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> TAIGA_TALL_LARCH_TREE = register("taiga_tall_larch",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.LARCH_LOG),
                    new SimpleBlockStateProvider(States.LARCH_TAIGA_SPRING_BRANCHES),
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(13, 4)),
                    new StraightTrunkPlacer(13, 2, 14),
                    new TwoLayerFeature(1, 1, 2)))
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));

    //Banana Plant
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> BANANA_TREE = register("banana_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.BANANA_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.BANANA_LEAVES),
                    new BananaFoliagePlacer(FeatureSpread.create(1), FeatureSpread.create(0)),
                    new StraightTrunkPlacer(7, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).build()));

    //Peach Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PEACH_TREE = register("peach_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PLUM_LOG),
                    new SimpleBlockStateProvider(States.PEACH_BLOSSOM),
                    new AcaciaFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0)),
                    new ForkyTrunkPlacer(3, 2, 2),
                    new TwoLayerFeature(1, 0, 2))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SAPLING_PEACH_TREE = register("sapling_peach_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PLUM_LOG),
                    new SimpleBlockStateProvider(States.PEACH_LEAVES),
                    new AcaciaFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0)),
                    new ForkyTrunkPlacer(3, 2, 2),
                    new TwoLayerFeature(1, 0, 2))).setIgnoreVines().build()));

    //Acerola
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> ACEROLA_TREE = register("acerola_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.ACEROLA_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.ACEROLA_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Orchid tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> ORCHID_TREE = register("orchid_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.ORCHID_TREE_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.ORCHID_TREE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SUBTROPICAL_SPRING_ORCHID_TREE = register("subtropical_spring_orchid_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.ORCHID_TREE_LOG),
                    new SimpleBlockStateProvider(States.ORCHID_TREE_FLOWERING_BRANCHES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Yellow Oleander
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> YELLOW_OLEANDER_TREE = register("yellow_oleander_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.OLEANDER_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.YELLOW_OLEANDER_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> ORANGE_OLEANDER_TREE = register("orange_oleander_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.OLEANDER_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.ORANGE_OLEANDER_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Pink Ivory
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PINK_IVORY_TREE = register("pink_ivory_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PINK_IVORY_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.PINK_IVORY_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PINK_IVORY_FANCY_TREE = register("pink_ivory_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.PINK_IVORY_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.PINK_IVORY_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Plumeria Trees
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PLUMERIA_RED_TREE = register("plumeria_red_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PLUMERIA_LOG),
                    new SimpleBlockStateProvider(States.RED_PLUMERIA_LEAVES),
                    new AcaciaFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0)),
                    new ForkyTrunkPlacer(3, 2, 2),
                    new TwoLayerFeature(1, 0, 2))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PLUMERIA_WHITE_TREE = register("plumeria_white_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PLUMERIA_LOG),
                    new SimpleBlockStateProvider(States.WHITE_PLUMERIA_LEAVES),
                    new AcaciaFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0)),
                    new ForkyTrunkPlacer(3, 2, 2),
                    new TwoLayerFeature(1, 0, 2))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PLUMERIA_PINK_TREE = register("plumeria_pink_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PLUMERIA_LOG),
                    new SimpleBlockStateProvider(States.PINK_PLUMERIA_LEAVES),
                    new AcaciaFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0)),
                    new ForkyTrunkPlacer(3, 2, 2),
                    new TwoLayerFeature(1, 0, 2))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PLUMERIA_YELLOW_TREE = register("plumeria_yellow_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PLUMERIA_LOG),
                    new SimpleBlockStateProvider(States.YELLOW_PLUMERIA_LEAVES),
                    new AcaciaFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0)),
                    new ForkyTrunkPlacer(3, 2, 2),
                    new TwoLayerFeature(1, 0, 2))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PLUMERIA_ORANGE_TREE = register("plumeria_orange_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PLUMERIA_LOG),
                    new SimpleBlockStateProvider(States.ORANGE_PLUMERIA_LEAVES),
                    new AcaciaFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0)),
                    new ForkyTrunkPlacer(3, 2, 2),
                    new TwoLayerFeature(1, 0, 2))).setIgnoreVines().build()));

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> TEAK_TALL_TREE = register("teak_tall_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.JUNGLE_LOG),
                    new SimpleBlockStateProvider(States.TEAK_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(5, 2, 6),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines()
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_002_PLACEMENT)).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> TEAK_FANCY_TREE = register("teak_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.JUNGLE_LOG),
                    new SimpleBlockStateProvider(States.TEAK_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING)
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_005_PLACEMENT)).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> MEGA_TEAK_TREE = register("mega_teak_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.JUNGLE_LOG),
                    new SimpleBlockStateProvider(States.TEAK_LEAVES),
                    new JungleFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 2),
                    new MegaJungleTrunkPlacer(10, 2, 19),
                    new TwoLayerFeature(1, 1, 2)))
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_005_PLACEMENT)).build()));


    public static final class States {

        protected static final BlockState ACEROLA_LOG = TreeBlocks.ACEROLA_LOG.get().getDefaultState();
        protected static final BlockState ACEROLA_LEAVES = TreeBlocks.ACEROLA_LEAVES.get().getDefaultState();

        protected static final BlockState TEAK_LEAVES = TreeBlocks.TEAK_LEAVES.get().getDefaultState();

        protected static final BlockState PINK_IVORY_LOG = TreeBlocks.PINK_IVORY_LOG.get().getDefaultState();
        protected static final BlockState PINK_IVORY_LEAVES = TreeBlocks.PINK_IVORY_LEAVES.get().getDefaultState();

        protected static final BlockState ORCHID_TREE_LOG = TreeBlocks.ORCHID_TREE_LOG.get().getDefaultState();
        protected static final BlockState ORCHID_TREE_LEAVES = TreeBlocks.ORCHID_TREE_LEAVES.get().getDefaultState();
        protected static final BlockState ORCHID_TREE_FLOWERING_BRANCHES = TreeBlocks.ORCHID_TREE_FLOWERING_BRANCHES.get().getDefaultState();

        protected static final BlockState PLUMERIA_LOG = TreeBlocks.PLUMERIA_LOG.get().getDefaultState();
        protected static final BlockState RED_PLUMERIA_LEAVES = TreeBlocks.RED_PLUMERIA_LEAVES.get().getDefaultState();
        protected static final BlockState WHITE_PLUMERIA_LEAVES = TreeBlocks.WHITE_PLUMERIA_LEAVES.get().getDefaultState();
        protected static final BlockState YELLOW_PLUMERIA_LEAVES = TreeBlocks.YELLOW_PLUMERIA_LEAVES.get().getDefaultState();
        protected static final BlockState PINK_PLUMERIA_LEAVES = TreeBlocks.PINK_PLUMERIA_LEAVES.get().getDefaultState();
        protected static final BlockState ORANGE_PLUMERIA_LEAVES = TreeBlocks.ORANGE_PLUMERIA_LEAVES.get().getDefaultState();

        protected static final BlockState BANANA_LOG = TreeBlocks.BANANA_LOG.get().getDefaultState();
        protected static final BlockState BANANA_LEAVES = TreeBlocks.BANANA_LEAVES.get().getDefaultState();

        protected static final BlockState AVOCADO_LOG = TreeBlocks.AVOCADO_LOG.get().getDefaultState();
        protected static final BlockState AVOCADO_LEAVES = TreeBlocks.AVOCADO_LEAVES.get().getDefaultState();

        protected static final BlockState ALMOND_BLOSSOM = TreeBlocks.ALMOND_BLOSSOM.get().getDefaultState();
        protected static final BlockState ALMOND_LEAVES = TreeBlocks.ALMOND_LEAVES.get().getDefaultState();

        protected static final BlockState BALD_CYPRESS_LOG = TreeBlocks.BALD_CYPRESS_LOG.get().getDefaultState();
        protected static final BlockState BALD_CYPRESS_LEAVES = TreeBlocks.BALD_CYPRESS_LEAVES.get().getDefaultState();

        protected static final BlockState LARCH_LOG = TreeBlocks.LARCH_LOG.get().getDefaultState();
        protected static final BlockState LARCH_LEAVES = TreeBlocks.LARCH_LEAVES.get().getDefaultState();
        protected static final BlockState LARCH_TAIGA_SPRING_BRANCHES = TreeBlocks.LARCH_WINTER_LEAVES.get().getDefaultState();

        protected static final BlockState PERSIMMON_LOG = TreeBlocks.PERSIMMON_LOG.get().getDefaultState();
        protected static final BlockState PERSIMMON_LEAVES = TreeBlocks.PERSIMMON_LEAVES.get().getDefaultState();
        protected static final BlockState JACKALBERRY_LEAVES = TreeBlocks.JACKALBERRY_LEAVES.get().getDefaultState();

        protected static final BlockState SUBALPINE_FIR_LOG = TreeBlocks.SUBALPINE_FIR_LOG.get().getDefaultState();
        protected static final BlockState SUBALPINE_FIR_LEAVES = TreeBlocks.SUBALPINE_FIR_LEAVES.get().getDefaultState();
        protected static final BlockState WHITE_FIR_LEAVES = TreeBlocks.WHITE_FIR_LEAVES.get().getDefaultState();

        protected static final BlockState MUGO_PINE_LOG = TreeBlocks.MUGO_PINE_LOG.get().getDefaultState();
        protected static final BlockState MUGO_PINE_LEAVES = TreeBlocks.MUGO_PINE_LEAVES.get().getDefaultState();

        protected static final BlockState SLASH_PINE_LOG = TreeBlocks.SLASH_PINE_LOG.get().getDefaultState();
        protected static final BlockState SLASH_PINE_LEAVES = TreeBlocks.SLASH_PINE_LEAVES.get().getDefaultState();
        protected static final BlockState LOBLOLLY_PINE_LEAVES = TreeBlocks.LOBLOLLY_PINE_LEAVES.get().getDefaultState();

        protected static final BlockState OIL_PALM_LOG = TreeBlocks.OIL_PALM_LOG.get().getDefaultState();
        protected static final BlockState OIL_PALM_LEAVES = TreeBlocks.OIL_PALM_LEAVES.get().getDefaultState();

        protected static final BlockState WEEPING_WILLOW_LOG = TreeBlocks.WEEPING_WILLOW_LOG.get().getDefaultState();
        protected static final BlockState WEEPING_WILLOW_LEAVES = TreeBlocks.WEEPING_WILLOW_LEAVES.get().getDefaultState();

        protected static final BlockState BIRCH_LOG = Blocks.BIRCH_LOG.getDefaultState();
        protected static final BlockState ASPEN_LEAVES = TreeBlocks.ASPEN_LEAVES.get().getDefaultState();
        protected static final BlockState ASPEN_TAIGA_SPRING_BRANCHES = TreeBlocks.ASPEN_WINTER_BRANCHES.get().getDefaultState();

        protected static final BlockState BISMARCK_PALM_LOG = TreeBlocks.BISMARCK_PALM_LOG.get().getDefaultState();
        protected static final BlockState BISMARCK_PALM_LEAVES = TreeBlocks.BISMARCK_PALM_LEAVES.get().getDefaultState();

        protected static final BlockState MARULA_LOG = TreeBlocks.MARULA_LOG.get().getDefaultState();
        protected static final BlockState MARULA_LEAVES = TreeBlocks.MARULA_LEAVES.get().getDefaultState();

        protected static final BlockState HAZELNUT_LOG = TreeBlocks.HAZELNUT_LOG.get().getDefaultState();
        protected static final BlockState HAZELNUT_SPRING_BLOOM = TreeBlocks.HAZELNUT_SPRING_BLOOM.get().getDefaultState();
        protected static final BlockState HAZELNUT_LEAVES = TreeBlocks.HAZELNUT_LEAVES.get().getDefaultState();

        protected static final BlockState SAUSAGE_TREE_LOG = TreeBlocks.SAUSAGE_TREE_LOG.get().getDefaultState();
        protected static final BlockState SAUSAGE_TREE_LEAVES = TreeBlocks.SAUSAGE_TREE_LEAVES.get().getDefaultState();

        protected static final BlockState BREADFRUIT_LEAVES = TreeBlocks.BREADFRUIT_LEAVES.get().getDefaultState();
        protected static final BlockState DURIAN_LEAVES = TreeBlocks.DURIAN_LEAVES.get().getDefaultState();

        protected static final BlockState ROWAN_LOG = TreeBlocks.ROWAN_LOG.get().getDefaultState();
        protected static final BlockState ROWAN_LEAVES = TreeBlocks.ROWAN_LEAVES.get().getDefaultState();

        protected static final BlockState HAWTHORN_LOG = TreeBlocks.HAWTHORN_LOG.get().getDefaultState();
        protected static final BlockState HAWTHORN_LEAVES = TreeBlocks.HAWTHORN_LEAVES.get().getDefaultState();

        protected static final BlockState JUNIPER_LOG = TreeBlocks.JUNIPER_LOG.get().getDefaultState();
        protected static final BlockState JUNIPER_LEAVES = TreeBlocks.JUNIPER_LEAVES.get().getDefaultState();

        protected static final BlockState PONDEROSA_PINE_LOG = TreeBlocks.PONDEROSA_PINE_LOG.get().getDefaultState();
        protected static final BlockState PONDEROSA_PINE_LEAVES = TreeBlocks.PONDEROSA_PINE_LEAVES.get().getDefaultState();

        protected static final BlockState DOUGLAS_FIR_LOG = TreeBlocks.DOUGLAS_FIR_LOG.get().getDefaultState();
        protected static final BlockState DOUGLAS_FIR_LEAVES = TreeBlocks.DOUGLAS_FIR_LEAVES.get().getDefaultState();

        protected static final BlockState GINKGO_LOG = TreeBlocks.GINKGO_LOG.get().getDefaultState();
        protected static final BlockState GINKGO_LEAVES = TreeBlocks.GINKGO_LEAVES.get().getDefaultState();

        protected static final BlockState PINYON_LOG = TreeBlocks.PINYON_LOG.get().getDefaultState();
        protected static final BlockState PINYON_LEAVES = TreeBlocks.PINYON_LEAVES.get().getDefaultState();

        protected static final BlockState CAROB_LOG = TreeBlocks.CAROB_LOG.get().getDefaultState();
        protected static final BlockState CAROB_LEAVES = TreeBlocks.CAROB_LEAVES.get().getDefaultState();

        protected static final BlockState PLANE_LOG = TreeBlocks.PLANE_LOG.get().getDefaultState();
        protected static final BlockState PLANE_LEAVES = TreeBlocks.PLANE_LEAVES.get().getDefaultState();

        protected static final BlockState SWEET_CHESTNUT_LOG = TreeBlocks.SWEET_CHESTNUT_LOG.get().getDefaultState();
        protected static final BlockState SWEET_CHESTNUT_LEAVES = TreeBlocks.SWEET_CHESTNUT_LEAVES.get().getDefaultState();

        protected static final BlockState SABAL_LOG = TreeBlocks.SABAL_LOG.get().getDefaultState();
        protected static final BlockState SABAL_LEAVES = TreeBlocks.SABAL_LEAVES.get().getDefaultState();

        protected static final BlockState PISTACHIO_LOG = TreeBlocks.PISTACHIO_LOG.get().getDefaultState();
        protected static final BlockState PISTACHIO_LEAVES = TreeBlocks.PISTACHIO_LEAVES.get().getDefaultState();

        protected static final BlockState COCONUT_LOG = TreeBlocks.COCONUT_LOG.get().getDefaultState();
        protected static final BlockState COCONUT_LEAVES = TreeBlocks.COCONUT_LEAVES.get().getDefaultState();

        protected static final BlockState DATE_LOG = TreeBlocks.DATE_LOG.get().getDefaultState();
        protected static final BlockState DATE_LEAVES = TreeBlocks.DATE_LEAVES.get().getDefaultState();
        protected static final BlockState CANARY_DATE_LOG = TreeBlocks.CANARY_DATE_LOG.get().getDefaultState();
        protected static final BlockState CANARY_DATE_LEAVES = TreeBlocks.CANARY_DATE_LEAVES.get().getDefaultState();

        protected static final BlockState SOCOTRA_CUCUMBER_LOG = TreeBlocks.SOCOTRA_CUCUMBER_LOG.get().getDefaultState();
        protected static final BlockState SOCOTRA_CUCUMBER_LEAVES = TreeBlocks.SOCOTRA_CUCUMBER_LEAVES.get().getDefaultState();

        protected static final BlockState YEW_LOG = TreeBlocks.YEW_LOG.get().getDefaultState();
        protected static final BlockState YEW_LEAVES = TreeBlocks.YEW_LEAVES.get().getDefaultState();

        protected static final BlockState JAPANESE_PINE_LOG = TreeBlocks.JAPANESE_PINE_LOG.get().getDefaultState();
        protected static final BlockState JAPANESE_PINE_LEAVES = TreeBlocks.JAPANESE_PINE_LEAVES.get().getDefaultState();

        protected static final BlockState DRAGON_BLOOD_LOG = TreeBlocks.DRAGON_BLOOD_LOG.get().getDefaultState();
        protected static final BlockState DRAGON_BLOOD_LEAVES = TreeBlocks.DRAGON_BLOOD_LEAVES.get().getDefaultState();

        protected static final BlockState DESERT_ROSE_LOG = TreeBlocks.SOCOTRA_DESERT_ROSE_LOG.get().getDefaultState();
        protected static final BlockState DESERT_ROSE_LEAVES = TreeBlocks.SOCOTRA_DESERT_ROSE_LEAVES.get().getDefaultState();

        protected static final BlockState BEECH_LOG = TreeBlocks.BEECH_LOG.get().getDefaultState();
        protected static final BlockState COOPER_BEECH_LEAVES = TreeBlocks.COOPER_BEECH_LEAVES.get().getDefaultState();

        protected static final BlockState WESTERN_HEMLOCK_LOG = TreeBlocks.WESTERN_HEMLOCK_LOG.get().getDefaultState();
        protected static final BlockState WESTERN_HEMLOCK_LEAVES = TreeBlocks.WESTERN_HEMLOCK_LEAVES.get().getDefaultState();
        protected static final BlockState MOUNTAIN_HEMLOCK_LEAVES = TreeBlocks.MOUNTAIN_HEMLOCK_LEAVES.get().getDefaultState();

        protected static final BlockState ARAUCARIA_LOG = TreeBlocks.ARAUCARIA_LOG.get().getDefaultState();
        protected static final BlockState COOK_PINE_LEAVES = TreeBlocks.COOK_PINE_LEAVES.get().getDefaultState();
        protected static final BlockState NORFOLK_PINE_LEAVES = TreeBlocks.NORFOLK_PINE_LEAVES.get().getDefaultState();
        protected static final BlockState MONKEY_PUZZLE_LEAVES = TreeBlocks.MONKEY_PUZZLE_LEAVES.get().getDefaultState();
        protected static final BlockState BUNYA_PINE_LEAVES = TreeBlocks.BUNYA_PINE_LEAVES.get().getDefaultState();

        protected static final BlockState JUNGLE_FIG_LOG = TreeBlocks.JUNGLE_FIG_LOG.get().getDefaultState();
        protected static final BlockState WEEPING_FIG_LEAVES = TreeBlocks.WEEPING_FIG_LEAVES.get().getDefaultState();
        protected static final BlockState INDIAN_LAUREL_LEAVES = TreeBlocks.INDIAN_LAUREL_LEAVES.get().getDefaultState();
        protected static final BlockState RUBBER_TREE_LEAVES = TreeBlocks.RUBBER_TREE_LEAVES.get().getDefaultState();

        protected static final BlockState HOLM_OAK_LOG = TreeBlocks.HOLM_OAK_LOG.get().getDefaultState();
        protected static final BlockState HOLM_OAK_LEAVES = TreeBlocks.HOLM_OAK_LEAVES.get().getDefaultState();

        protected static final BlockState RED_OAK_LEAVES = TreeBlocks.RED_OAK_LEAVES.get().getDefaultState();

        protected static final BlockState CORK_OAK_LOG = TreeBlocks.CORK_OAK_LOG.get().getDefaultState();
        protected static final BlockState CORK_OAK_LEAVES = TreeBlocks.CORK_OAK_LEAVES.get().getDefaultState();

        protected static final BlockState OLEANDER_LOG = TreeBlocks.OLEANDER_LOG.get().getDefaultState();
        protected static final BlockState RED_OLEANDER_LEAVES = TreeBlocks.OLEANDER_RED_LEAVES.get().getDefaultState();
        protected static final BlockState WHITE_OLEANDER_LEAVES = TreeBlocks.OLEANDER_WHITE_LEAVES.get().getDefaultState();
        protected static final BlockState PINK_OLEANDER_LEAVES = TreeBlocks.OLEANDER_PINK_LEAVES.get().getDefaultState();
        protected static final BlockState DARK_PINK_OLEANDER_LEAVES = TreeBlocks.OLEANDER_DARK_PINK_LEAVES.get().getDefaultState();
        protected static final BlockState ORANGE_OLEANDER_LEAVES = TreeBlocks.ORANGE_OLEANDER_LEAVES.get().getDefaultState();
        protected static final BlockState YELLOW_OLEANDER_LEAVES = TreeBlocks.YELLOW_OLEANDER_LEAVES.get().getDefaultState();

        protected static final BlockState OCOTEA_FOREST_LOG = TreeBlocks.OCOTEA_FOREST_LOG.get().getDefaultState();
        protected static final BlockState OCOTEA_JUNGLE_LOG = TreeBlocks.OCOTEA_JUNGLE_LOG.get().getDefaultState();
        protected static final BlockState OCOTEA_LEAVES = TreeBlocks.OCOTEA_LEAVES.get().getDefaultState();

        protected static final BlockState MESQUITE_LOG = TreeBlocks.MESQUITE_LOG.get().getDefaultState();
        protected static final BlockState MESQUITE_LEAVES = TreeBlocks.MESQUITE_LEAVES.get().getDefaultState();

        protected static final BlockState COAST_COTTONWOOD_LOG = TreeBlocks.COAST_COTTONWOOD_LOG.get().getDefaultState();
        protected static final BlockState COAST_COTTONWOOD_LEAVES = TreeBlocks.COAST_COTTONWOOD_LEAVES.get().getDefaultState();

        protected static final BlockState FIG_LOG = TreeBlocks.FIG_LOG.get().getDefaultState();
        protected static final BlockState FIG_LEAVES = TreeBlocks.FIG_LEAVES.get().getDefaultState();
        protected static final BlockState WHITE_FIG_LEAVES = TreeBlocks.WHITE_FIG_LEAVES.get().getDefaultState();
        protected static final BlockState SYCAMORE_FIG_LEAVES = TreeBlocks.SYCAMORE_FIG_LEAVES.get().getDefaultState();

        protected static final BlockState OLIVE_LOG = TreeBlocks.OLIVE_LOG.get().getDefaultState();
        protected static final BlockState OLIVE_LEAVES = TreeBlocks.OLIVE_LEAVES.get().getDefaultState();

        protected static final BlockState ERYTHRINA_LOG = TreeBlocks.ERYTHRINA_LOG.get().getDefaultState();
        protected static final BlockState INDIAN_CORAL_LEAVES = TreeBlocks.INDIAN_CORAL_LEAVES.get().getDefaultState();

        protected static final BlockState TROPICAL_ALMOND_LOG = TreeBlocks.TROPICAL_ALMOND_LOG.get().getDefaultState();
        protected static final BlockState TROPICAL_ALMOND_LEAVES = TreeBlocks.TROPICAL_ALMOND_LEAVES.get().getDefaultState();

        protected static final BlockState SOUTHERN_MAGNOLIA_LOG = TreeBlocks.SOUTHERN_MAGNOLIA_LOG.get().getDefaultState();
        protected static final BlockState SOUTHERN_MAGNOLIA_LEAVES = TreeBlocks.SOUTHERN_MAGNOLIA_LEAVES.get().getDefaultState();

        protected static final BlockState POMEGRANATE_LOG = TreeBlocks.POMEGRANATE_LOG.get().getDefaultState();
        protected static final BlockState POMEGRANATE_LEAVES = TreeBlocks.POMEGRANATE_LEAVES.get().getDefaultState();

        protected static final BlockState MYRTLE_LOG = TreeBlocks.MYRTLE_LOG.get().getDefaultState();
        protected static final BlockState RED_CRAPE_MYRTLE_LEAVES = TreeBlocks.RED_CRAPE_MYRTLE_SPRING_LEAVES.get().getDefaultState();
        protected static final BlockState PURPLE_CRAPE_MYRTLE_LEAVES = TreeBlocks.PURPLE_CRAPE_MYRTLE_SPRING_LEAVES.get().getDefaultState();
        protected static final BlockState WHITE_CRAPE_MYRTLE_LEAVES = TreeBlocks.WHITE_CRAPE_MYRTLE_SPRING_LEAVES.get().getDefaultState();
        protected static final BlockState PINK_CRAPE_MYRTLE_LEAVES = TreeBlocks.PINK_CRAPE_MYRTLE_SPRING_LEAVES.get().getDefaultState();

        protected static final BlockState SOUTHERN_WAX_MYRTLE_LEAVES = TreeBlocks.SOUTHERN_WAX_MYRTLE_LEAVES.get().getDefaultState();

        protected static final BlockState STONE_PINE_LOG = TreeBlocks.STONE_PINE_LOG.get().getDefaultState();
        protected static final BlockState STONE_PINE_LEAVES = TreeBlocks.STONE_PINE_LEAVES.get().getDefaultState();

        protected static final BlockState CHINESE_RED_PINE_LOG = TreeBlocks.CHINESE_RED_PINE_LOG.get().getDefaultState();
        protected static final BlockState CHINESE_RED_PINE_LEAVES = TreeBlocks.CHINESE_RED_PINE_LEAVES.get().getDefaultState();

        protected static final BlockState CRABAPPLE_LOG = TreeBlocks.CRABAPPLE_LOG.get().getDefaultState();
        protected static final BlockState PINK_CRABAPPLE_BLOSSOM = TreeBlocks.PINK_CRABAPPLE_BLOSSOM.get().getDefaultState();
        protected static final BlockState WHITE_CRABAPPLE_BLOSSOM = TreeBlocks.WHITE_CRABAPPLE_BLOSSOM.get().getDefaultState();
        protected static final BlockState RED_CRABAPPLE_BLOSSOM = TreeBlocks.RED_CRABAPPLE_BLOSSOM.get().getDefaultState();
        protected static final BlockState PINK_CRABAPPLE_LEAVES = TreeBlocks.PINK_CRABAPPLE_LEAVES.get().getDefaultState();
        protected static final BlockState WHITE_CRABAPPLE_LEAVES = TreeBlocks.WHITE_CRABAPPLE_LEAVES.get().getDefaultState();
        protected static final BlockState RED_CRABAPPLE_LEAVES = TreeBlocks.RED_CRABAPPLE_LEAVES.get().getDefaultState();

        protected static final BlockState LOQUAT_LOG = TreeBlocks.LOQUAT_LOG.get().getDefaultState();
        protected static final BlockState LOQUAT_LEAVES = TreeBlocks.LOQUAT_LEAVES.get().getDefaultState();

        protected static final BlockState ELDERBERRY_LOG = TreeBlocks.ELDERBERRY_LOG.get().getDefaultState();
        protected static final BlockState ELDERBERRY_LEAVES = TreeBlocks.ELDERBERRY_LEAVES.get().getDefaultState();

        protected static final BlockState STRAWBERRY_TREE_LOG = TreeBlocks.STRAWBERRY_TREE_LOG.get().getDefaultState();
        protected static final BlockState STRAWBERRY_TREE_LEAVES = TreeBlocks.STRAWBERRY_TREE_LEAVES.get().getDefaultState();

        protected static final BlockState ITALIAN_CYPRESS_LOG = TreeBlocks.ITALIAN_CYPRESS_LOG.get().getDefaultState();
        protected static final BlockState ITALIAN_CYPRESS_LEAVES = TreeBlocks.ITALIAN_CYPRESS_LEAVES.get().getDefaultState();

        protected static final BlockState RED_KAPOK_LEAVES = TreeBlocks.RED_KAPOK_LEAVES.get().getDefaultState();
        protected static final BlockState JUNGLE_LOG = Blocks.JUNGLE_LOG.getDefaultState();
        protected static final BlockState JUNGLE_LEAVES = Blocks.JUNGLE_LEAVES.getDefaultState();

        protected static final BlockState ACACIA_LOG = Blocks.ACACIA_LOG.getDefaultState();
        protected static final BlockState ACACIA_LEAVES = Blocks.ACACIA_LEAVES.getDefaultState();

        protected static final BlockState OAK_LOG = Blocks.OAK_LOG.getDefaultState();
        protected static final BlockState OAK_LEAVES = Blocks.OAK_LEAVES.getDefaultState();

        protected static final BlockState JAPANESE_MAPLE_LOG = TreeBlocks.JAPANESE_MAPLE_LOG.get().getDefaultState();
        protected static final BlockState JAPANESE_MAPLE_LEAVES = TreeBlocks.JAPANESE_MAPLE_LEAVES.get().getDefaultState();
        protected static final BlockState RED_MAPLE_LEAVES = TreeBlocks.RED_MAPLE_LEAVES.get().getDefaultState();

        protected static final BlockState MULBERRY_LOG = TreeBlocks.MULBERRY_LOG.get().getDefaultState();
        protected static final BlockState MULBERRY_LEAVES = TreeBlocks.MULBERRY_LEAVES.get().getDefaultState();

        protected static final BlockState STARFRUIT_LOG = TreeBlocks.STARFRUIT_LOG.get().getDefaultState();
        protected static final BlockState STARFRUIT_LEAVES = TreeBlocks.STARFRUIT_LEAVES.get().getDefaultState();

        protected static final BlockState CAMELLIA_LOG = TreeBlocks.CAMELLIA_LOG.get().getDefaultState();
        protected static final BlockState CAMELLIA_LEAVES = TreeBlocks.CAMELLIA_LEAVES.get().getDefaultState();
        protected static final BlockState TEA_LEAVES = TreeBlocks.TEA_LEAVES.get().getDefaultState();

        protected static final BlockState CITRUS_LOG = TreeBlocks.CITRUS_LOG.get().getDefaultState();
        protected static final BlockState ORANGE_LEAVES = TreeBlocks.ORANGE_LEAVES.get().getDefaultState();
        protected static final BlockState LEMON_LEAVES = TreeBlocks.LEMON_LEAVES.get().getDefaultState();
        protected static final BlockState MANDARIN_LEAVES = TreeBlocks.MANDARIN_LEAVES.get().getDefaultState();
        protected static final BlockState TAHITI_LIME_LEAVES = TreeBlocks.TAHITI_LIME_LEAVES.get().getDefaultState();
        protected static final BlockState CITRON_LEAVES = TreeBlocks.CITRON_LEAVES.get().getDefaultState();
        protected static final BlockState BUDDAH_HAND_LEAVES = TreeBlocks.BUDDHA_HAND_LEAVES.get().getDefaultState();
        protected static final BlockState GRAPEFRUIT_LEAVES = TreeBlocks.GRAPEFRUIT_LEAVES.get().getDefaultState();

        protected static final BlockState LIVE_OAK_LOG = TreeBlocks.LIVE_OAK_LOG.get().getDefaultState();
        protected static final BlockState LIVE_OAK_LEAVES = TreeBlocks.LIVE_OAK_LEAVES.get().getDefaultState();

        protected static final BlockState ROYAL_POINCIANA_LOG = TreeBlocks.ROYAL_POINCIANA_LOG.get().getDefaultState();
        protected static final BlockState ROYAL_POINCIANA_LEAVES = TreeBlocks.ROYAL_POINCIANA_LEAVES.get().getDefaultState();

        protected static final BlockState TAMARIND_LOG = TreeBlocks.TAMARIND_LOG.get().getDefaultState();
        protected static final BlockState TAMARIND_LEAVES = TreeBlocks.TAMARIND_LEAVES.get().getDefaultState();

        protected static final BlockState EUCALYPTUS_LOG = TreeBlocks.EUCALYPTUS_LOG.get().getDefaultState();
        protected static final BlockState EUCALYPTUS_LEAVES = TreeBlocks.EUCALYPTUS_LEAVES.get().getDefaultState();

        protected static final BlockState CASUARINA_LOG = TreeBlocks.CASUARINA_LOG.get().getDefaultState();
        protected static final BlockState CASUARINA_LEAVES = TreeBlocks.CASUARINA_LEAVES.get().getDefaultState();

        protected static final BlockState POHUTUKAWA_LOG = TreeBlocks.POHUTUKAWA_LOG.get().getDefaultState();
        protected static final BlockState POHUTUKAWA_LEAVES = TreeBlocks.POHUTUKAWA_LEAVES.get().getDefaultState();

        protected static final BlockState PLUM_LOG = TreeBlocks.PLUM_LOG.get().getDefaultState();
        protected static final BlockState CHERRY_PLUM_FLOWERING_LEAVES = TreeBlocks.CHERRY_PLUM_FLOWERING_LEAVES.get().getDefaultState();
        protected static final BlockState PEACH_BLOSSOM = TreeBlocks.PEACH_BLOSSOM.get().getDefaultState();
        protected static final BlockState CHERRY_PLUM_LEAVES = TreeBlocks.CHERRY_PLUM_LEAVES.get().getDefaultState();
        protected static final BlockState PEACH_LEAVES = TreeBlocks.PEACH_LEAVES.get().getDefaultState();

        protected static final BlockState BLACK_POPLAR_LOG = TreeBlocks.BLACK_POPLAR_LOG.get().getDefaultState();
        protected static final BlockState BLACK_POPLAR_LEAVES = TreeBlocks.BLACK_POPLAR_LEAVES.get().getDefaultState();
        protected static final BlockState FREMONT_POPLAR_LEAVES = TreeBlocks.FREMONT_POPLAR_LEAVES.get().getDefaultState();

        protected static final BlockState NOTHOFAGUS_LOG = TreeBlocks.NOTHOFAGUS_LOG.get().getDefaultState();
        protected static final BlockState SOUTHERN_BEECH_LEAVES = TreeBlocks.SOUTHERN_BEECH_LEAVES.get().getDefaultState();

        protected static final BlockState ILEX_LOG = TreeBlocks.HOLLY_LOG.get().getDefaultState();
        protected static final BlockState HOLLY_LEAVES = TreeBlocks.HOLLY_LEAVES.get().getDefaultState();

        protected static final BlockState PECAN_LOG = TreeBlocks.PECAN_LOG.get().getDefaultState();
        protected static final BlockState PECAN_LEAVES = TreeBlocks.PECAN_LEAVES.get().getDefaultState();

        protected static final BlockState MANGO_LOG = TreeBlocks.MANGO_LOG.get().getDefaultState();
        protected static final BlockState MANGO_LEAVES = TreeBlocks.MANGO_LEAVES.get().getDefaultState();

        protected static final BlockState WALNUT_LOG = TreeBlocks.WALNUT_LOG.get().getDefaultState();
        protected static final BlockState WALNUT_LEAVES = TreeBlocks.WALNUT_LEAVES.get().getDefaultState();

        protected static final BlockState CANARY_PINE_LOG = TreeBlocks.CANARY_PINE_LOG.get().getDefaultState();
        protected static final BlockState CANARY_PINE_LEAVES = TreeBlocks.CANARY_PINE_LEAVES.get().getDefaultState();

        protected static final BlockState SPRUCE_LOG = Blocks.SPRUCE_LOG.getDefaultState();
        protected static final BlockState BLUE_SPRUCE_LEAVES = TreeBlocks.BLUE_SPRUCE_LEAVES.get().getDefaultState();

        protected static final BlockState DARK_OAK_LOG = Blocks.DARK_OAK_LOG.getDefaultState();
        protected static final BlockState DARK_OAK_LEAVES = Blocks.DARK_OAK_LEAVES.getDefaultState();

        protected static final BlockState PODZOL = Blocks.PODZOL.getDefaultState();

    }

    public static final ConfiguredFeature<?, ?> MEDITERRANEAN_OAK_TREES = register("mediterranean_oak_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(CORK_OAK_TREE.withChance(0.3F),
                            HOLM_OAK_FANCY_TREE.withChance(0.3F), CORK_OAK_FANCY_TREE.withChance(0.3F)), HOLM_OAK_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    //Thermolyphic Forest - Make a dragon blood tree with dark oak shape (Dracaena draco)
    public static final ConfiguredFeature<?, ?> SUBTROPICAL_DRY_MOUNTAIN_TREES = register("subtropical_dry_mountain_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(CANARY_DATE_PALM_TREE.withChance(0.3F),
                            CANARY_PINE_TREE_TALL.withChance(0.3F), DRAGON_BLOOD_TREE.withChance(0.0076F)), CANARY_PINE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> CANARY_PINE_TREES = register("canary_pine_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                            CANARY_PINE_TREE_TALL.withChance(0.5F)), CANARY_PINE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(12, 0.1F, 4))));

    public static final ConfiguredFeature<?, ?> HUMID_SUBTROPICAL_PINE_TREES = register("humid_subtropical_pine_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                            LOBLOLLY_PINE.withChance(0.5F), TALL_LOBLOLLY_PINE.withChance(0.35F)), SLASH_PINE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(12, 0.1F, 6))));

    public static final ConfiguredFeature<?, ?> TEMPERATE_EUCALYPTUS_SAVANNA_TREES = register("temperate_eucalyptus_savanna_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of( EUCALYPTUS_TALL_TREE.withChance(0.2F),
                            LOMBARDY_POPLAR_TREE.withChance(0.12F)), EUCALYPTUS_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> TEMPERATE_DESERT_TREES = register("temperate_desert_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(PISTACHIO_TREE.withChance(0.2F),
                            BLACK_POPLAR_FANCY_TREE.withChance(0.3F), ALMOND_TREE1.withChance(0.3F),
                            ALMOND_TREE2.withChance(0.3F)), LOMBARDY_POPLAR_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.5F, 6))));

    public static final ConfiguredFeature<?, ?> TAIGA_EXTRA_VEGETATION = register("taiga_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(TAIGA_ASPEN_TREE.withChance(0.2F),
                            JUNIPER_SHRUB.withChance(0.089F)), TAIGA_LARCH_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> GINKGO_TRESS = register("ginkgo_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(GINKGO_FANCY_TREE.withChance(0.25F),
                            BLOB_GINKGO_TREE.withChance(0.09F)), CONIC_GINKGO_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(12, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> MEGA_TAIGA_EXTRA_VEGETATION = register("mega_taiga_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(TAIGA_ASPEN_TREE.withChance(0.15F),
                            JUNIPER_SHRUB.withChance(0.089F), TAIGA_LARCH_TREE.withChance(0.2F)), TAIGA_TALL_LARCH_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> HUMID_SUBTROPICAL_BEACH_VEGETATION = register("humid_subtropical_beach_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(SABAL_PALM_FANCY_TREE.withChance(0.6F),
                            SOUTHERN_WAX_MYRTLE_SHRUB.withChance(0.5F),SOUTHERN_LIVE_OAK_TREE.withChance(0.6F), SOUTHERN_MAGNOLIA_TREE.withChance(0.3F),
                            SABAL_PALM_TREE.withChance(0.7F), ORCHID_TREE.withChance(0.2F)),
                            BANANA_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> SABAL_PALMS = register("sabal_palms",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(SABAL_PALM_FANCY_TREE.withChance(0.5F)),
                            SABAL_PALM_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> RAINFOREST_CHESTNUT_TREES = register("rainforest_chestnut",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(BIG_SWEET_CHESTNUT_TREE.withChance(0.5F)),
                            SWEET_CHESTNUT_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> DARK_FOREST_EXTRA_VEGETATION = register("dark_oak_forest_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(BIG_SWEET_CHESTNUT_TREE.withChance(0.095F),
                            SWEET_CHESTNUT_TREE.withChance(0.3F), RED_OAK_SHRUB.withChance(0.2F), ELDERBERRY_TREE.withChance(0.3F),
                            OAK_SHRUB.withChance(0.4F), OAK_TREE_WITH_IVY.withChance(0.19F), FANCY_OAK_TREE_WITH_IVY.withChance(0.3F),
                            YEW_TREE.withChance(0.4F), YEW_TREE_WITH_IVY.withChance(0.2F), HOLLY_TREE1.withChance(0.19F), HOLLY_TREE2.withChance(0.1F),
                            HAWTHORN_TREE.withChance(0.2F), WALNUT_TREE.withChance(0.15F), WALNUT_FANCY_TREE.withChance(0.3F),
                            COOPER_BEECH_BIG_TREE.withChance(0.5F), HAZELNUT_TREE.withChance(0.2F), RED_OAK_TREE.withChance(0.089F),
                            RED_MAPLE_TREE.withChance(0.059F), RED_MAPLE_FANCY_TREE.withChance(0.05F), ROWAN_TREE1.withChance(0.3F),
                            ROWAN_TREE2.withChance(0.26F),
                            BLOB_RED_MAPLE_TREE.withChance(0.09F), CHERRY_PLUM_FANCY_TREE.withChance(0.4F), CHERRY_PLUM_TREE.withChance(0.34F)),
                            DARK_OAK_WITH_IVY)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> MOUNTAIN_EXTRA_VEGETATION = register("mountain_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(BLUE_SPRUCE.withChance(0.078F),
                            HAWTHORN_TREE.withChance(0.012F), ROWAN_TREE1.withChance(0.012F), ROWAN_TREE2.withChance(0.001F),
                            MOUNTAIN_HEMLOCK_TREE.withChance(0.5F), MOUNTAIN_HEMLOCK_TREE_TALL.withChance(0.5F),
                    SUBALPINE_FIR.withChance(0.7F), JUNIPER_SHRUB.withChance(0.25F), MUGO_PINE_TREE.withChance(0.13F)), MUGO_PINE_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(6, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> JUNGLE_EXTRA_VEGETATION = register("jungle_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WEEPING_FIG_TREE.withChance(0.2F),
                            BIG_WEEPING_FIG_TREE.withChance(0.2F), MANGO_FANCY_TREE.withChance(0.15F), CREEPING_FIG_AVOCADO_TREE.withChance(0.12F),
                            MANGO_TREE.withChance(0.15F), LEMON_TREE.withChance(0.2F), BUDDHA_HAND_TREE.withChance(0.12F), CITRON_TREE.withChance(0.2F),
                            TAHITI_LIME_TREE.withChance(0.2F), DURIAN_TREE.withChance(0.2F), DURIAN_TREE_PEPPER_VINE.withChance(0.2F),
                            BREADFRUIT_TREE.withChance(0.25F), PEPPERCORN_INDIAN_LAUREL_TREE.withChance(0.23F), PEPPERCORN_BIG_INDIAN_LAUREL_TREE.withChance(0.13F),
                            BIG_INDIAN_LAUREL_TREE.withChance(0.2F), OIL_PALM_TREE.withChance(0.3F), BANANA_TREE.withChance(0.4F), PEPPERCORN_WEEPING_FIG_TREE.withChance(0.12F), PEPPERCORN_BIG_WEEPING_FIG_TREE.withChance(0.16F),
                            AVOCADO_TREE.withChance(0.4F), WEEPING_FIG_WITH_CREEPING_FIG.withChance(0.24F), INDIAN_LAUREL_WITH_CREEPING_FIG.withChance(0.28F),
                    STARFRUIT_TREE.withChance(0.4F), PEPPERCORN_AVOCADO_TREE.withChance(0.2F), TROPICAL_ALMOND_TREE.withChance(0.2F),
                            TROPICAL_ALMOND_BIG_TREE.withChance(0.2F), RED_KAPOK_TREE.withChance(0.3F), ORCHID_TREE.withChance(0.2F),
                    RUBBER_TREE.withChance(0.2F), RUBBER_TREE_WITH_CREEPING_FIG.withChance(0.15F), PEPPERCORN_RUBBER_TREE.withChance(0.2F),
                    PEPPERCORN_JUNGLE_TREE.withChance(0.28F)), INDIAN_LAUREL_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(7, 0.3F, 0))));

    public static final ConfiguredFeature<?, ?> JUNGLE_HILLS_EXTRA_VEGETATION = register("jungle_hills_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WEEPING_FIG_TREE.withChance(0.2F),
                            BIG_WEEPING_FIG_TREE.withChance(0.2F), MANGO_FANCY_TREE.withChance(0.15F), CREEPING_FIG_AVOCADO_TREE.withChance(0.12F),
                            MANGO_TREE.withChance(0.15F), LEMON_TREE.withChance(0.2F), BUDDHA_HAND_TREE.withChance(0.12F), CITRON_TREE.withChance(0.2F),
                            TAHITI_LIME_TREE.withChance(0.2F), OIL_PALM_TREE.withChance(0.3F), DURIAN_TREE.withChance(0.2F), DURIAN_TREE_PEPPER_VINE.withChance(0.2F),
                            BREADFRUIT_TREE.withChance(0.25F), PEPPERCORN_INDIAN_LAUREL_TREE.withChance(0.16F), PEPPERCORN_BIG_INDIAN_LAUREL_TREE.withChance(0.13F),
                            BIG_INDIAN_LAUREL_TREE.withChance(0.2F), BANANA_TREE.withChance(0.4F), PEPPERCORN_WEEPING_FIG_TREE.withChance(0.12F), PEPPERCORN_BIG_WEEPING_FIG_TREE.withChance(0.16F),
                            AVOCADO_TREE.withChance(0.4F), WEEPING_FIG_WITH_CREEPING_FIG.withChance(0.24F), INDIAN_LAUREL_WITH_CREEPING_FIG.withChance(0.28F),
                            STARFRUIT_TREE.withChance(0.4F), PEPPERCORN_AVOCADO_TREE.withChance(0.2F), RED_KAPOK_TREE.withChance(0.3F),
                            PEPPERCORN_JUNGLE_TREE.withChance(0.28F), BUNYA_PINE_TREE.withChance(0.4F), TROPICAL_ALMOND_TREE.withChance(0.2F),
                            TROPICAL_ALMOND_BIG_TREE.withChance(0.2F), ORCHID_TREE.withChance(0.2F),
                            RUBBER_TREE.withChance(0.2F), RUBBER_TREE_WITH_CREEPING_FIG.withChance(0.15F), PEPPERCORN_RUBBER_TREE.withChance(0.2F),
                            YOUNG_BUNYA_PINE_TREE.withChance(0.35F)), INDIAN_LAUREL_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(7, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> JUNGLE_EDGE_EXTRA_VEGETATION = register("jungle_edge_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WEEPING_FIG_TREE.withChance(0.2F),
                            BIG_WEEPING_FIG_TREE.withChance(0.35F), MANGO_FANCY_TREE.withChance(0.15F), CREEPING_FIG_AVOCADO_TREE.withChance(0.12F),
                            MANGO_TREE.withChance(0.15F), OIL_PALM_TREE.withChance(0.6F), LEMON_TREE.withChance(0.2F), BUDDHA_HAND_TREE.withChance(0.12F), CITRON_TREE.withChance(0.2F),
                            TAHITI_LIME_TREE.withChance(0.2F), DURIAN_TREE.withChance(0.2F), DURIAN_TREE_PEPPER_VINE.withChance(0.2F),
                            BREADFRUIT_TREE.withChance(0.25F), PEPPERCORN_INDIAN_LAUREL_TREE.withChance(0.16F), PEPPERCORN_BIG_INDIAN_LAUREL_TREE.withChance(0.13F),
                            BIG_INDIAN_LAUREL_TREE.withChance(0.35F), BANANA_TREE.withChance(0.4F), PEPPERCORN_WEEPING_FIG_TREE.withChance(0.12F), PEPPERCORN_BIG_WEEPING_FIG_TREE.withChance(0.16F),
                            AVOCADO_TREE.withChance(0.4F), WEEPING_FIG_WITH_CREEPING_FIG.withChance(0.24F), INDIAN_LAUREL_WITH_CREEPING_FIG.withChance(0.28F),
                            STARFRUIT_TREE.withChance(0.4F), PEPPERCORN_AVOCADO_TREE.withChance(0.2F),
                            RED_KAPOK_TREE.withChance(0.2F), TROPICAL_ALMOND_TREE.withChance(0.2F),
                            TROPICAL_ALMOND_BIG_TREE.withChance(0.2F), ORCHID_TREE.withChance(0.2F),
                            RUBBER_TREE.withChance(0.2F), RUBBER_TREE_WITH_CREEPING_FIG.withChance(0.15F), PEPPERCORN_RUBBER_TREE.withChance(0.2F),
                            PEPPERCORN_JUNGLE_TREE.withChance(0.28F)), INDIAN_LAUREL_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.3F, 0))));

    public static final ConfiguredFeature<?, ?> SWAMP_EXTRA_VEGETATION = register("swamp_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                            SABAL_PALM_TREE.withChance(0.098F), SABAL_PALM_FANCY_TREE.withChance(0.089F),
                            SOUTHERN_MAGNOLIA_TREE.withChance(0.089F), SOUTHERN_MAGNOLIA_WITH_KIWI.withChance(0.07F), PLANE_TREE.withChance(0.3F),
                            PLANE_TREE_WITH_KIWI.withChance(0.09F), ELDERBERRY_TREE.withChance(0.3F), MULBERRY_TREE.withChance(0.1F),
                            PLANE_FANCY_TREE.withChance(0.15F), RED_MAPLE_TREE.withChance(0.04F), RED_MAPLE_TREE_WITH_KIWI.withChance(0.04F),
                            RED_MAPLE_TREE_WITH_CREEPING_FIG.withChance(0.049F), PERSIMMON_TREE.withChance(0.12F), PERSIMMON_FANCY_TREE.withChance(0.25F),
                            SOUTHERN_LIVE_OAK_WITH_CREEPING_FIG.withChance(0.053F), SOUTHERN_LIVE_OAK_TREE.withChance(0.4F),
                            SPANISH_MOSS_MEGA_BALD_CYPRESS.withChance(0.3F),
                            BALD_CYPRESS.withChance(0.12F), PLANE_FANCY_TREE_WITH_IVY.withChance(0.07F),
                            PLANE_TREE_WITH_IVY.withChance(0.09F), WEEPING_WILLOW_BIG.withChance(0.3F), WEEPING_WILLOW_FANCY.withChance(0.3F)),
                            SPANISH_MOSS_BALD_CYPRESS))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(3, 0.1F, 0))));

    public static final ConfiguredFeature<?, ?> BIRCH_FOREST_EXTRA_VEGETATION = register("birch_forest_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                            ROWAN_TREE2.withChance(0.09F), ROWAN_TREE1.withChance(0.13F), HOLLY_TREE2.withChance(0.057F),
                            HOLLY_TREE1.withChance(0.067F), BLACK_POPLAR_FANCY_TREE.withChance(0.1F), LOMBARDY_POPLAR_TREE.withChance(0.1F),
                            JUNIPER_SHRUB.withChance(0.17F), ELDERBERRY_TREE.withChance(0.1F), HAWTHORN_TREE.withChance(0.2F)), HAZELNUT_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 0))));

    public static final ConfiguredFeature<?, ?> MIXED_CONTINENTAL_FOREST_TREES = register("mixed_continental_forest_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(ELDERBERRY_TREE.withChance(0.3F),
                            WHITE_CRABAPPLE_TREE.withChance(0.3F), ASPEN_TREE.withChance(0.1F), LOMBARDY_POPLAR_TREE.withChance(0.05F),
                            PINK_CRABAPPLE_TREE.withChance(0.3F), RED_CRABAPPLE_TREE.withChance(0.077F),
                            WALNUT_TREE.withChance(0.25F), WALNUT_FANCY_TREE.withChance(0.3F), RED_OAK_TREE.withChance(0.2F),
                            RED_OAK_FANCY_TREE.withChance(0.14F), HAWTHORN_TREE.withChance(0.12F), ROWAN_TREE2.withChance(0.12F), ROWAN_TREE1.withChance(0.15F),
                            BLACK_POPLAR_FANCY_TREE.withChance(0.4F), JUNIPER_SHRUB.withChance(0.07F), CHERRY_PLUM_FANCY_TREE.withChance(0.1F),
                            CHERRY_PLUM_TREE.withChance(0.1F), HAZELNUT_TREE.withChance(0.1F), PLANE_TREE.withChance(0.25F)),
                            PLANE_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> MIXED_CONTINENTAL_MAPLE_TREES = register("mixed_continental_forest_maples",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(RED_MAPLE_TREE.withChance(0.3F),
                            BLOB_RED_MAPLE_TREE.withChance(0.25F)), RED_MAPLE_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(8, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> FOREST_EXTRA_VEGETATION = register("forest_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(PINK_CRABAPPLE_TREE.withChance(0.1F),
                            WHITE_CRABAPPLE_TREE.withChance(0.1F), RED_CRABAPPLE_TREE.withChance(0.077F), JAPANESE_MAPLE_TREE.withChance(0.07F),
                            MULBERRY_TREE.withChance(0.2F), RED_MAPLE_TREE.withChance(0.2F), RED_MAPLE_FANCY_TREE.withChance(0.15F),
                            BLOB_RED_MAPLE_TREE.withChance(0.2F), ELDERBERRY_TREE.withChance(0.2F), PEACH_TREE.withChance(0.07F),
                            PLANE_FANCY_TREE.withChance(0.2F), LOMBARDY_POPLAR_TREE.withChance(0.05F), BLACK_POPLAR_FANCY_TREE.withChance(0.091F),
                            PECAN_TREE.withChance(0.2F), WALNUT_TREE.withChance(0.15F), WALNUT_FANCY_TREE.withChance(0.3F),
                            PECAN_FANCY_TREE.withChance(0.3F), OAK_TREE_WITH_IVY.withChance(0.19F), FANCY_OAK_TREE_WITH_IVY.withChance(0.3F),
                            SWEET_CHESTNUT_TREE.withChance(0.2F), HAWTHORN_TREE.withChance(0.2F), HAZELNUT_TREE.withChance(0.2F),
                            PLANE_TREE.withChance(0.6F), CHERRY_PLUM_FANCY_TREE.withChance(0.4F), CHERRY_PLUM_TREE.withChance(0.34F)),
                            OAK_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(6, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> WESTERN_HEMLOCK_TREES = register("western_hemlock_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WESTERN_HEMLOCK_TREE_TALL.withChance(0.3F),
                            WESTERN_HEMLOCK_WITH_IVY.withChance(0.1F)), WESTERN_HEMLOCK_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(45, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> SAVANNA_EXTRA_VEGETATION = register("savanna_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(SYCAMORE_FIG_FANCY_TREE.withChance(0.19F),
                            SAUSAGE_TREE.withChance(0.3F), INDIAN_CORAL_FANCY_TREE.withChance(0.19F), INDIAN_CORAL_TREE.withChance(0.089F),
                            TAMARIND_TREE.withChance(0.2F), SYCAMORE_FIG_ANCIENT_TREE.withChance(0.15F),
                            MARULA_TREE.withChance(0.24F), TALL_BISMARCK_PALM.withChance(0.4F), BISMARCK_PALM.withChance(0.3F),
                            JACKALBERRY_TREE.withChance(0.3F), SYCAMORE_FIG_ANCIENT_TREE.withChance(0.13F), PLUMERIA_ORANGE_TREE.withChance(0.071F),
                            PLUMERIA_PINK_TREE.withChance(0.071F), PLUMERIA_YELLOW_TREE.withChance(0.061F), PLUMERIA_WHITE_TREE.withChance(0.08F),
                            PLUMERIA_RED_TREE.withChance(0.061F), ORCHID_TREE.withChance(0.098F),
                            JACKALBERRY_FANCY_TREE.withChance(0.15F), YELLOW_OLEANDER_TREE.withChance(0.12F), ORANGE_OLEANDER_TREE.withChance(0.12F)),
                            SYCAMORE_FIG_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> PLAINS_EXTRA_VEGETATION = register("plains_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(LOMBARDY_POPLAR_TREE.withChance(0.2F),
                            BLACK_POPLAR_FANCY_TREE.withChance(0.2F), PECAN_FANCY_TREE.withChance(0.3F), PLANE_TREE.withChance(0.2F),
                            PLANE_TREE.withChance(0.2F), PECAN_TREE.withChance(0.15F), WALNUT_TREE.withChance(0.15F), WALNUT_FANCY_TREE.withChance(0.2F),
                            OAK_SHRUB.withChance(0.2F)), ELDERBERRY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.3F, 5))));

    public static final ConfiguredFeature<?, ?> OLEANDER_SHRUBS = register("oleander_shrubs",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WHITE_OLEANDER_SHRUB.withChance(0.3F),
                            DARK_PINK_OLEANDER_SHRUB.withChance(0.3F), RED_OLEANDER_SHRUB.withChance(0.3F)), PINK_OLEANDER_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(8, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> PLUMERIA_TREES = register("plumeria_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(PLUMERIA_ORANGE_TREE.withChance(0.12F),
                            PLUMERIA_PINK_TREE.withChance(0.12F), PLUMERIA_RED_TREE.withChance(0.1F), PLUMERIA_YELLOW_TREE.withChance(0.1F)),
                            PLUMERIA_WHITE_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 2))));

    //Zion National Park Utah
    public static final ConfiguredFeature<?, ?> LOWLAND_BADLANDS_VEGETATION = register("lowland_badlands_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(JUNIPER_TREE.withChance(0.3F),
                            MESQUITE_TREE.withChance(0.15F), FREMONT_POPLAR_TREE.withChance(0.2F)), PINYON_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(6, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> WOODED_BADLANDS_VEGETATION = register("wooded_badlands_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(PONDEROSA_PINE_TREE_TALL.withChance(0.42F),
                            WHITE_FIR.withChance(0.2F), ASPEN_TREE.withChance(0.15F), BLUE_SPRUCE.withChance(0.1F), DOUGLAS_FIR_TREE.withChance(0.4F),
                            GIANT_DOUGLAS_FIR_TREE.withChance(0.3F)),
                            PONDEROSA_PINE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(6, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> SCRUBLAND_OLEANDER_SHRUBS = register("scrubland_oleander_shrubs",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WHITE_OLEANDER_SHRUB.withChance(0.3F),
                            DARK_PINK_OLEANDER_SHRUB.withChance(0.3F), RED_OLEANDER_SHRUB.withChance(0.3F)), PINK_OLEANDER_SHRUB))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.3F, 3))));

    public static final ConfiguredFeature<?, ?> TREES_SCRUBLAND = register("trees_scrubland",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                    FORKY_FIG_TREE.withChance(0.3F), STRAWBERRY_TREE2.withChance(0.091F),
                            STRAWBERRY_TREE1.withChance(0.089F), FIG_TREE.withChance(0.2F)),
                            POMEGRANATE_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> HOLLY_TREES = register("holly_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(HOLLY_TREE2.withChance(0.3F)),
                            HOLLY_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> HEMIBOREAL_PRAIRIE_TREES = register("hemiboreal_prairie_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(BLACK_POPLAR_FANCY_TREE.withChance(0.5F),
                            ALMOND_TREE2.withChance(0.4F), ALMOND_TREE1.withChance(0.5F)),
                            LOMBARDY_POPLAR_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 0))));

    public static final ConfiguredFeature<?, ?> TEMPERATE_RAINFOREST_SHRUBS = register("temperate_rainforest_shrubs",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(RED_OAK_SHRUB.withChance(0.3F)),
                            OAK_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> TREES_TEMPERATE_RAINFOREST = register("trees_temperate_rainforest",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(COOPER_BEECH_TREE.withChance(0.3F),
                            COOPER_BEECH_BIG_TREE.withChance(0.2F), OAK_TREE_WITH_IVY.withChance(0.19F), FANCY_OAK_TREE_WITH_IVY.withChance(0.3F),
                            RED_OAK_FANCY_TREE.withChance(0.3F), HAZELNUT_TREE.withChance(0.23F), RED_MAPLE_TREE.withChance(0.2F),
                            RED_MAPLE_TREE_WITH_KIWI.withChance(0.072F), OAK_TREE_WITH_KIWI.withChance(0.031F),
                            RED_MAPLE_FANCY_TREE.withChance(0.2F), BLOB_RED_MAPLE_TREE.withChance(0.3F),
                            HAWTHORN_TREE.withChance(0.3F), YEW_TREE.withChance(0.3F),
                            ROWAN_TREE1.withChance(0.2F), ROWAN_TREE2.withChance(0.15F), HAWTHORN_TREE.withChance(0.3F)), RED_OAK_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(3, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> SOCOTRA_TREES = register("socotra_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(SOCOTRA_DESERT_ROSE_TREE.withChance(0.1F),
                            SOCOTRA_CUCUMBER_TREE.withChance(0.07F), DATE_PALM_TREE.withChance(0.06F)),
                            DRAGON_BLOOD_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.3F, 3))));

    public static final ConfiguredFeature<?, ?> HIGHLAND_OCOTEA_TREES = register("highland_ocotea",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(HIGHLAND_OCOTEA_TREE_WITH_CREEPING_VINE.withChance(0.07F),
                    CREEPING_FIG_AVOCADO_TREE.withChance(0.09F), ELDERBERRY_TREE.withChance(0.1F), HIGHLAND_OCOTEA_TREE_WITH_KIWI.withChance(0.082F)),
                           HIGHLAND_OCOTEA_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.3F, 3))));

    public static final ConfiguredFeature<?, ?> MEDITERRANEAN_SAVANNA_FRUIT_TREES = register("mediterranean_savanna_fruit_trees", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(FORKY_FIG_TREE.withChance(0.3F), FIG_TREE.withChance(0.5F)),
                    POMEGRANATE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> OAK_SHRUBS = register("oak_shrubs", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(HOLM_OAK_SHRUB.withChance(0.3F), CORK_OAK_SHRUB.withChance(0.3F)),
                    OAK_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> SUBTROPICAL_EXTREME_HILLS_VEGETATION = register("subtropical_extreme_hills_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(CHINESE_RED_PINE_TREE.withChance(0.8F)),
                    OAK_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(8, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> TROPICAL_PINES = register("tropical_pines", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(NORFOLK_ISLAND_PINE_TREE.withChance(0.8F),
                    NORFOLK_ISLAND_PINE_WITH_PEPPER_VINE.withChance(0.3F), COOK_PINE_WITH_PEPPER_VINE.withChance(0.2F)),
                    COOK_PINE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
            .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(4, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> MEDITERRANEAN_CONIFER_TREES = register("mediterranean_conifer_trees", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(STONE_PINE_TREE2.withChance(0.1F), ITALIAN_CYPRESS_TREE.withChance(0.5F)),
                    STONE_PINE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
            .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> CRAPE_MYRTLE_TREES = register("crape_myrtle_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WHITE_CRAPE_MYRTLE_TREE.withChance(0.1F),
                            PINK_CRAPE_MYRTLE_TREE.withChance(0.3F), RED_CRAPE_MYRTLE_TREE.withChance(0.3F)), PURPLE_CRAPE_MYRTLE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 5))));

    public static final ConfiguredFeature<?, ?> TROPICAL_BEACH_TREES = register("tropical_beach_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(TROPICAL_ALMOND_TREE.withChance(0.1F),
                            TROPICAL_ALMOND_BIG_TREE.withChance(0.2F), COAST_COTTONWOOD_FANCY_TREE.withChance(0.3F),
                            COAST_COTTONWOOD_TREE.withChance(0.2F), COCONUT_PALM_TREE.withChance(0.1F), TROPICAL_ALMOND_WITH_PEPPERCORN.withChance(0.0049F),
                            SMALL_COCONUT_PALM_WITH_PEPPERCORN.withChance(0.0069F), ORCHID_TREE.withChance(0.01F)), SMALL_COCONUT_PALM_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> INDIAN_CORAL_TREES = register("indian_coral_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(INDIAN_CORAL_TREE.withChance(0.5F)),
                    INDIAN_CORAL_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> MONKEY_PUZZLE_TREES = register("monkey_puzzle_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(YOUNG_MONKEY_PUZZLE_TREE.withChance(0.1F)),
                    MONKEY_PUZZLE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(10, 0.1F, 3))));

    public static final ConfiguredFeature<?, ?> JUNGLE_FIG_TREES = register("jungle_fig_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WEEPING_FIG_TREE.withChance(0.1F),
                            BIG_WEEPING_FIG_TREE.withChance(0.3F), WEEPING_FIG_WITH_CREEPING_FIG.withChance(0.07F),
                            INDIAN_LAUREL_TREE.withChance(0.3F), INDIAN_LAUREL_WITH_CREEPING_FIG.withChance(0.08F),
                            PEPPERCORN_INDIAN_LAUREL_TREE.withChance(0.09F), PEPPERCORN_BIG_INDIAN_LAUREL_TREE.withChance(0.13F),
                            PEPPERCORN_WEEPING_FIG_TREE.withChance(0.08F), PEPPERCORN_BIG_WEEPING_FIG_TREE.withChance(0.08F),
                            RUBBER_TREE.withChance(0.08F), RUBBER_TREE_WITH_CREEPING_FIG.withChance(0.09F), PEPPERCORN_RUBBER_TREE.withChance(0.08F)),
                            BIG_INDIAN_LAUREL_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(12, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> TROPICAL_PINE_ISLAND_JUNGLE_FIGS = register("tropical_pine_jungle_figs",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WEEPING_FIG_TREE.withChance(0.1F),
                            BIG_WEEPING_FIG_TREE.withChance(0.3F), WEEPING_FIG_WITH_CREEPING_FIG.withChance(0.07F),
                            INDIAN_LAUREL_TREE.withChance(0.3F), INDIAN_LAUREL_WITH_CREEPING_FIG.withChance(0.08F),
                            RUBBER_TREE.withChance(0.2F), RUBBER_TREE_WITH_CREEPING_FIG.withChance(0.15F), PEPPERCORN_RUBBER_TREE.withChance(0.2F)), BIG_INDIAN_LAUREL_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> CASUARINA_TREES = register("casuarina_trees", Feature.RANDOM_SELECTOR.withConfiguration(
            new MultipleRandomFeatureConfig((ImmutableList.of(PEPPERCORN_CASUARINA_TREE.withChance(0.4F))), PINE_LIKE_CASUARINA_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> EUCALYPTUS_TREES = register("eucalyptus_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(EUCALYPTUS_TALL_TREE.withChance(0.5F)),
                    EUCALYPTUS_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(13, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> STRAWBERRY_TREES = register("strawberry_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(STRAWBERRY_TREE1.withChance(0.5F)),
                    STRAWBERRY_TREE2)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(4, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> FIG_TREES = register("fig_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(FIG_TREE.withChance(0.5F)),
                    FORKY_FIG_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> PLAINS_EUCALYPTUS_TREES = register("plains_eucalyptus_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(EUCALYPTUS_TALL_TREE.withChance(0.5F)),
                    EUCALYPTUS_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(0, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> PLAINS_SUBTROPICAL_TREES = register("subtropical_plains_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(ELDERBERRY_TREE.withChance(0.2F),
                    PLANE_TREE.withChance(0.23F), PLANE_FANCY_TREE.withChance(0.3F), SOUTHERN_LIVE_OAK_TREE.withChance(0.3F), POHUTUKAWA_TREE.withChance(0.1F),
                    ACACIA.withChance(0.2F), OAK_BEES_0002.withChance(0.2F), PECAN_FANCY_TREE.withChance(0.2F), FANCY_OAK_BEES_0002.withChance(0.09F),
                    PECAN_TREE.withChance(0.25F)), OAK_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(0, 0.2F, 1))));

    public static final ConfiguredFeature<?, ?> TEAK_TREES = register("teak_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(TEAK_TALL_TREE.withChance(0.5F),
                    MEGA_TEAK_TREE.withChance(0.2F)),
                    TEAK_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(10, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> TROPICAL_FOREST_DECIDUOUS_TREES = register("tropical_forest_deciduous_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(RED_KAPOK_TREE.withChance(0.3F),
                            ROYAL_POINCIANA_TREE.withChance(0.1F),  MANGO_TREE.withChance(0.25F), ACEROLA_TREE.withChance(0.09F),
                            MANGO_FANCY_TREE.withChance(0.3F), BISMARCK_PALM.withChance(0.08F), BISMARCK_PALM.withChance(0.07F),
                            AVOCADO_TREE.withChance(0.09F), STARFRUIT_TREE.withChance(0.08F), ORCHID_TREE.withChance(0.09F),
                            POMEGRANATE_TREE.withChance(0.09F), PINK_IVORY_TREE.withChance(0.2F), PINK_IVORY_FANCY_TREE.withChance(0.2F),
                            ROYAL_POINCIANA_BIG_TREE.withChance(0.3F), SYCAMORE_FIG_TREE.withChance(0.12F),
                            SYCAMORE_FIG_FANCY_TREE.withChance(0.2F), TROPICAL_ALMOND_TREE.withChance(0.12F),
                            TROPICAL_ALMOND_BIG_TREE.withChance(0.2F), ORANGE_OLEANDER_TREE.withChance(0.09F),
                            YELLOW_OLEANDER_TREE.withChance(0.09F), FOREST_ACACIA_TREE.withChance(0.34F)), TAMARIND_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(12, 0.25F, 6))));

    public static final ConfiguredFeature<?, ?> SUBTROPICAL_LAUREL_FOREST_TREES = register("subtropical_laurel_forest_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(LOQUAT_TREE.withChance(0.3F),
                            SOUTHERN_MAGNOLIA_TREE.withChance(0.3F), BANANA_TREE.withChance(0.25F),
                            STARFRUIT_TREE.withChance(0.2F), OAK_TREE_WITH_KIWI.withChance(0.09F),
                            MULBERRY_TREE.withChance(0.4F), OAK_TREE_WITH_IVY.withChance(0.2F), ORCHID_TREE.withChance(0.1F),
                            FANCY_OAK_TREE_WITH_IVY.withChance(0.3F), STARFRUIT_TREE_WITH_KIWI.withChance(0.2F),
                            ELDERBERRY_TREE.withChance(0.2F), PERSIMMON_TREE.withChance(0.25F), PERSIMMON_FANCY_TREE.withChance(0.3F),
                            CREEPING_FIG_AVOCADO_TREE.withChance(0.3F), PEACH_TREE.withChance(0.19F)),
                            SOUTHERN_LIVE_OAK_WITH_CREEPING_FIG))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(6, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> SUBTROPICAL_EUCALYPTUS_FOREST_TREES = register("subtropical_eucalyptus_forest_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(FOREST_ACACIA_TREE.withChance(0.2F),
                            MULBERRY_TREE.withChance(0.2F), PECAN_FANCY_TREE.withChance(0.2F), PECAN_TREE.withChance(0.25F), AVOCADO_TREE.withChance(0.1F),
                            ELDERBERRY_TREE.withChance(0.3F), CANARY_DATE_PALM_TREE.withChance(0.25F),
                            PINK_IVORY_TREE.withChance(0.2F), SUBTROPICAL_SPRING_ORCHID_TREE.withChance(0.078F)),
                            PINK_IVORY_FANCY_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                            .configure(new AtSurfaceWithExtraConfig(3, 0.2F, 1))));

    public static final ConfiguredFeature<?, ?> SUBTROPICAL_FOREST_PLANE_TREES = register("subtropical_forest_plane_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(PLANE_TREE.withChance(0.6F)),
                            PLANE_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                            .configure(new AtSurfaceWithExtraConfig(4, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> DECIDUOUS_SUBTROPICAL_FOREST_TREES = register("deciduous_subtropical_forest_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(LOQUAT_TREE.withChance(0.4F),
                            ELDERBERRY_TREE.withChance(0.3F), SOUTHERN_LIVE_OAK_TREE.withChance(0.6F), MULBERRY_TREE.withChance(0.4F),
                            AVOCADO_TREE.withChance(0.3F), PECAN_FANCY_TREE.withChance(0.4F), PECAN_TREE.withChance(0.3F), OAK_TREE_WITH_KIWI.withChance(0.078F),
                            OAK_TREE_WITH_IVY.withChance(0.15F), PERSIMMON_TREE.withChance(0.3F), STARFRUIT_TREE.withChance(0.2F),
                            PERSIMMON_FANCY_TREE.withChance(0.4F), STARFRUIT_TREE_WITH_KIWI.withChance(0.079F), PEACH_TREE.withChance(0.2F),
                            FANCY_OAK_TREE_WITH_IVY.withChance(0.27F), CREEPING_FIG_AVOCADO_TREE.withChance(0.06F),
                            PINK_IVORY_TREE.withChance(0.26F), PINK_IVORY_FANCY_TREE.withChance(0.3F),
                            RED_MAPLE_TREE.withChance(0.2F), RED_MAPLE_TREE_WITH_KIWI.withChance(0.12F), SUBTROPICAL_SPRING_ORCHID_TREE.withChance(0.2F),
                            RED_MAPLE_TREE_WITH_CREEPING_FIG.withChance(0.073F), RED_MAPLE_FANCY_TREE.withChance(0.4F), BLOB_RED_MAPLE_TREE.withChance(0.3F),
                            SOUTHERN_LIVE_OAK_WITH_CREEPING_FIG.withChance(0.08F)), SOUTHERN_MAGNOLIA_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(12, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> JUNGLE_OCOTEA_TREES = register("jungle_ocotea_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(OCOTEA_JUNGLE_TREE_CREEPING_FIG.withChance(0.3F),
                            OCOTEA_JUNGLE_TREE_CREEPING_FIG.withChance(0.3F), OCOTEA_JUNGLE_TREE.withChance(0.5F), OCOTEA_JUNGLE_FANCY_TREE_CREEPING_FIG.withChance(0.3F)),
                            OCOTEA_JUNGLE_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> FOREST_OCOTEA_TREES = register("forest_ocotea_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(OCOTEA_FOREST_TREE.withChance(0.3F),
                            OCOTEA_FOREST_FANCY_TREE_WITH_CREEPING_FIG.withChance(0.5F),
                            OCOTEA_TREE_WITH_KIWI.withChance(0.3F)), OCOTEA_FOREST_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> MEDITERRANEAN_SAVANNA_SMALL_TREES = register("mediterranean_savanna_small_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(OLIVE_TREE.withChance(0.1F),
                            LOMBARDY_POPLAR_TREE.withChance(0.1F),  CANARY_DATE_PALM_TREE.withChance(0.089F),
                            CAROB_TREE.withChance(0.25F), ELDERBERRY_TREE.withChance(0.2F), ALMOND_TREE1.withChance(0.073F), ALMOND_TREE2.withChance(0.073F),
                            CORK_OAK_TREE.withChance(0.3F)), HOLM_OAK_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.0F, 0))));

    public static final ConfiguredFeature<?, ?> TROPICAL_PINE_ISLAND_TREES = register("tropical_pine_island_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(INDIAN_CORAL_TREE.withChance(0.3F),
                            ROYAL_POINCIANA_TREE.withChance(0.1F), BANANA_TREE.withChance(0.35F), ROYAL_POINCIANA_BIG_TREE.withChance(0.1F),
                            RED_KAPOK_TREE.withChance(0.1F), ORCHID_TREE.withChance(0.1F), ACEROLA_TREE.withChance(0.1F),
                            ORANGE_OLEANDER_TREE.withChance(0.12F), YELLOW_OLEANDER_TREE.withChance(0.12F), TROPICAL_ALMOND_TREE.withChance(0.12F),
                            TROPICAL_ALMOND_BIG_TREE.withChance(0.2F), COAST_COTTONWOOD_TREE.withChance(0.2F), COAST_COTTONWOOD_TREE.withChance(0.12F),
                            INDIAN_CORAL_FANCY_TREE.withChance(0.2F), TAMARIND_TREE.withChance(0.2F)), FOREST_ACACIA_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    private static final ConfiguredFeature<?,?> ACACIA_TREE = Features.ACACIA;
    public static final ConfiguredFeature<?, ?> TROPICAL_STEEPE_TREES = register("tropical_steepe_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(POMEGRANATE_TREE.withChance(0.089F),
                            MESQUITE_TREE.withChance(0.1F), SYCAMORE_FIG_TREE.withChance(0.12F), SYCAMORE_FIG_FANCY_TREE.withChance(0.2F),
                            SYCAMORE_FIG_ANCIENT_TREE.withChance(0.15F), DATE_PALM_TREE.withChance(0.15F)),
                            ACACIA_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 3))));

    public static final ConfiguredFeature<?, ?> SUBTROPICAL_DESERT_TREES = register("subtropical_desert_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(POMEGRANATE_TREE.withChance(0.2F),
                            SYCAMORE_FIG_TREE.withChance(0.12F), ACACIA.withChance(0.3F), MESQUITE_TREE.withChance(0.3F),
                            DATE_PALM_TREE.withChance(0.5F)), SYCAMORE_FIG_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.3F, 5))));

    public static final ConfiguredFeature<?, ?> TROPICAL_JUNGLE_FRUIT_TREES = register("tropical_jungle_fruit_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                            STARFRUIT_TREE.withChance(0.4F), BANANA_TREE.withChance(0.4F), CREEPING_FIG_AVOCADO_TREE.withChance(0.4F), MANGO_TREE.withChance(0.3F),
                            AVOCADO_TREE.withChance(0.3F)), MANGO_FANCY_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 0))));

    public static final ConfiguredFeature<?, ?> JAPANESE_MAPLE = register("japanese_maple",
            JAPANESE_MAPLE_TREE.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
            .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(4, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> BUNYA_PINES = register("bunya_pines",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(YOUNG_BUNYA_PINE_TREE.withChance(0.2F)),
                            BUNYA_PINE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(8, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> POHUTUKAWA_TREES = register("pohutukawa_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(POHUTUKAWA_TREE_WITH_CREEPING_FIG.withChance(0.2F)),
                            POHUTUKAWA_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> SOUTHERN_BEECH_FOREST_VEGETATION = register("southern_beech_forest_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(SOUTHERN_BEECH_SHRUB.withChance(0.1F)),
                            SOUTHERN_BEECH_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> LUSH_SOUTHERN_TUNDRA_VEGETATION = register("lush_southern_tundra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(SOUTHERN_BEECH_TREE.withChance(0.0003F)),
                            SOUTHERN_BEECH_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> SCRUBLAND_MEDITERRANEAN_CONIFERS = register("scrubland_mediterranean_conifers",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(ITALIAN_CYPRESS_TREE.withChance(0.5F)),
                    STONE_PINE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(1, 0.1F, 0))));

    public static final ConfiguredFeature<?, ?> CAMELLIA_TREES = register("camellia_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(CAMELLIA_TREE.withChance(0.3F)),
                            TEA_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> SUBTROPICAL_FOREST_CITRUS_TREES = register("subtropical_citrus_trees", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(MANDARIN_TREE.withChance(0.5F), GRAPEFRUIT_TREE.withChance(0.5F)),
                    ORANGE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> TROPICAL_FOREST_CITRUS_TREES = register("tropical_citrus_trees", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(TAHITI_LIME_TREE.withChance(0.5F), CITRON_TREE.withChance(0.3F),
                    BUDDHA_HAND_TREE.withChance(0.4F)), LEMON_TREE))
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> TEMPERATE_FRUIT_TREES = register("temperate_fruit_trees", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(PINK_CRABAPPLE_TREE.withChance(0.5F), CHERRY_PLUM_TREE.withChance(0.1F),
                    CHERRY_PLUM_FANCY_TREE.withChance(0.3F), RED_CRABAPPLE_TREE.withChance(0.2F), MULBERRY_TREE.withChance(0.3F),
                    ELDERBERRY_TREE.withChance(0.3F)), WHITE_CRABAPPLE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> JAPANESE_GROVE_TREES = register("japanese_grove_trees", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(SUPER_BIRCH_BEES_0002.withChance(0.3F),
                    JAPANESE_PINE_TREE.withChance(0.2F), OAK_TREE_WITH_IVY.withChance(0.1F), FANCY_OAK_TREE_WITH_IVY.withChance(0.198F),
                    OAK.withChance(0.4F), PEACH_TREE.withChance(0.2F), HAZELNUT_TREE.withChance(0.2F)), SPRUCE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(3, 0.1F, 1))));

    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String p_243968_0_, ConfiguredFeature<FC, ?> p_243968_1_) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, p_243968_0_, p_243968_1_);
    }
}

