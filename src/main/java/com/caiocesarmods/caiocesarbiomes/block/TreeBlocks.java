package com.caiocesarmods.caiocesarbiomes.block;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.block.custom.ModLeaves;
import com.caiocesarmods.caiocesarbiomes.block.custom.ModLogs;
import com.caiocesarmods.caiocesarbiomes.block.custom.Saplings.*;
import com.caiocesarmods.caiocesarbiomes.block.custom.leaves.AvocadoLeaves;
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

    //Blue Spruce
    public static final RegistryObject<Block> BLUE_SPRUCE_LEAVES = registerBlock("blue_spruce_leaves",
            ModLeaves::new);

    //Buddha Hand
    public static final RegistryObject<Block> BUDDHA_HAND_SAPLING = registerBlock("buddha_hand_sapling",
            BuddhaHandSapling::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_BUDDHA_HAND_SAPLING = BLOCKS.register("potted_buddha_hand_sapling",
            () -> new FlowerPotBlock(ModBlocks.BUDDHA_HAND_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));    //Canary Pine
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
