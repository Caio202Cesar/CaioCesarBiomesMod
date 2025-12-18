package com.caiocesarmods.caiocesarbiomes.data.recipes;

import com.caiocesarmods.caiocesarbiomes.block.MiscBlocks;
import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.*;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistryEntry;

import javax.annotation.Nullable;

//Obs.: replace the weather condition of the Kaupenjoe's video by a redstone signal condition here.
public class ToastRecipe implements IToastRecipe {
    private final ResourceLocation id;
    private final ItemStack output;
    private final NonNullList<Ingredient> recipeItems;
    private final boolean redstoneActivated;

    public ToastRecipe(ResourceLocation id, ItemStack output,
                       NonNullList<Ingredient> recipeItems, boolean redstoneActivated) {
        this.id = id;
        this.output = output;
        this.recipeItems = recipeItems;
        this.redstoneActivated = redstoneActivated;

    }

    @Override
    public boolean matches(IInventory inv, World worldIn) {
        if (recipeItems.get(0).test(inv.getStackInSlot(0))) {
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

    public boolean isRedstoneActivated() {
        return redstoneActivated;
    }

    public boolean isRedstonePowered(World world, BlockPos pos) {
        return redstoneActivated && world != null && world.isBlockPowered(pos);
    }

    public ItemStack getIcon() {
        return new ItemStack(MiscBlocks.TOASTER.get());
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

            boolean redstoneActivated = JSONUtils.getBoolean(json, "redstoneActivated", false);

            JsonArray ingredients = JSONUtils.getJsonArray(json, "ingredients");
            NonNullList<Ingredient> inputs = NonNullList.withSize(ingredients.size(), Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.deserialize(ingredients.get(i)));
            }

            return new ToastRecipe(recipeId, output, inputs, redstoneActivated);
        }

        @Nullable
        @Override
        public ToastRecipe read(ResourceLocation recipeId, PacketBuffer buffer) {
            int size = buffer.readInt();
            NonNullList<Ingredient> inputs = NonNullList.withSize(size, Ingredient.EMPTY);

            for (int i = 0; i < size; i++) {
                inputs.set(i, Ingredient.read(buffer));
            }

            ItemStack output = buffer.readItemStack();
            boolean redstoneActivated = buffer.readBoolean();
            return new ToastRecipe(recipeId, output, inputs, redstoneActivated);
        }

        @Override
        public void write(PacketBuffer buffer, ToastRecipe recipe) {
            buffer.writeInt(recipe.getIngredients().size());
            for (Ingredient ing : recipe.getIngredients()) {
                ing.write(buffer);
            }
            buffer.writeItemStack(recipe.getRecipeOutput(), false);
            buffer.writeBoolean(recipe.isRedstoneActivated());
        }
    }
}