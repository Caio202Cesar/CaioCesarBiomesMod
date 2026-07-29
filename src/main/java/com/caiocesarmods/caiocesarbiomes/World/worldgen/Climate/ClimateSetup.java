package com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate;

import net.minecraft.util.ResourceLocation;

public class ClimateSetup {
    public static void register() {

            /// Minecraft Vanilla
            ClimateDomainRegistry.register("minecraft:warm_ocean", ClimateDomain.WARM_OCEAN);
            ClimateDomainRegistry.register("minecraft:deep_warm_ocean", ClimateDomain.WARM_OCEAN);

            ClimateDomainRegistry.register("minecraft:lukewarm_ocean", ClimateDomain.LUKEWARM_OCEAN);
            ClimateDomainRegistry.register("minecraft:deep_lukewarm_ocean", ClimateDomain.WARM_OCEAN);

            ClimateDomainRegistry.register("minecraft:ocean", ClimateDomain.OCEAN);
            ClimateDomainRegistry.register("minecraft:deep_ocean", ClimateDomain.OCEAN);

            ClimateDomainRegistry.register("minecraft:cold_ocean", ClimateDomain.COLD_OCEAN);
            ClimateDomainRegistry.register("minecraft:deep_cold_ocean", ClimateDomain.COLD_OCEAN);

            ClimateDomainRegistry.register("minecraft:frozen_ocean", ClimateDomain.ICY_OCEAN);
            ClimateDomainRegistry.register("minecraft:deep_frozen_ocean", ClimateDomain.ICY_OCEAN);

            ClimateDomainRegistry.register("minecraft:frozen_river", ClimateDomain.ICE_CAP);

            //Considering absence of birch trees, summer here is hot;
            ClimateDomainRegistry.register("minecraft:plains", ClimateDomain.TEMPERATE);
            ClimateDomainRegistry.register("minecraft:sunflower_plains", ClimateDomain.TEMPERATE);

            ClimateDomainRegistry.register("minecraft:desert", ClimateDomain.SUBTROPICAL_DESERT);
            ClimateDomainRegistry.register("minecraft:desert_hills", ClimateDomain.SUBTROPICAL_DESERT);
            ClimateDomainRegistry.register("minecraft:desert_lakes", ClimateDomain.SUBTROPICAL_DESERT);

            ClimateDomainRegistry.register("minecraft:mountains", ClimateDomain.ALPINE);
            ClimateDomainRegistry.register("minecraft:mountain_edge", ClimateDomain.ALPINE);
            ClimateDomainRegistry.register("minecraft:wooded_mountains", ClimateDomain.ALPINE);
            ClimateDomainRegistry.register("minecraft:gravelly_mountains", ClimateDomain.ALPINE_TUNDRA);
            ClimateDomainRegistry.register("minecraft:modified_gravelly_mountains", ClimateDomain.ALPINE_TUNDRA);

            //It has a temperate oceanic climate due to birch trees (Eastern Europe)
            ClimateDomainRegistry.register("minecraft:forest", ClimateDomain.TEMPERATE_OCEANIC);
            ClimateDomainRegistry.register("minecraft:wooded_hills", ClimateDomain.TEMPERATE_OCEANIC);
            ClimateDomainRegistry.register("minecraft:flower_forest", ClimateDomain.TEMPERATE_OCEANIC);

            ClimateDomainRegistry.register("minecraft:taiga", ClimateDomain.SUBARTIC);
            ClimateDomainRegistry.register("minecraft:taiga_hills", ClimateDomain.SUBARTIC);
            ClimateDomainRegistry.register("minecraft:snowy_taiga", ClimateDomain.SNOWY);
            ClimateDomainRegistry.register("minecraft:snowy_taiga_hills", ClimateDomain.SNOWY);
            ClimateDomainRegistry.register("minecraft:giant_tree_taiga", ClimateDomain.SUBARTIC);
            ClimateDomainRegistry.register("minecraft:giant_tree_taiga_hills", ClimateDomain.SUBARTIC);
            ClimateDomainRegistry.register("minecraft:taiga_mountains", ClimateDomain.SUBARTIC);
            ClimateDomainRegistry.register("minecraft:snowy_taiga_mountains", ClimateDomain.SNOWY);
            ClimateDomainRegistry.register("minecraft:giant_spruce_taiga", ClimateDomain.SUBARTIC);
            ClimateDomainRegistry.register("minecraft:giant_spruce_taiga_hills", ClimateDomain.SUBARTIC);

            ClimateDomainRegistry.register("minecraft:swamp", ClimateDomain.HUMID_SUBTROPICAL);
            ClimateDomainRegistry.register("minecraft:swamp_hills", ClimateDomain.HUMID_SUBTROPICAL);

            ClimateDomainRegistry.register("minecraft:snowy_tundra", ClimateDomain.SNOWY);
            ClimateDomainRegistry.register("minecraft:snowy_mountains", ClimateDomain.SNOWY);
            ClimateDomainRegistry.register("minecraft:snowy_beach", ClimateDomain.SNOWY);
            ClimateDomainRegistry.register("minecraft:ice_spikes", ClimateDomain.ICE_CAP);

            ClimateDomainRegistry.register("minecraft:mushroom_fields", ClimateDomain.TROPICAL_MARITIME);
            ClimateDomainRegistry.register("minecraft:mushroom_fields_shore", ClimateDomain.TROPICAL_MARITIME);

            ClimateDomainRegistry.register("minecraft:beach", ClimateDomain.TEMPERATE_OCEANIC);
            ClimateDomainRegistry.register("minecraft:stone_beach", ClimateDomain.SUBARTIC);

            ClimateDomainRegistry.register("minecraft:jungle", ClimateDomain.TROPICAL_FOREST);
            ClimateDomainRegistry.register("minecraft:jungle_hills", ClimateDomain.TROPICAL_FOREST);
            ClimateDomainRegistry.register("minecraft:jungle_edge", ClimateDomain.TROPICAL_FOREST);
            ClimateDomainRegistry.register("minecraft:modified_jungle", ClimateDomain.TROPICAL_FOREST);
            ClimateDomainRegistry.register("minecraft:modified_jungle_edge", ClimateDomain.TROPICAL_FOREST);
            ClimateDomainRegistry.register("minecraft:bamboo_jungle", ClimateDomain.TROPICAL_FOREST);
            ClimateDomainRegistry.register("minecraft:bamboo_jungle_hills", ClimateDomain.TROPICAL_FOREST);

            ClimateDomainRegistry.register("minecraft:birch_forest", ClimateDomain.HEMIBOREAL_CONTINENTAL);
            ClimateDomainRegistry.register("minecraft:birch_forest_hills", ClimateDomain.HEMIBOREAL_CONTINENTAL);
            ClimateDomainRegistry.register("minecraft:tall_birch_forest", ClimateDomain.HEMIBOREAL_CONTINENTAL);
            ClimateDomainRegistry.register("minecraft:tall_birch_hills", ClimateDomain.HEMIBOREAL_CONTINENTAL);

            ClimateDomainRegistry.register("minecraft:dark_forest", ClimateDomain.TEMPERATE_OCEANIC);
            ClimateDomainRegistry.register("minecraft:dark_forest_hills", ClimateDomain.TEMPERATE_OCEANIC);

            ClimateDomainRegistry.register("minecraft:savanna", ClimateDomain.TROPICAL_SAVANNA);
            ClimateDomainRegistry.register("minecraft:savanna_plateau", ClimateDomain.TROPICAL_SAVANNA);
            ClimateDomainRegistry.register("minecraft:shattered_savanna", ClimateDomain.TROPICAL_SAVANNA);
            ClimateDomainRegistry.register("minecraft:shattered_savanna_plateau", ClimateDomain.TROPICAL_SAVANNA);

            ClimateDomainRegistry.register("minecraft:soul_sand_valley", ClimateDomain.HELL);
            ClimateDomainRegistry.register("minecraft:crimson_forest", ClimateDomain.HELL);
            ClimateDomainRegistry.register("minecraft:warped_forest", ClimateDomain.HELL);
            ClimateDomainRegistry.register("minecraft:basalt_deltas", ClimateDomain.HELL);
            ClimateDomainRegistry.register("minecraft:nether_wastes", ClimateDomain.HELL);

            ClimateDomainRegistry.register("minecraft:badlands", ClimateDomain.TEMPERATE_CONTINENTAL_DESERT);
            ClimateDomainRegistry.register("minecraft:wooded_badlands_plateau", ClimateDomain.TEMPERATE_CONTINENTAL_DESERT);
            ClimateDomainRegistry.register("minecraft:badlands_plateau", ClimateDomain.TEMPERATE_CONTINENTAL_DESERT);
            ClimateDomainRegistry.register("minecraft:eroded_badlands", ClimateDomain.TEMPERATE_CONTINENTAL_DESERT);
            ClimateDomainRegistry.register("minecraft:modified_wooded_badlands_plateau", ClimateDomain.TEMPERATE_CONTINENTAL_DESERT);
            ClimateDomainRegistry.register("minecraft:modified_wooded_badlands_plateau", ClimateDomain.TEMPERATE_CONTINENTAL_DESERT);

            ClimateDomainRegistry.register("minecraft:the_void", ClimateDomain.NONE);
            ClimateDomainRegistry.register("minecraft:the_end", ClimateDomain.NONE);
            ClimateDomainRegistry.register("minecraft:small_end_islands", ClimateDomain.NONE);
            ClimateDomainRegistry.register("minecraft:end_midlands", ClimateDomain.NONE);
            ClimateDomainRegistry.register("minecraft:the_end", ClimateDomain.NONE);
            ClimateDomainRegistry.register("minecraft:small_end_islands", ClimateDomain.NONE);


            /// Caio Cesar Biomes / Caio Cesar's Naturalistic Voyage
        /*
            SummerHeatHelper.register("caiocesarbiomes:bamboo_subtropical_laurel_jungle", SummerHeat.HOT);


            SummerHeatHelper.register("caiocesarbiomes:coastal_subtropical_desert", SummerHeat.WARM);
            SummerHeatHelper.register("caiocesarbiomes:coastal_subtropical_desert_lomas", SummerHeat.WARM);


            SummerHeatHelper.register("caiocesarbiomes:tropical_pine_island", SummerHeat.HOT);


            SummerHeatHelper.register("caiocesarbiomes:cork_oak_savanna", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:cork_oak_beach", SummerHeat.HOT);


            //Caio Cesar's Naturalistic Voyage
            SummerHeatHelper.register("caiocesarbiomes:dry_tropical_beach", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:eucalyptus_plains", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:eucalyptus_sahel", SummerHeat.SCHORCHING);
            SummerHeatHelper.register("caiocesarbiomes:eucalyptus_savanna", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:ginkgo_forest", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:gravel_tundra", SummerHeat.TUNDRA_COLD);
            SummerHeatHelper.register("caiocesarbiomes:hemiboreal_forest", SummerHeat.WARM);
            SummerHeatHelper.register("caiocesarbiomes:hemiboreal_steppe", SummerHeat.WARM);
            SummerHeatHelper.register("caiocesarbiomes:hot_mediterranean_beach", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:humid_subtropical_beach", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:humid_subtropical_pine_forest", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:inactive_volcanic_site", SummerHeat.WARM);
            SummerHeatHelper.register("caiocesarbiomes:japanese_maple_grove", SummerHeat.WARM); //Japanese maples wouldn't thrive well in such way (without the forest's protection) in a hot summer climate
            SummerHeatHelper.register("caiocesarbiomes:lush_southern_tundra", SummerHeat.TUNDRA_COLD);
            SummerHeatHelper.register("caiocesarbiomes:mediterranean_conifer_savanna", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:mediterranean_conifer_savanna_beach", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:mediterranean_oak_woodland", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:mediterranean_scrubland", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:monsoon_ficus_tropical_forest", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:oleander_gardens", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:montane_laurel_grove", SummerHeat.WARM);
            SummerHeatHelper.register("caiocesarbiomes:olive_grove", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:olive_grove_beach", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:pewen_coniferous_grove", SummerHeat.COOLER);
            SummerHeatHelper.register("caiocesarbiomes:sahel", SummerHeat.SCHORCHING);
            SummerHeatHelper.register("caiocesarbiomes:salt_desert", SummerHeat.SCHORCHING);
            SummerHeatHelper.register("caiocesarbiomes:socotra_dryland", SummerHeat.SCHORCHING);
            SummerHeatHelper.register("caiocesarbiomes:southern_beech_forest", SummerHeat.COOLER);
            SummerHeatHelper.register("caiocesarbiomes:stony_mediterranean_shore", SummerHeat.SCHORCHING);
            SummerHeatHelper.register("caiocesarbiomes:subtropical_eucalyptus_dry_forest", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:subtropical_extreme_hills", SummerHeat.WARM);
            SummerHeatHelper.register("caiocesarbiomes:subtropical_laurel_forest", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:subtropical_laurel_jungle", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:subtropical_pine_dry_forest", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:subtropical_seasonal_forest", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:temperate_desert", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:temperate_rainforest", SummerHeat.WARM);
            SummerHeatHelper.register("caiocesarbiomes:tropical_bamboo_marsh", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:tropical_beach", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:tropical_desert", SummerHeat.SCHORCHING);
            SummerHeatHelper.register("caiocesarbiomes:tropical_eucalyptus_dry_forest", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:tropical_seasonal_forest", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:tussock_tundra", SummerHeat.TUNDRA_COLD);
            SummerHeatHelper.register("caiocesarbiomes:volcanic_site", SummerHeat.SCHORCHING);
            SummerHeatHelper.register("caiocesarbiomes:mediterranean_oak_sparse_woodland", SummerHeat.HOT);
            ClimateDomainRegistry.register("caiocesarbiomes:mediterranean_oak_sparse_woodland", ClimateDomain.SUBTROPICAL_MEDITERRANEAN);

         
            /// Brazillian Biomes
            ClimateDomainRegistry.register("brbiomesmod:amazon_rainforest", ClimateDomain.TROPICAL_FOREST);
            SummerTemperatureRegistry.register(new ResourceLocation("brbiomesmod", "amazon_rainforest"), 0.95F);
            ClimateDomainRegistry.register("brbiomesmod:amazon_varzea_forest", ClimateDomain.TROPICAL_FOREST);
            SummerTemperatureRegistry.register(new ResourceLocation("brbiomesmod", "amazon_varzea_forest"), 0.95F);
            ClimateDomainRegistry.register("brbiomesmod:amazon_rainforest_edge", ClimateDomain.TROPICAL_FOREST);
            SummerTemperatureRegistry.register(new ResourceLocation("brbiomesmod", "amazon_rainforest_edge"), 0.95F);

            ClimateDomainRegistry.register("brbiomesmod:araucaria_plateau", ClimateDomain.HUMID_SUBTROPICAL_HIGHLAND);
            SummerTemperatureRegistry.register(new ResourceLocation("brbiomesmod", "araucaria_plateau"), 0.9F);

            ClimateDomainRegistry.register("brbiomesmod:atlantic_forest", ClimateDomain.TROPICAL_FOREST);
            SummerTemperatureRegistry.register(new ResourceLocation("brbiomesmod", "atlantic_forest"), 0.9F);
            ClimateDomainRegistry.register("brbiomesmod:atlantic_forest_hills", ClimateDomain.TROPICAL_MONTANE);
            SummerTemperatureRegistry.register(new ResourceLocation("brbiomesmod", "atlantic_forest_hills"), 0.9F);

            ClimateDomainRegistry.register("brbiomesmod:caatinga_shrubland", ClimateDomain.TROPICAL_SEMIARID);
            SummerTemperatureRegistry.register(new ResourceLocation("brbiomesmod", "caatinga_shrubland"), 1.2F);

            ClimateDomainRegistry.register("brbiomesmod:cerrado", ClimateDomain.TROPICAL_SAVANNA);
            SummerTemperatureRegistry.register(new ResourceLocation("brbiomesmod", "cerrado"), 0.95F);

            ClimateDomainRegistry.register("brbiomesmod:dunas_restinga", ClimateDomain.TROPICAL_SAVANNA);
            SummerTemperatureRegistry.register(new ResourceLocation("brbiomesmod", "dunas_restinga"), 1.0F);
            ClimateDomainRegistry.register("brbiomesmod:restinga_beach", ClimateDomain.TROPICAL_SAVANNA);
            SummerTemperatureRegistry.register(new ResourceLocation("brbiomesmod", "restinga_beach"), 1.0F);

            ClimateDomainRegistry.register("brbiomesmod:butia_pampas", ClimateDomain.HUMID_SUBTROPICAL);
            SummerTemperatureRegistry.register(new ResourceLocation("brbiomesmod", "butia_pampas"), 0.9F);
            ClimateDomainRegistry.register("brbiomesmod:pampas_hills", ClimateDomain.HUMID_SUBTROPICAL_HIGHLAND);
            SummerTemperatureRegistry.register(new ResourceLocation("brbiomesmod", "pampas_hills"), 0.9F);
            ClimateDomainRegistry.register("brbiomesmod:pampas", ClimateDomain.HUMID_SUBTROPICAL);
            SummerTemperatureRegistry.register(new ResourceLocation("brbiomesmod", "pampas"), 0.9F);
            ClimateDomainRegistry.register("brbiomesmod:pampas_coastal_fields", ClimateDomain.HUMID_SUBTROPICAL);
            SummerTemperatureRegistry.register(new ResourceLocation("brbiomesmod", "pampas_coastal_fields"), 0.9F);

            ClimateDomainRegistry.register("brbiomesmod:pantanal", ClimateDomain.TROPICAL_SAVANNA);
            SummerTemperatureRegistry.register(new ResourceLocation("brbiomesmod", "cerrado"), 0.95F);*/
    }
}
