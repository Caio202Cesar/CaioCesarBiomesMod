package com.caiocesarmods.caiocesarbiomes.item;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class RipeningItemHandler {

    @SubscribeEvent
    public static void onWorldTick(TickEvent.WorldTickEvent event) {
        if (event.phase == TickEvent.Phase.END && !event.world.isRemote) {
            ServerWorld world = (ServerWorld) event.world;

            for (TileEntity tile : world.loadedTileEntityList) {
                if (tile instanceof IInventory) {
                    IInventory inventory = (IInventory) tile;

                    for (int i = 0; i < inventory.getSizeInventory(); i++) {
                        ItemStack stack = inventory.getStackInSlot(i);

                        if (!stack.isEmpty() && stack.getItem() == ModItems.UNRIPE_MANGO.get()) {
                            if (world.rand.nextInt(200) == 0) { // 1/200 chance per tick
                                inventory.setInventorySlotContents(i, new ItemStack(ModItems.MANGO.get(), stack.getCount()));
                            }
                        }
                        if (!stack.isEmpty() && stack.getItem() == ModItems.UNRIPE_CREEPING_FIG.get()) {
                            if (world.rand.nextInt(100) == 25) { // 1/200 chance per tick
                                inventory.setInventorySlotContents(i, new ItemStack(ModItems.RIPE_CREEPING_FIG.get(), stack.getCount()));
                            }
                        }
                        if (!stack.isEmpty() && stack.getItem() == ModItems.MARULA.get()) {
                            if (world.rand.nextInt(100) == 75) { // 1/200 chance per tick
                                inventory.setInventorySlotContents(i, new ItemStack(ModItems.UNRIPE_MANGO.get(), stack.getCount()));
                            }
                        }
                    }
                }
            }
        }
    }
}
