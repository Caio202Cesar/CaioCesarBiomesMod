package com.caiocesarmods.caiocesarbiomes.item;

import com.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup CCB_GROUP = new ItemGroup("CaioCesarBiomesTab")
    {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.DESERT_ROSE_PLANT.get());
        }

    };

    public static final ItemGroup CAIO_CESAR_BIOMES_CULINARY = new ItemGroup("CaioCesarBiomesCulinary")
    {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.ROSEMARY_STALK.get());
        }

    };
}
