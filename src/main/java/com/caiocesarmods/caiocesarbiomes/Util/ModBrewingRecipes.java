package com.caiocesarmods.caiocesarbiomes.Util;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtils;
import net.minecraftforge.common.brewing.IBrewingRecipe;

public class ModBrewingRecipes implements IBrewingRecipe {
    private final Potion input;
    private final Item ingredient;
    private final Potion output;

    public ModBrewingRecipes(Potion input, Item ingredient, Potion output) {
        this.input = input;
        this.ingredient = ingredient;
        this.output = output;
    }

    @Override
    public boolean isInput(ItemStack inputStack) {
        return inputStack.getItem() == Items.POTION && PotionUtils.getPotionFromItem(inputStack) == this.input;
    }

    @Override
    public boolean isIngredient(ItemStack ingredientStack) {
        return ingredientStack.getItem() == this.ingredient;
    }

    @Override
    public ItemStack getOutput(ItemStack inputStack, ItemStack ingredientStack) {
        if (!this.isInput(inputStack) || !this.isIngredient(ingredientStack)) {
            return ItemStack.EMPTY;
        }

        ItemStack result = new ItemStack(inputStack.getItem());
        CompoundNBT tag = inputStack.getTag() != null ? inputStack.getTag().copy() : new CompoundNBT();
        result.setTag(tag);
        PotionUtils.addPotionToItemStack(result, this.output);
        return result;
    }
}
