package com.caiocesarmods.caiocesarbiomes.block;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.block.Saplings.*;
import com.caiocesarmods.caiocesarbiomes.block.custom.*;
import com.caiocesarmods.caiocesarbiomes.block.custom.crops.BlackCurrantCropBlock;
import com.caiocesarmods.caiocesarbiomes.block.custom.crops.FennelCropBlock;
import com.caiocesarmods.caiocesarbiomes.block.custom.crops.RedCurrantCropBlock;
import com.caiocesarmods.caiocesarbiomes.block.custom.leaves.*;
import com.caiocesarmods.caiocesarbiomes.item.ModItemGroup;
import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import static net.minecraft.block.Blocks.AIR;

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
    public static final RegistryObject<Block> SOCOTRA_CUCUMBER_LOG = registerBlock("socotra_cucumber_log",
            ModLogs::new);
    public static final RegistryObject<Block> DATE_LOG = registerBlock("date_log",
            ModLogs::new);
    public static final RegistryObject<Block> CANARY_DATE_LOG = registerBlock("canary_date_log",
            ModLogs::new);
    public static final RegistryObject<Block> SABAL_LOG = registerBlock("sabal_log",
            ModLogs::new);
    public static final RegistryObject<Block> COCONUT_LOG = registerBlock("coconut_log",
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
    public static final RegistryObject<Block> ILEX_PLANKS = registerBlock("ilex_planks",
            ModPlanks::new);

    //Leaves
    public static final RegistryObject<Block> AVOCADO_LEAVES = registerBlock("avocado_leaves",
            AvocadoLeaves::new);
    public static final RegistryObject<Block> COAST_COTTONWOOD_LEAVES = registerBlock("coast_cottonwood_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> DRAGON_BLOOD_LEAVES = registerBlock("dragon_blood_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> SOCOTRA_CUCUMBER_LEAVES = registerBlock("socotra_cucumber_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> CANARY_DATE_LEAVES = registerBlock("canary_date_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> SABAL_LEAVES = registerBlock("sabal_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> COCONUT_LEAVES = registerBlock("coconut_leaves",
            ModLeaves::new);

    public static final RegistryObject<Block> FIG_LEAVES = registerBlock("fig_leaves",
            FigLeaves::new);
    public static final RegistryObject<Block> WHITE_FIG_LEAVES = registerBlock("white_fig_leaves",
            WhiteFigLeaves::new);

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
            () -> new PomegranateLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.POMEGRANATE_FLOWERING_LEAVES));
    public static final RegistryObject<Block> POMEGRANATE_FLOWERING_LEAVES = registerBlock("pomegranate_flowering_leaves",
            () -> new PomegranateFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.POMEGRANATE_FRUITING_LEAVES));
    public static final RegistryObject<Block> POMEGRANATE_FRUITING_LEAVES = registerBlock("pomegranate_fruiting_leaves",
            () -> new PomegranateFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.POMEGRANATE_LEAVES));

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
            () -> new OliveLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.OLIVE_FRUITING_LEAVES));
    public static final RegistryObject<Block> OLIVE_FRUITING_LEAVES = registerBlock("olive_fruiting_leaves",
            () -> new OliveFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.OLIVE_LEAVES));

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
            () -> new LoquatLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.LOQUAT_FLOWERING_LEAVES));
    public static final RegistryObject<Block> LOQUAT_FLOWERING_LEAVES = registerBlock("loquat_flowering_leaves",
            () -> new LoquatFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.LOQUAT_FRUITING_LEAVES));
    public static final RegistryObject<Block> LOQUAT_FRUITING_LEAVES = registerBlock("loquat_fruiting_leaves",
            () -> new LoquatFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.LOQUAT_LEAVES));

    public static final RegistryObject<Block> ELDERBERRY_LEAVES = registerBlock("elderberry_leaves",
            () -> new ElderberryLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.ELDERBERRY_FLOWERING_LEAVES));
    public static final RegistryObject<Block> ELDERBERRY_FLOWERING_LEAVES = registerBlock("elderberry_flowering_leaves",
            () -> new ElderberryFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.ELDERBERRY_FRUITING_LEAVES));
    public static final RegistryObject<Block> ELDERBERRY_FRUITING_LEAVES = registerBlock("elderberry_fruiting_leaves",
            () -> new ElderberryFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.ELDERBERRY_LEAVES));

    public static final RegistryObject<Block> STRAWBERRY_TREE_LEAVES = registerBlock("strawberry_tree_leaves",
            StrawberryTreeLeaves::new);

    public static final RegistryObject<Block> JAPANESE_MAPLE_LEAVES = registerBlock("japanese_maple_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> RED_KAPOK_LEAVES = registerBlock("red_kapok_leaves",
            ModLeaves::new);

    public static final RegistryObject<Block> MULBERRY_LEAVES = registerBlock("mulberry_leaves",
            () -> new MulberryLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.MULBERRY_FRUITING_LEAVES));
    public static final RegistryObject<Block> MULBERRY_FRUITING_LEAVES = registerBlock("mulberry_fruiting_leaves",
            () -> new MulberryFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.MULBERRY_LEAVES));

    public static final RegistryObject<Block> STARFRUIT_LEAVES = registerBlock("starfruit_leaves",
            () -> new StarfruitLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.STARFRUIT_FLOWERING_LEAVES));
    public static final RegistryObject<Block> STARFRUIT_FLOWERING_LEAVES = registerBlock("starfruit_flowering_leaves",
            () -> new StarfruitFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.STARFRUIT_FRUITING_LEAVES));
    public static final RegistryObject<Block> STARFRUIT_FRUITING_LEAVES = registerBlock("starfruit_fruiting_leaves",
            () -> new StarfruitFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.STARFRUIT_LEAVES));

    public static final RegistryObject<Block> CAMELLIA_LEAVES = registerBlock("camellia_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> TEA_LEAVES = registerBlock("tea_leaves",
            ModLeaves::new);

    public static final RegistryObject<Block> ORANGE_LEAVES = registerBlock("orange_leaves",
            () -> new OrangeLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.ORANGE_FLOWERING_LEAVES));
    public static final RegistryObject<Block> ORANGE_FLOWERING_LEAVES = registerBlock("orange_flowering_leaves",
            () -> new OrangeFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.ORANGE_FRUITING_LEAVES));
    public static final RegistryObject<Block> ORANGE_FRUITING_LEAVES = registerBlock("orange_fruiting_leaves",
            () -> new OrangeFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.ORANGE_LEAVES));

    public static final RegistryObject<Block> MANDARIN_LEAVES = registerBlock("mandarin_leaves",
            () -> new MandarinLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.MANDARIN_FLOWERING_LEAVES));
    public static final RegistryObject<Block> MANDARIN_FLOWERING_LEAVES = registerBlock("mandarin_flowering_leaves",
            () -> new MandarinFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.MANDARIN_FRUITING_LEAVES));
    public static final RegistryObject<Block> MANDARIN_FRUITING_LEAVES = registerBlock("mandarin_fruiting_leaves",
            () -> new MandarinFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.MANDARIN_LEAVES));

    public static final RegistryObject<Block> LEMON_LEAVES = registerBlock("lemon_leaves",
            () -> new LemonLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.LEMON_FLOWERING_LEAVES));
    public static final RegistryObject<Block> LEMON_FLOWERING_LEAVES = registerBlock("lemon_flowering_leaves",
            () -> new LemonFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.LEMON_FRUITING_LEAVES));
    public static final RegistryObject<Block> LEMON_FRUITING_LEAVES = registerBlock("lemon_fruiting_leaves",
            () -> new LemonFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.LEMON_LEAVES));

    public static final RegistryObject<Block> CITRON_LEAVES = registerBlock("citron_leaves",
            () -> new CitronLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.CITRON_FLOWERING_LEAVES));
    public static final RegistryObject<Block> CITRON_FLOWERING_LEAVES = registerBlock("citron_flowering_leaves",
            () -> new CitronFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.CITRON_FRUITING_LEAVES));
    public static final RegistryObject<Block> CITRON_FRUITING_LEAVES = registerBlock("citron_fruiting_leaves",
            () -> new CitronFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.CITRON_LEAVES));

    public static final RegistryObject<Block> TAHITI_LIME_LEAVES = registerBlock("tahiti_lime_leaves",
            () -> new TahitiLimeLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.TAHITI_LIME_FLOWERING_LEAVES));
    public static final RegistryObject<Block> TAHITI_LIME_FLOWERING_LEAVES = registerBlock("tahiti_lime_flowering_leaves",
            () -> new TahitiLimeFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.TAHITI_LIME_FRUITING_LEAVES));
    public static final RegistryObject<Block> TAHITI_LIME_FRUITING_LEAVES = registerBlock("tahiti_lime_fruiting_leaves",
            () -> new TahitiLimeFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.TAHITI_LIME_LEAVES));

    public static final RegistryObject<Block> BUDDHA_HAND_LEAVES = registerBlock("buddha_hand_leaves",
            () -> new BuddhaHandLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.BUDDHA_HAND_FLOWERING_LEAVES));
    public static final RegistryObject<Block> BUDDHA_HAND_FLOWERING_LEAVES = registerBlock("buddha_hand_flowering_leaves",
            () -> new BuddhaHandFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.BUDDHA_HAND_FRUITING_LEAVES));
    public static final RegistryObject<Block> BUDDHA_HAND_FRUITING_LEAVES = registerBlock("buddha_hand_fruiting_leaves",
            () -> new BuddhaHandFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.BUDDHA_HAND_LEAVES));

    public static final RegistryObject<Block> GRAPEFRUIT_LEAVES = registerBlock("grapefruit_leaves",
            () -> new GrapefruitLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.GRAPEFRUIT_FLOWERING_LEAVES));
    public static final RegistryObject<Block> GRAPEFRUIT_FLOWERING_LEAVES = registerBlock("grapefruit_flowering_leaves",
            () -> new GrapefruitFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.GRAPEFRUIT_FRUITING_LEAVES));
    public static final RegistryObject<Block> GRAPEFRUIT_FRUITING_LEAVES = registerBlock("grapefruit_fruiting_leaves",
            () -> new GrapefruitFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.GRAPEFRUIT_LEAVES));

    public static final RegistryObject<Block> ROYAL_POINCIANA_LEAVES = registerBlock("royal_poinciana_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> TAMARIND_LEAVES = registerBlock("tamarind_leaves",
            TamarindLeaves::new);
    public static final RegistryObject<Block> EUCALYPTUS_LEAVES = registerBlock("eucalyptus_leaves",
            ModLeaves::new);

    public static final RegistryObject<Block> POHUTUKAWA_LEAVES = registerBlock("pohutukawa_leaves",
            () -> new PohutukawaLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.POHUTUKAWA_FLOWERING_LEAVES));
    public static final RegistryObject<Block> POHUTUKAWA_FLOWERING_LEAVES = registerBlock("pohutukawa_flowering_leaves",
            () -> new PohutukawaFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.POHUTUKAWA_LEAVES));

    public static final RegistryObject<Block> CASUARINA_LEAVES = registerBlock("casuarina_leaves",
            ModLeaves::new);

    public static final RegistryObject<Block> CHERRY_PLUM_LEAVES = registerBlock("cherry_plum_leaves",
            () -> new CherryPlumLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.CHERRY_PLUM_FLOWERING_LEAVES));
    public static final RegistryObject<Block> CHERRY_PLUM_FLOWERING_LEAVES = registerBlock("cherry_plum_flowering_leaves",
            () -> new CherryPlumFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.CHERRY_PLUM_FRUITING_LEAVES));
    public static final RegistryObject<Block> CHERRY_PLUM_FRUITING_LEAVES = registerBlock("cherry_plum_fruiting_leaves",
            () -> new CherryPlumFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModBlocks.CHERRY_PLUM_LEAVES));

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
            YewLeaves::new);
    public static final RegistryObject<Block> COOPER_BEECH_LEAVES = registerBlock("cooper_beech_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> SOCOTRA_DESERT_ROSE_LEAVES = registerBlock("socotra_desert_rose_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> JAPANESE_PINE_LEAVES = registerBlock("japanese_pine_leaves",
            ModLeaves::new);

    //Saplings
    public static final RegistryObject<Block> AVOCADO_SAPLING = registerBlock("avocado_sapling",
            AvocadoSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_AVOCADO_SAPLING = BLOCKS.register("potted_avocado_sapling",
            () -> new FlowerPotBlock(ModBlocks.AVOCADO_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> HOLM_OAK_SAPLING = registerBlock("holm_oak_sapling",
            HolmOakSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_HOLM_OAK_SAPLING = BLOCKS.register("potted_holm_oak_sapling",
            () -> new FlowerPotBlock(ModBlocks.HOLM_OAK_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> CORK_OAK_SAPLING = registerBlock("cork_oak_sapling",
            CorkOakSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_CORK_OAK_SAPLING = BLOCKS.register("potted_cork_oak_sapling",
            () -> new FlowerPotBlock(ModBlocks.CORK_OAK_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> COAST_COTTONWOOD_SAPLING = registerBlock("coast_cottonwood_sapling",
            CoastCottonwoodSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_COAST_COTTONWOOD_SAPLING = BLOCKS.register("potted_coast_cottonwood_sapling",
            () -> new FlowerPotBlock(ModBlocks.COAST_COTTONWOOD_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> OCOTEA_FOREST_SAPLING = registerBlock("ocotea_forest_sapling",
            OcoteaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_OCOTEA_FOREST_SAPLING = BLOCKS.register("potted_ocotea_forest_sapling",
            () -> new FlowerPotBlock(ModBlocks.OCOTEA_FOREST_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> OLEANDER_RED_SAPLING = registerBlock("oleander_red_sapling",
            RedOleanderSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_OLEANDER_RED_SAPLING = BLOCKS.register("potted_oleander_red_sapling",
            () -> new FlowerPotBlock(ModBlocks.OLEANDER_RED_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> OLEANDER_WHITE_SAPLING = registerBlock("oleander_white_sapling",
            WhiteOleanderSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_OLEANDER_WHITE_SAPLING = BLOCKS.register("potted_oleander_white_sapling",
            () -> new FlowerPotBlock(ModBlocks.OLEANDER_WHITE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> OLEANDER_PINK_SAPLING = registerBlock("oleander_pink_sapling",
            PinkOleanderSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_OLEANDER_PINK_SAPLING = BLOCKS.register("potted_oleander_pink_sapling",
            () -> new FlowerPotBlock(ModBlocks.OLEANDER_PINK_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> OLEANDER_DARK_PINK_SAPLING = registerBlock("oleander_dark_pink_sapling",
            DarkPinkOleanderSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_OLEANDER_DARK_PINK_SAPLING = BLOCKS.register("potted_oleander_dark_pink_sapling",
            () -> new FlowerPotBlock(ModBlocks.OLEANDER_DARK_PINK_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> MESQUITE_SAPLING = registerBlock("mesquite_sapling",
            MesquiteSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_MESQUITE_SAPLING = BLOCKS.register("potted_mesquite_sapling",
            () -> new FlowerPotBlock(ModBlocks.MESQUITE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> FIG_SAPLING = registerBlock("fig_sapling",
            FigSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_FIG_SAPLING = BLOCKS.register("potted_fig_sapling",
            () -> new FlowerPotBlock(ModBlocks.FIG_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> OLIVE_SAPLING = registerBlock("olive_sapling",
            OliveSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_OLIVE_SAPLING = BLOCKS.register("potted_olive_sapling",
            () -> new FlowerPotBlock(ModBlocks.OLIVE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> TROPICAL_ALMOND_SAPLING = registerBlock("tropical_almond_sapling",
            TropicalAlmondSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_TROPICAL_ALMOND_SAPLING = BLOCKS.register("potted_tropical_almond_sapling",
            () -> new FlowerPotBlock(ModBlocks.TROPICAL_ALMOND_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> SOUTHERN_MAGNOLIA_SAPLING = registerBlock("southern_magnolia_sapling",
            SouthernMagnoliaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SOUTHERN_MAGNOLIA_SAPLING = BLOCKS.register("potted_southern_magnolia_sapling",
            () -> new FlowerPotBlock(ModBlocks.SOUTHERN_MAGNOLIA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> POMEGRANATE_SAPLING = registerBlock("pomegranate_sapling",
            PomegranateSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_POMEGRANATE_SAPLING = BLOCKS.register("potted_pomegranate_sapling",
            () -> new FlowerPotBlock(ModBlocks.POMEGRANATE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> STONE_PINE_SAPLING = registerBlock("stone_pine_sapling",
            StonePineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_STONE_PINE_SAPLING = BLOCKS.register("potted_stone_pine_sapling",
            () -> new FlowerPotBlock(ModBlocks.STONE_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> SOUTHERN_WAX_MYRTLE_SAPLING = registerBlock("southern_wax_myrtle_sapling",
            SouthernWaxMyrtleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SOUTHERN_WAX_MYRTLE_SAPLING = BLOCKS.register("potted_southern_wax_myrtle_sapling",
            () -> new FlowerPotBlock(ModBlocks.SOUTHERN_WAX_MYRTLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> RED_CRAPE_MYRTLE_SAPLING = registerBlock("crape_myrtle_red_sapling",
            RedCrapeMyrtleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_RED_CRAPE_MYRTLE_SAPLING = BLOCKS.register("potted_crape_myrtle_red_sapling",
            () -> new FlowerPotBlock(ModBlocks.RED_CRAPE_MYRTLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> PURPLE_CRAPE_MYRTLE_SAPLING = registerBlock("crape_myrtle_purple_sapling",
            PurpleCrapeMyrtleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PURPLE_CRAPE_MYRTLE_SAPLING = BLOCKS.register("potted_crape_myrtle_purple_sapling",
            () -> new FlowerPotBlock(ModBlocks.PURPLE_CRAPE_MYRTLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> WHITE_CRAPE_MYRTLE_SAPLING = registerBlock("crape_myrtle_white_sapling",
            WhiteCrapeMyrtleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_WHITE_CRAPE_MYRTLE_SAPLING = BLOCKS.register("potted_crape_myrtle_white_sapling",
            () -> new FlowerPotBlock(ModBlocks.WHITE_CRAPE_MYRTLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> PINK_CRAPE_MYRTLE_SAPLING = registerBlock("crape_myrtle_pink_sapling",
            PinkCrapeMyrtleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PINK_CRAPE_MYRTLE_SAPLING = BLOCKS.register("potted_crape_myrtle_pink_sapling",
            () -> new FlowerPotBlock(ModBlocks.PINK_CRAPE_MYRTLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> INDIAN_CORAL_SAPLING = registerBlock("indian_coral_sapling",
            IndianCoralSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_INDIAN_CORAL_SAPLING = BLOCKS.register("potted_indian_coral_sapling",
            () -> new FlowerPotBlock(ModBlocks.INDIAN_CORAL_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> PINK_CRABAPPLE_SAPLING = registerBlock("crabapple_pink_sapling",
            PinkCrabappleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PINK_CRABAPPLE_SAPLING = BLOCKS.register("potted_crabapple_pink_sapling",
            () -> new FlowerPotBlock(ModBlocks.PINK_CRABAPPLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> WHITE_CRABAPPLE_SAPLING = registerBlock("crabapple_white_sapling",
            WhiteCrabappleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_WHITE_CRABAPPLE_SAPLING = BLOCKS.register("potted_crabapple_white_sapling",
            () -> new FlowerPotBlock(ModBlocks.WHITE_CRABAPPLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> LOQUAT_SAPLING = registerBlock("loquat_sapling",
            LoquatSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_LOQUAT_SAPLING = BLOCKS.register("potted_loquat_sapling",
            () -> new FlowerPotBlock(ModBlocks.LOQUAT_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> ELDERBERRY_SAPLING = registerBlock("elderberry_sapling",
            ElderberrySapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_ELDERBERRY_SAPLING = BLOCKS.register("potted_elderberry_sapling",
            () -> new FlowerPotBlock(ModBlocks.ELDERBERRY_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> STRAWBERRY_TREE_SAPLING = registerBlock("strawberry_tree_sapling",
            StrawberryTreeSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_STRAWBERRY_TREE_SAPLING = BLOCKS.register("potted_strawberry_tree_sapling",
            () -> new FlowerPotBlock(ModBlocks.STRAWBERRY_TREE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> ITALIAN_CYPRESS_SAPLING = registerBlock("italian_cypress_sapling",
            ItalianCypressSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_ITALIAN_CYPRESS_SAPLING = BLOCKS.register("potted_italian_cypress_sapling",
            () -> new FlowerPotBlock(ModBlocks.ITALIAN_CYPRESS_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> JAPANESE_MAPLE_SAPLING = registerBlock("japanese_maple_sapling",
            JapaneseMapleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_JAPANESE_MAPLE_SAPLING = BLOCKS.register("potted_japanese_maple_sapling",
            () -> new FlowerPotBlock(ModBlocks.JAPANESE_MAPLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> RED_KAPOK_SAPLING = registerBlock("red_kapok_sapling",
            RedKapokSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_RED_KAPOK_SAPLING = BLOCKS.register("potted_red_kapok_sapling",
            () -> new FlowerPotBlock(ModBlocks.RED_KAPOK_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> MULBERRY_SAPLING = registerBlock("mulberry_sapling",
            MulberrySapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_MULBERRY_SAPLING = BLOCKS.register("potted_mulberry_sapling",
            () -> new FlowerPotBlock(ModBlocks.MULBERRY_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> STARFRUIT_SAPLING = registerBlock("starfruit_sapling",
            StarfruitSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_STARFRUIT_SAPLING = BLOCKS.register("potted_starfruit_sapling",
            () -> new FlowerPotBlock(ModBlocks.STARFRUIT_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> ROYAL_POINCIANA_SAPLING = registerBlock("royal_poinciana_sapling",
            RoyalPoincianaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_ROYAL_POINCIANA_SAPLING = BLOCKS.register("potted_royal_poinciana_sapling",
            () -> new FlowerPotBlock(ModBlocks.ROYAL_POINCIANA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> TAMARIND_SAPLING = registerBlock("tamarind_sapling",
            TamarindSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_TAMARIND_SAPLING = BLOCKS.register("potted_tamarind_sapling",
            () -> new FlowerPotBlock(ModBlocks.TAMARIND_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> EUCALYPTUS_SAPLING = registerBlock("eucalyptus_sapling",
            EucalyptusSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_EUCALYPTUS_SAPLING = BLOCKS.register("potted_eucalyptus_sapling",
            () -> new FlowerPotBlock(ModBlocks.EUCALYPTUS_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> POHUTUKAWA_SAPLING = registerBlock("pohutukawa_sapling",
            PohutukawaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_POHUTUKAWA_SAPLING = BLOCKS.register("potted_pohutukawa_sapling",
            () -> new FlowerPotBlock(ModBlocks.POHUTUKAWA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> CHERRY_PLUM_SAPLING = registerBlock("cherry_plum_sapling",
            CherryPlumSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_CHERRY_PLUM_SAPLING = BLOCKS.register("potted_cherry_plum_sapling",
            () -> new FlowerPotBlock(ModBlocks.CHERRY_PLUM_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> LEMON_SAPLING = registerBlock("lemon_sapling",
            LemonSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_LEMON_SAPLING = BLOCKS.register("potted_lemon_sapling",
            () -> new FlowerPotBlock(ModBlocks.LEMON_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> ORANGE_SAPLING = registerBlock("orange_sapling",
            OrangeSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_ORANGE_SAPLING = BLOCKS.register("potted_orange_sapling",
            () -> new FlowerPotBlock(ModBlocks.ORANGE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> MANDARIN_SAPLING = registerBlock("mandarin_sapling",
            MandarinSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_MANDARIN_SAPLING = BLOCKS.register("potted_mandarin_sapling",
            () -> new FlowerPotBlock(ModBlocks.MANDARIN_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> CAMELLIA_SAPLING = registerBlock("camellia_sapling",
            CamelliaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_CAMELLIA_SAPLING = BLOCKS.register("potted_camellia_sapling",
            () -> new FlowerPotBlock(ModBlocks.CAMELLIA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> TEA_SAPLING = registerBlock("tea_sapling",
            TeaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_TEA_SAPLING = BLOCKS.register("potted_tea_sapling",
            () -> new FlowerPotBlock(ModBlocks.TEA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> CASUARINA_SAPLING = registerBlock("casuarina_sapling",
            CasuarinaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_CASUARINA_SAPLING = BLOCKS.register("potted_casuarina_sapling",
            () -> new FlowerPotBlock(ModBlocks.CASUARINA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> BLACK_POPLAR_SAPLING = registerBlock("black_poplar_sapling",
            BlackPoplarSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_BLACK_POPLAR_SAPLING = BLOCKS.register("potted_black_poplar_sapling",
            () -> new FlowerPotBlock(ModBlocks.BLACK_POPLAR_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> SOUTHERN_BEECH_SAPLING = registerBlock("southern_beech_sapling",
            SouthernBeechSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SOUTHERN_BEECH_SAPLING = BLOCKS.register("potted_southern_beech_sapling",
            () -> new FlowerPotBlock(ModBlocks.SOUTHERN_BEECH_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> MONKEY_PUZZLE_SAPLING = registerBlock("monkey_puzzle_sapling",
            MonkeyPuzzleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_MONKEY_PUZZLE_SAPLING = BLOCKS.register("potted_monkey_puzzle_sapling",
            () -> new FlowerPotBlock(ModBlocks.MONKEY_PUZZLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> COOK_PINE_SAPLING = registerBlock("cook_pine_sapling",
            CookPineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_COOK_PINE_SAPLING = BLOCKS.register("potted_cook_pine_sapling",
            () -> new FlowerPotBlock(ModBlocks.COOK_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> NORFOLK_PINE_SAPLING = registerBlock("norfolk_pine_sapling",
            NorfolkPineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_NORFOLK_PINE_SAPLING = BLOCKS.register("potted_norfolk_pine_sapling",
            () -> new FlowerPotBlock(ModBlocks.NORFOLK_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> BUNYA_PINE_SAPLING = registerBlock("bunya_pine_sapling",
            BunyaPineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_BUNYA_PINE_SAPLING = BLOCKS.register("potted_bunya_pine_sapling",
            () -> new FlowerPotBlock(ModBlocks.BUNYA_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> WEEPING_FIG_SAPLING = registerBlock("weeping_fig_sapling",
            WeepingFigSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_WEEPING_FIG_SAPLING = BLOCKS.register("potted_weeping_fig_sapling",
            () -> new FlowerPotBlock(ModBlocks.WEEPING_FIG_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> INDIAN_LAUREL_SAPLING = registerBlock("indian_laurel_sapling",
            IndianLaurelSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_INDIAN_LAUREL_SAPLING = BLOCKS.register("potted_indian_laurel_sapling",
            () -> new FlowerPotBlock(ModBlocks.INDIAN_LAUREL_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> BUDDHA_HAND_SAPLING = registerBlock("buddha_hand_sapling",
            BuddhaHandSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_BUDDHA_HAND_SAPLING = BLOCKS.register("potted_buddha_hand_sapling",
            () -> new FlowerPotBlock(ModBlocks.BUDDHA_HAND_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> CITRON_SAPLING = registerBlock("citron_sapling",
            CitronSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_CITRON_SAPLING = BLOCKS.register("potted_citron_sapling",
            () -> new FlowerPotBlock(ModBlocks.CITRON_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> TAHITI_LIME_SAPLING = registerBlock("tahiti_lime_sapling",
            TahitiLimeSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_TAHITI_LIME_SAPLING = BLOCKS.register("potted_tahiti_lime_sapling",
            () -> new FlowerPotBlock(ModBlocks.TAHITI_LIME_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> GRAPEFRUIT_SAPLING = registerBlock("grapefruit_sapling",
            GrapefruitSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_GRAPEFRUIT_SAPLING = BLOCKS.register("potted_grapefruit_sapling",
            () -> new FlowerPotBlock(ModBlocks.GRAPEFRUIT_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> HOLLY_SAPLING = registerBlock("holly_sapling",
            HollySapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_HOLLY_SAPLING = BLOCKS.register("potted_holly_sapling",
            () -> new FlowerPotBlock(ModBlocks.HOLLY_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> YEW_SAPLING = registerBlock("yew_sapling",
            YewSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_YEW_SAPLING = BLOCKS.register("potted_yew_sapling",
            () -> new FlowerPotBlock(ModBlocks.YEW_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> DRAGON_BLOOD_SAPLING = registerBlock("dragon_blood_sapling",
            DragonBloodSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_DRAGON_BLOOD_SAPLING = BLOCKS.register("potted_dragon_blood_sapling",
            () -> new FlowerPotBlock(ModBlocks.DRAGON_BLOOD_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> WESTERN_HEMLOCK_SAPLING = registerBlock("western_hemlock_sapling",
            WesternHemlockSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_WESTERN_HEMLOCK_SAPLING = BLOCKS.register("potted_western_hemlock_sapling",
            () -> new FlowerPotBlock(ModBlocks.WESTERN_HEMLOCK_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> LIVE_OAK_SAPLING = registerBlock("live_oak_sapling",
            LiveOakSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_LIVE_OAK_SAPLING = BLOCKS.register("potted_live_oak_sapling",
            () -> new FlowerPotBlock(ModBlocks.LIVE_OAK_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> COOPER_BEECH_SAPLING = registerBlock("cooper_beech_sapling",
            CooperBeechSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_COOPER_BEECH_SAPLING = BLOCKS.register("potted_cooper_beech_sapling",
            () -> new FlowerPotBlock(ModBlocks.COOPER_BEECH_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> RED_OAK_SAPLING = registerBlock("red_oak_sapling",
            RedOakSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_RED_OAK_SAPLING = BLOCKS.register("potted_red_oak_sapling",
            () -> new FlowerPotBlock(ModBlocks.RED_OAK_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> SOCOTRA_DESERT_ROSE_SAPLING = registerBlock("socotra_desert_rose_sapling",
            SocotraDesertRoseSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SOCOTRA_DESERT_ROSE_SAPLING = BLOCKS.register("potted_socotra_desert_rose_sapling",
            () -> new FlowerPotBlock(ModBlocks.SOCOTRA_DESERT_ROSE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> JAPANESE_PINE_SAPLING = registerBlock("japanese_pine_sapling",
            JapanesePineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_JAPANESE_PINE_SAPLING = BLOCKS.register("potted_japanese_pine_sapling",
            () -> new FlowerPotBlock(ModBlocks.JAPANESE_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> SOCOTRA_CUCUMBER_SAPLING = registerBlock("socotra_cucumber_sapling",
            SocotraCucumberSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SOCOTRA_CUCUMBER_SAPLING = BLOCKS.register("potted_socotra_cucumber_sapling",
            () -> new FlowerPotBlock(ModBlocks.SOCOTRA_CUCUMBER_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> CANARY_DATE_SAPLING = registerBlock("canary_date_sapling",
            CanaryDateSapling::new);
    public static final RegistryObject<Block> SABAL_SAPLING = registerBlock("sabal_sapling",
            SabalSapling::new);

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
    public static final RegistryObject<Block> SPIDER_LILY = registerBlock("spider_lily",
            ModTallPlant::new);

    //Vines
    public static final RegistryObject<Block> CREEPING_FIG_VINE = registerBlock("creeping_fig_vine",
            CreepingFigVine::new);
    public static final RegistryObject<Block> CREEPING_FIG_FRUITING_VINE = registerBlock("creeping_fig_fruiting_vine",
            CreepingFigFruitingVine::new);
    public static final RegistryObject<Block> CREEPING_FIG_RIPE_FRUITING_VINE = registerBlock("creeping_fig_ripe_fruiting_vine",
            CreepingFigRipeFruitingVine::new);
    public static final RegistryObject<Block> SPANISH_MOSS = registerBlock("spanish_moss",
            SpanishMoss::new);

    public static final RegistryObject<Block> FICUS_ROOTS_PLANT = registerBlock("ficus_roots_plant",
            () -> new FicusRootsPlantBlock(AbstractBlock.Properties.create(Material.PLANTS, MaterialColor.BROWN).tickRandomly().
                    doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.VINE)));
    public static final RegistryObject<Block> SOCOTRA_CUCUMBER_LEAVES_VINE = registerBlock("socotra_cucumber_leaves_vine",
            () -> new SocotraCucumberLeavesVineBlock(AbstractBlock.Properties.create(Material.PLANTS, MaterialColor.GREEN_TERRACOTTA).tickRandomly().
                    doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.VINE)));

    //Crops
    public static final  RegistryObject<Block> RED_CURRANT_CROP = BLOCKS.register("red_currant_crop",
            () -> new RedCurrantCropBlock(AbstractBlock.Properties.from(Blocks.WHEAT).sound(SoundType.CROP)));
    public static final  RegistryObject<Block> BLACK_CURRANT_CROP = BLOCKS.register("black_currant_crop",
            () -> new BlackCurrantCropBlock(AbstractBlock.Properties.from(Blocks.WHEAT).sound(SoundType.CROP)));
    public static final  RegistryObject<Block> FENNEL_CROP = BLOCKS.register("fennel_crop",
            () -> new FennelCropBlock(AbstractBlock.Properties.from(Blocks.WHEAT).sound(SoundType.CROP)));

    //Plants

    //These are too large that they need a FLOWER BED and are incompatible with the flower pot.
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
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_WHITE_CISTUS = BLOCKS.register("potted_white_cistus",
            () -> new FlowerPotBlock(ModBlocks.WHITE_CISTUS.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> PINK_CISTUS = registerBlock("pink_cistus",
            MediterraneanFlower::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PINK_CISTUS = BLOCKS.register("potted_pink_cistus",
            () -> new FlowerPotBlock(ModBlocks.PINK_CISTUS.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> RED_CURRANT_SHRUB = registerBlock("red_currant_shrub",
            RibesShrub::new);
    public static final RegistryObject<Block> BLACK_CURRANT_SHRUB = registerBlock("black_currant_shrub",
            RibesShrub::new);

    public static final RegistryObject<Block> AZALEA_PURPLE = registerBlock("azalea_purple",
            AzaleaPlant::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_AZALEA_PURPLE = BLOCKS.register("potted_azalea_purple",
            () -> new FlowerPotBlock(ModBlocks.AZALEA_PURPLE.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> AZALEA_RED = registerBlock("azalea_red",
            AzaleaPlant::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_AZALEA_RED = BLOCKS.register("potted_azalea_red",
            () -> new FlowerPotBlock(ModBlocks.AZALEA_RED.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> AZALEA_PINK = registerBlock("azalea_pink",
            AzaleaPlant::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_AZALEA_PINK = BLOCKS.register("potted_azalea_pink",
            () -> new FlowerPotBlock(ModBlocks.AZALEA_PINK.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> AZALEA_ORANGE = registerBlock("azalea_orange",
            AzaleaPlant::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_AZALEA_ORANGE = BLOCKS.register("potted_azalea_orange",
            () -> new FlowerPotBlock(ModBlocks.AZALEA_ORANGE.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> AZALEA_MAGENTA = registerBlock("azalea_magenta",
            AzaleaPlant::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_AZALEA_MAGENTA = BLOCKS.register("potted_azalea_magenta",
            () -> new FlowerPotBlock(ModBlocks.AZALEA_MAGENTA.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> AZALEA_GREEN = registerBlock("azalea_green",
            AzaleaPlant::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_AZALEA_GREEN = BLOCKS.register("potted_azalea_green",
            () -> new FlowerPotBlock(ModBlocks.AZALEA_GREEN.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> AZALEA_WHITE = registerBlock("azalea_white",
            AzaleaPlant::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_AZALEA_WHITE = BLOCKS.register("potted_azalea_white",
            () -> new FlowerPotBlock(ModBlocks.AZALEA_WHITE.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


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



