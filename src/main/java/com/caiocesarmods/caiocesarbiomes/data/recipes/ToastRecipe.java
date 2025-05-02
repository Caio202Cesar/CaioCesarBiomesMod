package com.caiocesarmods.caiocesarbiomes.data.recipes;

import com.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.*;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.registries.ForgeRegistryEntry;

import javax.annotation.Nullable;
import java.util.Optional;

//Obs.: replace the weather condition of the Kaupenjoe's video by a redstone signal condition here.
public class ToastRecipe implements IRecipe<IInventory> {

    private final ResourceLocation id;
    private final Ingredient ingredient;
    private final ItemStack output;

    public ToastRecipe(ResourceLocation id, Ingredient ingredient, ItemStack output) {
        this.id = id;
        this.ingredient = ingredient;
        this.output = output;
    }

    @Override
    public boolean matches(IInventory inv, World worldIn) {
        return ingredient.test(inv.getStackInSlot(0));
    }

    @Override
    public ItemStack getCraftingResult(IInventory inv) {
        return output.copy();
    }

    @Override
    public boolean canFit(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getRecipeOutput() {
        return output;
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public IRecipeSerializer<?> getSerializer() {
        return ModRecipeTypes.TOASTER_SERIALIZER.get();
    }

    @Override
    public IRecipeType<?> getType() {
        return ModRecipeTypes.TOAST_RECIPE;
    }

    public static class Serializer extends ForgeRegistryEntry<IRecipeSerializer<?>> implements IRecipeSerializer<ToastRecipe> {

        @Override
        public ToastRecipe read(ResourceLocation recipeId, JsonObject json) {
            Ingredient ingredient = Ingredient.deserialize(JSONUtils.getJsonObject(json, "ingredient"));
            ItemStack output = ShapedRecipe.deserializeItem(JSONUtils.getJsonObject(json, "result"));
            return new ToastRecipe(recipeId, ingredient, output);
        }

        @Override
        public ToastRecipe read(ResourceLocation recipeId, PacketBuffer buffer) {
            Ingredient ingredient = Ingredient.read(buffer);
            ItemStack output = buffer.readItemStack();
            return new ToastRecipe(recipeId, ingredient, output);
        }

        @Override
        public void write(PacketBuffer buffer, ToastRecipe recipe) {
            recipe.ingredient.write(buffer);
            buffer.writeItemStack(recipe.output);
        }
    }

    public static class ToastRecipeType implements IRecipeType<ToastRecipe> {
        @Override
        public String toString() {
            return ToastRecipe.TYPE_ID.toString();
        }
    }

    public static final ResourceLocation TYPE_ID = new ResourceLocation("caiocesarbiomes", "toaster_recipe");
}
