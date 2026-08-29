package com.caiocesarmods.caiocesarbiomes.block;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.block.custom.Saplings.*;
import com.caiocesarmods.caiocesarbiomes.block.custom.Vines.FicusRootsPlantBlock;
import com.caiocesarmods.caiocesarbiomes.block.custom.Vines.PohutukawaBeardBlock;
import com.caiocesarmods.caiocesarbiomes.block.custom.Vines.SocotraCucumberLeavesVineBlock;
import com.caiocesarmods.caiocesarbiomes.block.custom.fruiting.*;
import com.caiocesarmods.caiocesarbiomes.block.custom.leaves.*;
import com.caiocesarmods.caiocesarbiomes.block.custom.logs.BananaLog;
import com.caiocesarmods.caiocesarbiomes.block.custom.logs.EucalyptusLog;
import com.caiocesarmods.caiocesarbiomes.block.custom.logs.ModLogs;
import com.caiocesarmods.caiocesarbiomes.block.custom.plants.BaldCypressAerialRoot;
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

public class TreeBlocks {
    public static List<Block> blocksList = new ArrayList<>();

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, CaioCesarBiomesMod.MOD_ID);


    ///Aspen
    public static final RegistryObject<Block> ASPEN_LEAVES = registerBlock("aspen_leaves",
            () -> new AspenLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ASPEN_FALL_LEAVES));
    public static final RegistryObject<Block> ASPEN_FALL_LEAVES = registerBlock("aspen_fall_leaves",
            () -> new AspenFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ASPEN_WINTER_BRANCHES));
    public static final RegistryObject<Block> ASPEN_WINTER_BRANCHES = registerBlock("aspen_branches",
            () -> new AspenWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ASPEN_LEAVES));
    public static final RegistryObject<Block> ASPEN_SAPLING = registerBlock("aspen_sapling",
            AspenSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_ASPEN_SAPLING = BLOCKS.register("potted_aspen_sapling",
            () -> new FlowerPotBlock(TreeBlocks.ASPEN_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    ///Araucaria
    //Cook Pine
    public static final RegistryObject<Block> COOK_PINE_LEAVES = registerBlock("cook_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> COOK_PINE_SAPLING = registerBlock("cook_pine_sapling",
            CookPineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_COOK_PINE_SAPLING = BLOCKS.register("potted_cook_pine_sapling",
            () -> new FlowerPotBlock(TreeBlocks.COOK_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Norfolk Pine
    public static final RegistryObject<Block> NORFOLK_PINE_LEAVES = registerBlock("norfolk_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> NORFOLK_PINE_SAPLING = registerBlock("norfolk_pine_sapling",
            NorfolkPineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_NORFOLK_PINE_SAPLING = BLOCKS.register("potted_norfolk_pine_sapling",
            () -> new FlowerPotBlock(TreeBlocks.NORFOLK_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Monkey Puzzle
    public static final RegistryObject<Block> MONKEY_PUZZLE_LEAVES = registerBlock("monkey_puzzle_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> MONKEY_PUZZLE_SAPLING = registerBlock("monkey_puzzle_sapling",
            MonkeyPuzzleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_MONKEY_PUZZLE_SAPLING = BLOCKS.register("potted_monkey_puzzle_sapling",
            () -> new FlowerPotBlock(TreeBlocks.MONKEY_PUZZLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Bunya Pine
    public static final RegistryObject<Block> BUNYA_PINE_LEAVES = registerBlock("bunya_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> BUNYA_PINE_SAPLING = registerBlock("bunya_pine_sapling",
            BunyaPineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_BUNYA_PINE_SAPLING = BLOCKS.register("potted_bunya_pine_sapling",
            () -> new FlowerPotBlock(TreeBlocks.BUNYA_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Hoop Pine
    public static final RegistryObject<Block> HOOP_PINE_LEAVES = registerBlock("hoop_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> HOOP_PINE_SAPLING = registerBlock("hoop_pine_sapling",
            HoopPineSapling::new);



    /// Cypress = Cypress log
    //Italian Cypress
    public static final RegistryObject<Block> ITALIAN_CYPRESS_LEAVES = registerBlock("italian_cypress_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> ITALIAN_CYPRESS_SAPLING = registerBlock("italian_cypress_sapling",
            ItalianCypressSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_ITALIAN_CYPRESS_SAPLING = BLOCKS.register("potted_italian_cypress_sapling",
            () -> new FlowerPotBlock(TreeBlocks.ITALIAN_CYPRESS_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Patagonian Cypress
    public static final RegistryObject<Block> PATAGONIAN_CYPRESS_LEAVES = registerBlock("patagonian_cypress_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> PATAGONIAN_CYPRESS_SAPLING = registerBlock("patagonian_cypress_sapling",
            PatagonianCypressSapling::new);



    /// Maple
    //Japanese Maple
    public static final RegistryObject<Block> JAPANESE_MAPLE_LEAVES = registerBlock("japanese_maple_leaves",
            () -> new JapaneseMapleLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.JAPANESE_MAPLE_WINTER_BRANCHES));
    public static final RegistryObject<Block> JAPANESE_MAPLE_WINTER_BRANCHES = registerBlock("japanese_maple_branches",
            () -> new JapaneseMapleWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.JAPANESE_MAPLE_LEAVES));
    public static final RegistryObject<Block> JAPANESE_MAPLE_SAPLING = registerBlock("japanese_maple_sapling",
            JapaneseMapleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_JAPANESE_MAPLE_SAPLING = BLOCKS.register("potted_japanese_maple_sapling",
            () -> new FlowerPotBlock(TreeBlocks.JAPANESE_MAPLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    ///Prunus
    //Cherry Plum
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
    public static final RegistryObject<Block> CHERRY_PLUM_WINTER_BRANCHES = registerBlock("cherry_plum_branches",
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
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> PEACH_FALL_LEAVES = registerBlock("peach_fall_leaves",
            () -> new PeachFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PEACH_WINTER_BRANCHES));
    public static final RegistryObject<Block> PEACH_WINTER_BRANCHES = registerBlock("peach_branches",
            () -> new PeachWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PEACH_BLOSSOM));
    public static final RegistryObject<Block> PEACH_BLOSSOM = registerBlock("peach_blossom",
            () -> new PeachBlossom(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> PEACH_FRUITING_LEAVES = registerBlock("peach_fruiting_leaves",
            () -> new PeachFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PEACH_LEAVES));
    public static final RegistryObject<Block> PEACH_SAPLING = registerBlock("peach_sapling",
            PeachSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PEACH_SAPLING = BLOCKS.register("potted_peach_sapling",
            () -> new FlowerPotBlock(TreeBlocks.PEACH_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Almond
    public static final RegistryObject<Block> ALMOND_LEAVES = registerBlock("almond_leaves",
            () -> new AlmondLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> ALMOND_FALL_LEAVES = registerBlock("almond_fall_leaves",
            () -> new AlmondFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ALMOND_WINTER_BRANCHES));
    public static final RegistryObject<Block> ALMOND_WINTER_BRANCHES = registerBlock("almond_branches",
            () -> new AlmondWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ALMOND_BLOSSOM));
    public static final RegistryObject<Block> ALMOND_BLOSSOM = registerBlock("almond_blossom",
            () -> new AlmondBlossom(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ALMOND_FRUITING_LEAVES));
    public static final RegistryObject<Block> ALMOND_FRUITING_LEAVES = registerBlock("almond_fruiting_leaves",
            () -> new AlmondFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ALMOND_RIPE_FRUITING_LEAVES));
    public static final RegistryObject<Block> ALMOND_RIPE_FRUITING_LEAVES = registerBlock("almond_ripe_fruiting_leaves",
            () -> new AlmondRipeFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ALMOND_FALL_LEAVES));
    public static final RegistryObject<Block> ALMOND_SAPLING = registerBlock("almond_sapling",
            AlmondSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_ALMOND_SAPLING = BLOCKS.register("potted_almond_sapling",
            () -> new FlowerPotBlock(TreeBlocks.ALMOND_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    ///Myrtaceae-based trees
    //Pohutukawa
    public static final RegistryObject<Block> POHUTUKAWA_LEAVES = registerBlock("pohutukawa_leaves",
            () -> new PohutukawaLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> POHUTUKAWA_SPARSE_FLOWERING_LEAVES = registerBlock("pohutukawa_sparse_flowering_leaves",
            () -> new PohutukawaBuddingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> POHUTUKAWA_FLOWERING_LEAVES = registerBlock("pohutukawa_flowering_leaves",
            () -> new PohutukawaFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.POHUTUKAWA_LEAVES));
    public static final RegistryObject<Block> POHUTUKAWA_BEARD = registerBlock("pohutukawa_beard",
            () -> new PohutukawaBeardBlock(AbstractBlock.Properties.create(Material.PLANTS, MaterialColor.BROWN)
                    .tickRandomly().hardnessAndResistance(0.4F).notSolid().sound(SoundType.VINE)));
    public static final RegistryObject<Block> POHUTUKAWA_SAPLING = registerBlock("pohutukawa_sapling",
            PohutukawaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_POHUTUKAWA_SAPLING = BLOCKS.register("potted_pohutukawa_sapling",
            () -> new FlowerPotBlock(TreeBlocks.POHUTUKAWA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Lilly Pilly
    public static final RegistryObject<Block> LILLY_PILLY_LEAVES = registerBlock("lilly_pilly_leaves",
            () -> new LillyPillyLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.LILLY_PILLY_FLOWERING_LEAVES));
    public static final RegistryObject<Block> LILLY_PILLY_FLOWERING_LEAVES = registerBlock("lilly_pilly_flowering_leaves",
            () -> new LillyPillyFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.LILLY_PILLY_FRUITING_LEAVES));
    public static final RegistryObject<Block> LILLY_PILLY_FRUITING_LEAVES = registerBlock("lilly_pilly_fruiting_leaves",
            () -> new LillyPillyFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.LILLY_PILLY_LEAVES));
    public static final RegistryObject<Block> LILLY_PILLY_SAPLING = registerBlock("lilly_pilly_sapling",
            LillyPillySapling::new);
    //Callistemon
    public static final RegistryObject<Block> CALLISTEMON_LEAVES = registerBlock("callistemon_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> CALLISTEMON_SAPLING = registerBlock("callistemon_sapling",
            CallistemonSapling::new);
    //Eucalyptus
    public static final RegistryObject<Block> EUCALYPTUS_LEAVES = registerBlock("eucalyptus_leaves",
            EucalyptusLeaves::new);
    public static final RegistryObject<Block> EUCALYPTUS_SAPLING = registerBlock("eucalyptus_sapling",
            EucalyptusSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_EUCALYPTUS_SAPLING = BLOCKS.register("potted_eucalyptus_sapling",
            () -> new FlowerPotBlock(TreeBlocks.EUCALYPTUS_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    ///Milkwood = Apocynaceae
    //Plumeria
    public static final RegistryObject<Block> RED_PLUMERIA_LEAVES = registerBlock("plumeria_red_leaves",
            () -> new RedPlumeriaLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.RED_PLUMERIA_DRIED_BRANCHES));
    public static final RegistryObject<Block> RED_PLUMERIA_DRIED_BRANCHES = registerBlock("plumeria_red_branches",
            () -> new RedPlumeriaDriedBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.RED_PLUMERIA_LEAVES));
    public static final RegistryObject<Block> RED_PLUMERIA_SAPLING = registerBlock("plumeria_red_sapling",
            RedPlumeriaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_RED_PLUMERIA_SAPLING = BLOCKS.register("potted_plumeria_red_sapling",
            () -> new FlowerPotBlock(TreeBlocks.RED_PLUMERIA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> WHITE_PLUMERIA_LEAVES = registerBlock("plumeria_white_leaves",
            () -> new WhitePlumeriaLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WHITE_PLUMERIA_DRIED_BRANCHES));
    public static final RegistryObject<Block> WHITE_PLUMERIA_DRIED_BRANCHES = registerBlock("plumeria_white_branches",
            () -> new WhitePlumeriaDriedBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WHITE_PLUMERIA_LEAVES));
    public static final RegistryObject<Block> WHITE_PLUMERIA_SAPLING = registerBlock("plumeria_white_sapling",
            WhitePlumeriaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_WHITE_PLUMERIA_SAPLING = BLOCKS.register("potted_plumeria_white_sapling",
            () -> new FlowerPotBlock(TreeBlocks.WHITE_PLUMERIA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> YELLOW_PLUMERIA_LEAVES = registerBlock("plumeria_yellow_leaves",
            () -> new YellowPlumeriaLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.YELLOW_PLUMERIA_DRIED_BRANCHES));
    public static final RegistryObject<Block> YELLOW_PLUMERIA_DRIED_BRANCHES = registerBlock("plumeria_yellow_branches",
            () -> new YellowPlumeriaDriedBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.YELLOW_PLUMERIA_LEAVES));
    public static final RegistryObject<Block> YELLOW_PLUMERIA_SAPLING = registerBlock("plumeria_yellow_sapling",
            YellowPlumeriaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_YELLOW_PLUMERIA_SAPLING = BLOCKS.register("potted_plumeria_yellow_sapling",
            () -> new FlowerPotBlock(TreeBlocks.YELLOW_PLUMERIA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> PINK_PLUMERIA_LEAVES = registerBlock("plumeria_pink_leaves",
            () -> new PinkPlumeriaLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PINK_PLUMERIA_DRIED_BRANCHES));
    public static final RegistryObject<Block> PINK_PLUMERIA_DRIED_BRANCHES = registerBlock("plumeria_pink_branches",
            () -> new PinkPlumeriaDriedBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PINK_PLUMERIA_LEAVES));
    public static final RegistryObject<Block> PINK_PLUMERIA_SAPLING = registerBlock("plumeria_pink_sapling",
            PinkPlumeriaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PINK_PLUMERIA_SAPLING = BLOCKS.register("potted_plumeria_pink_sapling",
            () -> new FlowerPotBlock(TreeBlocks.PINK_PLUMERIA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> ORANGE_PLUMERIA_LEAVES = registerBlock("plumeria_orange_leaves",
            () -> new OrangePlumeriaLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ORANGE_PLUMERIA_DRIED_BRANCHES));
    public static final RegistryObject<Block> ORANGE_PLUMERIA_DRIED_BRANCHES = registerBlock("plumeria_orange_branches",
            () -> new OrangePlumeriaDriedBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ORANGE_PLUMERIA_LEAVES));
    public static final RegistryObject<Block> ORANGE_PLUMERIA_SAPLING = registerBlock("plumeria_orange_sapling",
            OrangePlumeriaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_ORANGE_PLUMERIA_SAPLING = BLOCKS.register("potted_plumeria_orange_sapling",
            () -> new FlowerPotBlock(TreeBlocks.ORANGE_PLUMERIA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Oleander
    public static final RegistryObject<Block> OLEANDER_DARK_PINK_LEAVES = registerBlock("oleander_dark_pink_leaves",
            () -> new OleanderDarkPinkLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.OLEANDER_DARK_PINK_DIEBACK_LEAVES));
    public static final RegistryObject<Block> OLEANDER_DARK_PINK_DIEBACK_LEAVES = registerBlock("oleander_dark_pink_dieback_leaves",
            () -> new OleanderDarkPinkDiebackLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.OLEANDER_DARK_PINK_LEAVES));
    public static final RegistryObject<Block> OLEANDER_DARK_PINK_SAPLING = registerBlock("oleander_dark_pink_sapling",
            DarkPinkOleanderSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_OLEANDER_DARK_PINK_SAPLING = BLOCKS.register("potted_oleander_dark_pink_sapling",
            () -> new FlowerPotBlock(TreeBlocks.OLEANDER_DARK_PINK_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> OLEANDER_PINK_LEAVES = registerBlock("oleander_pink_leaves",
            () -> new OleanderPinkLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.OLEANDER_PINK_DIEBACK_LEAVES));
    public static final RegistryObject<Block> OLEANDER_PINK_DIEBACK_LEAVES = registerBlock("oleander_pink_dieback_leaves",
            () -> new OleanderPinkDiebackLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.OLEANDER_PINK_LEAVES));
    public static final RegistryObject<Block> OLEANDER_PINK_SAPLING = registerBlock("oleander_pink_sapling",
            PinkOleanderSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_OLEANDER_PINK_SAPLING = BLOCKS.register("potted_oleander_pink_sapling",
            () -> new FlowerPotBlock(TreeBlocks.OLEANDER_PINK_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> OLEANDER_RED_LEAVES = registerBlock("oleander_red_leaves",
            () -> new OleanderRedLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.OLEANDER_RED_DIEBACK_LEAVES));
    public static final RegistryObject<Block> OLEANDER_RED_DIEBACK_LEAVES = registerBlock("oleander_red_dieback_leaves",
            () -> new OleanderRedDiebackLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.OLEANDER_RED_LEAVES));
    public static final RegistryObject<Block> OLEANDER_RED_SAPLING = registerBlock("oleander_red_sapling",
            RedOleanderSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_OLEANDER_RED_SAPLING = BLOCKS.register("potted_oleander_red_sapling",
            () -> new FlowerPotBlock(TreeBlocks.OLEANDER_RED_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> OLEANDER_WHITE_LEAVES = registerBlock("oleander_white_leaves",
            () -> new OleanderWhiteLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.OLEANDER_WHITE_DIEBACK_LEAVES));
    public static final RegistryObject<Block> OLEANDER_WHITE_DIEBACK_LEAVES = registerBlock("oleander_white_dieback_leaves",
            () -> new OleanderWhiteDiebackLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.OLEANDER_WHITE_LEAVES));
    public static final RegistryObject<Block> OLEANDER_WHITE_SAPLING = registerBlock("oleander_white_sapling",
            WhiteOleanderSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_OLEANDER_WHITE_SAPLING = BLOCKS.register("potted_oleander_white_sapling",
            () -> new FlowerPotBlock(TreeBlocks.OLEANDER_WHITE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Yellow oleander
    public static final RegistryObject<Block> YELLOW_OLEANDER_LEAVES = registerBlock("yellow_oleander_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> YELLOW_OLEANDER_SAPLING = registerBlock("yellow_oleander_sapling",
            YellowOleanderSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_YELLOW_OLEANDER_SAPLING = BLOCKS.register("potted_yellow_oleander_sapling",
            () -> new FlowerPotBlock(TreeBlocks.YELLOW_OLEANDER_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> ORANGE_OLEANDER_LEAVES = registerBlock("orange_oleander_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> ORANGE_OLEANDER_SAPLING = registerBlock("orange_oleander_sapling",
            OrangeOleanderSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_ORANGE_OLEANDER_SAPLING = BLOCKS.register("potted_orange_oleander_sapling",
            () -> new FlowerPotBlock(TreeBlocks.ORANGE_OLEANDER_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    ///Lauraceae laurel-based trees (camphor is actually an exception)
    //Avocado
    public static final RegistryObject<Block> AVOCADO_LEAVES = registerBlock("avocado_leaves",
            () -> new AvocadoLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.AVOCADO_FLOWERING_LEAVES));
    public static final RegistryObject<Block> AVOCADO_FLOWERING_LEAVES = registerBlock("avocado_flowering_leaves",
            () -> new AvocadoFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.AVOCADO_FRUITING_LEAVES));
    public static final RegistryObject<Block> AVOCADO_FRUITING_LEAVES = registerBlock("avocado_fruiting_leaves",
            () -> new AvocadoFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.AVOCADO_LEAVES));
    public static final RegistryObject<Block> AVOCADO_SAPLING = registerBlock("avocado_sapling",
            AvocadoSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_AVOCADO_SAPLING = BLOCKS.register("potted_avocado_sapling",
            () -> new FlowerPotBlock(TreeBlocks.AVOCADO_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Ocotea
    public static final RegistryObject<Block> OCOTEA_LEAVES = registerBlock("ocotea_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> OCOTEA_FOREST_SAPLING = registerBlock("ocotea_forest_sapling",
            OcoteaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_OCOTEA_FOREST_SAPLING = BLOCKS.register("potted_ocotea_forest_sapling",
            () -> new FlowerPotBlock(TreeBlocks.OCOTEA_FOREST_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Machillus
    public static final RegistryObject<Block> MACHILLUS_LEAVES = registerBlock("machillus_leaves",
            () -> new MachillusLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.MACHILLUS_FLOWERING_LEAVES));
    public static final RegistryObject<Block> MACHILLUS_FLOWERING_LEAVES = registerBlock("machillus_flowering_leaves",
            () -> new MachillusFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.MACHILLUS_FLOWERING_LEAVES2));
    public static final RegistryObject<Block> MACHILLUS_FLOWERING_LEAVES2 = registerBlock("machillus_flowering_leaves2",
            () -> new MachillusFloweringLeaves2(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.MACHILLUS_LEAVES));
    public static final RegistryObject<Block> MACHILLUS_SAPLING = registerBlock("machillus_sapling",
            MachillusSapling::new);
    public static final RegistryObject<Block> CINNAMON_LEAVES = registerBlock("cinnamon_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> CINNAMON_SAPLING = registerBlock("cinnamon_sapling",
            CinnamonSapling::new);
    public static final RegistryObject<Block> CAMPHOR_LEAVES = registerBlock("camphor_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> CAMPHOR_SAPLING = registerBlock("camphor_sapling",
            CamphorSapling::new);



    ///Pine
    //Canary Pine
    public static final RegistryObject<Block> CANARY_PINE_LEAVES = registerBlock("canary_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> CANARY_PINE_SAPLING = registerBlock("canary_pine_sapling",
            CanaryPineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_CANARY_PINE_SAPLING = BLOCKS.register("potted_canary_pine_sapling",
            () -> new FlowerPotBlock(TreeBlocks.CANARY_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Chinese Pine
    public static final RegistryObject<Block> CHINESE_RED_PINE_LEAVES = registerBlock("chinese_red_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> CHINESE_RED_PINE_SAPLING = registerBlock("chinese_red_pine_sapling",
            ChineseRedPineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_CHINESE_RED_PINE_SAPLING = BLOCKS.register("potted_chinese_red_pine_sapling",
            () -> new FlowerPotBlock(TreeBlocks.CHINESE_RED_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Pinyon
    public static final RegistryObject<Block> PINYON_LEAVES = registerBlock("pinyon_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> PINYON_SAPLING = registerBlock("pinyon_sapling",
            PinyonSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PINYON_SAPLING = BLOCKS.register("potted_pinyon_sapling",
            () -> new FlowerPotBlock(TreeBlocks.PINYON_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Japanese Pine
    public static final RegistryObject<Block> JAPANESE_PINE_LEAVES = registerBlock("japanese_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> JAPANESE_PINE_SAPLING = registerBlock("japanese_pine_sapling",
            JapanesePineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_JAPANESE_PINE_SAPLING = BLOCKS.register("potted_japanese_pine_sapling",
            () -> new FlowerPotBlock(TreeBlocks.JAPANESE_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Mediterranean Pines
    public static final RegistryObject<Block> STONE_PINE_LEAVES = registerBlock("stone_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> STONE_PINE_SAPLING = registerBlock("stone_pine_sapling",
            StonePineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_STONE_PINE_SAPLING = BLOCKS.register("potted_stone_pine_sapling",
            () -> new FlowerPotBlock(TreeBlocks.STONE_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> ALEPPO_PINE_LEAVES = registerBlock("aleppo_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> ALEPPO_PINE_SAPLING = registerBlock("aleppo_pine_sapling",
            AleppoPineSapling::new);
    public static final RegistryObject<Block> MARITIME_PINE_LEAVES = registerBlock("maritime_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> MARITIME_PINE_SAPLING = registerBlock("maritime_pine_sapling",
            MaritimePineSapling::new);
    public static final RegistryObject<Block> BRUTIA_PINE_LEAVES = registerBlock("brutia_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> BRUTIA_PINE_SAPLING = registerBlock("brutia_pine_sapling",
            BrutiaPineSapling::new);
    //Yellow pines
    public static final RegistryObject<Block> SLASH_PINE_LEAVES = registerBlock("slash_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> SLASH_PINE_SAPLING = registerBlock("slash_pine_sapling",
            SlashPineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SLASH_PINE_SAPLING = BLOCKS.register("potted_slash_pine_sapling",
            () -> new FlowerPotBlock(TreeBlocks.SLASH_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> LOBLOLLY_PINE_LEAVES = registerBlock("loblolly_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> LOBLOLLY_PINE_SAPLING = registerBlock("loblolly_pine_sapling",
            LoblollyPineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_LOBLOLLY_PINE_SAPLING = BLOCKS.register("potted_loblolly_pine_sapling",
            () -> new FlowerPotBlock(TreeBlocks.LOBLOLLY_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Ponderosa Pine
    public static final RegistryObject<Block> PONDEROSA_PINE_LEAVES = registerBlock("ponderosa_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> PONDEROSA_PINE_SAPLING = registerBlock("ponderosa_pine_sapling",
            PonderosaPineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PONDEROSA_PINE_SAPLING = BLOCKS.register("potted_ponderosa_pine_sapling",
            () -> new FlowerPotBlock(TreeBlocks.PONDEROSA_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Mugo Pine
    public static final RegistryObject<Block> MUGO_PINE_LEAVES = registerBlock("mugo_pine_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> MUGO_PINE_SAPLING = registerBlock("mugo_pine_sapling",
            MugoPineSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_MUGO_PINE_SAPLING = BLOCKS.register("potted_mugo_pine_sapling",
            () -> new FlowerPotBlock(TreeBlocks.MUGO_PINE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    ///Sorbus (Malinae trees, like apple, crabapple, rowan, loquat, hawthorn, quince, pear)
    //Pink crabapple
    public static final RegistryObject<Block> PINK_CRABAPPLE_LEAVES = registerBlock("crabapple_pink_leaves",
            () -> new PinkCrabappleLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> PINK_CRABAPPLE_BLOSSOM = registerBlock("crabapple_pink_blossom",
            () -> new PinkCrabappleBlossom(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> PINK_CRABAPPLE_FRUITING_LEAVES = registerBlock("crabapple_pink_fruiting_leaves",
            () -> new PinkCrabappleFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PINK_CRABAPPLE_FALL_LEAVES));
    public static final RegistryObject<Block> PINK_CRABAPPLE_FALL_LEAVES = registerBlock("crabapple_pink_fall_leaves",
            () -> new PinkCrabappleFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PINK_CRABAPPLE_WINTER_BRANCHES));
    public static final RegistryObject<Block> PINK_CRABAPPLE_WINTER_BRANCHES = registerBlock("crabapple_pink_branches",
            () -> new PinkCrabappleWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PINK_CRABAPPLE_BLOSSOM));
    public static final RegistryObject<Block> PINK_CRABAPPLE_SAPLING = registerBlock("crabapple_pink_sapling",
            PinkCrabappleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PINK_CRABAPPLE_SAPLING = BLOCKS.register("potted_crabapple_pink_sapling",
            () -> new FlowerPotBlock(TreeBlocks.PINK_CRABAPPLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Red crabapple
    public static final RegistryObject<Block> RED_CRABAPPLE_LEAVES = registerBlock("crabapple_red_leaves",
            () -> new RedCrabappleLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> RED_CRABAPPLE_BLOSSOM = registerBlock("crabapple_red_blossom",
            () -> new RedCrabappleBlossom(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> RED_CRABAPPLE_FRUITING_LEAVES = registerBlock("crabapple_red_fruiting_leaves",
            () -> new RedCrabappleFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.RED_CRABAPPLE_FALL_LEAVES));
    public static final RegistryObject<Block> RED_CRABAPPLE_FALL_LEAVES = registerBlock("crabapple_red_fall_leaves",
            () -> new RedCrabappleFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.RED_CRABAPPLE_WINTER_BRANCHES));
    public static final RegistryObject<Block> RED_CRABAPPLE_WINTER_BRANCHES = registerBlock("crabapple_red_branches",
            () -> new RedCrabappleWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.RED_CRABAPPLE_BLOSSOM));
    public static final RegistryObject<Block> RED_CRABAPPLE_SAPLING = registerBlock("crabapple_red_sapling",
            RedCrabappleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_RED_CRABAPPLE_SAPLING = BLOCKS.register("potted_crabapple_red_sapling",
            () -> new FlowerPotBlock(TreeBlocks.RED_CRABAPPLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //White crabapple
    public static final RegistryObject<Block> WHITE_CRABAPPLE_LEAVES = registerBlock("crabapple_white_leaves",
            () -> new WhiteCrabappleLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> WHITE_CRABAPPLE_BLOSSOM = registerBlock("crabapple_white_blossom",
            () -> new WhiteCrabappleBlossom(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> WHITE_CRABAPPLE_FRUITING_LEAVES = registerBlock("crabapple_white_fruiting_leaves",
            () -> new WhiteCrabappleFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WHITE_CRABAPPLE_FALL_LEAVES));
    public static final RegistryObject<Block> WHITE_CRABAPPLE_FALL_LEAVES = registerBlock("crabapple_white_fall_leaves",
            () -> new WhiteCrabappleFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WHITE_CRABAPPLE_WINTER_BRANCHES));
    public static final RegistryObject<Block> WHITE_CRABAPPLE_WINTER_BRANCHES = registerBlock("crabapple_white_branches",
            () -> new WhiteCrabappleWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WHITE_CRABAPPLE_BLOSSOM));
    public static final RegistryObject<Block> WHITE_CRABAPPLE_SAPLING = registerBlock("crabapple_white_sapling",
            WhiteCrabappleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_WHITE_CRABAPPLE_SAPLING = BLOCKS.register("potted_crabapple_white_sapling",
            () -> new FlowerPotBlock(TreeBlocks.WHITE_CRABAPPLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Hawthorn
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
    public static final RegistryObject<Block> HAWTHORN_WINTER_BRANCHES = registerBlock("hawthorn_branches",
            () -> new HawthornWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.HAWTHORN_FLOWERING_LEAVES));
    public static final RegistryObject<Block> HAWTHORN_WINTER_FRUITING_BRANCHES = registerBlock("hawthorn_fruiting_branches",
            () -> new HawthornWinterFruitingBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.HAWTHORN_FLOWERING_LEAVES));
    public static final RegistryObject<Block> HAWTHORN_SAPLING = registerBlock("hawthorn_sapling",
            HawthornSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_HAWTHORN_SAPLING = BLOCKS.register("potted_hawthorn_sapling",
            () -> new FlowerPotBlock(TreeBlocks.HAWTHORN_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Loquat
    public static final RegistryObject<Block> LOQUAT_LEAVES = registerBlock("loquat_leaves",
            () -> new LoquatLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.LOQUAT_FLOWERING_LEAVES));
    public static final RegistryObject<Block> LOQUAT_FLOWERING_LEAVES = registerBlock("loquat_flowering_leaves",
            () -> new LoquatFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> LOQUAT_FRUITING_LEAVES = registerBlock("loquat_fruiting_leaves",
            () -> new LoquatFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.LOQUAT_LEAVES));
    public static final RegistryObject<Block> LOQUAT_SAPLING = registerBlock("loquat_sapling",
            LoquatSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_LOQUAT_SAPLING = BLOCKS.register("potted_loquat_sapling",
            () -> new FlowerPotBlock(TreeBlocks.LOQUAT_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Rowan
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
    public static final RegistryObject<Block> ROWAN_WINTER_BRANCHES = registerBlock("rowan_branches",
            () -> new RowanWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ROWAN_FLOWERING_LEAVES));
    public static final RegistryObject<Block> ROWAN_WINTER_FRUITING_BRANCHES = registerBlock("rowan_fruiting_branches",
            () -> new RowanWinterFruitingBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ROWAN_FLOWERING_LEAVES));
    public static final RegistryObject<Block> ROWAN_SAPLING = registerBlock("rowan_sapling",
            RowanSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_ROWAN_SAPLING = BLOCKS.register("potted_rowan_sapling",
            () -> new FlowerPotBlock(TreeBlocks.ROWAN_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Apple (hardy up to zone 10)
    public static final RegistryObject<Block> APPLE_LEAVES = registerBlock("apple_leaves",
            () -> new AppleLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> APPLE_BLOSSOM = registerBlock("apple_blossom",
            () -> new AppleBlossom(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> APPLE_FRUITING_LEAVES = registerBlock("apple_fruiting_leaves",
            () -> new AppleFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.APPLE_FALL_LEAVES));
    public static final RegistryObject<Block> APPLE_FALL_LEAVES = registerBlock("apple_fall_leaves",
            () -> new AppleFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.APPLE_WINTER_BRANCHES));
    public static final RegistryObject<Block> APPLE_WINTER_BRANCHES = registerBlock("apple_branches",
            () -> new AppleWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.APPLE_BLOSSOM));
    public static final RegistryObject<Block> APPLE_SAPLING = registerBlock("apple_sapling",
            AppleSapling::new);


    ///Cottonwood
    //Black Poplar
    public static final RegistryObject<Block> BLACK_POPLAR_LEAVES = registerBlock("black_poplar_leaves",
            () -> new BlackPoplarLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.BLACK_POPLAR_FALL_LEAVES));
    public static final RegistryObject<Block> BLACK_POPLAR_FALL_LEAVES = registerBlock("black_poplar_fall_leaves",
            () -> new BlackPoplarFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.BLACK_POPLAR_WINTER_BRANCHES));
    public static final RegistryObject<Block> BLACK_POPLAR_WINTER_BRANCHES = registerBlock("black_poplar_branches",
            () -> new BlackPoplarWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.BLACK_POPLAR_LEAVES));
    public static final RegistryObject<Block> BLACK_POPLAR_SAPLING = registerBlock("black_poplar_sapling",
            BlackPoplarSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_BLACK_POPLAR_SAPLING = BLOCKS.register("potted_black_poplar_sapling",
            () -> new FlowerPotBlock(TreeBlocks.BLACK_POPLAR_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Fremont Poplar
    public static final RegistryObject<Block> FREMONT_POPLAR_LEAVES = registerBlock("fremont_poplar_leaves",
            () -> new FremontPoplarLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.FREMONT_POPLAR_FALL_LEAVES));
    public static final RegistryObject<Block> FREMONT_POPLAR_FALL_LEAVES = registerBlock("fremont_poplar_fall_leaves",
            () -> new FremontPoplarAutumnLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.FREMONT_POPLAR_WINTER_BRANCHES));
    public static final RegistryObject<Block> FREMONT_POPLAR_WINTER_BRANCHES = registerBlock("fremont_poplar_branches",
            () -> new FremontPoplarWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.FREMONT_POPLAR_LEAVES));
    public static final RegistryObject<Block> FREMONT_POPLAR_SAPLING = registerBlock("fremont_poplar_sapling",
            FremontPoplarSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_FREMONT_POPLAR_SAPLING = BLOCKS.register("potted_fremont_poplar_sapling",
            () -> new FlowerPotBlock(TreeBlocks.FREMONT_POPLAR_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    ///Tea
    //Camellia
    public static final RegistryObject<Block> CAMELLIA_LEAVES = registerBlock("camellia_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> CAMELLIA_SAPLING = registerBlock("camellia_sapling",
            CamelliaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_CAMELLIA_SAPLING = BLOCKS.register("potted_camellia_sapling",
            () -> new FlowerPotBlock(TreeBlocks.CAMELLIA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Tea
    public static final RegistryObject<Block> TEA_LEAVES = registerBlock("tea_leaves",
            TeaLeaves::new);
    public static final RegistryObject<Block> TEA_SAPLING = registerBlock("tea_sapling",
            TeaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_TEA_SAPLING = BLOCKS.register("potted_tea_sapling",
            () -> new FlowerPotBlock(TreeBlocks.TEA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    ///Bald Cypress
    public static final RegistryObject<Block> BALD_CYPRESS_LEAVES = registerBlock("bald_cypress_leaves",
            () -> new BaldCypressLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.BALD_CYPRESS_AUTUMN_LEAVES));
    public static final RegistryObject<Block> BALD_CYPRESS_AUTUMN_LEAVES = registerBlock("bald_cypress_fall_leaves",
            () -> new BaldCypressAutumnLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.BALD_CYPRESS_WINTER_LEAVES));
    public static final RegistryObject<Block> BALD_CYPRESS_WINTER_LEAVES = registerBlock("bald_cypress_branches",
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



    ///Banana
    public static final RegistryObject<Block> BANANA_LOG = registerBlock("banana_log",
            BananaLog::new);
    public static final RegistryObject<Block> BANANA_LEAVES = registerBlock("banana_leaves",
            () -> new BananaLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2f)
                    .tickRandomly().notSolid().sound(SoundType.PLANT)));
    public static final RegistryObject<Block> BANANA_SAPLING = registerBlock("banana_sapling",
            BananaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_BANANA_SAPLING = BLOCKS.register("potted_banana_sapling",
            () -> new FlowerPotBlock(TreeBlocks.BANANA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> BANANA_FLOWER = registerBlock("banana_flower",
            BananaFlowerBlock::new); //Can be harvested and cooked
    public static final RegistryObject<Block> BANANA_BUNCH = registerBlock("banana_bunch",
            BananaBunchBlock::new);
    public static final RegistryObject<Block> BANANA_GREEN_BUNCH = registerBlock("banana_green_bunch",
            BananaGreenBunchBlock::new);
    public static final RegistryObject<Block> BANANA_STALK = registerBlock("banana_stalk",
            BananaStalkBlock::new);




    /// Beech
    public static final RegistryObject<Block> COOPER_BEECH_LEAVES = registerBlock("cooper_beech_leaves",
            () -> new CooperBeechLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.COOPER_BEECH_FALL_LEAVES));
    public static final RegistryObject<Block> COOPER_BEECH_FALL_LEAVES = registerBlock("cooper_beech_fall_leaves",
            () -> new CooperBeechFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.COOPER_BEECH_WINTER_BRANCHES));
    public static final RegistryObject<Block> COOPER_BEECH_WINTER_BRANCHES = registerBlock("cooper_beech_branches",
            () -> new CooperBeechWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.COOPER_BEECH_LEAVES));

    public static final RegistryObject<Block> COOPER_BEECH_SAPLING = registerBlock("cooper_beech_sapling",
            CooperBeechSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_COOPER_BEECH_SAPLING = BLOCKS.register("potted_cooper_beech_sapling",
            () -> new FlowerPotBlock(TreeBlocks.COOPER_BEECH_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    ///Breadfruit
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



    ///Blue Spruce
    public static final RegistryObject<Block> BLUE_SPRUCE_LEAVES = registerBlock("blue_spruce_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> BLUE_SPRUCE_SAPLING = registerBlock("blue_spruce_sapling",
            BlueSpruceSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_BLUE_SPRUCE_SAPLING = BLOCKS.register("potted_blue_spruce_sapling",
            () -> new FlowerPotBlock(TreeBlocks.BLUE_SPRUCE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    ///Carob
    public static final RegistryObject<Block> CAROB_LEAVES = registerBlock("carob_leaves",
            () -> new CarobLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.CAROB_FRUITING_LEAVES));
    public static final RegistryObject<Block> CAROB_FRUITING_LEAVES = registerBlock("carob_fruiting_leaves",
            () -> new CarobFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.CAROB_LEAVES));
    public static final RegistryObject<Block> CAROB_SAPLING = registerBlock("carob_sapling",
            CarobSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_CAROB_SAPLING = BLOCKS.register("potted_carob_sapling",
            () -> new FlowerPotBlock(TreeBlocks.CAROB_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    ///Palms
    //Date
    public static final RegistryObject<Block> DATE_LEAVES = registerBlock("date_leaves",
            () -> new DateLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2f)
                    .tickRandomly().notSolid().sound(SoundType.PLANT)));
    public static final RegistryObject<Block> DATE_SAPLING = registerBlock("date_sapling",
            DateSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_DATE_SAPLING = BLOCKS.register("potted_date_sapling",
            () -> new FlowerPotBlock(TreeBlocks.DATE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Canary date
    public static final RegistryObject<Block> CANARY_DATE_LEAVES = registerBlock("canary_date_leaves",
            () -> new DateLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2f)
                    .tickRandomly().notSolid().sound(SoundType.PLANT)));
    public static final RegistryObject<Block> CANARY_DATE_SAPLING = registerBlock("canary_date_sapling",
            CanaryDateSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_CANARY_DATE_SAPLING = BLOCKS.register("potted_canary_date_sapling",
            () -> new FlowerPotBlock(TreeBlocks.CANARY_DATE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> DATE_BUNCH = registerBlock("date_bunch",
            DateBunchBlock::new);
    //Bismarck Palm
    public static final RegistryObject<Block> BISMARCK_PALM_LEAVES = registerBlock("bismarck_palm_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> BISMARCK_PALM_SAPLING = registerBlock("bismarck_palm_sapling",
            BismarckPalmSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_BISMARCK_PALM_SAPLING = BLOCKS.register("potted_bismarck_palm_sapling",
            () -> new FlowerPotBlock(TreeBlocks.BISMARCK_PALM_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Coconut
    public static final RegistryObject<Block> COCONUT_LEAVES = registerBlock("coconut_leaves",
            () -> new CoconutLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2f).tickRandomly()
                    .notSolid().sound(SoundType.PLANT)));
    public static final RegistryObject<Block> COCONUT_INFLORESCENCE = registerBlock("coconut_inflorescence",
            CoconutInflorescenceBlock::new);
    public static final RegistryObject<Block> COCONUT_BUNCH = registerBlock("coconut_bunch",
            CoconutBunchBlock::new);
    public static final RegistryObject<Block> COCONUT_SAPLING = registerBlock("coconut_sapling",
            CoconutSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_COCONUT_SAPLING = BLOCKS.register("potted_coconut_sapling",
            () -> new FlowerPotBlock(TreeBlocks.COCONUT_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Oil Palm
    public static final RegistryObject<Block> OIL_PALM_LEAVES = registerBlock("oil_palm_leaves",
            () -> new OilPalmLeaves(AbstractBlock.Properties.create(Material.LEAVES)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly() // Enables random ticks
                    .notSolid()
                    .sound(SoundType.PLANT)));
    public static final RegistryObject<Block> OIL_PALM_FRUIT_BUNCH = registerBlock("oil_palm_fruit_bunch",
            OilPalmFruitBunchBlock::new);
    public static final RegistryObject<Block> OIL_PALM_SAPLING = registerBlock("oil_palm_sapling",
            OilPalmSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_OIL_PALM_SAPLING = BLOCKS.register("potted_oil_palm_sapling",
            () -> new FlowerPotBlock(TreeBlocks.OIL_PALM_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Sabal
    public static final RegistryObject<Block> SABAL_LEAVES = registerBlock("sabal_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> SABAL_SAPLING = registerBlock("sabal_sapling",
            SabalSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SABAL_SAPLING = BLOCKS.register("potted_sabal_sapling",
            () -> new FlowerPotBlock(TreeBlocks.SABAL_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Royal Palm
    public static final RegistryObject<Block> ROYAL_PALM_LEAVES = registerBlock("royal_palm_leaves",
            ModLeaves::new);
    //public static final RegistryObject<Block> ROYAL_PALM_SAPLING = registerBlock("royal_palm_sapling", RoyalPalmSapling::new);
    //Wax Palm
    public static final RegistryObject<Block> WAX_PALM_LEAVES = registerBlock("wax_palm_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> WAX_PALM_SAPLING = registerBlock("wax_palm_sapling",
            WaxPalmSapling::new);

    ///Casuarina
    public static final RegistryObject<Block> CASUARINA_LEAVES = registerBlock("casuarina_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> CASUARINA_SAPLING = registerBlock("casuarina_sapling",
            CasuarinaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_CASUARINA_SAPLING = BLOCKS.register("potted_casuarina_sapling",
            () -> new FlowerPotBlock(TreeBlocks.CASUARINA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    ///Citrus
    //Buddha Hand Citron
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
    //Citron
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
    //Tahiti Lime
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
    //Grapefruit
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
    //Lemon
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
    //Orange
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
    //Mandarin
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


    ///Crape Myrtle and Pomegranate
    //Red Crape Myrtle
    public static final RegistryObject<Block> RED_CRAPE_MYRTLE_SPRING_LEAVES = registerBlock("crape_myrtle_red_spring_leaves",
            () -> new RedCrapeMyrtleSpringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> RED_CRAPE_MYRTLE_LEAVES = registerBlock("crape_myrtle_red_leaves",
            () -> new RedCrapeMyrtleLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> RED_CRAPE_MYRTLE_FALL_LEAVES = registerBlock("crape_myrtle_red_fall_leaves",
            () -> new RedCrapeMyrtleFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.RED_CRAPE_MYRTLE_WINTER_BRANCHES));
    public static final RegistryObject<Block> RED_CRAPE_MYRTLE_WINTER_BRANCHES = registerBlock("crape_myrtle_red_branches",
            () -> new RedCrapeMyrtleWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.RED_CRAPE_MYRTLE_SPRING_LEAVES));
    public static final RegistryObject<Block> RED_CRAPE_MYRTLE_SAPLING = registerBlock("crape_myrtle_red_sapling",
            RedCrapeMyrtleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_RED_CRAPE_MYRTLE_SAPLING = BLOCKS.register("potted_crape_myrtle_red_sapling",
            () -> new FlowerPotBlock(TreeBlocks.RED_CRAPE_MYRTLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //White Crape Myrtle
    public static final RegistryObject<Block> WHITE_CRAPE_MYRTLE_SPRING_LEAVES = registerBlock("crape_myrtle_white_spring_leaves",
            () -> new WhiteCrapeMyrtleSpringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> WHITE_CRAPE_MYRTLE_LEAVES = registerBlock("crape_myrtle_white_leaves",
            () -> new WhiteCrapeMyrtleLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> WHITE_CRAPE_MYRTLE_FALL_LEAVES = registerBlock("crape_myrtle_white_fall_leaves",
            () -> new WhiteCrapeMyrtleFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WHITE_CRAPE_MYRTLE_WINTER_BRANCHES));
    public static final RegistryObject<Block> WHITE_CRAPE_MYRTLE_WINTER_BRANCHES = registerBlock("crape_myrtle_white_branches",
            () -> new WhiteCrapeMyrtleWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WHITE_CRAPE_MYRTLE_SPRING_LEAVES));
    public static final RegistryObject<Block> WHITE_CRAPE_MYRTLE_SAPLING = registerBlock("crape_myrtle_white_sapling",
            WhiteCrapeMyrtleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_WHITE_CRAPE_MYRTLE_SAPLING = BLOCKS.register("potted_crape_myrtle_white_sapling",
            () -> new FlowerPotBlock(TreeBlocks.WHITE_CRAPE_MYRTLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Purple Crape Myrtle
    public static final RegistryObject<Block> PURPLE_CRAPE_MYRTLE_SPRING_LEAVES = registerBlock("crape_myrtle_purple_spring_leaves",
            () -> new PurpleCrapeMyrtleSpringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> PURPLE_CRAPE_MYRTLE_LEAVES = registerBlock("crape_myrtle_purple_leaves",
            () -> new PurpleCrapeMyrtleLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> PURPLE_CRAPE_MYRTLE_FALL_LEAVES = registerBlock("crape_myrtle_purple_fall_leaves",
            () -> new PurpleCrapeMyrtleFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PURPLE_CRAPE_MYRTLE_WINTER_BRANCHES));
    public static final RegistryObject<Block> PURPLE_CRAPE_MYRTLE_WINTER_BRANCHES = registerBlock("crape_myrtle_purple_branches",
            () -> new PurpleCrapeMyrtleWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PURPLE_CRAPE_MYRTLE_SPRING_LEAVES));
    public static final RegistryObject<Block> PURPLE_CRAPE_MYRTLE_SAPLING = registerBlock("crape_myrtle_purple_sapling",
            PurpleCrapeMyrtleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PURPLE_CRAPE_MYRTLE_SAPLING = BLOCKS.register("potted_crape_myrtle_purple_sapling",
            () -> new FlowerPotBlock(TreeBlocks.PURPLE_CRAPE_MYRTLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Pink Crape Myrtle
    public static final RegistryObject<Block> PINK_CRAPE_MYRTLE_SPRING_LEAVES = registerBlock("crape_myrtle_pink_spring_leaves",
            () -> new PinkCrapeMyrtleSpringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> PINK_CRAPE_MYRTLE_LEAVES = registerBlock("crape_myrtle_pink_leaves",
            () -> new PinkCrapeMyrtleLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> PINK_CRAPE_MYRTLE_FALL_LEAVES = registerBlock("crape_myrtle_pink_fall_leaves",
            () -> new PinkCrapeMyrtleFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PINK_CRAPE_MYRTLE_WINTER_BRANCHES));
    public static final RegistryObject<Block> PINK_CRAPE_MYRTLE_WINTER_BRANCHES = registerBlock("crape_myrtle_pink_branches",
            () -> new PinkCrapeMyrtleWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PINK_CRAPE_MYRTLE_SPRING_LEAVES));
    public static final RegistryObject<Block> PINK_CRAPE_MYRTLE_SAPLING = registerBlock("crape_myrtle_pink_sapling",
            PinkCrapeMyrtleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PINK_CRAPE_MYRTLE_SAPLING = BLOCKS.register("potted_crape_myrtle_pink_sapling",
            () -> new FlowerPotBlock(TreeBlocks.PINK_CRAPE_MYRTLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Pomegranate
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
    public static final RegistryObject<Block> POMEGRANATE_WINTER_BRANCHES = registerBlock("pomegranate_branches",
            () -> new PomegranateWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.POMEGRANATE_LEAVES));
    public static final RegistryObject<Block> POMEGRANATE_WINTER_FRUITING_BRANCHES = registerBlock("pomegranate_fruiting_branches",
            () -> new PomegranateWinterFruitingBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.POMEGRANATE_WINTER_BRANCHES));
    public static final RegistryObject<Block> POMEGRANATE_SAPLING = registerBlock("pomegranate_sapling",
            PomegranateSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_POMEGRANATE_SAPLING = BLOCKS.register("potted_pomegranate_sapling",
            () -> new FlowerPotBlock(TreeBlocks.POMEGRANATE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Coast Cottonwood
    public static final RegistryObject<Block> COAST_COTTONWOOD_LEAVES = registerBlock("coast_cottonwood_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> COAST_COTTONWOOD_SAPLING = registerBlock("coast_cottonwood_sapling",
            CoastCottonwoodSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_COAST_COTTONWOOD_SAPLING = BLOCKS.register("potted_coast_cottonwood_sapling",
            () -> new FlowerPotBlock(TreeBlocks.COAST_COTTONWOOD_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Cork Oak
    public static final RegistryObject<Block> CORK_OAK_LEAVES = registerBlock("cork_oak_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> CORK_OAK_SAPLING = registerBlock("cork_oak_sapling",
            CorkOakSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_CORK_OAK_SAPLING = BLOCKS.register("potted_cork_oak_sapling",
            () -> new FlowerPotBlock(TreeBlocks.CORK_OAK_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Dragon Blood
    public static final RegistryObject<Block> DRAGON_BLOOD_LEAVES = registerBlock("dragon_blood_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> DRAGON_BLOOD_SAPLING = registerBlock("dragon_blood_sapling",
            DragonBloodSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_DRAGON_BLOOD_SAPLING = BLOCKS.register("potted_dragon_blood_sapling",
            () -> new FlowerPotBlock(TreeBlocks.DRAGON_BLOOD_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Douglas Fir
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


    ///Elderberry
    public static final RegistryObject<Block> ELDERBERRY_LOG = registerBlock("elderberry_log",
            ModLogs::new);
    public static final RegistryObject<Block> ELDERBERRY_LEAVES = registerBlock("elderberry_leaves",
            () -> new ElderberryLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> ELDERBERRY_FLOWERING_LEAVES = registerBlock("elderberry_flowering_leaves",
            () -> new ElderberryFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ELDERBERRY_FRUITING_LEAVES));
    public static final RegistryObject<Block> ELDERBERRY_FRUITING_LEAVES = registerBlock("elderberry_fruiting_leaves",
            () -> new ElderberryFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> ELDERBERRY_FALL_LEAVES = registerBlock("elderberry_fall_leaves",
            () -> new ElderberryFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ELDERBERRY_WINTER_BRANCHES));
    public static final RegistryObject<Block> ELDERBERRY_FALL_FRUITING_LEAVES = registerBlock("elderberry_fall_fruiting_leaves",
            () -> new ElderberryFallFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ELDERBERRY_WINTER_BRANCHES));
    public static final RegistryObject<Block> ELDERBERRY_WINTER_BRANCHES = registerBlock("elderberry_branches",
            () -> new ElderberryWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ELDERBERRY_LEAVES));
    public static final RegistryObject<Block> ELDERBERRY_SAPLING = registerBlock("elderberry_sapling",
            ElderberrySapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_ELDERBERRY_SAPLING = BLOCKS.register("potted_elderberry_sapling",
            () -> new FlowerPotBlock(TreeBlocks.ELDERBERRY_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    ///Erythrina
    public static final RegistryObject<Block> INDIAN_CORAL_LEAVES = registerBlock("indian_coral_leaves",
            () -> new IndianCoralLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.INDIAN_CORAL_DRIED_BRANCHES));
    public static final RegistryObject<Block> INDIAN_CORAL_DRIED_BRANCHES = registerBlock("indian_coral_branches",
            () -> new IndianCoralDriedBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.INDIAN_CORAL_LEAVES));
    public static final RegistryObject<Block> INDIAN_CORAL_SAPLING = registerBlock("indian_coral_sapling",
            IndianCoralSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_INDIAN_CORAL_SAPLING = BLOCKS.register("potted_indian_coral_sapling",
            () -> new FlowerPotBlock(TreeBlocks.INDIAN_CORAL_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    ///Fig
    //Normal fig
    public static final RegistryObject<Block> FIG_LEAVES = registerBlock("fig_leaves",
            () -> new FigLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> FIG_FRUITING_LEAVES = registerBlock("fig_fruiting_leaves",
            () -> new FigFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.FIG_LEAVES));
    public static final RegistryObject<Block> FIG_FALL_LEAVES = registerBlock("fig_fall_leaves",
            () -> new FigFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.FIG_WINTER_BRANCHES));
    public static final RegistryObject<Block> FIG_WINTER_BRANCHES = registerBlock("fig_branches",
            () -> new FigWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.FIG_LEAVES));
    //White Fig
    public static final RegistryObject<Block> WHITE_FIG_LEAVES = registerBlock("fig_white_leaves",
            () -> new WhiteFigLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> WHITE_FIG_FRUITING_LEAVES = registerBlock("fig_white_fruiting_leaves",
            () -> new WhiteFigFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WHITE_FIG_LEAVES));
    public static final RegistryObject<Block> WHITE_FIG_FALL_LEAVES = registerBlock("fig_white_fall_leaves",
            () -> new WhiteFigFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WHITE_FIG_WINTER_BRANCHES));
    public static final RegistryObject<Block> WHITE_FIG_WINTER_BRANCHES = registerBlock("fig_white_branches",
            () -> new WhiteFigWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WHITE_FIG_LEAVES));
    public static final RegistryObject<Block> FIG_SAPLING = registerBlock("fig_sapling",
            FigSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_FIG_SAPLING = BLOCKS.register("potted_fig_sapling",
            () -> new FlowerPotBlock(TreeBlocks.FIG_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Sycamore Fig
    public static final RegistryObject<Block> SYCAMORE_FIG_LEAVES = registerBlock("sycamore_fig_leaves",
            () -> new SycamoreFigLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> SYCAMORE_FIG_FRUITING_LEAVES = registerBlock("sycamore_fig_fruiting_leaves",
            () -> new SycamoreFigFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> SYCAMORE_FIG_BRANCHES = registerBlock("sycamore_fig_branches",
            () -> new SycamoreFigBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> SYCAMORE_FIG_FRUITING_BRANCHES = registerBlock("sycamore_fig_fruiting_branches",
            () -> new SycamoreFigFruitingBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> SYCAMORE_FIG_SAPLING = registerBlock("sycamore_fig_sapling",
            SycamoreFigSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SYCAMORE_FIG_SAPLING = BLOCKS.register("potted_sycamore_fig_sapling",
            () -> new FlowerPotBlock(TreeBlocks.SYCAMORE_FIG_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Jungle Figs
    public static final RegistryObject<Block> FICUS_ROOTS_PLANT = registerBlock("ficus_roots_plant",
            () -> new FicusRootsPlantBlock(AbstractBlock.Properties.create(Material.PLANTS, MaterialColor.BROWN).tickRandomly().
                    doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.VINE)));
    //Weeping Fig
    public static final RegistryObject<Block> WEEPING_FIG_LEAVES = registerBlock("weeping_fig_leaves",
            UrostigmaLeaves::new);
    public static final RegistryObject<Block> WEEPING_FIG_SAPLING = registerBlock("weeping_fig_sapling",
            WeepingFigSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_WEEPING_FIG_SAPLING = BLOCKS.register("potted_weeping_fig_sapling",
            () -> new FlowerPotBlock(TreeBlocks.WEEPING_FIG_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Indian laurel
    public static final RegistryObject<Block> INDIAN_LAUREL_LEAVES = registerBlock("indian_laurel_leaves",
            UrostigmaLeaves::new);
    public static final RegistryObject<Block> INDIAN_LAUREL_SAPLING = registerBlock("indian_laurel_sapling",
            IndianLaurelSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_INDIAN_LAUREL_SAPLING = BLOCKS.register("potted_indian_laurel_sapling",
            () -> new FlowerPotBlock(TreeBlocks.INDIAN_LAUREL_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Rubber tree
    public static final RegistryObject<Block> RUBBER_TREE_LEAVES = registerBlock("rubber_tree_leaves",
            UrostigmaLeaves::new);
    public static final RegistryObject<Block> RUBBER_TREE_SAPLING = registerBlock("rubber_tree_sapling",
            RubberTreeSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_RUBBER_TREE_SAPLING = BLOCKS.register("potted_rubber_tree_sapling",
            () -> new FlowerPotBlock(TreeBlocks.RUBBER_TREE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    ///Fir
    //Sub-alpine fir
    public static final RegistryObject<Block> SUBALPINE_FIR_LEAVES = registerBlock("subalpine_fir_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> SUBALPINE_FIR_SAPLING = registerBlock("subalpine_fir_sapling",
            SubalpineFirSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SUBALPINE_FIR_SAPLING = BLOCKS.register("potted_subalpine_fir_sapling",
            () -> new FlowerPotBlock(TreeBlocks.SUBALPINE_FIR_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //White Fir
    public static final RegistryObject<Block> WHITE_FIR_LEAVES = registerBlock("white_fir_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> WHITE_FIR_SAPLING = registerBlock("white_fir_sapling",
            WhiteFirSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_WHITE_FIR_SAPLING = BLOCKS.register("potted_white_fir_sapling",
            () -> new FlowerPotBlock(TreeBlocks.WHITE_FIR_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    ///G
    //Ginkgo Forest
    public static final RegistryObject<Block> GINKGO_LEAVES = registerBlock("ginkgo_leaves",
            () -> new GinkgoLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.GINKGO_FALL_LEAVES));
    public static final RegistryObject<Block> GINKGO_FALL_LEAVES = registerBlock("ginkgo_fall_leaves",
            () -> new GinkgoFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.GINKGO_WINTER_BRANCHES));
    public static final RegistryObject<Block> GINKGO_WINTER_BRANCHES = registerBlock("ginkgo_branches",
            () -> new GinkgoWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.GINKGO_LEAVES));
    public static final RegistryObject<Block> GINKGO_SAPLING = registerBlock("ginkgo_sapling",
            GinkgoSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_GINKGO_SAPLING = BLOCKS.register("potted_ginkgo_sapling",
            () -> new FlowerPotBlock(TreeBlocks.GINKGO_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    //Hazelnut
    public static final RegistryObject<Block> HAZELNUT_LEAVES = registerBlock("hazelnut_leaves",
            () -> new HazelnutLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> HAZELNUT_FLOWERING_LEAVES = registerBlock("hazelnut_flowering_leaves",
            () -> new HazelnutFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.HAZELNUT_FRUITING_LEAVES));
    public static final RegistryObject<Block> HAZELNUT_FRUITING_LEAVES = registerBlock("hazelnut_fruiting_leaves",
            () -> new HazelnutFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.HAZELNUT_FALL_LEAVES));
    public static final RegistryObject<Block> HAZELNUT_FALL_LEAVES = registerBlock("hazelnut_fall_leaves",
            () -> new HazelnutFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.HAZELNUT_WINTER_BRANCHES));
    public static final RegistryObject<Block> HAZELNUT_WINTER_BRANCHES = registerBlock("hazelnut_branches",
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
    public static final RegistryObject<Block> HOLM_OAK_LEAVES = registerBlock("holm_oak_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> HOLM_OAK_SAPLING = registerBlock("holm_oak_sapling",
            HolmOakSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_HOLM_OAK_SAPLING = BLOCKS.register("potted_holm_oak_sapling",
            () -> new FlowerPotBlock(TreeBlocks.HOLM_OAK_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    ///Hollies/Ilexes
    public static final RegistryObject<Block> HOLLY_LEAVES = registerBlock("holly_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> HOLLY_SAPLING = registerBlock("holly_sapling",
            HollySapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_HOLLY_SAPLING = BLOCKS.register("potted_holly_sapling",
            () -> new FlowerPotBlock(TreeBlocks.HOLLY_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    ///Juniper
    public static final RegistryObject<Block> JUNIPER_LEAVES = registerBlock("juniper_leaves",
            JuniperLeaves::new);
    public static final RegistryObject<Block> JUNIPER_SAPLING = registerBlock("juniper_sapling",
            JuniperSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_JUNIPER_SAPLING = BLOCKS.register("potted_juniper_sapling",
            () -> new FlowerPotBlock(TreeBlocks.JUNIPER_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));





    ///K



    ///Live Oak
    public static final RegistryObject<Block> LIVE_OAK_LEAVES = registerBlock("live_oak_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> LIVE_OAK_SAPLING = registerBlock("live_oak_sapling",
            LiveOakSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_LIVE_OAK_SAPLING = BLOCKS.register("potted_live_oak_sapling",
            () -> new FlowerPotBlock(TreeBlocks.LIVE_OAK_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> MOSSED_LIVE_OAK_SAPLING = registerBlock("mossed_live_oak_sapling",
            MossedLiveOakSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_MOSSED_LIVE_OAK_SAPLING = BLOCKS.register("potted_mossed_live_oak_sapling",
            () -> new FlowerPotBlock(TreeBlocks.MOSSED_LIVE_OAK_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    ///Larch
    public static final RegistryObject<Block> LARCH_LEAVES = registerBlock("larch_leaves",
            () -> new LarchLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.LARCH_FALL_LEAVES));
    public static final RegistryObject<Block> LARCH_FALL_LEAVES = registerBlock("larch_fall_leaves",
            () -> new LarchFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.LARCH_WINTER_BRANCHES));
    public static final RegistryObject<Block> LARCH_WINTER_BRANCHES = registerBlock("larch_branches",
            () -> new LarchWinterLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.LARCH_LEAVES));
    public static final RegistryObject<Block> LARCH_SAPLING = registerBlock("larch_sapling",
            LarchSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_LARCH_SAPLING = BLOCKS.register("potted_larch_sapling",
            () -> new FlowerPotBlock(TreeBlocks.LARCH_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    ///Mango
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


    ///Marula
    public static final RegistryObject<Block> MARULA_LEAVES = registerBlock("marula_leaves",
            () -> new MarulaLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> MARULA_FRUITING_LEAVES = registerBlock("marula_fruiting_leaves",
            () -> new MarulaFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.MARULA_LEAVES));
    public static final RegistryObject<Block> MARULA_DRIED_BRANCHES = registerBlock("marula_branches",
            () -> new MarulaDriedBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.MARULA_LEAVES));
    public static final RegistryObject<Block> MARULA_SAPLING = registerBlock("marula_sapling",
            MarulaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_MARULA_SAPLING = BLOCKS.register("potted_marula_sapling",
            () -> new FlowerPotBlock(TreeBlocks.MARULA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    ///Mesquite
    public static final RegistryObject<Block> MESQUITE_LEAVES = registerBlock("mesquite_leaves",
            () -> new MesquiteLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.MESQUITE_WINTER_BRANCHES));
    public static final RegistryObject<Block> MESQUITE_WINTER_BRANCHES = registerBlock("mesquite_branches",
            () -> new MesquiteWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.MESQUITE_LEAVES));
    public static final RegistryObject<Block> MESQUITE_SAPLING = registerBlock("mesquite_sapling",
            MesquiteSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_MESQUITE_SAPLING = BLOCKS.register("potted_mesquite_sapling",
            () -> new FlowerPotBlock(TreeBlocks.MESQUITE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    ///Bayberry
    public static final RegistryObject<Block> SOUTHERN_WAX_MYRTLE_LEAVES = registerBlock("southern_wax_myrtle_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> SOUTHERN_WAX_MYRTLE_SAPLING = registerBlock("southern_wax_myrtle_sapling",
            SouthernWaxMyrtleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SOUTHERN_WAX_MYRTLE_SAPLING = BLOCKS.register("potted_southern_wax_myrtle_sapling",
            () -> new FlowerPotBlock(TreeBlocks.SOUTHERN_WAX_MYRTLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    ///Mulberry
    public static final RegistryObject<Block> MULBERRY_LEAVES = registerBlock("mulberry_leaves",
            () -> new MulberryLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> MULBERRY_FRUITING_LEAVES = registerBlock("mulberry_fruiting_leaves",
            () -> new MulberryFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> MULBERRY_FALL_LEAVES = registerBlock("mulberry_fall_leaves",
            () -> new MulberryFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.MULBERRY_WINTER_BRANCHES)); //Only subtropical - temperate climate
    public static final RegistryObject<Block> MULBERRY_WINTER_BRANCHES = registerBlock("mulberry_branches",
            () -> new MulberryWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.MULBERRY_LEAVES));
    public static final RegistryObject<Block> MULBERRY_SAPLING = registerBlock("mulberry_sapling",
            MulberrySapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_MULBERRY_SAPLING = BLOCKS.register("potted_mulberry_sapling",
            () -> new FlowerPotBlock(TreeBlocks.MULBERRY_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));






    ///Nothofagus
    //Antartic Beech
    public static final RegistryObject<Block> SOUTHERN_BEECH_LEAVES = registerBlock("southern_beech_leaves",
            () -> new SouthernBeechLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.SOUTHERN_BEECH_FALL_LEAVES));
    public static final RegistryObject<Block> SOUTHERN_BEECH_FALL_LEAVES = registerBlock("southern_beech_fall_leaves",
            () -> new SouthernBeechFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.SOUTHERN_BEECH_WINTER_BRANCHES));
    public static final RegistryObject<Block> SOUTHERN_BEECH_WINTER_BRANCHES = registerBlock("southern_beech_branches",
            () -> new SouthernBeechWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.SOUTHERN_BEECH_LEAVES));
    public static final RegistryObject<Block> SOUTHERN_BEECH_SAPLING = registerBlock("southern_beech_sapling",
            SouthernBeechSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SOUTHERN_BEECH_SAPLING = BLOCKS.register("potted_southern_beech_sapling",
            () -> new FlowerPotBlock(TreeBlocks.SOUTHERN_BEECH_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    //Lenga
    public static final RegistryObject<Block> LENGA_LEAVES = registerBlock("lenga_leaves",
            () -> new LengaLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.LENGA_FALL_LEAVES));
    public static final RegistryObject<Block> LENGA_FALL_LEAVES = registerBlock("lenga_fall_leaves",
            () -> new LengaFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.LENGA_WINTER_BRANCHES));
    public static final RegistryObject<Block> LENGA_WINTER_BRANCHES = registerBlock("lenga_branches",
            () -> new LengaWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.LENGA_LEAVES));
    public static final RegistryObject<Block> LENGA_SAPLING = registerBlock("lenga_sapling",
            LengaSapling::new);
    //Coihue
    public static final RegistryObject<Block> COIHUE_LEAVES = registerBlock("coihue_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> COIHUE_SAPLING = registerBlock("coihue_sapling",
            CoihueSapling::new);






    //Olive
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




    ///Pecan
    public static final RegistryObject<Block> PECAN_LEAVES = registerBlock("pecan_leaves",
            () -> new PecanLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> PECAN_FRUITING_LEAVES = registerBlock("pecan_fruiting_leaves",
            () -> new PecanFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PECAN_LEAVES));
    public static final RegistryObject<Block> PECAN_FALL_LEAVES = registerBlock("pecan_fall_leaves",
            () -> new PecanFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PECAN_WINTER_BRANCHES));
    public static final RegistryObject<Block> PECAN_WINTER_BRANCHES = registerBlock("pecan_branches",
            () -> new PecanWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PECAN_LEAVES));
    public static final RegistryObject<Block> PECAN_SAPLING = registerBlock("pecan_sapling",
            PecanSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PECAN_SAPLING = BLOCKS.register("potted_pecan_sapling",
            () -> new FlowerPotBlock(TreeBlocks.PECAN_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    ///Persimmon
    //Persimmon
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
    public static final RegistryObject<Block> PERSIMMON_WINTER_BRANCHES = registerBlock("persimmon_branches",
            () -> new PersimmonWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PERSIMMON_LEAVES));
    public static final RegistryObject<Block> PERSIMMON_WINTER_FRUITING_BRANCHES = registerBlock("persimmon_fruiting_branches",
            () -> new PersimmonWinterFruitingBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PERSIMMON_WINTER_BRANCHES));
    public static final RegistryObject<Block> PERSIMMON_SAPLING = registerBlock("persimmon_sapling",
            PersimmonSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PERSIMMON_SAPLING = BLOCKS.register("potted_persimmon_sapling",
            () -> new FlowerPotBlock(TreeBlocks.PERSIMMON_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    //Jackalberry
    public static final RegistryObject<Block> JACKALBERRY_LEAVES = registerBlock("jackalberry_leaves",
            JackalberryLeaves::new);
    public static final RegistryObject<Block> JACKALBERRY_SAPLING = registerBlock("jackalberry_sapling",
            JackalberrySapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_JACKALBERRY_SAPLING = BLOCKS.register("potted_jackalberry_sapling",
            () -> new FlowerPotBlock(TreeBlocks.JACKALBERRY_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    ///Pistachio
    public static final RegistryObject<Block> PISTACHIO_LEAVES = registerBlock("pistachio_leaves",
            () -> new PistachioLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> PISTACHIO_FRUITING_LEAVES = registerBlock("pistachio_fruiting_leaves",
            () -> new PistachioFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PISTACHIO_LEAVES));
    public static final RegistryObject<Block> PISTACHIO_WINTER_BRANCHES = registerBlock("pistachio_branches",
            () -> new PistachioWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PISTACHIO_LEAVES));
    public static final RegistryObject<Block> PISTACHIO_SAPLING = registerBlock("pistachio_sapling",
            PistachioSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PISTACHIO_SAPLING = BLOCKS.register("potted_pistachio_sapling",
            () -> new FlowerPotBlock(TreeBlocks.PISTACHIO_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    ///Plane
    public static final RegistryObject<Block> PLANE_LEAVES = registerBlock("plane_leaves",
            () -> new PlaneLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PLANE_FALL_LEAVES));
    public static final RegistryObject<Block> PLANE_FALL_LEAVES = registerBlock("plane_fall_leaves",
            () -> new PlaneFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PLANE_WINTER_BRANCHES));
    public static final RegistryObject<Block> PLANE_WINTER_BRANCHES = registerBlock("plane_branches",
            () -> new PlaneWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PLANE_LEAVES));
    public static final RegistryObject<Block> PLANE_SAPLING = registerBlock("plane_sapling",
            PlaneSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PLANE_SAPLING = BLOCKS.register("potted_plane_sapling",
            () -> new FlowerPotBlock(TreeBlocks.PLANE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));





    ///R
//Red Kapok
    public static final RegistryObject<Block> RED_KAPOK_LEAVES = registerBlock("red_kapok_leaves",
            () -> new RedKapokLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.RED_KAPOK_WINTER_BRANCHES));
    public static final RegistryObject<Block> RED_KAPOK_WINTER_BRANCHES = registerBlock("red_kapok_branches",
            () -> new RedKapokWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.RED_KAPOK_FLOWERING_BRANCHES));
    public static final RegistryObject<Block> RED_KAPOK_FLOWERING_BRANCHES = registerBlock("red_kapok_flowering_branches",
            () -> new RedKapokFloweringBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.RED_KAPOK_FRUITING_LEAVES));
    public static final RegistryObject<Block> RED_KAPOK_FRUITING_LEAVES = registerBlock("red_kapok_fruiting_leaves",
            () -> new RedKapokFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
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
    public static final RegistryObject<Block> RED_OAK_WINTER_BRANCHES = registerBlock("red_oak_branches",
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
    public static final RegistryObject<Block> RED_MAPLE_WINTER_BRANCHES = registerBlock("red_maple_branches",
            () -> new RedMapleWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.RED_MAPLE_LEAVES));

    public static final RegistryObject<Block> RED_MAPLE_SAPLING = registerBlock("red_maple_sapling",
            RedMapleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_RED_MAPLE_SAPLING = BLOCKS.register("potted_red_maple_sapling",
            () -> new FlowerPotBlock(TreeBlocks.RED_MAPLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
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











    //Sausage Tree
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






    //Starfruit
    public static final RegistryObject<Block> STARFRUIT_LEAVES = registerBlock("starfruit_leaves",
            () -> new StarfruitLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> STARFRUIT_FLOWERING_LEAVES = registerBlock("starfruit_flowering_leaves",
            () -> new StarfruitFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.STARFRUIT_FRUITING_LEAVES));
    public static final RegistryObject<Block> STARFRUIT_FRUITING_LEAVES = registerBlock("starfruit_fruiting_leaves",
            () -> new StarfruitFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> STARFRUIT_WINTER_LEAVES = registerBlock("starfruit_winter_leaves",
            () -> new StarfruitWinterLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.STARFRUIT_BRANCHES));
    public static final RegistryObject<Block> STARFRUIT_WINTER_FRUITING_LEAVES = registerBlock("starfruit_winter_fruiting_leaves",
            () -> new StarfruitWinterFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.STARFRUIT_BRANCHES));
    public static final RegistryObject<Block> STARFRUIT_BRANCHES = registerBlock("starfruit_branches",
            () -> new StarfruitBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.STARFRUIT_LEAVES));
    public static final RegistryObject<Block> STARFRUIT_SAPLING = registerBlock("starfruit_sapling",
            StarfruitSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_STARFRUIT_SAPLING = BLOCKS.register("potted_starfruit_sapling",
            () -> new FlowerPotBlock(TreeBlocks.STARFRUIT_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    ///Strawberry Tree
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


    ///Southern Magnolia
    public static final RegistryObject<Block> SOUTHERN_MAGNOLIA_LEAVES = registerBlock("southern_magnolia_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> SOUTHERN_MAGNOLIA_SAPLING = registerBlock("southern_magnolia_sapling",
            SouthernMagnoliaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SOUTHERN_MAGNOLIA_SAPLING = BLOCKS.register("potted_southern_magnolia_sapling",
            () -> new FlowerPotBlock(TreeBlocks.SOUTHERN_MAGNOLIA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    ///Socotra Desert Rose
    public static final RegistryObject<Block> SOCOTRA_DESERT_ROSE_LEAVES = registerBlock("socotra_desert_rose_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> SOCOTRA_DESERT_ROSE_SAPLING = registerBlock("socotra_desert_rose_sapling",
            SocotraDesertRoseSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SOCOTRA_DESERT_ROSE_SAPLING = BLOCKS.register("potted_socotra_desert_rose_sapling",
            () -> new FlowerPotBlock(TreeBlocks.SOCOTRA_DESERT_ROSE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    ///Socotra Cucumber
    public static final RegistryObject<Block> SOCOTRA_CUCUMBER_LEAVES = registerBlock("socotra_cucumber_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> SOCOTRA_CUCUMBER_LEAVES_VINE = registerBlock("socotra_cucumber_leaves_vine",
            () -> new SocotraCucumberLeavesVineBlock(AbstractBlock.Properties.create(Material.PLANTS, MaterialColor.GREEN_TERRACOTTA).tickRandomly().
                    doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.VINE)));
    public static final RegistryObject<Block> SOCOTRA_CUCUMBER_SAPLING = registerBlock("socotra_cucumber_sapling",
            SocotraCucumberSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SOCOTRA_CUCUMBER_SAPLING = BLOCKS.register("potted_socotra_cucumber_sapling",
            () -> new FlowerPotBlock(TreeBlocks.SOCOTRA_CUCUMBER_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    ///Sweet Chestnut
    public static final RegistryObject<Block> SWEET_CHESTNUT_LEAVES = registerBlock("sweet_chestnut_leaves",
            () -> new SweetChestnutLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> SWEET_CHESTNUT_FRUITING_LEAVES = registerBlock("sweet_chestnut_fruiting_leaves",
            () -> new SweetChestnutFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.SWEET_CHESTNUT_FALL_LEAVES));
    public static final RegistryObject<Block> SWEET_CHESTNUT_FALL_LEAVES = registerBlock("sweet_chestnut_fall_leaves",
            () -> new SweetChestnutFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.SWEET_CHESTNUT_WINTER_BRANCHES));
    public static final RegistryObject<Block> SWEET_CHESTNUT_WINTER_BRANCHES = registerBlock("sweet_chestnut_branches",
            () -> new SweetChestnutWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.SWEET_CHESTNUT_LEAVES));
    public static final RegistryObject<Block> SWEET_CHESTNUT_SAPLING = registerBlock("sweet_chestnut_sapling",
            SweetChestnutSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SWEET_CHESTNUT_SAPLING = BLOCKS.register("potted_sweet_chestnut_sapling",
            () -> new FlowerPotBlock(TreeBlocks.SWEET_CHESTNUT_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    ///Tamarind
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


    ///Tropical Almond
    public static final RegistryObject<Block> TROPICAL_ALMOND_NEW_LEAVES = registerBlock("tropical_almond_new_leaves",
            () -> new TropicalAlmondNewLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.TROPICAL_ALMOND_LEAVES));
    public static final RegistryObject<Block> TROPICAL_ALMOND_LEAVES = registerBlock("tropical_almond_leaves",
            () -> new TropicalAlmondLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.TROPICAL_ALMOND_FALL_LEAVES));
    public static final RegistryObject<Block> TROPICAL_ALMOND_FALL_LEAVES = registerBlock("tropical_almond_fall_leaves",
            () -> new TropicalAlmondFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.TROPICAL_ALMOND_DRIED_BRANCHES));
    public static final RegistryObject<Block> TROPICAL_ALMOND_DRIED_BRANCHES = registerBlock("tropical_almond_branches",
            () -> new TropicalAlmondDriedBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.TROPICAL_ALMOND_NEW_LEAVES));
    public static final RegistryObject<Block> TROPICAL_ALMOND_SAPLING = registerBlock("tropical_almond_sapling",
            TropicalAlmondSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_TROPICAL_ALMOND_SAPLING = BLOCKS.register("potted_tropical_almond_sapling",
            () -> new FlowerPotBlock(TreeBlocks.TROPICAL_ALMOND_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));




    //Walnut
    public static final RegistryObject<Block> WALNUT_LEAVES = registerBlock("walnut_leaves",
            () -> new WalnutLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> WALNUT_FRUITING_LEAVES = registerBlock("walnut_fruiting_leaves",
            () -> new WalnutFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WALNUT_FALL_LEAVES));
    public static final RegistryObject<Block> WALNUT_FALL_LEAVES = registerBlock("walnut_fall_leaves",
            () -> new WalnutFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WALNUT_WINTER_BRANCHES));
    public static final RegistryObject<Block> WALNUT_WINTER_BRANCHES = registerBlock("walnut_branches",
            () -> new WalnutWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WALNUT_LEAVES));
    public static final RegistryObject<Block> WALNUT_SAPLING = registerBlock("walnut_sapling",
            WalnutSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_WALNUT_SAPLING = BLOCKS.register("potted_walnut_sapling",
            () -> new FlowerPotBlock(TreeBlocks.WALNUT_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    //Hemlock
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


    ///Willow
    public static final RegistryObject<Block> WEEPING_WILLOW_LEAVES = registerBlock("weeping_willow_leaves",
            () -> new WeepingWillowLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WEEPING_WILLOW_FALL_LEAVES));
    public static final RegistryObject<Block> WEEPING_WILLOW_FALL_LEAVES = registerBlock("weeping_willow_fall_leaves",
            () -> new WeepingWillowFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WEEPING_WILLOW_BRANCHES));
    public static final RegistryObject<Block> WEEPING_WILLOW_BRANCHES = registerBlock("weeping_willow_branches",
            () -> new WeepingWillowBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WEEPING_WILLOW_LEAVES));
    public static final RegistryObject<Block> WEEPING_WILLOW_SAPLING = registerBlock("weeping_willow_sapling",
            WeepingWillowSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_WEEPING_WILLOW_SAPLING = BLOCKS.register("potted_weeping_willow_sapling",
            () -> new FlowerPotBlock(TreeBlocks.WEEPING_WILLOW_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    ///Yew
    public static final RegistryObject<Block> YEW_LEAVES = registerBlock("yew_leaves",
            () -> new YewLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.YEW_FRUITING_LEAVES));
    public static final RegistryObject<Block> YEW_FRUITING_LEAVES = registerBlock("yew_fruiting_leaves",
            () -> new YewFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.YEW_LEAVES));
    public static final RegistryObject<Block> YEW_SAPLING = registerBlock("yew_sapling",
            YewSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_YEW_SAPLING = BLOCKS.register("potted_yew_sapling",
            () -> new FlowerPotBlock(TreeBlocks.YEW_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));




    ///Pink Ivory
    public static final RegistryObject<Block> PINK_IVORY_LEAVES = registerBlock("pink_ivory_leaves",
            () -> new PinkIvoryLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> PINK_IVORY_FALL_LEAVES = registerBlock("pink_ivory_fall_leaves",
            () -> new PinkIvoryFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PINK_IVORY_DRIED_BRANCHES));
    public static final RegistryObject<Block> PINK_IVORY_FRUITING_LEAVES = registerBlock("pink_ivory_fruiting_leaves",
            () -> new PinkIvoryFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PINK_IVORY_LEAVES));
    public static final RegistryObject<Block> PINK_IVORY_DRIED_BRANCHES = registerBlock("pink_ivory_branches",
            () -> new PinkIvoryDriedBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.PINK_IVORY_LEAVES));
    public static final RegistryObject<Block> PINK_IVORY_SAPLING = registerBlock("pink_ivory_sapling",
            PinkIvorySapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PINK_IVORY_SAPLING = BLOCKS.register("potted_pink_ivory_sapling",
            () -> new FlowerPotBlock(TreeBlocks.PINK_IVORY_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    ///Orchid tree
    public static final RegistryObject<Block> ORCHID_TREE_LEAVES = registerBlock("orchid_tree_leaves",
            () -> new OrchidTreeLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> ORCHID_TREE_WINTER_BRANCHES = registerBlock("orchid_tree_branches",
            () -> new OrchidTreeDriedBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ORCHID_TREE_FLOWERING_BRANCHES));
    public static final RegistryObject<Block> ORCHID_TREE_FLOWERING_BRANCHES = registerBlock("orchid_tree_flowering_branches",
            () -> new OrchidTreeFloweringBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ORCHID_TREE_LEAVES));
    public static final RegistryObject<Block> ORCHID_TREE_SAPLING = registerBlock("orchid_tree_sapling",
            OrchidTreeSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_ORCHID_TREE_SAPLING = BLOCKS.register("potted_orchid_tree_sapling",
            () -> new FlowerPotBlock(TreeBlocks.ORCHID_TREE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    ///Teak
    public static final RegistryObject<Block> TEAK_LEAVES = registerBlock("teak_leaves",
            () -> new TeakLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE)));
    public static final RegistryObject<Block> TEAK_FLOWERING_LEAVES = registerBlock("teak_flowering_leaves",
            () -> new TeakFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.TEAK_FRUITING_LEAVES));
    public static final RegistryObject<Block> TEAK_FRUITING_LEAVES = registerBlock("teak_fruiting_leaves",
            () -> new TeakFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.TEAK_FALL_LEAVES));
    public static final RegistryObject<Block> TEAK_FALL_LEAVES = registerBlock("teak_fall_leaves",
            () -> new TeakFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.TEAK_DRIED_BRANCHES));
    public static final RegistryObject<Block> TEAK_DRIED_BRANCHES = registerBlock("teak_branches",
            () -> new TeakDriedBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.TEAK_LEAVES));
    public static final RegistryObject<Block> TEAK_SAPLING = registerBlock("teak_sapling",
            TeakSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_TEAK_SAPLING = BLOCKS.register("potted_teak_sapling",
            () -> new FlowerPotBlock(TreeBlocks.TEAK_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    /// Baobab
    public static final RegistryObject<Block> BAOBAB_LEAVES = registerBlock("baobab_leaves",
            () -> new BaobabLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.BAOBAB_BRANCHES));
    public static final RegistryObject<Block> BAOBAB_BRANCHES = registerBlock("baobab_branches",
            () -> new BaobabBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.BAOBAB_LEAVES));
    public static final RegistryObject<Block> BAOBAB_FLOWER = registerBlock("baobab_flower",
            BaobabFlowerBlock::new);
    public static final RegistryObject<Block> BAOBAB_STALK = registerBlock("baobab_stalk",
            BaobabStalkBlock::new);
    public static final RegistryObject<Block> BAOBAB_BUD = registerBlock("baobab_bud",
            BaobabBudBlock::new);
    public static final RegistryObject<Block> BAOBAB_FRUIT = registerBlock("baobab_fruit",
            BaobabFruitBlock::new);
    public static final RegistryObject<Block> BAOBAB_SAPLING = registerBlock("baobab_sapling",
            BaobabSapling::new);

    ///Acerola
    public static final RegistryObject<Block> ACEROLA_LEAVES = registerBlock("acerola_leaves",
            () -> new AcerolaLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ACEROLA_FLOWERING_LEAVES));
    public static final RegistryObject<Block> ACEROLA_FLOWERING_LEAVES = registerBlock("acerola_flowering_leaves",
            () -> new AcerolaFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ACEROLA_FRUITING_LEAVES));
    public static final RegistryObject<Block> ACEROLA_FRUITING_LEAVES = registerBlock("acerola_fruiting_leaves",
            () -> new AcerolaFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.ACEROLA_LEAVES));
    public static final RegistryObject<Block> ACEROLA_SAPLING = registerBlock("acerola_sapling",
            AcerolaSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_ACEROLA_SAPLING = BLOCKS.register("potted_acerola_sapling",
            () -> new FlowerPotBlock(TreeBlocks.ACEROLA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));



    /// Privet
    public static final RegistryObject<Block> WAX_LEAF_PRIVET_LEAVES = registerBlock("wax_leaf_privet_leaves",
            () -> new PrivetLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WAX_LEAF_PRIVET_FLOWERING_LEAVES));
    public static final RegistryObject<Block> WAX_LEAF_PRIVET_FLOWERING_LEAVES = registerBlock("wax_leaf_privet_flowering_leaves",
            () -> new PrivetFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WAX_LEAF_PRIVET_FRUITING_LEAVES));
    public static final RegistryObject<Block> WAX_LEAF_PRIVET_FRUITING_LEAVES = registerBlock("wax_leaf_privet_fruiting_leaves",
            () -> new PrivetFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.WAX_LEAF_PRIVET_LEAVES));
    public static final RegistryObject<Block> WAX_LEAF_PRIVET_SAPLING = registerBlock("wax_leaf_privet_sapling",
            WaxLeafPrivetSapling::new);


    //Subtropical Laurel Forest
    public static final RegistryObject<Block> LYCHEE_LEAVES = registerBlock("lychee_leaves",
            () -> new LycheeLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.LYCHEE_FLOWERING_LEAVES));
    public static final RegistryObject<Block> LYCHEE_FLOWERING_LEAVES = registerBlock("lychee_flowering_leaves",
            () -> new LycheeFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.LYCHEE_FRUITING_LEAVES));
    public static final RegistryObject<Block> LYCHEE_FRUITING_LEAVES = registerBlock("lychee_fruiting_leaves",
            () -> new LycheeFruitingLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.LYCHEE_LEAVES));
    public static final RegistryObject<Block> LYCHEE_SAPLING = registerBlock("lychee_sapling",
            LycheeSapling::new);

    //Jungle and laurel forest
    public static final RegistryObject<Block> CHAMPAK_LEAVES = registerBlock("champak_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> CHAMPAK_SAPLING = registerBlock("champak_sapling",
            ChampakSapling::new);

    //Chilean forests
    public static final RegistryObject<Block> CHUSQUEA_BAMBOO_LEAVES = registerBlock("chusquea_bamboo_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> CHUSQUEA_BAMBOO_SAPLING = registerBlock("chusquea_bamboo_sapling",
            ChusqueaBambooSapling::new);


    //Jungle
    public static final RegistryObject<Block> RAINBOW_EUCALYPTUS_LEAVES = registerBlock("rainbow_eucalyptus_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> RAINBOW_EUCALYPTUS_SAPLING = registerBlock("rainbow_eucalyptus_sapling",
            RainbowEucalyptusSapling::new);



    //Subtropical Oak Forest
    public static final RegistryObject<Block> STONE_OAK_LEAVES = registerBlock("stone_oak_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> STONE_OAK_SAPLING = registerBlock("stone_oak_sapling",
            StoneOakSapling::new); //Hardy from zone 7 to 10
   /* public static final RegistryObject<Block> HENRY_STONE_OAK_LEAVES = registerBlock("henry_stone_oak_leaves",
            () -> new HenryStoneOakLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.HENRY_STONE_OAK_FLOWERING_LEAVES));
    public static final RegistryObject<Block> HENRY_STONE_OAK_FLOWERING_LEAVES = registerBlock("henry_stone_oak_flowering_leaves",
            () -> new HenryStoneOakFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.HENRY_STONE_OAK_LEAVES));
    public static final RegistryObject<Block> HENRY_STONE_OAK_SAPLING = registerBlock("henry_stone_oak_sapling",
            CastanopsisSapling::new);*/

    /// Ring Cupped Oak
    public static final RegistryObject<Block> RING_CUPPED_OAK_LEAVES = registerBlock("ring_cupped_oak_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> RING_CUPPED_OAK_SAPLING = registerBlock("ring_cupped_oak_sapling",
            RingCuppedOakSapling::new); //Hardy from zone 7 to 9



    public static final RegistryObject<Block> BAMBOOLEAF_OAK_LEAVES = registerBlock("bambooleaf_oak_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> BAMBOOLEAF_OAK_SAPLING = registerBlock("bambooleaf_oak_sapling",
            RingCuppedOakSapling::new);


    public static final RegistryObject<Block> CASTANOPSIS_LEAVES = registerBlock("castanopsis_leaves",
            () -> new CastanopsisLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.CASTANOPSIS_FLOWERING_LEAVES));
    public static final RegistryObject<Block> CASTANOPSIS_FLOWERING_LEAVES = registerBlock("castanopsis_flowering_leaves",
            () -> new CastanopsisFloweringLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.CASTANOPSIS_LEAVES));
    public static final RegistryObject<Block> CASTANOPSIS_SAPLING = registerBlock("castanopsis_sapling",
            CastanopsisSapling::new); //Hardy from zone 7 to 10


    public static final RegistryObject<Block> LAUREL_OAK_LEAVES = registerBlock("laurel_oak_leaves",
            () -> new LaurelOakLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.LAUREL_OAK_FALL_LEAVES));
    public static final RegistryObject<Block> LAUREL_OAK_FALL_LEAVES = registerBlock("laurel_oak_fall_leaves",
            () -> new LaurelOakFallLeaves(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.LAUREL_OAK_WINTER_BRANCHES));
    public static final RegistryObject<Block> LAUREL_OAK_WINTER_BRANCHES = registerBlock("laurel_oak_branches",
            () -> new LaurelOakWinterBranches(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                    .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE), TreeBlocks.LAUREL_OAK_LEAVES));
    public static final RegistryObject<Block> LAUREL_OAK_SAPLING = registerBlock("laurel_oak_sapling",
            LaurelOakSapling::new); //Hardy from zone 7 to 11

    //Tropical Australian Pine Rainforest
    public static final RegistryObject<Block> AGATHIS_LEAVES = registerBlock("agathis_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> AGATHIS_SAPLING = registerBlock("agathis_sapling",
            AgathisSapling::new);

    //Eucalyptus Forests
    public static final RegistryObject<Block> BLACKWOOD_ACACIA_LEAVES = registerBlock("blackwood_acacia_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> BLACKWOOD_ACACIA_SAPLING = registerBlock("blackwood_acacia_sapling",
            BlackwoodAcaciaSapling::new);

    //Cool-mediterranean Coastal Grove
    public static final RegistryObject<Block> COAST_LIVE_OAK_LEAVES = registerBlock("coast_live_oak_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> COAST_LIVE_OAK_SAPLING = registerBlock("coast_live_oak_sapling",
            CoastLiveOakSapling::new);

    //Hot temperate forest
    public static final RegistryObject<Block> LIQUIDAMBAR_LEAVES = registerBlock("liquidambar_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> LIQUIDAMBAR_SAPLING = registerBlock("liquidambar_sapling",
            ChampakSapling::new);


    public static final RegistryObject<Block> SAND_LAUREL_OAK_LEAVES = registerBlock("sand_laurel_oak_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> SAND_LAUREL_OAK_SAPLING = registerBlock("sand_laurel_oak_sapling",
            SandLaurelOakSapling::new);



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
