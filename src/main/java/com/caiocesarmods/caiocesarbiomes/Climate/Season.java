package com.caiocesarmods.caiocesarbiomes.Climate;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public enum Season {
    SPRING, SUMMER, AUTUMN, WINTER;

    public static String getSeason(long dayTime) {
        long days = dayTime / 24000; // Convert ticks to days
        long cycle = days % 40; // Assume a full year is 40 days (10 per season)

        if (cycle < 10) {
            return "SPRING";
        } else if (cycle < 20) {
            return "SUMMER";
        } else if (cycle < 30) {
            return "FALL";
        } else {
            return "WINTER";
        }
    }

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
