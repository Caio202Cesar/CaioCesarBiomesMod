package com.caiocesarmods.caiocesarbiomes.item.custom;

import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class JarItem extends Item {
    public JarItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true; // This item will have a container.
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        Item containerItem = ModItems.JAR.get();
        return new ItemStack(containerItem);
    }
}