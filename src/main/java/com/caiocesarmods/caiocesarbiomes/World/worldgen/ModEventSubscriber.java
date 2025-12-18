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
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.server.ServerLifecycleHooks;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = CaioCesarBiomesMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEventSubscriber {

    @SubscribeEvent
    public static void onRenderGameOverlay(RenderGameOverlayEvent.Text event) {
        Season.onRenderGameOverlay(event);
    }

    @SubscribeEvent
    public static void onBiomeLoading(BiomeLoadingEvent event) {

        if (event.getName() != null &&
                event.getName().equals(Biomes.SWAMP.getRegistryName())) {

            Biome.Climate old = event.getClimate();

            event.setClimate(new Biome.Climate(
                    old.precipitation,
                    0.84f,                  // NEW base temperature = Hardiness zone 9: 0.8F - 0.84F
                    old.temperatureModifier,
                    old.downfall
            ));
        }

        if (event.getName() != null &&
                event.getName().equals(Biomes.SWAMP_HILLS.getRegistryName())) {

            Biome.Climate old = event.getClimate();

            event.setClimate(new Biome.Climate(
                    old.precipitation,
                    0.84f,                  // NEW base temperature = Hardiness zone 9: 0.8F - 0.84F
                    old.temperatureModifier,
                    old.downfall
            ));
        }

        if (event.getName() != null &&
                event.getName().equals(Biomes.PLAINS.getRegistryName())) {

            Biome.Climate old = event.getClimate();

            event.setClimate(new Biome.Climate(
                    old.precipitation,
                    0.75f,                  // NEW temperature = Hardiness zone 7: 0.7F - 0.75F

                    old.temperatureModifier,
                    old.downfall
            ));
        }

        if (event.getName() != null &&
                event.getName().equals(Biomes.SUNFLOWER_PLAINS.getRegistryName())) {

            Biome.Climate old = event.getClimate();

            event.setClimate(new Biome.Climate(
                    old.precipitation,
                    0.75f,                  // NEW temperature = Hardiness zone 7: 0.7F - 0.75F

                    old.temperatureModifier,
                    old.downfall
            ));
        }

        if (event.getName() != null &&
                event.getName().equals(Biomes.FOREST.getRegistryName())) {

            Biome.Climate old = event.getClimate();

            event.setClimate(new Biome.Climate(
                    old.precipitation,
                    0.75f,                  // NEW temperature = Hardiness zone 7: 0.7F - 0.75F
                    old.temperatureModifier,
                    old.downfall
            ));
        }

        if (event.getName() != null &&
                event.getName().equals(Biomes.FLOWER_FOREST.getRegistryName())) {

            Biome.Climate old = event.getClimate();

            event.setClimate(new Biome.Climate(
                    old.precipitation,
                    0.75f,                  // NEW temperature = Hardiness zone 7: 0.7F - 0.75F
                    old.temperatureModifier,
                    old.downfall
            ));
        }

        if (event.getName() != null &&
                event.getName().equals(Biomes.WOODED_HILLS.getRegistryName())) {

            Biome.Climate old = event.getClimate();

            event.setClimate(new Biome.Climate(
                    old.precipitation,
                    0.75f,                  // NEW temperature = Hardiness zone 7: 0.7F - 0.75F
                    old.temperatureModifier,
                    old.downfall
            ));
        }
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
                    if (player.getRNG().nextInt(150) == 30) { // ~30 in 150 chance per tick
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
                    if (player.getRNG().nextInt(200) == 10) { // ~10 in 200 chance per tick
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
                    if (player.getRNG().nextInt(270) == 5) { // ~5 in 270 chance per tick
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
                        if (stack.getItem() == ModItems.UNRIPE_MANGO.get()) {
                            if (age >= 120000) {
                                inventory.setInventorySlotContents(i, new ItemStack(ModItems.MANGO.get(), stack.getCount()));
                            } else {
                                tag.putInt("RipenAge", age);
                                stack.setTag(tag);
                            }

                        } else if (stack.getItem() == ModItems.UNRIPE_CREEPING_FIG.get()) {
                            if (age >= 120000) {
                                inventory.setInventorySlotContents(i, new ItemStack(ModItems.RIPE_CREEPING_FIG.get(), stack.getCount()));
                            } else {
                                tag.putInt("RipenAge", age);
                                stack.setTag(tag);
                            }

                        } else if (stack.getItem() == ModItems.MARULA.get()) {
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
