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

    public static final ItemGroup CULINARY = new ItemGroup("CaioCesarBiomes:Culinary")
    {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.ROSEMARY_STALK.get());
        }

    };

    public static final ItemGroup FRUITS_AND_VEGETABLES = new ItemGroup("CaioCesarBiomes:FruitsAndVegetables")
    {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.LOQUAT.get());
        }

    };
}
