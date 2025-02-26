package com.caiocesarmods.caiocesarbiomes.World.worldgen;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.Climate.ClimateType;
import com.caiocesarmods.caiocesarbiomes.Climate.Season;
import com.caiocesarmods.caiocesarbiomes.Climate.SeasonalWeatherHandler;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CaioCesarBiomesMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEventSubscriber {

    @SubscribeEvent
    public static void onRenderGameOverlay(RenderGameOverlayEvent.Text event) {
        Season.onRenderGameOverlay(event);
        ClimateType.onRenderGameOverlay(event);
    }
}
