package com.caiocesarmods.caiocesarbiomes.integration.jei;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.block.MiscBlocks;
import com.caiocesarmods.caiocesarbiomes.data.recipes.ButterRecipe;
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

public class ButterRecipeCategory implements IRecipeCategory<ButterRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "butter_mixer");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "textures/gui/butter_mixer_gui.png");

    private final IDrawable background;
    private final IDrawable icon;
    private final IDrawableStatic enginer;

    public ButterRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(new ItemStack(MiscBlocks.BUTTER_MIXER.get()));
        this.enginer = helper.createDrawable(TEXTURE, 176, 0, 13, 17);
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends ButterRecipe> getRecipeClass() {
        return ButterRecipe.class;
    }

    @Override
    public String getTitle() {
        return MiscBlocks.BUTTER_MIXER.get().getTranslatedName().getString();
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
    public void setIngredients(ButterRecipe recipe, IIngredients ingredients) {
        ingredients.setInputIngredients(recipe.getIngredients());
        ingredients.setOutput(VanillaTypes.ITEM, recipe.getRecipeOutput());
    }

    @Override
    public void setRecipe(IRecipeLayout recipeLayout, ButterRecipe recipe, IIngredients ingredients) {
        recipeLayout.getItemStacks().init(0, true, 79, 30);
        recipeLayout.getItemStacks().init(1, true, 79, 52);

        recipeLayout.getItemStacks().init(2, false, 102, 42);
        recipeLayout.getItemStacks().set(ingredients);
    }

    @Override
    public void draw(ButterRecipe recipe, MatrixStack matrixStack, double mouseX, double mouseY) {
        if(recipe.isRedstoneActivated()) {
            this.enginer.draw(matrixStack, 82, 9);
        }
    }
}
