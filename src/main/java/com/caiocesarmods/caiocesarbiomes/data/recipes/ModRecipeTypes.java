package com.caiocesarmods.caiocesarbiomes.data.recipes;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import net.minecraft.item.crafting.CookingRecipeSerializer;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModRecipeTypes {
    public static final DeferredRegister<IRecipeSerializer<?>> RECIPE_SERIALIZER =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, CaioCesarBiomesMod.MOD_ID);

    //Toast
    public static final RegistryObject<ToastRecipe.Serializer> TOASTER_SERIALIZER
            = RECIPE_SERIALIZER.register("toaster", ToastRecipe.Serializer::new);

    public static IRecipeType<ToastRecipe> TOAST_RECIPE
            = new ToastRecipe.ToastRecipeType();

    //Butter
    public static final RegistryObject<ButterRecipe.Serializer> BUTTER_SERIALIZER
            = RECIPE_SERIALIZER.register("butter_mixer", ButterRecipe.Serializer::new);

    public static IRecipeType<ButterRecipe> BUTTER_RECIPE
            = new ButterRecipe.ButterRecipeType();


    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZER.register(eventBus);

        Registry.register(Registry.RECIPE_TYPE, ToastRecipe.TYPE_ID, TOAST_RECIPE);
        Registry.register(Registry.RECIPE_TYPE, ButterRecipe.TYPE_ID, BUTTER_RECIPE);
    }
}

