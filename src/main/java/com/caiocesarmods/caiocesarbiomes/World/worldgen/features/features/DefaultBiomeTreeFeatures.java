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
import static net.minecraft.world.gen.feature.Features.OAK;
import static net.minecraft.world.gen.feature.Features.SPRUCE;
import static net.minecraft.world.gen.feature.Features.SUPER_BIRCH_BEES_0002;

public class DefaultBiomeTreeFeatures {

    ///Mediterranean
    public static final ConfiguredFeature<?, ?> MEDITERRANEAN_OAK_TREES = register("mediterranean_oak_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(CORK_OAK_TREE.withChance(0.3F),
                            HOLM_OAK_FANCY_TREE.withChance(0.3F), CORK_OAK_FANCY_TREE.withChance(0.3F), OAK.withChance(0.2F),
                            FANCY_OAK.withChance(0.3F)), HOLM_OAK_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> MEDITERRANEAN_RIPARIAN_TREES = register("mediterranean_riparian_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(LOMBARDY_POPLAR_TREE.withChance(0.3F),
                            PLANE_TREE.withChance(0.3F), PLANE_FANCY_TREE.withChance(0.25F), PLANE_FANCY_TREE_WITH_IVY.withChance(0.12F),
                            PLANE_TREE_WITH_IVY.withChance(0.12F), ELDERBERRY_TREE.withChance(0.2F)), BLACK_POPLAR_FANCY_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(8, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> MEDITERRANEAN_OAK_SHRUBS = register("mediterranean_oak_shrubs",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                    HOLM_OAK_SHRUB.withChance(0.3F), CORK_OAK_SHRUB.withChance(0.3F)),
                    OAK_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> MEDITERRANEAN_SPARSE_OAK_TREES = register("mediterranean_sparse_oak_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(CORK_OAK_TREE.withChance(0.3F),
                            HOLM_OAK_FANCY_TREE.withChance(0.095F), CORK_OAK_FANCY_TREE.withChance(0.095F), FANCY_OAK.withChance(0.078F),
                            OAK.withChance(0.3F)), HOLM_OAK_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(6, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> MEDITERRANEAN_PINE_FOREST_CONIFERS = register("mediterranean_pine_forest_conifers",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(ALEPPO_PINE.withChance(0.6F),
                            STONE_PINE_TREE.withChance(0.34F), ITALIAN_CYPRESS_TREE.withChance(0.5F),
                            MARITIME_PINE.withChance(0.32F), BRUTIA_PINE_FANCY_TREE.withChance(0.34F),
                            BRUTIA_PINE_FORKY_TREE.withChance(0.34F)), STONE_PINE_TREE2)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(12, 0.1F, 4))));

    public static final ConfiguredFeature<?, ?> OLEANDER_SHRUBS = register("oleander_shrubs",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WHITE_OLEANDER_SHRUB.withChance(0.3F),
                            DARK_PINK_OLEANDER_SHRUB.withChance(0.3F), RED_OLEANDER_SHRUB.withChance(0.3F)), PINK_OLEANDER_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(8, 0.1F, 1))));

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

    public static final ConfiguredFeature<?, ?> SCRUBLAND_MEDITERRANEAN_CONIFERS = register("scrubland_mediterranean_conifers",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(ITALIAN_CYPRESS_TREE.withChance(0.5F)),
                    STONE_PINE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(1, 0.1F, 0))));

    public static final ConfiguredFeature<?, ?> OAK_FOREST_STRAWBERRY_TREES = register("oak_forest_strawberry_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(STRAWBERRY_TREE1.withChance(0.5F)),
                    STRAWBERRY_TREE2)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(1, 0.1F, 0))));

    public static final ConfiguredFeature<?, ?> MEDITERRANEAN_SAVANNA_SMALL_TREES = register("mediterranean_savanna_small_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(OLIVE_TREE.withChance(0.1F),
                            CANARY_DATE_PALM_TREE.withChance(0.089F), CAROB_TREE.withChance(0.25F), ALMOND_TREE.withChance(0.073F),
                            FORKY_FIG_TREE.withChance(0.3F), POMEGRANATE_TREE.withChance(0.2F),
                            CORK_OAK_TREE.withChance(0.3F), STRAWBERRY_TREE1.withChance(0.16F), WHITE_FIG_TREE.withChance(0.000015F),
                            STRAWBERRY_TREE2.withChance(0.2F)), HOLM_OAK_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.0F, 0))));

    public static final ConfiguredFeature<?, ?> MEDITERRANEAN_CONIFER_TREES = register("mediterranean_conifer_trees", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(STONE_PINE_TREE2.withChance(0.1F),
                    ITALIAN_CYPRESS_TREE.withChance(0.5F), MARITIME_PINE.withChance(0.25F), BRUTIA_PINE_FANCY_TREE.withChance(0.1F),
                    BRUTIA_PINE_FORKY_TREE.withChance(0.2F), ALEPPO_PINE.withChance(0.15F)),
                    STONE_PINE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
            .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    ///Humid Subtropical
    public static final ConfiguredFeature<?, ?> HUMID_SUBTROPICAL_PINE_TREES = register("humid_subtropical_pine_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                            LOBLOLLY_PINE.withChance(0.5F), TALL_LOBLOLLY_PINE.withChance(0.35F)), SLASH_PINE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(12, 0.1F, 6))));

    public static final ConfiguredFeature<?, ?> LAUREAL_FOREST_CONIFER_TREES = register("laurel_forest_conifer_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                            CANARY_PINE_TREE.withChance(0.5F), CANARY_PINE_TREE_TALL.withChance(0.35F),
                            AGATHIS_TREE1.withChance(0.2F)),
                            SLASH_PINE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(3, 0.1F, 6))));

    public static final ConfiguredFeature<?, ?> HIGHLAND_OCOTEA_TREES = register("highland_ocotea",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                            ELDERBERRY_TREE.withChance(0.1F), HIGHLAND_OCOTEA_TREE_WITH_IVY.withChance(0.2F),
                            ANCIENT_CAMPHOR_TREE.withChance(0.2F)),
                            HIGHLAND_OCOTEA_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.3F, 3))));

    public static final ConfiguredFeature<?, ?> SUBTROPICAL_EXTREME_HILLS_VEGETATION = register("subtropical_extreme_hills_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(CHINESE_RED_PINE_TREE.withChance(0.8F),
                    AVOCADO_TREE.withChance(0.08F), IVY_AVOCADO_TREE.withChance(0.054F), TEA_TREE.withChance(0.12F), CAMELLIA_TREE.withChance(0.14F)),
                    OAK_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(8, 0.1F, 1))));

    //Common to both laurel and oak forest
    public static final ConfiguredFeature<?, ?> HUMID_SUBTROPICAL_BEACH_VEGETATION = register("humid_subtropical_beach_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(SABAL_PALM_FANCY_TREE.withChance(0.6F),
                            SOUTHERN_WAX_MYRTLE_SHRUB.withChance(0.5F), SOUTHERN_MAGNOLIA_TREE.withChance(0.3F),
                            SABAL_PALM_TREE.withChance(0.7F), PINE_LIKE_CASUARINA_TREE.withChance(0.1F),
                            INDIAN_LAUREL_TREE.withChance(0.1F), SUBTROPICAL_SPRING_ORCHID_TREE2.withChance(0.14F),
                            SUBTROPICAL_SPRING_ORCHID_TREE1.withChance(0.2F), POHUTUKAWA_TREE.withChance(0.1F)), ANCIENT_POHUTUKAWA))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> SABAL_PALMS = register("sabal_palms",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(SABAL_PALM_FANCY_TREE.withChance(0.5F)),
                            SABAL_PALM_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> SWAMP_EXTRA_VEGETATION = register("swamp_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                            SABAL_PALM_TREE.withChance(0.098F), SABAL_PALM_FANCY_TREE.withChance(0.089F),
                            SOUTHERN_MAGNOLIA_TREE.withChance(0.089F), PLANE_TREE.withChance(0.3F),
                            ELDERBERRY_TREE.withChance(0.3F), MULBERRY_TREE.withChance(0.1F),
                            PLANE_FANCY_TREE.withChance(0.15F), RED_MAPLE_TREE.withChance(0.04F),
                            PERSIMMON_TREE.withChance(0.12F), PERSIMMON_FANCY_TREE.withChance(0.25F),
                            SOUTHERN_LIVE_OAK_TREE.withChance(0.4F), OBTUSA_OAK_TREE.withChance(0.4F),
                            PLANE_FANCY_TREE_WITH_IVY.withChance(0.07F),
                            PLANE_TREE_WITH_IVY.withChance(0.09F), WEEPING_WILLOW_BIG.withChance(0.3F),
                            WEEPING_WILLOW_FANCY.withChance(0.3F)),
                            BALD_CYPRESS))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(3, 0.1F, 0))));

    public static final ConfiguredFeature<?, ?> SUBTROPICAL_FOREST_CITRUS_TREES = register("subtropical_citrus_trees", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(MANDARIN_TREE.withChance(0.5F), GRAPEFRUIT_TREE.withChance(0.5F)),
                    ORANGE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    //Miscellaneous trees found both in subtropical laurel forest and subtropical evergreen oak forest
    public static final ConfiguredFeature<?, ?> HUMID_SUBTROPICAL_FOREST_MISCELLANEOUS_TREES = register(
            "humid_subtropical_forest_misc_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                            LOQUAT_TREE.withChance(0.3F), WAX_LEAF_PRIVET_TREE.withChance(0.3F), BANANA_TREE.withChance(0.25F),
                            STARFRUIT_TREE.withChance(0.4F), MULBERRY_TREE.withChance(0.4F), ELDERBERRY_TREE.withChance(0.3F),
                            PERSIMMON_TREE.withChance(0.4F), PERSIMMON_FANCY_TREE.withChance(0.35F),
                            PLANE_TREE.withChance(0.098F), PLANE_FANCY_TREE.withChance(0.098F), PLANE_TREE_WITH_IVY.withChance(0.098F),
                            PLANE_FANCY_TREE_WITH_IVY.withChance(0.098F), RED_MAPLE_FANCY_TREE_WITH_IVY.withChance(0.098F),
                            TALL_RED_MAPLE_TREE_WITH_IVY.withChance(0.098F), SOUTHERN_WAX_MYRTLE_SHRUB.withChance(0.21F),
                            RED_MAPLE_FANCY_TREE.withChance(0.098F), RED_MAPLE_TREE.withChance(0.098F),
                            PEACH_TREE.withChance(0.25F), SABAL_PALM_TREE.withChance(0.5F), SABAL_PALM_FANCY_TREE.withChance(0.45F),
                            TEA_TREE.withChance(0.45F), CAMELLIA_TREE.withChance(0.45F)), SOUTHERN_MAGNOLIA_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(6, 0.2F, 2))));

    //Miscellaneous (non-lauraceae) subtropical trees from laurel forest only (zone 10 exclusives)
    public static final ConfiguredFeature<?, ?> LAUREL_FOREST_MISCELLANEOUS_TREES = register("laurel_forest_misc_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(LYCHEE_TREE.withChance(0.36F),
                            ORCHID_TREE1.withChance(0.22F), ORCHID_TREE2.withChance(0.3F), CHAMPAK_TREE.withChance(0.35F), CINNAMON_TREE.withChance(0.45F)),
                            CINNAMON_FANCY_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(6, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> SUBTROPICAL_EVERGREEN_OAK_BEACH_TREES = register("subtropical_evergreen_oak_beach_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(POHUTUKAWA_TREE.withChance(0.36F),
                            ANCIENT_POHUTUKAWA.withChance(0.22F), BIG_LIVE_OAK_TREE.withChance(0.22F), SABAL_PALM_FANCY_TREE.withChance(0.2F),
                            SABAL_PALM_TREE.withChance(0.2F), SOUTHERN_LIVE_OAK_TREE.withChance(0.36F)), SAND_LAUREL_OAK_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(6, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> JUNGLE_OCOTEA_TREES = register("jungle_ocotea_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(OCOTEA_JUNGLE_TREE.withChance(0.5F)),
                            OCOTEA_JUNGLE_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> LAUREL_JUNGLE_TREES = register("laurel_jungle_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(ANCIENT_CAMPHOR_TREE.withChance(0.25F),
                            BIG_WEEPING_FIG_TREE.withChance(0.25F), BIG_INDIAN_LAUREL_TREE.withChance(0.26F), RUBBER_TREE.withChance(0.26F),
                            WEEPING_FIG_TREE.withChance(0.15F), INDIAN_LAUREL_TREE.withChance(0.15F), BIG_CAMPHOR_TREE.withChance(0.23F),
                            OCOTEA_JUNGLE_TREE.withChance(0.5F), AGATHIS_TREE1.withChance(0.2F), AGATHIS_TREE2.withChance(0.23F),
                            HOOP_PINE_TREE.withChance(0.23F), BUNYA_PINE_TREE2.withChance(0.2F), BUNYA_PINE_TREE.withChance(0.16F)),
                            OCOTEA_JUNGLE_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> SUBTROPICAL_FOREST_LAURACEAE = register("subtropical_forest_lauraceae",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(OCOTEA_FOREST_TREE.withChance(0.5F),
                            OCOTEA_FOREST_FANCY_TREE_WITH_IVY.withChance(0.35F), OCOTEA_FOREST_FANCY_TREE.withChance(0.45F),
                            CAMPHOR_TREE.withChance(0.5F), BIG_CAMPHOR_TREE.withChance(0.25F), AVOCADO_TREE.withChance(0.34F),
                            IVY_AVOCADO_TREE.withChance(0.12F), MACHILLUS_TREE.withChance(0.34F), IVY_MACHILLUS_TREE.withChance(0.13F)),
                            ANCIENT_CAMPHOR_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(6, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> SUBTROPICAL_OAK_FOREST_TREES = register("subtropical_oak_forest_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(CASTANOPSIS_FANCY_TREE.withChance(0.3F),
                            CASTANOPSIS_TREE.withChance(0.3F), STONE_OAK_TREE.withChance(0.3F), RING_CUPPED_OAK_TREE.withChance(0.3F),
                            RING_CUPPED_OAK_FANCY_TREE.withChance(0.3F), OAK.withChance(0.3F), OAK_BEES_002.withChance(0.065641026F),
                            FANCY_OAK.withChance(0.30769232F), FANCY_OAK_BEES_002.withChance(0.03333334F), SOUTHERN_LIVE_OAK_TREE.withChance(0.3F),
                            FANCY_OAK_TREE_WITH_IVY.withChance(0.32F), OAK_TREE_WITH_IVY.withChance(0.3F), OAK_TREE_WITH_KIWI.withChance(0.078F),
                            BIG_LIVE_OAK_TREE.withChance(0.25F)), SUBTROPICAL_SPRING_ORCHID_TREE1))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(12, 0.1F, 1))));


    /// Desert and drylands
    public static final ConfiguredFeature<?, ?> TEMPERATE_DESERT_TREES = register("temperate_desert_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(PISTACHIO_TREE.withChance(0.2F),
                            BLACK_POPLAR_FANCY_TREE.withChance(0.3F), DATE_PALM_TREE.withChance(0.2F), ALMOND_TREE.withChance(0.3F)),
                            LOMBARDY_POPLAR_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.5F, 6))));

    public static final ConfiguredFeature<?, ?> LOWLAND_BADLANDS_VEGETATION = register("lowland_badlands_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(JUNIPER_TREE.withChance(0.3F),
                            MESQUITE_TREE.withChance(0.15F), MESQUITE_FANCY_TREE.withChance(0.25F),
                            FREMONT_POPLAR_TREE.withChance(0.34F)), PINYON_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(6, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> WOODED_BADLANDS_VEGETATION = register("wooded_badlands_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(PONDEROSA_PINE_TREE_TALL.withChance(0.42F),
                            WHITE_FIR.withChance(0.2F), ASPEN_TREE.withChance(0.15F), BLUE_SPRUCE.withChance(0.1F), DOUGLAS_FIR_TREE.withChance(0.4F),
                            GIANT_DOUGLAS_FIR_TREE.withChance(0.3F)),
                            PONDEROSA_PINE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(6, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> SOCOTRA_TREES = register("socotra_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(SOCOTRA_DESERT_ROSE_TREE.withChance(0.07F),
                            SOCOTRA_CUCUMBER_TREE.withChance(0.07F), DATE_PALM_TREE.withChance(0.06F)),
                            DRAGON_BLOOD_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.3F, 0))));

    public static final ConfiguredFeature<?, ?> TROPICAL_STEEPE_TREES = register("tropical_steepe_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(TAMARIND_TREE.withChance(0.089F),
                            MESQUITE_TREE.withChance(0.1F), MESQUITE_FANCY_TREE.withChance(0.15F), DATE_PALM_TREE.withChance(0.15F)),
                            BAOBAB_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> SUBTROPICAL_DESERT_TREES = register("subtropical_desert_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(POMEGRANATE_TREE.withChance(0.2F),
                            ACACIA.withChance(0.3F), MESQUITE_TREE.withChance(0.3F), MESQUITE_FANCY_TREE.withChance(0.55F), DATE_PALM_TREE.withChance(0.5F)),
                            ANCIENT_SYCAMORE_FIG)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.3F, 5))));

    /// Taiga
    public static final ConfiguredFeature<?, ?> TAIGA_EXTRA_VEGETATION = register("taiga_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(TAIGA_ASPEN_TREE.withChance(0.2F),
                            JUNIPER_SHRUB.withChance(0.089F)), TAIGA_LARCH_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> MEGA_TAIGA_EXTRA_VEGETATION = register("mega_taiga_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(TAIGA_ASPEN_TREE.withChance(0.15F),
                            JUNIPER_SHRUB.withChance(0.089F), TAIGA_LARCH_TREE.withChance(0.2F)), TAIGA_TALL_LARCH_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));

    /// Temperate
    public static final ConfiguredFeature<?, ?> GINKGO_TRESS = register("ginkgo_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(GINKGO_FANCY_TREE.withChance(0.25F),
                            BLOB_GINKGO_TREE.withChance(0.09F)), CONIC_GINKGO_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(12, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> RAINFOREST_CHESTNUT_TREES = register("rainforest_chestnut",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(BIG_SWEET_CHESTNUT_TREE.withChance(0.5F)),
                            SWEET_CHESTNUT_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> BIRCH_FOREST_EXTRA_VEGETATION = register("birch_forest_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                            ROWAN_TREE_SPRING.withChance(0.13F), HOLLY_TREE2.withChance(0.057F),
                            HOLLY_TREE1.withChance(0.067F), BLACK_POPLAR_FANCY_TREE.withChance(0.1F), LOMBARDY_POPLAR_TREE.withChance(0.1F),
                            JUNIPER_SHRUB.withChance(0.17F), ELDERBERRY_TREE.withChance(0.1F), SPRING_HAWTHORN_TREE.withChance(0.2F)), HAZELNUT_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 0))));

    public static final ConfiguredFeature<?, ?> MIXED_CONTINENTAL_FOREST_TREES = register("mixed_continental_forest_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(ELDERBERRY_TREE.withChance(0.3F),
                            WHITE_CRABAPPLE_TREE.withChance(0.3F), ASPEN_TREE.withChance(0.1F), LOMBARDY_POPLAR_TREE.withChance(0.05F),
                            PINK_CRABAPPLE_TREE.withChance(0.3F), RED_CRABAPPLE_TREE.withChance(0.077F), RED_MAPLE_TREE.withChance(0.3F),
                            RED_MAPLE_FANCY_TREE.withChance(0.3F), WALNUT_TREE.withChance(0.25F), WALNUT_FANCY_TREE.withChance(0.3F),
                            RED_OAK_TREE.withChance(0.2F), RED_OAK_FANCY_TREE.withChance(0.14F), SPRING_HAWTHORN_TREE.withChance(0.12F),
                            ROWAN_TREE_SPRING.withChance(0.12F), BLACK_POPLAR_FANCY_TREE.withChance(0.4F), JUNIPER_SHRUB.withChance(0.07F),
                            CHERRY_PLUM_FANCY_TREE.withChance(0.1F), CHERRY_PLUM_TREE.withChance(0.1F), HAZELNUT_TREE.withChance(0.1F),
                            PLANE_TREE.withChance(0.25F)), PLANE_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> TEMPERATE_FRUIT_TREES = register("temperate_fruit_trees", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(PINK_CRABAPPLE_TREE.withChance(0.5F), CHERRY_PLUM_TREE.withChance(0.1F),
                    CHERRY_PLUM_FANCY_TREE.withChance(0.3F), RED_CRABAPPLE_TREE.withChance(0.2F), MULBERRY_TREE.withChance(0.3F),
                    ELDERBERRY_TREE.withChance(0.3F)), WHITE_CRABAPPLE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> JAPANESE_GROVE_TREES = register("japanese_grove_trees", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(SUPER_BIRCH_BEES_0002.withChance(0.3F),
                    TEA_TREE.withChance(0.1F), CAMELLIA_TREE.withChance(0.3F),
                    JAPANESE_PINE_TREE.withChance(0.2F), OAK_TREE_WITH_IVY.withChance(0.1F),
                    FANCY_OAK_TREE_WITH_IVY.withChance(0.198F), OAK.withChance(0.4F),
                    HAZELNUT_TREE.withChance(0.2F)), SPRUCE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
            .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(3, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> TEMPERATE_OCEANIC_FOREST_VEGETATION = register("forest_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(PINK_CRABAPPLE_TREE.withChance(0.1F),
                            WHITE_CRABAPPLE_TREE.withChance(0.1F), RED_CRABAPPLE_TREE.withChance(0.077F), JAPANESE_MAPLE_TREE.withChance(0.07F),
                            MULBERRY_TREE.withChance(0.2F), RED_MAPLE_TREE.withChance(0.2F), RED_MAPLE_FANCY_TREE.withChance(0.15F),
                            ELDERBERRY_TREE.withChance(0.2F), PLANE_FANCY_TREE.withChance(0.2F), LOMBARDY_POPLAR_TREE.withChance(0.05F),
                            BLACK_POPLAR_FANCY_TREE.withChance(0.091F), WALNUT_TREE.withChance(0.15F), WALNUT_FANCY_TREE.withChance(0.3F),
                            OAK_TREE_WITH_IVY.withChance(0.19F), FANCY_OAK_TREE_WITH_IVY.withChance(0.3F), SWEET_CHESTNUT_TREE.withChance(0.2F),
                            SPRING_HAWTHORN_TREE.withChance(0.2F), HAZELNUT_TREE.withChance(0.2F), PLANE_TREE.withChance(0.6F),
                            CHERRY_PLUM_FANCY_TREE.withChance(0.4F), CHERRY_PLUM_TREE.withChance(0.34F), COOPER_BEECH_BIG_TREE.withChance(0.2F),
                            COOPER_BEECH_TREE.withChance(0.2F), YOUNG_YEW_TREE.withChance(0.3F), ANCIENT_YEW_TREE.withChance(0.0078F),
                            HOLLY_TREE1.withChance(0.12F), HOLLY_TREE2.withChance(0.2F), ROWAN_TREE_SPRING.withChance(0.2F),
                            RED_OAK_FANCY_TREE.withChance(0.2F), RED_OAK_TREE.withChance(0.25F), RED_OAK_SHRUB.withChance(0.21F),
                            RED_OAK_FANCY_TREE_WITH_IVY.withChance(0.05F), RED_OAK_TREE_WITH_IVY.withChance(0.045F)),
                            OAK_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(6, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> DARK_FOREST_EXTRA_VEGETATION = register("dark_oak_forest_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                            BIG_SWEET_CHESTNUT_TREE.withChance(0.395F), SWEET_CHESTNUT_TREE.withChance(0.3F),
                            RED_OAK_SHRUB.withChance(0.2F), ELDERBERRY_TREE.withChance(0.3F), OAK_SHRUB.withChance(0.4F), OAK_TREE_WITH_IVY.withChance(0.19F),
                            PINK_CRABAPPLE_TREE.withChance(0.1F), WHITE_CRABAPPLE_TREE.withChance(0.1F), RED_CRABAPPLE_TREE.withChance(0.077F),
                            FANCY_OAK_TREE_WITH_IVY.withChance(0.3F), HOLLY_TREE1.withChance(0.19F), HOLLY_TREE2.withChance(0.1F),
                            SPRING_HAWTHORN_TREE.withChance(0.2F), WALNUT_TREE.withChance(0.15F), WALNUT_FANCY_TREE.withChance(0.3F),
                            COOPER_BEECH_BIG_TREE.withChance(0.5F), HAZELNUT_TREE.withChance(0.2F),
                            RED_OAK_TREE.withChance(0.089F), RED_MAPLE_TREE.withChance(0.059F), RED_MAPLE_FANCY_TREE.withChance(0.05F),
                            ROWAN_TREE_SPRING.withChance(0.26F), YOUNG_YEW_TREE.withChance(0.4F), ANCIENT_YEW_TREE_WITH_IVY.withChance(0.12F),
                            DARK_OAK_WITH_IVY.withChance(0.13F), CHERRY_PLUM_FANCY_TREE.withChance(0.4F), CHERRY_PLUM_TREE.withChance(0.34F)),
                            ANCIENT_YEW_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    //No birch, southern USA pine trees, liquidambar and crape myrtles. This forest has, like the average forest, a base hardiness zone of 8 to 7 (based on factors like altitude and latitude)
    public static final ConfiguredFeature<?, ?> HOT_TEMPERATE_FOREST_VEGETATION = register("hot_summer_temperate_forest_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(PINK_CRABAPPLE_TREE.withChance(0.12F),
                            WHITE_CRABAPPLE_TREE.withChance(0.1F), RED_CRABAPPLE_TREE.withChance(0.077F), JAPANESE_MAPLE_TREE.withChance(0.07F),
                            MULBERRY_TREE.withChance(0.2F), RED_MAPLE_TREE.withChance(0.2F), RED_MAPLE_FANCY_TREE.withChance(0.15F),
                            ELDERBERRY_TREE.withChance(0.2F), PEACH_TREE.withChance(0.2F), SOUTHERN_MAGNOLIA_TREE.withChance(0.1F),
                            PLANE_FANCY_TREE.withChance(0.2F), LOMBARDY_POPLAR_TREE.withChance(0.05F), BLACK_POPLAR_FANCY_TREE.withChance(0.091F),
                            PECAN_TREE.withChance(0.2F), WALNUT_TREE.withChance(0.15F), WALNUT_FANCY_TREE.withChance(0.3F), CAMELLIA_TREE.withChance(0.087F),
                            WAX_LEAF_PRIVET_TREE.withChance(0.2F), SOUTHERN_WAX_MYRTLE_SHRUB.withChance(0.02F), RING_CUPPED_OAK_FANCY_TREE.withChance(0.12F),
                            RING_CUPPED_OAK_TREE.withChance(0.12F), FANCY_OAK.withChance(0.3F), OAK.withChance(0.35F), OAK_BEES_002.withChance(0.04F),
                            OAK_TREE_WITH_KIWI.withChance(0.087F), SOUTHERN_LIVE_OAK_TREE.withChance(0.2F), BIG_LIVE_OAK_TREE.withChance(0.2F),
                            PECAN_FANCY_TREE.withChance(0.3F), OAK_TREE_WITH_IVY.withChance(0.19F), FANCY_OAK_TREE_WITH_IVY.withChance(0.3F),
                            SPRING_HAWTHORN_TREE.withChance(0.2F), OBTUSA_OAK_TREE.withChance(0.15F), HAZELNUT_TREE.withChance(0.2F),
                            LIQUIDAMBAR_TREE.withChance(0.3F), PLANE_TREE.withChance(0.3F),
                            CHERRY_PLUM_FANCY_TREE.withChance(0.4F), CHERRY_PLUM_TREE.withChance(0.34F)), OAK_SHRUB))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(6, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> WESTERN_HEMLOCK_TREES = register("western_hemlock_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WESTERN_HEMLOCK_TREE_TALL.withChance(0.3F),
                            WESTERN_HEMLOCK_WITH_IVY.withChance(0.1F)), WESTERN_HEMLOCK_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(45, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> PLAINS_EXTRA_VEGETATION = register("plains_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(LOMBARDY_POPLAR_TREE.withChance(0.2F),
                            BLACK_POPLAR_FANCY_TREE.withChance(0.2F), PECAN_FANCY_TREE.withChance(0.3F), PLANE_TREE.withChance(0.2F),
                            PLANE_TREE.withChance(0.2F), PECAN_TREE.withChance(0.15F), WALNUT_TREE.withChance(0.15F), WALNUT_FANCY_TREE.withChance(0.2F),
                            OAK_SHRUB.withChance(0.2F)), ELDERBERRY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.3F, 5))));

    public static final ConfiguredFeature<?, ?> HOLLY_TREES = register("holly_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(HOLLY_TREE2.withChance(0.3F)),
                            HOLLY_TREE1)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> HEMIBOREAL_PRAIRIE_TREES = register("hemiboreal_prairie_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(BLACK_POPLAR_FANCY_TREE.withChance(0.5F),
                            ALMOND_TREE.withChance(0.4F)), LOMBARDY_POPLAR_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 0))));

    public static final ConfiguredFeature<?, ?> TEMPERATE_RAINFOREST_SHRUBS = register("temperate_rainforest_shrubs",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(RED_OAK_SHRUB.withChance(0.3F)),
                            OAK_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> TREES_TEMPERATE_RAINFOREST = register("trees_temperate_rainforest",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(COOPER_BEECH_TREE.withChance(0.3F),
                            COOPER_BEECH_BIG_TREE.withChance(0.2F), OAK_TREE_WITH_IVY.withChance(0.19F),
                            FANCY_OAK_TREE_WITH_IVY.withChance(0.3F),
                            RED_OAK_FANCY_TREE.withChance(0.3F), HAZELNUT_TREE.withChance(0.23F),
                            RED_MAPLE_TREE.withChance(0.2F),
                            OAK_TREE_WITH_KIWI.withChance(0.031F), RED_MAPLE_FANCY_TREE.withChance(0.2F),
                            YOUNG_YEW_TREE.withChance(0.4F),
                            SPRING_HAWTHORN_TREE.withChance(0.3F), JAPANESE_MAPLE_TREE.withChance(0.053F),
                            ROWAN_TREE_SPRING.withChance(0.2F)), RED_OAK_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(3, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> JAPANESE_MAPLE = register("japanese_maple",
            JAPANESE_MAPLE_TREE.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(4, 0.1F, 1))));

    ///Mountain
    public static final ConfiguredFeature<?, ?> MOUNTAIN_EXTRA_VEGETATION = register("mountain_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(BLUE_SPRUCE.withChance(0.078F),
                            SPRING_HAWTHORN_TREE.withChance(0.012F), ROWAN_TREE_SPRING.withChance(0.012F),
                            MOUNTAIN_HEMLOCK_TREE.withChance(0.5F), MOUNTAIN_HEMLOCK_TREE_TALL.withChance(0.5F),
                            SUBALPINE_FIR.withChance(0.7F), JUNIPER_SHRUB.withChance(0.25F), MUGO_PINE_TREE.withChance(0.13F)), MUGO_PINE_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(6, 0.1F, 1))));

    /// Tropical
    public static final ConfiguredFeature<?, ?> JUNGLE_EXTRA_VEGETATION = register("jungle_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                    WEEPING_FIG_TREE.withChance(0.2F), BIG_WEEPING_FIG_TREE.withChance(0.2F),
                            MANGO_FANCY_TREE.withChance(0.15F), MANGO_TREE.withChance(0.15F), BREADFRUIT_TREE.withChance(0.25F),
                            CINNAMON_TREE.withChance(0.12F), CINNAMON_FANCY_TREE.withChance(0.13F),
                            CITRON_TREE.withChance(0.2F), TAHITI_LIME_TREE.withChance(0.2F),
                            LEMON_TREE.withChance(0.2F), BUDDHA_HAND_TREE.withChance(0.12F),
                            DURIAN_TREE.withChance(0.2F), GLORIOSA_JUNGLE_TREE.withChance(0.03F),
                            BIG_INDIAN_LAUREL_TREE.withChance(0.2F), OIL_PALM_TREE.withChance(0.3F),
                            BANANA_TREE.withChance(0.4F), AVOCADO_TREE.withChance(0.4F),
                            STARFRUIT_TREE.withChance(0.4F), TROPICAL_ALMOND_TREE.withChance(0.2F),
                            TROPICAL_ALMOND_FANCY_TREE.withChance(0.2F),
                            TROPICAL_ALMOND_BIG_TREE.withChance(0.2F), RED_KAPOK_TREE.withChance(0.3F),
                            ORCHID_TREE1.withChance(0.2F), ORCHID_TREE2.withChance(0.23F), RUBBER_TREE.withChance(0.2F),
                            PEPPERCORN_JUNGLE_TREE.withChance(0.28F), RAINBOW_EUCALYPTUS_TREE.withChance(0.198F)),
                            INDIAN_LAUREL_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(7, 0.3F, 0))));

    public static final ConfiguredFeature<?, ?> JUNGLE_HILLS_EXTRA_VEGETATION = register("jungle_hills_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WEEPING_FIG_TREE.withChance(0.2F),
                            BIG_WEEPING_FIG_TREE.withChance(0.2F), MANGO_FANCY_TREE.withChance(0.15F),
                            MANGO_TREE.withChance(0.15F), LEMON_TREE.withChance(0.2F),
                            BUDDHA_HAND_TREE.withChance(0.12F), CITRON_TREE.withChance(0.2F),
                            TAHITI_LIME_TREE.withChance(0.2F), OIL_PALM_TREE.withChance(0.3F),
                            DURIAN_TREE.withChance(0.2F), CINNAMON_TREE.withChance(0.12F),
                            CINNAMON_FANCY_TREE.withChance(0.13F), GLORIOSA_JUNGLE_TREE.withChance(0.03F),
                            BREADFRUIT_TREE.withChance(0.25F), ORCHID_TREE2.withChance(0.23F),
                            BIG_INDIAN_LAUREL_TREE.withChance(0.2F), BANANA_TREE.withChance(0.4F),
                            AVOCADO_TREE.withChance(0.4F),
                            STARFRUIT_TREE.withChance(0.4F), RED_KAPOK_TREE.withChance(0.3F),
                            PEPPERCORN_JUNGLE_TREE.withChance(0.28F), BUNYA_PINE_TREE.withChance(0.4F),
                            AGATHIS_TREE1.withChance(0.3F), BUNYA_PINE_TREE2.withChance(0.35F),
                            AGATHIS_TREE2.withChance(0.35F), HOOP_PINE_TREE.withChance(0.32F),
                            ORCHID_TREE1.withChance(0.2F), RUBBER_TREE.withChance(0.2F), RAINBOW_EUCALYPTUS_TREE.withChance(0.198F)),
                            INDIAN_LAUREL_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(7, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> JUNGLE_EDGE_EXTRA_VEGETATION = register("jungle_edge_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WEEPING_FIG_TREE.withChance(0.2F),
                            BIG_WEEPING_FIG_TREE.withChance(0.35F), MANGO_FANCY_TREE.withChance(0.15F),
                            MANGO_TREE.withChance(0.15F), OIL_PALM_TREE.withChance(0.6F),
                            LEMON_TREE.withChance(0.2F), BUDDHA_HAND_TREE.withChance(0.12F), CITRON_TREE.withChance(0.2F),
                            TAHITI_LIME_TREE.withChance(0.2F), DURIAN_TREE.withChance(0.2F),
                            BREADFRUIT_TREE.withChance(0.25F), CINNAMON_TREE.withChance(0.12F),
                            CINNAMON_FANCY_TREE.withChance(0.13F), GLORIOSA_JUNGLE_TREE.withChance(0.03F),
                            BIG_INDIAN_LAUREL_TREE.withChance(0.35F), BANANA_TREE.withChance(0.4F),
                            AVOCADO_TREE.withChance(0.4F), GLORIOSA_JUNGLE_TREE.withChance(0.03F),
                            STARFRUIT_TREE.withChance(0.4F),
                            TROPICAL_ALMOND_FANCY_TREE.withChance(0.2F),
                            RED_KAPOK_TREE.withChance(0.2F), TROPICAL_ALMOND_TREE.withChance(0.2F),
                            RAINBOW_EUCALYPTUS_TREE.withChance(0.198F),
                            TROPICAL_ALMOND_BIG_TREE.withChance(0.2F), ORCHID_TREE1.withChance(0.2F), ORCHID_TREE2.withChance(0.23F),
                            RUBBER_TREE.withChance(0.2F),
                            PEPPERCORN_JUNGLE_TREE.withChance(0.28F)),
                            INDIAN_LAUREL_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.0F, 0))));

    public static final ConfiguredFeature<?, ?> SAVANNA_EXTRA_VEGETATION = register("savanna_extra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                            SAUSAGE_TREE.withChance(0.13F), INDIAN_CORAL_FANCY_TREE.withChance(0.19F),
                            INDIAN_CORAL_TREE.withChance(0.089F), TAMARIND_TREE.withChance(0.19F), MARULA_TREE.withChance(0.24F),
                            TALL_BISMARCK_PALM.withChance(0.32F), ACACIA_TREE_WITH_GLORIOSA.withChance(0.08F),
                            BISMARCK_PALM.withChance(0.3F), JACKALBERRY_TREE.withChance(0.3F), PLUMERIA_ORANGE_TREE.withChance(0.071F),
                            ROYAL_POINCIANA_TREE.withChance(0.19F), ROYAL_POINCIANA_BIG_TREE.withChance(0.12F),
                            PLUMERIA_PINK_TREE.withChance(0.071F), PLUMERIA_YELLOW_TREE.withChance(0.061F),
                            PLUMERIA_WHITE_TREE.withChance(0.08F), PLUMERIA_RED_TREE.withChance(0.061F), BAOBAB_TREE.withChance(0.2F),
                            JACKALBERRY_FANCY_TREE.withChance(0.15F), YELLOW_OLEANDER_TREE.withChance(0.12F), ORANGE_OLEANDER_TREE.withChance(0.12F)),
                            SYCAMORE_FIG_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.3F, 5))));

    public static final ConfiguredFeature<?, ?> PLUMERIA_TREES = register("plumeria_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(PLUMERIA_ORANGE_TREE.withChance(0.12F),
                            PLUMERIA_PINK_TREE.withChance(0.12F), PLUMERIA_RED_TREE.withChance(0.1F), PLUMERIA_YELLOW_TREE.withChance(0.1F)),
                            PLUMERIA_WHITE_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 2))));

    public static final ConfiguredFeature<?, ?> TROPICAL_FOREST_CITRUS_TREES = register("tropical_citrus_trees", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(TAHITI_LIME_TREE.withChance(0.5F), CITRON_TREE.withChance(0.3F),
                    BUDDHA_HAND_TREE.withChance(0.4F)), LEMON_TREE))
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> TROPICAL_PINES = register("tropical_pines", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(NORFOLK_ISLAND_PINE_TREE.withChance(0.8F)),
                    COOK_PINE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
            .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(4, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> COCONUT_TREES = register("coconut_trees", Feature.RANDOM_SELECTOR
            .withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(SMALL_COCONUT_PALM_TREE.withChance(0.43F)),
                    COCONUT_PALM_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
            .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.3F, 1))));

    public static final ConfiguredFeature<?, ?> TROPICAL_BEACH_TREES = register("tropical_beach_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(TROPICAL_ALMOND_TREE.withChance(0.1F),
                            TROPICAL_ALMOND_BIG_TREE.withChance(0.2F), TROPICAL_ALMOND_FANCY_TREE.withChance(0.2F),
                            COAST_COTTONWOOD_FANCY_TREE.withChance(0.16F), BIG_COAST_COTTONWOOD_TREE.withChance(0.2F),
                            COAST_COTTONWOOD_TREE.withChance(0.15F), COCONUT_PALM_TREE.withChance(0.1F), ORCHID_TREE2.withChance(0.23F),
                            ORCHID_TREE1.withChance(0.01F), SOUTHERN_WAX_MYRTLE_SHRUB.withChance(0.21F)), SMALL_COCONUT_PALM_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(7, 0.1F, 4))));

    public static final ConfiguredFeature<?, ?> INDIAN_CORAL_TREES = register("indian_coral_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(INDIAN_CORAL_TREE.withChance(0.5F)),
                    INDIAN_CORAL_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> JUNGLE_FIG_TREES = register("jungle_fig_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WEEPING_FIG_TREE.withChance(0.1F),
                            BIG_WEEPING_FIG_TREE.withChance(0.3F), INDIAN_LAUREL_TREE.withChance(0.3F),
                            RUBBER_TREE.withChance(0.08F)), BIG_INDIAN_LAUREL_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(12, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> TROPICAL_PINE_ISLAND_JUNGLE_FIGS = register("tropical_pine_jungle_figs",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WEEPING_FIG_TREE.withChance(0.1F),
                            BIG_WEEPING_FIG_TREE.withChance(0.3F), INDIAN_LAUREL_TREE.withChance(0.3F),
                            RUBBER_TREE.withChance(0.2F)), BIG_INDIAN_LAUREL_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> TEAK_TREES = register("teak_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(TEAK_TALL_TREE.withChance(0.5F),
                            MEGA_TEAK_TREE.withChance(0.2F)), TEAK_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> TROPICAL_FOREST_DECIDUOUS_TREES = register("tropical_forest_deciduous_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(RED_KAPOK_TREE.withChance(0.3F),
                            ROYAL_POINCIANA_TREE.withChance(0.1F),  MANGO_TREE.withChance(0.25F), ACEROLA_TREE.withChance(0.09F),
                            MANGO_FANCY_TREE.withChance(0.3F), BISMARCK_PALM.withChance(0.08F), BISMARCK_PALM.withChance(0.07F),
                            STARFRUIT_TREE.withChance(0.08F), ORCHID_TREE1.withChance(0.29F),  ORCHID_TREE2.withChance(0.33F),
                            PINK_IVORY_TREE.withChance(0.2F), PINK_IVORY_FANCY_TREE.withChance(0.2F), SOUTHERN_WAX_MYRTLE_SHRUB.withChance(0.21F),
                            ROYAL_POINCIANA_BIG_TREE.withChance(0.3F), TROPICAL_ALMOND_FANCY_TREE.withChance(0.2F),
                            TROPICAL_ALMOND_TREE.withChance(0.12F), TROPICAL_ALMOND_BIG_TREE.withChance(0.2F),
                            ORANGE_OLEANDER_TREE.withChance(0.09F), YELLOW_OLEANDER_TREE.withChance(0.09F),
                            FOREST_ACACIA_TREE.withChance(0.34F)), TAMARIND_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(12, 0.25F, 6))));

    public static final ConfiguredFeature<?, ?> TROPICAL_PINE_ISLAND_TREES = register("tropical_pine_island_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(INDIAN_CORAL_TREE.withChance(0.3F),
                            ROYAL_POINCIANA_TREE.withChance(0.1F), BANANA_TREE.withChance(0.35F), ROYAL_POINCIANA_BIG_TREE.withChance(0.1F),
                            RED_KAPOK_TREE.withChance(0.1F), ORCHID_TREE1.withChance(0.13F), ORCHID_TREE2.withChance(0.23F), ACEROLA_TREE.withChance(0.1F), TROPICAL_ALMOND_FANCY_TREE.withChance(0.2F),
                            ORANGE_OLEANDER_TREE.withChance(0.12F), YELLOW_OLEANDER_TREE.withChance(0.12F), TROPICAL_ALMOND_TREE.withChance(0.12F),
                            TROPICAL_ALMOND_BIG_TREE.withChance(0.2F), COAST_COTTONWOOD_TREE.withChance(0.3F), COAST_COTTONWOOD_TREE.withChance(0.25F),
                            INDIAN_CORAL_FANCY_TREE.withChance(0.2F), TAMARIND_TREE.withChance(0.2F), SOUTHERN_WAX_MYRTLE_SHRUB.withChance(0.21F),
                            OIL_PALM_TREE.withChance(0.1F)), FOREST_ACACIA_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> TROPICAL_JUNGLE_FRUIT_TREES = register("tropical_jungle_fruit_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                            STARFRUIT_TREE.withChance(0.4F), BANANA_TREE.withChance(0.4F), MANGO_TREE.withChance(0.3F),
                            AVOCADO_TREE.withChance(0.3F)), MANGO_FANCY_TREE))
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 0))));

    /// CHILEAN TEMPERATE FORESTS
    public static final ConfiguredFeature<?, ?> MONKEY_PUZZLE_FOREST_TREES = register("monkey_puzzle_forest_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(YOUNG_MONKEY_PUZZLE_TREE.withChance(0.1F),
                    CHUSQUEA_BAMBOO.withChance(0.098F), PATAGONIAN_CYPRESS1.withChance(0.15F)),
                    MONKEY_PUZZLE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(12, 0.1F, 3))));

    public static final ConfiguredFeature<?, ?> SOUTHERN_BEECHES = register("southern_beeches",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(SOUTHERN_BEECH_SHRUB.withChance(0.1F),
                            LENGA_BEECH_TREE.withChance(0.4F), COIHUE_TREE.withChance(0.4F)),
                            SOUTHERN_BEECH_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> LUSH_SOUTHERN_TUNDRA_VEGETATION = register("lush_southern_tundra_vegetation",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(SOUTHERN_BEECH_TREE.withChance(0.0003F)),
                            SOUTHERN_BEECH_SHRUB)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

    /// EUCALYPTUS ECOSSYSTEMS
    public static final ConfiguredFeature<?, ?> EUCALYPTUS_TREES = register("eucalyptus_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(EUCALYPTUS_TALL_TREE.withChance(0.5F)),
                    EUCALYPTUS_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(13, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> CASUARINA_TREES = register("casuarina_trees", Feature.RANDOM_SELECTOR.withConfiguration(
                    new MultipleRandomFeatureConfig((ImmutableList.of(CASUARINA_FANCY_TREE.withChance(0.4F))), PINE_LIKE_CASUARINA_TREE))
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
            .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> TROPICAL_EUCALYPTUS_FOREST_TREES = register("tropical_eucalyptus_forest_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(CASUARINA_FANCY_TREE.withChance(0.5F)),
                    EUCALYPTUS_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                   .configure(new AtSurfaceWithExtraConfig(13, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> PLAINS_EUCALYPTUS_TREES = register("plains_eucalyptus_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(EUCALYPTUS_TALL_TREE.withChance(0.5F)),
                    EUCALYPTUS_FANCY_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA
                    .configure(new AtSurfaceWithExtraConfig(0, 0.2F, 2))));


    /// MISCELLANEOUS
    public static final ConfiguredFeature<?, ?> CRAPE_MYRTLE_TREES = register("crape_myrtle_trees",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(WHITE_CRAPE_MYRTLE_TREE.withChance(0.1F),
                            PINK_CRAPE_MYRTLE_TREE.withChance(0.3F), RED_CRAPE_MYRTLE_TREE.withChance(0.3F)), PURPLE_CRAPE_MYRTLE_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 5))));

}
