package com.caiocesarmods.caiocesarbiomes.World.worldgen;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.Seasons.Season;
import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.server.ServerLifecycleHooks;

@Mod.EventBusSubscriber(modid = CaioCesarBiomesMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEventSubscriber {

    @SubscribeEvent
    public static void onRenderGameOverlay(RenderGameOverlayEvent.Text event) {
        Season.onRenderGameOverlay(event);
    }

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;

        PlayerEntity player = event.player;
        ItemStack heldItem = player.getHeldItemMainhand(); // or getHeldItemOffhand()

        if (!heldItem.isEmpty() && heldItem.getItem() == ModItems.DURIAN.get()) {
            // Apply nausea effect if not already present
            if (!player.isPotionActive(Effects.NAUSEA)) {
                player.addPotionEffect(new EffectInstance(Effects.NAUSEA, 200, 100, false, false));
            }
        }

        if (!player.world.isRemote) {
            for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
                ItemStack stack = player.inventory.getStackInSlot(i);

                if (!stack.isEmpty() && stack.getItem() == ModItems.MARULA.get()) {
                    if (player.getRNG().nextInt(100) == 70) { // ~70 in 100 chance per tick
                        ItemStack ripeStack = new ItemStack(ModItems.RIPE_MARULA.get(), stack.getCount());
                        if (stack.hasTag()) {
                            ripeStack.setTag(stack.getTag().copy());
                        }

                        player.inventory.setInventorySlotContents(i, ripeStack);
                    }
                }
            }
        }

        if (!player.world.isRemote) {
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

        if (!player.world.isRemote) {
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

    @SubscribeEvent
    public static void onServerTick(TickEvent.ServerTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;

        MinecraftServer server = ServerLifecycleHooks.getCurrentServer();

        for (ServerWorld world : server.getWorlds()) {
            for (TileEntity tile : world.loadedTileEntityList) {
                if (tile instanceof IInventory) {
                    IInventory inventory = (IInventory) tile;
                    for (int i = 0; i < inventory.getSizeInventory(); i++) {
                        ItemStack stack = inventory.getStackInSlot(i);

                        if (stack.getItem() == ModItems.UNRIPE_MANGO.get()) {
                            CompoundNBT tag = stack.getOrCreateTag();
                            int age = tag.getInt("RipenAge");
                            age++;

                            if (age >= 120000) { // 10 minutes in ticks
                                inventory.setInventorySlotContents(i, new ItemStack(ModItems.MANGO.get(), stack.getCount()));
                            } else {
                                tag.putInt("RipenAge", age);
                                stack.setTag(tag);
                            }
                        }

                        if (stack.getItem() == ModItems.UNRIPE_CREEPING_FIG.get()) {
                            CompoundNBT tag = stack.getOrCreateTag();
                            int age = tag.getInt("RipenAge");
                            age++;

                            if (age >= 120000) { // 10 minutes in ticks
                                inventory.setInventorySlotContents(i, new ItemStack(ModItems.RIPE_CREEPING_FIG.get(), stack.getCount()));
                            } else {
                                tag.putInt("RipenAge", age);
                                stack.setTag(tag);
                            }
                        }

                        if (stack.getItem() == ModItems.MARULA.get()) {
                            CompoundNBT tag = stack.getOrCreateTag();
                            int age = tag.getInt("RipenAge");
                            age++;

                            if (age >= 16000) {
                                inventory.setInventorySlotContents(i, new ItemStack(ModItems.RIPE_MARULA.get(), stack.getCount()));
                            } else {
                                tag.putInt("RipenAge", age);
                                stack.setTag(tag);
                            }
                        }
                    }
                }
            }
        }
    }
}
