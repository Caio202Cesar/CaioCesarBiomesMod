package com.caiocesarmods.caiocesarbiomes.item.custom;

import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class UnripeCreepingFigItem extends Item {
    public UnripeCreepingFigItem(Properties properties) {
        super(properties);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isRemote && world.rand.nextFloat() < 0.001f) {
            entity.replaceItemInInventory(slot, new ItemStack(ModItems.RIPE_CREEPING_FIG.get()));
        }
    }
}
