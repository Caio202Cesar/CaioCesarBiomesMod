package com.caiocesarmods.caiocesarbiomes.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ButterItem extends Item {
    public ButterItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        ItemStack container = itemStack.copy();
        if(container.attemptDamageItem(6, random, null)) {
            return ItemStack.EMPTY;
        } else {
            return container;
        }
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }
}

