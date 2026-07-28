package com.caiocesarmods.caiocesarbiomes.Util;

import com.caiocesarmods.caiocesarbiomes.Seasons.Season;
import com.caiocesarmods.caiocesarbiomes.Seasons.SeasonalPhase;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class BiomeHUDHandler {
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

        SummerTemperatureBuilder summerTemperature = (SummerTemperatureBuilder) (Object) biome;
        SummerHeat summerHeat = summerTemperature.getSummerHeat(pos);

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
        y += lineHeight;

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
