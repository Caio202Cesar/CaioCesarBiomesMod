package com.caiocesarmods.caiocesarbiomes.item;

import net.minecraft.block.ComposterBlock;
import net.minecraft.item.Item;

public class CompostablesRegistry {
    public static void addCompostable(float chance, Item item) {
        ComposterBlock.CHANCES.put(item, chance);
    }
}
