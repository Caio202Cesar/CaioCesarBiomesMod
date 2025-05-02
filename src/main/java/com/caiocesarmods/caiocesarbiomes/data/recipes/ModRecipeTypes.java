package com.caiocesarmods.caiocesarbiomes.data.recipes;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModRecipeTypes {
    public static final DeferredRegister<IRecipeSerializer<?>> RECIPE_SERIALIZER =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, CaioCesarBiomesMod.MOD_ID);

    public static final RegistryObject<ToastRecipe.Serializer> TOASTER_SERIALIZER
            = RECIPE_SERIALIZER.register("toaster", ToastRecipe.Serializer::new);

    public static IRecipeType<ToastRecipe> TOAST_RECIPE
            = new ToastRecipe.ToastRecipeType();


    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZER.register(eventBus);

        Registry.register(Registry.RECIPE_TYPE, ToastRecipe.TYPE_ID, TOAST_RECIPE);
    }
}
