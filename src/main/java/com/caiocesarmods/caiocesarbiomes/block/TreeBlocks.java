package com.caiocesarmods.caiocesarbiomes.block;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.block.custom.ModLeaves;
import com.caiocesarmods.caiocesarbiomes.block.custom.ModLogs;
import com.caiocesarmods.caiocesarbiomes.block.custom.Saplings.*;
import com.caiocesarmods.caiocesarbiomes.block.custom.leaves.AvocadoLeaves;
import com.caiocesarmods.caiocesarbiomes.block.custom.leaves.CarobLeaves;
import com.caiocesarmods.caiocesarbiomes.item.ModItemGroup;
import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
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

    ///B

    //Black Poplar
    public static final RegistryObject<Block> BLACK_POPLAR_LOG = registerBlock("black_poplar_log",
            ModLogs::new);

    //Beech
    public static final RegistryObject<Block> BEECH_LOG = registerBlock("beech_log",
            ModLogs::new);
    public static final RegistryObject<Block> COOPER_BEECH_LEAVES = registerBlock("cooper_beech_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> COOPER_BEECH_SAPLING = registerBlock("cooper_beech_sapling",
            CooperBeechSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_COOPER_BEECH_SAPLING = BLOCKS.register("potted_cooper_beech_sapling",
            () -> new FlowerPotBlock(ModBlocks.COOPER_BEECH_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    //Bismarck Palm
    public static final RegistryObject<Block> BISMARCK_PALM_LOG = registerBlock("bismarck_palm_log",
            ModLogs::new);
    public static final RegistryObject<Block> BISMARCK_PALM_LEAVES = registerBlock("bismarck_palm_leaves",
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

    //Carob
    public static final RegistryObject<Block> CAROB_LOG = registerBlock("carob_log",
            ModLogs::new);
    public static final RegistryObject<Block> CAROB_LEAVES = registerBlock("carob_leaves",
            CarobLeaves::new);

    //Canary Date
    public static final RegistryObject<Block> CANARY_DATE_LOG = registerBlock("canary_date_log",
            ModLogs::new);

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
            () -> new FlowerPotBlock(ModBlocks.CASUARINA_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    //Citrus
    public static final RegistryObject<Block> CITRUS_LOG = registerBlock("citrus_log",
            ModLogs::new);
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

    //Chinese Pine
    public static final RegistryObject<Block> CHINESE_RED_PINE_LOG = registerBlock("chinese_red_pine_log",
            ModLogs::new);

    //Crabapple
    public static final RegistryObject<Block> CRABAPPLE_LOG = registerBlock("crabapple_log",
            ModLogs::new);
    public static final RegistryObject<Block> PINK_CRABAPPLE_LEAVES = registerBlock("crabapple_pink_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> PINK_CRABAPPLE_SAPLING = registerBlock("crabapple_pink_sapling",
            PinkCrabappleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PINK_CRABAPPLE_SAPLING = BLOCKS.register("potted_crabapple_pink_sapling",
            () -> new FlowerPotBlock(ModBlocks.PINK_CRABAPPLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));
    public static final RegistryObject<Block> WHITE_CRABAPPLE_LEAVES = registerBlock("crabapple_white_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> WHITE_CRABAPPLE_SAPLING = registerBlock("crabapple_white_sapling",
            WhiteCrabappleSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_WHITE_CRABAPPLE_SAPLING = BLOCKS.register("potted_crabapple_white_sapling",
            () -> new FlowerPotBlock(ModBlocks.WHITE_CRABAPPLE_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
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

    //Coconut
    public static final RegistryObject<Block> COCONUT_LOG = registerBlock("coconut_log",
            ModLogs::new);

    ///D

    //Date
    public static final RegistryObject<Block> DATE_LOG = registerBlock("date_log",
            ModLogs::new);

    //Dragon Blood
    public static final RegistryObject<Block> DRAGON_BLOOD_LOG = registerBlock("dragon_blood_log",
            ModLogs::new);
    public static final RegistryObject<Block> DRAGON_BLOOD_LEAVES = registerBlock("dragon_blood_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> DRAGON_BLOOD_SAPLING = registerBlock("dragon_blood_sapling",
            DragonBloodSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_DRAGON_BLOOD_SAPLING = BLOCKS.register("potted_dragon_blood_sapling",
            () -> new FlowerPotBlock(ModBlocks.DRAGON_BLOOD_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    //Douglas Fir
    public static final RegistryObject<Block> DOUGLAS_FIR_LOG = registerBlock("douglas_fir_log",
            ModLogs::new);
    public static final RegistryObject<Block> DOUGLAS_FIR_LEAVES = registerBlock("douglas_fir_leaves",
            ModLeaves::new);

    ///E

    //Elderberry
    public static final RegistryObject<Block> ELDERBERRY_LOG = registerBlock("elderberry_log",
            ModLogs::new);

    //Eucalyptus
    public static final RegistryObject<Block> EUCALYPTUS_LOG = registerBlock("eucalyptus_log",
            ModLogs::new);
    public static final RegistryObject<Block> EUCALYPTUS_LEAVES = registerBlock("eucalyptus_leaves",
            ModLeaves::new);
    public static final RegistryObject<Block> EUCALYPTUS_SAPLING = registerBlock("eucalyptus_sapling",
            EucalyptusSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_EUCALYPTUS_SAPLING = BLOCKS.register("potted_eucalyptus_sapling",
            () -> new FlowerPotBlock(ModBlocks.EUCALYPTUS_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    //Erythrina
    public static final RegistryObject<Block> ERYTHRINA_LOG = registerBlock("erythrina_log",
            ModLogs::new);

    ///F

    //Fig
    public static final RegistryObject<Block> FIG_LOG = registerBlock("fig_log",
            ModLogs::new);

    ///G

    ///H

    ///I

    //Italian Cypress
    public static final RegistryObject<Block> ITALIAN_CYPRESS_LOG = registerBlock("italian_cypress_log",
            ModLogs::new);

    //Ilex (Holly)
    public static final RegistryObject<Block> ILEX_LOG = registerBlock("ilex_log",
            ModLogs::new);

    ///J

    //Japanese Pine
    public static final RegistryObject<Block> JAPANESE_PINE_LOG = registerBlock("japanese_pine_log",
            ModLogs::new);

    //Japanese Maple
    public static final RegistryObject<Block> JAPANESE_MAPLE_LOG = registerBlock("japanese_maple_log",
            ModLogs::new);

    //Jungle Figs
    public static final RegistryObject<Block> JUNGLE_FIG_LOG = registerBlock("jungle_fig_log",
            ModLogs::new);

    //Juniper
    public static final RegistryObject<Block> JUNIPER_LOG = registerBlock("juniper_log",
            ModLogs::new);

    ///K

    ///L

    //Live Oak
    public static final RegistryObject<Block> LIVE_OAK_LOG = registerBlock("live_oak_log",
            ModLogs::new);

    //Larch
    public static final RegistryObject<Block> LARCH_LOG = registerBlock("larch_log",
            ModLogs::new);

    //Loquat
    public static final RegistryObject<Block> LOQUAT_LOG = registerBlock("loquat_log",
            ModLogs::new);

    ///M

    //Mesquite
    public static final RegistryObject<Block> MESQUITE_LOG = registerBlock("mesquite_log",
            ModLogs::new);

    //Myrtle
    public static final RegistryObject<Block> MYRTLE_LOG = registerBlock("myrtle_log",
            ModLogs::new);

    ///N

    ///O

    //Oleander
    public static final RegistryObject<Block> OLEANDER_LOG = registerBlock("oleander_log",
            ModLogs::new);

    //Ocotea
    public static final RegistryObject<Block> OCOTEA_FOREST_LOG = registerBlock("ocotea_forest_log",
            ModLogs::new);
    public static final RegistryObject<Block> OCOTEA_JUNGLE_LOG = registerBlock("ocotea_jungle_log",
            ModLogs::new);

    ///P

    //Pecan
    public static final RegistryObject<Block> PECAN_LOG = registerBlock("pecan_log",
            ModLogs::new);

    //Pinyon
    public static final RegistryObject<Block> PINYON_LOG = registerBlock("pinyon_log",
            ModLogs::new);

    //Pink Ivory
    public static final RegistryObject<Block> PINK_IVORY_LOG = registerBlock("pink_ivory_log",
            ModLogs::new);

    //Pistachio
    public static final RegistryObject<Block> PISTACHIO_LOG = registerBlock("pistachio_log",
            ModLogs::new);

    //Plane
    public static final RegistryObject<Block> PLANE_LOG = registerBlock("plane_log",
            ModLogs::new);

    //Ponderosa Pine
    public static final RegistryObject<Block> PONDEROSA_PINE_LOG = registerBlock("ponderosa_pine_log",
            ModLogs::new);

    //Pohutukawa
    public static final RegistryObject<Block> POHUTUKAWA_LOG = registerBlock("pohutukawa_log",
            ModLogs::new);

    //Plum
    public static final RegistryObject<Block> PLUM_LOG = registerBlock("plum_log",
            ModLogs::new);

    ///Q

    ///R

    ///S

    ///T

    ///U

    ///V

    ///W

    ///X

    ///Y

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
