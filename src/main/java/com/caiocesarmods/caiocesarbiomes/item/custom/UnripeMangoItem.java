package com.caiocesarmods.caiocesarbiomes.item.custom;

import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import static com.ibm.icu.text.PluralRules.Operand.i;

public class UnripeMangoItem extends Item {
    public UnripeMangoItem(Properties properties) {
        super(properties);
    }

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        PlayerEntity player = event.player;

        if (!player.world.isRemote && event.phase == TickEvent.Phase.END) {
            for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
                ItemStack stack = player.inventory.getStackInSlot(i);

                if (!stack.isEmpty() && stack.getItem() == ModItems.UNRIPE_MANGO.get()) {
                    if (player.getRNG().nextInt(100) == 30) { // ~30 in 100 chance per tick
                        ItemStack ripeStack = new ItemStack(ModItems.MANGO.get(), stack.getCount());
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
