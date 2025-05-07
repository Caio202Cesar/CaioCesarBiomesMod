package com.caiocesarmods.caiocesarbiomes.item;

import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup CCB_GROUP = new ItemGroup("CaioCesarBiomesTab")
    {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModPlants.DESERT_ROSE_PLANT.get());
        }

    };

    public static final ItemGroup CULINARY = new ItemGroup("CaioCesarBiomes:Culinary")
    {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.SAVORY_RABBIT.get());
        }

    };

    public static final ItemGroup FRUITS_AND_VEGETABLES = new ItemGroup("CaioCesarBiomes:FruitsAndVegetables")
    {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.LOQUAT.get());
        }

    };

    public static final ItemGroup PLANTS = new ItemGroup("CaioCesarBiomes:Plants")
    {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModPlants.DESERT_ROSE_PLANT.get());
        }

    };

    public static final ItemGroup TREES = new ItemGroup("CaioCesarBiomes:Trees")
    {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModPlants.COCONUT_SAPLING.get());
        }

    };

    public static final ItemGroup WOOD = new ItemGroup("CaioCesarBiomes:Wood")
    {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModPlants.LIVE_OAK_PLANKS.get());
        }

    };
}
