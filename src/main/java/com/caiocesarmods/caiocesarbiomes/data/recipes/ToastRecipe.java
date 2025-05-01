package com.caiocesarmods.caiocesarbiomes.data.recipes;

import com.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapedRecipe;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistryEntry;

import javax.annotation.Nullable;

//Obs.: replace the weather condition of the Kaupenjoe's video by a redstone signal condition here.
public class ToastRecipe implements IToastRecipe {
    private final ResourceLocation id;
    private final ItemStack output;
    private final NonNullList<Ingredient> recipeItems;

    public ToastRecipe(ResourceLocation id, ItemStack output,
                       NonNullList<Ingredient> recipeItems) {
        this.id = id;
        this.output = output;
        this.recipeItems = recipeItems;
    }

    /**
     * Used to check if a recipe matches current crafting inventory
     *
     * @param inv
     * @param worldIn
     */
    @Override
    public boolean matches(IInventory inv, World worldIn) {
        // Checks for correct focus (Glass Pane)
        if(recipeItems.get(0).test(inv.getStackInSlot(0))) {
            return recipeItems.get(1).test(inv.getStackInSlot(1));
        }

        return false;
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {
        return recipeItems;
    }

    /**
     * Returns an Item that is the result of this recipe
     *
     * @param inv
     */
    @Override
    public ItemStack getCraftingResult(IInventory inv) {
        return output;
    }

    /**
     * Get the result of this recipe, usually for display purposes (e.g. recipe book). If your recipe has more than one
     * possible result (e.g. it's dynamic and depends on its inputs), then return an empty stack.
     */
    @Override
    public ItemStack getRecipeOutput() {
        return output.copy();
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

            JsonArray ingredients = JSONUtils.getJsonArray(json, "ingredients");
            NonNullList<Ingredient> inputs = NonNullList.withSize(2, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.deserialize(ingredients.get(i)));
            }

            return new ToastRecipe(recipeId, output, inputs);
        }

        @Nullable
        @Override
        public ToastRecipe read(ResourceLocation recipeId, PacketBuffer buffer) {
            NonNullList<Ingredient> inputs = NonNullList.withSize(2, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.read(buffer));
            }

            ItemStack output = buffer.readItemStack();
            return new ToastRecipe(recipeId, output, inputs);
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
