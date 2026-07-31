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
    SPRING,
    SUMMER,
    FALL,
    WINTER;

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
}

