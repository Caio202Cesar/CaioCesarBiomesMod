package com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate;

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

        if (baseTemp <= 0.14f) return 0; //Always snow
        if (baseTemp <= 0.19f) return 1; //Tundra zone
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
        SAPLING_ZONES.put(new ResourceLocation("minecraft", "birch_sapling"), "HZ(min) 2, HZ(max) 7");
        SAPLING_ZONES.put(new ResourceLocation("minecraft", "spruce_sapling"), "HZ(min) 0 (-0.7f), HZ(max) 7");
        SAPLING_ZONES.put(new ResourceLocation("minecraft", "jungle_sapling"), "HZ(min) 11");
        SAPLING_ZONES.put(new ResourceLocation("minecraft", "acacia_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("minecraft", "dark_oak_sapling"), "HZ(min) 4, HZ(max) 10");


        // CAIO CESAR BIOMES MOD
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "almond_sapling"), "HZ(min) 5, HZ(max) 10" +
                "⚠ requires dry biomes to thrive");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "aspen_sapling"), "HZ(min) 7, HZ(max) 7");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "acerola_sapling"), "HZ(min) 9;" +
                "⚠ can be grown in colder biomes if under a 5x5 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "avocado_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "bald_cypress_sapling"), "HZ(min) 4, HZ(max) 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "banana_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "bismarck_palm_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "black_poplar_sapling"), "HZ(min) 3, HZ(max) 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "blue_spruce_sapling"), "HZ(min) 2, HZ(max) 7");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "breadfruit_sapling"), "HZ(min) 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "buddha_hand_sapling"), "HZ(min) 10;" +
                "⚠ can be grown in colder biomes if under a 5x5 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "bunya_pine_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "camellia_sapling"), "HZ(min) 7, HZ(max) 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "canary_date_sapling"), "HZ(min) 9, HZ(max) 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "canary_pine_sapling"), "HZ(min) 9, HZ(max) 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "carob_sapling"), "HZ(min) 9, HZ(max) 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "casuarina_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "cherry_plum_sapling"), "HZ(min) 5, HZ(max) 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "chinese_red_pine_sapling"), "HZ(min) 7, HZ(max) 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "citron_sapling"), "HZ(min) 10;" +
                "⚠ can be grown in colder biomes if under a 5x5 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "coast_cottonwood_sapling"), "HZ(min) 10;" +
                        "⚠ can be grown in colder biomes if under a 5x5 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "coconut_sapling"), "HZ(min) 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "cook_pine_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "cooper_beech_sapling"), "HZ(min) 4, HZ(max) 8");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "cork_oak_sapling"), "HZ(min) 8, HZ(max) 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "oleander_dark_pink_sapling"), "HZ(min) 8;" +
                "⚠ can be grown in colder biomes if under a 5x5 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "date_sapling"), "HZ(min) 8");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "douglas_fir_sapling"), "HZ(min) 4, HZ(max) 6");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "dragon_blood_sapling"), "HZ(min) 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "durian_sapling"), "HZ(min) 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "elderberry_sapling"), "HZ(min) 3, HZ(max) 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "eucalyptus_sapling"), "HZ(min) 8");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "fig_sapling"), "HZ(min) 8, HZ(max) 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "fremont_poplar_sapling"), "HZ(min) 4, HZ(max) 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "ginkgo_sapling"), "HZ(min) 3, HZ(max) 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "grapefruit_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "hawthorn_sapling"), "HZ(min) 4, HZ(max) 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "hazelnut_sapling"), "HZ(min) 4, HZ(max) 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "holly_sapling"), "HZ(min) 6, HZ(max) 10;" +
                "⚠ requires warm to cooler summers");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "holm_oak_sapling"), "HZ(min) 7, HZ(max) 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "indian_coral_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "indian_laurel_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "italian_cypress_sapling"), "HZ(min) 7");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "jackalberry_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "japanese_maple_sapling"), "HZ(min) 5, HZ(max) 10;" +
                "⚠ saplings die when not under a canopy in hot summers");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "japanese_pine_sapling"), "HZ(min) 5, HZ(max) 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "larch_sapling"), "HZ(min) 0 (-0.7f), HZ(max) 5");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "lemon_sapling"), "HZ(min) 9;" +
                "⚠ can be grown in colder biomes if under a 7x7 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "live_oak_sapling"), "HZ(min) 8, HZ(max) 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "loblolly_pine_sapling"), "HZ(min) 6, HZ(max) 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "loquat_sapling"), "HZ(min) 7*, HZ(max) 11; " +
                "⚠ due to cold winter bloom loss, only fruits from zone 9 to 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "mandarin_sapling"), "HZ(min) 9, HZ(max) 10;" +
                "⚠ can be grown in colder biomes if under a 5x5 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "mango_sapling"), "HZ(min) 10; ⚠ requires hot summers");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "marula_sapling"), "HZ(min) 10; ⚠ requires hot summers");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "mesquite_sapling"), "HZ(min) 7");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "monkey_puzzle_sapling"), "HZ(min) 7, HZ(max) 10;" +
                "⚠ requires warm to cooler summers");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "mossed_live_oak_sapling"), "HZ(min) 8, HZ(max) 11" +
                "⚠ Can't be grow in dry biomes");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "mountain_hemlock_sapling"), "HZ(min) 2, HZ(max) 8" +
                "⚠ requires cooler summers");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "mugo_pine_sapling"), "HZ(min) 2, HZ(max) 7" +
                "⚠ requires warm to cooler summers, ⚠ Requires downfall 0.5F or lower");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "mulberry_sapling"), "HZ(min) 5");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "norfolk_pine_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "ocotea_sapling"), "HZ(min) 9, HZ(max) 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "oil_palm_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "olive_sapling"), "HZ(min) 8, HZ(max) 11;" +
                "⚠ Can't fruit in tropical climates (zone 11)");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "orange_oleander_sapling"), "HZ(min) 9; " +
                "⚠ can be grown in colder biomes if under a 5x5 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "plumeria_orange_sapling"), "HZ(min) 10; " +
                "⚠ can be grown in colder biomes if under a 7x7 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "orange_sapling"), "HZ(min) 9; " +
                "⚠ can be grown in colder biomes if under a 5x5 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "orchid_tree_sapling"), "HZ(min) 9; " +
                "⚠ can be grown in colder biomes if under a 5x5 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "peach_sapling"), "HZ(min) 4, HZ(max) 10;" +
                "⚠ requires hot summers");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "pecan_sapling"), "HZ(min) 5, HZ(max) 10; " +
                "⚠ requires downfall 0.8F or lower; ⚠ requires hot summers for fruiting");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "persimmon_sapling"), "HZ(min) 4, HZ(max) 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "crabapple_pink_sapling"), "HZ(min) 4, HZ(max) 8");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "crape_myrtle_pink_sapling"), "HZ(min) 7");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "pink_ivory_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "oleander_pink_sapling"), "HZ(min) 8; " +
                "⚠ can be grown in colder biomes if under a 5x5 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "plumeria_pink_sapling"), "HZ(min) 10; " +
                "⚠ can be grown in colder biomes if under a 7x7 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "pinyon_sapling"), "HZ(min) 4, HZ(max) 9*;" +
                "⚠ Can't be grow in wet biomes");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "pistachio_sapling"), "HZ(min) 7, HZ(max) 11; " +
                "⚠ requires dry biomes and downfall of 0.39F or lower to thrive;" +
                "⚠ requires hot summers and hardiness zone bellow 8 to fruit;");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "plane_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "pohutukawa_sapling"), "HZ(min) 9, HZ(max) 11;" +
                "⚠ Don't flower plenty in tropical climates.");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "pomegranate_sapling"), "HZ(min) 7; " +
                "⚠ can be grown in colder biomes if under a 5x5 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "ponderosa_pine_sapling"), "HZ(min) 3, HZ(max) 8; " +
                "⚠ max downfall: 0.55F");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "crape_myrtle_purple_sapling"), "HZ(min) 7");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "crabapple_red_sapling"), "HZ(min) 4, HZ(max) 8");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "crape_myrtle_red_sapling"), "HZ(min) 7");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "red_kapok_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "red_maple_sapling"), "HZ(min) 3, HZ(max) 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "red_oak_sapling"), "HZ(min) 3, HZ(max) 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "plumeria_red_sapling"), "HZ(min) 10;" +
                "⚠ can be grown in colder biomes if under a 7x7 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "rowan_sapling"), "HZ(min) 3, HZ(max) 7;" +
                "⚠ requires warm to cooler summers");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "royal_poinciana_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "rubber_tree_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "sabal_sapling"), "HZ(min) 8;" +
                "⚠ can be grown in colder biomes if under a 5x5 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "sausage_tree_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "slash_pine_sapling"), "HZ(min) 7, HZ(max) 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "socotra_cucumber_sapling"), "HZ(min) 9;" +
                "⚠ requires dry biomes");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "socotra_desert_rose_sapling"), "HZ(min) 10;" +
        "⚠ can be grown in colder biomes if under a 9x9 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "southern_beech_sapling"), "HZ(min) 7, HZ(max) 9;" +
        "⚠ requires warm to cooler summers and wet biomes");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "southern_magnolia_sapling"), "HZ(min) 6, HZ(max) 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "southern_wax_myrtle_sapling"), "HZ(min) 7, HZ(max) 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "starfruit_sapling"), "HZ(min) 9;" +
        "⚠ can be grown in colder biomes if under a 5x5 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "stone_pine_sapling"), "HZ(min) 8, HZ(max) 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "strawberry_tree_sapling"), "HZ(min) 7, HZ(max) 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "subalpine_fir_sapling"), "HZ(min) 2, HZ(max) 8" +
                "⚠ requires cooler summers");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "sweet_chestnut_sapling"), "HZ(min) 5, HZ(max) 10" +
                "⚠ requires warm summers");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "sycamore_fig_sapling"), "HZ(min) 10;" +
        "⚠ can be grown in colder biomes if under a 5x5 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "tahiti_lime_sapling"), "HZ(min) 9;" +
                "⚠ can be grown in colder biomes if under a 7x7 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "tamarind_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "teak_sapling"), "HZ(min) 11");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "tea_sapling"), "HZ(min) 7, HZ(max) 10;" +
                "⚠ can be grown in colder biomes if under a 3x3 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "tropical_almond_sapling"), "HZ(min) 10;" +
                "⚠ requires hot summers");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "walnut_sapling"), "HZ(min) 5, HZ(max) 9");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "weeping_fig_sapling"), "HZ(min) 10;" +
                "⚠ 1x1 sapling can be grown in colder biomes if under a 5x5 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "weeping_willow_sapling"), "HZ(min) 2, HZ(max) 10;" +
                "⚠ needs to be planted near the water");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "western_hemlock_sapling"), "HZ(min) 6, HZ(max) 9;" +
                "⚠ requires warm to cooler summers, rainy biome, downfall from 6 to above");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "crabapple_white_sapling"), "HZ(min) 4, HZ(max) 8");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "crape_myrtle_white_sapling"), "HZ(min) 7");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "white_fir_sapling"), "HZ(min) 3, HZ(max) 8; " +
                "⚠ requires warm to cooler summers along with max downfall of 0.55F");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "oleander_white_sapling"), "HZ(min) 8; " +
                "⚠ can be grown in colder biomes if under a 5x5 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "plumeria_white_sapling"), "HZ(min) 10;" +
                "⚠ can be grown in colder biomes if under a 7x7 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "yellow_oleander_sapling"), "HZ(min) 9; " +
                "⚠ can be grown in colder biomes if under a 5x5 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "plumeria_yellow_sapling"), "HZ(min) 10;" +
                "⚠ can be grown in colder biomes if under a 7x7 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("caiocesarbiomes", "yew_sapling"), "HZ(min) 5, HZ(max) 9;" +
                "⚠ requires warm summers");

        // OTHER MODS
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "acai_sapling"), "HZ(min) 11; " +
                "⚠ can be grown in colder biomes if under a 7x7 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "algarrobillo_sapling"), "HZ(min) 9, HZ(max) 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "apricot_ipe_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "bacuri_sapling"), "HZ(min) 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "balsa_sapling"), "HZ(min) 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "black_jurema_sapling"), "HZ(min) 9;" +
                "⚠ requires downfall of 0.55F or lower to grow");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "black_sucupira_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "brazillian_pepper_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "brazillian_rosewood_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "brazillian_sassafras_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "brazilnut_sapling"), "HZ(min) 12");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "brazilwood_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "brazillian_sassafras_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "buriti_sapling"), "HZ(min) 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "cagaita_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "cambuci_sapling"), "HZ(min) 10, HZ(max) 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "camu_camu_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "carnauba_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "cashew_sapling"), "HZ(min) 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "caven_thorn_sapling"), "HZ(min) 8, HZ(max) 11;" +
                "⚠ requires downfall of 0.55F or lower to grow");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "cecropia_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "cockspur_coral_sapling"), "HZ(min) 9, HZ(max) 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "cupuacu_sapling"),
                "HZ(min) 11; ⚠ can be grown in colder biomes if under a 5x5 glass roof"); //Only small trees and bushes can be grown in greenhouses
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "feijoa_sapling"),
                "HZ(min) 8, HZ(max) 11; ⚠ requires warm summers");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "guapuruvu_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "guarana_sapling"),
                "HZ(min) 11; ⚠ can be grown in colder biomes if under a 5x5 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "humboldt_willow_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "imbuia_sapling"),
                "HZ(min) 9*, HZ(max) 10; ⚠ can only be grown under other tree's canopies;" +
                        "⚠ literally dies in zone 9 winter if not under a canopy;" +
                        "⚠ cannot grow in dry biomes");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "jabuticaba_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "jelly_palm_sapling"), "HZ(min) 8");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "jenipapo_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "jequitiba_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "jua_sapling"), "HZ(min) 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "jussara_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "kapok_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "lophantera_sapling"),
                "HZ(min) 11; ⚠ can be grown in colder biomes if under a 5x5 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "manaca_da_serra_sapling"), "HZ(min) 9, HZ(max) 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "mangaba_sapling"), "HZ(min) 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "monkey_cajarana_sapling"),
                "HZ(min) 11; ⚠ can be grown in colder biomes if under a 5x5 glass roof");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "parana_pine_sapling"), "HZ(min) 8, HZ(max) 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "pequi_sapling"), "HZ(min) 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "peruvian_pepper_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "pink_ipe_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "pink_peroba_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "silk_floss_pink_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "pitanga_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "purpleheart_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "purple_ipe_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "queen_palm_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "rio_grande_cherry_sapling"), "HZ(min) 9, HZ(max) 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "sandbox_tree_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "sapucaia_sapling"), "HZ(min) 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "sharinga_sapling"), "HZ(min) 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "cecropia_silver_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "silver_pepper_sapling"), "HZ(min) 9, HZ(max) 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "sombreiro_sapling"), "HZ(min) 9, HZ(max) 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "umbu_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "white_ipe_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "silk_floss_white_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "wolf_apple_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "xaxim_sapling"), "HZ(min) 9, HZ(max) 11");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "yellow_ipe_sapling"), "HZ(min) 9");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "yellow_mombin_sapling"), "HZ(min) 10");
        SAPLING_ZONES.put(new ResourceLocation("brbiomesmod", "yerba_mate_sapling"), "HZ(min) 9, HZ(max) 11;" +
                "⚠ saplings die when not under a canopy in hot summers");

    }


    public static String getZoneForSapling(ResourceLocation id) {
        return SAPLING_ZONES.getOrDefault(id, "Unknown Zone");
    }

}
