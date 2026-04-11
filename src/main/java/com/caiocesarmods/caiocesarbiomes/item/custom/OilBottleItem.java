package com.caiocesarmods.caiocesarbiomes.item.custom;

import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class OilBottleItem extends Item {
    public OilBottleItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true; // This item will have a container.
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        Item containerItem = Items.GLASS_BOTTLE;
        return new ItemStack(containerItem);
    }
}