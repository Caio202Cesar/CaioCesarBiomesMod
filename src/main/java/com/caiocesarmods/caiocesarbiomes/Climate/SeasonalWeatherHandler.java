package com.caiocesarmods.caiocesarbiomes.Climate;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.lang.reflect.Field;
import java.util.*;

import static com.caiocesarmods.caiocesarbiomes.Climate.ClimateType.MEDITERRANEAN;

@Mod.EventBusSubscriber
public class SeasonalWeatherHandler {

    public static ClimateType getBiomeClimate(Biome biome) {
        if (biome == null) {
            CaioCesarBiomesMod.LOGGER.warn("getBiomeClimate: Biome is NULL!");
            return null;
        }

        ResourceLocation biomeID = biome.getRegistryName();
        CaioCesarBiomesMod.LOGGER.info("getBiomeClimate: Checking biome " + biomeID);

        // Check if this biome matches Olive Grove
        ResourceLocation oliveGroveID = OliveGroveBiome.OLIVE_GROVE.get().getRegistryName();
        CaioCesarBiomesMod.LOGGER.info("getBiomeClimate: Olive Grove ID = " + oliveGroveID);

        ResourceLocation mediterraneanConiferSavannaID = MediterraneanConiferSavannaBiome.MEDITERRANEAN_CONIFER_SAVANNA.get().getRegistryName();
        CaioCesarBiomesMod.LOGGER.info("getBiomeClimate: Mediterranean Conifer Savanna ID = " + mediterraneanConiferSavannaID);

        if (biomeID.equals(oliveGroveID)) {
            return ClimateType.MEDITERRANEAN;
        } else if (biomeID.equals(mediterraneanConiferSavannaID)) {
            return ClimateType.MEDITERRANEAN;
        }

        return null;
    }

    /*private static boolean shouldDisableRain(Season season, ClimateType climate) {
        return (climate == MEDITERRANEAN && season == Season.SPRING) ||
                (climate == ClimateType.TROPICAL_SAVANNA && season == Season.WINTER);
    }

    private static void enableRain(World world, Biome biome) {
        if (!world.isRaining()) return;

        System.out.println("Enabling rain in Mediterranean biome for WINTER and other seasons.");
        ((ServerWorld) world).setWeather(24000, 6000, true, false);}*/ // Set rain for a duration


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

    /*private static boolean isMediterraneanBiome(Object biome) {
        return MEDITERRANEAN_BIOMES.contains(biome);
    }

    private static final Set<ResourceLocation> MEDITERRANEAN_BIOMES = new HashSet<>(Arrays.asList(
            new ResourceLocation("caiocesarbiomes:olive_grove"),
            new ResourceLocation("caiocesarbiomes:subtropical_eucalyptus_dry_forest"),
            new ResourceLocation("caiocesarbiomes:mediterranean_conifer_savanna")
    ));

    /*private static void applyMediterraneanWeather(ServerWorld world, Biome biome, Season season) {
        if (season == Season.SUMMER) {
            world.setWeather(0, 6000, false, false); //No rain

        } else {
            world.setWeather(12000, 0, true, false); //Normal rain
        }*/
}
