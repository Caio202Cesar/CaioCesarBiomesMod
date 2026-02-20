package com.caiocesarmods.caiocesarbiomes;

import com.caiocesarmods.caiocesarbiomes.Seasons.Season;
import com.caiocesarmods.caiocesarbiomes.Seasons.SetSeasonCommand;
import com.caiocesarmods.caiocesarbiomes.World.HardinessZones;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.TropicalDesertBiome;
import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.world.SaplingGrowTreeEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.server.ServerLifecycleHooks;
import net.minecraftforge.registries.IForgeRegistry;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = CaioCesarBiomesMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEventSubscriber {

    @SubscribeEvent
    public static void onRenderGameOverlay(RenderGameOverlayEvent.Text event) {
        Season.onRenderGameOverlay(event);
    }

    @SubscribeEvent
    public static void onRegisterCommands(RegisterCommandsEvent event) {
        SetSeasonCommand.register(event.getDispatcher());
    }

    @SubscribeEvent
    public static void onBiomeLoad(BiomeLoadingEvent event) {

        if (event.getCategory() == Biome.Category.PLAINS) {

            ResourceLocation id = event.getName();
            if (id == null) return;

            String namespace = id.getNamespace();

            // ⛔ Skip all biomes from your mod
            if (id.getNamespace().equals(CaioCesarBiomesMod.MOD_ID)) {
                System.out.println("[DEBUG] Skipping biomes from the mod: " + id);
                return;
            }

            // 🛑 Skip all biomes from brbiomesmod
            if (namespace.equals("brbiomesmod")) {
                System.out.println("[DEBUG] Skipping biomes from brbiomesmod: " + id);
                return;
            }

            // ✔ Only vanilla (or other-mod) mesa biomes reach this point
            System.out.println("[DEBUG] Overriding temperature for: " + id);

            event.setClimate(new Biome.Climate(
                    Biome.RainType.RAIN,          // rain
                    0.79f,                         // new temperature - hardiness zone 8
                    Biome.TemperatureModifier.NONE,
                    0.4f                          // downfall
            ));
        }


        if (event.getCategory() == Biome.Category.MESA) {

            System.out.println("[DEBUG] Overriding Badlands temperature!");

            event.setClimate(new Biome.Climate(
                    Biome.RainType.NONE,     // rain type
                    0.69f,                    // new temperature - hardiness zone 6
                    Biome.TemperatureModifier.NONE,
                    0.0f                     // downfall
            ));
        }

        if (event.getCategory() == Biome.Category.JUNGLE) {

            ResourceLocation id = event.getName();
            if (id == null) return;

            String namespace = id.getNamespace();

            // ⛔ Skip all biomes from your mod
            if (id.getNamespace().equals(CaioCesarBiomesMod.MOD_ID)) {
                System.out.println("[DEBUG] Skipping biomes from the mod: " + id);
                return;
            }

            // 🛑 Skip all biomes from brbiomesmod
            if (namespace.equals("brbiomesmod")) {
                System.out.println("[DEBUG] Skipping biomes from brbiomesmod: " + id);
                return;
            }

            // ✔ Only vanilla (or other-mod) mesa biomes reach this point
            System.out.println("[DEBUG] Overriding temperature for: " + id);

            event.setClimate(new Biome.Climate(
                    Biome.RainType.RAIN,          // rain
                    1.2f,                         // new temperature
                    Biome.TemperatureModifier.NONE,
                    0.9f                          // downfall
            ));
        }

        if (event.getCategory() == Biome.Category.SWAMP) {

            ResourceLocation id = event.getName();
            if (id == null) return;

            String namespace = id.getNamespace();

            // ⛔ Skip all biomes from your mod
            if (id.getNamespace().equals(CaioCesarBiomesMod.MOD_ID)) {
                System.out.println("[DEBUG] Skipping biomes from the mod: " + id);
                return;
            }

            // 🛑 Skip all biomes from brbiomesmod
            if (namespace.equals("brbiomesmod")) {
                System.out.println("[DEBUG] Skipping biomes from brbiomesmod: " + id);
                return;
            }

            // ✔ Only vanilla (or other-mod) mesa biomes reach this point
            System.out.println("[DEBUG] Overriding temperature for: " + id);

            event.setClimate(new Biome.Climate(
                    Biome.RainType.RAIN,          // rain
                    0.84f,                         // new temperature - hardiness zone 9
                    Biome.TemperatureModifier.NONE,
                    0.9f                          // downfall
            ));
        }

        if (event.getCategory() == Biome.Category.FOREST) {

            ResourceLocation id = event.getName();
            if (id == null) return;

            String path = id.getPath();
            String namespace = id.getNamespace();

            // skip mod biomes
            if (namespace.equals(CaioCesarBiomesMod.MOD_ID)) return;
            if (namespace.equals("brbiomesmod")) return;

            // skip ALL birch forest variants
            if (path.contains("birch")) {
                System.out.println("[DEBUG] Skipping Birch Forest: " + id);
                return;
            }

            // If reached, apply override
            System.out.println("[DEBUG] Overriding temperature for: " + id);
            event.setClimate(new Biome.Climate(
                    Biome.RainType.RAIN,
                    0.74f,                          // hardiness zone 7
                    Biome.TemperatureModifier.NONE,
                    0.8f
            ));
        }

        if (event.getCategory() == Biome.Category.DESERT) {

            ResourceLocation id = event.getName();
            if (id == null) return;

            String namespace = id.getNamespace();

            // ⛔ Skip all biomes from your mod
            if (id.getNamespace().equals(CaioCesarBiomesMod.MOD_ID)) {
                System.out.println("[DEBUG] Skipping biomes from the mod: " + id);
                return;
            }

            // 🛑 Skip all biomes from brbiomesmod
            if (namespace.equals("brbiomesmod")) {
                System.out.println("[DEBUG] Skipping biomes from brbiomesmod: " + id);
                return;
            }

            // ✔ Only vanilla (or other-mod) mesa biomes reach this point
            System.out.println("[DEBUG] Overriding temperature for: " + id);

            event.setClimate(new Biome.Climate(
                    Biome.RainType.NONE,          // rain
                    0.89f,                         // new temperature - hardiness zone 10
                    Biome.TemperatureModifier.NONE,
                    0.0f                          // downfall
            ));
        }
    }

    @SubscribeEvent
    public static void onSaplingGrow(SaplingGrowTreeEvent event) {

        IWorld iworld = event.getWorld();
        if (!(iworld instanceof World)) return;

        World world = (World) iworld;
        BlockPos pos = event.getPos();
        BlockState state = event.getWorld().getBlockState(pos);
        Biome biome = world.getBiome(pos);

        float temp = biome.getTemperature();
        Block block = state.getBlock();

        // Spruce & Birch = cold / temperate trees
        if (block == Blocks.SPRUCE_SAPLING || block == Blocks.BIRCH_SAPLING) {
            if (temp >= 0.75F) {
                event.setResult(Event.Result.DENY);
            }
            if (temp < -0.7F) {
                event.setResult(Event.Result.DENY);
            }
        }

        if (block == Blocks.BIRCH_SAPLING) {
            if (temp >= 0.75F) {
                event.setResult(Event.Result.DENY);
            }
            if (temp < 0.2F) {
                event.setResult(Event.Result.DENY);
            }
        }

        // Jungle trees = tropical (> zone 11)
        if (block == Blocks.JUNGLE_SAPLING) {
            if (temp < 0.9F) {
                event.setResult(Event.Result.DENY);
            }
        }

        // Acacia = subtropical (> zone 9)
        if (block == Blocks.ACACIA_SAPLING) {
            if (temp < 0.8F) {
                event.setResult(Event.Result.DENY);
            }
        }

        // Dark Oak = temperate (< zone 10)
        if (block == Blocks.DARK_OAK_SAPLING) {
            if (temp > 0.89F) {
                event.setResult(Event.Result.DENY);
            }
            if (temp <= 0.39F) {
                event.setResult(Event.Result.DENY);
            }
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
