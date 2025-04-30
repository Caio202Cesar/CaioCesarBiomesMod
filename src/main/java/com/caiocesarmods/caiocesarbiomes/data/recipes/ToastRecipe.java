package com.caiocesarmods.caiocesarbiomes.data.recipes;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ToastRecipe implements IToastRecipe {
    /**
     * Used to check if a recipe matches current crafting inventory
     *
     * @param inv
     * @param worldIn
     */
    @Override
    public boolean matches(IInventory inv, World worldIn) {
        return false;
    }

    /**
     * Returns an Item that is the result of this recipe
     *
     * @param inv
     */
    @Override
    public ItemStack getCraftingResult(IInventory inv) {
        return null;
    }

    /**
     * Get the result of this recipe, usually for display purposes (e.g. recipe book). If your recipe has more than one
     * possible result (e.g. it's dynamic and depends on its inputs), then return an empty stack.
     */
    @Override
    public ItemStack getRecipeOutput() {
        return null;
    }

    @Override
    public ResourceLocation getId() {
        return null;
    }

    @Override
    public IRecipeSerializer<?> getSerializer() {
        return null;
    }
}
