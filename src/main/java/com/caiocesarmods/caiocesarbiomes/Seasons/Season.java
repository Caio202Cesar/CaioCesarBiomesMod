package com.caiocesarmods.caiocesarbiomes.Seasons;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;

public enum Season {
    SPRING, SUMMER, FALL, WINTER;

    public static String getSeason(long dayTime) {
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
    }

    @SubscribeEvent
    public static void onRenderGameOverlay(RenderGameOverlayEvent.Text event) {
        Minecraft mc = Minecraft.getInstance();
        ClientPlayerEntity player = mc.player;

        if (player == null) return;

        World world = player.world;
        long dayTime = world.getDayTime();

        BlockPos pos = player.getPosition();
        Biome biome = world.getBiome(pos);

        String season = Season.getSeason(dayTime);
        String subSeason = String.valueOf(SeasonalPhase.getPhase(dayTime)); // if you create this
        String biomeName = new TranslationTextComponent(
                "biome." + biome.getRegistryName().getNamespace() + "." + biome.getRegistryName().getPath()
        ).getString();

        int zone = HardinessZones.getZone(world, pos);
        SummerHeat summerHeat = SummerHeatRegistry.get(world, pos);
        ClimateDomain climate = ClimateDomainRegistry.get(world, pos);

        float baseTemp = biome.getTemperature(pos);
        float downfall = biome.getDownfall();

        int y = 10;
        int lineHeight = 12;

        drawText(mc, event, "Season: " + season, 10, y);
        y += lineHeight;

        drawText(mc, event, "Phase: " + subSeason, 10, y);
        y += lineHeight;

        drawText(mc, event, "Biome: " + biomeName, 10, y);

        drawText(mc, event, "Hardiness Zone: " + zone, 10, y);
        y += lineHeight;

        drawText(mc, event, "Summer Heat: " + summerHeat, 10, y);
        y += lineHeight;

        drawText(mc, event, "Climate: " + climate, 10, y);
        y += lineHeight;

        drawText(mc, event, String.format("Biome Base Temperature: %.2f", baseTemp), 10, y);
        y += lineHeight;

        drawText(mc, event, String.format("Downfall: %.2f", downfall), 10, y);
        y += lineHeight;

        drawText(mc, event, "Day: " + (dayTime / 24000), 10, y);
    }


    private static void drawText(Minecraft mc, RenderGameOverlayEvent.Text event, String text, int x, int y) {
        mc.fontRenderer.drawString(
                event.getMatrixStack(),
                text,
                x,
                y,
                0xFFFFFF
        );
    }
}

