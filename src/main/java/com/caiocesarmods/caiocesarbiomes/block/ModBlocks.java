package com.caiocesarmods.caiocesarbiomes.block;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.block.Saplings.*;
import com.caiocesarmods.caiocesarbiomes.block.custom.*;
import com.caiocesarmods.caiocesarbiomes.block.custom.crops.BlackCurrantCropBlock;
import com.caiocesarmods.caiocesarbiomes.block.custom.crops.FennelCropBlock;
import com.caiocesarmods.caiocesarbiomes.block.custom.crops.RedCurrantCropBlock;
import com.caiocesarmods.caiocesarbiomes.item.ModItemGroup;
import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static List<Block> blocksList = new ArrayList<>();

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, CaioCesarBiomesMod.MOD_ID);

    //Logs
    public static final RegistryObject<Block> AVOCADO_LOG = registerBlock("avocado_log",
            ModLogs::new);
    public static final RegistryObject<Block> COAST_COTTONWOOD_LOG = registerBlock("coast_cottonwood_log",
            ModLogs::new);
    public static final RegistryObject<Block> DRAGON_BLOOD_LOG = registerBlock("dragon_blood_log",
            ModLogs::new);
    public static final RegistryObject<Block> FIG_LOG = registerBlock("fig_log",
            ModLogs::new);
    public static final RegistryObject<Block> ITALIAN_CYPRESS_LOG = registerBlock("italian_cypress_log",
            ModLogs::new);
    public static final RegistryObject<Block> LIVE_OAK_LOG = registerBlock("live_oak_log",
            ModLogs::new);
    public static final RegistryObject<Block> MESQUITE_LOG = registerBlock("mesquite_log",
            ModLogs::new);
    public static final RegistryObject<Block> MYRTLE_LOG = registerBlock("myrtle_log",
            ModLogs::new);
    public static final RegistryObject<Block> OCOTEA_FOREST_LOG = registerBlock("ocotea_forest_log",
            ModLogs::new);
    public static final RegistryObject<Block> OCOTEA_JUNGLE_LOG = registerBlock("ocotea_jungle_log",
            ModLogs::new);
    public static final RegistryObject<Block> OLEANDER_LOG = registerBlock("oleander_log",
            ModLogs::new);
    public static final RegistryObject<Block> POMEGRANATE_LOG = registerBlock("pomegranate_log",
            ModLogs::new);
    public static final RegistryObject<Block> SOUTHERN_MAGNOLIA_LOG = registerBlock("southern_magnolia_log",
            ModLogs::new);
    public static final RegistryObject<Block> TROPICAL_ALMOND_LOG = registerBlock("tropical_almond_log",
            ModLogs::new);
    public static final RegistryObject<Block> HOLM_OAK_LOG = registerBlock("holm_oak_log",
            ModLogs::new);
    public static final RegistryObject<Block> CORK_OAK_LOG = registerBlock("cork_oak_log",
            ModLogs::new);
    public static final RegistryObject<Block> STONE_PINE_LOG = registerBlock("stone_pine_log",
            ModLogs::new);
    public static final RegistryObject<Block> BLACK_POPLAR_LOG = registerBlock("black_poplar_log",
            ModLogs::new);
    public static final RegistryObject<Block> OLIVE_LOG = registerBlock("olive_log",
            ModLogs::new);
    public static final RegistryObject<Block> ERYTHRINA_LOG = registerBlock("erythrina_log",
            ModLogs::new);
    public static final RegistryObject<Block> CRABAPPLE_LOG = registerBlock("crabapple_log",
            ModLogs::new);
    public static final RegistryObject<Block> LOQUAT_LOG = registerBlock("loquat_log",
            ModLogs::new);
    public static final RegistryObject<Block> ELDERBERRY_LOG = registerBlock("elderberry_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRAWBERRY_TREE_LOG = registerBlock("strawberry_tree_log",
            ModLogs::new);
    public static final RegistryObject<Block> JAPANESE_MAPLE_LOG = registerBlock("japanese_maple_log",
            ModLogs::new);
    public static final RegistryObject<Block> MULBERRY_LOG = registerBlock("mulberry_log",
            ModLogs::new);
    public static final RegistryObject<Block> STARFRUIT_LOG = registerBlock("starfruit_log",
            ModLogs::new);
    public static final RegistryObject<Block> CAMELLIA_LOG = registerBlock("camellia_log",
            ModLogs::new);
    public static final RegistryObject<Block> CITRUS_LOG = registerBlock("citrus_log",
            ModLogs::new);
    public static final RegistryObject<Block> ROYAL_POINCIANA_LOG = registerBlock("royal_poinciana_log",
            ModLogs::new);
    public static final RegistryObject<Block> TAMARIND_LOG = registerBlock("tamarind_log",
            ModLogs::new);
    public static final RegistryObject<Block> EUCALYPTUS_LOG = registerBlock("eucalyptus_log",
            ModLogs::new);
    public static final RegistryObject<Block> POHUTUKAWA_LOG = registerBlock("pohutukawa_log",
            ModLogs::new);
    public static final RegistryObject<Block> CASUARINA_LOG = registerBlock("casuarina_log",
            ModLogs::new);
    public static final RegistryObject<Block> PLUM_LOG = registerBlock("plum_log",
            ModLogs::new);
    public static final RegistryObject<Block> NOTHOFAGUS_LOG = registerBlock("nothofagus_log",
            ModLogs::new);
    public static final RegistryObject<Block> ARAUCARIA_LOG = registerBlock("araucaria_log",
            ModLogs::new);
    public static final RegistryObject<Block> JUNGLE_FIG_LOG = registerBlock("jungle_fig_log",
            ModLogs::new);
    public static final RegistryObject<Block> ILEX_LOG = registerBlock("ilex_log",
            ModLogs::new);
    public static final RegistryObject<Block> BEECH_LOG = registerBlock("beech_log",
            ModLogs::new);
    public static final RegistryObject<Block> WESTERN_HEMLOCK_LOG = registerBlock("western_hemlock_log",
            ModLogs::new);
    public static final RegistryObject<Block> YEW_LOG = registerBlock("yew_log",
            ModLogs::new);
    public static final RegistryObject<Block> SOCOTRA_DESERT_ROSE_LOG = registerBlock("socotra_desert_rose_log",
            ModLogs::new);
    public static final RegistryObject<Block> JAPANESE_PINE_LOG = registerBlock("japanese_pine_log",
            ModLogs::new);
    
    //Planks
    public static final RegistryObject<Block> AVOCADO_PLANKS = registerBlock("avocado_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> COAST_COTTONWOOD_PLANKS = registerBlock("coast_cottonwood_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> FIG_PLANKS = registerBlock("fig_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> ITALIAN_CYPRESS_PLANKS = registerBlock("italian_cypress_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> LIVE_OAK_PLANKS = registerBlock("live_oak_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> MESQUITE_PLANKS = registerBlock("mesquite_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> MYRTLE_PLANKS = registerBlock("myrtle_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> OCOTEA_PLANKS = registerBlock("ocotea_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> OLEANDER_PLANKS = registerBlock("oleander_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> POMEGRANATE_PLANKS = registerBlock("pomegranate_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> SOUTHERN_MAGNOLIA_PLANKS = registerBlock("southern_magnolia_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> TROPICAL_ALMOND_PLANKS = registerBlock("tropical_almond_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> HOLM_OAK_PLANKS = registerBlock("holm_oak_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> CORK_OAK_PLANKS = registerBlock("cork_oak_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> PINE_PLANKS = registerBlock("stone_pine_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> OLIVE_PLANKS = registerBlock("olive_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> ERYTHRINA_PLANKS = registerBlock("erythrina_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> CRABAPPLE_PLANKS = registerBlock("crabapple_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> LOQUAT_PLANKS = registerBlock("loquat_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> ELDERBERRY_PLANKS = registerBlock("elderberry_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> STRAWBERRY_TREE_PLANKS = registerBlock("strawberry_tree_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> JAPANESE_MAPLE_PLANKS = registerBlock("japanese_maple_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> MULBERRY_PLANKS = registerBlock("mulberry_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> STARFRUIT_PLANKS = registerBlock("starfruit_planks",
            ModPlanks::new);
     public static final RegistryObject<Block> ROYAL_POINCIANA_PLANKS = registerBlock("royal_poinciana_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> EUCALYPTUS_PLANKS = registerBlock("eucalyptus_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> PLUM_PLANKS = registerBlock("plum_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> TAMARIND_PLANKS = registerBlock("tamarind_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> POHUTUKAWA_PLANKS = registerBlock("pohutukawa_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> CAMELLIA_PLANKS = registerBlock("camellia_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> CASUARINA_PLANKS = registerBlock("casuarina_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> NOTHOFAGUS_PLANKS = registerBlock("nothofagus_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> ARAUCARIA_PLANKS = registerBlock("araucaria_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> CITRUS_PLANKS = registerBlock("citrus_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> BLACK_POPLAR_PLANKS = registerBlock("black_poplar_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> BEECH_PLANKS = registerBlock("beech_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> WESTERN_HEMLOCK_PLANKS = registerBlock("western_hemlock_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> YEW_PLANKS = registerBlock("yew_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> PLANE_PLANKS = registerBlock("plane_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> ILEX_PLANKS = registerBlock("ilex_planks",
            ModPlanks::new);

    //Leaves
    public static final RegistryObject<Block> AVOCADO_LEAVES = registerBlock("avocado_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> COAST_COTTONWOOD_LEAVES = registerBlock("coast_cottonwood_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> DRAGON_BLOOD_LEAVES = registerBlock("dragon_blood_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> FIG_LEAVES = registerBlock("fig_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> ITALIAN_CYPRESS_LEAVES = registerBlock("italian_cypress_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> MESQUITE_LEAVES = registerBlock("mesquite_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> LIVE_OAK_LEAVES = registerBlock("live_oak_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> OCOTEA_LEAVES = registerBlock("ocotea_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> OLEANDER_DARK_PINK_LEAVES = registerBlock("oleander_dark_pink_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> OLEANDER_PINK_LEAVES = registerBlock("oleander_pink_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> OLEANDER_RED_LEAVES = registerBlock("oleander_red_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> OLEANDER_WHITE_LEAVES = registerBlock("oleander_white_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> POMEGRANATE_LEAVES = registerBlock("pomegranate_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> SOUTHERN_MAGNOLIA_LEAVES = registerBlock("southern_magnolia_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> TROPICAL_ALMOND_LEAVES = registerBlock("tropical_almond_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> HOLM_OAK_LEAVES = registerBlock("holm_oak_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> CORK_OAK_LEAVES = registerBlock("cork_oak_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> STONE_PINE_LEAVES = registerBlock("stone_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> BLACK_POPLAR_LEAVES = registerBlock("black_poplar_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> OLIVE_LEAVES = registerBlock("olive_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> INDIAN_CORAL_LEAVES = registerBlock("indian_coral_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> RED_CRAPE_MYRTLE_LEAVES = registerBlock("crape_myrtle_red_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> WHITE_CRAPE_MYRTLE_LEAVES = registerBlock("crape_myrtle_white_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> PURPLE_CRAPE_MYRTLE_LEAVES = registerBlock("crape_myrtle_purple_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> PINK_CRAPE_MYRTLE_LEAVES = registerBlock("crape_myrtle_pink_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> SOUTHERN_WAX_MYRTLE_LEAVES = registerBlock("southern_wax_myrtle_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> PINK_CRABAPPLE_LEAVES = registerBlock("crabapple_pink_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> WHITE_CRABAPPLE_LEAVES = registerBlock("crabapple_white_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> LOQUAT_LEAVES = registerBlock("loquat_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> ELDERBERRY_LEAVES = registerBlock("elderberry_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> BLUE_SPRUCE_LEAVES = registerBlock("blue_spruce_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> STRAWBERRY_TREE_LEAVES = registerBlock("strawberry_tree_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> JAPANESE_MAPLE_LEAVES = registerBlock("japanese_maple_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> RED_KAPOK_LEAVES = registerBlock("red_kapok_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> MULBERRY_LEAVES = registerBlock("mulberry_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> STARFRUIT_LEAVES = registerBlock("starfruit_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> CAMELLIA_LEAVES = registerBlock("camellia_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> TEA_LEAVES = registerBlock("tea_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> ORANGE_LEAVES = registerBlock("orange_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> MANDARIN_LEAVES = registerBlock("mandarin_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> LEMON_LEAVES = registerBlock("lemon_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> CITRON_LEAVES = registerBlock("citron_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> TAHITI_LIME_LEAVES = registerBlock("tahiti_lime_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> BUDDHA_HAND_LEAVES = registerBlock("buddha_hand_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> GRAPEFRUIT_LEAVES = registerBlock("grapefruit_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> ROYAL_POINCIANA_LEAVES = registerBlock("royal_poinciana_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> TAMARIND_LEAVES = registerBlock("tamarind_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> EUCALYPTUS_LEAVES = registerBlock("eucalyptus_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> POHUTUKAWA_LEAVES = registerBlock("pohutukawa_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> CASUARINA_LEAVES = registerBlock("casuarina_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> CHERRY_PLUM_LEAVES = registerBlock("cherry_plum_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> SOUTHERN_BEECH_LEAVES = registerBlock("southern_beech_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> COOK_PINE_LEAVES = registerBlock("cook_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> NORFOLK_PINE_LEAVES = registerBlock("norfolk_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> MONKEY_PUZZLE_LEAVES = registerBlock("monkey_puzzle_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> BUNYA_PINE_LEAVES = registerBlock("bunya_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> WEEPING_FIG_LEAVES = registerBlock("weeping_fig_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> INDIAN_LAUREL_LEAVES = registerBlock("indian_laurel_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> HOLLY_LEAVES = registerBlock("holly_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> WESTERN_HEMLOCK_LEAVES = registerBlock("western_hemlock_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> RED_OAK_LEAVES = registerBlock("red_oak_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> YEW_LEAVES = registerBlock("yew_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> COOPER_BEECH_LEAVES = registerBlock("cooper_beech_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> SYCAMORE_FIG_LEAVES = registerBlock("sycamore_fig_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> SOCOTRA_DESERT_ROSE_LEAVES = registerBlock("socotra_desert_rose_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> JAPANESE_PINE_LEAVES = registerBlock("japanese_pine_leaves",
            ModLeaves::new);

    //Saplings
    public static final RegistryObject<Block> AVOCADO_SAPLING = registerBlock("avocado_sapling",
            AvocadoSapling::new);
    public static final RegistryObject<Block> HOLM_OAK_SAPLING = registerBlock("holm_oak_sapling",
            HolmOakSapling::new);
    public static final RegistryObject<Block> CORK_OAK_SAPLING = registerBlock("cork_oak_sapling",
            CorkOakSapling::new);
    public static final RegistryObject<Block> COAST_COTTONWOOD_SAPLING = registerBlock("coast_cottonwood_sapling",
            CoastCottonwoodSapling::new);
    public static final RegistryObject<Block> OCOTEA_FOREST_SAPLING = registerBlock("ocotea_forest_sapling",
            OcoteaForestSapling::new);
    public static final RegistryObject<Block> OCOTEA_JUNGLE_SAPLING = registerBlock("ocotea_jungle_sapling",
            OcoteaJungleSapling::new);
    public static final RegistryObject<Block> OLEANDER_RED_SAPLING = registerBlock("oleander_red_sapling",
            RedOleanderSapling::new);
    public static final RegistryObject<Block> OLEANDER_WHITE_SAPLING = registerBlock("oleander_white_sapling",
            WhiteOleanderSapling::new);
    public static final RegistryObject<Block> OLEANDER_PINK_SAPLING = registerBlock("oleander_pink_sapling",
            PinkOleanderSapling::new);
    public static final RegistryObject<Block> OLEANDER_DARK_PINK_SAPLING = registerBlock("oleander_dark_pink_sapling",
            DarkPinkOleanderSapling::new);
    public static final RegistryObject<Block> MESQUITE_SAPLING = registerBlock("mesquite_sapling",
            MesquiteSapling::new);
    public static final RegistryObject<Block> FIG_SAPLING = registerBlock("fig_sapling",
            FigSapling::new);
    public static final RegistryObject<Block> OLIVE_SAPLING = registerBlock("olive_sapling",
            OliveSapling::new);
    public static final RegistryObject<Block> TROPICAL_ALMOND_SAPLING = registerBlock("tropical_almond_sapling",
            TropicalAlmondSapling::new);
    public static final RegistryObject<Block> SOUTHERN_MAGNOLIA_SAPLING = registerBlock("southern_magnolia_sapling",
            SouthernMagnoliaSapling::new);
    public static final RegistryObject<Block> POMEGRANATE_SAPLING = registerBlock("pomegranate_sapling",
            PomegranateSapling::new);
    public static final RegistryObject<Block> STONE_PINE_SAPLING = registerBlock("stone_pine_sapling",
            StonePineSapling::new);
    public static final RegistryObject<Block> SOUTHERN_WAX_MYRTLE_SAPLING = registerBlock("southern_wax_myrtle_sapling",
            SouthernWaxMyrtleSapling::new);
    public static final RegistryObject<Block> RED_CRAPE_MYRTLE_SAPLING = registerBlock("crape_myrtle_red_sapling",
            RedCrapeMyrtleSapling::new);
    public static final RegistryObject<Block> PURPLE_CRAPE_MYRTLE_SAPLING = registerBlock("crape_myrtle_purple_sapling",
            PurpleCrapeMyrtleSapling::new);
    public static final RegistryObject<Block> WHITE_CRAPE_MYRTLE_SAPLING = registerBlock("crape_myrtle_white_sapling",
            WhiteCrapeMyrtleSapling::new);
    public static final RegistryObject<Block> PINK_CRAPE_MYRTLE_SAPLING = registerBlock("crape_myrtle_pink_sapling",
            PinkCrapeMyrtleSapling::new);
    public static final RegistryObject<Block> INDIAN_CORAL_SAPLING = registerBlock("indian_coral_sapling",
            IndianCoralSapling::new);
    public static final RegistryObject<Block> PINK_CRABAPPLE_SAPLING = registerBlock("crabapple_pink_sapling",
            PinkCrabappleSapling::new);
    public static final RegistryObject<Block> WHITE_CRABAPPLE_SAPLING = registerBlock("crabapple_white_sapling",
            WhiteCrabappleSapling::new);
    public static final RegistryObject<Block> LOQUAT_SAPLING = registerBlock("loquat_sapling",
            LoquatSapling::new);
    public static final RegistryObject<Block> ELDERBERRY_SAPLING = registerBlock("elderberry_sapling",
            ElderberrySapling::new);
    public static final RegistryObject<Block> BLUE_SPRUCE_SAPLING = registerBlock("blue_spruce_sapling",
            BlueSpruceSapling::new);
    public static final RegistryObject<Block> STRAWBERRY_TREE_SAPLING = registerBlock("strawberry_tree_sapling",
            StrawberryTreeSapling::new);
    public static final RegistryObject<Block> ITALIAN_CYPRESS_SAPLING = registerBlock("italian_cypress_sapling",
            ItalianCypressSapling::new);
    public static final RegistryObject<Block> JAPANESE_MAPLE_SAPLING = registerBlock("japanese_maple_sapling",
            JapaneseMapleSapling::new);
    public static final RegistryObject<Block> RED_KAPOK_SAPLING = registerBlock("red_kapok_sapling",
            RedKapokSapling::new);
    public static final RegistryObject<Block> MULBERRY_SAPLING = registerBlock("mulberry_sapling",
            MulberrySapling::new);
    public static final RegistryObject<Block> STARFRUIT_SAPLING = registerBlock("starfruit_sapling",
            StarfruitSapling::new);
    public static final RegistryObject<Block> ROYAL_POINCIANA_SAPLING = registerBlock("royal_poinciana_sapling",
            RoyalPoincianaSapling::new);
    public static final RegistryObject<Block> TAMARIND_SAPLING = registerBlock("tamarind_sapling",
            TamarindSapling::new);
    public static final RegistryObject<Block> EUCALYPTUS_SAPLING = registerBlock("eucalyptus_sapling",
            EucalyptusSapling::new);
    public static final RegistryObject<Block> POHUTUKAWA_SAPLING = registerBlock("pohutukawa_sapling",
            PohutukawaSapling::new);
    public static final RegistryObject<Block> CHERRY_PLUM_SAPLING = registerBlock("cherry_plum_sapling",
            CherryPlumSapling::new);
    public static final RegistryObject<Block> LEMON_SAPLING = registerBlock("lemon_sapling",
            LemonSapling::new);
    public static final RegistryObject<Block> ORANGE_SAPLING = registerBlock("orange_sapling",
            OrangeSapling::new);
    public static final RegistryObject<Block> MANDARIN_SAPLING = registerBlock("mandarin_sapling",
            MandarinSapling::new);
    public static final RegistryObject<Block> CAMELLIA_SAPLING = registerBlock("camellia_sapling",
            CamelliaSapling::new);
    public static final RegistryObject<Block> TEA_SAPLING = registerBlock("tea_sapling",
            TeaSapling::new);
    public static final RegistryObject<Block> CASUARINA_SAPLING = registerBlock("casuarina_sapling",
            CasuarinaSapling::new);
    public static final RegistryObject<Block> BLACK_POPLAR_SAPLING = registerBlock("black_poplar_sapling",
            BlackPoplarSapling::new);
    public static final RegistryObject<Block> SOUTHERN_BEECH_SAPLING = registerBlock("southern_beech_sapling",
            SouthernBeechSapling::new);
    public static final RegistryObject<Block> MONKEY_PUZZLE_SAPLING = registerBlock("monkey_puzzle_sapling",
            MonkeyPuzzleSapling::new);
    public static final RegistryObject<Block> COOK_PINE_SAPLING = registerBlock("cook_pine_sapling",
            CookPineSapling::new);
    public static final RegistryObject<Block> NORFOLK_PINE_SAPLING = registerBlock("norfolk_pine_sapling",
            NorfolkPineSapling::new);
    public static final RegistryObject<Block> BUNYA_PINE_SAPLING = registerBlock("bunya_pine_sapling",
            BunyaPineSapling::new);
    public static final RegistryObject<Block> WEEPING_FIG_SAPLING = registerBlock("weeping_fig_sapling",
            WeepingFigSapling::new);
    public static final RegistryObject<Block> INDIAN_LAUREL_SAPLING = registerBlock("indian_laurel_sapling",
            IndianLaurelSapling::new);
    public static final RegistryObject<Block> BUDDHA_HAND_SAPLING = registerBlock("buddha_hand_sapling",
            BuddhaHandSapling::new);
    public static final RegistryObject<Block> CITRON_SAPLING = registerBlock("citron_sapling",
            CitronSapling::new);
    public static final RegistryObject<Block> TAHITI_LIME_SAPLING = registerBlock("tahiti_lime_sapling",
            TahitiLimeSapling::new);
    public static final RegistryObject<Block> GRAPEFRUIT_SAPLING = registerBlock("grapefruit_sapling",
            GrapefruitSapling::new);
    public static final RegistryObject<Block> HOLLY_SAPLING = registerBlock("holly_sapling",
            HollySapling::new);
    public static final RegistryObject<Block> YEW_SAPLING = registerBlock("yew_sapling",
            YewSapling::new);
    public static final RegistryObject<Block> DRAGON_BLOOD_SAPLING = registerBlock("dragon_blood_sapling",
            DragonBloodSapling::new);
    public static final RegistryObject<Block> WESTERN_HEMLOCK_SAPLING = registerBlock("western_hemlock_sapling",
            WesternHemlockSapling::new);
    public static final RegistryObject<Block> LIVE_OAK_SAPLING = registerBlock("live_oak_sapling",
            LiveOakSapling::new);
    public static final RegistryObject<Block> COOPER_BEECH_SAPLING = registerBlock("cooper_beech_sapling",
            CooperBeechSapling::new);
    public static final RegistryObject<Block> RED_OAK_SAPLING = registerBlock("red_oak_sapling",
            RedOakSapling::new);
    public static final RegistryObject<Block> SOCOTRA_DESERT_ROSE_SAPLING = registerBlock("socotra_desert_rose_sapling",
            SocotraDesertRoseSapling::new);
    public static final RegistryObject<Block> JAPANESE_PINE_SAPLING = registerBlock("japanese_pine_sapling",
            JapanesePineSapling::new);

    //Tall Plants
    public static final RegistryObject<Block> DESERT_ROSE_PLANT = registerBlock("desert_rose_plant",
            DesertRosePlant::new);
    public static final RegistryObject<Block> GARDENIA_BUSH = registerBlock("gardenia_bush",
            ModTallPlant::new);
    public static final RegistryObject<Block> CHINESE_HIBISCUS = registerBlock("chinese_hibiscus",
            ModTallPlant::new);
    public static final RegistryObject<Block> BAY_LAUREL = registerBlock("bay_laurel",
            ModTallPlant::new);
    public static final RegistryObject<Block> BAY_LAUREL_FLOWERING = registerBlock("bay_laurel_flowering",
            ModTallPlant::new);

    //Vines
    public static final RegistryObject<Block> CREEPING_FIG_VINE = registerBlock("creeping_fig_vine",
            CreepingFigVine::new);
    public static final RegistryObject<Block> CREEPING_FIG_FRUITING_VINE = registerBlock("creeping_fig_fruiting_vine",
            CreepingFigVine::new);
    public static final RegistryObject<Block> SPANISH_MOSS = registerBlock("spanish_moss",
            SpanishMoss::new);
    public static final RegistryObject<Block> FICUS_ROOTS = registerBlock("ficus_roots",
            () -> new FicusRootsBlock(AbstractBlock.Properties.create(Material.PLANTS, MaterialColor.BROWN).tickRandomly().
                    doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.VINE)));
    public static final RegistryObject<Block> FICUS_ROOTS_PLANT = registerBlock("ficus_roots_plant",
            () -> new FicusRootsPlantBlock(AbstractBlock.Properties.create(Material.PLANTS, MaterialColor.BROWN).tickRandomly().
                    doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.VINE)));

    //Crops
    public static final  RegistryObject<Block> RED_CURRANT_CROP = BLOCKS.register("red_currant_crop",
            () -> new RedCurrantCropBlock(AbstractBlock.Properties.from(Blocks.WHEAT).sound(SoundType.CROP)));
    public static final  RegistryObject<Block> BLACK_CURRANT_CROP = BLOCKS.register("black_currant_crop",
            () -> new BlackCurrantCropBlock(AbstractBlock.Properties.from(Blocks.WHEAT).sound(SoundType.CROP)));
    public static final  RegistryObject<Block> FENNEL_CROP = BLOCKS.register("fennel_crop",
            () -> new FennelCropBlock(AbstractBlock.Properties.from(Blocks.WHEAT).sound(SoundType.CROP)));

    //Plants
    public static final RegistryObject<Block> BUSH = registerBlock("bush",
            SubtropicalForestPlant::new);
    public static final RegistryObject<Block> ANIS = registerBlock("anis",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> BASIL = registerBlock("basil",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> PURPLE_BASIL = registerBlock("purple_basil",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> CINERARIA = registerBlock("cineraria",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> FENNEL = registerBlock("fennel",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> LAVENDER = registerBlock("lavender",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> MARJORAN = registerBlock("marjoran",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> OREGANO = registerBlock("oregano",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> ROSEMARY = registerBlock("rosemary",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> SAGE = registerBlock("sage",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> SANTOLINA = registerBlock("santolina",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> THYME = registerBlock("thyme",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> AGAPANTHUS_PURPLE = registerBlock("agapanthus_purple",
            SubtropicalForestPlant::new);
    public static final RegistryObject<Block> AGAPANTHUS_WHITE = registerBlock("agapanthus_white",
            SubtropicalForestPlant::new);
    public static final RegistryObject<Block> TUSSOCK_GRASS = registerBlock("tussock_grass",
            ModGrasses::new);
    public static final RegistryObject<Block> WHITE_CISTUS = registerBlock("white_cistus",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> PINK_CISTUS = registerBlock("pink_cistus",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> RED_CURRANT_SHRUB = registerBlock("red_currant_shrub",
            RibesShrub::new);
    public static final RegistryObject<Block> BLACK_CURRANT_SHRUB = registerBlock("black_currant_shrub",
            RibesShrub::new);
    public static final RegistryObject<Block> AZALEA_PURPLE = registerBlock("azalea_purple",
            SubtropicalForestPlant::new);
    public static final RegistryObject<Block> AZALEA_RED = registerBlock("azalea_red",
            SubtropicalForestPlant::new);
    public static final RegistryObject<Block> AZALEA_PINK = registerBlock("azalea_pink",
            SubtropicalForestPlant::new);
    public static final RegistryObject<Block> AZALEA_ORANGE = registerBlock("azalea_orange",
            SubtropicalForestPlant::new);
    public static final RegistryObject<Block> AZALEA_MAGENTA = registerBlock("azalea_magenta",
            SubtropicalForestPlant::new);
    public static final RegistryObject<Block> AZALEA_GREEN = registerBlock("azalea_green",
            SubtropicalForestPlant::new);
    public static final RegistryObject<Block> AZALEA_WHITE = registerBlock("azalea_white",
            SubtropicalForestPlant::new);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.CCB_GROUP)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}



