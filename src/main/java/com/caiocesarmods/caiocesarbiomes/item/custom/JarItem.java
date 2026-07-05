package com.caiocesarmods.caiocesarbiomes.item.custom;

import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class JarItem extends Item {
    public JarItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true; // This item will have a container.
    }

    @Override
    public ItemStack getContainerItem(ItemStack stack) {
        ItemStack container = stack.copy();

        Random rand = new Random();

        if (container.attemptDamageItem(1, rand, null)) {
            // Fully consumed: return the empty jar
            return new ItemStack(ModItems.JAR.get());
        }

        return container;
    }
}