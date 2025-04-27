package com.caiocesarmods.caiocesarbiomes.item;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import com.caiocesarmods.caiocesarbiomes.item.custom.CoconutWaterItem;
import com.caiocesarmods.caiocesarbiomes.item.custom.BeverageItem;
import com.caiocesarmods.caiocesarbiomes.item.custom.PoisonSwordItem;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CaioCesarBiomesMod.MOD_ID);

    public static final RegistryObject<Item> AVOCADO = ITEMS.register("avocado",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.AVOCADO)));
    public static final RegistryObject<Item> FIGFRUIT = ITEMS.register("figfruit",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.FIGFRUIT)));
    public static final RegistryObject<Item> WHITE_FIG = ITEMS.register("white_fig",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.FIGFRUIT)));
    public static final RegistryObject<Item> SYCAMORE_FIG = ITEMS.register("sycamore_fig",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.FIGFRUIT)));
    public static final RegistryObject<Item> POMEGRANATE = ITEMS.register("pomegranate",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.POMEGRANATE)));
    public static final RegistryObject<Item> OLIVES = ITEMS.register("olives",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.OLIVES)));
    public static final RegistryObject<Item> ARBUTUS = ITEMS.register("arbutus",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.ARBUTUS)));
    public static final RegistryObject<Item> MULBERRIES = ITEMS.register("mulberries",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.MULBERRIES)));
    public static final RegistryObject<Item> LOQUAT = ITEMS.register("loquat",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.LOQUAT)));
    public static final RegistryObject<Item> MANDARIN = ITEMS.register("mandarin",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.MANDARIN)));
    public static final RegistryObject<Item> ORANGE = ITEMS.register("orange",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.ORANGE)));
    public static final RegistryObject<Item> LEMON = ITEMS.register("lemon",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.LEMON)));
    public static final RegistryObject<Item> STARFRUIT = ITEMS.register("starfruit",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.STARFRUIT)));
    public static final RegistryObject<Item> STARFRUIT_SLICE = ITEMS.register("starfruit_slice",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.STARFRUIT_SLICE)));
    public static final RegistryObject<Item> ELDERBERRIES = ITEMS.register("elderberries",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.ELDERBERRIES)));
    public static final RegistryObject<Item> TAMARINDS = ITEMS.register("tamarinds",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.TAMARINDS)));
    public static final RegistryObject<Item> CHERRY_PLUM = ITEMS.register("cherry_plum",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.CHERRY_PLUM)));
    public static final RegistryObject<Item> CITRON = ITEMS.register("citron",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.CITRON)));
    public static final RegistryObject<Item> BUDDHA_HAND_CITRON = ITEMS.register("buddha_hand_citron",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.BUDDHA_HAND_CITRON)));
    public static final RegistryObject<Item> TAHITI_LIME = ITEMS.register("tahiti_lime",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.TAHITI_LIME)));
    public static final RegistryObject<Item> GRAPEFRUIT = ITEMS.register("grapefruit",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.GRAPEFRUIT)));
    public static final RegistryObject<Item> YEW_BERRIES = ITEMS.register("yew_berries",
            () -> new Item(new Item.Properties().group(ItemGroup.MISC).food(ModFoods.YEW_BERRIES)));
    public static final RegistryObject<Item> YEW_ARILS = ITEMS.register("yew_arils",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.YEW_ARILS)));
    public static final RegistryObject<Item> DATES = ITEMS.register("dates",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.DATES)));
    public static final RegistryObject<Item> COCONUT = ITEMS.register("coconut",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.COCONUT)));
    public static final RegistryObject<Item> GREEN_COCONUT = ITEMS.register("green_coconut",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> COCONUT_WATER = ITEMS.register("coconut_water",
            () -> new CoconutWaterItem(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.COCONUT_WATER)));
    public static final RegistryObject<Item> PISTACHIO = ITEMS.register("pistachio",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> PECAN_NUT = ITEMS.register("pecan_nut",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> SWEET_CHESTNUT = ITEMS.register("sweet_chestnut",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> MANGO = ITEMS.register("mango",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> UNRIPE_MANGO = ITEMS.register("unripe_mango",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> BLUEBERRIES = ITEMS.register("blueberries",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> WALNUT = ITEMS.register("walnut",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> BREADFRUIT = ITEMS.register("breadfruit",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> MARULA = ITEMS.register("marula",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> ROWAN_BERRIES = ITEMS.register("rowan_berries",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> HAWTHORN_BERRIES = ITEMS.register("hawthorn_berries",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> DURIAN = ITEMS.register("durian",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> KIWI_FRUITS = ITEMS.register("kiwi_fruits",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> OLIVE_OIL = ITEMS.register("olive_oil",
            () -> new Item(new Item.Properties().group(ItemGroup.MISC)));

    public static final RegistryObject<Item> CAROB_BEANS = ITEMS.register("carob_beans",
            () -> new Item(new Item.Properties().group(ItemGroup.MISC)));

    public static final RegistryObject<Item> JUNIPER_BERRIES = ITEMS.register("juniper_berries",
            () -> new Item(new Item.Properties().group(ItemGroup.MISC)));

    public static final RegistryObject<Item> TEA_LEAF = ITEMS.register("tea_leaf",
            () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> TEA_LEAF_FOR_INFUSION = ITEMS.register("tea_leaf_for_infusion",
            () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> GREEN_TEA = ITEMS.register("green_tea",
            () -> new BeverageItem(new Item.Properties().maxStackSize(1).group(ItemGroup.MISC)
                    .food(ModFoods.GREEN_TEA)));
    public static final RegistryObject<Item> MATCHA_POWDER = ITEMS.register("matcha_powder",
            () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> MATCHA_POWDER_FOR_INFUSION = ITEMS.register("matcha_powder_for_infusion",
            () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> MATCHA_TEA = ITEMS.register("matcha_tea",
            () -> new BeverageItem(new Item.Properties().maxStackSize(1).group(ItemGroup.MISC)
                    .food(ModFoods.MATCHA_TEA)));
    public static final RegistryObject<Item> MATCHA_LATTE = ITEMS.register("matcha_latte",
            () -> new BeverageItem(new Item.Properties().maxStackSize(1).group(ItemGroup.FOOD)
                    .food(ModFoods.MATCHA_LATTE)));
    public static final RegistryObject<Item> UNRIPE_CREEPING_FIG = ITEMS.register("unripe_creeping_fig",
            () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> RIPE_CREEPING_FIG = ITEMS.register("ripe_creeping_fig",
            () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> AIYU_JELLY = ITEMS.register("aiyu_jelly",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.AIYU_JELLY)));

    public static final RegistryObject<Item> DRAGON_BLOOD_RESIN = ITEMS.register("dragon_blood_resin",
            () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> RED_CURRANT = ITEMS.register("red_currant",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.RED_CURRANT)));
    public static final RegistryObject<Item> BLACK_CURRANT = ITEMS.register("black_currant",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.BLACK_CURRANT)));
    public static final RegistryObject<Item> RED_CURRANT_SEEDS = ITEMS.register("red_currant_seeds",
            () -> new BlockItem(ModBlocks.RED_CURRANT_CROP.get(), new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> BLACK_CURRANT_SEEDS = ITEMS.register("black_currant_seeds",
            () -> new BlockItem(ModBlocks.BLACK_CURRANT_CROP.get(), new Item.Properties().group(ItemGroup.MISC)));

    public static final RegistryObject<Item> FENNEL_SEEDS = ITEMS.register("fennel_seeds",
            () -> new BlockItem(ModBlocks.FENNEL_CROP.get(), new Item.Properties().group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> ROASTED_FENNEL_SEEDS = ITEMS.register("roasted_fennel_seeds",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.ROASTED_FENNEL_SEEDS)));
    public static final RegistryObject<Item> FENNEL_STALK = ITEMS.register("fennel_stalk",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.FENNEL_STALK)));
    public static final RegistryObject<Item> COOKED_FENNEL_STALK = ITEMS.register("cooked_fennel_stalk",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.COOKED_FENNEL_STALK)));

    public static final RegistryObject<Item> POISON_SAP = ITEMS.register("poison_sap",
            () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> POISONED_SWORD_WOOD = ITEMS.register("wood_poisoned_sword",
            () -> new PoisonSwordItem(ItemTier.WOOD, 3, -2.4F,
            new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> POISONED_SWORD_STONE = ITEMS.register("stone_poisoned_sword",
            () -> new PoisonSwordItem(ItemTier.STONE, 3, -2.4F,
                    new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> POISONED_SWORD_IRON = ITEMS.register("iron_poisoned_sword",
            () -> new PoisonSwordItem(ItemTier.IRON, 3, -2.4F,
                    new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> POISONED_SWORD_GOLD = ITEMS.register("gold_poisoned_sword",
            () -> new PoisonSwordItem(ItemTier.GOLD, 3, -2.4F,
                    new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> POISONED_SWORD_DIAMOND = ITEMS.register("diamond_poisoned_sword",
            () -> new PoisonSwordItem(ItemTier.DIAMOND, 3, -2.4F,
                    new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> POISONED_SWORD_NETHERITE = ITEMS.register("netherite_poisoned_sword",
            () -> new PoisonSwordItem(ItemTier.NETHERITE, 3, -2.4F,
                    new Item.Properties().group(ItemGroup.COMBAT)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
