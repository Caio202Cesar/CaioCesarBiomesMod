package com.caiocesarmods.caiocesarbiomes.item.custom;

import com.caiocesarmods.caiocesarbiomes.World.HardinessZones;
import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ScannerHandler {

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {

        PlayerEntity player = event.player;
        World world = player.world;

        // Run only on the SERVER
        if (world.isRemote) return;

        // Must be sneaking
        if (!player.isSneaking()) return;

        // Must be holding the scanner item
        ItemStack held = player.getHeldItemMainhand();
        if (held.isEmpty() || held.getItem() != ModItems.HARDINESS_ZONE_SCANNER.get())
            return;

        // Perform raytrace
        RayTraceResult result = player.pick(5.0D, 0.0F, false);  // 5 block reach
        if (result.getType() != RayTraceResult.Type.BLOCK)
            return;

        BlockRayTraceResult blockHit = (BlockRayTraceResult) result;
        BlockPos pos = blockHit.getPos();
        BlockState state = world.getBlockState(pos);

        // Check if block is a sapling
        if (!(state.getBlock() instanceof SaplingBlock))
            return;

        // Get block ID
        ResourceLocation saplingID = state.getBlock().getRegistryName();
        if (saplingID == null) return;

        // Get the sapling's hardiness zone
        String zone = HardinessZones.getZoneForSapling(saplingID);

        // Prevent message spam — only send every 10 ticks (½ second)
        if (player.ticksExisted % 10 == 0) {
            player.sendMessage(
                    new StringTextComponent("Hardiness Zone for this sapling: " + zone),
                    player.getUniqueID()
            );
        }
    }
}









