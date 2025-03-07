package com.caiocesarmods.caiocesarbiomes.Seasons;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;

public enum Season {
    SPRING, SUMMER, AUTUMN, WINTER;

    public static String getSeason(long dayTime, World world) {
        if (ModList.get().isLoaded("sereneseasons")) {
            long days = dayTime / 24000; // Convert ticks to days
            long cycle = days % 96; // Assume a full year is 96 days (24 per season)

            if (cycle < 24) {
                return "SPRING";
            } else if (cycle < 48) {
                return "SUMMER";
            } else if (cycle < 72) {
                return "FALL";
            } else {
                return "WINTER";
            }
        } else if (ModList.get().isLoaded("simplyseasons")) {
            //duração de cada estação em SimplySeasons
            long days = dayTime / 24000; // Convert ticks to days
            long cycle = days % 96; // Assume a full year is 96 days (24 per season)

            if (cycle < 24) {
                return "SPRING";
            } else if (cycle < 48) {
                return "SUMMER";
            } else if (cycle < 72) {
                return "FALL";
            } else {
                return "WINTER";
            }

        } else {
            long days = dayTime / 24000; // Convert ticks to days
            long cycle = days % 96; // Assume a full year is 120 days (30 per season)

            if (cycle < 30) {
                return "SPRING";
            } else if (cycle < 60) {
                return "SUMMER";
            } else if (cycle < 90) {
                return "FALL";
            } else {
                return "WINTER";
            }
        }
    }

    @SubscribeEvent
    public static void onRenderGameOverlay(RenderGameOverlayEvent.Text event) {
        Minecraft mc = Minecraft.getInstance();
        ClientPlayerEntity player = mc.player;
        if (player == null) return;
        World world = player.world;
        long dayTime = world.getDayTime();

        String season = getSeason(dayTime, world);

        mc.fontRenderer.drawString(event.getMatrixStack(), "Season: " + season, 10, 10, 0xFFFFFF);
    }
}

