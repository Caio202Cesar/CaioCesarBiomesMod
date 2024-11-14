package com.caiocesarmods.caiocesarbiomes.item;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CaioCesarBiomesMod.MOD_ID);

    public static final RegistryObject<Item> AVOCADO = ITEMS.register("avocado",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.AVOCADO)));
    public static final RegistryObject<Item> FENNEL_SEEDS = ITEMS.register("fennel_seeds",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
    public static final RegistryObject<Item> FENNEL_STALK = ITEMS.register("fennel_stalk",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.FENNEL_STALK)));
    public static final RegistryObject<Item> FIGFRUIT = ITEMS.register("figfruit",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.FIGFRUIT)));
    public static final RegistryObject<Item> POMEGRANATE = ITEMS.register("pomegranate",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.POMEGRANATE)));
    public static final RegistryObject<Item> POISON_SAP = ITEMS.register("poison_sap",
            () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> OLIVES = ITEMS.register("olives",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.OLIVES)));
    public static final RegistryObject<Item> ARBUTUS = ITEMS.register("arbutus",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.ARBUTUS)));
    public static final RegistryObject<Item> MULBERRIES = ITEMS.register("mulberries",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.MULBERRIES)));
    public static final RegistryObject<Item> LOQUAT = ITEMS.register("loquat",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.LOQUAT)));
    public static final RegistryObject<Item> MANDARIN = ITEMS.register("mandarin",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.MANDARIN).food(ModFoods.MANDARIN)));
    public static final RegistryObject<Item> ORANGE = ITEMS.register("orange",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.ORANGE).food(ModFoods.ORANGE)));
    public static final RegistryObject<Item> LEMON = ITEMS.register("orange",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.LEMON).food(ModFoods.LEMON)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
