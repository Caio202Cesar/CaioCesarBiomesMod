package com.caiocesarmods.caiocesarbiomes.Climate;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.Mod;

import static com.caiocesarmods.caiocesarbiomes.Climate.ClimateType.MEDITERRANEAN;
import static com.caiocesarmods.caiocesarbiomes.Climate.ClimateType.TROPICAL_SAVANNA;

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
}

    /*public static boolean isRainingAt(World world, BlockPos position) {
        if (!world.isRaining()) return false;
        if (!world.canSeeSky(position)) return false;
        if (world.getHeight(Heightmap.Type.MOTION_BLOCKING, position.getX(), position.getZ()) > position.getY())
            return false;

        Biome biome = world.getBiome(position);
        ClimateType climate = SeasonalWeatherHandler.getBiomeClimate(biome);
        long dayTime = world.getDayTime();
        String season = SeasonalWeatherHandler.getSeason(dayTime);

        if (climate == MEDITERRANEAN) {
            if ("SPRING".equals(season)) {
                return false;
            }
        } else if (climate == TROPICAL_SAVANNA)
            return "SUMMER".equals(season);
        return true;
    }

    public static boolean isThunderingAt(World world, BlockPos position) {
        if (!world.isThundering()) return false;
        if (!world.canSeeSky(position)) return false;
        if (world.getHeight(Heightmap.Type.MOTION_BLOCKING, position.getX(), position.getZ()) > position.getY())
            return false;

        Biome biome = world.getBiome(position);
        ClimateType climate = SeasonalWeatherHandler.getBiomeClimate(biome);
        long dayTime = world.getDayTime();
        String season = SeasonalWeatherHandler.getSeason(dayTime);

        if (climate == TROPICAL_SAVANNA) {
            if ("SUMMER".equals(season)) {
                return true;
            }
        }
        return false;
    }
}*/

