package com.caiocesarmods.caiocesarbiomes.item.custom;

import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class UnripeCreepingFigItem extends Item {
    public UnripeCreepingFigItem(Properties properties) {
        super(properties);
    }

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        PlayerEntity player = event.player;

        if (!player.world.isRemote && event.phase == TickEvent.Phase.END) {
            for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
                ItemStack stack = player.inventory.getStackInSlot(i);

                if (!stack.isEmpty() && stack.getItem() == ModItems.UNRIPE_CREEPING_FIG.get()) {
                    if (player.getRNG().nextInt(100) == 30) { // ~30 in 100 chance per tick
                        ItemStack ripeStack = new ItemStack(ModItems.RIPE_CREEPING_FIG.get(), stack.getCount());
                        if (stack.hasTag()) {
                            ripeStack.setTag(stack.getTag().copy());
                        }

                        player.inventory.setInventorySlotContents(i, ripeStack);
                    }
                }
            }
        }
    }
}
