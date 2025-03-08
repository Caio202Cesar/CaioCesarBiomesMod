package com.caiocesarmods.caiocesarbiomes.item;

import com.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import net.minecraft.block.ComposterBlock;
import net.minecraft.util.IItemProvider;

public class CompostablesRegistry {
    public static void init() {
        registerCompostableItem(0.6F, ModItems.ARBUTUS.get());

        registerCompostableItem(0.6F, ModBlocks.BASIL.get());
        registerCompostableItem(0.6F, ModBlocks.ANIS.get());

    }

    public static void registerCompostableItem(float chance, IItemProvider itemIn) {
        ComposterBlock.CHANCES.put(itemIn.asItem(), chance);
    }
}
