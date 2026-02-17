package com.caiocesarmods.caiocesarbiomes.integration.jei;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.data.recipes.ButterRecipe;
import com.caiocesarmods.caiocesarbiomes.data.recipes.ModRecipeTypes;
import com.caiocesarmods.caiocesarbiomes.data.recipes.ToastRecipe;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.item.crafting.RecipeManager;
import net.minecraft.util.ResourceLocation;

import java.util.Objects;
import java.util.stream.Collectors;

@JeiPlugin
public class CaioCesarJei implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(
                new ButterRecipeCategory(registration.getJeiHelpers().getGuiHelper()),
                new ToastRecipeCategory(registration.getJeiHelpers().getGuiHelper()));

    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().world).getRecipeManager();
        registration.addRecipes(rm.getRecipesForType(ModRecipeTypes.BUTTER_RECIPE).stream()
                        .filter(r -> r instanceof ButterRecipe).collect(Collectors.toList()),
                ButterRecipeCategory.UID);
        registration.addRecipes(rm.getRecipesForType(ModRecipeTypes.TOAST_RECIPE).stream()
                        .filter(r -> r instanceof ToastRecipe).collect(Collectors.toList()),
                ToastRecipeCategory.UID);
    }
}
