package com.caiocesarmods.caiocesarbiomes.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.UseAction;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DrinkHelper;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class BeverageItem extends Item {
    public BeverageItem(Properties properties) {
        super(properties);
    }

    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 32;
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        return DrinkHelper.startDrinking(worldIn, playerIn, handIn);
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        if (entityLiving instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entityLiving;
            player.takeStat(Stats.ITEM_USED.get(this)); // Register the item usage stat

            if (!worldIn.isRemote) {
                this.applyDrinkEffects(stack, worldIn, player);
            }

            if (!player.isCreative()) {
                return new ItemStack(Items.GLASS_BOTTLE);
            }
        }
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }

    /**
     * Apply drink effects (override this method if needed).
     */
    protected void applyDrinkEffects(ItemStack stack, World worldIn, PlayerEntity player) {
        player.onFoodEaten(worldIn, stack); // Triggers drinking animation
    }

    @Override
    public net.minecraftforge.common.capabilities.ICapabilityProvider initCapabilities(ItemStack stack, @javax.annotation.Nullable net.minecraft.nbt.CompoundNBT nbt) {
        return new net.minecraftforge.fluids.capability.wrappers.FluidBucketWrapper(stack);
    }
}
