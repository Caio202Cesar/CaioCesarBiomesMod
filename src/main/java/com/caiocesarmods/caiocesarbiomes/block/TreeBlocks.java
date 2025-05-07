package com.caiocesarmods.caiocesarbiomes.block;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.block.custom.ModLeaves;
import com.caiocesarmods.caiocesarbiomes.block.custom.ModLogs;
import com.caiocesarmods.caiocesarbiomes.block.custom.Saplings.*;
import com.caiocesarmods.caiocesarbiomes.block.custom.leaves.*;
import com.caiocesarmods.caiocesarbiomes.item.ModItemGroup;
import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
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

public class TreeBlocks {
    public static List<Block> blocksList = new ArrayList<>();

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, CaioCesarBiomesMod.MOD_ID);

    ///A
    //Araucaria
    public static final RegistryObject<Block> ARAUCARIA_LOG = registerBlock("araucaria_log",
            ModLogs::new);
    public static final RegistryObject<Block> COOK_PINE_LEAVES = registerBlock("cook_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> NORFOLK_PINE_LEAVES = registerBlock("norfolk_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> MONKEY_PUZZLE_LEAVES = registerBlock("monkey_puzzle_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> BUNYA_PINE_LEAVES = registerBlock("bunya_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> HOOP_PINE_LEAVES = registerBlock("hoop_pine_leaves",
            ModLeaves::new);
    //Avocado
    public static final RegistryObject<Block> AVOCADO_LOG = registerBlock("avocado_log",
            ModLogs::new);
    public static final RegistryObject<Block> AVOCADO_LEAVES = registerBlock("avocado_leaves",
            AvocadoLeaves::new);
    public static final RegistryObject<Block> AVOCADO_SAPLING = registerBlock("avocado_sapling",
            AvocadoSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_AVOCADO_SAPLING = BLOCKS.register("potted_avocado_sapling",
            () -> new FlowerPotBlock(TreeBlocks.AVOCADO_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Aspen
    public static final RegistryObject<Block> ASPEN_LEAVES = registerBlock("aspen_leaves",
            ModLeaves::new); //the same tree structure as southern magnolia



    ///B
    // Beech
    public static final RegistryObject<Block> BEECH_LOG = registerBlock("beech_log",
            ModLogs::new);
    public static final RegistryObject<Block> COOPER_BEECH_LEAVES = registerBlock("cooper_beech_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> COOPER_BEECH_SAPLING = registerBlock("cooper_beech_sapling",
            CooperBeechSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_COOPER_BEECH_SAPLING = BLOCKS.register("potted_cooper_beech_sapling",
            () -> new FlowerPotBlock(TreeBlocks.COOPER_BEECH_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Bismarck Palm
    public static final RegistryObject<Block> BISMARCK_PALM_LOG = registerBlock("bismarck_palm_log",
            ModLogs::new);
    public static final RegistryObject<Block> BISMARCK_PALM_LEAVES = registerBlock("bismarck_palm_leaves",
            ModLeaves::new);
    //Breadfruit
    public static final RegistryObject<Block> BREADFRUIT_LEAVES = registerBlock("breadfruit_leaves",
            () -> new BreadfruitLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.BREADFRUIT_FRUITING_LEAVES));
    public static final RegistryObject<Block> BREADFRUIT_FRUITING_LEAVES = registerBlock("breadfruit_fruiting_leaves",
            () -> new BreadfruitFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.BREADFRUIT_LEAVES));
    //Black Poplar
    public static final RegistryObject<Block> BLACK_POPLAR_LOG = registerBlock("black_poplar_log",
            ModLogs::new);
    public static final RegistryObject<Block> BLACK_POPLAR_LEAVES = registerBlock("black_poplar_leaves",
            ModLeaves::new);
    //Blue Spruce
    public static final RegistryObject<Block> BLUE_SPRUCE_LEAVES = registerBlock("blue_spruce_leaves",
            ModLeaves::new);
    //Blue Mahoe
    public static final RegistryObject<Block> BLUE_MAHOE_LOG = registerBlock("blue_mahoe_log",
            ModLogs::new);


    ///C
    //Camellia
    public static final RegistryObject<Block> CAMELLIA_LOG = registerBlock("camellia_log",
            ModLogs::new);
    public static final RegistryObject<Block> CAMELLIA_LEAVES = registerBlock("camellia_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> TEA_LEAVES = registerBlock("tea_leaves",
            ModLeaves::new);
    //Carob
    public static final RegistryObject<Block> CAROB_LOG = registerBlock("carob_log",
            ModLogs::new);
    public static final RegistryObject<Block> CAROB_LEAVES = registerBlock("carob_leaves",
            CarobLeaves::new);
    //Canary Date
    public static final RegistryObject<Block> CANARY_DATE_LOG = registerBlock("canary_date_log",
            ModLogs::new);
    public static final RegistryObject<Block> CANARY_DATE_LEAVES = registerBlock("canary_date_leaves",
            () -> new DateLeaves(AbstractBlock.Properties.create(Material.LEAVES)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly() // Enables random ticks
                    .notSolid()
                    .sound(SoundType.PLANT)));
    //Canary Pine
    public static final RegistryObject<Block> CANARY_PINE_LOG = registerBlock("canary_pine_log",
            ModLogs::new);
    public static final RegistryObject<Block> CANARY_PINE_LEAVES = registerBlock("canary_pine_leaves",
            ModLeaves::new);
    //Casuarina
    public static final RegistryObject<Block> CASUARINA_LOG = registerBlock("casuarina_log",
            ModLogs::new);
    public static final RegistryObject<Block> CASUARINA_LEAVES = registerBlock("casuarina_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> CASUARINA_SAPLING = registerBlock("casuarina_sapling",
            CasuarinaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_CASUARINA_SAPLING = BLOCKS.register("potted_casuarina_sapling",
            () -> new FlowerPotBlock(TreeBlocks.CASUARINA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Citrus
    public static final RegistryObject<Block> CITRUS_LOG = registerBlock("citrus_log",
            ModLogs::new);
    public static final RegistryObject<Block> BUDDHA_HAND_LEAVES = registerBlock("buddha_hand_leaves",
            () -> new BuddhaHandLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.BUDDHA_HAND_FLOWERING_LEAVES));
    public static final RegistryObject<Block> BUDDHA_HAND_FLOWERING_LEAVES = registerBlock("buddha_hand_flowering_leaves",
            () -> new BuddhaHandFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.BUDDHA_HAND_FRUITING_LEAVES));
    public static final RegistryObject<Block> BUDDHA_HAND_FRUITING_LEAVES = registerBlock("buddha_hand_fruiting_leaves",
            () -> new BuddhaHandFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.BUDDHA_HAND_LEAVES));
    public static final RegistryObject<Block> BUDDHA_HAND_SAPLING = registerBlock("buddha_hand_sapling",
            BuddhaHandSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_BUDDHA_HAND_SAPLING = BLOCKS.register("potted_buddha_hand_sapling",
            () -> new FlowerPotBlock(TreeBlocks.BUDDHA_HAND_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> CITRON_LEAVES = registerBlock("citron_leaves",
            () -> new CitronLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.CITRON_FLOWERING_LEAVES));
    public static final RegistryObject<Block> CITRON_FLOWERING_LEAVES = registerBlock("citron_flowering_leaves",
            () -> new CitronFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.CITRON_FRUITING_LEAVES));
    public static final RegistryObject<Block> CITRON_FRUITING_LEAVES = registerBlock("citron_fruiting_leaves",
            () -> new CitronFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.CITRON_LEAVES));
    public static final RegistryObject<Block> CITRON_SAPLING = registerBlock("citron_sapling",
            CitronSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_CITRON_SAPLING = BLOCKS.register("potted_citron_sapling",
            () -> new FlowerPotBlock(TreeBlocks.CITRON_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> TAHITI_LIME_LEAVES = registerBlock("tahiti_lime_leaves",
            () -> new TahitiLimeLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.TAHITI_LIME_FLOWERING_LEAVES));
    public static final RegistryObject<Block> TAHITI_LIME_FLOWERING_LEAVES = registerBlock("tahiti_lime_flowering_leaves",
            () -> new TahitiLimeFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.TAHITI_LIME_FRUITING_LEAVES));
    public static final RegistryObject<Block> TAHITI_LIME_FRUITING_LEAVES = registerBlock("tahiti_lime_fruiting_leaves",
            () -> new TahitiLimeFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.TAHITI_LIME_LEAVES));
    public static final RegistryObject<Block> TAHITI_LIME_SAPLING = registerBlock("tahiti_lime_sapling",
            TahitiLimeSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_TAHITI_LIME_SAPLING = BLOCKS.register("potted_tahiti_lime_sapling",
            () -> new FlowerPotBlock(TreeBlocks.TAHITI_LIME_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> GRAPEFRUIT_LEAVES = registerBlock("grapefruit_leaves",
            () -> new GrapefruitLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.GRAPEFRUIT_FLOWERING_LEAVES));
    public static final RegistryObject<Block> GRAPEFRUIT_FLOWERING_LEAVES = registerBlock("grapefruit_flowering_leaves",
            () -> new GrapefruitFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.GRAPEFRUIT_FRUITING_LEAVES));
    public static final RegistryObject<Block> GRAPEFRUIT_FRUITING_LEAVES = registerBlock("grapefruit_fruiting_leaves",
            () -> new GrapefruitFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.GRAPEFRUIT_LEAVES));
    public static final RegistryObject<Block> GRAPEFRUIT_SAPLING = registerBlock("grapefruit_sapling",
            GrapefruitSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_GRAPEFRUIT_SAPLING = BLOCKS.register("potted_grapefruit_sapling",
            () -> new FlowerPotBlock(TreeBlocks.GRAPEFRUIT_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> LEMON_LEAVES = registerBlock("lemon_leaves",
            () -> new LemonLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.LEMON_FLOWERING_LEAVES));
    public static final RegistryObject<Block> LEMON_FLOWERING_LEAVES = registerBlock("lemon_flowering_leaves",
            () -> new LemonFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.LEMON_FRUITING_LEAVES));
    public static final RegistryObject<Block> LEMON_FRUITING_LEAVES = registerBlock("lemon_fruiting_leaves",
            () -> new LemonFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.LEMON_LEAVES));
    public static final RegistryObject<Block> LEMON_SAPLING = registerBlock("lemon_sapling",
            LemonSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_LEMON_SAPLING = BLOCKS.register("potted_lemon_sapling",
            () -> new FlowerPotBlock(TreeBlocks.LEMON_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> ORANGE_LEAVES = registerBlock("orange_leaves",
            () -> new OrangeLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ORANGE_FLOWERING_LEAVES));
    public static final RegistryObject<Block> ORANGE_FLOWERING_LEAVES = registerBlock("orange_flowering_leaves",
            () -> new OrangeFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ORANGE_FRUITING_LEAVES));
    public static final RegistryObject<Block> ORANGE_FRUITING_LEAVES = registerBlock("orange_fruiting_leaves",
            () -> new OrangeFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ORANGE_LEAVES));
    public static final RegistryObject<Block> ORANGE_SAPLING = registerBlock("orange_sapling",
            OrangeSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_ORANGE_SAPLING = BLOCKS.register("potted_orange_sapling",
            () -> new FlowerPotBlock(TreeBlocks.ORANGE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> MANDARIN_LEAVES = registerBlock("mandarin_leaves",
            () -> new MandarinLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.MANDARIN_FLOWERING_LEAVES));
    public static final RegistryObject<Block> MANDARIN_FLOWERING_LEAVES = registerBlock("mandarin_flowering_leaves",
            () -> new MandarinFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.MANDARIN_FRUITING_LEAVES));
    public static final RegistryObject<Block> MANDARIN_FRUITING_LEAVES = registerBlock("mandarin_fruiting_leaves",
            () -> new MandarinFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.MANDARIN_LEAVES));
    public static final RegistryObject<Block> MANDARIN_SAPLING = registerBlock("mandarin_sapling",
            MandarinSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_MANDARIN_SAPLING = BLOCKS.register("potted_mandarin_sapling",
            () -> new FlowerPotBlock(TreeBlocks.MANDARIN_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Chinese Pine
    public static final RegistryObject<Block> CHINESE_RED_PINE_LOG = registerBlock("chinese_red_pine_log",
            ModLogs::new);
    public static final RegistryObject<Block> CHINESE_RED_PINE_LEAVES = registerBlock("chinese_red_pine_leaves",
            ModLeaves::new);
    //Crabapple
    public static final RegistryObject<Block> CRABAPPLE_LOG = registerBlock("crabapple_log",
            ModLogs::new);
    public static final RegistryObject<Block> PINK_CRABAPPLE_LEAVES = registerBlock("crabapple_pink_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> PINK_CRABAPPLE_SAPLING = registerBlock("crabapple_pink_sapling",
            PinkCrabappleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PINK_CRABAPPLE_SAPLING = BLOCKS.register("potted_crabapple_pink_sapling",
            () -> new FlowerPotBlock(TreeBlocks.PINK_CRABAPPLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> WHITE_CRABAPPLE_LEAVES = registerBlock("crabapple_white_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> WHITE_CRABAPPLE_SAPLING = registerBlock("crabapple_white_sapling",
            WhiteCrabappleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_WHITE_CRABAPPLE_SAPLING = BLOCKS.register("potted_crabapple_white_sapling",
            () -> new FlowerPotBlock(TreeBlocks.WHITE_CRABAPPLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Coast Cottonwood
    public static final RegistryObject<Block> COAST_COTTONWOOD_LOG = registerBlock("coast_cottonwood_log",
            ModLogs::new);
    public static final RegistryObject<Block> COAST_COTTONWOOD_LEAVES = registerBlock("coast_cottonwood_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> COAST_COTTONWOOD_SAPLING = registerBlock("coast_cottonwood_sapling",
            CoastCottonwoodSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_COAST_COTTONWOOD_SAPLING = BLOCKS.register("potted_coast_cottonwood_sapling",
            () -> new FlowerPotBlock(TreeBlocks.COAST_COTTONWOOD_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Cork Oak
    public static final RegistryObject<Block> CORK_OAK_LOG = registerBlock("cork_oak_log",
            ModLogs::new);
    public static final RegistryObject<Block> CORK_OAK_LEAVES = registerBlock("cork_oak_leaves",
            ModLeaves::new);
    //Coconut
    public static final RegistryObject<Block> COCONUT_LOG = registerBlock("coconut_log",
            ModLogs::new);
    public static final RegistryObject<Block> COCONUT_LEAVES = registerBlock("coconut_leaves",
            () -> new CoconutLeaves(AbstractBlock.Properties.create(Material.LEAVES)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly() // Enables random ticks
                    .notSolid()
                    .sound(SoundType.PLANT)));



    ///D
    //Date
    public static final RegistryObject<Block> DATE_LOG = registerBlock("date_log",
            ModLogs::new);
    public static final RegistryObject<Block> DATE_LEAVES = registerBlock("date_leaves",
            () -> new DateLeaves(AbstractBlock.Properties.create(Material.LEAVES)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly() // Enables random ticks
                    .notSolid()
                    .sound(SoundType.PLANT)));
    //Dragon Blood
    public static final RegistryObject<Block> DRAGON_BLOOD_LOG = registerBlock("dragon_blood_log",
            ModLogs::new);
    public static final RegistryObject<Block> DRAGON_BLOOD_LEAVES = registerBlock("dragon_blood_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> DRAGON_BLOOD_SAPLING = registerBlock("dragon_blood_sapling",
            DragonBloodSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_DRAGON_BLOOD_SAPLING = BLOCKS.register("potted_dragon_blood_sapling",
            () -> new FlowerPotBlock(TreeBlocks.DRAGON_BLOOD_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Douglas Fir
    public static final RegistryObject<Block> DOUGLAS_FIR_LOG = registerBlock("douglas_fir_log",
            ModLogs::new);
    public static final RegistryObject<Block> DOUGLAS_FIR_LEAVES = registerBlock("douglas_fir_leaves",
            ModLeaves::new);
    //Durian
    public static final RegistryObject<Block> DURIAN_LEAVES = registerBlock("durian_leaves",
            () -> new DurianLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.DURIAN_FLOWERING_LEAVES));
    public static final RegistryObject<Block> DURIAN_FLOWERING_LEAVES = registerBlock("durian_flowering_leaves",
            () -> new DurianFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.DURIAN_FRUITING_LEAVES));
    public static final RegistryObject<Block> DURIAN_FRUITING_LEAVES = registerBlock("durian_fruiting_leaves",
            () -> new DurianFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.DURIAN_LEAVES));



    ///E
    //Ebony
    public static final RegistryObject<Block> EBONY_LOG = registerBlock("ebony_log",
            ModLogs::new);
    public static final RegistryObject<Block> EBONY_LEAVES = registerBlock("ebony_leaves",
            ModLeaves::new);
    //Elderberry
    public static final RegistryObject<Block> ELDERBERRY_LOG = registerBlock("elderberry_log",
            ModLogs::new);
    public static final RegistryObject<Block> ELDERBERRY_LEAVES = registerBlock("elderberry_leaves",
            () -> new ElderberryLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ELDERBERRY_FLOWERING_LEAVES));
    public static final RegistryObject<Block> ELDERBERRY_FLOWERING_LEAVES = registerBlock("elderberry_flowering_leaves",
            () -> new ElderberryFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ELDERBERRY_FRUITING_LEAVES));
    public static final RegistryObject<Block> ELDERBERRY_FRUITING_LEAVES = registerBlock("elderberry_fruiting_leaves",
            () -> new ElderberryFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ELDERBERRY_LEAVES));
    //Eucalyptus
    public static final RegistryObject<Block> EUCALYPTUS_LOG = registerBlock("eucalyptus_log",
            ModLogs::new);
    public static final RegistryObject<Block> EUCALYPTUS_LEAVES = registerBlock("eucalyptus_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> EUCALYPTUS_SAPLING = registerBlock("eucalyptus_sapling",
            EucalyptusSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_EUCALYPTUS_SAPLING = BLOCKS.register("potted_eucalyptus_sapling",
            () -> new FlowerPotBlock(TreeBlocks.EUCALYPTUS_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Erythrina
    public static final RegistryObject<Block> ERYTHRINA_LOG = registerBlock("erythrina_log",
            ModLogs::new);
    public static final RegistryObject<Block> INDIAN_CORAL_LEAVES = registerBlock("indian_coral_leaves",
            ModLeaves::new);



    ///F
    //Fig
    public static final RegistryObject<Block> FIG_LOG = registerBlock("fig_log",
            ModLogs::new);
    public static final RegistryObject<Block> FIG_LEAVES = registerBlock("fig_leaves",
            FigLeaves::new);
    public static final RegistryObject<Block> WHITE_FIG_LEAVES = registerBlock("white_fig_leaves",
            WhiteFigLeaves::new);
    public static final RegistryObject<Block> SYCAMORE_FIG_LEAVES = registerBlock("sycamore_fig_leaves",
            SycamoreFigLeaves::new);


    ///G


    ///H
    //Hawthorn
    public static final RegistryObject<Block> HAWTHORN_LOG = registerBlock("hawthorn_log",
            ModLogs::new);
    public static final RegistryObject<Block> HAWTHORN_LEAVES = registerBlock("hawthorn_leaves",
            () -> new HawthornLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.HAWTHORN_FLOWERING_LEAVES));
    public static final RegistryObject<Block> HAWTHORN_FLOWERING_LEAVES = registerBlock("hawthorn_flowering_leaves",
            () -> new HawthornFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.HAWTHORN_FRUITING_LEAVES));
    public static final RegistryObject<Block> HAWTHORN_FRUITING_LEAVES = registerBlock("hawthorn_fruiting_leaves",
            () -> new HawthornFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.HAWTHORN_LEAVES));
    //Hazelnut
    public static final RegistryObject<Block> HAZELNUT_LOG = registerBlock("hazelnut_log",
            ModLogs::new);
    public static final RegistryObject<Block> HAZELNUT_LEAVES = registerBlock("hazelnut_leaves",
            () -> new HazelnutLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.HAZELNUT_FLOWERING_LEAVES));
    public static final RegistryObject<Block> HAZELNUT_FLOWERING_LEAVES = registerBlock("hazelnut_flowering_leaves",
            () -> new HazelnutFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.HAZELNUT_FRUITING_LEAVES));
    public static final RegistryObject<Block> HAZELNUT_FRUITING_LEAVES = registerBlock("hazelnut_fruiting_leaves",
            () -> new HazelnutFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.HAZELNUT_LEAVES));
    //Holm Oak
    public static final RegistryObject<Block> HOLM_OAK_LOG = registerBlock("holm_oak_log",
            ModLogs::new);
    public static final RegistryObject<Block> HOLM_OAK_LEAVES = registerBlock("holm_oak_leaves",
            ModLeaves::new);
    //Holly
    public static final RegistryObject<Block> HOLLY_LOG = registerBlock("ilex_log",
            ModLogs::new);
    public static final RegistryObject<Block> HOLLY_LEAVES = registerBlock("holly_leaves",
            ModLeaves::new);



    ///I
    //Italian Cypress
    public static final RegistryObject<Block> ITALIAN_CYPRESS_LOG = registerBlock("italian_cypress_log",
            ModLogs::new);
    public static final RegistryObject<Block> ITALIAN_CYPRESS_LEAVES = registerBlock("italian_cypress_leaves",
            ModLeaves::new);



    ///J
    //Japanese Pine
    public static final RegistryObject<Block> JAPANESE_PINE_LOG = registerBlock("japanese_pine_log",
            ModLogs::new);
    public static final RegistryObject<Block> JAPANESE_PINE_LEAVES = registerBlock("japanese_pine_leaves",
            ModLeaves::new);
    //Japanese Maple
    public static final RegistryObject<Block> JAPANESE_MAPLE_LOG = registerBlock("japanese_maple_log",
            ModLogs::new);
    public static final RegistryObject<Block> JAPANESE_MAPLE_LEAVES = registerBlock("japanese_maple_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> RED_MAPLE_LEAVES = registerBlock("red_maple_leaves",
            ModLeaves::new);
    //Jungle Figs
    public static final RegistryObject<Block> JUNGLE_FIG_LOG = registerBlock("jungle_fig_log",
            ModLogs::new);
    public static final RegistryObject<Block> WEEPING_FIG_LEAVES = registerBlock("weeping_fig_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> INDIAN_LAUREL_LEAVES = registerBlock("indian_laurel_leaves",
            ModLeaves::new);
    //Juniper
    public static final RegistryObject<Block> JUNIPER_LOG = registerBlock("juniper_log",
            ModLogs::new);
    public static final RegistryObject<Block> JUNIPER_LEAVES = registerBlock("juniper_leaves",
            JuniperLeaves::new);



    ///K



    ///L
    //Live Oak
    public static final RegistryObject<Block> LIVE_OAK_LOG = registerBlock("live_oak_log",
            ModLogs::new);
    public static final RegistryObject<Block> LIVE_OAK_LEAVES = registerBlock("live_oak_leaves",
            ModLeaves::new);
    //Larch
    public static final RegistryObject<Block> LARCH_LOG = registerBlock("larch_log",
            ModLogs::new);
    public static final RegistryObject<Block> LARCH_LEAVES = registerBlock("larch_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> LARCH_AUTUMN_LEAVES = registerBlock("larch_autumn_leaves",
            ModLeaves::new);
    //Loquat
    public static final RegistryObject<Block> LOQUAT_LOG = registerBlock("loquat_log",
            ModLogs::new);
    public static final RegistryObject<Block> LOQUAT_LEAVES = registerBlock("loquat_leaves",
            () -> new LoquatLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.LOQUAT_FLOWERING_LEAVES));
    public static final RegistryObject<Block> LOQUAT_FLOWERING_LEAVES = registerBlock("loquat_flowering_leaves",
            () -> new LoquatFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.LOQUAT_FRUITING_LEAVES));
    public static final RegistryObject<Block> LOQUAT_FRUITING_LEAVES = registerBlock("loquat_fruiting_leaves",
            () -> new LoquatFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.LOQUAT_LEAVES));



    ///M
    //Mango
    public static final RegistryObject<Block> MANGO_LOG = registerBlock("mango_log",
            ModLogs::new);
    public static final RegistryObject<Block> MANGO_LEAVES = registerBlock("mango_leaves",
            () -> new MangoLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.MANGO_FLOWERING_LEAVES));
    public static final RegistryObject<Block> MANGO_FLOWERING_LEAVES = registerBlock("mango_flowering_leaves",
            () -> new MangoFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.MANGO_FRUITING_LEAVES));
    public static final RegistryObject<Block> MANGO_FRUITING_LEAVES = registerBlock("mango_fruiting_leaves",
            () -> new MangoFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.MANGO_LEAVES));
    //Marula
    public static final RegistryObject<Block> MARULA_LOG = registerBlock("marula_log",
            ModLogs::new);
    public static final RegistryObject<Block> MARULA_LEAVES = registerBlock("marula_leaves",
            () -> new MarulaLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.MARULA_FRUITING_LEAVES));
    public static final RegistryObject<Block> MARULA_FRUITING_LEAVES = registerBlock("marula_fruiting_leaves",
            () -> new MarulaFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.MARULA_LEAVES));
    //Mesquite
    public static final RegistryObject<Block> MESQUITE_LOG = registerBlock("mesquite_log",
            ModLogs::new);
    public static final RegistryObject<Block> MESQUITE_LEAVES = registerBlock("mesquite_leaves",
            ModLeaves::new);
    //Myrtle
    public static final RegistryObject<Block> MYRTLE_LOG = registerBlock("myrtle_log",
            ModLogs::new);
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
    //Mulberry
    public static final RegistryObject<Block> MULBERRY_LOG = registerBlock("mulberry_log",
            ModLogs::new);
    public static final RegistryObject<Block> MULBERRY_LEAVES = registerBlock("mulberry_leaves",
            () -> new MulberryLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.MULBERRY_FRUITING_LEAVES));
    public static final RegistryObject<Block> MULBERRY_FRUITING_LEAVES = registerBlock("mulberry_fruiting_leaves",
            () -> new MulberryFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.MULBERRY_LEAVES));
    //Mugo Pine
    public static final RegistryObject<Block> MUGO_PINE_LOG = registerBlock("mugo_pine_log",
            ModLogs::new);
    public static final RegistryObject<Block> MUGO_PINE_LEAVES = registerBlock("mugo_pine_leaves",
            ModLeaves::new);



    ///N
    //Nothofagus
    public static final RegistryObject<Block> NOTHOFAGUS_LOG = registerBlock("nothofagus_log",
            ModLogs::new);
    public static final RegistryObject<Block> SOUTHERN_BEECH_LEAVES = registerBlock("southern_beech_leaves",
            ModLeaves::new);



    ///O
    //Ocotea
    public static final RegistryObject<Block> OCOTEA_FOREST_LOG = registerBlock("ocotea_forest_log",
            ModLogs::new);
    public static final RegistryObject<Block> OCOTEA_JUNGLE_LOG = registerBlock("ocotea_jungle_log",
            ModLogs::new);
    public static final RegistryObject<Block> OCOTEA_LEAVES = registerBlock("ocotea_leaves",
            ModLeaves::new);
    //Oil Palm
    public static final RegistryObject<Block> OIL_PALM_LOG = registerBlock("oil_palm_log",
            ModLogs::new);
    public static final RegistryObject<Block> OIL_PALM_LEAVES = registerBlock("oil_palm_leaves",
            ModLeaves::new);
    //Oleander
    public static final RegistryObject<Block> OLEANDER_LOG = registerBlock("oleander_log",
            ModLogs::new);
    public static final RegistryObject<Block> OLEANDER_DARK_PINK_LEAVES = registerBlock("oleander_dark_pink_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> OLEANDER_PINK_LEAVES = registerBlock("oleander_pink_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> OLEANDER_RED_LEAVES = registerBlock("oleander_red_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> OLEANDER_WHITE_LEAVES = registerBlock("oleander_white_leaves",
            ModLeaves::new);
    //Olive
    public static final RegistryObject<Block> OLIVE_LOG = registerBlock("olive_log",
            ModLogs::new);
    public static final RegistryObject<Block> OLIVE_LEAVES = registerBlock("olive_leaves",
            () -> new OliveLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.OLIVE_FRUITING_LEAVES));
    public static final RegistryObject<Block> OLIVE_FRUITING_LEAVES = registerBlock("olive_fruiting_leaves",
            () -> new OliveFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.OLIVE_LEAVES));



    ///P
    //Pecan
    public static final RegistryObject<Block> PECAN_LOG = registerBlock("pecan_log",
            ModLogs::new);
    public static final RegistryObject<Block> PECAN_LEAVES = registerBlock("pecan_leaves",
            () -> new PecanLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PECAN_FRUITING_LEAVES));
    public static final RegistryObject<Block> PECAN_FRUITING_LEAVES = registerBlock("pecan_fruiting_leaves",
            () -> new PecanFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PECAN_LEAVES));
    //Persimmon
    public static final RegistryObject<Block> PERSIMMON_LOG = registerBlock("persimmon_log",
            ModLogs::new);
    public static final RegistryObject<Block> PERSIMMON_LEAVES = registerBlock("persimmon_leaves",
            () -> new PersimmonLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PERSIMMON_FLOWERING_LEAVES));
    public static final RegistryObject<Block> PERSIMMON_FLOWERING_LEAVES = registerBlock("persimmon_flowering_leaves",
            () -> new PersimmonFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PERSIMMON_FRUITING_LEAVES));
    public static final RegistryObject<Block> PERSIMMON_FRUITING_LEAVES = registerBlock("persimmon_fruiting_leaves",
            () -> new PersimmonFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PERSIMMON_LEAVES));
    public static final RegistryObject<Block> JACKALBERRY_LEAVES = registerBlock("jackalberry_leaves",
            JackalberryLeaves::new);
    //Pinyon
    public static final RegistryObject<Block> PINYON_LOG = registerBlock("pinyon_log",
            ModLogs::new);
    public static final RegistryObject<Block> PINYON_LEAVES = registerBlock("pinyon_leaves",
            ModLeaves::new);
    //Pink Ivory
    public static final RegistryObject<Block> PINK_IVORY_LOG = registerBlock("pink_ivory_log",
            ModLogs::new);
    public static final RegistryObject<Block> PINK_IVORY_LEAVES = registerBlock("pink_ivory_leaves",
            ModLeaves::new);
    //Pistachio
    public static final RegistryObject<Block> PISTACHIO_LOG = registerBlock("pistachio_log",
            ModLogs::new);
    public static final RegistryObject<Block> PISTACHIO_LEAVES = registerBlock("pistachio_leaves",
            () -> new PistachioLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModPlants.PISTACHIO_FRUITING_LEAVES));
    public static final RegistryObject<Block> PISTACHIO_FRUITING_LEAVES = registerBlock("pistachio_fruiting_leaves",
            () -> new PistachioFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), ModPlants.PISTACHIO_LEAVES));
    //Plane
    public static final RegistryObject<Block> PLANE_LOG = registerBlock("plane_log",
            ModLogs::new);
    public static final RegistryObject<Block> PLANE_LEAVES = registerBlock("plane_leaves",
            ModLeaves::new);
    //Ponderosa Pine
    public static final RegistryObject<Block> PONDEROSA_PINE_LOG = registerBlock("ponderosa_pine_log",
            ModLogs::new);
    public static final RegistryObject<Block> PONDEROSA_PINE_LEAVES = registerBlock("ponderosa_pine_leaves",
            ModLeaves::new);
    //Pomegranate
    public static final RegistryObject<Block> POMEGRANATE_LOG = registerBlock("pomegranate_log",
            ModLogs::new);
    public static final RegistryObject<Block> POMEGRANATE_LEAVES = registerBlock("pomegranate_leaves",
            () -> new PomegranateLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.POMEGRANATE_FLOWERING_LEAVES));
    public static final RegistryObject<Block> POMEGRANATE_FLOWERING_LEAVES = registerBlock("pomegranate_flowering_leaves",
            () -> new PomegranateFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.POMEGRANATE_FRUITING_LEAVES));
    public static final RegistryObject<Block> POMEGRANATE_FRUITING_LEAVES = registerBlock("pomegranate_fruiting_leaves",
            () -> new PomegranateFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.POMEGRANATE_LEAVES));
    //Pohutukawa
    public static final RegistryObject<Block> POHUTUKAWA_LOG = registerBlock("pohutukawa_log",
            ModLogs::new);
    public static final RegistryObject<Block> POHUTUKAWA_LEAVES = registerBlock("pohutukawa_leaves",
            () -> new PohutukawaLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.POHUTUKAWA_FLOWERING_LEAVES));
    public static final RegistryObject<Block> POHUTUKAWA_FLOWERING_LEAVES = registerBlock("pohutukawa_flowering_leaves",
            () -> new PohutukawaFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.POHUTUKAWA_LEAVES));
    //Plum
    public static final RegistryObject<Block> PLUM_LOG = registerBlock("plum_log",
            ModLogs::new);
    public static final RegistryObject<Block> CHERRY_PLUM_LEAVES = registerBlock("cherry_plum_leaves",
            () -> new CherryPlumLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.CHERRY_PLUM_FLOWERING_LEAVES));
    public static final RegistryObject<Block> CHERRY_PLUM_FLOWERING_LEAVES = registerBlock("cherry_plum_flowering_leaves",
            () -> new CherryPlumFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.CHERRY_PLUM_FRUITING_LEAVES));
    public static final RegistryObject<Block> CHERRY_PLUM_FRUITING_LEAVES = registerBlock("cherry_plum_fruiting_leaves",
            () -> new CherryPlumFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.CHERRY_PLUM_LEAVES));
    //Purpleheart
    public static final RegistryObject<Block> PURPLEHEART_LOG = registerBlock("purpleheart_log",
            ModLogs::new);
    public static final RegistryObject<Block> PURPLEHEART_LEAVES = registerBlock("purpleheart_leaves",
            ModLeaves::new);



    ///Q



    ///R
    //Red Kapok
    public static final RegistryObject<Block> RED_KAPOK_LEAVES = registerBlock("red_kapok_leaves",
            ModLeaves::new);
    //Red Oak
    public static final RegistryObject<Block> RED_OAK_LEAVES = registerBlock("red_oak_leaves",
            ModLeaves::new);
    //Rowan
    public static final RegistryObject<Block> ROWAN_LOG = registerBlock("rowan_log",
            ModLogs::new);
    public static final RegistryObject<Block> ROWAN_LEAVES = registerBlock("rowan_leaves",
            () -> new RowanLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ROWAN_FLOWERING_LEAVES));
    public static final RegistryObject<Block> ROWAN_FLOWERING_LEAVES = registerBlock("rowan_flowering_leaves",
            () -> new RowanFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ROWAN_FRUITING_LEAVES));
    public static final RegistryObject<Block> ROWAN_FRUITING_LEAVES = registerBlock("rowan_fruiting_leaves",
            () -> new RowanFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ROWAN_LEAVES));
    //Royal Poinciana
    public static final RegistryObject<Block> ROYAL_POINCIANA_LOG = registerBlock("royal_poinciana_log",
            ModLogs::new);
    public static final RegistryObject<Block> ROYAL_POINCIANA_LEAVES = registerBlock("royal_poinciana_leaves",
            ModLeaves::new);



    ///S
    //Sabal
    public static final RegistryObject<Block> SABAL_LOG = registerBlock("sabal_log",
            ModLogs::new);
    public static final RegistryObject<Block> SABAL_LEAVES = registerBlock("sabal_leaves",
            ModLeaves::new);
    //Sausage Tree
    public static final RegistryObject<Block> SAUSAGE_TREE_LOG = registerBlock("sausage_tree_log",
            ModLogs::new);
    public static final RegistryObject<Block> SAUSAGE_TREE_LEAVES = registerBlock("sausage_tree_leaves",
            () -> new MangoLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.SAUSAGE_TREE_FLOWERING_LEAVES));
    public static final RegistryObject<Block> SAUSAGE_TREE_FLOWERING_LEAVES = registerBlock("sausage_tree_flowering_leaves",
            () -> new MangoFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.SAUSAGE_TREE_FRUITING_LEAVES));
    public static final RegistryObject<Block> SAUSAGE_TREE_FRUITING_LEAVES = registerBlock("sausage_tree_fruiting_leaves",
            () -> new MangoFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.SAUSAGE_TREE_LEAVES));
    //Slash Pine
    public static final RegistryObject<Block> SLASH_PINE_LOG = registerBlock("slash_pine_log",
            ModLogs::new);
    public static final RegistryObject<Block> SLASH_PINE_LEAVES = registerBlock("slash_pine_leaves",
            ModLeaves::new);
    //Starfruit
    public static final RegistryObject<Block> STARFRUIT_LOG = registerBlock("starfruit_log",
            ModLogs::new);
    public static final RegistryObject<Block> STARFRUIT_LEAVES = registerBlock("starfruit_leaves",
            () -> new StarfruitLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.STARFRUIT_FLOWERING_LEAVES));
    public static final RegistryObject<Block> STARFRUIT_FLOWERING_LEAVES = registerBlock("starfruit_flowering_leaves",
            () -> new StarfruitFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.STARFRUIT_FRUITING_LEAVES));
    public static final RegistryObject<Block> STARFRUIT_FRUITING_LEAVES = registerBlock("starfruit_fruiting_leaves",
            () -> new StarfruitFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.STARFRUIT_LEAVES));
    //Strawberry Tree
    public static final RegistryObject<Block> STRAWBERRY_TREE_LOG = registerBlock("strawberry_tree_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRAWBERRY_TREE_LEAVES = registerBlock("strawberry_tree_leaves",
            StrawberryTreeLeaves::new);
    //Stone Pine
    public static final RegistryObject<Block> STONE_PINE_LOG = registerBlock("stone_pine_log",
            ModLogs::new);
    public static final RegistryObject<Block> STONE_PINE_LEAVES = registerBlock("stone_pine_leaves",
            ModLeaves::new);
    //Southern Magnolia
    public static final RegistryObject<Block> SOUTHERN_MAGNOLIA_LOG = registerBlock("southern_magnolia_log",
            ModLogs::new);
    public static final RegistryObject<Block> SOUTHERN_MAGNOLIA_LEAVES = registerBlock("southern_magnolia_leaves",
            ModLeaves::new);
    //Socotra Desert Rose
    public static final RegistryObject<Block> SOCOTRA_DESERT_ROSE_LOG = registerBlock("socotra_desert_rose_log",
            ModLogs::new);
    public static final RegistryObject<Block> SOCOTRA_DESERT_ROSE_LEAVES = registerBlock("socotra_desert_rose_leaves",
            ModLeaves::new);
    //Socotra Cucumber
    public static final RegistryObject<Block> SOCOTRA_CUCUMBER_LOG = registerBlock("socotra_cucumber_log",
            ModLogs::new);
    public static final RegistryObject<Block> SOCOTRA_CUCUMBER_LEAVES = registerBlock("socotra_cucumber_leaves",
            ModLeaves::new);
    //Subalpine Fir
    public static final RegistryObject<Block> SUBALPINE_FIR_LOG = registerBlock("subalpine_fir_log",
            ModLogs::new);
    public static final RegistryObject<Block> SUBALPINE_FIR_LEAVES = registerBlock("subalpine_fir_leaves",
            ModLeaves::new);
    //Sweet Chestnut
    public static final RegistryObject<Block> SWEET_CHESTNUT_LOG = registerBlock("sweet_chestnut_log",
            ModLogs::new);
    public static final RegistryObject<Block> SWEET_CHESTNUT_LEAVES = registerBlock("sweet_chestnut_leaves",
            () -> new SweetChestnutLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.SWEET_CHESTNUT_FRUITING_LEAVES));
    public static final RegistryObject<Block> SWEET_CHESTNUT_FRUITING_LEAVES = registerBlock("sweet_chestnut_fruiting_leaves",
            () -> new SweetChestnutFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.SWEET_CHESTNUT_LEAVES));



    ///T
    //Tamarind
    public static final RegistryObject<Block> TAMARIND_LOG = registerBlock("tamarind_log",
            ModLogs::new);
    public static final RegistryObject<Block> TAMARIND_LEAVES = registerBlock("tamarind_leaves",
            TamarindLeaves::new);
    //Tropical Almond
    public static final RegistryObject<Block> TROPICAL_ALMOND_LOG = registerBlock("tropical_almond_log",
            ModLogs::new);
    public static final RegistryObject<Block> TROPICAL_ALMOND_LEAVES = registerBlock("tropical_almond_leaves",
            ModLeaves::new);



    ///U



    ///V



    ///W
    //Walnut
    public static final RegistryObject<Block> WALNUT_LOG = registerBlock("walnut_log",
            ModLogs::new);
    public static final RegistryObject<Block> WALNUT_LEAVES = registerBlock("walnut_leaves",
            () -> new WalnutLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WALNUT_FRUITING_LEAVES));
    public static final RegistryObject<Block> WALNUT_FRUITING_LEAVES = registerBlock("walnut_fruiting_leaves",
            () -> new WalnutFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WALNUT_LEAVES));
    //Western Hemlock
    public static final RegistryObject<Block> WESTERN_HEMLOCK_LOG = registerBlock("western_hemlock_log",
            ModLogs::new);
    public static final RegistryObject<Block> WESTERN_HEMLOCK_LEAVES = registerBlock("western_hemlock_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> MOUNTAIN_HEMLOCK_LEAVES = registerBlock("mountain_hemlock_leaves",
            ModLeaves::new);



    ///X



    ///Y
    //Yew
    public static final RegistryObject<Block> YEW_LOG = registerBlock("yew_log",
            ModLogs::new);
    public static final RegistryObject<Block> YEW_LEAVES = registerBlock("yew_leaves",
            YewLeaves::new);



    ///Z


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.TREES)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
