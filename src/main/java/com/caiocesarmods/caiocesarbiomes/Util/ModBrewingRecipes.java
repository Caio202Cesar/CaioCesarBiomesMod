package com.caiocesarmods.caiocesarbiomes.Util;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraftforge.common.brewing.IBrewingRecipe;

public class ModBrewingRecipes implements IBrewingRecipe {
    public ModBrewingRecipes(Potion water, Item item, Potion potion) {
    }

    /**
     * Returns true is the passed ItemStack is an input for this recipe. "Input"
     * being the item that goes in one of the three bottom slots of the brewing
     * stand (e.g: water bottle)
     *
     * @param input
     */
    @Override
    public boolean isInput(ItemStack input) {
        return false;
    }

    /**
     * Returns true if the passed ItemStack is an ingredient for this recipe.
     * "Ingredient" being the item that goes in the top slot of the brewing
     * stand (e.g: nether wart)
     *
     * @param ingredient
     */
    @Override
    public boolean isIngredient(ItemStack ingredient) {
        return false;
    }

    /**
     * Returns the output when the passed input is brewed with the passed
     * ingredient. Empty if invalid input or ingredient.
     *
     * @param input
     * @param ingredient
     */
    @Override
    public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
        if (!getOutput().isEmpty()) {
            return output;
        }
        return input;
    }
        return ItemStack.EMPTY;
}
