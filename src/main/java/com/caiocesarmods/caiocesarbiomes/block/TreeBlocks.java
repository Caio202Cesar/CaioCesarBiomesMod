package com.caiocesarmods.caiocesarbiomes.block;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.block.custom.Saplings.*;
import com.caiocesarmods.caiocesarbiomes.block.custom.fruiting.*;
import com.caiocesarmods.caiocesarbiomes.block.custom.leaves.*;
import com.caiocesarmods.caiocesarbiomes.block.custom.logs.BananaLog;
import com.caiocesarmods.caiocesarbiomes.block.custom.logs.ModLogs;
import com.caiocesarmods.caiocesarbiomes.block.custom.plants.BaldCypressAerialRoot;
import com.caiocesarmods.caiocesarbiomes.item.ModItemGroup;
import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.block.*;
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
    public static final RegistryObject<Block> COOK_PINE_SAPLING = registerBlock("cook_pine_sapling",
            CookPineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_COOK_PINE_SAPLING = BLOCKS.register("potted_cook_pine_sapling",
            () -> new FlowerPotBlock(TreeBlocks.COOK_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> NORFOLK_PINE_LEAVES = registerBlock("norfolk_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> NORFOLK_PINE_SAPLING = registerBlock("norfolk_pine_sapling",
            NorfolkPineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_NORFOLK_PINE_SAPLING = BLOCKS.register("potted_norfolk_pine_sapling",
            () -> new FlowerPotBlock(TreeBlocks.NORFOLK_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> MONKEY_PUZZLE_LEAVES = registerBlock("monkey_puzzle_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> MONKEY_PUZZLE_SAPLING = registerBlock("monkey_puzzle_sapling",
            MonkeyPuzzleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_MONKEY_PUZZLE_SAPLING = BLOCKS.register("potted_monkey_puzzle_sapling",
            () -> new FlowerPotBlock(TreeBlocks.MONKEY_PUZZLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> BUNYA_PINE_LEAVES = registerBlock("bunya_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> BUNYA_PINE_SAPLING = registerBlock("bunya_pine_sapling",
            BunyaPineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_BUNYA_PINE_SAPLING = BLOCKS.register("potted_bunya_pine_sapling",
            () -> new FlowerPotBlock(TreeBlocks.BUNYA_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

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
            () -> new AspenLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ASPEN_FALL_LEAVES));
    public static final RegistryObject<Block> ASPEN_FALL_LEAVES = registerBlock("aspen_fall_leaves",
            () -> new AspenFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ASPEN_WINTER_BRANCHES));
    public static final RegistryObject<Block> ASPEN_WINTER_BRANCHES = registerBlock("aspen_winter_branches",
            () -> new AspenWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ASPEN_LEAVES));
    public static final RegistryObject<Block> ASPEN_SAPLING = registerBlock("aspen_sapling",
            AspenSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_ASPEN_SAPLING = BLOCKS.register("potted_aspen_sapling",
            () -> new FlowerPotBlock(TreeBlocks.ASPEN_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    ///B
    //Bald Cypress
    public static final RegistryObject<Block> BALD_CYPRESS_LOG = registerBlock("bald_cypress_log",
            ModLogs::new);
    public static final RegistryObject<Block> BALD_CYPRESS_LEAVES = registerBlock("bald_cypress_leaves",
            () -> new BaldCypressLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.BALD_CYPRESS_AUTUMN_LEAVES));
    public static final RegistryObject<Block> BALD_CYPRESS_AUTUMN_LEAVES = registerBlock("bald_cypress_autumn_leaves",
            () -> new BaldCypressAutumnLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.BALD_CYPRESS_WINTER_LEAVES));
    public static final RegistryObject<Block> BALD_CYPRESS_WINTER_LEAVES = registerBlock("bald_cypress_winter_leaves",
            () -> new BaldCypressWinterLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.BALD_CYPRESS_LEAVES));
    public static final RegistryObject<Block> BALD_CYPRESS_AERIAL_ROOT_LARGE = registerBlock("bald_cypress_aerial_root_large",
            BaldCypressAerialRoot::new);
    public static final RegistryObject<Block> BALD_CYPRESS_AERIAL_ROOT_SMALL = registerBlock("bald_cypress_aerial_root_small",
            BaldCypressAerialRoot::new);
    public static final RegistryObject<Block> BALD_CYPRESS_SAPLING = registerBlock("bald_cypress_sapling",
            BaldCypressSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_BALD_CYPRESS_SAPLING = BLOCKS.register("potted_bald_cypress_sapling",
            () -> new FlowerPotBlock(TreeBlocks.BALD_CYPRESS_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    //Banana
    public static final RegistryObject<Block> BANANA_LOG = registerBlock("banana_log",
            BananaLog::new);
    public static final RegistryObject<Block> BANANA_LEAVES = registerBlock("banana_leaves",
            () -> new BananaLeaves(AbstractBlock.Properties.create(Material.LEAVES)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly() // Enables random ticks
                    .notSolid()
                    .sound(SoundType.PLANT)));
    public static final RegistryObject<Block> BANANA_SAPLING = registerBlock("banana_sapling",
            BananaSapling::new);
    public static final RegistryObject<Block> BANANA_FLOWER = registerBlock("banana_flower",
            BananaFlowerBlock::new); //Can be harvested and cooked
    public static final RegistryObject<Block> BANANA_BUNCH = registerBlock("banana_bunch",
            BananaBunchBlock::new);
    public static final RegistryObject<Block> BANANA_GREEN_BUNCH = registerBlock("banana_green_bunch",
            BananaGreenBunchBlock::new);
    public static final RegistryObject<Block> BANANA_STALK = registerBlock("banana_stalk",
            BananaStalkBlock::new);



    // Beech
    public static final RegistryObject<Block> BEECH_LOG = registerBlock("beech_log",
            ModLogs::new);

    public static final RegistryObject<Block> COOPER_BEECH_LEAVES = registerBlock("cooper_beech_leaves",
            () -> new CooperBeechLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.BLACK_POPLAR_FALL_LEAVES));
    public static final RegistryObject<Block> COOPER_BEECH_FALL_LEAVES = registerBlock("cooper_beech_fall_leaves",
            () -> new CooperBeechFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.BLACK_POPLAR_WINTER_BRANCHES));
    public static final RegistryObject<Block> COOPER_BEECH_WINTER_BRANCHES = registerBlock("cooper_beech_winter_branches",
            () -> new CooperBeechWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.BLACK_POPLAR_LEAVES));

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
    public static final RegistryObject<Block> BISMARCK_PALM_SAPLING = registerBlock("bismarck_palm_sapling",
            BismarckPalmSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_BISMARCK_PALM_SAPLING = BLOCKS.register("potted_bismarck_palm_sapling",
            () -> new FlowerPotBlock(TreeBlocks.BISMARCK_PALM_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Breadfruit
    public static final RegistryObject<Block> BREADFRUIT_LEAVES = registerBlock("breadfruit_leaves",
            () -> new BreadfruitLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.BREADFRUIT_FRUITING_LEAVES));
    public static final RegistryObject<Block> BREADFRUIT_FRUITING_LEAVES = registerBlock("breadfruit_fruiting_leaves",
            () -> new BreadfruitFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.BREADFRUIT_LEAVES));
    public static final RegistryObject<Block> BREADFRUIT_SAPLING = registerBlock("breadfruit_sapling",
            BreadfruitSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_BREADFRUIT_SAPLING = BLOCKS.register("potted_breadfruit_sapling",
            () -> new FlowerPotBlock(TreeBlocks.BREADFRUIT_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    //Black Poplar
    public static final RegistryObject<Block> BLACK_POPLAR_LOG = registerBlock("black_poplar_log",
            ModLogs::new);

    public static final RegistryObject<Block> BLACK_POPLAR_LEAVES = registerBlock("black_poplar_leaves",
            () -> new BlackPoplarLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.BLACK_POPLAR_FALL_LEAVES));
    public static final RegistryObject<Block> BLACK_POPLAR_FALL_LEAVES = registerBlock("black_poplar_fall_leaves",
            () -> new BlackPoplarFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.BLACK_POPLAR_WINTER_BRANCHES));
    public static final RegistryObject<Block> BLACK_POPLAR_WINTER_BRANCHES = registerBlock("black_poplar_winter_branches",
            () -> new BlackPoplarWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.BLACK_POPLAR_LEAVES));

    public static final RegistryObject<Block> BLACK_POPLAR_SAPLING = registerBlock("black_poplar_sapling",
            BlackPoplarSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_BLACK_POPLAR_SAPLING = BLOCKS.register("potted_black_poplar_sapling",
            () -> new FlowerPotBlock(TreeBlocks.BLACK_POPLAR_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> FREMONT_POPLAR_LEAVES = registerBlock("fremont_poplar_leaves",
            () -> new FremontPoplarLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.FREMONT_POPLAR_AUTUMN_LEAVES));
    public static final RegistryObject<Block> FREMONT_POPLAR_AUTUMN_LEAVES = registerBlock("fremont_poplar_autumn_leaves",
            () -> new FremontPoplarAutumnLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.FREMONT_POPLAR_WINTER_BRANCHES));
    public static final RegistryObject<Block> FREMONT_POPLAR_WINTER_BRANCHES = registerBlock("fremont_poplar_winter_branches",
            () -> new FremontPoplarWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.FREMONT_POPLAR_LEAVES));

    public static final RegistryObject<Block> FREMONT_POPLAR_SAPLING = registerBlock("fremont_poplar_sapling",
            FremontPoplarSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_FREMONT_POPLAR_SAPLING = BLOCKS.register("potted_fremont_poplar_sapling",
            () -> new FlowerPotBlock(TreeBlocks.FREMONT_POPLAR_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Blue Spruce
    public static final RegistryObject<Block> BLUE_SPRUCE_LEAVES = registerBlock("blue_spruce_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> BLUE_SPRUCE_SAPLING = registerBlock("blue_spruce_sapling",
            BlueSpruceSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_BLUE_SPRUCE_SAPLING = BLOCKS.register("potted_blue_spruce_sapling",
            () -> new FlowerPotBlock(TreeBlocks.BLUE_SPRUCE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    ///C
   //Camellia
    public static final RegistryObject<Block> CAMELLIA_LOG = registerBlock("camellia_log",
            ModLogs::new);
    public static final RegistryObject<Block> CAMELLIA_LEAVES = registerBlock("camellia_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> CAMELLIA_SAPLING = registerBlock("camellia_sapling",
            CamelliaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_CAMELLIA_SAPLING = BLOCKS.register("potted_camellia_sapling",
            () -> new FlowerPotBlock(TreeBlocks.CAMELLIA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> TEA_LEAVES = registerBlock("tea_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> TEA_SAPLING = registerBlock("tea_sapling",
            TeaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_TEA_SAPLING = BLOCKS.register("potted_tea_sapling",
            () -> new FlowerPotBlock(TreeBlocks.TEA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Carob
    public static final RegistryObject<Block> CAROB_LOG = registerBlock("carob_log",
            ModLogs::new);
    public static final RegistryObject<Block> CAROB_LEAVES = registerBlock("carob_leaves",
            CarobLeaves::new);
    public static final RegistryObject<Block> CAROB_SAPLING = registerBlock("carob_sapling",
            CarobSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_CAROB_SAPLING = BLOCKS.register("potted_carob_sapling",
            () -> new FlowerPotBlock(TreeBlocks.CAROB_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Canary Date
    public static final RegistryObject<Block> CANARY_DATE_LOG = registerBlock("canary_date_log",
            ModLogs::new);
    public static final RegistryObject<Block> CANARY_DATE_LEAVES = registerBlock("canary_date_leaves",
            () -> new DateLeaves(AbstractBlock.Properties.create(Material.LEAVES)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly() // Enables random ticks
                    .notSolid()
                    .sound(SoundType.PLANT)));
    public static final RegistryObject<Block> CANARY_DATE_SAPLING = registerBlock("canary_date_sapling",
            CanaryDateSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_CANARY_DATE_SAPLING = BLOCKS.register("potted_canary_date_sapling",
            () -> new FlowerPotBlock(TreeBlocks.CANARY_DATE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Canary Pine
    public static final RegistryObject<Block> CANARY_PINE_LOG = registerBlock("canary_pine_log",
            ModLogs::new);
    public static final RegistryObject<Block> CANARY_PINE_LEAVES = registerBlock("canary_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> CANARY_PINE_SAPLING = registerBlock("canary_pine_sapling",
            CanaryPineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_CANARY_PINE_SAPLING = BLOCKS.register("potted_canary_pine_sapling",
            () -> new FlowerPotBlock(TreeBlocks.CANARY_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



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
    public static final RegistryObject<Block> CHINESE_RED_PINE_SAPLING = registerBlock("chinese_red_pine_sapling",
            ChineseRedPineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_CHINESE_RED_PINE_SAPLING = BLOCKS.register("potted_chinese_red_pine_sapling",
            () -> new FlowerPotBlock(TreeBlocks.CHINESE_RED_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    //Crabapple
    public static final RegistryObject<Block> CRABAPPLE_LOG = registerBlock("crabapple_log",
            ModLogs::new);

    public static final RegistryObject<Block> PINK_CRABAPPLE_LEAVES = registerBlock("crabapple_pink_leaves",
            () -> new PinkCrabappleLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PINK_CRABAPPLE_FALL_LEAVES));
    public static final RegistryObject<Block> PINK_CRABAPPLE_BLOSSOM = registerBlock("crabapple_pink_blossom",
            () -> new PinkCrabappleBlossom(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PINK_CRABAPPLE_FRUITING_LEAVES));
    public static final RegistryObject<Block> PINK_CRABAPPLE_FRUITING_LEAVES = registerBlock("crabapple_pink_fruiting_leaves",
            () -> new PinkCrabappleFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PINK_CRABAPPLE_FALL_LEAVES));
    public static final RegistryObject<Block> PINK_CRABAPPLE_FALL_LEAVES = registerBlock("crabapple_pink_fall_leaves",
            () -> new PinkCrabappleFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PINK_CRABAPPLE_WINTER_BRANCHES));
    public static final RegistryObject<Block> PINK_CRABAPPLE_WINTER_BRANCHES = registerBlock("crabapple_pink_winter_branches",
            () -> new PinkCrabappleWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PINK_CRABAPPLE_BLOSSOM));

    public static final RegistryObject<Block> PINK_CRABAPPLE_SAPLING = registerBlock("crabapple_pink_sapling",
            PinkCrabappleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PINK_CRABAPPLE_SAPLING = BLOCKS.register("potted_crabapple_pink_sapling",
            () -> new FlowerPotBlock(TreeBlocks.PINK_CRABAPPLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    public static final RegistryObject<Block> WHITE_CRABAPPLE_LEAVES = registerBlock("crabapple_white_leaves",
            () -> new WhiteCrabappleLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WHITE_CRABAPPLE_FALL_LEAVES));
    public static final RegistryObject<Block> WHITE_CRABAPPLE_BLOSSOM = registerBlock("crabapple_white_blossom",
            () -> new WhiteCrabappleBlossom(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WHITE_CRABAPPLE_FRUITING_LEAVES));
    public static final RegistryObject<Block> WHITE_CRABAPPLE_FRUITING_LEAVES = registerBlock("crabapple_white_fruiting_leaves",
            () -> new WhiteCrabappleFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WHITE_CRABAPPLE_FALL_LEAVES));
    public static final RegistryObject<Block> WHITE_CRABAPPLE_FALL_LEAVES = registerBlock("crabapple_white_fall_leaves",
            () -> new WhiteCrabappleFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WHITE_CRABAPPLE_WINTER_BRANCHES));
    public static final RegistryObject<Block> WHITE_CRABAPPLE_WINTER_BRANCHES = registerBlock("crabapple_white_winter_branches",
            () -> new WhiteCrabappleWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WHITE_CRABAPPLE_BLOSSOM));

    public static final RegistryObject<Block> WHITE_CRABAPPLE_SAPLING = registerBlock("crabapple_white_sapling",
            WhiteCrabappleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_WHITE_CRABAPPLE_SAPLING = BLOCKS.register("potted_crabapple_white_sapling",
            () -> new FlowerPotBlock(TreeBlocks.WHITE_CRABAPPLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Crape Myrtle
    public static final RegistryObject<Block> MYRTLE_LOG = registerBlock("myrtle_log",
            ModLogs::new);

    public static final RegistryObject<Block> RED_CRAPE_MYRTLE_SPRING_LEAVES = registerBlock("crape_myrtle_red_spring_leaves",
            () -> new RedCrapeMyrtleSpringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.RED_CRAPE_MYRTLE_LEAVES));
    public static final RegistryObject<Block> RED_CRAPE_MYRTLE_LEAVES = registerBlock("crape_myrtle_red_leaves",
            () -> new RedCrapeMyrtleLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> RED_CRAPE_MYRTLE_FALL_LEAVES = registerBlock("crape_myrtle_red_fall_leaves",
            () -> new RedCrapeMyrtleFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.RED_CRAPE_MYRTLE_WINTER_BRANCHES));
    public static final RegistryObject<Block> RED_CRAPE_MYRTLE_WINTER_BRANCHES = registerBlock("crape_myrtle_red_winter_branches",
            () -> new RedCrapeMyrtleWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.RED_CRAPE_MYRTLE_SPRING_LEAVES));

    public static final RegistryObject<Block> RED_CRAPE_MYRTLE_SAPLING = registerBlock("crape_myrtle_red_sapling",
            RedCrapeMyrtleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_RED_CRAPE_MYRTLE_SAPLING = BLOCKS.register("potted_crape_myrtle_red_sapling",
            () -> new FlowerPotBlock(TreeBlocks.RED_CRAPE_MYRTLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    public static final RegistryObject<Block> WHITE_CRAPE_MYRTLE_SPRING_LEAVES = registerBlock("crape_myrtle_white_spring_leaves",
            () -> new WhiteCrapeMyrtleSpringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WHITE_CRAPE_MYRTLE_LEAVES));
    public static final RegistryObject<Block> WHITE_CRAPE_MYRTLE_LEAVES = registerBlock("crape_myrtle_white_leaves",
            () -> new WhiteCrapeMyrtleLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> WHITE_CRAPE_MYRTLE_FALL_LEAVES = registerBlock("crape_myrtle_white_fall_leaves",
            () -> new WhiteCrapeMyrtleFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WHITE_CRAPE_MYRTLE_WINTER_BRANCHES));
    public static final RegistryObject<Block> WHITE_CRAPE_MYRTLE_WINTER_BRANCHES = registerBlock("crape_myrtle_white_winter_branches",
            () -> new WhiteCrapeMyrtleWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WHITE_CRAPE_MYRTLE_SPRING_LEAVES));

    public static final RegistryObject<Block> WHITE_CRAPE_MYRTLE_SAPLING = registerBlock("crape_myrtle_white_sapling",
            WhiteCrapeMyrtleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_WHITE_CRAPE_MYRTLE_SAPLING = BLOCKS.register("potted_crape_myrtle_white_sapling",
            () -> new FlowerPotBlock(TreeBlocks.WHITE_CRAPE_MYRTLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    public static final RegistryObject<Block> PURPLE_CRAPE_MYRTLE_SPRING_LEAVES = registerBlock("crape_myrtle_purple_spring_leaves",
            () -> new PurpleCrapeMyrtleSpringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PURPLE_CRAPE_MYRTLE_LEAVES));
    public static final RegistryObject<Block> PURPLE_CRAPE_MYRTLE_LEAVES = registerBlock("crape_myrtle_purple_leaves",
            () -> new PurpleCrapeMyrtleLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> PURPLE_CRAPE_MYRTLE_FALL_LEAVES = registerBlock("crape_myrtle_purple_fall_leaves",
            () -> new PurpleCrapeMyrtleFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PURPLE_CRAPE_MYRTLE_WINTER_BRANCHES));
    public static final RegistryObject<Block> PURPLE_CRAPE_MYRTLE_WINTER_BRANCHES = registerBlock("crape_myrtle_purple_winter_branches",
            () -> new PurpleCrapeMyrtleWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PURPLE_CRAPE_MYRTLE_SPRING_LEAVES));

    public static final RegistryObject<Block> PURPLE_CRAPE_MYRTLE_SAPLING = registerBlock("crape_myrtle_purple_sapling",
            PurpleCrapeMyrtleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PURPLE_CRAPE_MYRTLE_SAPLING = BLOCKS.register("potted_crape_myrtle_purple_sapling",
            () -> new FlowerPotBlock(TreeBlocks.PURPLE_CRAPE_MYRTLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    public static final RegistryObject<Block> PINK_CRAPE_MYRTLE_SPRING_LEAVES = registerBlock("crape_myrtle_pink_spring_leaves",
            () -> new PinkCrapeMyrtleSpringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PINK_CRAPE_MYRTLE_LEAVES));
    public static final RegistryObject<Block> PINK_CRAPE_MYRTLE_LEAVES = registerBlock("crape_myrtle_pink_leaves",
            () -> new PinkCrapeMyrtleLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> PINK_CRAPE_MYRTLE_FALL_LEAVES = registerBlock("crape_myrtle_pink_fall_leaves",
            () -> new PinkCrapeMyrtleFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PINK_CRAPE_MYRTLE_WINTER_BRANCHES));
    public static final RegistryObject<Block> PINK_CRAPE_MYRTLE_WINTER_BRANCHES = registerBlock("crape_myrtle_pink_winter_branches",
            () -> new PinkCrapeMyrtleWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PINK_CRAPE_MYRTLE_SPRING_LEAVES));

    public static final RegistryObject<Block> PINK_CRAPE_MYRTLE_SAPLING = registerBlock("crape_myrtle_pink_sapling",
            PinkCrapeMyrtleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PINK_CRAPE_MYRTLE_SAPLING = BLOCKS.register("potted_crape_myrtle_pink_sapling",
            () -> new FlowerPotBlock(TreeBlocks.PINK_CRAPE_MYRTLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
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
    public static final RegistryObject<Block> CORK_OAK_SAPLING = registerBlock("cork_oak_sapling",
            CorkOakSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_CORK_OAK_SAPLING = BLOCKS.register("potted_cork_oak_sapling",
            () -> new FlowerPotBlock(TreeBlocks.CORK_OAK_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    //Coconut
    public static final RegistryObject<Block> COCONUT_LOG = registerBlock("coconut_log",
            ModLogs::new);
    public static final RegistryObject<Block> COCONUT_LEAVES = registerBlock("coconut_leaves",
            () -> new CoconutLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2f).tickRandomly()
                    .notSolid().sound(SoundType.PLANT)));
    public static final RegistryObject<Block> COCONUT_BUNCH = registerBlock("coconut_bunch",
            CoconutBunchBlock::new);
    public static final RegistryObject<Block> COCONUT_SAPLING = registerBlock("coconut_sapling",
            CoconutSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_COCONUT_SAPLING = BLOCKS.register("potted_coconut_sapling",
            () -> new FlowerPotBlock(TreeBlocks.COCONUT_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    ///D

    //Date
    public static final RegistryObject<Block> DATE_LOG = registerBlock("date_log",
            ModLogs::new);
    public static final RegistryObject<Block> DATE_LEAVES = registerBlock("date_leaves",
            () -> new DateLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2f).tickRandomly()
                    .notSolid().sound(SoundType.PLANT)));
    public static final RegistryObject<Block> DATE_BUNCH = registerBlock("date_bunch",
            DateBunchBlock::new);
    public static final RegistryObject<Block> DATE_SAPLING = registerBlock("date_sapling",
            DateSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_DATE_SAPLING = BLOCKS.register("potted_date_sapling",
            () -> new FlowerPotBlock(TreeBlocks.DATE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



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
    public static final RegistryObject<Block> DOUGLAS_FIR_SAPLING = registerBlock("douglas_fir_sapling",
            DouglasFirSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_DOUGLAS_FIR_SAPLING = BLOCKS.register("potted_douglas_fir_sapling",
            () -> new FlowerPotBlock(TreeBlocks.DOUGLAS_FIR_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



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
    public static final RegistryObject<Block> DURIAN_SAPLING = registerBlock("durian_sapling",
            DurianSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_DURIAN_SAPLING = BLOCKS.register("potted_durian_sapling",
            () -> new FlowerPotBlock(TreeBlocks.DURIAN_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    ///E
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
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ELDERBERRY_WINTER_BRANCHES));
    public static final RegistryObject<Block> ELDERBERRY_FALL_LEAVES = registerBlock("elderberry_fall_leaves",
            () -> new ElderberryFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ELDERBERRY_WINTER_BRANCHES));
    public static final RegistryObject<Block> ELDERBERRY_WINTER_BRANCHES = registerBlock("elderberry_winter_branches",
            () -> new ElderberryWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ELDERBERRY_LEAVES));

    public static final RegistryObject<Block> ELDERBERRY_SAPLING = registerBlock("elderberry_sapling",
            ElderberrySapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_ELDERBERRY_SAPLING = BLOCKS.register("potted_elderberry_sapling",
            () -> new FlowerPotBlock(TreeBlocks.ELDERBERRY_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    //Eucalyptus
    public static final RegistryObject<Block> EUCALYPTUS_LOG = registerBlock("eucalyptus_log",
            ModLogs::new);
    public static final RegistryObject<Block> EUCALYPTUS_LEAVES = registerBlock("eucalyptus_leaves",
            EucalyptusLeaves::new);
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
    public static final RegistryObject<Block> INDIAN_CORAL_SAPLING = registerBlock("indian_coral_sapling",
            IndianCoralSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_INDIAN_CORAL_SAPLING = BLOCKS.register("potted_indian_coral_sapling",
            () -> new FlowerPotBlock(TreeBlocks.INDIAN_CORAL_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));






    ///F
    //Fig
    public static final RegistryObject<Block> FIG_LOG = registerBlock("fig_log",
            ModLogs::new);

    public static final RegistryObject<Block> FIG_LEAVES = registerBlock("fig_leaves",
            () -> new FigLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> FIG_FRUITING_LEAVES = registerBlock("fig_fruiting_leaves",
            () -> new FigFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.FIG_LEAVES));
    public static final RegistryObject<Block> FIG_FALL_LEAVES = registerBlock("fig_fall_leaves",
            () -> new FigFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.FIG_WINTER_BRANCHES));
    public static final RegistryObject<Block> FIG_WINTER_BRANCHES = registerBlock("fig_winter_branches",
            () -> new FigWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.FIG_LEAVES));

    public static final RegistryObject<Block> WHITE_FIG_LEAVES = registerBlock("white_fig_leaves",
            () -> new WhiteFigLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> WHITE_FIG_FRUITING_LEAVES = registerBlock("white_fig_fruiting_leaves",
            () -> new WhiteFigFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WHITE_FIG_LEAVES));
    public static final RegistryObject<Block> WHITE_FIG_FALL_LEAVES = registerBlock("white_fig_fall_leaves",
            () -> new WhiteFigFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WHITE_FIG_WINTER_BRANCHES));
    public static final RegistryObject<Block> WHITE_FIG_WINTER_BRANCHES = registerBlock("white_fig_winter_branches",
            () -> new WhiteFigWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WHITE_FIG_LEAVES));

    public static final RegistryObject<Block> FIG_SAPLING = registerBlock("fig_sapling",
            FigSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_FIG_SAPLING = BLOCKS.register("potted_fig_sapling",
            () -> new FlowerPotBlock(TreeBlocks.FIG_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    public static final RegistryObject<Block> SYCAMORE_FIG_LEAVES = registerBlock("sycamore_fig_leaves",
            SycamoreFigLeaves::new);
    public static final RegistryObject<Block> SYCAMORE_FIG_SAPLING = registerBlock("sycamore_fig_sapling",
            SycamoreFigSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SYCAMORE_FIG_SAPLING = BLOCKS.register("potted_sycamore_fig_sapling",
            () -> new FlowerPotBlock(TreeBlocks.SYCAMORE_FIG_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    //Fir
    public static final RegistryObject<Block> SUBALPINE_FIR_LOG = registerBlock("subalpine_fir_log",
            ModLogs::new);
    public static final RegistryObject<Block> SUBALPINE_FIR_LEAVES = registerBlock("subalpine_fir_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> SUBALPINE_FIR_SAPLING = registerBlock("subalpine_fir_sapling",
            SubalpineFirSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SUBALPINE_FIR_SAPLING = BLOCKS.register("potted_subalpine_fir_sapling",
            () -> new FlowerPotBlock(TreeBlocks.SUBALPINE_FIR_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> WHITE_FIR_LEAVES = registerBlock("white_fir_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> WHITE_FIR_SAPLING = registerBlock("white_fir_sapling",
            WhiteFirSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_WHITE_FIR_SAPLING = BLOCKS.register("potted_white_fir_sapling",
            () -> new FlowerPotBlock(TreeBlocks.WHITE_FIR_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));





///G




    ///H
//Hawthorn
    public static final RegistryObject<Block> HAWTHORN_LOG = registerBlock("hawthorn_log",
            ModLogs::new);

    public static final RegistryObject<Block> HAWTHORN_LEAVES = registerBlock("hawthorn_leaves",
            () -> new HawthornLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> HAWTHORN_FRUITING_LEAVES = registerBlock("hawthorn_fruiting_leaves",
            () -> new HawthornFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));

    public static final RegistryObject<Block> HAWTHORN_FLOWERING_LEAVES = registerBlock("hawthorn_flowering_leaves",
            () -> new HawthornFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.HAWTHORN_FRUITING_LEAVES));

    public static final RegistryObject<Block> HAWTHORN_FALL_LEAVES = registerBlock("hawthorn_fall_leaves",
            () -> new HawthornFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> HAWTHORN_FALL_FRUITING_LEAVES = registerBlock("hawthorn_fall_fruiting_leaves",
            () -> new HawthornFallFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));

    public static final RegistryObject<Block> HAWTHORN_WINTER_BRANCHES = registerBlock("hawthorn_winter_branches",
            () -> new HawthornWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.HAWTHORN_FLOWERING_LEAVES));
    public static final RegistryObject<Block> HAWTHORN_WINTER_FRUITING_BRANCHES = registerBlock("hawthorn_winter_fruiting_branches",
            () -> new HawthornWinterFruitingBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.HAWTHORN_FLOWERING_LEAVES));

    public static final RegistryObject<Block> HAWTHORN_SAPLING = registerBlock("hawthorn_sapling",
            HawthornSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_HAWTHORN_SAPLING = BLOCKS.register("potted_hawthorn_sapling",
            () -> new FlowerPotBlock(TreeBlocks.HAWTHORN_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    //Hazelnut
    public static final RegistryObject<Block> HAZELNUT_LOG = registerBlock("hazelnut_log",
            ModLogs::new);

    public static final RegistryObject<Block> HAZELNUT_LEAVES = registerBlock("hazelnut_leaves",
            () -> new HazelnutLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.HAZELNUT_FALL_LEAVES));
    public static final RegistryObject<Block> HAZELNUT_FLOWERING_LEAVES = registerBlock("hazelnut_flowering_leaves",
            () -> new HazelnutFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.HAZELNUT_FRUITING_LEAVES));
    public static final RegistryObject<Block> HAZELNUT_FRUITING_LEAVES = registerBlock("hazelnut_fruiting_leaves",
            () -> new HazelnutFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.HAZELNUT_FALL_LEAVES));
    public static final RegistryObject<Block> HAZELNUT_FALL_LEAVES = registerBlock("hazelnut_fall_leaves",
            () -> new HazelnutFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.HAZELNUT_WINTER_BRANCHES));
    public static final RegistryObject<Block> HAZELNUT_WINTER_BRANCHES = registerBlock("hazelnut_winter_branches",
            () -> new HazelnutWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.HAZELNUT_SPRING_BLOOM));
    public static final RegistryObject<Block> HAZELNUT_SPRING_BLOOM = registerBlock("hazelnut_spring_bloom",
            () -> new HazelnutSpringBloom(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.HAZELNUT_FLOWERING_LEAVES));

    public static final RegistryObject<Block> HAZELNUT_SAPLING = registerBlock("hazelnut_sapling",
            HazelnutSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_HAZELNUT_SAPLING = BLOCKS.register("potted_hazelnut_sapling",
            () -> new FlowerPotBlock(TreeBlocks.HAZELNUT_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Holm Oak
    public static final RegistryObject<Block> HOLM_OAK_LOG = registerBlock("holm_oak_log",
            ModLogs::new);
    public static final RegistryObject<Block> HOLM_OAK_LEAVES = registerBlock("holm_oak_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> HOLM_OAK_SAPLING = registerBlock("holm_oak_sapling",
            HolmOakSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_HOLM_OAK_SAPLING = BLOCKS.register("potted_holm_oak_sapling",
            () -> new FlowerPotBlock(TreeBlocks.HOLM_OAK_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    //Holly
    public static final RegistryObject<Block> HOLLY_LOG = registerBlock("ilex_log",
            ModLogs::new);
    public static final RegistryObject<Block> HOLLY_LEAVES = registerBlock("holly_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> HOLLY_SAPLING = registerBlock("holly_sapling",
            HollySapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_HOLLY_SAPLING = BLOCKS.register("potted_holly_sapling",
            () -> new FlowerPotBlock(TreeBlocks.HOLLY_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));






    ///I
//Italian Cypress
    public static final RegistryObject<Block> ITALIAN_CYPRESS_LOG = registerBlock("italian_cypress_log",
            ModLogs::new);
    public static final RegistryObject<Block> ITALIAN_CYPRESS_LEAVES = registerBlock("italian_cypress_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> ITALIAN_CYPRESS_SAPLING = registerBlock("italian_cypress_sapling",
            ItalianCypressSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_ITALIAN_CYPRESS_SAPLING = BLOCKS.register("potted_italian_cypress_sapling",
            () -> new FlowerPotBlock(TreeBlocks.ITALIAN_CYPRESS_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));




    ///J
//Japanese Pine
    public static final RegistryObject<Block> JAPANESE_PINE_LOG = registerBlock("japanese_pine_log",
            ModLogs::new);
    public static final RegistryObject<Block> JAPANESE_PINE_LEAVES = registerBlock("japanese_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> JAPANESE_PINE_SAPLING = registerBlock("japanese_pine_sapling",
            JapanesePineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_JAPANESE_PINE_SAPLING = BLOCKS.register("potted_japanese_pine_sapling",
            () -> new FlowerPotBlock(TreeBlocks.JAPANESE_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Japanese Maple
    public static final RegistryObject<Block> JAPANESE_MAPLE_LOG = registerBlock("japanese_maple_log",
            ModLogs::new);
    public static final RegistryObject<Block> JAPANESE_MAPLE_LEAVES = registerBlock("japanese_maple_leaves",
            ModLeaves::new);
    /*public static final RegistryObject<Block> JAPANESE_MAPLE_WINTER_BRANCHES = registerBlock("japanese_maple_winter_branches",
            JapaneseMapleWinterBranches::new);*/
    public static final RegistryObject<Block> JAPANESE_MAPLE_SAPLING = registerBlock("japanese_maple_sapling",
            JapaneseMapleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_JAPANESE_MAPLE_SAPLING = BLOCKS.register("potted_japanese_maple_sapling",
            () -> new FlowerPotBlock(TreeBlocks.JAPANESE_MAPLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));




    //Jungle Figs
    public static final RegistryObject<Block> JUNGLE_FIG_LOG = registerBlock("jungle_fig_log",
            ModLogs::new);
    public static final RegistryObject<Block> WEEPING_FIG_LEAVES = registerBlock("weeping_fig_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> WEEPING_FIG_SAPLING = registerBlock("weeping_fig_sapling",
            WeepingFigSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_WEEPING_FIG_SAPLING = BLOCKS.register("potted_weeping_fig_sapling",
            () -> new FlowerPotBlock(TreeBlocks.WEEPING_FIG_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> INDIAN_LAUREL_LEAVES = registerBlock("indian_laurel_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> INDIAN_LAUREL_SAPLING = registerBlock("indian_laurel_sapling",
            IndianLaurelSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_INDIAN_LAUREL_SAPLING = BLOCKS.register("potted_indian_laurel_sapling",
            () -> new FlowerPotBlock(TreeBlocks.INDIAN_LAUREL_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Juniper
    public static final RegistryObject<Block> JUNIPER_LOG = registerBlock("juniper_log",
            ModLogs::new);
    public static final RegistryObject<Block> JUNIPER_LEAVES = registerBlock("juniper_leaves",
            JuniperLeaves::new);
    public static final RegistryObject<Block> JUNIPER_SAPLING = registerBlock("juniper_sapling",
            JuniperSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_JUNIPER_SAPLING = BLOCKS.register("potted_juniper_sapling",
            () -> new FlowerPotBlock(TreeBlocks.JUNIPER_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));





///K






    ///L
//Live Oak
    public static final RegistryObject<Block> LIVE_OAK_LOG = registerBlock("live_oak_log",
            ModLogs::new);
    public static final RegistryObject<Block> LIVE_OAK_LEAVES = registerBlock("live_oak_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> LIVE_OAK_SAPLING = registerBlock("live_oak_sapling",
            LiveOakSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_LIVE_OAK_SAPLING = BLOCKS.register("potted_live_oak_sapling",
            () -> new FlowerPotBlock(TreeBlocks.LIVE_OAK_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Larch
    public static final RegistryObject<Block> LARCH_LOG = registerBlock("larch_log",
            ModLogs::new);

    public static final RegistryObject<Block> LARCH_LEAVES = registerBlock("larch_leaves",
            ModLeaves::new);
    /*public static final RegistryObject<Block> LARCH_FALL_LEAVES = registerBlock("larch_fall_leaves",
            LarchFallLeaves::new);
    public static final RegistryObject<Block> LARCH_WINTER_LEAVES = registerBlock("larch_winter_leaves",
            LarchWinterLeaves::new);*/

    public static final RegistryObject<Block> LARCH_SAPLING = registerBlock("larch_sapling",
            LarchSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_LARCH_SAPLING = BLOCKS.register("potted_larch_sapling",
            () -> new FlowerPotBlock(TreeBlocks.LARCH_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



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
    public static final RegistryObject<Block> LOQUAT_SAPLING = registerBlock("loquat_sapling",
            LoquatSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_LOQUAT_SAPLING = BLOCKS.register("potted_loquat_sapling",
            () -> new FlowerPotBlock(TreeBlocks.LOQUAT_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));




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
    public static final RegistryObject<Block> MANGO_SAPLING = registerBlock("mango_sapling",
            MangoSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_MANGO_SAPLING = BLOCKS.register("potted_mango_sapling",
            () -> new FlowerPotBlock(TreeBlocks.MANGO_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Marula
    public static final RegistryObject<Block> MARULA_LOG = registerBlock("marula_log",
            ModLogs::new);
    public static final RegistryObject<Block> MARULA_LEAVES = registerBlock("marula_leaves",
            () -> new MarulaLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.MARULA_FRUITING_LEAVES));
    public static final RegistryObject<Block> MARULA_FRUITING_LEAVES = registerBlock("marula_fruiting_leaves",
            () -> new MarulaFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.MARULA_LEAVES));
    public static final RegistryObject<Block> MARULA_DRIED_BRANCHES = registerBlock("marula_dried_branches",
            () -> new MarulaLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.MARULA_FRUITING_LEAVES));

    public static final RegistryObject<Block> MARULA_SAPLING = registerBlock("marula_sapling",
            MarulaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_MARULA_SAPLING = BLOCKS.register("potted_marula_sapling",
            () -> new FlowerPotBlock(TreeBlocks.MARULA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Mesquite
    public static final RegistryObject<Block> MESQUITE_LOG = registerBlock("mesquite_log",
            ModLogs::new);
    public static final RegistryObject<Block> MESQUITE_LEAVES = registerBlock("mesquite_leaves",
            ModLeaves::new);
    /*public static final RegistryObject<Block> MESQUITE_WINTER_BRANCHES = registerBlock("mesquite_winter_branches",
            ModLeaves::new); //Only to Temperate Biomes (excluding subtropical and tropical)*/
    public static final RegistryObject<Block> MESQUITE_SAPLING = registerBlock("mesquite_sapling",
            MesquiteSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_MESQUITE_SAPLING = BLOCKS.register("potted_mesquite_sapling",
            () -> new FlowerPotBlock(TreeBlocks.MESQUITE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    //Southern Wax Myrtle
    public static final RegistryObject<Block> SOUTHERN_WAX_MYRTLE_LEAVES = registerBlock("southern_wax_myrtle_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> SOUTHERN_WAX_MYRTLE_SAPLING = registerBlock("southern_wax_myrtle_sapling",
            SouthernWaxMyrtleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SOUTHERN_WAX_MYRTLE_SAPLING = BLOCKS.register("potted_southern_wax_myrtle_sapling",
            () -> new FlowerPotBlock(TreeBlocks.SOUTHERN_WAX_MYRTLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Mulberry
    public static final RegistryObject<Block> MULBERRY_LOG = registerBlock("mulberry_log",
            ModLogs::new);
    public static final RegistryObject<Block> MULBERRY_LEAVES = registerBlock("mulberry_leaves",
            () -> new MulberryLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> MULBERRY_FRUITING_LEAVES = registerBlock("mulberry_fruiting_leaves",
            () -> new MulberryFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> MULBERRY_FALL_LEAVES = registerBlock("mulberry_fall_leaves",
            () -> new MulberryLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE))); //Only subtropical - temperate climate
    public static final RegistryObject<Block> MULBERRY_WINTER_BRANCHES = registerBlock("mulberry_winter_branches",
            () -> new MulberryLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> MULBERRY_SAPLING = registerBlock("mulberry_sapling",
            MulberrySapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_MULBERRY_SAPLING = BLOCKS.register("potted_mulberry_sapling",
            () -> new FlowerPotBlock(TreeBlocks.MULBERRY_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    //Mugo Pine
    public static final RegistryObject<Block> MUGO_PINE_LOG = registerBlock("mugo_pine_log",
            ModLogs::new);
    public static final RegistryObject<Block> MUGO_PINE_LEAVES = registerBlock("mugo_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> MUGO_PINE_SAPLING = registerBlock("mugo_pine_sapling",
            MugoPineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_MUGO_PINE_SAPLING = BLOCKS.register("potted_mugo_pine_sapling",
            () -> new FlowerPotBlock(TreeBlocks.MUGO_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));





    ///N
//Nothofagus
    public static final RegistryObject<Block> NOTHOFAGUS_LOG = registerBlock("nothofagus_log",
            ModLogs::new);
    public static final RegistryObject<Block> SOUTHERN_BEECH_LEAVES = registerBlock("southern_beech_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> SOUTHERN_BEECH_SAPLING = registerBlock("southern_beech_sapling",
            SouthernBeechSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SOUTHERN_BEECH_SAPLING = BLOCKS.register("potted_southern_beech_sapling",
            () -> new FlowerPotBlock(TreeBlocks.SOUTHERN_BEECH_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));






    ///O
//Ocotea
    public static final RegistryObject<Block> OCOTEA_FOREST_LOG = registerBlock("ocotea_forest_log",
            ModLogs::new);
    public static final RegistryObject<Block> OCOTEA_JUNGLE_LOG = registerBlock("ocotea_jungle_log",
            ModLogs::new);
    public static final RegistryObject<Block> OCOTEA_LEAVES = registerBlock("ocotea_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> OCOTEA_FOREST_SAPLING = registerBlock("ocotea_forest_sapling",
            OcoteaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_OCOTEA_FOREST_SAPLING = BLOCKS.register("potted_ocotea_forest_sapling",
            () -> new FlowerPotBlock(TreeBlocks.OCOTEA_FOREST_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Oil Palm
    public static final RegistryObject<Block> OIL_PALM_LOG = registerBlock("oil_palm_log",
            ModLogs::new);
    public static final RegistryObject<Block> OIL_PALM_LEAVES = registerBlock("oil_palm_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> OIL_PALM_SAPLING = registerBlock("oil_palm_sapling",
            OilPalmSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_OIL_PALM_SAPLING = BLOCKS.register("potted_oil_palm_sapling",
            () -> new FlowerPotBlock(TreeBlocks.OIL_PALM_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Oleander
    public static final RegistryObject<Block> OLEANDER_LOG = registerBlock("oleander_log",
            ModLogs::new);
    public static final RegistryObject<Block> OLEANDER_DARK_PINK_LEAVES = registerBlock("oleander_dark_pink_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> OLEANDER_DARK_PINK_SAPLING = registerBlock("oleander_dark_pink_sapling",
            DarkPinkOleanderSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_OLEANDER_DARK_PINK_SAPLING = BLOCKS.register("potted_oleander_dark_pink_sapling",
            () -> new FlowerPotBlock(TreeBlocks.OLEANDER_DARK_PINK_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> OLEANDER_PINK_LEAVES = registerBlock("oleander_pink_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> OLEANDER_PINK_SAPLING = registerBlock("oleander_pink_sapling",
            PinkOleanderSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_OLEANDER_PINK_SAPLING = BLOCKS.register("potted_oleander_pink_sapling",
            () -> new FlowerPotBlock(TreeBlocks.OLEANDER_PINK_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> OLEANDER_RED_LEAVES = registerBlock("oleander_red_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> OLEANDER_RED_SAPLING = registerBlock("oleander_red_sapling",
            RedOleanderSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_OLEANDER_RED_SAPLING = BLOCKS.register("potted_oleander_red_sapling",
            () -> new FlowerPotBlock(TreeBlocks.OLEANDER_RED_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> OLEANDER_WHITE_LEAVES = registerBlock("oleander_white_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> OLEANDER_WHITE_SAPLING = registerBlock("oleander_white_sapling",
            WhiteOleanderSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_OLEANDER_WHITE_SAPLING = BLOCKS.register("potted_oleander_white_sapling",
            () -> new FlowerPotBlock(TreeBlocks.OLEANDER_WHITE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Olive
    public static final RegistryObject<Block> OLIVE_LOG = registerBlock("olive_log",
            ModLogs::new);
    public static final RegistryObject<Block> OLIVE_LEAVES = registerBlock("olive_leaves",
            () -> new OliveLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.OLIVE_FRUITING_LEAVES));
    public static final RegistryObject<Block> OLIVE_FRUITING_LEAVES = registerBlock("olive_fruiting_leaves",
            () -> new OliveFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.OLIVE_LEAVES));
    public static final RegistryObject<Block> OLIVE_SAPLING = registerBlock("olive_sapling",
            OliveSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_OLIVE_SAPLING = BLOCKS.register("potted_olive_sapling",
            () -> new FlowerPotBlock(TreeBlocks.OLIVE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));




    ///P
//Pecan
    public static final RegistryObject<Block> PECAN_LOG = registerBlock("pecan_log",
            ModLogs::new);
    public static final RegistryObject<Block> PECAN_LEAVES = registerBlock("pecan_leaves",
            () -> new PecanLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PECAN_FRUITING_LEAVES));
    public static final RegistryObject<Block> PECAN_FRUITING_LEAVES = registerBlock("pecan_fruiting_leaves",
            () -> new PecanFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PECAN_FALL_LEAVES));
    public static final RegistryObject<Block> PECAN_FALL_LEAVES = registerBlock("pecan_fall_leaves",
            () -> new PecanFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PECAN_WINTER_BRANCHES));
    public static final RegistryObject<Block> PECAN_WINTER_BRANCHES = registerBlock("pecan_winter_branches",
            () -> new PecanWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PECAN_LEAVES));
    public static final RegistryObject<Block> PECAN_SAPLING = registerBlock("pecan_sapling",
            PecanSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PECAN_SAPLING = BLOCKS.register("potted_pecan_sapling",
            () -> new FlowerPotBlock(TreeBlocks.PECAN_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    //Persimmon
    public static final RegistryObject<Block> PERSIMMON_LOG = registerBlock("persimmon_log",
            ModLogs::new);

    public static final RegistryObject<Block> PERSIMMON_LEAVES = registerBlock("persimmon_leaves",
            () -> new PersimmonLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> PERSIMMON_FALL_LEAVES = registerBlock("persimmon_fall_leaves",
            () -> new PersimmonFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PERSIMMON_WINTER_BRANCHES));

    public static final RegistryObject<Block> PERSIMMON_FLOWERING_LEAVES = registerBlock("persimmon_flowering_leaves",
            () -> new PersimmonFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PERSIMMON_FRUITING_LEAVES));

    public static final RegistryObject<Block> PERSIMMON_FRUITING_LEAVES = registerBlock("persimmon_fruiting_leaves",
            () -> new PersimmonFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> PERSIMMON_FALL_FRUITING_LEAVES = registerBlock("persimmon_fall_fruiting_leaves",
            () -> new PersimmonFallFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PERSIMMON_WINTER_FRUITING_BRANCHES));

    public static final RegistryObject<Block> PERSIMMON_WINTER_BRANCHES = registerBlock("persimmon_winter_branches",
            () -> new PersimmonWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PERSIMMON_LEAVES));
    public static final RegistryObject<Block> PERSIMMON_WINTER_FRUITING_BRANCHES = registerBlock("persimmon_winter_fruiting_branches",
            () -> new PersimmonWinterFruitingBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PERSIMMON_WINTER_BRANCHES));

    public static final RegistryObject<Block> PERSIMMON_SAPLING = registerBlock("persimmon_sapling",
            PersimmonSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PERSIMMON_SAPLING = BLOCKS.register("potted_persimmon_sapling",
            () -> new FlowerPotBlock(TreeBlocks.PERSIMMON_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    public static final RegistryObject<Block> JACKALBERRY_LEAVES = registerBlock("jackalberry_leaves",
            JackalberryLeaves::new);
    public static final RegistryObject<Block> JACKALBERRY_SAPLING = registerBlock("jackalberry_sapling",
            JackalberrySapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_JACKALBERRY_SAPLING = BLOCKS.register("potted_jackalberry_sapling",
            () -> new FlowerPotBlock(TreeBlocks.JACKALBERRY_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    //Pinyon
    public static final RegistryObject<Block> PINYON_LOG = registerBlock("pinyon_log",
            ModLogs::new);
    public static final RegistryObject<Block> PINYON_LEAVES = registerBlock("pinyon_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> PINYON_SAPLING = registerBlock("pinyon_sapling",
            PinyonSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PINYON_SAPLING = BLOCKS.register("potted_pinyon_sapling",
            () -> new FlowerPotBlock(TreeBlocks.PINYON_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    //Pistachio
    public static final RegistryObject<Block> PISTACHIO_LOG = registerBlock("pistachio_log",
            ModLogs::new);
    public static final RegistryObject<Block> PISTACHIO_LEAVES = registerBlock("pistachio_leaves",
            () -> new PistachioLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PISTACHIO_FRUITING_LEAVES));
    public static final RegistryObject<Block> PISTACHIO_FRUITING_LEAVES = registerBlock("pistachio_fruiting_leaves",
            () -> new PistachioFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PISTACHIO_LEAVES));
    public static final RegistryObject<Block> PISTACHIO_SAPLING = registerBlock("pistachio_sapling",
            PistachioSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PISTACHIO_SAPLING = BLOCKS.register("potted_pistachio_sapling",
            () -> new FlowerPotBlock(TreeBlocks.PISTACHIO_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    //Plane
    public static final RegistryObject<Block> PLANE_LOG = registerBlock("plane_log",
            ModLogs::new);

    public static final RegistryObject<Block> PLANE_LEAVES = registerBlock("plane_leaves",
            () -> new PlaneLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PLANE_FALL_LEAVES));
    public static final RegistryObject<Block> PLANE_FALL_LEAVES = registerBlock("plane_fall_leaves",
            () -> new PlaneFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PLANE_WINTER_BRANCHES));
    public static final RegistryObject<Block> PLANE_WINTER_BRANCHES = registerBlock("plane_winter_branches",
            () -> new PlaneWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PLANE_LEAVES));

    public static final RegistryObject<Block> PLANE_SAPLING = registerBlock("plane_sapling",
            PlaneSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PLANE_SAPLING = BLOCKS.register("potted_plane_sapling",
            () -> new FlowerPotBlock(TreeBlocks.PLANE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Ponderosa Pine
    public static final RegistryObject<Block> PONDEROSA_PINE_LOG = registerBlock("ponderosa_pine_log",
            ModLogs::new);
    public static final RegistryObject<Block> PONDEROSA_PINE_LEAVES = registerBlock("ponderosa_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> PONDEROSA_PINE_SAPLING = registerBlock("ponderosa_pine_sapling",
            PonderosaPineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PONDEROSA_PINE_SAPLING = BLOCKS.register("potted_ponderosa_pine_sapling",
            () -> new FlowerPotBlock(TreeBlocks.PONDEROSA_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Pomegranate
    public static final RegistryObject<Block> POMEGRANATE_LOG = registerBlock("pomegranate_log",
            ModLogs::new);
    public static final RegistryObject<Block> POMEGRANATE_LEAVES = registerBlock("pomegranate_leaves",
                    () -> new PomegranateLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                            .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> POMEGRANATE_FALL_LEAVES = registerBlock("pomegranate_fall_leaves",
                    () -> new PomegranateFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                            .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.POMEGRANATE_WINTER_BRANCHES));

    public static final RegistryObject<Block> POMEGRANATE_FLOWERING_LEAVES = registerBlock("pomegranate_flowering_leaves",
                    () -> new PomegranateFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                            .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.POMEGRANATE_FRUITING_LEAVES));

    public static final RegistryObject<Block> POMEGRANATE_FRUITING_LEAVES = registerBlock("pomegranate_fruiting_leaves",
            () -> new PomegranateFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> POMEGRANATE_FALL_FRUITING_LEAVES = registerBlock("pomegranate_fall_fruiting_leaves",
            () -> new PomegranateFallFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.POMEGRANATE_WINTER_FRUITING_BRANCHES));

    public static final RegistryObject<Block> POMEGRANATE_WINTER_BRANCHES = registerBlock("pomegranate_winter_branches",
            () -> new PomegranateWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.POMEGRANATE_LEAVES));
    public static final RegistryObject<Block> POMEGRANATE_WINTER_FRUITING_BRANCHES = registerBlock("pomegranate_winter_fruiting_branches",
            () -> new PomegranateWinterFruitingBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.POMEGRANATE_WINTER_BRANCHES)); //Pomegranate actually drop most of their fruit in fall.

    public static final RegistryObject<Block> POMEGRANATE_SAPLING = registerBlock("pomegranate_sapling",
            PomegranateSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_POMEGRANATE_SAPLING = BLOCKS.register("potted_pomegranate_sapling",
            () -> new FlowerPotBlock(TreeBlocks.POMEGRANATE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Pohutukawa
    public static final RegistryObject<Block> POHUTUKAWA_LOG = registerBlock("pohutukawa_log",
            ModLogs::new);
    public static final RegistryObject<Block> POHUTUKAWA_LEAVES = registerBlock("pohutukawa_leaves",
            () -> new PohutukawaLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.POHUTUKAWA_FLOWERING_LEAVES));
    public static final RegistryObject<Block> POHUTUKAWA_FLOWERING_LEAVES = registerBlock("pohutukawa_flowering_leaves",
            () -> new PohutukawaFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.POHUTUKAWA_LEAVES));
    public static final RegistryObject<Block> POHUTUKAWA_SAPLING = registerBlock("pohutukawa_sapling",
            PohutukawaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_POHUTUKAWA_SAPLING = BLOCKS.register("potted_pohutukawa_sapling",
            () -> new FlowerPotBlock(TreeBlocks.POHUTUKAWA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    //Plum
    public static final RegistryObject<Block> PLUM_LOG = registerBlock("plum_log",
            ModLogs::new);

    public static final RegistryObject<Block> CHERRY_PLUM_LEAVES = registerBlock("cherry_plum_leaves",
            () -> new CherryPlumLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.CHERRY_PLUM_FALL_LEAVES));
    public static final RegistryObject<Block> CHERRY_PLUM_FLOWERING_LEAVES = registerBlock("cherry_plum_flowering_leaves",
            () -> new CherryPlumFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> CHERRY_PLUM_FRUITING_LEAVES = registerBlock("cherry_plum_fruiting_leaves",
            () -> new CherryPlumFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.CHERRY_PLUM_FALL_LEAVES));
    public static final RegistryObject<Block> CHERRY_PLUM_FALL_LEAVES = registerBlock("cherry_plum_fall_leaves",
            () -> new CherryPlumFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.CHERRY_PLUM_WINTER_BRANCHES));
    public static final RegistryObject<Block> CHERRY_PLUM_WINTER_BRANCHES = registerBlock("cherry_plum_winter_branches",
            () -> new CherryPlumWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));

    public static final RegistryObject<Block> CHERRY_PLUM_SAPLING = registerBlock("cherry_plum_sapling",
            CherryPlumSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_CHERRY_PLUM_SAPLING = BLOCKS.register("potted_cherry_plum_sapling",
            () -> new FlowerPotBlock(TreeBlocks.CHERRY_PLUM_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Peach
    public static final RegistryObject<Block> PEACH_LEAVES = registerBlock("peach_leaves",
            () -> new PeachLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PEACH_FALL_LEAVES));
    public static final RegistryObject<Block> PEACH_FALL_LEAVES = registerBlock("peach_fall_leaves",
            () -> new PeachFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PEACH_WINTER_BRANCHES));
    public static final RegistryObject<Block> PEACH_WINTER_BRANCHES = registerBlock("peach_winter_branches",
            () -> new PeachWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PEACH_BLOSSOM));
    public static final RegistryObject<Block> PEACH_BLOSSOM = registerBlock("peach_blossom",
            () -> new PeachBlossom(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PEACH_FRUITING_LEAVES));
    public static final RegistryObject<Block> PEACH_FRUITING_LEAVES = registerBlock("peach_fruiting_leaves",
            () -> new PeachFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PEACH_LEAVES));

    public static final RegistryObject<Block> PEACH_SAPLING = registerBlock("peach_sapling",
            PeachSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PEACH_SAPLING = BLOCKS.register("potted_peach_sapling",
            () -> new FlowerPotBlock(TreeBlocks.PEACH_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



///Q






    ///R
//Red Kapok
    public static final RegistryObject<Block> RED_KAPOK_LEAVES = registerBlock("red_kapok_leaves",
            () -> new RedKapokLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.RED_KAPOK_WINTER_BRANCHES));
    public static final RegistryObject<Block> RED_KAPOK_WINTER_BRANCHES = registerBlock("red_kapok_winter_branches",
            () -> new RedKapokWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.RED_KAPOK_FLOWERING_BRANCHES));
    public static final RegistryObject<Block> RED_KAPOK_FLOWERING_BRANCHES = registerBlock("red_kapok_flowering_branches",
            () -> new RedKapokFloweringBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.RED_KAPOK_LEAVES));
    public static final RegistryObject<Block> RED_KAPOK_SAPLING = registerBlock("red_kapok_sapling",
            RedKapokSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_RED_KAPOK_SAPLING = BLOCKS.register("potted_red_kapok_sapling",
            () -> new FlowerPotBlock(TreeBlocks.RED_KAPOK_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Red Oak
    public static final RegistryObject<Block> RED_OAK_LEAVES = registerBlock("red_oak_leaves",
            () -> new RedOakLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.RED_OAK_FALL_LEAVES));
    public static final RegistryObject<Block> RED_OAK_FALL_LEAVES = registerBlock("red_oak_fall_leaves",
            () -> new RedOakFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.RED_OAK_WINTER_BRANCHES));
    public static final RegistryObject<Block> RED_OAK_WINTER_BRANCHES = registerBlock("red_oak_winter_branches",
            () -> new RedOakWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.RED_OAK_LEAVES));
    public static final RegistryObject<Block> RED_OAK_SAPLING = registerBlock("red_oak_sapling",
            RedOakSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_RED_OAK_SAPLING = BLOCKS.register("potted_red_oak_sapling",
            () -> new FlowerPotBlock(TreeBlocks.RED_OAK_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Red Maple
    public static final RegistryObject<Block> RED_MAPLE_LEAVES = registerBlock("red_maple_leaves",
            () -> new RedMapleLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.RED_MAPLE_FALL_LEAVES));
    public static final RegistryObject<Block> RED_MAPLE_FALL_LEAVES = registerBlock("red_maple_fall_leaves",
            () -> new RedMapleFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.RED_MAPLE_WINTER_BRANCHES));
    public static final RegistryObject<Block> RED_MAPLE_WINTER_BRANCHES = registerBlock("red_maple_winter_branches",
            () -> new RedMapleWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.RED_MAPLE_LEAVES));

    public static final RegistryObject<Block> RED_MAPLE_SAPLING = registerBlock("red_maple_sapling",
            RedMapleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_RED_MAPLE_SAPLING = BLOCKS.register("potted_red_maple_sapling",
            () -> new FlowerPotBlock(TreeBlocks.RED_MAPLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Rowan
    public static final RegistryObject<Block> ROWAN_LOG = registerBlock("rowan_log",
            ModLogs::new);

    public static final RegistryObject<Block> ROWAN_LEAVES = registerBlock("rowan_leaves",
            () -> new RowanLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> ROWAN_FRUITING_LEAVES = registerBlock("rowan_fruiting_leaves",
            () -> new RowanFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));

    public static final RegistryObject<Block> ROWAN_FLOWERING_LEAVES = registerBlock("rowan_flowering_leaves",
            () -> new RowanFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ROWAN_FRUITING_LEAVES));

    public static final RegistryObject<Block> ROWAN_FALL_LEAVES = registerBlock("rowan_fall_leaves",
            () -> new RowanFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> ROWAN_FALL_FRUITING_LEAVES = registerBlock("rowan_fall_fruiting_leaves",
            () -> new RowanFallFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));

    public static final RegistryObject<Block> ROWAN_WINTER_BRANCHES = registerBlock("rowan_winter_branches",
            () -> new RowanWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ROWAN_FLOWERING_LEAVES));
    public static final RegistryObject<Block> ROWAN_WINTER_FRUITING_BRANCHES = registerBlock("rowan_winter_fruiting_branches",
            () -> new RowanWinterFruitingBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ROWAN_FLOWERING_LEAVES));

    public static final RegistryObject<Block> ROWAN_SAPLING = registerBlock("rowan_sapling",
            RowanSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_ROWAN_SAPLING = BLOCKS.register("potted_rowan_sapling",
            () -> new FlowerPotBlock(TreeBlocks.ROWAN_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    //Royal Poinciana
    public static final RegistryObject<Block> ROYAL_POINCIANA_LOG = registerBlock("royal_poinciana_log",
            ModLogs::new);
    public static final RegistryObject<Block> ROYAL_POINCIANA_LEAVES = registerBlock("royal_poinciana_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> ROYAL_POINCIANA_SAPLING = registerBlock("royal_poinciana_sapling",
            RoyalPoincianaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_ROYAL_POINCIANA_SAPLING = BLOCKS.register("potted_royal_poinciana_sapling",
            () -> new FlowerPotBlock(TreeBlocks.ROYAL_POINCIANA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));






    ///S
//Sabal
    public static final RegistryObject<Block> SABAL_LOG = registerBlock("sabal_log",
            ModLogs::new);
    public static final RegistryObject<Block> SABAL_LEAVES = registerBlock("sabal_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> SABAL_SAPLING = registerBlock("sabal_sapling",
            SabalSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SABAL_SAPLING = BLOCKS.register("potted_sabal_sapling",
            () -> new FlowerPotBlock(TreeBlocks.SABAL_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    //Sausage Tree
    public static final RegistryObject<Block> SAUSAGE_TREE_LOG = registerBlock("sausage_tree_log",
            ModLogs::new);
    public static final RegistryObject<Block> SAUSAGE_TREE_LEAVES = registerBlock("sausage_tree_leaves",
            () -> new SausageTreeLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.SAUSAGE_TREE_FLOWERING_LEAVES));
    public static final RegistryObject<Block> SAUSAGE_TREE_FLOWERING_LEAVES = registerBlock("sausage_tree_flowering_leaves",
            () -> new SausageTreeFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.SAUSAGE_TREE_FRUITING_LEAVES));
    public static final RegistryObject<Block> SAUSAGE_TREE_FRUITING_LEAVES = registerBlock("sausage_tree_fruiting_leaves",
            () -> new SausageTreeFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.SAUSAGE_TREE_LEAVES));
    public static final RegistryObject<Block> SAUSAGE_TREE_SAPLING = registerBlock("sausage_tree_sapling",
            SausageTreeSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SAUSAGE_TREE_SAPLING = BLOCKS.register("potted_sausage_tree_sapling",
            () -> new FlowerPotBlock(TreeBlocks.SAUSAGE_TREE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Slash Pine
    public static final RegistryObject<Block> SLASH_PINE_LOG = registerBlock("slash_pine_log",
            ModLogs::new);
    public static final RegistryObject<Block> SLASH_PINE_LEAVES = registerBlock("slash_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> SLASH_PINE_SAPLING = registerBlock("slash_pine_sapling",
            SlashPineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SLASH_PINE_SAPLING = BLOCKS.register("potted_slash_pine_sapling",
            () -> new FlowerPotBlock(TreeBlocks.SLASH_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



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
    public static final RegistryObject<Block> STARFRUIT_SAPLING = registerBlock("starfruit_sapling",
            StarfruitSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_STARFRUIT_SAPLING = BLOCKS.register("potted_starfruit_sapling",
            () -> new FlowerPotBlock(TreeBlocks.STARFRUIT_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    //Strawberry Tree
    public static final RegistryObject<Block> STRAWBERRY_TREE_LOG = registerBlock("strawberry_tree_log",
            ModLogs::new);

    public static final RegistryObject<Block> STRAWBERRY_TREE_LEAVES = registerBlock("strawberry_tree_leaves",
            () -> new StrawberryTreeLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.STRAWBERRY_TREE_FRUITING_LEAVES));
    public static final RegistryObject<Block> STRAWBERRY_TREE_FRUITING_LEAVES = registerBlock("strawberry_tree_fruiting_leaves",
            () -> new StrawberryTreeFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.STRAWBERRY_TREE_FLOWERING_LEAVES));
    public static final RegistryObject<Block> STRAWBERRY_TREE_FLOWERING_LEAVES = registerBlock("strawberry_tree_flowering_leaves",
            () -> new StrawberryTreeFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.STRAWBERRY_TREE_LEAVES));

    public static final RegistryObject<Block> STRAWBERRY_TREE_SAPLING = registerBlock("strawberry_tree_sapling",
            StrawberryTreeSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_STRAWBERRY_TREE_SAPLING = BLOCKS.register("potted_strawberry_tree_sapling",
            () -> new FlowerPotBlock(TreeBlocks.STRAWBERRY_TREE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    //Stone Pine
    public static final RegistryObject<Block> STONE_PINE_LOG = registerBlock("stone_pine_log",
            ModLogs::new);
    public static final RegistryObject<Block> STONE_PINE_LEAVES = registerBlock("stone_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> STONE_PINE_SAPLING = registerBlock("stone_pine_sapling",
            StonePineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_STONE_PINE_SAPLING = BLOCKS.register("potted_stone_pine_sapling",
            () -> new FlowerPotBlock(TreeBlocks.STONE_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    //Southern Magnolia
    public static final RegistryObject<Block> SOUTHERN_MAGNOLIA_LOG = registerBlock("southern_magnolia_log",
            ModLogs::new);
    public static final RegistryObject<Block> SOUTHERN_MAGNOLIA_LEAVES = registerBlock("southern_magnolia_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> SOUTHERN_MAGNOLIA_SAPLING = registerBlock("southern_magnolia_sapling",
            SouthernMagnoliaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SOUTHERN_MAGNOLIA_SAPLING = BLOCKS.register("potted_southern_magnolia_sapling",
            () -> new FlowerPotBlock(TreeBlocks.SOUTHERN_MAGNOLIA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Socotra Desert Rose
    public static final RegistryObject<Block> SOCOTRA_DESERT_ROSE_LOG = registerBlock("socotra_desert_rose_log",
            ModLogs::new);
    public static final RegistryObject<Block> SOCOTRA_DESERT_ROSE_LEAVES = registerBlock("socotra_desert_rose_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> SOCOTRA_DESERT_ROSE_SAPLING = registerBlock("socotra_desert_rose_sapling",
            SocotraDesertRoseSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SOCOTRA_DESERT_ROSE_SAPLING = BLOCKS.register("potted_socotra_desert_rose_sapling",
            () -> new FlowerPotBlock(TreeBlocks.SOCOTRA_DESERT_ROSE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Socotra Cucumber
    public static final RegistryObject<Block> SOCOTRA_CUCUMBER_LOG = registerBlock("socotra_cucumber_log",
            ModLogs::new);
    public static final RegistryObject<Block> SOCOTRA_CUCUMBER_LEAVES = registerBlock("socotra_cucumber_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> SOCOTRA_CUCUMBER_SAPLING = registerBlock("socotra_cucumber_sapling",
            SocotraCucumberSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SOCOTRA_CUCUMBER_SAPLING = BLOCKS.register("potted_socotra_cucumber_sapling",
            () -> new FlowerPotBlock(TreeBlocks.SOCOTRA_CUCUMBER_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Sweet Chestnut
    public static final RegistryObject<Block> SWEET_CHESTNUT_LOG = registerBlock("sweet_chestnut_log",
            ModLogs::new);

    public static final RegistryObject<Block> SWEET_CHESTNUT_LEAVES = registerBlock("sweet_chestnut_leaves",
            () -> new SweetChestnutLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> SWEET_CHESTNUT_FRUITING_LEAVES = registerBlock("sweet_chestnut_fruiting_leaves",
            () -> new SweetChestnutFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.SWEET_CHESTNUT_FALL_LEAVES));
    public static final RegistryObject<Block> SWEET_CHESTNUT_FALL_LEAVES = registerBlock("sweet_chestnut_fall_leaves",
            () -> new SweetChestnutFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.SWEET_CHESTNUT_WINTER_BRANCHES));
    public static final RegistryObject<Block> SWEET_CHESTNUT_WINTER_BRANCHES = registerBlock("sweet_chestnut_fall_leaves",
            () -> new SweetChestnutWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.SWEET_CHESTNUT_LEAVES));

    public static final RegistryObject<Block> SWEET_CHESTNUT_SAPLING = registerBlock("sweet_chestnut_sapling",
            SweetChestnutSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SWEET_CHESTNUT_SAPLING = BLOCKS.register("potted_sweet_chestnut_sapling",
            () -> new FlowerPotBlock(TreeBlocks.SWEET_CHESTNUT_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    ///T
//Tamarind
    public static final RegistryObject<Block> TAMARIND_LOG = registerBlock("tamarind_log",
            ModLogs::new);
    public static final RegistryObject<Block> TAMARIND_LEAVES = registerBlock("tamarind_leaves",
            () -> new TamarindLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.TAMARIND_FRUITING_LEAVES));
    public static final RegistryObject<Block> TAMARIND_FRUITING_LEAVES = registerBlock("tamarind_fruiting_leaves",
            () -> new TamarindFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.TAMARIND_LEAVES));
    public static final RegistryObject<Block> TAMARIND_SAPLING = registerBlock("tamarind_sapling",
            TamarindSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_TAMARIND_SAPLING = BLOCKS.register("potted_tamarind_sapling",
            () -> new FlowerPotBlock(TreeBlocks.TAMARIND_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Tropical Almond
    public static final RegistryObject<Block> TROPICAL_ALMOND_LOG = registerBlock("tropical_almond_log",
            ModLogs::new);

    public static final RegistryObject<Block> TROPICAL_ALMOND_NEW_LEAVES = registerBlock("tropical_almond_new_leaves",
            () -> new TropicalAlmondNewLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.TROPICAL_ALMOND_LEAVES));
    public static final RegistryObject<Block> TROPICAL_ALMOND_LEAVES = registerBlock("tropical_almond_leaves",
            () -> new TropicalAlmondLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.TROPICAL_ALMOND_FALL_LEAVES));
    public static final RegistryObject<Block> TROPICAL_ALMOND_FALL_LEAVES = registerBlock("tropical_almond_fall_leaves",
            () -> new TropicalAlmondFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.TROPICAL_ALMOND_DRIED_BRANCHES));
    public static final RegistryObject<Block> TROPICAL_ALMOND_DRIED_BRANCHES = registerBlock("tropical_almond_dried_branches",
            () -> new TropicalAlmondDriedBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.TROPICAL_ALMOND_NEW_LEAVES));

    public static final RegistryObject<Block> TROPICAL_ALMOND_SAPLING = registerBlock("tropical_almond_sapling",
            TropicalAlmondSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_TROPICAL_ALMOND_SAPLING = BLOCKS.register("potted_tropical_almond_sapling",
            () -> new FlowerPotBlock(TreeBlocks.TROPICAL_ALMOND_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


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
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WALNUT_FALL_LEAVES));
    public static final RegistryObject<Block> WALNUT_FALL_LEAVES = registerBlock("walnut_fall_leaves",
            () -> new WalnutFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WALNUT_WINTER_BRANCHES));
    public static final RegistryObject<Block> WALNUT_WINTER_BRANCHES = registerBlock("walnut_winter_branches",
            () -> new WalnutWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WALNUT_LEAVES));

    public static final RegistryObject<Block> WALNUT_SAPLING = registerBlock("walnut_sapling",
            WalnutSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_WALNUT_SAPLING = BLOCKS.register("potted_walnut_sapling",
            () -> new FlowerPotBlock(TreeBlocks.WALNUT_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    //Western Hemlock
    public static final RegistryObject<Block> WESTERN_HEMLOCK_LOG = registerBlock("western_hemlock_log",
            ModLogs::new);
    public static final RegistryObject<Block> WESTERN_HEMLOCK_LEAVES = registerBlock("western_hemlock_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> WESTERN_HEMLOCK_SAPLING = registerBlock("western_hemlock_sapling",
            WesternHemlockSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_WESTERN_HEMLOCK_SAPLING = BLOCKS.register("potted_western_hemlock_sapling",
            () -> new FlowerPotBlock(TreeBlocks.WESTERN_HEMLOCK_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> MOUNTAIN_HEMLOCK_LEAVES = registerBlock("mountain_hemlock_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> MOUNTAIN_HEMLOCK_SAPLING = registerBlock("mountain_hemlock_sapling",
            MountainHemlockSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_MOUNTAIN_HEMLOCK_SAPLING = BLOCKS.register("potted_mountain_hemlock_sapling",
            () -> new FlowerPotBlock(TreeBlocks.MOUNTAIN_HEMLOCK_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));





///X






    ///Y
//Yew
    public static final RegistryObject<Block> YEW_LOG = registerBlock("yew_log",
            ModLogs::new);
    public static final RegistryObject<Block> YEW_LEAVES = registerBlock("yew_leaves",
            YewLeaves::new);
    public static final RegistryObject<Block> YEW_SAPLING = registerBlock("yew_sapling",
            YewSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_YEW_SAPLING = BLOCKS.register("potted_yew_sapling",
            () -> new FlowerPotBlock(TreeBlocks.YEW_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));




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
