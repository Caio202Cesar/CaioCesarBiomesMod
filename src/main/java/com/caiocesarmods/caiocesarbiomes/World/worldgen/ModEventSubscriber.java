package com.caiocesarmods.caiocesarbiomes.World.worldgen;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.Seasons.Season;
import com.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import com.caiocesarmods.caiocesarbiomes.item.CompostablesRegistry;
import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.block.ComposterBlock;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = CaioCesarBiomesMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEventSubscriber {

    @SubscribeEvent
    public static void onRenderGameOverlay(RenderGameOverlayEvent.Text event) {
        Season.onRenderGameOverlay(event);
    }

    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            CompostablesRegistry.addCompostable(0.5f, ModItems.ARBUTUS.get());

        });
    }

}
