package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features;

import com.google.common.collect.ImmutableList;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.MultipleRandomFeatureConfig;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;

import static com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.TreeFeatures.*;
import static net.minecraft.world.gen.feature.Features.*;
import static net.minecraft.world.gen.feature.Features.ACACIA;
import static net.minecraft.world.gen.feature.Features.FANCY_OAK;
import static net.minecraft.world.gen.feature.Features.FANCY_OAK_BEES_0002;
import static net.minecraft.world.gen.feature.Features.OAK;
import static net.minecraft.world.gen.feature.Features.OAK_BEES_0002;
import static net.minecraft.world.gen.feature.Features.SPRUCE;
import static net.minecraft.world.gen.feature.Features.SUPER_BIRCH_BEES_0002;

public class DefaultBiomeTreeFeatures {

    public static final ConfiguredFeature<?, ?> SUBTROPICAL_FOREST_OAKS = register("subtropical_forest_oak_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(OAK_BEES_002.withChance(0.065641026F),
                            FANCY_OAK.withChance(0.30769232F), SOUTHERN_LIVE_OAK_TREE.withChance(0.23333334F),
                            FANCY_OAK_BEES_002.withChance(0.03333334F), FANCY_OAK_TREE_WITH_IVY.withChance(0.32F),
                            OAK_TREE_WITH_IVY.withChance(0.3F), SOUTHERN_LIVE_OAK_WITH_CREEPING_FIG.withChance(0.08F)),
                            OAK)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> MEDITERRANEAN_OAK_TREES = register("mediterranean_oak_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(CORK_OAK_TREE.withChance(0.3F),
                            HOLM_OAK_FANCY_TREE.withChance(0.3F), CORK_OAK_FANCY_TREE.withChance(0.3F), OAK.withChance(0.2F),
                            FANCY_OAK.withChance(0.3F)), HOLM_OAK_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> MEDITERRANEAN_SPARSE_OAK_TREES = register("mediterranean_sparse_oak_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(CORK_OAK_TREE.withChance(0.3F),
                            HOLM_OAK_FANCY_TREE.withChance(0.095F), CORK_OAK_FANCY_TREE.withChance(0.095F), FANCY_OAK.withChance(0.078F),
                            OAK.withChance(0.3F)), HOLM_OAK_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(6, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> MEDITERRANEAN_PINE_FOREST_TREES = register("mediterranean_pine_forest_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                            CANARY_PINE_TREE_TALL.withChance(0.5F), STONE_PINE_TREE.withChance(0.39F),
                            STONE_PINE_TREE2.withChance(0.34F), ITALIAN_CYPRESS_TREE.withChance(0.4F),
                            ALEPPO_PINE.withChance(0.5F), PLANE_TREE.withChance(0.22F),
                            PLANE_FANCY_TREE.withChance(0.19F)), CANARY_PINE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
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
                            SPRING_HAWTHORN_TREE.withChance(0.2F), WALNUT_TREE.withChance(0.15F), WALNUT_FANCY_TREE.withChance(0.3F),
                            COOPER_BEECH_BIG_TREE.withChance(0.5F), HAZELNUT_TREE.withChance(0.2F), RED_OAK_TREE.withChance(0.089F),
                            RED_MAPLE_TREE.withChance(0.059F), RED_MAPLE_FANCY_TREE.withChance(0.05F), ROWAN_TREE1.withChance(0.3F),
                            ROWAN_TREE2.withChance(0.26F),
                            BLOB_RED_MAPLE_TREE.withChance(0.09F), CHERRY_PLUM_FANCY_TREE.withChance(0.4F), CHERRY_PLUM_TREE.withChance(0.34F)),
                            DARK_OAK_WITH_IVY)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> MOUNTAIN_EXTRA_VEGETATION = register("mountain_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(BLUE_SPRUCE.withChance(0.078F),
                            SPRING_HAWTHORN_TREE.withChance(0.012F), ROWAN_TREE1.withChance(0.012F), ROWAN_TREE2.withChance(0.001F),
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
                            TROPICAL_ALMOND_FANCY_TREE.withChance(0.2F), TROPICAL_ALMOND_BIG_TREE.withChance(0.2F), RED_KAPOK_TREE.withChance(0.3F),
                            ORCHID_TREE.withChance(0.2F), RUBBER_TREE.withChance(0.2F), RUBBER_TREE_WITH_CREEPING_FIG.withChance(0.15F), PEPPERCORN_RUBBER_TREE.withChance(0.2F),
                            PEPPERCORN_JUNGLE_TREE.withChance(0.28F), DURIAN_TREE_GLORIOSA.withChance(0.095F), RAINBOW_EUCALYPTUS_TREE.withChance(0.198F),
                            RED_KAPOK_TREE_WITH_GLORIOSA.withChance(0.09F), RUBBER_TREE_WITH_GLORIOSA.withChance(0.086F),
                            INDIAN_LAUREL_WITH_GLORIOSA.withChance(0.078F), WEEPING_FIG_WITH_GLORIOSA.withChance(0.075F)),
                            INDIAN_LAUREL_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
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
                            TROPICAL_ALMOND_BIG_TREE.withChance(0.2F), ORCHID_TREE.withChance(0.2F), TROPICAL_ALMOND_FANCY_TREE.withChance(0.2F),
                            RUBBER_TREE.withChance(0.2F), RUBBER_TREE_WITH_CREEPING_FIG.withChance(0.15F), PEPPERCORN_RUBBER_TREE.withChance(0.2F),
                            YOUNG_BUNYA_PINE_TREE.withChance(0.35F), DURIAN_TREE_GLORIOSA.withChance(0.095F), RAINBOW_EUCALYPTUS_TREE.withChance(0.198F),
                            RED_KAPOK_TREE_WITH_GLORIOSA.withChance(0.09F), RUBBER_TREE_WITH_GLORIOSA.withChance(0.086F),
                            INDIAN_LAUREL_WITH_GLORIOSA.withChance(0.078F), WEEPING_FIG_WITH_GLORIOSA.withChance(0.075F)), INDIAN_LAUREL_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(7, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> JUNGLE_EDGE_EXTRA_VEGETATION = register("jungle_edge_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WEEPING_FIG_TREE.withChance(0.2F),
                            BIG_WEEPING_FIG_TREE.withChance(0.35F), MANGO_FANCY_TREE.withChance(0.15F), CREEPING_FIG_AVOCADO_TREE.withChance(0.12F),
                            MANGO_TREE.withChance(0.15F), OIL_PALM_TREE.withChance(0.6F), LEMON_TREE.withChance(0.2F), BUDDHA_HAND_TREE.withChance(0.12F), CITRON_TREE.withChance(0.2F),
                            TAHITI_LIME_TREE.withChance(0.2F), DURIAN_TREE.withChance(0.2F), DURIAN_TREE_PEPPER_VINE.withChance(0.2F),
                            BREADFRUIT_TREE.withChance(0.25F), PEPPERCORN_INDIAN_LAUREL_TREE.withChance(0.16F), PEPPERCORN_BIG_INDIAN_LAUREL_TREE.withChance(0.13F),
                            BIG_INDIAN_LAUREL_TREE.withChance(0.35F), BANANA_TREE.withChance(0.4F), PEPPERCORN_WEEPING_FIG_TREE.withChance(0.12F), PEPPERCORN_BIG_WEEPING_FIG_TREE.withChance(0.16F),
                            AVOCADO_TREE.withChance(0.4F), WEEPING_FIG_WITH_CREEPING_FIG.withChance(0.24F), INDIAN_LAUREL_WITH_CREEPING_FIG.withChance(0.28F),
                            STARFRUIT_TREE.withChance(0.4F), PEPPERCORN_AVOCADO_TREE.withChance(0.2F), TROPICAL_ALMOND_FANCY_TREE.withChance(0.2F),
                            RED_KAPOK_TREE.withChance(0.2F), TROPICAL_ALMOND_TREE.withChance(0.2F), RAINBOW_EUCALYPTUS_TREE.withChance(0.198F),
                            RED_KAPOK_TREE_WITH_GLORIOSA.withChance(0.09F), RUBBER_TREE_WITH_GLORIOSA.withChance(0.086F),
                            INDIAN_LAUREL_WITH_GLORIOSA.withChance(0.078F), WEEPING_FIG_WITH_GLORIOSA.withChance(0.075F),
                            TROPICAL_ALMOND_BIG_TREE.withChance(0.2F), ORCHID_TREE.withChance(0.2F),
                            RUBBER_TREE.withChance(0.2F), RUBBER_TREE_WITH_CREEPING_FIG.withChance(0.15F), PEPPERCORN_RUBBER_TREE.withChance(0.2F),
                            PEPPERCORN_JUNGLE_TREE.withChance(0.28F), DURIAN_TREE_GLORIOSA.withChance(0.095F)), INDIAN_LAUREL_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
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
                            JUNIPER_SHRUB.withChance(0.17F), ELDERBERRY_TREE.withChance(0.1F), SPRING_HAWTHORN_TREE.withChance(0.2F)), HAZELNUT_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 0))));

    public static final ConfiguredFeature<?, ?> MIXED_CONTINENTAL_FOREST_TREES = register("mixed_continental_forest_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(ELDERBERRY_TREE.withChance(0.3F),
                            WHITE_CRABAPPLE_TREE.withChance(0.3F), ASPEN_TREE.withChance(0.1F), LOMBARDY_POPLAR_TREE.withChance(0.05F),
                            PINK_CRABAPPLE_TREE.withChance(0.3F), RED_CRABAPPLE_TREE.withChance(0.077F),
                            WALNUT_TREE.withChance(0.25F), WALNUT_FANCY_TREE.withChance(0.3F), RED_OAK_TREE.withChance(0.2F),
                            RED_OAK_FANCY_TREE.withChance(0.14F), SPRING_HAWTHORN_TREE.withChance(0.12F), ROWAN_TREE2.withChance(0.12F), ROWAN_TREE1.withChance(0.15F),
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
                            SWEET_CHESTNUT_TREE.withChance(0.2F), SPRING_HAWTHORN_TREE.withChance(0.2F), HAZELNUT_TREE.withChance(0.2F),
                            PLANE_TREE.withChance(0.6F), CHERRY_PLUM_FANCY_TREE.withChance(0.4F), CHERRY_PLUM_TREE.withChance(0.34F)),
                            OAK_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(6, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> WESTERN_HEMLOCK_TREES = register("western_hemlock_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WESTERN_HEMLOCK_TREE_TALL.withChance(0.3F),
                            WESTERN_HEMLOCK_WITH_IVY.withChance(0.1F)), WESTERN_HEMLOCK_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(45, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> SAVANNA_EXTRA_VEGETATION = register("savanna_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(SYCAMORE_FIG_FANCY_TREE.withChance(0.11F),
                            SAUSAGE_TREE.withChance(0.13F), INDIAN_CORAL_FANCY_TREE.withChance(0.19F),
                            INDIAN_CORAL_TREE.withChance(0.089F), INDIAN_CORAL_TREE_WITH_GLORIOSA.withChance(0.087F),
                            TAMARIND_TREE.withChance(0.19F), SYCAMORE_FIG_ANCIENT_TREE.withChance(0.15F),
                            MARULA_TREE.withChance(0.24F), TALL_BISMARCK_PALM.withChance(0.32F), ACACIA_TREE_WITH_GLORIOSA.withChance(0.08F),
                            BISMARCK_PALM.withChance(0.3F), BISMARCK_PALM_WITH_GLORIOSA.withChance(0.46F),
                            JACKALBERRY_TREE.withChance(0.3F), PLUMERIA_ORANGE_TREE.withChance(0.071F), TAMARIND_TREE_WITH_GLORIOSA.withChance(0.05F),
                            ROYAL_POINCIANA_TREE.withChance(0.19F), ROYAL_POINCIANA_BIG_TREE.withChance(0.12F),
                            PLUMERIA_PINK_TREE.withChance(0.071F), PLUMERIA_YELLOW_TREE.withChance(0.061F), PLUMERIA_WHITE_TREE.withChance(0.08F),
                            PLUMERIA_RED_TREE.withChance(0.061F), BAOBAB_TREE.withChance(0.2F), JACKALBERRY_TREE_WITH_GLORIOSA.withChance(0.079F),
                            BAOBAB_TREE_WITH_GLORIOSA.withChance(0.00023F), JACKALBERRY_FANCY_TREE.withChance(0.15F),
                            YELLOW_OLEANDER_TREE.withChance(0.12F), ORANGE_OLEANDER_TREE.withChance(0.12F)),
                            SYCAMORE_FIG_ANCIENT_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.3F, 5))));

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
                            FORKY_FIG_TREE.withChance(0.3F), STRAWBERRY_TREE2.withChance(0.091F), WHITE_FIG_TREE.withChance(0.000025F),
                            STRAWBERRY_TREE1.withChance(0.089F)), POMEGRANATE_TREE))
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
                            SPRING_HAWTHORN_TREE.withChance(0.3F), YEW_TREE.withChance(0.3F), JAPANESE_MAPLE_TREE.withChance(0.053F),
                            ROWAN_TREE1.withChance(0.2F), ROWAN_TREE2.withChance(0.15F)), RED_OAK_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(3, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> SOCOTRA_TREES = register("socotra_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(SOCOTRA_DESERT_ROSE_TREE.withChance(0.07F),
                            SOCOTRA_CUCUMBER_TREE.withChance(0.07F), DATE_PALM_TREE.withChance(0.06F)),
                            DRAGON_BLOOD_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.3F, 0))));

    public static final ConfiguredFeature<?, ?> HIGHLAND_OCOTEA_TREES = register("highland_ocotea",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(HIGHLAND_OCOTEA_TREE_WITH_CREEPING_VINE.withChance(0.07F),
                            ELDERBERRY_TREE.withChance(0.1F),
                            HIGHLAND_OCOTEA_TREE_WITH_KIWI.withChance(0.082F), HIGHLAND_OCOTEA_TREE_WITH_IVY.withChance(0.2F)),
                            HIGHLAND_OCOTEA_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.3F, 3))));

    public static final ConfiguredFeature<?, ?> OAK_SHRUBS = register("oak_shrubs", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(HOLM_OAK_SHRUB.withChance(0.3F), CORK_OAK_SHRUB.withChance(0.3F)),
                    OAK_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> SUBTROPICAL_EXTREME_HILLS_VEGETATION = register("subtropical_extreme_hills_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(CHINESE_RED_PINE_TREE.withChance(0.8F),
                    KIWI_CHINESE_RED_PINE_TREE.withChance(0.002F)),
                    OAK_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(8, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> TROPICAL_PINES = register("tropical_pines", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(NORFOLK_ISLAND_PINE_TREE.withChance(0.8F),
                    NORFOLK_ISLAND_PINE_WITH_PEPPER_VINE.withChance(0.3F), COOK_PINE_WITH_PEPPER_VINE.withChance(0.2F)),
                    COOK_PINE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
            .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(4, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> COCONUT_TREES = register("coconut_trees", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(SMALL_COCONUT_PALM_TREE.withChance(0.43F),
                    SMALL_COCONUT_PALM_WITH_PEPPERCORN.withChance(0.15F)), COCONUT_PALM_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
            .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.3F, 1))));

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
                            TROPICAL_ALMOND_BIG_TREE.withChance(0.2F), TROPICAL_ALMOND_FANCY_TREE.withChance(0.2F), COAST_COTTONWOOD_FANCY_TREE.withChance(0.3F),
                            COAST_COTTONWOOD_TREE.withChance(0.2F), COCONUT_PALM_TREE.withChance(0.1F),
                            TROPICAL_ALMOND_WITH_PEPPERCORN.withChance(0.0049F), SMALL_COCONUT_PALM_WITH_GLORIOSA.withChance(0.3F),
                            SMALL_COCONUT_PALM_WITH_PEPPERCORN.withChance(0.0069F), ORCHID_TREE.withChance(0.01F)), SMALL_COCONUT_PALM_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> INDIAN_CORAL_TREES = register("indian_coral_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(INDIAN_CORAL_TREE.withChance(0.5F),
                    INDIAN_CORAL_TREE_WITH_GLORIOSA.withChance(0.25F)),
                    INDIAN_CORAL_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> MONKEY_PUZZLE_FOREST_TREES = register("monkey_puzzle_forest_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(YOUNG_MONKEY_PUZZLE_TREE.withChance(0.1F),
                    CHUSQUEA_BAMBOO.withChance(0.098F), PATAGONIAN_CYPRESS1.withChance(0.15F)),
                    MONKEY_PUZZLE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(12, 0.1F, 3))));

    public static final ConfiguredFeature<?, ?> JUNGLE_FIG_TREES = register("jungle_fig_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WEEPING_FIG_TREE.withChance(0.1F),
                            BIG_WEEPING_FIG_TREE.withChance(0.3F), WEEPING_FIG_WITH_CREEPING_FIG.withChance(0.07F),
                            INDIAN_LAUREL_TREE.withChance(0.3F), INDIAN_LAUREL_WITH_CREEPING_FIG.withChance(0.08F),
                            PEPPERCORN_INDIAN_LAUREL_TREE.withChance(0.09F), PEPPERCORN_BIG_INDIAN_LAUREL_TREE.withChance(0.13F),
                            PEPPERCORN_WEEPING_FIG_TREE.withChance(0.08F), PEPPERCORN_BIG_WEEPING_FIG_TREE.withChance(0.08F),
                            RUBBER_TREE.withChance(0.08F), RUBBER_TREE_WITH_CREEPING_FIG.withChance(0.09F),
                            PEPPERCORN_RUBBER_TREE.withChance(0.08F), WEEPING_FIG_WITH_GLORIOSA.withChance(0.08F),
                            INDIAN_LAUREL_WITH_GLORIOSA.withChance(0.079F), RUBBER_TREE_WITH_GLORIOSA.withChance(0.076F)),
                            BIG_INDIAN_LAUREL_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(12, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> TROPICAL_PINE_ISLAND_JUNGLE_FIGS = register("tropical_pine_jungle_figs",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WEEPING_FIG_TREE.withChance(0.1F),
                            BIG_WEEPING_FIG_TREE.withChance(0.3F), WEEPING_FIG_WITH_CREEPING_FIG.withChance(0.07F),
                            INDIAN_LAUREL_TREE.withChance(0.3F), INDIAN_LAUREL_WITH_CREEPING_FIG.withChance(0.08F),
                            RUBBER_TREE.withChance(0.2F), RUBBER_TREE_WITH_CREEPING_FIG.withChance(0.15F),
                            PEPPERCORN_RUBBER_TREE.withChance(0.2F), WEEPING_FIG_WITH_GLORIOSA.withChance(0.08F),
                            INDIAN_LAUREL_WITH_GLORIOSA.withChance(0.079F), RUBBER_TREE_WITH_GLORIOSA.withChance(0.076F)),
                            BIG_INDIAN_LAUREL_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> CASUARINA_TREES = register("casuarina_trees", Feature.RANDOM_SELECTOR.withConfiguration(
                    new MultipleRandomFeatureConfig((ImmutableList.of(PEPPERCORN_CASUARINA_TREE.withChance(0.4F),
                            GLORIOSA_CASUARINA_TREE.withChance(0.35F))), PINE_LIKE_CASUARINA_TREE))
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
            .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> EUCALYPTUS_TREES = register("eucalyptus_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(EUCALYPTUS_TALL_TREE.withChance(0.5F)),
                    EUCALYPTUS_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(13, 0.1F, 1))));

    /*public static final ConfiguredFeature<?, ?> TROPICAL_EUCALYPTUS_FOREST_TREES = register("tropical_eucalyptus_forest_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(GLORIOSA_CASUARINA_TREE.withChance(0.5F)),
                    EUCALYPTUS_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                   .configure(new AtSurfaceWithExtraConfig(13, 0.1F, 1))));*/

    public static final ConfiguredFeature<?, ?> PLAINS_EUCALYPTUS_TREES = register("plains_eucalyptus_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(EUCALYPTUS_TALL_TREE.withChance(0.5F)),
                    EUCALYPTUS_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(0, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> TEAK_TREES = register("teak_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(TEAK_TALL_TREE.withChance(0.5F),
                    MEGA_TEAK_TREE.withChance(0.2F), TEAK_TREE_WITH_GLORIOSA.withChance(0.067F), MEGA_TEAK_TREE_WITH_GLORIOSA.withChance(0.05F)),
                    TEAK_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(10, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> TROPICAL_FOREST_DECIDUOUS_TREES = register("tropical_forest_deciduous_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(RED_KAPOK_TREE.withChance(0.3F),
                            ROYAL_POINCIANA_TREE.withChance(0.1F),  MANGO_TREE.withChance(0.25F), ACEROLA_TREE.withChance(0.09F),
                            MANGO_FANCY_TREE.withChance(0.3F), BISMARCK_PALM.withChance(0.08F), BISMARCK_PALM.withChance(0.07F),
                            STARFRUIT_TREE.withChance(0.08F), ORCHID_TREE.withChance(0.09F),
                            PINK_IVORY_TREE_WITH_GLORIOSA.withChance(0.09F), PINK_IVORY_TREE.withChance(0.2F), PINK_IVORY_FANCY_TREE.withChance(0.2F),
                            ROYAL_POINCIANA_BIG_TREE.withChance(0.3F), TROPICAL_ALMOND_FANCY_TREE.withChance(0.2F),
                            SYCAMORE_FIG_FANCY_TREE.withChance(0.2F), TROPICAL_ALMOND_TREE.withChance(0.12F),
                            TROPICAL_ALMOND_BIG_TREE.withChance(0.2F), ORANGE_OLEANDER_TREE.withChance(0.09F),
                            YELLOW_OLEANDER_TREE.withChance(0.09F), FOREST_ACACIA_TREE.withChance(0.34F),
                            TAMARIND_TREE_WITH_GLORIOSA.withChance(0.06F), FOREST_ACACIA_TREE_WITH_GLORIOSA.withChance(0.05F),
                            RED_KAPOK_TREE_WITH_GLORIOSA.withChance(0.06F),
                            BISMARCK_PALM_WITH_GLORIOSA.withChance(0.087F), INDIAN_CORAL_TREE_WITH_GLORIOSA.withChance(0.079F)), TAMARIND_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(12, 0.25F, 6))));

    public static final ConfiguredFeature<?, ?> SUBTROPICAL_LAUREL_FOREST_TREES = register("subtropical_laurel_forest_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(LOQUAT_TREE.withChance(0.3F),
                            SOUTHERN_MAGNOLIA_TREE.withChance(0.3F), BANANA_TREE.withChance(0.25F),
                            STARFRUIT_TREE.withChance(0.4F), OAK_TREE_WITH_GOLD_KIWI.withChance(0.09F),
                            MULBERRY_TREE.withChance(0.4F), ORCHID_TREE.withChance(0.3F),
                            FANCY_OAK_TREE_WITH_IVY.withChance(0.3F), STARFRUIT_TREE_WITH_GOLD_KIWI.withChance(0.2F),
                            ELDERBERRY_TREE.withChance(0.3F), PERSIMMON_TREE.withChance(0.4F),
                            PERSIMMON_FANCY_TREE.withChance(0.35F), INDIAN_LAUREL_TREE.withChance(0.1F),
                            INDIAN_LAUREL_WITH_CREEPING_FIG.withChance(0.13F), BIG_INDIAN_LAUREL_TREE.withChance(0.073F),
                            AVOCADO_TREE.withChance(0.5F), PEACH_TREE.withChance(0.19F)),
                            CREEPING_FIG_AVOCADO_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(6, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> SUBTROPICAL_OAK_FOREST_TREES = register("subtropical_oak_forest_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(LOQUAT_TREE.withChance(0.4F),
                            ELDERBERRY_TREE.withChance(0.3F), MULBERRY_TREE.withChance(0.4F), AVOCADO_TREE.withChance(0.3F),
                            PECAN_FANCY_TREE.withChance(0.4F), PECAN_TREE.withChance(0.3F), OAK_TREE_WITH_KIWI.withChance(0.078F),
                            PERSIMMON_TREE.withChance(0.3F), STARFRUIT_TREE.withChance(0.26F), RED_MAPLE_TREE_WITH_KIWI.withChance(0.3F),
                            PERSIMMON_FANCY_TREE.withChance(0.4F), STARFRUIT_TREE_WITH_KIWI.withChance(0.079F),
                            PEACH_TREE.withChance(0.3F), CREEPING_FIG_AVOCADO_TREE.withChance(0.06F),
                            PINK_IVORY_TREE.withChance(0.26F), PINK_IVORY_FANCY_TREE.withChance(0.3F),
                            SUBTROPICAL_SPRING_ORCHID_TREE.withChance(0.2F)), SOUTHERN_MAGNOLIA_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(12, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> JUNGLE_OCOTEA_TREES = register("jungle_ocotea_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(OCOTEA_JUNGLE_TREE_CREEPING_FIG.withChance(0.3F),
                            OCOTEA_JUNGLE_TREE_CREEPING_FIG.withChance(0.3F), OCOTEA_JUNGLE_TREE.withChance(0.5F), OCOTEA_JUNGLE_FANCY_TREE_CREEPING_FIG.withChance(0.3F)),
                            OCOTEA_JUNGLE_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> FOREST_OCOTEA_TREES = register("forest_ocotea_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(OCOTEA_FOREST_TREE.withChance(0.3F),
                            OCOTEA_FOREST_FANCY_TREE_WITH_IVY.withChance(0.5F), OCOTEA_TREE_WITH_IVY.withChance(0.5F),
                            OCOTEA_FOREST_FANCY_TREE_WITH_CREEPING_FIG.withChance(0.24F),
                            OCOTEA_TREE_WITH_KIWI.withChance(0.3F)), OCOTEA_FOREST_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> MEDITERRANEAN_SAVANNA_SMALL_TREES = register("mediterranean_savanna_small_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(OLIVE_TREE.withChance(0.1F),
                            LOMBARDY_POPLAR_TREE.withChance(0.1F),  CANARY_DATE_PALM_TREE.withChance(0.089F),
                            CAROB_TREE.withChance(0.25F), ELDERBERRY_TREE.withChance(0.2F), ALMOND_TREE1.withChance(0.073F),
                            ALMOND_TREE2.withChance(0.073F), FORKY_FIG_TREE.withChance(0.3F), POMEGRANATE_TREE.withChance(0.2F),
                            CORK_OAK_TREE.withChance(0.3F), STRAWBERRY_TREE1.withChance(0.16F), WHITE_FIG_TREE.withChance(0.000015F),
                            STRAWBERRY_TREE2.withChance(0.2F)), HOLM_OAK_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.0F, 0))));

    public static final ConfiguredFeature<?, ?> TROPICAL_PINE_ISLAND_TREES = register("tropical_pine_island_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(INDIAN_CORAL_TREE.withChance(0.3F),
                            ROYAL_POINCIANA_TREE.withChance(0.1F), BANANA_TREE.withChance(0.35F), ROYAL_POINCIANA_BIG_TREE.withChance(0.1F),
                            RED_KAPOK_TREE.withChance(0.1F), ORCHID_TREE.withChance(0.1F), ACEROLA_TREE.withChance(0.1F), TROPICAL_ALMOND_FANCY_TREE.withChance(0.2F),
                            ORANGE_OLEANDER_TREE.withChance(0.12F), YELLOW_OLEANDER_TREE.withChance(0.12F), TROPICAL_ALMOND_TREE.withChance(0.12F),
                            TROPICAL_ALMOND_BIG_TREE.withChance(0.2F), COAST_COTTONWOOD_TREE.withChance(0.3F), COAST_COTTONWOOD_TREE.withChance(0.25F),
                            INDIAN_CORAL_FANCY_TREE.withChance(0.2F), TAMARIND_TREE.withChance(0.2F), TAMARIND_TREE_WITH_GLORIOSA.withChance(0.07F),
                            INDIAN_CORAL_TREE_WITH_GLORIOSA.withChance(0.076F),
                            OIL_PALM_TREE.withChance(0.1F)), FOREST_ACACIA_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    private static final ConfiguredFeature<?,?> ACACIA_TREE = Features.ACACIA;
    public static final ConfiguredFeature<?, ?> TROPICAL_STEEPE_TREES = register("tropical_steepe_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(POMEGRANATE_TREE.withChance(0.089F),
                            MESQUITE_TREE.withChance(0.1F), SYCAMORE_FIG_FANCY_TREE.withChance(0.2F),
                            SYCAMORE_FIG_ANCIENT_TREE.withChance(0.15F), DATE_PALM_TREE.withChance(0.15F)),
                            ACACIA_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 3))));

    public static final ConfiguredFeature<?, ?> SUBTROPICAL_DESERT_TREES = register("subtropical_desert_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(POMEGRANATE_TREE.withChance(0.2F),
                            ACACIA.withChance(0.3F), MESQUITE_TREE.withChance(0.3F), DATE_PALM_TREE.withChance(0.5F)), SYCAMORE_FIG_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.3F, 5))));

    public static final ConfiguredFeature<?, ?> TROPICAL_JUNGLE_FRUIT_TREES = register("tropical_jungle_fruit_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                            STARFRUIT_TREE.withChance(0.4F), BANANA_TREE.withChance(0.4F),
                            CREEPING_FIG_AVOCADO_TREE.withChance(0.4F), MANGO_TREE.withChance(0.3F),
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
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(SOUTHERN_BEECH_SHRUB.withChance(0.1F),
                            LENGA_BEECH_TREE.withChance(0.4F), COIHUE_TREE.withChance(0.4F)),
                            SOUTHERN_BEECH_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> COIHUE_TREES_WITH_BELLFLOWER = register("coihue_trees_with_bellflower",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                    COIHUE_TREE_WITH_WHITE_BELLFLOWER.withChance(0.01F), COIHUE_TREE_WITH_PINK_BELLFLOWER.withChance(0.08F),
                            COIHUE_TREE_WITH_MAGENTA_BELLFLOWER.withChance(0.057F)), COIHUE_TREE_WITH_RED_BELLFLOWER)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> LUSH_SOUTHERN_TUNDRA_VEGETATION = register("lush_southern_tundra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(SOUTHERN_BEECH_TREE.withChance(0.0003F)),
                            SOUTHERN_BEECH_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> SCRUBLAND_MEDITERRANEAN_CONIFERS = register("scrubland_mediterranean_conifers",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(ITALIAN_CYPRESS_TREE.withChance(0.5F)),
                    STONE_PINE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(1, 0.1F, 0))));

    public static final ConfiguredFeature<?, ?> CAMELLIA_TREES = register("camellia_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(CAMELLIA_TREE.withChance(0.3F),
                            CREEPING_FIG_AVOCADO_TREE.withChance(0.09F), AVOCADO_TREE.withChance(0.14F)),
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
}
