package com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClimateSetup {

    @SubscribeEvent
    public static void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {

            /// Minecraft Vanilla
            //SummerHeatHelper.register("minecraft:ocean", SummerHeat.WARM);
            ClimateDomainRegistry.register("minecraft:ocean", ClimateDomain.OCEAN);
           // SummerHeatHelper.register("minecraft:deep_ocean", SummerHeat.WARM);
            ClimateDomainRegistry.register("minecraft:deep_ocean", ClimateDomain.OCEAN);
            //SummerHeatHelper.register("minecraft:warm_ocean", SummerHeat.HOT);
            ClimateDomainRegistry.register("minecraft:warm_ocean", ClimateDomain.WARM_OCEAN);
           // SummerHeatHelper.register("minecraft:lukewarm_ocean", SummerHeat.HOT);
            ClimateDomainRegistry.register("minecraft:lukewarm_ocean", ClimateDomain.LUKEWARM_OCEAN);
            //SummerHeatHelper.register("minecraft:cold_ocean", SummerHeat.COOLER);
            ClimateDomainRegistry.register("minecraft:cold_ocean", ClimateDomain.COLD_OCEAN);
           // SummerHeatHelper.register("minecraft:deep_warm_ocean", SummerHeat.HOT);
            ClimateDomainRegistry.register("minecraft:deep_warm_ocean", ClimateDomain.WARM_OCEAN);
            //SummerHeatHelper.register("minecraft:deep_lukewarm_ocean", SummerHeat.HOT);
            ClimateDomainRegistry.register("minecraft:deep_lukewarm_ocean", ClimateDomain.WARM_OCEAN);
            //SummerHeatHelper.register("minecraft:deep_cold_ocean", SummerHeat.COOLER);
            ClimateDomainRegistry.register("minecraft:deep_cold_ocean", ClimateDomain.COLD_OCEAN);
            //SummerHeatHelper.register("minecraft:frozen_ocean", SummerHeat.ICY);
            ClimateDomainRegistry.register("minecraft:frozen_ocean", ClimateDomain.ICY_OCEAN);
            //SummerHeatHelper.register("minecraft:deep_frozen_ocean", SummerHeat.ICY);
            ClimateDomainRegistry.register("minecraft:deep_frozen_ocean", ClimateDomain.ICY_OCEAN);


           // SummerHeatHelper.register("minecraft:frozen_river", SummerHeat.ICY);
            ClimateDomainRegistry.register("minecraft:frozen_river", ClimateDomain.ICE_CAP);


           // SummerHeatHelper.register("minecraft:plains", SummerHeat.HOT); //Considering absence of birch trees.
            ClimateDomainRegistry.register("minecraft:plains", ClimateDomain.TEMPERATE);
            //SummerHeatHelper.register("minecraft:sunflower_plains", SummerHeat.HOT);
            ClimateDomainRegistry.register("minecraft:sunflower_plains", ClimateDomain.TEMPERATE);


            //SummerHeatHelper.register("minecraft:desert", SummerHeat.SCHORCHING);
            ClimateDomainRegistry.register("minecraft:desert", ClimateDomain.SUBTROPICAL_DESERT);
           // SummerHeatHelper.register("minecraft:desert_hills", SummerHeat.SCHORCHING);
            ClimateDomainRegistry.register("minecraft:desert_hills", ClimateDomain.SUBTROPICAL_DESERT);
            //SummerHeatHelper.register("minecraft:desert_lakes", SummerHeat.SCHORCHING);
            ClimateDomainRegistry.register("minecraft:desert_lakes", ClimateDomain.SUBTROPICAL_DESERT);


            //SummerHeatHelper.register("minecraft:mountains", SummerHeat.COOLER);
            ClimateDomainRegistry.register("minecraft:mountains", ClimateDomain.ALPINE);
           // SummerHeatHelper.register("minecraft:mountain_edge", SummerHeat.COOLER);
            ClimateDomainRegistry.register("minecraft:mountain_edge", ClimateDomain.ALPINE);
            //SummerHeatHelper.register("minecraft:wooded_mountains", SummerHeat.COOLER);
            ClimateDomainRegistry.register("minecraft:wooded_mountains", ClimateDomain.ALPINE);
           // SummerHeatHelper.register("minecraft:gravelly_mountains", SummerHeat.TUNDRA_COLD);
            ClimateDomainRegistry.register("minecraft:gravelly_mountains", ClimateDomain.ALPINE_TUNDRA);
           // SummerHeatHelper.register("minecraft:modified_gravelly_mountains", SummerHeat.TUNDRA_COLD);
            ClimateDomainRegistry.register("minecraft:modified_gravelly_mountains", ClimateDomain.ALPINE_TUNDRA);


           // SummerHeatHelper.register("minecraft:forest", SummerHeat.WARM); //It has a temperate oceanic climate due to birch trees
            ClimateDomainRegistry.register("minecraft:forest", ClimateDomain.TEMPERATE_OCEANIC);
          //  SummerHeatHelper.register("minecraft:wooded_hills", SummerHeat.WARM);
            ClimateDomainRegistry.register("minecraft:wooded_hills", ClimateDomain.TEMPERATE_OCEANIC);
           // SummerHeatHelper.register("minecraft:flower_forest", SummerHeat.WARM);
            ClimateDomainRegistry.register("minecraft:flower_forest", ClimateDomain.TEMPERATE_OCEANIC);


           // SummerHeatHelper.register("minecraft:taiga", SummerHeat.COOLER);
            ClimateDomainRegistry.register("minecraft:taiga", ClimateDomain.SUBARTIC);
           // SummerHeatHelper.register("minecraft:taiga_hills", SummerHeat.COOLER);
            ClimateDomainRegistry.register("minecraft:taiga_hills", ClimateDomain.SUBARTIC);
           // SummerHeatHelper.register("minecraft:snowy_taiga", SummerHeat.ICY);
            ClimateDomainRegistry.register("minecraft:snowy_taiga", ClimateDomain.SNOWY);
           // SummerHeatHelper.register("minecraft:snowy_taiga_hills", SummerHeat.ICY);
            ClimateDomainRegistry.register("minecraft:snowy_taiga_hills", ClimateDomain.SNOWY);
          //  SummerHeatHelper.register("minecraft:giant_tree_taiga", SummerHeat.COOLER);
            ClimateDomainRegistry.register("minecraft:giant_tree_taiga", ClimateDomain.SUBARTIC);
          //  SummerHeatHelper.register("minecraft:giant_tree_taiga_hills", SummerHeat.COOLER);
            ClimateDomainRegistry.register("minecraft:giant_tree_taiga_hills", ClimateDomain.SUBARTIC);
           // SummerHeatHelper.register("minecraft:taiga_mountains", SummerHeat.COOLER);
            ClimateDomainRegistry.register("minecraft:taiga_mountains", ClimateDomain.SUBARTIC);
          //  SummerHeatHelper.register("minecraft:snowy_taiga_mountains", SummerHeat.ICY);
            ClimateDomainRegistry.register("minecraft:snowy_taiga_mountains", ClimateDomain.SNOWY);
           // SummerHeatHelper.register("minecraft:giant_spruce_taiga", SummerHeat.COOLER);
            ClimateDomainRegistry.register("minecraft:giant_spruce_taiga", ClimateDomain.SUBARTIC);
          //  SummerHeatHelper.register("minecraft:giant_spruce_taiga_hills", SummerHeat.COOLER);
            ClimateDomainRegistry.register("minecraft:giant_spruce_taiga_hills", ClimateDomain.SUBARTIC);


         //   SummerHeatHelper.register("minecraft:swamp", SummerHeat.HOT);
            ClimateDomainRegistry.register("minecraft:swamp", ClimateDomain.HUMID_SUBTROPICAL);
          //  SummerHeatHelper.register("minecraft:swamp_hills", SummerHeat.HOT);
            ClimateDomainRegistry.register("minecraft:swamp_hills", ClimateDomain.HUMID_SUBTROPICAL);


           // SummerHeatHelper.register("minecraft:snowy_tundra", SummerHeat.ICY);
           // SummerHeatHelper.register("minecraft:snowy_mountains", SummerHeat.ICY);


           // SummerHeatHelper.register("minecraft:mushroom_fields", SummerHeat.HOT);
            // SummerHeatHelper.register("minecraft:mushroom_fields_shore", SummerHeat.HOT);


           /* SummerHeatHelper.register("minecraft:beach", SummerHeat.HOT); //Cfa temperate beach
            SummerHeatHelper.register("minecraft:stone_shore", SummerHeat.COOLER);
            SummerHeatHelper.register("minecraft:snowy_beach", SummerHeat.ICY);


            SummerHeatHelper.register("minecraft:jungle", SummerHeat.HOT);
            SummerHeatHelper.register("minecraft:jungle_hills", SummerHeat.HOT);
            SummerHeatHelper.register("minecraft:jungle_edge", SummerHeat.HOT);
            SummerHeatHelper.register("minecraft:modified_jungle", SummerHeat.HOT);
            SummerHeatHelper.register("minecraft:modified_jungle_edge", SummerHeat.HOT);
            SummerHeatHelper.register("minecraft:bamboo_jungle", SummerHeat.HOT);
            SummerHeatHelper.register("minecraft:bamboo_jungle_hills", SummerHeat.HOT);


            SummerHeatHelper.register("minecraft:birch_forest", SummerHeat.WARM);
            SummerHeatHelper.register("minecraft:birch_forest_hills", SummerHeat.WARM);
            SummerHeatHelper.register("minecraft:tall_birch_forest", SummerHeat.WARM);
            SummerHeatHelper.register("minecraft:tall_birch_hills", SummerHeat.WARM);


            SummerHeatHelper.register("minecraft:dark_forest", SummerHeat.WARM);
            SummerHeatHelper.register("minecraft:dark_forest_hills", SummerHeat.WARM);


            SummerHeatHelper.register("minecraft:savanna", SummerHeat.HOT);
            SummerHeatHelper.register("minecraft:savanna_plateau", SummerHeat.HOT);
            SummerHeatHelper.register("minecraft:shattered_savanna", SummerHeat.HOT);
            SummerHeatHelper.register("minecraft:shattered_savanna_plateau", SummerHeat.HOT);


            SummerHeatHelper.register("minecraft:badlands", SummerHeat.SCHORCHING);
            SummerHeatHelper.register("minecraft:wooded_badlands_plateau", SummerHeat.WARM);
            SummerHeatHelper.register("minecraft:badlands_plateau", SummerHeat.WARM);


            SummerHeatHelper.register("minecraft:ice_spikes", SummerHeat.ICY);


            SummerHeatHelper.register("minecraft:eroded_badlands", SummerHeat.SCHORCHING);
            SummerHeatHelper.register("minecraft:modified_wooded_badlands_plateau", SummerHeat.WARM);
            SummerHeatHelper.register("minecraft:modified_badlands_plateau", SummerHeat.WARM);*/


            /// Caio Cesar Biomes / Caio Cesar's Naturalistic Voyage
           /* SummerHeatHelper.register("caiocesarbiomes:bamboo_subtropical_laurel_jungle", SummerHeat.HOT);


            SummerHeatHelper.register("caiocesarbiomes:coastal_subtropical_desert", SummerHeat.WARM);
            SummerHeatHelper.register("caiocesarbiomes:coastal_subtropical_desert_lomas", SummerHeat.WARM);


            SummerHeatHelper.register("caiocesarbiomes:tropical_pine_island", SummerHeat.HOT);


            SummerHeatHelper.register("caiocesarbiomes:cork_oak_savanna", SummerHeat.HOT);
            SummerHeatHelper.register("caiocesarbiomes:cork_oak_beach", SummerHeat.HOT);


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
            SummerHeatHelper.register("caiocesarbiomes:mediterranean_oak_sparse_woodland", SummerHeat.HOT);*/
            ClimateDomainRegistry.register("caiocesarbiomes:mediterranean_oak_sparse_woodland", ClimateDomain.SUBTROPICAL_MEDITERRANEAN);

            //SummerHeatHelper.register("brbiomesmod:amazon_rainforest", SummerHeat.HOT);
            ClimateDomainRegistry.register("brbiomesmod:amazon_rainforest", ClimateDomain.TROPICAL_FOREST);
            //SummerHeatHelper.register("brbiomesmod:amazon_varzea_forest", SummerHeat.HOT);
            ClimateDomainRegistry.register("brbiomesmod:amazon_varzea_forest", ClimateDomain.TROPICAL_FOREST);
            //SummerHeatHelper.register("brbiomesmod:araucaria_plateau", SummerHeat.WARM);
            ClimateDomainRegistry.register("brbiomesmod:araucaria_plateau", ClimateDomain.HUMID_SUBTROPICAL_HIGHLAND);
            //SummerHeatHelper.register("brbiomesmod:atlantic_forest", SummerHeat.HOT);
            ClimateDomainRegistry.register("brbiomesmod:atlantic_forest", ClimateDomain.TROPICAL_FOREST);
            //SummerHeatHelper.register("brbiomesmod:atlantic_forest_hills", SummerHeat.WARM);
            ClimateDomainRegistry.register("brbiomesmod:atlantic_forest_hills", ClimateDomain.TROPICAL_MONTANE);
            //SummerHeatHelper.register("brbiomesmod:butia_pampas", SummerHeat.HOT);
            ClimateDomainRegistry.register("brbiomesmod:butia_pampas", ClimateDomain.HUMID_SUBTROPICAL);
            //SummerHeatHelper.register("brbiomesmod:caatinga_shrubland", SummerHeat.SCHORCHING);
            ClimateDomainRegistry.register("brbiomesmod:caatinga_shrubland", ClimateDomain.TROPICAL_SEMIARID);
            //SummerHeatHelper.register("brbiomesmod:cerrado", SummerHeat.HOT);
            ClimateDomainRegistry.register("brbiomesmod:cerrado", ClimateDomain.TROPICAL_SAVANNA);
            //SummerHeatHelper.register("brbiomesmod:pampas_hills", SummerHeat.WARM);
            ClimateDomainRegistry.register("brbiomesmod:pampas_hills", ClimateDomain.HUMID_SUBTROPICAL_HIGHLAND);
            //SummerHeatHelper.register("brbiomesmod:dunas_restinga", SummerHeat.HOT);
            ClimateDomainRegistry.register("brbiomesmod:dunas_restinga", ClimateDomain.TROPICAL_SAVANNA);
            //SummerHeatHelper.register("brbiomesmod:pampas", SummerHeat.HOT);
            ClimateDomainRegistry.register("brbiomesmod:pampas", ClimateDomain.HUMID_SUBTROPICAL);
            //SummerHeatHelper.register("brbiomesmod:pampas_coastal_fields", SummerHeat.HOT);
            ClimateDomainRegistry.register("brbiomesmod:pampas_coastal_fields", ClimateDomain.HUMID_SUBTROPICAL);
            //SummerHeatHelper.register("brbiomesmod:pantanal", SummerHeat.HOT);
            ClimateDomainRegistry.register("brbiomesmod:pantanal", ClimateDomain.TROPICAL_SAVANNA);
            //SummerHeatHelper.register("brbiomesmod:restinga_beach", SummerHeat.HOT);
            ClimateDomainRegistry.register("brbiomesmod:restinga_beach", ClimateDomain.TROPICAL_SAVANNA);
        });
    }
}
