package com.caiocesarmods.caiocesarbiomes.block;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.block.custom.Saplings.CinnamonSapling;
import com.caiocesarmods.caiocesarbiomes.block.custom.leaves.ModLeaves;
import com.caiocesarmods.caiocesarbiomes.block.custom.logs.EucalyptusLog;
import com.caiocesarmods.caiocesarbiomes.block.custom.logs.ModLogs;
import com.caiocesarmods.caiocesarbiomes.block.custom.plants.ModPlanks;
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

public class ModWood {
    public static List<Block> blocksList = new ArrayList<>();

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, CaioCesarBiomesMod.MOD_ID);

    ///Araucaria
    public static final RegistryObject<Block> ARAUCARIA_LOG = registerBlock("araucaria_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_ARAUCARIA_LOG = registerBlock("stripped_araucaria_log",
            ModLogs::new);
    public static final RegistryObject<Block> ARAUCARIA_WOOD = registerBlock("araucaria_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_ARAUCARIA_WOOD = registerBlock("stripped_araucaria_wood",
            ModLogs::new);
    public static final RegistryObject<Block> ARAUCARIA_PLANKS = registerBlock("araucaria_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> ARAUCARIA_SLAB = registerBlock("araucaria_slab",
            () -> new SlabBlock(AbstractBlock.Properties.create(Material.WOOD).harvestLevel(2).harvestTool(ToolType.AXE)
                    .hardnessAndResistance(3f)));
    public static final RegistryObject<Block> ARAUCARIA_STAIRS = registerBlock("araucaria_stairs",
            () -> new StairsBlock(() -> ARAUCARIA_PLANKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.WOOD)
                    .harvestLevel(1).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> ARAUCARIA_FENCE = registerBlock("araucaria_fence",
            () -> new FenceBlock(AbstractBlock.Properties.create(Material.WOOD).harvestLevel(2).harvestTool(ToolType.AXE)
                    .hardnessAndResistance(3f)));
    public static final RegistryObject<Block> ARAUCARIA_FENCE_GATE = registerBlock("araucaria_fence_gate",
            () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.WOOD).harvestLevel(2).harvestTool(ToolType.AXE)
                    .hardnessAndResistance(3f)));


    /// Coast Cottonwood
    public static final RegistryObject<Block> COAST_COTTONWOOD_LOG = registerBlock("coast_cottonwood_log",
            ModLogs::new);
    public static final RegistryObject<Block> COAST_COTTONWOOD_WOOD = registerBlock("coast_cottonwood_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_COAST_COTTONWOOD_LOG = registerBlock("stripped_coast_cottonwood_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_COAST_COTTONWOOD_WOOD = registerBlock("stripped_coast_cottonwood_wood",
            ModLogs::new);
    public static final RegistryObject<Block> COAST_COTTONWOOD_PLANKS = registerBlock("coast_cottonwood_planks",
            ModPlanks::new);


    /// Fig
    public static final RegistryObject<Block> FIG_LOG = registerBlock("fig_log",
            ModLogs::new);
    public static final RegistryObject<Block> JUNGLE_FIG_LOG = registerBlock("jungle_fig_log",
            ModLogs::new);
    public static final RegistryObject<Block> FIG_PLANKS = registerBlock("fig_planks",
            ModPlanks::new);


    /// Cypress
    public static final RegistryObject<Block> ITALIAN_CYPRESS_LOG = registerBlock("italian_cypress_log",
            ModLogs::new);
    public static final RegistryObject<Block> ITALIAN_CYPRESS_WOOD = registerBlock("italian_cypress_wood",
            ModLogs::new);
    public static final RegistryObject<Block> PATAGONIAN_CYPRESS_LOG = registerBlock("patagonian_cypress_log",
            ModLogs::new);
    public static final RegistryObject<Block> PATAGONIAN_CYPRESS_WOOD = registerBlock("patagonian_cypress_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_CYPRESS_LOG = registerBlock("stripped_cypress_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_CYPRESS_WOOD = registerBlock("stripped_cypress_wood",
            ModLogs::new);
    public static final RegistryObject<Block> CYPRESS_PLANKS = registerBlock("cypress_planks",
            ModPlanks::new);


    /// Palm woods
    public static final RegistryObject<Block> DATE_LOG = registerBlock("date_log",
            ModLogs::new);
    public static final RegistryObject<Block> BISMARCK_PALM_LOG = registerBlock("bismarck_palm_log",
            ModLogs::new);
    public static final RegistryObject<Block> COCONUT_LOG = registerBlock("coconut_log",
            ModLogs::new);
    public static final RegistryObject<Block> OIL_PALM_LOG = registerBlock("oil_palm_log",
            ModLogs::new);
    public static final RegistryObject<Block> SABAL_LOG = registerBlock("sabal_log",
            ModLogs::new);
    public static final RegistryObject<Block> ROYAL_PALM_LOG = registerBlock("royal_palm_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_PALM_LOG = registerBlock("stripped_palm_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_PALM_WOOD = registerBlock("stripped_palm_wood",
            ModLogs::new);
    public static final RegistryObject<Block> PALM_PLANKS = registerBlock("palm_planks",
            ModPlanks::new);


    /// Mesquite
    public static final RegistryObject<Block> MESQUITE_LOG = registerBlock("mesquite_log",
            ModLogs::new);
    public static final RegistryObject<Block> MESQUITE_WOOD = registerBlock("mesquite_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_MESQUITE_LOG = registerBlock("stripped_mesquite_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_MESQUITE_WOOD = registerBlock("stripped_mesquite_wood",
            ModLogs::new);
    public static final RegistryObject<Block> MESQUITE_PLANKS = registerBlock("mesquite_planks",
            ModPlanks::new);


    ///Lythraceae
    public static final RegistryObject<Block> CRAPE_MYRTLE_LOG = registerBlock("crape_myrtle_log",
            ModLogs::new);
    public static final RegistryObject<Block> CRAPE_MYRTLE_WOOD = registerBlock("crape_myrtle_wood",
            ModLogs::new);
    public static final RegistryObject<Block> POMEGRANATE_LOG = registerBlock("pomegranate_log",
            ModLogs::new);
    public static final RegistryObject<Block> POMEGRANATE_WOOD = registerBlock("pomegranate_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_CRAPE_MYRTLE_LOG = registerBlock("stripped_crape_myrtle_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_CRAPE_MYRTLE_WOOD = registerBlock("stripped_crape_myrtle_wood",
            ModLogs::new);
    public static final RegistryObject<Block> CRAPE_MYRTLE_PLANKS = registerBlock("crape_myrtle_planks",
            ModPlanks::new);


    /// Southern Magnolia
    public static final RegistryObject<Block> SOUTHERN_MAGNOLIA_LOG = registerBlock("southern_magnolia_log",
            ModLogs::new);
    public static final RegistryObject<Block> SOUTHERN_MAGNOLIA_PLANKS = registerBlock("southern_magnolia_planks",
            ModPlanks::new);


    /// Holm Oak
    public static final RegistryObject<Block> HOLM_OAK_LOG = registerBlock("holm_oak_log",
            ModLogs::new);
    public static final RegistryObject<Block> HOLM_OAK_PLANKS = registerBlock("holm_oak_planks",
            ModPlanks::new);


    /// Cork Oak
    public static final RegistryObject<Block> CORK_OAK_LOG = registerBlock("cork_oak_log",
            ModLogs::new);
    public static final RegistryObject<Block> CORK_OAK_WOOD = registerBlock("cork_oak_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_CORK_OAK_LOG = registerBlock("stripped_cork_oak_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_CORK_OAK_WOOD = registerBlock("stripped_cork_oak_wood",
            ModLogs::new);
    public static final RegistryObject<Block> CORK_OAK_PLANKS = registerBlock("cork_oak_planks",
            ModPlanks::new);


    /// Olive
    public static final RegistryObject<Block> OLIVE_LOG = registerBlock("olive_log",
            ModLogs::new);
    public static final RegistryObject<Block> OLIVE_PLANKS = registerBlock("olive_planks",
            ModPlanks::new);


    /// Erythrina
    public static final RegistryObject<Block> ERYTHRINA_LOG = registerBlock("erythrina_log",
            ModLogs::new);
    public static final RegistryObject<Block> ERYTHRINA_PLANKS = registerBlock("erythrina_planks",
            ModPlanks::new);



    public static final RegistryObject<Block> ELDERBERRY_PLANKS = registerBlock("elderberry_planks",
            ModPlanks::new);


    /// Strawberry Tree
    public static final RegistryObject<Block> STRAWBERRY_TREE_LOG = registerBlock("strawberry_tree_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRAWBERRY_TREE_PLANKS = registerBlock("strawberry_tree_planks",
            ModPlanks::new);


    /// Maple
    public static final RegistryObject<Block> MAPLE_LOG = registerBlock("maple_log",
            ModLogs::new);
    public static final RegistryObject<Block> MAPLE_WOOD = registerBlock("maple_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            ModLogs::new);
    public static final RegistryObject<Block> MAPLE_PLANKS = registerBlock("maple_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> MAPLE_SLAB = registerBlock("maple_slab",
            () -> new SlabBlock(AbstractBlock.Properties.create(Material.WOOD).harvestLevel(2).harvestTool(ToolType.AXE)
                    .hardnessAndResistance(3f)));
    public static final RegistryObject<Block> MAPLE_STAIRS = registerBlock("maple_stairs",
            () -> new StairsBlock(() -> MAPLE_PLANKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.WOOD)
                    .harvestLevel(1).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> MAPLE_FENCE = registerBlock("maple_fence",
            () -> new FenceBlock(AbstractBlock.Properties.create(Material.WOOD).harvestLevel(2).harvestTool(ToolType.AXE)
                    .hardnessAndResistance(3f)));
    public static final RegistryObject<Block> MAPLE_FENCE_GATE = registerBlock("maple_fence_gate",
            () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.WOOD).harvestLevel(2).harvestTool(ToolType.AXE)
                    .hardnessAndResistance(3f)));


    /// Mulberry
    public static final RegistryObject<Block> MULBERRY_LOG = registerBlock("mulberry_log",
            ModLogs::new);
    public static final RegistryObject<Block> MULBERRY_PLANKS = registerBlock("mulberry_planks",
            ModPlanks::new);


    /// Starfruit
    public static final RegistryObject<Block> STARFRUIT_LOG = registerBlock("starfruit_log",
            ModLogs::new);
    public static final RegistryObject<Block> STARFRUIT_PLANKS = registerBlock("starfruit_planks",
            ModPlanks::new);


    public static final RegistryObject<Block> ROYAL_POINCIANA_PLANKS = registerBlock("royal_poinciana_planks",
            ModPlanks::new);


    public static final RegistryObject<Block> TAMARIND_PLANKS = registerBlock("tamarind_planks",
            ModPlanks::new);


    public static final RegistryObject<Block> PRUNUS_LOG = registerBlock("prunus_log",
            ModLogs::new);
    public static final RegistryObject<Block> PRUNUS_PLANKS = registerBlock("prunus_planks",
            ModPlanks::new);


    ///Tea
    public static final RegistryObject<Block> TEA_LOG = registerBlock("tea_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_TEA_LOG = registerBlock("stripped_tea_log",
            ModLogs::new);
    public static final RegistryObject<Block> TEA_WOOD = registerBlock("tea_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_TEA_WOOD = registerBlock("stripped_tea_wood",
            ModLogs::new);
    public static final RegistryObject<Block> TEA_PLANKS = registerBlock("tea_planks",
            ModPlanks::new);


    /// Casuarina
    public static final RegistryObject<Block> CASUARINA_LOG = registerBlock("casuarina_log",
            ModLogs::new);
    public static final RegistryObject<Block> CASUARINA_WOOD = registerBlock("casuarina_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_CASUARINA_LOG = registerBlock("stripped_casuarina_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_CASUARINA_WOOD = registerBlock("stripped_casuarina_wood",
            ModLogs::new);
    public static final RegistryObject<Block> CASUARINA_PLANKS = registerBlock("casuarina_planks",
            ModPlanks::new);


    /// Nothofagus
    public static final RegistryObject<Block> NOTHOFAGUS_LOG = registerBlock("nothofagus_log",
            ModLogs::new);
    public static final RegistryObject<Block> NOTHOFAGUS_PLANKS = registerBlock("nothofagus_planks",
            ModPlanks::new);


    /// Citrus
    public static final RegistryObject<Block> CITRUS_LOG = registerBlock("citrus_log",
            ModLogs::new);
    public static final RegistryObject<Block> CITRUS_WOOD = registerBlock("citrus_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_CITRUS_LOG = registerBlock("stripped_citrus_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_CITRUS_WOOD = registerBlock("stripped_citrus_wood",
            ModLogs::new);
    public static final RegistryObject<Block> CITRUS_PLANKS = registerBlock("citrus_planks",
            ModPlanks::new);


    /// Cottonwood
    public static final RegistryObject<Block> COTTONWOOD_LOG = registerBlock("cottonwood_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_COTTONWOOD_LOG = registerBlock("stripped_cottonwood_log",
            ModLogs::new);
    public static final RegistryObject<Block> COTTONWOOD_WOOD = registerBlock("cottonwood_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_COTTONWOOD_WOOD = registerBlock("stripped_cottonwood_wood",
            ModLogs::new);
    public static final RegistryObject<Block> COTTONWOOD_PLANKS = registerBlock("cottonwood_planks",
            ModPlanks::new);


    /// Beech
    public static final RegistryObject<Block> BEECH_LOG = registerBlock("beech_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_BEECH_LOG = registerBlock("stripped_beech_log",
            ModLogs::new);
    public static final RegistryObject<Block> BEECH_WOOD = registerBlock("beech_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_BEECH_WOOD = registerBlock("stripped_beech_wood",
            ModLogs::new);
    public static final RegistryObject<Block> BEECH_PLANKS = registerBlock("beech_planks",
            ModPlanks::new);


    /// Hemlock
    public static final RegistryObject<Block> HEMLOCK_LOG = registerBlock("hemlock_log",
            ModLogs::new);
    public static final RegistryObject<Block> HEMLOCK_PLANKS = registerBlock("hemlock_planks",
            ModPlanks::new);


    /// Yew
    public static final RegistryObject<Block> YEW_LOG = registerBlock("yew_log",
            ModLogs::new);
    public static final RegistryObject<Block> YEW_PLANKS = registerBlock("yew_planks",
            ModPlanks::new);


    /// Ilex/Hollies
    public static final RegistryObject<Block> ILEX_LOG = registerBlock("ilex_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_ILEX_LOG = registerBlock("stripped_ilex_log",
            ModLogs::new);
    public static final RegistryObject<Block> ILEX_WOOD = registerBlock("ilex_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_ILEX_WOOD = registerBlock("stripped_ilex_wood",
            ModLogs::new);
    public static final RegistryObject<Block> ILEX_PLANKS = registerBlock("ilex_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> ILEX_SLAB = registerBlock("ilex_slab",
            () -> new SlabBlock(AbstractBlock.Properties.create(Material.WOOD).harvestLevel(2).harvestTool(ToolType.AXE)
                    .hardnessAndResistance(3f)));
    public static final RegistryObject<Block> ILEX_STAIRS = registerBlock("ilex_stairs",
            () -> new StairsBlock(() -> ILEX_PLANKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.WOOD)
                    .harvestLevel(1).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> ILEX_FENCE = registerBlock("ilex_fence",
            () -> new FenceBlock(AbstractBlock.Properties.create(Material.WOOD).harvestLevel(2).harvestTool(ToolType.AXE)
                    .hardnessAndResistance(3f)));
    public static final RegistryObject<Block> ILEX_FENCE_GATE = registerBlock("ilex_fence_gate",
            () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.WOOD).harvestLevel(2).harvestTool(ToolType.AXE)
                    .hardnessAndResistance(3f)));


    /// Sweet Chestnut
    public static final RegistryObject<Block> SWEET_CHESTNUT_LOG = registerBlock("sweet_chestnut_log",
            ModLogs::new);
    public static final RegistryObject<Block> SWEET_CHESTNUT_PLANKS = registerBlock("sweet_chestnut_planks",
            ModPlanks::new);


    /// Carob
    public static final RegistryObject<Block> CAROB_LOG = registerBlock("carob_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_CAROB_LOG = registerBlock("stripped_carob_log",
            ModLogs::new);
    public static final RegistryObject<Block> CAROB_WOOD = registerBlock("carob_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_CAROB_WOOD = registerBlock("stripped_carob_wood",
            ModLogs::new);
    public static final RegistryObject<Block> CAROB_PLANKS = registerBlock("carob_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> CAROB_SLAB = registerBlock("carob_slab",
            () -> new SlabBlock(AbstractBlock.Properties.create(Material.WOOD).harvestLevel(2).harvestTool(ToolType.AXE)
                    .hardnessAndResistance(3f)));
    public static final RegistryObject<Block> CAROB_STAIRS = registerBlock("carob_stairs",
            () -> new StairsBlock(() -> CAROB_PLANKS.get().getDefaultState(), AbstractBlock.Properties.create(Material.WOOD)
                    .harvestLevel(1).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> CAROB_FENCE = registerBlock("carob_fence",
            () -> new FenceBlock(AbstractBlock.Properties.create(Material.WOOD).harvestLevel(2).harvestTool(ToolType.AXE)
                    .hardnessAndResistance(3f)));
    public static final RegistryObject<Block> CAROB_FENCE_GATE = registerBlock("carob_fence_gate",
            () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.WOOD).harvestLevel(2).harvestTool(ToolType.AXE)
                    .hardnessAndResistance(3f)));


    /// Hazelnut
    public static final RegistryObject<Block> HAZELNUT_LOG = registerBlock("hazelnut_log",
            ModLogs::new);
    public static final RegistryObject<Block> HAZELNUT_PLANKS = registerBlock("hazelnut_planks",
            ModPlanks::new);



    public static final RegistryObject<Block> FIR_LOG = registerBlock("fir_log",
            ModLogs::new);




    public static final RegistryObject<Block> GINKGO_LOG = registerBlock("ginkgo_log",
            ModLogs::new);


    /// Sausage Tree
    public static final RegistryObject<Block> SAUSAGE_TREE_LOG = registerBlock("sausage_tree_log",
            ModLogs::new);
    public static final RegistryObject<Block> SAUSAGE_TREE_PLANKS = registerBlock("sausage_tree_planks",
            ModPlanks::new);


    public static final RegistryObject<Block> SOCOTRA_CUCUMBER_LOG = registerBlock("socotra_cucumber_log",
            ModLogs::new);



    public static final RegistryObject<Block> LARCH_LOG = registerBlock("larch_log",
            ModLogs::new);
    public static final RegistryObject<Block> LARCH_PLANKS = registerBlock("larch_planks",
            ModPlanks::new);


    public static final RegistryObject<Block> MANGO_LOG = registerBlock("mango_log",
            ModLogs::new);
    public static final RegistryObject<Block> MANGO_PLANKS = registerBlock("mango_planks",
            ModPlanks::new);


    public static final RegistryObject<Block> PERSIMMON_LOG = registerBlock("persimmon_log",
            ModLogs::new);
    public static final RegistryObject<Block> PERSIMMON_PLANKS = registerBlock("persimmon_planks",
            ModPlanks::new);


    public static final RegistryObject<Block> MARULA_LOG = registerBlock("marula_log",
            ModLogs::new);
    public static final RegistryObject<Block> MARULA_PLANKS = registerBlock("marula_planks",
            ModPlanks::new);


    public static final RegistryObject<Block> JUNIPER_LOG = registerBlock("juniper_log",
            ModLogs::new);
    public static final RegistryObject<Block> JUNIPER_PLANKS = registerBlock("juniper_planks",
            ModPlanks::new);

    ///
    public static final RegistryObject<Block> DOUGLAS_FIR_LOG = registerBlock("douglas_fir_log",
            ModLogs::new);
    public static final RegistryObject<Block> DOUGLAS_FIR_PLANKS = registerBlock("douglas_fir_planks",
            ModPlanks::new);


    public static final RegistryObject<Block> WALNUT_LOG = registerBlock("walnut_log",
            ModLogs::new);
    public static final RegistryObject<Block> WALNUT_PLANKS = registerBlock("walnut_planks",
            ModPlanks::new);


    ///Pecan
    public static final RegistryObject<Block> PECAN_LOG = registerBlock("pecan_log",
            ModLogs::new);
    public static final RegistryObject<Block> PECAN_PLANKS = registerBlock("pecan_planks",
            ModPlanks::new);


    public static final RegistryObject<Block> DRAGON_BLOOD_LOG = registerBlock("dragon_blood_log",
            ModLogs::new);


    /// Live Oak
    public static final RegistryObject<Block> LIVE_OAK_LOG = registerBlock("live_oak_log",
            ModLogs::new);
    public static final RegistryObject<Block> LIVE_OAK_WOOD = registerBlock("live_oak_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_LIVE_OAK_LOG = registerBlock("stripped_live_oak_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_LIVE_OAK_WOOD = registerBlock("stripped_live_oak_wood",
            ModLogs::new);
    public static final RegistryObject<Block> LIVE_OAK_PLANKS = registerBlock("lie_oak_planks",
            ModPlanks::new);

    public static final RegistryObject<Block> COAST_LIVE_OAK_LOG = registerBlock("coast_live_oak_log",
            ModLogs::new);
    public static final RegistryObject<Block> COAST_LIVE_OAK_WOOD = registerBlock("coast_live_oak_wood",
            ModLogs::new);

    ///Bald Cypress
    public static final RegistryObject<Block> BALD_CYPRESS_LOG = registerBlock("bald_cypress_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_BALD_CYPRESS_LOG = registerBlock("stripped_bald_cypress_log",
            ModLogs::new);
    public static final RegistryObject<Block> BALD_CYPRESS_WOOD = registerBlock("bald_cypress_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_BALD_CYPRESS_WOOD = registerBlock("stripped_bald_cypress_wood",
            ModLogs::new);
    public static final RegistryObject<Block> BALD_CYPRESS_PLANKS = registerBlock("bald_cypress_planks",
            ModPlanks::new);


    /// Plane
    public static final RegistryObject<Block> PLANE_LOG = registerBlock("plane_log",
            ModLogs::new);
    public static final RegistryObject<Block> PLANE_PLANKS = registerBlock("plane_planks",
            ModPlanks::new);


    /// Pistachio
    public static final RegistryObject<Block> PISTACHIO_LOG = registerBlock("pistachio_log",
            ModLogs::new);
    public static final RegistryObject<Block> PISTACHIO_PLANKS = registerBlock("pistachio_planks",
            ModPlanks::new);


    public static final RegistryObject<Block> ORCHID_TREE_LOG = registerBlock("orchid_tree_log",
            ModLogs::new);


    /// Pink Ivory
    public static final RegistryObject<Block> PINK_IVORY_LOG = registerBlock("pink_ivory_log",
            ModLogs::new);
    public static final RegistryObject<Block> PINK_IVORY_PLANKS = registerBlock("pink_ivory_planks",
            ModPlanks::new);


    public static final RegistryObject<Block> ACEROLA_LOG = registerBlock("acerola_log",
            ModLogs::new);
    public static final RegistryObject<Block> ACEROLA_PLANKS = registerBlock("acerola_planks",
            ModPlanks::new);


    public static final RegistryObject<Block> LYCHEE_LOG = registerBlock("lychee_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_LYCHEE_LOG = registerBlock("stripped_lychee_log",
            ModLogs::new);
    public static final RegistryObject<Block> LYCHEE_WOOD = registerBlock("lychee_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_LYCHEE_WOOD = registerBlock("stripped_lychee_wood",
            ModLogs::new);
    public static final RegistryObject<Block> LYCHEE_PLANKS = registerBlock("lychee_planks",
            ModPlanks::new);


    public static final RegistryObject<Block> PRIVET_LOG = registerBlock("privet_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_PRIVET_LOG = registerBlock("stripped_privet_log",
            ModLogs::new);
    public static final RegistryObject<Block> PRIVET_WOOD = registerBlock("privet_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_PRIVET_WOOD = registerBlock("stripped_privet_wood",
            ModLogs::new);
    public static final RegistryObject<Block> PRIVET_PLANKS = registerBlock("privet_planks",
            ModPlanks::new);


    public static final RegistryObject<Block> CAMPHOR_PLANKS = registerBlock("camphor_planks",
            ModPlanks::new);


    public static final RegistryObject<Block> CHUSQUEA_BAMBOO_BLOCK = registerBlock("chusquea_bamboo_block",
            ModLogs::new);


    public static final RegistryObject<Block> JACARANDA_LOG = registerBlock("jacaranda_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_JACARANDA_LOG = registerBlock("stripped_jacaranda_log",
            ModLogs::new);


    public static final RegistryObject<Block> RING_CUPPED_OAK_LOG = registerBlock("ring_cupped_oak_log",
            ModLogs::new);
    public static final RegistryObject<Block> RING_CUPPED_OAK_WOOD = registerBlock("ring_cupped_oak_wood",
            ModLogs::new);


    public static final RegistryObject<Block> TROPICAL_ALMOND_LOG = registerBlock("tropical_almond_log",
            ModLogs::new);

    /// Stone Oak
    public static final RegistryObject<Block> STONE_OAK_LOG = registerBlock("stone_oak_log",
            ModLogs::new);
    public static final RegistryObject<Block> STONE_OAK_WOOD = registerBlock("stone_oak_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_STONE_OAK_LOG = registerBlock("stripped_stone_oak_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_STONE_OAK_WOOD = registerBlock("stripped_stone_oak_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STONE_OAK_PLANKS = registerBlock("stone_oak_planks",
            ModPlanks::new);

    /// Castanopsis
    public static final RegistryObject<Block> CASTANOPSIS_LOG = registerBlock("castanopsis_log",
            ModLogs::new);
    public static final RegistryObject<Block> CASTANOPSIS_WOOD = registerBlock("castanopsis_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_CASTANOPSIS_LOG = registerBlock("stripped_castanopsis_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_CASTANOPSIS_WOOD = registerBlock("stripped_castanopsis_wood",
            ModLogs::new);
    public static final RegistryObject<Block> CASTANOPSIS_PLANKS = registerBlock("castanopsis_planks",
            ModPlanks::new);

    ///Baobab
    public static final RegistryObject<Block> BAOBAB_LOG = registerBlock("baobab_log",
            ModLogs::new);
    public static final RegistryObject<Block> BAOBAB_WOOD = registerBlock("baobab_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_BAOBAB_LOG = registerBlock("stripped_baobab_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_BAOBAB_WOOD = registerBlock("stripped_baobab_wood",
            ModLogs::new);
    public static final RegistryObject<Block> BAOBAB_PLANKS = registerBlock("baobab_planks",
            ModPlanks::new);

    ///Champak
    public static final RegistryObject<Block> CHAMPAK_LOG = registerBlock("champak_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_CHAMPAK_LOG = registerBlock("stripped_champak_log",
            ModLogs::new);
    public static final RegistryObject<Block> CHAMPAK_WOOD = registerBlock("champak_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_CHAMPAK_WOOD = registerBlock("stripped_champak_wood",
            ModLogs::new);
    public static final RegistryObject<Block> CHAMPAK_PLANKS = registerBlock("champak_planks",
            ModPlanks::new);

    ///Agathis
    public static final RegistryObject<Block> AGATHIS_LOG = registerBlock("agathis_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_AGATHIS_LOG = registerBlock("stripped_agathis_log",
            ModLogs::new);
    public static final RegistryObject<Block> AGATHIS_WOOD = registerBlock("agathis_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_AGATHIS_WOOD = registerBlock("stripped_agathis_wood",
            ModLogs::new);
    public static final RegistryObject<Block> AGATHIS_PLANKS = registerBlock("agathis_planks",
            ModPlanks::new);


    public static final RegistryObject<Block> BAMBOOLEAF_OAK_LOG = registerBlock("bambooleaf_oak_log",
            ModLogs::new);
    public static final RegistryObject<Block> BAMBOOLEAF_OAK_WOOD = registerBlock("bambooleaf_oak_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_BAMBOOLEAF_OAK_LOG = registerBlock("stripped_bambooleaf_oak_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_BAMBOOLEAF_OAK_WOOD = registerBlock("stripped_bambooleaf_oak_wood",
            ModLogs::new);
    public static final RegistryObject<Block> BAMBOOLEAF_OAK_PLANKS = registerBlock("bambooleaf_oak_planks",
            ModPlanks::new);

    public static final RegistryObject<Block> LAUREL_OAK_LOG = registerBlock("laurel_oak_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_LAUREL_OAK_LOG = registerBlock("stripped_laurel_oak_log",
            ModLogs::new);
    public static final RegistryObject<Block> LAUREL_OAK_WOOD = registerBlock("laurel_oak_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_LAUREL_OAK_WOOD = registerBlock("stripped_laurel_oak_wood",
            ModLogs::new);
    public static final RegistryObject<Block> SAND_LAUREL_OAK_LOG = registerBlock("sand_laurel_oak_log",
            ModLogs::new);
    public static final RegistryObject<Block> SAND_LAUREL_OAK_WOOD = registerBlock("sand_laurel_oak_wood",
            ModLogs::new);
    public static final RegistryObject<Block> LAUREL_OAK_PLANKS = registerBlock("laurel_oak_planks",
            ModPlanks::new);


    /// Podocarpus
    public static final RegistryObject<Block> PODOCARPUS_LOG = registerBlock("podocarpus_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_PODOCARPUS_LOG = registerBlock("stripped_podocarpus_log",
            ModLogs::new);
    public static final RegistryObject<Block> PODOCARPUS_WOOD = registerBlock("podocarpus_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_PODOCARPUS_WOOD = registerBlock("stripped_podocarpus_wood",
            ModLogs::new);
    public static final RegistryObject<Block> PODOCARPUS_PLANKS = registerBlock("podocarpus_planks",
            ModPlanks::new);


    ///Liquidambar
    public static final RegistryObject<Block> LIQUIDAMBAR_LOG = registerBlock("liquidambar_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_LIQUIDAMBAR_LOG = registerBlock("stripped_liquidambar_log",
            ModLogs::new);
    public static final RegistryObject<Block> LIQUIDAMBAR_WOOD = registerBlock("liquidambar_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_LIQUIDAMBAR_WOOD = registerBlock("stripped_liquidambar_wood",
            ModLogs::new);
    public static final RegistryObject<Block> LIQUIDAMBAR_PLANKS = registerBlock("liquidambar_planks",
            ModPlanks::new);


    ///Laurel
    public static final RegistryObject<Block> LAUREL_LOG = registerBlock("laurel_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_LAUREL_LOG = registerBlock("stripped_laurel_log",
            ModLogs::new);
    public static final RegistryObject<Block> LAUREL_WOOD = registerBlock("laurel_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_LAUREL_WOOD = registerBlock("stripped_laurel_wood",
            ModLogs::new);
    //Cinnamon
    public static final RegistryObject<Block> CINNAMON_LOG = registerBlock("cinnamon_log",
            ModLogs::new);
    public static final RegistryObject<Block> CINNAMON_WOOD = registerBlock("cinnamon_wood",
            ModLogs::new);
    public static final RegistryObject<Block> LAUREL_PLANKS = registerBlock("laurel_planks",
            ModPlanks::new);
    //Camphor (different log and wood)
    public static final RegistryObject<Block> CAMPHOR_LOG = registerBlock("camphor_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_CAMPHOR_LOG = registerBlock("stripped_camphor_log",
            ModLogs::new);
    public static final RegistryObject<Block> CAMPHOR_WOOD = registerBlock("camphor_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_CAMPHOR_WOOD = registerBlock("stripped_camphor_wood",
            ModLogs::new);





    ///Willow
    public static final RegistryObject<Block> WEEPING_WILLOW_LOG = registerBlock("weeping_willow_log",
            ModLogs::new);
    public static final RegistryObject<Block> WEEPING_WILLOW_WOOD = registerBlock("weeping_willow_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood",
            ModLogs::new);
    public static final RegistryObject<Block> WILLOW_PLANKS = registerBlock("willow_planks",
            ModPlanks::new);


    /// Acacia
    public static final RegistryObject<Block> BLACKWOOD_ACACIA_LOG = registerBlock("blackwood_acacia_log",
            ModLogs::new);
    public static final RegistryObject<Block> BLACKWOOD_ACACIA_WOOD = registerBlock("blackwood_acacia_wood",
            ModLogs::new);


    /// Myrtaceae
    public static final RegistryObject<Block> MYRTACEAE_LOG = registerBlock("myrtaceae_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_MYRTACEAE_LOG = registerBlock("stripped_myrtaceae_log",
            ModLogs::new);
    public static final RegistryObject<Block> MYRTACEAE_WOOD = registerBlock("myrtaceae_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_MYRTACEAE_WOOD = registerBlock("stripped_myrtaceae_wood",
            ModLogs::new);
    public static final RegistryObject<Block> PAPERBARK_LOG = registerBlock("paperbark_log",
            ModLogs::new); //Callistemon and melaleuca
    public static final RegistryObject<Block> PAPERBARK_WOOD = registerBlock("paperbark_wood",
            ModLogs::new);
    public static final RegistryObject<Block> EUCALYPTUS_LOG = registerBlock("eucalyptus_log",
            EucalyptusLog::new);
    public static final RegistryObject<Block> EUCALYPTUS_WOOD = registerBlock("eucalyptus_wood",
            EucalyptusLog::new);
    public static final RegistryObject<Block> RAINBOW_EUCALYPTUS_LOG = registerBlock("rainbow_eucalyptus_log",
            EucalyptusLog::new);
    public static final RegistryObject<Block> RAINBOW_EUCALYPTUS_WOOD = registerBlock("rainbow_eucalyptus_wood",
            EucalyptusLog::new);
    public static final RegistryObject<Block> MYRTACEAE_PLANKS = registerBlock("myrtaceae_planks",
            ModPlanks::new);


    /// Milkwood (Apocynaceae, like oleander, plumaeria, yellow oleander = all use plumeria log texture, while desert rose has its own bark texture, but same log)
    public static final RegistryObject<Block> MILKWOOD_LOG = registerBlock("milkwood_log",
            ModLogs::new);
    public static final RegistryObject<Block> SOCOTRA_DESERT_ROSE_LOG = registerBlock("socotra_desert_rose_log",
            ModLogs::new);
    public static final RegistryObject<Block> MILKWOOD_WOOD = registerBlock("milkwood_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_MILKWOOD_LOG = registerBlock("stripped_milkwood_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_MILKWOOD_WOOD = registerBlock("stripped_milkwood_wood",
            ModLogs::new);
    public static final RegistryObject<Block> MILKWOOD_PLANKS = registerBlock("milkwood_planks",
            ModPlanks::new);


    /// Bayberry (Myrica)
    public static final RegistryObject<Block> BAYBERRY_LOG = registerBlock("bayberry_log",
            ModLogs::new);
    public static final RegistryObject<Block> BAYBERRY_WOOD = registerBlock("bayberry_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_BAYBERRY_LOG = registerBlock("stripped_bayberry_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_BAYBERRY_WOOD = registerBlock("stripped_bayberry_wood",
            ModLogs::new);
    public static final RegistryObject<Block> BAYBERRY_PLANKS = registerBlock("bayberry_planks",
            ModPlanks::new);


    /// Sorbus
    public static final RegistryObject<Block> SORBUS_LOG = registerBlock("sorbus_log",
            ModLogs::new);
    public static final RegistryObject<Block> SORBUS_WOOD = registerBlock("sorbus_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_SORBUS_LOG = registerBlock("stripped_sorbus_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_SORBUS_WOOD = registerBlock("stripped_sorbus_wood",
            ModLogs::new);
    public static final RegistryObject<Block> SORBUS_PLANKS = registerBlock("bayberry_planks",
            ModPlanks::new);


    /// Pine (Pinus)
    public static final RegistryObject<Block> CANARY_PINE_LOG = registerBlock("canary_pine_log",
            ModLogs::new);
    public static final RegistryObject<Block> CANARY_PINE_WOOD = registerBlock("canary_pine_wood",
            ModLogs::new);
    public static final RegistryObject<Block> CHINESE_RED_PINE_LOG = registerBlock("chinese_red_pine_log",
            ModLogs::new);
    public static final RegistryObject<Block> CHINESE_RED_PINE_WOOD = registerBlock("chinese_red_pine_wood",
            ModLogs::new);
    public static final RegistryObject<Block> PINYON_LOG = registerBlock("pinyon_log",
            ModLogs::new);
    public static final RegistryObject<Block> PINYON_WOOD = registerBlock("pinyon_wood",
            ModLogs::new);
    public static final RegistryObject<Block> JAPANESE_PINE_LOG = registerBlock("japanese_pine_log",
            ModLogs::new);
    public static final RegistryObject<Block> JAPANESE_PINE_WOOD = registerBlock("japanese_pine_wood",
            ModLogs::new);
    public static final RegistryObject<Block> MEDITERRANEAN_PINE_LOG = registerBlock("mediterranean_pine_log",
            ModLogs::new);
    public static final RegistryObject<Block> MEDITERRANEAN_PINE_WOOD = registerBlock("mediterranean_pine_wood",
            ModLogs::new);
    public static final RegistryObject<Block> YELLOW_PINE_LOG = registerBlock("yellow_pine_log",
            ModLogs::new);
    public static final RegistryObject<Block> YELLOW_PINE_WOOD = registerBlock("yellow_pine_wood",
            ModLogs::new);
    public static final RegistryObject<Block> MUGO_PINE_LOG = registerBlock("mugo_pine_log",
            ModLogs::new);
    public static final RegistryObject<Block> MUGO_PINE_WOOD = registerBlock("mugo_pine_wood",
            ModLogs::new);
    public static final RegistryObject<Block> PONDEROSA_PINE_LOG = registerBlock("ponderosa_pine_log",
            ModLogs::new);
    public static final RegistryObject<Block> PONDEROSA_PINE_WOOD = registerBlock("ponderosa_pine_wood",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_PINE_LOG = registerBlock("stripped_pine_log",
            ModLogs::new);
    public static final RegistryObject<Block> STRIPPED_PINE_WOOD = registerBlock("stripped_pine_wood",
            ModLogs::new);
    public static final RegistryObject<Block> PINE_PLANKS = registerBlock("pine_planks",
            ModPlanks::new);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.WOOD)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

