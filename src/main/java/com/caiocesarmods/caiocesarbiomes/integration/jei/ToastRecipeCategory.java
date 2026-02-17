package com.caiocesarmods.caiocesarbiomes.integration.jei;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.block.MiscBlocks;
import com.caiocesarmods.caiocesarbiomes.data.recipes.ButterRecipe;
import com.caiocesarmods.caiocesarbiomes.data.recipes.ToastRecipe;
import com.mojang.blaze3d.matrix.MatrixStack;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.drawable.IDrawableStatic;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ToastRecipeCategory implements IRecipeCategory<ToastRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "toaster");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "textures/gui/toaster_gui.png");

    private final IDrawable background;
    private final IDrawable icon;
    private final IDrawableStatic toast;

    public ToastRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(new ItemStack(MiscBlocks.TOASTER.get()));
        this.toast = helper.createDrawable(TEXTURE, 176, 0, 13, 17);
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends ToastRecipe> getRecipeClass() {
        return ToastRecipe.class;
    }

    @Override
    public String getTitle() {
        return MiscBlocks.TOASTER.get().getTranslatedName().getString();
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setIngredients(ToastRecipe recipe, IIngredients ingredients) {
        ingredients.setInputIngredients(recipe.getIngredients());
        ingredients.setOutput(VanillaTypes.ITEM, recipe.getRecipeOutput());
    }

    @Override
    public void setRecipe(IRecipeLayout recipeLayout, ToastRecipe recipe, IIngredients ingredients) {
        recipeLayout.getItemStacks().init(0, true, 79, 30);
        recipeLayout.getItemStacks().init(1, true, 79, 52);

        recipeLayout.getItemStacks().init(2, false, 102, 42);
        recipeLayout.getItemStacks().set(ingredients);
    }

    @Override
    public void draw(ToastRecipe recipe, MatrixStack matrixStack, double mouseX, double mouseY) {
        if(recipe.isRedstoneActivated()) {
            this.toast.draw(matrixStack, 82, 9);
        }
    }
}