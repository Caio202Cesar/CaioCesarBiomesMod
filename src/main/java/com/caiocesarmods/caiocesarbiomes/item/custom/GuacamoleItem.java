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

public class GuacamoleItem extends Item {
    public GuacamoleItem(Properties properties) {
        super(properties);
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        ItemStack itemstack = super.onItemUseFinish(stack, worldIn, entityLiving);
        return entityLiving instanceof PlayerEntity && ((PlayerEntity)entityLiving).abilities.isCreativeMode ? itemstack : new ItemStack(Items.BOWL);
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true; // This item will have a container.
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        Item containerItem = Items.BOWL;
        return new ItemStack(containerItem);
    }

}
