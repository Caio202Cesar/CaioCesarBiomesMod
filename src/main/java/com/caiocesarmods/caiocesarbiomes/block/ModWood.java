package com.caiocesarmods.caiocesarbiomes.block;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.block.custom.logs.ModLogs;
import com.caiocesarmods.caiocesarbiomes.block.custom.plants.ModPlanks;
import com.caiocesarmods.caiocesarbiomes.item.ModItemGroup;
import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
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
    public static final RegistryObject<Block> SWEET_CHESTNUT_PLANKS = registerBlock("sweet_chestnut_planks",
            ModLogs::new);
    public static final RegistryObject<Block> CAROB_PLANKS = registerBlock("carob_planks",
            ModLogs::new);
    public static final RegistryObject<Block> HAWTHORN_PLANKS = registerBlock("hawthorn_planks",
            ModLogs::new);
    public static final RegistryObject<Block> HAZELNUT_PLANKS = registerBlock("hazelnut_planks",
            ModLogs::new);
    public static final RegistryObject<Block> ROWAN_PLANKS = registerBlock("rowan_planks",
            ModLogs::new);
    public static final RegistryObject<Block> SAUSAGE_TREE_PLANKS = registerBlock("sausage_tree_planks",
            ModLogs::new);
    public static final RegistryObject<Block> SABAL_PLANKS = registerBlock("sabal_planks",
            ModLogs::new);
    public static final RegistryObject<Block> LARCH_PLANKS = registerBlock("larch_planks",
            ModLogs::new);
    public static final RegistryObject<Block> COCONUT_PLANKS = registerBlock("coconut_planks",
            ModLogs::new);
    public static final RegistryObject<Block> MANGO_PLANKS = registerBlock("mango_planks",
            ModLogs::new);
    public static final RegistryObject<Block> PERSIMMON_PLANKS = registerBlock("persimmon_planks",
            ModLogs::new);
    public static final RegistryObject<Block> MARULA_PLANKS = registerBlock("marula_planks",
            ModLogs::new);
    public static final RegistryObject<Block> JUNIPER_PLANKS = registerBlock("juniper_planks",
            ModLogs::new);
    public static final RegistryObject<Block> DOUGLAS_FIR_PLANKS = registerBlock("douglas_fir_planks",
            ModLogs::new);
    public static final RegistryObject<Block> WALNUT_PLANKS = registerBlock("walnut_planks",
            ModLogs::new);
    public static final RegistryObject<Block> PECAN_PLANKS = registerBlock("pecan_planks",
            ModLogs::new);
    public static final RegistryObject<Block> BALD_CYPRESS_PLANKS = registerBlock("bald_cypress_planks",
            ModLogs::new);
    public static final RegistryObject<Block> PLANE_PLANKS = registerBlock("plane_planks",
            ModLogs::new);
    public static final RegistryObject<Block> PISTACHIO_PLANKS = registerBlock("pistachio_planks",
            ModLogs::new);

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

