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

        if (baseTemp <= -0.0f) return 0; //Subzero zone
        if (baseTemp <= 0.15f) return 1; //Always snow
        if (baseTemp <= 0.29f) return 2; //Border taiga
        if (baseTemp <= 0.39f) return 3; //Taiga
        if (baseTemp <= 0.49f) return 4; //Border continental temperate
        if (baseTemp <= 0.59f) return 5; //Continental temperate
        if (baseTemp <= 0.69f) return 6; //Continental temperate
        if (baseTemp <= 0.74f) return 7; //Colder Temperate
        if (baseTemp <= 0.79f) return 8; //Warmer Temperate
        if (baseTemp <= 0.84f) return 9; //Colder subtropical
        if (baseTemp <= 0.89f) return 10; //Warmer Subtropical
        if (baseTemp <= 0.94f) return 11; //Border tropical
        return 12; //Tropical
    }

    private static final Map<ResourceLocation, String> SAPLING_ZONES = new HashMap<>();

    static {
        // VANILLA
        SAPLING_ZONES.put(new ResourceLocation("minecraft", "birch_sapling"), "min 2, max 7");
        SAPLING_ZONES.put(new ResourceLocation("minecraft", "spruce_sapling"), "min 0 (-0.7f), max 7");
        SAPLING_ZONES.put(new ResourceLocation("minecraft", "jungle_sapling"), "min 11");
        SAPLING_ZONES.put(new ResourceLocation("minecraft", "acacia_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("minecraft", "dark_oak_sapling"), "min 4, max 10");

        // CAIO CESAR BIOMES MOD
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "almond_sapling"), "min 5, max 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "aspen_sapling"), "min 7, max 7");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "acerola_sapling"), "min 9");
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
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "cherry_plum_sapling"), "min 5, max 10");
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
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "durian_sapling"), "min 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "elderberry_sapling"), "min 3, max 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "eucalyptus_sapling"), "min 8");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "fig_sapling"), "min 8, max 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "fremont_poplar_sapling"), "min 2, max 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "ginkgo_sapling"), "min 3, max 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "grapefruit_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "hawthorn_sapling"), "min 4, max 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "hazelnut_sapling"), "min 4, max 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "holly_sapling"),
                "min 6, max 10; ⚠ requires warm to cooler summers");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "holm_oak_sapling"), "min 7, max 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "indian_coral_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "indian_laurel_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "italian_cypress_sapling"), "min 7");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "jackalberry_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "japanese_maple_sapling"),
                "min 5, max 10; ⚠ saplings die when not under a canopy in hot summers");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "japanese_pine_sapling"), "min 5, max 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "larch_sapling"), "min 0 (-0.7f), max 5");


        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "mandarin_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "mango_sapling"), "min 10; ⚠ requires hot summers");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "marula_sapling"), "min 10; ⚠ requires hot summers");

        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "red_kapok_sapling"), "min 9");

        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "royal_poinciana_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "rubber_tree_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "sabal_sapling"), "min 8");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "sausage_tree_sapling"), "min 10");

        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "sycamore_fig_sapling"), "min 10");


        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "plumeria_pink_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "plumeria_red_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "plumeria_yellow_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "plumeria_white_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "plumeria_orange_sapling"), "min 10");

        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "tamarind_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "teak_sapling"), "min 11");

        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "weeping_fig_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "weeping_willow_sapling"), "min 4, max 10");


        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "yew_sapling"), "min 4, max 10");

        // OTHER MODS
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "acai_sapling"), "min 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "algarrobillo_sapling"), "min 9, max 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "apricot_ipe_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "bacuri_sapling"), "min 11");
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
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "cambuci_sapling"), "min 10, max 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "camu_camu_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "carnauba_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "cashew_sapling"), "min 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "caven_thorn_sapling"), "min 8, max 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "cecropia_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "cockspur_coral_sapling"), "min 9, max 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "cupuacu_sapling"),
                "min 11; ⚠ can be grown in colder biomes if under a 5x5 glass roof"); //Only small trees and bushes can be grown in greenhouses
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "feijoa_sapling"),
                "min 8, max 11; ⚠ requires warm summers");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "guapuruvu_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "guarana_sapling"),
                "min 11; ⚠ can be grown in colder biomes if under a 5x5 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "humboldt_willow_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "imbuia_sapling"),
                "min 9*, max 10; ⚠ dies in zone 9 winter if not under a canopy; ⚠ Cannot grow in dry biomes");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "jabuticaba_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "jelly_palm_sapling"), "min 8");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "jenipapo_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "jequitiba_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "jua_sapling"), "min 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "jussara_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "kapok_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "lophantera_sapling"),
                "min 11; ⚠ can be grown in colder biomes if under a 5x5 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "manaca_da_serra_sapling"), "min 9, max 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "mangaba_sapling"), "min 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "monkey_cajarana_sapling"),
                "min 11; ⚠ can be grown in colder biomes if under a 5x5 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "parana_pine_sapling"), "min 8, max 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "pequi_sapling"), "min 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "peruvian_pepper_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "pink_ipe_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "pink_peroba_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "silk_floss_pink_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "pitanga_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "purpleheart_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "purple_ipe_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "queen_palm_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "rio_grande_cherry_sapling"), "min 9, max 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "sandbox_tree_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "sapucaia_sapling"), "min 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "sharinga_sapling"), "min 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "cecropia_silver_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "silver_pepper_sapling"), "min 9, max 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "sombreiro_sapling"), "min 9, max 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "umbu_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "white_ipe_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "silk_floss_white_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "wolf_apple_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "xaxim_sapling"), "min 9, max 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "yellow_ipe_sapling"), "min 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "yellow_mombin_sapling"), "min 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "yerba_mate_sapling"),
                "min 9, max 11; ⚠ saplings die when not under a canopy in hot summers");

    }

    public static String getZoneForSapling(ResourceLocation id) {
        return SAPLING_ZONES.getOrDefault(id, "Unknown Zone");
    }

}
