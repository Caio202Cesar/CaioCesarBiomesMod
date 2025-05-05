package com.caiocesarmods.caiocesarbiomes.data.recipes;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public interface IButterRecipe extends IRecipe<IInventory> {
    ResourceLocation TYPE_ID = new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "butter_mixer");

    @Override
    default IRecipeType<?> getType() {
        return Registry.RECIPE_TYPE.getOptional(TYPE_ID)
                .orElseThrow(() -> new IllegalStateException("ButterRecipeType is not registered: " + TYPE_ID));
    }

    @Override
    default boolean canFit(int width, int height) {
        return true;
    }

    @Override
    default boolean isDynamic(){
        return true;
    }
}