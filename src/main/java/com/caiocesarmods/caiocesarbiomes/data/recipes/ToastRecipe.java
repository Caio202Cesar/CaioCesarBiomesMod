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
import java.util.Objects;
import java.util.Optional;

//Obs.: replace the weather condition of the Kaupenjoe's video by a redstone signal condition here.
public class ToastRecipe implements IToastRecipe {
    public enum Weather {
        CLEAR,
        RAIN,
        THUNDERING;

        public static Weather getWeatherByString(String s) {
            return Objects.equals(s, "thundering") ? THUNDERING : Objects.equals(s, "rain") ? RAIN : CLEAR;
        }
    }

    private final ResourceLocation id;
    private final ItemStack output;
    private final NonNullList<Ingredient> recipeItems;
    private final Weather weather;

    public ToastRecipe(ResourceLocation id, ItemStack output,
                                    NonNullList<Ingredient> recipeItems, Weather weather) {
        this.id = id;
        this.output = output;
        this.recipeItems = recipeItems;
        this.weather = weather;
    }

    @Override
    public boolean matches(IInventory inv, World worldIn) {
        if(recipeItems.get(0).test(inv.getStackInSlot(0))) {
            return recipeItems.get(1).test(inv.getStackInSlot(1));
        }

        return false;
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {
        return recipeItems;
    }

    @Override
    public ItemStack getCraftingResult(IInventory inv) {
        return output;
    }

    @Override
    public ItemStack getRecipeOutput() {
        return output.copy();
    }

    public Weather getWeather() {
        return this.weather;
    }

    public ItemStack getIcon() {
        return new ItemStack(ModBlocks.TOASTER.get());
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public IRecipeSerializer<?> getSerializer() {
        return ModRecipeTypes.TOASTER_SERIALIZER.get();
    }

    public static class ToastRecipeType implements IRecipeType<ToastRecipe> {
        @Override
        public String toString() {
            return ToastRecipe.TYPE_ID.toString();
        }
    }

    public static class Serializer extends ForgeRegistryEntry<IRecipeSerializer<?>>
            implements IRecipeSerializer<ToastRecipe> {

        @Override
        public ToastRecipe read(ResourceLocation recipeId, JsonObject json) {
            ItemStack output = ShapedRecipe.deserializeItem(JSONUtils.getJsonObject(json, "output"));
            String weather = JSONUtils.getString(json, "weather");

            JsonArray ingredients = JSONUtils.getJsonArray(json, "ingredients");
            NonNullList<Ingredient> inputs = NonNullList.withSize(2, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.deserialize(ingredients.get(i)));
            }

            return new ToastRecipe(recipeId, output,
                    inputs, Weather.getWeatherByString(weather));
        }

        @Nullable
        @Override
        public ToastRecipe read(ResourceLocation recipeId, PacketBuffer buffer) {
            NonNullList<Ingredient> inputs = NonNullList.withSize(2, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.read(buffer));
            }

            ItemStack output = buffer.readItemStack();
            return new ToastRecipe(recipeId, output,
                    inputs, null);
        }

        @Override
        public void write(PacketBuffer buffer, ToastRecipe recipe) {
            buffer.writeInt(recipe.getIngredients().size());
            for (Ingredient ing : recipe.getIngredients()) {
                ing.write(buffer);
            }
            buffer.writeItemStack(recipe.getRecipeOutput(), false);
        }
    }
}