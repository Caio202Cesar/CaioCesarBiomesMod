package com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClimateSetup {

    @SubscribeEvent
    public static void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {

            /// Minecraft Vanilla
            ClimateDomainRegistry.register("minecraft:warm_ocean", ClimateDomain.WARM_OCEAN);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "warm_ocean"), 0.9F);
            ClimateDomainRegistry.register("minecraft:deep_warm_ocean", ClimateDomain.WARM_OCEAN);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "deep_warm_ocean"), 0.9F);

            ClimateDomainRegistry.register("minecraft:lukewarm_ocean", ClimateDomain.LUKEWARM_OCEAN);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "lukewarm_ocean"), 0.85F);
            ClimateDomainRegistry.register("minecraft:deep_lukewarm_ocean", ClimateDomain.WARM_OCEAN);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "deep_lukewarm_ocean"), 0.85F);

            ClimateDomainRegistry.register("minecraft:ocean", ClimateDomain.OCEAN);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "ocean"), 0.8F);
            ClimateDomainRegistry.register("minecraft:deep_ocean", ClimateDomain.OCEAN);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "deep_ocean"), 0.8F);

            ClimateDomainRegistry.register("minecraft:cold_ocean", ClimateDomain.COLD_OCEAN);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "cold_ocean"), 0.6F);
            ClimateDomainRegistry.register("minecraft:deep_cold_ocean", ClimateDomain.COLD_OCEAN);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "deep_cold_ocean"), 0.6F);

            ClimateDomainRegistry.register("minecraft:frozen_ocean", ClimateDomain.ICY_OCEAN);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "frozen_ocean"), 0.2F);
            ClimateDomainRegistry.register("minecraft:deep_frozen_ocean", ClimateDomain.ICY_OCEAN);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "deep_frozen_ocean"), 0.2F);


            ClimateDomainRegistry.register("minecraft:frozen_river", ClimateDomain.ICE_CAP);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "frozen_river"), 0.2F);


            //Considering absence of birch trees, summer here is hot;
            ClimateDomainRegistry.register("minecraft:plains", ClimateDomain.TEMPERATE);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "plains"), 0.95F);
            ClimateDomainRegistry.register("minecraft:sunflower_plains", ClimateDomain.TEMPERATE);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "sunflower_plains"), 0.95F);


            ClimateDomainRegistry.register("minecraft:desert", ClimateDomain.SUBTROPICAL_DESERT);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "desert"), 1.5F);
            ClimateDomainRegistry.register("minecraft:desert_hills", ClimateDomain.SUBTROPICAL_DESERT);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "desert_hills"), 1.5F);
            ClimateDomainRegistry.register("minecraft:desert_lakes", ClimateDomain.SUBTROPICAL_DESERT);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "desert_lakes"), 1.5F);


            ClimateDomainRegistry.register("minecraft:mountains", ClimateDomain.ALPINE);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "mountains"), 0.7F);
            ClimateDomainRegistry.register("minecraft:mountain_edge", ClimateDomain.ALPINE);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "mountain_edge"), 0.7F);
            ClimateDomainRegistry.register("minecraft:wooded_mountains", ClimateDomain.ALPINE);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "wooded_mountains"), 0.7F);
            ClimateDomainRegistry.register("minecraft:gravelly_mountains", ClimateDomain.ALPINE_TUNDRA);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "gravelly_mountains"), 0.5F);
            ClimateDomainRegistry.register("minecraft:modified_gravelly_mountains", ClimateDomain.ALPINE_TUNDRA);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "modified_gravelly_mountains"), 0.5F);


           //It has a temperate oceanic climate due to birch trees (Eastern Europe)
            ClimateDomainRegistry.register("minecraft:forest", ClimateDomain.TEMPERATE_OCEANIC);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "forest"), 0.85F);
            ClimateDomainRegistry.register("minecraft:wooded_hills", ClimateDomain.TEMPERATE_OCEANIC);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "wooded_hills"), 0.85F);
            ClimateDomainRegistry.register("minecraft:flower_forest", ClimateDomain.TEMPERATE_OCEANIC);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "flower_forest"), 0.85F);


            ClimateDomainRegistry.register("minecraft:taiga", ClimateDomain.SUBARTIC);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "taiga"), 0.6F);
            ClimateDomainRegistry.register("minecraft:taiga_hills", ClimateDomain.SUBARTIC);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "taiga_hills"), 0.6F);
            ClimateDomainRegistry.register("minecraft:snowy_taiga", ClimateDomain.SNOWY);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "snowy_taiga"), 0.2F);
            ClimateDomainRegistry.register("minecraft:snowy_taiga_hills", ClimateDomain.SNOWY);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "snowy_taiga_hills"), 0.2F);
            ClimateDomainRegistry.register("minecraft:giant_tree_taiga", ClimateDomain.SUBARTIC);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "giant_tree_taiga"), 0.6F);
            ClimateDomainRegistry.register("minecraft:giant_tree_taiga_hills", ClimateDomain.SUBARTIC);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "giant_tree_taiga_hills"), 0.6F);
            ClimateDomainRegistry.register("minecraft:taiga_mountains", ClimateDomain.SUBARTIC);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "taiga_mountains"), 0.6F);
            ClimateDomainRegistry.register("minecraft:snowy_taiga_mountains", ClimateDomain.SNOWY);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "snowy_taiga_mountains"), 0.2F);
            ClimateDomainRegistry.register("minecraft:giant_spruce_taiga", ClimateDomain.SUBARTIC);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "giant_spruce_taiga"), 0.6F);
            ClimateDomainRegistry.register("minecraft:giant_spruce_taiga_hills", ClimateDomain.SUBARTIC);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "giant_spruce_taiga_hills"), 0.6F);


            ClimateDomainRegistry.register("minecraft:swamp", ClimateDomain.HUMID_SUBTROPICAL);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "swamp"), 0.95F);
            ClimateDomainRegistry.register("minecraft:swamp_hills", ClimateDomain.HUMID_SUBTROPICAL);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "swamp_hills"), 0.95F);


            ClimateDomainRegistry.register("minecraft:snowy_tundra", ClimateDomain.SNOWY);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "snowy_tundra"), 0.2F);
            ClimateDomainRegistry.register("minecraft:snowy_mountains", ClimateDomain.SNOWY);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "snowy_mountains"), 0.2F);
            ClimateDomainRegistry.register("minecraft:snowy_beach", ClimateDomain.SNOWY);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "snowy_beach"), 0.2F);
            ClimateDomainRegistry.register("minecraft:ice_spikes", ClimateDomain.ICE_CAP);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "ice_spikes"), 0.15F);

            ClimateDomainRegistry.register("minecraft:mushroom_fields", ClimateDomain.TROPICAL_MARITIME);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "mushroom_fields"), 0.85F);
            ClimateDomainRegistry.register("minecraft:mushroom_fields_shore", ClimateDomain.TROPICAL_MARITIME);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "mushroom_fields_shore"), 0.85F);


            ClimateDomainRegistry.register("minecraft:beach", ClimateDomain.TEMPERATE_OCEANIC);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "beach"), 0.85F); //Cfb temperate beach
            ClimateDomainRegistry.register("minecraft:stone_beach", ClimateDomain.SUBARTIC);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "stone_beach"), 0.6F); //taiga beach


            ClimateDomainRegistry.register("minecraft:jungle", ClimateDomain.TROPICAL_FOREST);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "jungle"), 0.95F);
            ClimateDomainRegistry.register("minecraft:jungle_hills", ClimateDomain.TROPICAL_FOREST);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "jungle_hills"), 0.95F);
            ClimateDomainRegistry.register("minecraft:jungle_edge", ClimateDomain.TROPICAL_FOREST);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "jungle_edge"), 0.95F);
            ClimateDomainRegistry.register("minecraft:modified_jungle", ClimateDomain.TROPICAL_FOREST);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "modified_jungle"), 0.95F);
            ClimateDomainRegistry.register("minecraft:modified_jungle_edge", ClimateDomain.TROPICAL_FOREST);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "modified_jungle_edge"), 0.95F);
            ClimateDomainRegistry.register("minecraft:bamboo_jungle", ClimateDomain.TROPICAL_FOREST);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "bamboo_jungle"), 0.95F);
            ClimateDomainRegistry.register("minecraft:bamboo_jungle_hills", ClimateDomain.TROPICAL_FOREST);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "bamboo_jungle_hills"), 0.95F);


            ClimateDomainRegistry.register("minecraft:birch_forest", ClimateDomain.HEMIBOREAL_CONTINENTAL);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "birch_forest"), 0.7F);
            ClimateDomainRegistry.register("minecraft:birch_forest_hills", ClimateDomain.HEMIBOREAL_CONTINENTAL);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "birch_forest_hills"), 0.7F);
            ClimateDomainRegistry.register("minecraft:tall_birch_forest", ClimateDomain.HEMIBOREAL_CONTINENTAL);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "tall_birch_forest"), 0.7F);
            ClimateDomainRegistry.register("minecraft:tall_birch_hills", ClimateDomain.HEMIBOREAL_CONTINENTAL);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "tall_birch_hills"), 0.7F);


            ClimateDomainRegistry.register("minecraft:dark_forest", ClimateDomain.TEMPERATE_OCEANIC);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "dark_forest"), 0.85F);
            ClimateDomainRegistry.register("minecraft:dark_forest_hills", ClimateDomain.TEMPERATE_OCEANIC);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "dark_forest_hills"), 0.85F);


            ClimateDomainRegistry.register("minecraft:savanna", ClimateDomain.TROPICAL_SAVANNA);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "savanna"), 0.95F);
            ClimateDomainRegistry.register("minecraft:savanna_plateau", ClimateDomain.TROPICAL_SAVANNA);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "savanna_plateau"), 0.95F);
            ClimateDomainRegistry.register("minecraft:shattered_savanna", ClimateDomain.TROPICAL_SAVANNA);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "shattered_savanna"), 0.95F);
            ClimateDomainRegistry.register("minecraft:shattered_savanna_plateau", ClimateDomain.TROPICAL_SAVANNA);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "shattered_savanna_plateau"), 0.95F);


            ClimateDomainRegistry.register("minecraft:soul_sand_valley", ClimateDomain.HELL);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "soul_sand_valley"), 4.0F);
            ClimateDomainRegistry.register("minecraft:crimson_forest", ClimateDomain.HELL);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "crimson_forest"), 3.0F);
            ClimateDomainRegistry.register("minecraft:warped_forest", ClimateDomain.HELL);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "warped_forest"), 2.5F);
            ClimateDomainRegistry.register("minecraft:basalt_deltas", ClimateDomain.HELL);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "basalt_deltas"), 3.5F);
            ClimateDomainRegistry.register("minecraft:nether_wastes", ClimateDomain.HELL);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "nether_wastes"), 4.0F);


            ClimateDomainRegistry.register("minecraft:badlands", ClimateDomain.TEMPERATE_CONTINENTAL_DESERT);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "badlands"), 1.0F);
            ClimateDomainRegistry.register("minecraft:wooded_badlands_plateau", ClimateDomain.TEMPERATE_CONTINENTAL_DESERT);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "wooded_badlands_plateau"), 1.0F);
            ClimateDomainRegistry.register("minecraft:badlands_plateau", ClimateDomain.TEMPERATE_CONTINENTAL_DESERT);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "badlands_plateau"), 1.0F);
            ClimateDomainRegistry.register("minecraft:eroded_badlands", ClimateDomain.TEMPERATE_CONTINENTAL_DESERT);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "eroded_badlands"), 1.0F);
            ClimateDomainRegistry.register("minecraft:modified_wooded_badlands_plateau", ClimateDomain.TEMPERATE_CONTINENTAL_DESERT);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "modified_wooded_badlands_plateau"), 1.0F);
            ClimateDomainRegistry.register("minecraft:modified_wooded_badlands_plateau", ClimateDomain.TEMPERATE_CONTINENTAL_DESERT);
            SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "modified_badlands_plateau"), 1.0F);


            ClimateDomainRegistry.register("minecraft:the_void", ClimateDomain.NONE);
            ClimateDomainRegistry.register("minecraft:the_end", ClimateDomain.NONE);
            ClimateDomainRegistry.register("minecraft:small_end_islands", ClimateDomain.NONE);
            ClimateDomainRegistry.register("minecraft:end_midlands", ClimateDomain.NONE);
            ClimateDomainRegistry.register("minecraft:the_end", ClimateDomain.NONE);
            ClimateDomainRegistry.register("minecraft:small_end_islands", ClimateDomain.NONE);


            /// Caio Cesar Biomes / Caio Cesar's Naturalistic Voyage
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
            SummerTemperatureRegistry.register(new ResourceLocation("brbiomesmod", "cerrado"), 0.95F);
        });
    }
}
