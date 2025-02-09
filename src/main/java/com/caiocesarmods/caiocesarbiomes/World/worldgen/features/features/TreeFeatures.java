package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.block.ModBlocks;
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
import net.minecraft.world.gen.treedecorator.LeaveVineTreeDecorator;
import net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator;
import net.minecraft.world.gen.trunkplacer.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.OptionalInt;

import static net.minecraft.world.gen.feature.Features.*;

public class TreeFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, CaioCesarBiomesMod.MOD_ID);

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
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    new TwoLayerFeature(0, 0, 0, OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Mesquite Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> MESQUITE_TREE = register("mesquite_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.MESQUITE_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.MESQUITE_LEAVES),
                    new JungleFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new ForkyTrunkPlacer(6, 4, 3),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

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
                    new MegaJungleTrunkPlacer(10, 13, 4), new TwoLayerFeature(2, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> TROPICAL_ALMOND_TREE = register("tropical_almond_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.TROPICAL_ALMOND_LOG),
                    new SimpleBlockStateProvider(States.TROPICAL_ALMOND_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(1), 3),
                    new StraightTrunkPlacer(8, 6, 0),
                    new TwoLayerFeature(2, 0, 1))).setIgnoreVines().build()));

    //Southern Magnolia Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SOUTHERN_MAGNOLIA_TREE = register("southern_magnolia_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.SOUTHERN_MAGNOLIA_LOG),
                    new SimpleBlockStateProvider(States.SOUTHERN_MAGNOLIA_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), FeatureSpread.create(6)),
                    new StraightTrunkPlacer(5, 3, 0),
                    new TwoLayerFeature(1, 0, 1))).build()));

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
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0), new TwoLayerFeature(1, 0, 1))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PURPLE_CRAPE_MYRTLE_TREE = register("purple_crape_myrtle_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.MYRTLE_LOG),
                    new SimpleBlockStateProvider(States.PURPLE_CRAPE_MYRTLE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0), new TwoLayerFeature(1, 0, 1))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> WHITE_CRAPE_MYRTLE_TREE = register("white_crape_myrtle_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.MYRTLE_LOG),
                    new SimpleBlockStateProvider(States.WHITE_CRAPE_MYRTLE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0), new TwoLayerFeature(1, 0, 1))).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PINK_CRAPE_MYRTLE_TREE = register("pink_crape_myrtle_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.MYRTLE_LOG),
                    new SimpleBlockStateProvider(States.PINK_CRAPE_MYRTLE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0), new TwoLayerFeature(1, 0, 1))).build()));

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
                    new StraightTrunkPlacer(4, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> INDIAN_CORAL_FANCY_TREE = register("indian_coral_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.ERYTHRINA_LOG),
                    new SimpleBlockStateProvider(States.INDIAN_CORAL_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Avocado Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> AVOCADO_TREE = register("avocado_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.AVOCADO_LOG),
                    new SimpleBlockStateProvider(States.AVOCADO_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Crabapple Trees
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PINK_CRABAPPLE_TREE = register("pink_crabapple_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CRABAPPLE_LOG),
                    new SimpleBlockStateProvider(States.PINK_CRABAPPLE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> WHITE_CRABAPPLE_TREE = register("white_crabapple_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CRABAPPLE_LOG),
                    new SimpleBlockStateProvider(States.WHITE_CRABAPPLE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Loquat Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> LOQUAT_TREE = register("loquat_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.LOQUAT_LOG),
                    new SimpleBlockStateProvider(States.LOQUAT_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Elderberry Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> ELDERBERRY_TREE = register("elderberry_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.ELDERBERRY_LOG),
                    new SimpleBlockStateProvider(States.ELDERBERRY_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Blue Spruce Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> BLUE_SPRUCE_TREE = register("blue_spruce_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.SPRUCE_LOG),
                    new SimpleBlockStateProvider(States.BLUE_SPRUCE_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(2, 1), FeatureSpread.create(0, 2),
                            FeatureSpread.create(1, 1)),
                    new StraightTrunkPlacer(5, 2, 1),
                    new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build()));

    //Strawberry Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> STRAWBERRY_TREE1 = register("strawberry_tree1",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.STRAWBERRY_TREE_LOG),
                    new SimpleBlockStateProvider(States.STRAWBERRY_TREE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 4, 0),
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

    //Starfruit Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> STARFRUIT_FANCY_TREE = register("starfruit_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.STARFRUIT_LOG),
                    new SimpleBlockStateProvider(States.STARFRUIT_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> STARFRUIT_TREE = register("starfruit_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.STARFRUIT_LOG),
                    new SimpleBlockStateProvider(States.STARFRUIT_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));


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
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Citrus Trees - Orange
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> ORANGE_TREE = register("orange_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CITRUS_LOG),
                    new SimpleBlockStateProvider(States.ORANGE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Citrus Trees - Lemon
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> LEMON_TREE = register("lemon_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CITRUS_LOG),
                    new SimpleBlockStateProvider(States.LEMON_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(3), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(6, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Citrus Trees - Limes
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> TAHITI_LIME_TREE = register("tahiti_lime_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CITRUS_LOG),
                    new SimpleBlockStateProvider(States.TAHITI_LIME_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(3), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(6, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Citrus Trees - Citron
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CITRON_TREE = register("lemon_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CITRUS_LOG),
                    new SimpleBlockStateProvider(States.CITRON_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(3), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(6, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> BUDDHA_HAND_TREE = register("buddha_hand_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CITRUS_LOG),
                    new SimpleBlockStateProvider(States.BUDDAH_HAND_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Citrus Trees - Lemon
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> GRAPEFRUIT_TREE = register("grapefruit_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CITRUS_LOG),
                    new SimpleBlockStateProvider(States.GRAPEFRUIT_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(3), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(6, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Southern Live Oak
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SOUTHERN_LIVE_OAK_TREE = register("southern_live_oak_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.LIVE_OAK_LOG),
                    new SimpleBlockStateProvider(States.LIVE_OAK_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING)
                    .setDecorators(ImmutableList.of(LeaveVineTreeDecorator.field_236871_b_)).build()));

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

    //Eucalyptus Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> EUCALYPTUS_TALL_TREE = register("eucalyptus_tall_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.EUCALYPTUS_LOG),
                    new SimpleBlockStateProvider(States.EUCALYPTUS_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(5, 2, 6),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines()
                    .setDecorators(ImmutableList.of(Features.Placements.BEES_0002_PLACEMENT)).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> EUCALYPTUS_FANCY_TREE = register("eucalyptus_fancy_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.EUCALYPTUS_LOG),
                    new SimpleBlockStateProvider(States.EUCALYPTUS_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Casuarina Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PINE_LIKE_CASUARINA_TREE = register("pine_like_casuarina_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CASUARINA_LOG),
                    new SimpleBlockStateProvider(States.CASUARINA_LEAVES),
                    new SpruceFoliagePlacer(FeatureSpread.create(3, 0), FeatureSpread.create(3, 2), FeatureSpread.create(3, 0)),
                    new StraightTrunkPlacer(16, 2, 1),
                    new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build()));

    //Pohutukawa
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> POHUTUKAWA_TREE = register("pohutukawa_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.POHUTUKAWA_LOG),
                    new SimpleBlockStateProvider(States.POHUTUKAWA_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Cherry Plum Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CHERRY_PLUM_TREE = register("cherry_plum_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PLUM_LOG),
                    new SimpleBlockStateProvider(States.CHERRY_PLUM_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(5, 2, 0),
                    new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

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
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> BLACK_POPLAR_TREE = register("black_poplar_tree",
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
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> NORFOLK_ISLAND_PINE_TREE = register("norfolk_island_pine_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.ARAUCARIA_LOG),
                    new SimpleBlockStateProvider(States.NORFOLK_PINE_LEAVES),
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(13, 4)),
                    new StraightTrunkPlacer(16, 2, 1),
                    new TwoLayerFeature(1, 1, 2)))
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).setIgnoreVines().build()));
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
                    new MegaPineFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0), FeatureSpread.create(13, 4)),
                    new StraightTrunkPlacer(6, 2, 14),
                    new TwoLayerFeature(1, 1, 2)))
                    .setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(States.PODZOL)))).build()));

    //Jungle Fig Trees
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> WEEPING_FIG_TREE = register("weeping_fig_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.JUNGLE_FIG_LOG),
                    new SimpleBlockStateProvider(States.WEEPING_FIG_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> BIG_WEEPING_FIG_TREE = register("weeping_fig_big_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.JUNGLE_FIG_LOG),
                    new SimpleBlockStateProvider(States.WEEPING_FIG_LEAVES),
                    new DarkOakFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0)),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    new TwoLayerFeature(0, 0, 0, OptionalInt.of(4))))
                    .setDecorators(ImmutableList.of(FicusRootsDecorator.INSTANCE))
                    .setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> INDIAN_LAUREL_TREE = register("indian_laurel_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.JUNGLE_FIG_LOG),
                    new SimpleBlockStateProvider(States.INDIAN_LAUREL_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> BIG_INDIAN_LAUREL_TREE = register("indian_laurel_big_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.JUNGLE_FIG_LOG),
                    new SimpleBlockStateProvider(States.INDIAN_LAUREL_LEAVES),
                    new DarkOakFoliagePlacer(FeatureSpread.create(0), FeatureSpread.create(0)),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    new TwoLayerFeature(0, 0, 0, OptionalInt.of(4))))
                    .setDecorators(ImmutableList.of(FicusRootsDecorator.INSTANCE))
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

    //Yew Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> YEW_TREE = register("yew_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.YEW_LOG),
                    new SimpleBlockStateProvider(States.YEW_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(3), FeatureSpread.create(0), 3),
                    new MegaJungleTrunkPlacer(6, 2, 0),
                    new TwoLayerFeature(0, 0, 0,
                            OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    //Baobab Tree
    /*public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> BAOBAB_TREE = register("baobab_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.YEW_LOG),
                    new SimpleBlockStateProvider(States.YEW_LEAVES),
                    new JungleFoliagePlacer(FeatureSpread.create(3), FeatureSpread.create(0), 3),
                    new BaobabTrunkPlacer(10, 5, 3),
                    new TwoLayerFeature(1, 0, 2,
                            OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));*/

    //Dragon Blood Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> DRAGON_BLOOD_TREE = register("dragon_blood_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.DRAGON_BLOOD_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.DRAGON_BLOOD_LEAVES),
                    new BushFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
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

    //Sycamore fig tree (native of dry biomes, like sahel and subtropical steepe, it has Fig Log and fancy tree shape)
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

    //Desert Rose Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SOCOTRA_DESERT_ROSE_TREE = register("socotra_desert_rose_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.DESERT_ROSE_LOG),
                    new SimpleBlockStateProvider(TreeFeatures.States.DESERT_ROSE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new MegaJungleTrunkPlacer(4, 16, 8),
                    new TwoLayerFeature(2, 0, 1))).build()));

    //Japanese Pine Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> JAPANESE_PINE_TREE = register("japanese_pine_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.JAPANESE_PINE_LOG),
                    new SimpleBlockStateProvider(States.JAPANESE_PINE_LEAVES),
                    new AcaciaFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0)),
                    new ForkyTrunkPlacer(5, 2, 2),
                    new TwoLayerFeature(1, 0, 2))).setIgnoreVines().build()));



    public static final class States {

        protected static final BlockState AVOCADO_LOG = ModBlocks.AVOCADO_LOG.get().getDefaultState();
        protected static final BlockState AVOCADO_LEAVES = ModBlocks.AVOCADO_LEAVES.get().getDefaultState();

        protected static final BlockState YEW_LOG = ModBlocks.YEW_LOG.get().getDefaultState();
        protected static final BlockState YEW_LEAVES = ModBlocks.YEW_LEAVES.get().getDefaultState();

        protected static final BlockState JAPANESE_PINE_LOG = ModBlocks.JAPANESE_PINE_LOG.get().getDefaultState();
        protected static final BlockState JAPANESE_PINE_LEAVES = ModBlocks.JAPANESE_PINE_LEAVES.get().getDefaultState();

        protected static final BlockState DRAGON_BLOOD_LOG = ModBlocks.DRAGON_BLOOD_LOG.get().getDefaultState();
        protected static final BlockState DRAGON_BLOOD_LEAVES = ModBlocks.DRAGON_BLOOD_LEAVES.get().getDefaultState();

        protected static final BlockState DESERT_ROSE_LOG = ModBlocks.SOCOTRA_DESERT_ROSE_LOG.get().getDefaultState();
        protected static final BlockState DESERT_ROSE_LEAVES = ModBlocks.SOCOTRA_DESERT_ROSE_LEAVES.get().getDefaultState();

        protected static final BlockState BEECH_LOG = ModBlocks.BEECH_LOG.get().getDefaultState();
        protected static final BlockState COOPER_BEECH_LEAVES = ModBlocks.COOPER_BEECH_LEAVES.get().getDefaultState();

        protected static final BlockState WESTERN_HEMLOCK_LOG = ModBlocks.WESTERN_HEMLOCK_LOG.get().getDefaultState();
        protected static final BlockState WESTERN_HEMLOCK_LEAVES = ModBlocks.WESTERN_HEMLOCK_LEAVES.get().getDefaultState();

        protected static final BlockState ARAUCARIA_LOG = ModBlocks.ARAUCARIA_LOG.get().getDefaultState();
        protected static final BlockState COOK_PINE_LEAVES = ModBlocks.COOK_PINE_LEAVES.get().getDefaultState();
        protected static final BlockState NORFOLK_PINE_LEAVES = ModBlocks.NORFOLK_PINE_LEAVES.get().getDefaultState();
        protected static final BlockState MONKEY_PUZZLE_LEAVES = ModBlocks.MONKEY_PUZZLE_LEAVES.get().getDefaultState();
        protected static final BlockState BUNYA_PINE_LEAVES = ModBlocks.BUNYA_PINE_LEAVES.get().getDefaultState();

        protected static final BlockState JUNGLE_FIG_LOG = ModBlocks.JUNGLE_FIG_LOG.get().getDefaultState();
        protected static final BlockState WEEPING_FIG_LEAVES = ModBlocks.WEEPING_FIG_LEAVES.get().getDefaultState();
        protected static final BlockState INDIAN_LAUREL_LEAVES = ModBlocks.INDIAN_LAUREL_LEAVES.get().getDefaultState();

        protected static final BlockState HOLM_OAK_LOG = ModBlocks.HOLM_OAK_LOG.get().getDefaultState();
        protected static final BlockState HOLM_OAK_LEAVES = ModBlocks.HOLM_OAK_LEAVES.get().getDefaultState();

        protected static final BlockState RED_OAK_LEAVES = ModBlocks.RED_OAK_LEAVES.get().getDefaultState();

        protected static final BlockState CORK_OAK_LOG = ModBlocks.CORK_OAK_LOG.get().getDefaultState();
        protected static final BlockState CORK_OAK_LEAVES = ModBlocks.CORK_OAK_LEAVES.get().getDefaultState();

        protected static final BlockState OLEANDER_LOG = ModBlocks.OLEANDER_LOG.get().getDefaultState();
        protected static final BlockState RED_OLEANDER_LEAVES = ModBlocks.OLEANDER_RED_LEAVES.get().getDefaultState();
        protected static final BlockState WHITE_OLEANDER_LEAVES = ModBlocks.OLEANDER_WHITE_LEAVES.get().getDefaultState();
        protected static final BlockState PINK_OLEANDER_LEAVES = ModBlocks.OLEANDER_PINK_LEAVES.get().getDefaultState();
        protected static final BlockState DARK_PINK_OLEANDER_LEAVES = ModBlocks.OLEANDER_DARK_PINK_LEAVES.get().getDefaultState();

        protected static final BlockState OCOTEA_FOREST_LOG = ModBlocks.OCOTEA_FOREST_LOG.get().getDefaultState();
        protected static final BlockState OCOTEA_JUNGLE_LOG = ModBlocks.OCOTEA_JUNGLE_LOG.get().getDefaultState();
        protected static final BlockState OCOTEA_LEAVES = ModBlocks.OCOTEA_LEAVES.get().getDefaultState();

        protected static final BlockState MESQUITE_LOG = ModBlocks.MESQUITE_LOG.get().getDefaultState();
        protected static final BlockState MESQUITE_LEAVES = ModBlocks.MESQUITE_LEAVES.get().getDefaultState();

        protected static final BlockState COAST_COTTONWOOD_LOG = ModBlocks.COAST_COTTONWOOD_LOG.get().getDefaultState();
        protected static final BlockState COAST_COTTONWOOD_LEAVES = ModBlocks.COAST_COTTONWOOD_LEAVES.get().getDefaultState();

        protected static final BlockState FIG_LOG = ModBlocks.FIG_LOG.get().getDefaultState();
        protected static final BlockState FIG_LEAVES = ModBlocks.FIG_LEAVES.get().getDefaultState();
        protected static final BlockState SYCAMORE_FIG_LEAVES = ModBlocks.SYCAMORE_FIG_LEAVES.get().getDefaultState();

        protected static final BlockState OLIVE_LOG = ModBlocks.OLIVE_LOG.get().getDefaultState();
        protected static final BlockState OLIVE_LEAVES = ModBlocks.OLIVE_LEAVES.get().getDefaultState();

        protected static final BlockState ERYTHRINA_LOG = ModBlocks.ERYTHRINA_LOG.get().getDefaultState();
        protected static final BlockState INDIAN_CORAL_LEAVES = ModBlocks.INDIAN_CORAL_LEAVES.get().getDefaultState();

        protected static final BlockState TROPICAL_ALMOND_LOG = ModBlocks.TROPICAL_ALMOND_LOG.get().getDefaultState();
        protected static final BlockState TROPICAL_ALMOND_LEAVES = ModBlocks.TROPICAL_ALMOND_LEAVES.get().getDefaultState();

        protected static final BlockState SOUTHERN_MAGNOLIA_LOG = ModBlocks.SOUTHERN_MAGNOLIA_LOG.get().getDefaultState();
        protected static final BlockState SOUTHERN_MAGNOLIA_LEAVES = ModBlocks.SOUTHERN_MAGNOLIA_LEAVES.get().getDefaultState();

        protected static final BlockState POMEGRANATE_LOG = ModBlocks.POMEGRANATE_LOG.get().getDefaultState();
        protected static final BlockState POMEGRANATE_LEAVES = ModBlocks.POMEGRANATE_LEAVES.get().getDefaultState();

        protected static final BlockState MYRTLE_LOG = ModBlocks.MYRTLE_LOG.get().getDefaultState();
        protected static final BlockState RED_CRAPE_MYRTLE_LEAVES = ModBlocks.RED_CRAPE_MYRTLE_LEAVES.get().getDefaultState();
        protected static final BlockState PURPLE_CRAPE_MYRTLE_LEAVES = ModBlocks.PURPLE_CRAPE_MYRTLE_LEAVES.get().getDefaultState();
        protected static final BlockState WHITE_CRAPE_MYRTLE_LEAVES = ModBlocks.WHITE_CRAPE_MYRTLE_LEAVES.get().getDefaultState();
        protected static final BlockState PINK_CRAPE_MYRTLE_LEAVES = ModBlocks.PINK_CRAPE_MYRTLE_LEAVES.get().getDefaultState();

        protected static final BlockState SOUTHERN_WAX_MYRTLE_LEAVES = ModBlocks.SOUTHERN_WAX_MYRTLE_LEAVES.get().getDefaultState();

        protected static final BlockState STONE_PINE_LOG = ModBlocks.STONE_PINE_LOG.get().getDefaultState();
        protected static final BlockState STONE_PINE_LEAVES = ModBlocks.STONE_PINE_LEAVES.get().getDefaultState();

        protected static final BlockState CRABAPPLE_LOG = ModBlocks.CRABAPPLE_LOG.get().getDefaultState();
        protected static final BlockState PINK_CRABAPPLE_LEAVES = ModBlocks.PINK_CRABAPPLE_LEAVES.get().getDefaultState();
        protected static final BlockState WHITE_CRABAPPLE_LEAVES = ModBlocks.WHITE_CRABAPPLE_LEAVES.get().getDefaultState();

        protected static final BlockState LOQUAT_LOG = ModBlocks.LOQUAT_LOG.get().getDefaultState();
        protected static final BlockState LOQUAT_LEAVES = ModBlocks.LOQUAT_LEAVES.get().getDefaultState();

        protected static final BlockState ELDERBERRY_LOG = ModBlocks.ELDERBERRY_LOG.get().getDefaultState();
        protected static final BlockState ELDERBERRY_LEAVES = ModBlocks.ELDERBERRY_LEAVES.get().getDefaultState();

        protected static final BlockState SPRUCE_LOG = Blocks.SPRUCE_LOG.getDefaultState();
        protected static final BlockState BLUE_SPRUCE_LEAVES = ModBlocks.BLUE_SPRUCE_LEAVES.get().getDefaultState();

        protected static final BlockState STRAWBERRY_TREE_LOG = ModBlocks.STRAWBERRY_TREE_LOG.get().getDefaultState();
        protected static final BlockState STRAWBERRY_TREE_LEAVES = ModBlocks.STRAWBERRY_TREE_LEAVES.get().getDefaultState();

        protected static final BlockState ITALIAN_CYPRESS_LOG = ModBlocks.ITALIAN_CYPRESS_LOG.get().getDefaultState();
        protected static final BlockState ITALIAN_CYPRESS_LEAVES = ModBlocks.ITALIAN_CYPRESS_LEAVES.get().getDefaultState();

        protected static final BlockState RED_KAPOK_LEAVES = ModBlocks.RED_KAPOK_LEAVES.get().getDefaultState();
        protected static final BlockState JUNGLE_LOG = Blocks.JUNGLE_LOG.getDefaultState();

        protected static final BlockState ACACIA_LOG = Blocks.ACACIA_LOG.getDefaultState();
        protected static final BlockState ACACIA_LEAVES = Blocks.ACACIA_LEAVES.getDefaultState();

        protected static final BlockState OAK_LOG = Blocks.OAK_LOG.getDefaultState();
        protected static final BlockState OAK_LEAVES = Blocks.OAK_LEAVES.getDefaultState();

        protected static final BlockState JAPANESE_MAPLE_LOG = ModBlocks.JAPANESE_MAPLE_LOG.get().getDefaultState();
        protected static final BlockState JAPANESE_MAPLE_LEAVES = ModBlocks.JAPANESE_MAPLE_LEAVES.get().getDefaultState();

        protected static final BlockState MULBERRY_LOG = ModBlocks.MULBERRY_LOG.get().getDefaultState();
        protected static final BlockState MULBERRY_LEAVES = ModBlocks.MULBERRY_LEAVES.get().getDefaultState();

        protected static final BlockState STARFRUIT_LOG = ModBlocks.STARFRUIT_LOG.get().getDefaultState();
        protected static final BlockState STARFRUIT_LEAVES = ModBlocks.STARFRUIT_LEAVES.get().getDefaultState();

        protected static final BlockState CAMELLIA_LOG = ModBlocks.CAMELLIA_LOG.get().getDefaultState();
        protected static final BlockState CAMELLIA_LEAVES = ModBlocks.CAMELLIA_LEAVES.get().getDefaultState();
        protected static final BlockState TEA_LEAVES = ModBlocks.TEA_LEAVES.get().getDefaultState();

        protected static final BlockState CITRUS_LOG = ModBlocks.CITRUS_LOG.get().getDefaultState();
        protected static final BlockState ORANGE_LEAVES = ModBlocks.ORANGE_LEAVES.get().getDefaultState();
        protected static final BlockState LEMON_LEAVES = ModBlocks.LEMON_LEAVES.get().getDefaultState();
        protected static final BlockState MANDARIN_LEAVES = ModBlocks.MANDARIN_LEAVES.get().getDefaultState();
        protected static final BlockState TAHITI_LIME_LEAVES = ModBlocks.TAHITI_LIME_LEAVES.get().getDefaultState();
        protected static final BlockState CITRON_LEAVES = ModBlocks.CITRON_LEAVES.get().getDefaultState();
        protected static final BlockState BUDDAH_HAND_LEAVES = ModBlocks.BUDDHA_HAND_LEAVES.get().getDefaultState();
        protected static final BlockState GRAPEFRUIT_LEAVES = ModBlocks.GRAPEFRUIT_LEAVES.get().getDefaultState();

        protected static final BlockState LIVE_OAK_LOG = ModBlocks.LIVE_OAK_LOG.get().getDefaultState();
        protected static final BlockState LIVE_OAK_LEAVES = ModBlocks.LIVE_OAK_LEAVES.get().getDefaultState();

        protected static final BlockState ROYAL_POINCIANA_LOG = ModBlocks.ROYAL_POINCIANA_LOG.get().getDefaultState();
        protected static final BlockState ROYAL_POINCIANA_LEAVES = ModBlocks.ROYAL_POINCIANA_LEAVES.get().getDefaultState();

        protected static final BlockState TAMARIND_LOG = ModBlocks.TAMARIND_LOG.get().getDefaultState();
        protected static final BlockState TAMARIND_LEAVES = ModBlocks.TAMARIND_LEAVES.get().getDefaultState();

        protected static final BlockState EUCALYPTUS_LOG = ModBlocks.EUCALYPTUS_LOG.get().getDefaultState();
        protected static final BlockState EUCALYPTUS_LEAVES = ModBlocks.EUCALYPTUS_LEAVES.get().getDefaultState();

        protected static final BlockState CASUARINA_LOG = ModBlocks.CASUARINA_LOG.get().getDefaultState();
        protected static final BlockState CASUARINA_LEAVES = ModBlocks.CASUARINA_LEAVES.get().getDefaultState();

        protected static final BlockState POHUTUKAWA_LOG = ModBlocks.POHUTUKAWA_LOG.get().getDefaultState();
        protected static final BlockState POHUTUKAWA_LEAVES = ModBlocks.POHUTUKAWA_LEAVES.get().getDefaultState();

        protected static final BlockState PLUM_LOG = ModBlocks.PLUM_LOG.get().getDefaultState();
        protected static final BlockState CHERRY_PLUM_LEAVES = ModBlocks.CHERRY_PLUM_LEAVES.get().getDefaultState();

        protected static final BlockState BLACK_POPLAR_LOG = ModBlocks.BLACK_POPLAR_LOG.get().getDefaultState();
        protected static final BlockState BLACK_POPLAR_LEAVES = ModBlocks.BLACK_POPLAR_LEAVES.get().getDefaultState();

        protected static final BlockState NOTHOFAGUS_LOG = ModBlocks.NOTHOFAGUS_LOG.get().getDefaultState();
        protected static final BlockState SOUTHERN_BEECH_LEAVES = ModBlocks.SOUTHERN_BEECH_LEAVES.get().getDefaultState();

        protected static final BlockState ILEX_LOG = ModBlocks.ILEX_LOG.get().getDefaultState();
        protected static final BlockState HOLLY_LEAVES = ModBlocks.HOLLY_LEAVES.get().getDefaultState();

        protected static final BlockState PODZOL = Blocks.PODZOL.getDefaultState();

    }

    public static final ConfiguredFeature<?, ?> MEDITERRANEAN_OAK_TREES = register("mediterranean_oak_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(CORK_OAK_TREE.withChance(0.3F),
                            HOLM_OAK_FANCY_TREE.withChance(0.3F), CORK_OAK_FANCY_TREE.withChance(0.3F)), HOLM_OAK_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> MEDITERRANEAN_MOUNTAIN_GROVE_TREES = register("mediterranean_mountain_grove_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(ITALIAN_CYPRESS_TREE.withChance(0.4F),
                            BLACK_POPLAR_TREE.withChance(0.3F), SPRUCE.withChance(0.01F)),
                            STONE_PINE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> WESTERN_HEMLOCK_TREES = register("western_hemlock_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WESTERN_HEMLOCK_TREE_TALL.withChance(0.3F)),
                           WESTERN_HEMLOCK_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(12, 0.3F, 3))));


    public static final ConfiguredFeature<?, ?> OLEANDER_SHRUBS = register("oleander_shrubs",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WHITE_OLEANDER_SHRUB.withChance(0.3F),
                            DARK_PINK_OLEANDER_SHRUB.withChance(0.3F), RED_OLEANDER_SHRUB.withChance(0.3F)), PINK_OLEANDER_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(8, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> SCRUBLAND_OLEANDER_SHRUBS = register("scrubland_oleander_shrubs",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WHITE_OLEANDER_SHRUB.withChance(0.5F),
                            DARK_PINK_OLEANDER_SHRUB.withChance(0.5F), RED_OLEANDER_SHRUB.withChance(0.5F)), PINK_OLEANDER_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.3F, 3))));

    public static final ConfiguredFeature<?, ?> TREES_SCRUBLAND = register("trees_scrubland",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(FORKY_FIG_TREE.withChance(0.3F),
                            STRAWBERRY_TREE2.withChance(0.2F), STRAWBERRY_TREE1.withChance(0.1F), FIG_TREE.withChance(0.2F)), POMEGRANATE_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> HOLLY_TREES = register("holly_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(HOLLY_TREE2.withChance(0.3F)),
                            HOLLY_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> PRAIRIE_BLACK_POPLAR_TREES = register("prairie_black_poplar_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(BLACK_POPLAR_FANCY_TREE.withChance(0.2F)),
                            BLACK_POPLAR_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> TEMPERATE_RAINFOREST_SHRUBS = register("temperate_rainforest_shrubs",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(RED_OAK_SHRUB.withChance(0.3F)),
                            OAK_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> TREES_TEMPERATE_RAINFOREST = register("trees_temperate_rainforest",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(COOPER_BEECH_TREE.withChance(0.3F),
                            COOPER_BEECH_BIG_TREE.withChance(0.2F), RED_OAK_FANCY_TREE.withChance(0.3F), YEW_TREE.withChance(0.3F),
                            DARK_OAK.withChance(0.01F)), RED_OAK_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(3, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> LAURISSILVA_PINES = register("laurissilva_pines",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(COOK_PINE_TREE.withChance(0.01F)),
                            NORFOLK_ISLAND_PINE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 2))));

    public static final ConfiguredFeature<?, ?> MEDITERRANEAN_SAVANNA_FRUIT_TREES = register("mediterranean_savanna_fruit_trees", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(FORKY_FIG_TREE.withChance(0.3F), FIG_TREE.withChance(0.5F)),
                    POMEGRANATE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> OAK_SHRUBS = register("oak_shrubs", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(HOLM_OAK_SHRUB.withChance(0.3F), CORK_OAK_SHRUB.withChance(0.3F)),
                    OAK_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> MEDITERRANEAN_CONIFER_TREES = register("mediterranean_conifer_trees", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(STONE_PINE_TREE2.withChance(0.1F), ITALIAN_CYPRESS_TREE.withChance(0.5F)),
                    STONE_PINE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> CRAPE_MYRTLE_TREES = register("crape_myrtle_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WHITE_CRAPE_MYRTLE_TREE.withChance(0.1F),
                            PINK_CRAPE_MYRTLE_TREE.withChance(0.3F), RED_CRAPE_MYRTLE_TREE.withChance(0.3F)), PURPLE_CRAPE_MYRTLE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 2))));

    public static final ConfiguredFeature<?, ?> TROPICAL_BEACH_TREES = register("tropical_beach_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(TROPICAL_ALMOND_TREE.withChance(0.1F),
                            TROPICAL_ALMOND_BIG_TREE.withChance(0.2F), COAST_COTTONWOOD_FANCY_TREE.withChance(0.3F)), COAST_COTTONWOOD_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> INDIAN_CORAL_TREES = register("indian_coral_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(INDIAN_CORAL_TREE.withChance(0.5F)),
                    INDIAN_CORAL_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> MONKEY_PUZZLE_TREES = register("monkey_puzzle_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(YOUNG_MONKEY_PUZZLE_TREE.withChance(0.1F)),
                    MONKEY_PUZZLE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> JUNGLE_FIG_TREES = register("jungle_fig_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WEEPING_FIG_TREE.withChance(0.1F),
                            BIG_WEEPING_FIG_TREE.withChance(0.3F), INDIAN_LAUREL_TREE.withChance(0.3F)), BIG_INDIAN_LAUREL_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(12, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> CASUARINA_TREES = register("casuarina_trees",
            PINE_LIKE_CASUARINA_TREE.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
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

    public static final ConfiguredFeature<?, ?> TROPICAL_FOREST_DECIDUOUS_TREES = register("tropical_forest_deciduous_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(RED_KAPOK_TREE.withChance(0.08F),
                            ROYAL_POINCIANA_TREE.withChance(0.1F), ROYAL_POINCIANA_BIG_TREE.withChance(0.08F)), FOREST_ACACIA_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(12, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> SUBTROPICAL_LAUREL_FOREST_TREES = register("subtropical_forest_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(LOQUAT_TREE.withChance(0.2F),
                            SOUTHERN_MAGNOLIA_TREE.withChance(0.1F), STARFRUIT_TREE.withChance(0.2F), MULBERRY_TREE.withChance(0.4F),
                            ELDERBERRY_TREE.withChance(0.2F), SOUTHERN_LIVE_OAK_TREE.withChance(0.1F)), AVOCADO_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> SUBTROPICAL_EUCALYPTUS_FOREST_TREES = register("subtropical_eucalyptus_forest_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(FOREST_ACACIA_TREE.withChance(0.4F),
                            MULBERRY_TREE.withChance(0.4F), ELDERBERRY_TREE.withChance(0.3F)), AVOCADO_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                            .configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> DECIDUOUS_SUBTROPICAL_FOREST_TREES = register("deciduous_subtropical_forest_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(LOQUAT_TREE.withChance(0.2F),
                            ELDERBERRY_TREE.withChance(0.1F), SOUTHERN_MAGNOLIA_TREE.withChance(0.1F), MULBERRY_TREE.withChance(0.4F),
                            AVOCADO_TREE.withChance(0.3F)), SOUTHERN_LIVE_OAK_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(3, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> JUNGLE_OCOTEA_TREES = register("jungle_ocotea_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(OCOTEA_JUNGLE_TREE.withChance(0.3F)),
                            OCOTEA_JUNGLE_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> FOREST_OCOTEA_TREES = register("forest_ocotea_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(OCOTEA_FOREST_TREE.withChance(0.3F)),
                            OCOTEA_FOREST_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> MEDITERRANEAN_SAVANNA_SMALL_TREES = register("mediterranean_savanna_small_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(OLIVE_TREE.withChance(0.1F),
                            ELDERBERRY_TREE.withChance(0.3F), CORK_OAK_TREE.withChance(0.3F)), HOLM_OAK_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.0F, 0))));

    public static final ConfiguredFeature<?, ?> TROPICAL_PINE_ISLAND_TREES = register("tropical_pine_island_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(INDIAN_CORAL_TREE.withChance(0.3F),
                            ROYAL_POINCIANA_TREE.withChance(0.1F), ROYAL_POINCIANA_BIG_TREE.withChance(0.1F), RED_KAPOK_TREE.withChance(0.1F),
                            INDIAN_CORAL_FANCY_TREE.withChance(0.2F)), FOREST_ACACIA_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.0F, 0))));

    private static final ConfiguredFeature<?,?> ACACIA_TREE = Features.ACACIA;
    public static final ConfiguredFeature<?, ?> TROPICAL_DESERT_TREES = register("tropical_desert_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(POMEGRANATE_TREE.withChance(0.1F),
                            MESQUITE_TREE.withChance(0.1F)), ACACIA_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> TROPICAL_JUNGLE_FRUIT_TREES = register("tropical_jungle_fruit_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(STARFRUIT_FANCY_TREE.withChance(0.2F),
                            STARFRUIT_TREE.withChance(0.3F), TAMARIND_TREE.withChance(0.3F)), AVOCADO_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 0))));

    public static final ConfiguredFeature<?, ?> JAPANESE_MAPLE = register("japanese_maple",
            JAPANESE_MAPLE_TREE.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
            .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(4, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> BUNYA_PINES = register("tropical_fruit_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(YOUNG_BUNYA_PINE_TREE.withChance(0.2F)),
                            BUNYA_PINE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> POHUTUKAWA_TREES = register("pohutukawa_trees",
            POHUTUKAWA_TREE.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
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
                    .configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

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
                    BUDDHA_HAND_TREE.withChance(0.1F)), LEMON_TREE))
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> TEMPERATE_FRUIT_TREES = register("temperate_fruit_trees", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(PINK_CRABAPPLE_TREE.withChance(0.5F), CHERRY_PLUM_TREE.withChance(0.3F),
                    MULBERRY_TREE.withChance(0.3F), ELDERBERRY_TREE.withChance(0.3F)), WHITE_CRABAPPLE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> CRABAPPLE_TREES = register("crabapple_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(PINK_CRABAPPLE_TREE.withChance(0.5F)),
                    WHITE_CRABAPPLE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> JAPANESE_GROVE_TREES = register("japanese_grove_trees", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(SUPER_BIRCH_BEES_0002.withChance(0.3F), OAK.withChance(0.4F)),
                    SPRUCE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(3, 0.1F, 1))));

    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String p_243968_0_, ConfiguredFeature<FC, ?> p_243968_1_) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, p_243968_0_, p_243968_1_);
    }
}

