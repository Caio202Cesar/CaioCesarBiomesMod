package com.caiocesarmods.caiocesarbiomes;

import com.caiocesarmods.caiocesarbiomes.Util.BiomeHUDHandler;
import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.server.ServerLifecycleHooks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Mod.EventBusSubscriber(modid = CaioCesarBiomesMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEventSubscriber {

    @SubscribeEvent
    public static void onRenderGameOverlay(RenderGameOverlayEvent.Text event) {
        BiomeHUDHandler.onRenderGameOverlay(event);
    }

    public static boolean isValidLightLevel(IServerWorld worldIn, BlockPos pos, Random randomIn) {
        if (worldIn.getLightFor(LightType.SKY, pos) > randomIn.nextInt(32)) {
            return false;
        } else {
            int i = worldIn.getWorld().isThundering() ? worldIn.getNeighborAwareLightSubtracted(pos, 10) : worldIn.getLight(pos);
            return i <= randomIn.nextInt(8);
        }
    }


    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;

        PlayerEntity player = event.player;
        ItemStack heldItem = player.getHeldItemMainhand();

        BlockPos pos = player.getPosition();
        World world = player.world;

        boolean exposedToSun = world.isDaytime() && world.canSeeSky(pos) && !world.isRainingAt(pos);

        if (!heldItem.isEmpty() && heldItem.getItem() == ModItems.DURIAN.get()) {
            // Apply nausea effect if not already present
            if (!player.isPotionActive(Effects.NAUSEA)) {
                player.addPotionEffect(new EffectInstance(Effects.NAUSEA, 200, 100, false, false));
            }
        }

        if (!heldItem.isEmpty() && heldItem.getItem() == ModItems.DURIAN_JUICE.get()) {
            // Apply nausea effect if not already present
            if (!player.isPotionActive(Effects.NAUSEA)) {
                player.addPotionEffect(new EffectInstance(Effects.NAUSEA, 200, 100, false, false));
            }
        }
        
        //Get burn from sun by holding ficus latex.
        if (!heldItem.isEmpty() && heldItem.getItem() == ModItems.FICUS_LATEX.get() && exposedToSun) {
            player.attackEntityFrom(DamageSource.HOT_FLOOR, 1.0F);
        }

        if (!player.world.isRemote) {
            for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
                ItemStack stack = player.inventory.getStackInSlot(i);

                if (!stack.isEmpty() && stack.getItem() == ModItems.MARULA.get()) {
                    if (player.getRNG().nextInt(450) == 10) { // ~10 in 450 chance per tick
                        ItemStack ripeStack = new ItemStack(ModItems.RIPE_MARULA.get(), stack.getCount());
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
            // Cópia da lista para evitar ConcurrentModificationException
            List<TileEntity> tiles = new ArrayList<>(world.loadedTileEntityList);

            for (TileEntity tile : tiles) {
                if (tile instanceof IInventory) {
                    IInventory inventory = (IInventory) tile;

                    for (int i = 0; i < inventory.getSizeInventory(); i++) {
                        ItemStack stack = inventory.getStackInSlot(i);

                        if (stack.isEmpty()) continue;

                        CompoundNBT tag = stack.getOrCreateTag();
                        int age = tag.getInt("RipenAge");
                        age++;

                        // Verifica qual item está amadurecendo e substitui quando atingir a idade certa
                        if (stack.getItem() == ModItems.MARULA.get()) {
                            if (age >= 120000) {
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
