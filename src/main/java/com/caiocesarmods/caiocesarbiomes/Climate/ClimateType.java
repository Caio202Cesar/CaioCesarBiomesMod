package com.caiocesarmods.caiocesarbiomes.Climate;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import static com.caiocesarmods.caiocesarbiomes.Climate.SeasonalWeatherHandler.getBiomeClimate;
import static com.caiocesarmods.caiocesarbiomes.Climate.SeasonalWeatherHandler.getSeason;

public enum ClimateType {
    MEDITERRANEAN, TROPICAL_SAVANNA;

    @SubscribeEvent
    public static void onRenderGameOverlay(RenderGameOverlayEvent.Text event) {
        Minecraft mc = Minecraft.getInstance();
        ClientPlayerEntity player = mc.player;
        if (player == null) return;

        World world = player.world;

        BlockPos pos = player.getPosition();
        Biome biome = world.getBiomeManager().getBiome(pos);
        ClimateType climate = SeasonalWeatherHandler.getBiomeClimate(biome);

        event.getLeft().add("Biome Climate: " + climate);
    }
}

