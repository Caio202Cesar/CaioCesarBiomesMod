package com.caiocesarmods.caiocesarbiomes;

import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = CaioCesarBiomesMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCommonSetup {
    @SubscribeEvent
    public static void onCommonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            registerBrewingRecipes();
        });
    }

    private static void registerBrewingRecipes() {

        BrewingRecipeRegistry.addRecipe(
                Ingredient.fromItems(Items.LINGERING_POTION),
                Ingredient.fromItems(ModItems.POISON_SAP.get()),
                PotionUtils.addPotionToItemStack(
                        new ItemStack(Items.LINGERING_POTION),
                        Potions.STRONG_POISON
                )
        );
    }
}
