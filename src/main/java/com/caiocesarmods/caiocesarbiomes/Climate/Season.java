package com.caiocesarmods.caiocesarbiomes.Climate;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import static com.caiocesarmods.caiocesarbiomes.Climate.SeasonalWeatherHandler.getSeason;

public enum Season {
    SPRING, SUMMER, AUTUMN, WINTER;

    /*public static Season getCurrentSeason(long dayTime) {
        int seasonLength = 30 * 24000;
        int seasonIndex = (int)((dayTime / seasonLength) % 4);
        return Season.values()
                [seasonIndex];
    }*/

    @SubscribeEvent
    public static void onRenderGameOverlay(RenderGameOverlayEvent.Text event) {
        Minecraft mc = Minecraft.getInstance();
        ClientPlayerEntity player = mc.player;
        if (player == null) return;

        World world = player.world;

        String season = getSeason(world.getDayTime());

        mc.fontRenderer.drawString(event.getMatrixStack(), "Season: " + season, 10, 10, 0xFFFFFF);
    }
}
