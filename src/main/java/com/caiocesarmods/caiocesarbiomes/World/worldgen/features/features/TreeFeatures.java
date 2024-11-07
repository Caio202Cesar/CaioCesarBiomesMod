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
import net.minecraft.world.gen.trunkplacer.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.OptionalInt;

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
                    new DarkOakFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0)),
                    new DarkOakTrunkPlacer(4, 2, 8),
                    new TwoLayerFeature(2, 0, 1))).build()));

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
                    new DarkOakTrunkPlacer(6, 2, 1), new ThreeLayerFeature(1, 1, 0, 1, 2,
                    OptionalInt.empty()))).setMaxWaterDepth(Integer.MAX_VALUE).setHeightmap(Heightmap.Type.MOTION_BLOCKING).setIgnoreVines().build()));

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
                    new DarkOakFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0)),
                    new ForkyTrunkPlacer(8, 6, 0), new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> STONE_PINE_TREE2 = register("stone_pine_tree2",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.STONE_PINE_LOG),
                    new SimpleBlockStateProvider(States.STONE_PINE_LEAVES),
                    new DarkOakFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0)),
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
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> STRAWBERRY_TREE = register("strawberry_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.STRAWBERRY_TREE_LOG),
                    new SimpleBlockStateProvider(States.STRAWBERRY_TREE_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new StraightTrunkPlacer(4, 4, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> FORKY_STRAWBERRY_TREE = register("forky_strawberry_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.STRAWBERRY_TREE_LOG),
                    new SimpleBlockStateProvider(States.STRAWBERRY_TREE_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                    new ForkyTrunkPlacer(7, 6, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    //Italian Cypress Tree
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> ITALIAN_CYPRESS_TREE = register("italian_cypress_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.ITALIAN_CYPRESS_LOG),
                    new SimpleBlockStateProvider(States.ITALIAN_CYPRESS_LEAVES),
                    new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(1), 2),
                    new StraightTrunkPlacer(15, 2, 0),
                    new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));


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
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> STARFRUIT_TREE = register("starfruit_tree",
            Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(TreeFeatures.States.STARFRUIT_LOG),
                    new SimpleBlockStateProvider(States.STARFRUIT_LEAVES),
                    new FancyFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(4), 4),
                    new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0,
                    OptionalInt.of(4)))).setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    public static final class States {

        protected static final BlockState AVOCADO_LOG = ModBlocks.AVOCADO_LOG.get().getDefaultState();
        protected static final BlockState AVOCADO_LEAVES = ModBlocks.AVOCADO_LEAVES.get().getDefaultState();

        protected static final BlockState HOLM_OAK_LOG = ModBlocks.HOLM_OAK_LOG.get().getDefaultState();
        protected static final BlockState HOLM_OAK_LEAVES = ModBlocks.HOLM_OAK_LEAVES.get().getDefaultState();

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
    }

    public static final ConfiguredFeature<?, ?> MEDITERRANEAN_OAK_TREES = register("mediterranean_oak_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(CORK_OAK_TREE.withChance(0.3F),
                            HOLM_OAK_FANCY_TREE.withChance(0.3F), CORK_OAK_FANCY_TREE.withChance(0.3F)), HOLM_OAK_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> OLEANDER_SHRUBS = register("oleander_shrubs",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WHITE_OLEANDER_SHRUB.withChance(0.3F),
                            DARK_PINK_OLEANDER_SHRUB.withChance(0.3F), RED_OLEANDER_SHRUB.withChance(0.3F)), PINK_OLEANDER_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> TREES_SCRUBLAND = register("trees_scrubland", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(FORKY_FIG_TREE.withChance(0.3F), FORKY_STRAWBERRY_TREE.withChance(0.2F)),
                    POMEGRANATE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> OAK_SHRUBS = register("oak_shrubs", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(HOLM_OAK_SHRUB.withChance(0.3F), CORK_OAK_SHRUB.withChance(0.3F)),
                    OAK_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> MEDITERRANEAN_CONIFER_TREES = register("mediterranean_conifer_trees", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(STONE_PINE_TREE2.withChance(0.1F), ITALIAN_CYPRESS_TREE.withChance(0.2F)),
                    STONE_PINE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> CRAPE_MYRTLE_TREES = register("crap_myrtles", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(RED_CRAPE_MYRTLE_TREE.withChance(0.3F), WHITE_CRAPE_MYRTLE_TREE.withChance(0.3F)),
                    PURPLE_CRAPE_MYRTLE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> TROPICAL_BEACH_TREES = register("tropical_beach_trees", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(TROPICAL_ALMOND_BIG_TREE.withChance(0.3F), COAST_COTTONWOOD_FANCY_TREE.withChance(0.3F)),
                    COAST_COTTONWOOD_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> INDIAN_CORAL_TREES = register("indian_coral_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(INDIAN_CORAL_TREE.withChance(0.5F)),
                    INDIAN_CORAL_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> TROPICAL_FOREST_DECIDUOUS_TREES = register("tropical_forest_deciduous_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(RED_KAPOK_TREE.withChance(0.5F)),
                    FOREST_ACACIA_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> SUBTROPICAL_FOREST_TREES = register("subtropical_forest_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(LOQUAT_TREE.withChance(0.2F),
                            SOUTHERN_MAGNOLIA_TREE.withChance(0.1F)), AVOCADO_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> JUNGLE_OCOTEA_TREES = register("jungle_ocotea_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(OCOTEA_JUNGLE_TREE.withChance(0.3F)),
                            OCOTEA_JUNGLE_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> FOREST_OCOTEA_TREES = register("forest_ocotea_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(OCOTEA_FOREST_TREE.withChance(0.3F)),
                            OCOTEA_FOREST_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> DECIDUOUS_SUBTROPICAL_FOREST_TREES = register("deciduous_subtropical_forest_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(STARFRUIT_TREE.withChance(0.2F),
                    ELDERBERRY_TREE.withChance(0.2F)), MULBERRY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> TROPICAL_DESERT_TREES = register("tropical_desert_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(POMEGRANATE_TREE.withChance(0.3F)),
                            MESQUITE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));


    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String p_243968_0_, ConfiguredFeature<FC, ?> p_243968_1_) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, p_243968_0_, p_243968_1_);
    }
}

