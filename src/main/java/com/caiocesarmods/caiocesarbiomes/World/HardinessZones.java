package com.caiocesarmods.caiocesarbiomes.World;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

import java.util.HashMap;
import java.util.Map;

public class HardinessZones {
    public static int getZone(World world, BlockPos pos) {
        Biome biome = world.getBiome(pos);
        float baseTemp = biome.getTemperature(pos);

        if (baseTemp < 0.0f) return 0; //Subzero zone
        if (baseTemp < 0.16f) return 1; //Always snow
        if (baseTemp < 0.3f) return 2; //Border taiga
        if (baseTemp < 0.4f) return 3; //Taiga
        if (baseTemp < 0.5f) return 4; //Border continental temperate
        if (baseTemp < 0.6f) return 5; //Continental temperate
        if (baseTemp < 0.7f) return 6; //Continental temperate
        if (baseTemp < 0.75f) return 7; //Temperate
        if (baseTemp < 0.8f) return 8; //Temperate
        if (baseTemp < 0.85f) return 9; //Border subtropical
        if (baseTemp < 0.9f) return 10; //Subtropical
        if (baseTemp < 0.95f) return 11; //Border tropical
        return 12; //Tropical
    }

    private static final Map<ResourceLocation, String> SAPLING_ZONES = new HashMap<>();

    static {
        // VANILLA
        SAPLING_ZONES.put(new ResourceLocation("minecraft", "birch_sapling"), "min 3, max 8");
        SAPLING_ZONES.put(new ResourceLocation("minecraft", "spruce_sapling"), "min 2, max 8");
        SAPLING_ZONES.put(new ResourceLocation("minecraft", "jungle_sapling"), "min 11");
        SAPLING_ZONES.put(new ResourceLocation("minecraft", "acacia_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("minecraft", "dark_oak_sapling"), "min 4, max 10");

        // CAIO CESAR BIOMES MOD
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "almond_sapling"), "min 5, max 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "aspen_sapling"), "min 7, max 7");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "avocado_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "bald_cypress_sapling"), "min 4, max 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "banana_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "bismarck_palm_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "black_poplar_sapling"), "min 3, max 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "blue_spruce_sapling"), "min 2, max 7");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "breadfruit_sapling"), "min 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "buddha_hand_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "bunya_pine_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "camellia_sapling"), "min 7, max 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "canary_date_sapling"), "min 9, max 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "canary_pine_sapling"), "min 9, max 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "carob_sapling"), "min 9, max 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "casuarina_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "cherry_plum_sapling"), "min 5, max 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "chinese_red_pine_sapling"), "min 7, max 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "citron_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "coast_cottonwood_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "coconut_sapling"), "min 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "cook_pine_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "cooper_beech_sapling"), "min 4, max 7");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "cork_oak_sapling"), "min 8, max 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "oleander_dark_pink_sapling"), "min 8");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "date_sapling"), "min 8");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "douglas_fir_sapling"), "min 4, max 6");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "dragon_blood_sapling"), "min 11");

        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "marula_sapling"), "min 10");

        // OTHER MODS
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "acai_sapling"), "min 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "algarrobillo_sapling"), "min 9, max 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "apricot_ipe_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "bacuri_sapling"), "min 12");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "balsa_sapling"), "min 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "black_jurema_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "black_sucupira_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "brazillian_pepper_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "brazillian_rosewood_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "brazillian_sassafras_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "brazilnut_sapling"), "min 12");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "brazilwood_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "brazillian_sassafras_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "buriti_sapling"), "min 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "cagaita_sapling"), "min 9");

        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "jabuticaba_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "sapucaia_sapling"), "min 10");
    }

    public static String getZoneForSapling(ResourceLocation id) {
        return SAPLING_ZONES.getOrDefault(id, "Unknown Zone");
    }

}
