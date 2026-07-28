package com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClimateSetup {

    @SubscribeEvent
    public static void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            SummerHeatRegistry.register("minecraft:ocean", SummerHeat.WARM);
            ClimateDomainRegistry.register("minecraft:ocean", ClimateDomain.OCEAN);
            SummerHeatRegistry.register("minecraft:deep_ocean", SummerHeat.WARM);
            ClimateDomainRegistry.register("minecraft:deep_ocean", ClimateDomain.OCEAN);
            SummerHeatRegistry.register("minecraft:warm_ocean", SummerHeat.HOT);
            ClimateDomainRegistry.register("minecraft:warm_ocean", ClimateDomain.WARM_OCEAN);
            SummerHeatRegistry.register("minecraft:lukewarm_ocean", SummerHeat.HOT);
            ClimateDomainRegistry.register("minecraft:lukewarm_ocean", ClimateDomain.LUKEWARM_OCEAN);
            SummerHeatRegistry.register("minecraft:cold_ocean", SummerHeat.COOLER);
            ClimateDomainRegistry.register("minecraft:cold_ocean", ClimateDomain.COLD_OCEAN);
            SummerHeatRegistry.register("minecraft:deep_warm_ocean", SummerHeat.HOT);
            ClimateDomainRegistry.register("minecraft:deep_warm_ocean", ClimateDomain.WARM_OCEAN);
            SummerHeatRegistry.register("minecraft:deep_lukewarm_ocean", SummerHeat.HOT);
            ClimateDomainRegistry.register("minecraft:deep_lukewarm_ocean", ClimateDomain.WARM_OCEAN);
            SummerHeatRegistry.register("minecraft:deep_cold_ocean", SummerHeat.COOLER);
            ClimateDomainRegistry.register("minecraft:deep_cold_ocean", ClimateDomain.COLD_OCEAN);
            SummerHeatRegistry.register("minecraft:frozen_ocean", SummerHeat.ICY);
            ClimateDomainRegistry.register("minecraft:frozen_ocean", ClimateDomain.ICY_OCEAN);
            SummerHeatRegistry.register("minecraft:deep_frozen_ocean", SummerHeat.ICY);
            ClimateDomainRegistry.register("minecraft:deep_frozen_ocean", ClimateDomain.ICY_OCEAN);


            SummerHeatRegistry.register("minecraft:frozen_river", SummerHeat.ICY);
            ClimateDomainRegistry.register("minecraft:frozen_river", ClimateDomain.ICE_CAP);


            SummerHeatRegistry.register("minecraft:plains", SummerHeat.HOT); //Considering absence of birch trees.
            ClimateDomainRegistry.register("minecraft:plains", ClimateDomain.TEMPERATE);
            SummerHeatRegistry.register("minecraft:sunflower_plains", SummerHeat.HOT);
            ClimateDomainRegistry.register("minecraft:sunflower_plains", ClimateDomain.TEMPERATE);


            SummerHeatRegistry.register("minecraft:desert", SummerHeat.SCHORCHING);
            ClimateDomainRegistry.register("minecraft:desert", ClimateDomain.SUBTROPICAL_DESERT);
            SummerHeatRegistry.register("minecraft:desert_hills", SummerHeat.SCHORCHING);
            ClimateDomainRegistry.register("minecraft:desert_hills", ClimateDomain.SUBTROPICAL_DESERT);
            SummerHeatRegistry.register("minecraft:desert_lakes", SummerHeat.SCHORCHING);
            ClimateDomainRegistry.register("minecraft:desert_lakes", ClimateDomain.SUBTROPICAL_DESERT);


            SummerHeatRegistry.register("minecraft:mountains", SummerHeat.COOLER);
            ClimateDomainRegistry.register("minecraft:mountains", ClimateDomain.ALPINE);
            SummerHeatRegistry.register("minecraft:mountain_edge", SummerHeat.COOLER);
            ClimateDomainRegistry.register("minecraft:mountain_edge", ClimateDomain.ALPINE);
            SummerHeatRegistry.register("minecraft:wooded_mountains", SummerHeat.COOLER);
            ClimateDomainRegistry.register("minecraft:wooded_mountains", ClimateDomain.ALPINE);
            SummerHeatRegistry.register("minecraft:gravelly_mountains", SummerHeat.TUNDRA_COLD);
            ClimateDomainRegistry.register("minecraft:gravelly_mountains", ClimateDomain.ALPINE_TUNDRA);


            SummerHeatRegistry.register("minecraft:forest", SummerHeat.WARM); //It has a temperate oceanic climate due to birch trees
            ClimateDomainRegistry.register("minecraft:forest", ClimateDomain.TEMPERATE_OCEANIC);
            SummerHeatRegistry.register("minecraft:wooded_hills", SummerHeat.WARM);
            ClimateDomainRegistry.register("minecraft:wooded_hills", ClimateDomain.TEMPERATE_OCEANIC);
            SummerHeatRegistry.register("minecraft:flower_forest", SummerHeat.WARM);
            ClimateDomainRegistry.register("minecraft:flower_forest", ClimateDomain.TEMPERATE_OCEANIC);


            SummerHeatRegistry.register("minecraft:taiga", SummerHeat.COOLER);
            ClimateDomainRegistry.register("minecraft:taiga", ClimateDomain.SUBARTIC);
            SummerHeatRegistry.register("minecraft:taiga_hills", SummerHeat.COOLER);
            ClimateDomainRegistry.register("minecraft:taiga_hills", ClimateDomain.SUBARTIC);
            SummerHeatRegistry.register("minecraft:snowy_taiga", SummerHeat.ICY);
            ClimateDomainRegistry.register("minecraft:snowy_taiga", ClimateDomain.SNOWY);
            SummerHeatRegistry.register("minecraft:snowy_taiga_hills", SummerHeat.ICY);
            ClimateDomainRegistry.register("minecraft:snowy_taiga_hills", ClimateDomain.SNOWY);
            SummerHeatRegistry.register("minecraft:giant_tree_taiga", SummerHeat.COOLER);
            ClimateDomainRegistry.register("minecraft:giant_tree_taiga", ClimateDomain.SUBARTIC);
            SummerHeatRegistry.register("minecraft:giant_tree_taiga_hills", SummerHeat.COOLER);
            ClimateDomainRegistry.register("minecraft:giant_tree_taiga_hills", ClimateDomain.SUBARTIC);
            SummerHeatRegistry.register("minecraft:taiga_mountains", SummerHeat.COOLER);
            ClimateDomainRegistry.register("minecraft:taiga_mountains", ClimateDomain.SUBARTIC);
            SummerHeatRegistry.register("minecraft:snowy_taiga_mountains", SummerHeat.ICY);
            SummerHeatRegistry.register("minecraft:giant_spruce_taiga", SummerHeat.COOLER);
            SummerHeatRegistry.register("minecraft:giant_spruce_taiga_hills", SummerHeat.COOLER);


            SummerHeatRegistry.register("minecraft:swamp", SummerHeat.HOT);
            SummerHeatRegistry.register("minecraft:swamp_hills", SummerHeat.HOT);




            SummerHeatRegistry.register("minecraft:snowy_tundra", SummerHeat.ICY);
            SummerHeatRegistry.register("minecraft:snowy_mountains", SummerHeat.ICY);


            SummerHeatRegistry.register("minecraft:mushroom_fields", SummerHeat.HOT);
            SummerHeatRegistry.register("minecraft:mushroom_fields_shore", SummerHeat.HOT);


            SummerHeatRegistry.register("minecraft:beach", SummerHeat.HOT); //Cfa temperate beach
            SummerHeatRegistry.register("minecraft:stone_shore", SummerHeat.COOLER);
            SummerHeatRegistry.register("minecraft:snowy_beach", SummerHeat.ICY);


            SummerHeatRegistry.register("minecraft:jungle", SummerHeat.HOT);
            SummerHeatRegistry.register("minecraft:jungle_hills", SummerHeat.HOT);
            SummerHeatRegistry.register("minecraft:jungle_edge", SummerHeat.HOT);
            SummerHeatRegistry.register("minecraft:modified_jungle", SummerHeat.HOT);
            SummerHeatRegistry.register("minecraft:modified_jungle_edge", SummerHeat.HOT);


            SummerHeatRegistry.register("minecraft:birch_forest", SummerHeat.WARM);
            SummerHeatRegistry.register("minecraft:birch_forest_hills", SummerHeat.WARM);
            SummerHeatRegistry.register("minecraft:tall_birch_forest", SummerHeat.WARM);
            SummerHeatRegistry.register("minecraft:tall_birch_hills", SummerHeat.WARM);


            SummerHeatRegistry.register("minecraft:dark_forest", SummerHeat.WARM);
            SummerHeatRegistry.register("minecraft:dark_forest_hills", SummerHeat.WARM);


            SummerHeatRegistry.register("minecraft:savanna", SummerHeat.HOT);
            SummerHeatRegistry.register("minecraft:savanna_plateau", SummerHeat.HOT);


            SummerHeatRegistry.register("minecraft:badlands", SummerHeat.SCHORCHING);
            SummerHeatRegistry.register("minecraft:wooded_badlands_plateau", SummerHeat.WARM);
            SummerHeatRegistry.register("minecraft:badlands_plateau", SummerHeat.WARM);


            SummerHeatRegistry.register("minecraft:ice_spikes", SummerHeat.ICY);





            SummerHeatRegistry.register("minecraft:modified_gravelly_mountains", SummerHeat.TUNDRA_COLD);
            SummerHeatRegistry.register("minecraft:shattered_savanna", SummerHeat.HOT);
            SummerHeatRegistry.register("minecraft:shattered_savanna_plateau", SummerHeat.HOT);
            SummerHeatRegistry.register("minecraft:eroded_badlands", SummerHeat.SCHORCHING);
            SummerHeatRegistry.register("minecraft:modified_wooded_badlands_plateau", SummerHeat.WARM);
            SummerHeatRegistry.register("minecraft:modified_badlands_plateau", SummerHeat.WARM);
            SummerHeatRegistry.register("minecraft:bamboo_jungle", SummerHeat.HOT);
            SummerHeatRegistry.register("minecraft:bamboo_jungle_hills", SummerHeat.HOT);

            SummerHeatRegistry.register("caiocesarbiomes:bamboo_subtropical_laurel_jungle", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:coastal_subtropical_desert", SummerHeat.WARM);
            SummerHeatRegistry.register("caiocesarbiomes:coastal_subtropical_desert_lomas", SummerHeat.WARM);
            SummerHeatRegistry.register("caiocesarbiomes:tropical_pine_island", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:cork_oak_savanna", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:cork_oak_beach", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:dry_tropical_beach", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:eucalyptus_plains", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:eucalyptus_sahel", SummerHeat.SCHORCHING);
            SummerHeatRegistry.register("caiocesarbiomes:eucalyptus_savanna", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:ginkgo_forest", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:gravel_tundra", SummerHeat.TUNDRA_COLD);
            SummerHeatRegistry.register("caiocesarbiomes:hemiboreal_forest", SummerHeat.WARM);
            SummerHeatRegistry.register("caiocesarbiomes:hemiboreal_steppe", SummerHeat.WARM);
            SummerHeatRegistry.register("caiocesarbiomes:hot_mediterranean_beach", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:humid_subtropical_beach", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:humid_subtropical_pine_forest", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:inactive_volcanic_site", SummerHeat.WARM);
            SummerHeatRegistry.register("caiocesarbiomes:japanese_maple_grove", SummerHeat.WARM); //Japanese maples wouldn't thrive well in such way (without the forest's protection) in a hot summer climate
            SummerHeatRegistry.register("caiocesarbiomes:lush_southern_tundra", SummerHeat.TUNDRA_COLD);
            SummerHeatRegistry.register("caiocesarbiomes:mediterranean_conifer_savanna", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:mediterranean_conifer_savanna_beach", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:mediterranean_oak_woodland", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:mediterranean_scrubland", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:monsoon_ficus_tropical_forest", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:oleander_gardens", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:montane_laurel_grove", SummerHeat.WARM);
            SummerHeatRegistry.register("caiocesarbiomes:olive_grove", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:olive_grove_beach", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:pewen_coniferous_grove", SummerHeat.COOLER);
            SummerHeatRegistry.register("caiocesarbiomes:sahel", SummerHeat.SCHORCHING);
            SummerHeatRegistry.register("caiocesarbiomes:salt_desert", SummerHeat.SCHORCHING);
            SummerHeatRegistry.register("caiocesarbiomes:socotra_dryland", SummerHeat.SCHORCHING);
            SummerHeatRegistry.register("caiocesarbiomes:southern_beech_forest", SummerHeat.COOLER);
            SummerHeatRegistry.register("caiocesarbiomes:stony_mediterranean_shore", SummerHeat.SCHORCHING);
            SummerHeatRegistry.register("caiocesarbiomes:subtropical_eucalyptus_dry_forest", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:subtropical_extreme_hills", SummerHeat.WARM);
            SummerHeatRegistry.register("caiocesarbiomes:subtropical_laurel_forest", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:subtropical_laurel_jungle", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:subtropical_pine_dry_forest", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:subtropical_seasonal_forest", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:temperate_desert", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:temperate_rainforest", SummerHeat.WARM);
            SummerHeatRegistry.register("caiocesarbiomes:tropical_bamboo_marsh", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:tropical_beach", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:tropical_desert", SummerHeat.SCHORCHING);
            SummerHeatRegistry.register("caiocesarbiomes:tropical_eucalyptus_dry_forest", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:tropical_seasonal_forest", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:tussock_tundra", SummerHeat.TUNDRA_COLD);
            SummerHeatRegistry.register("caiocesarbiomes:volcanic_site", SummerHeat.SCHORCHING);
            SummerHeatRegistry.register("caiocesarbiomes:mediterranean_oak_sparse_woodland", SummerHeat.HOT);

            SummerHeatRegistry.register("brbiomesmod:amazon_rainforest", SummerHeat.HOT);
            SummerHeatRegistry.register("brbiomesmod:amazon_varzea_forest", SummerHeat.HOT);
            SummerHeatRegistry.register("brbiomesmod:araucaria_plateau", SummerHeat.WARM);
            SummerHeatRegistry.register("brbiomesmod:atlantic_forest", SummerHeat.HOT);
            SummerHeatRegistry.register("brbiomesmod:atlantic_forest_hills", SummerHeat.WARM);
            SummerHeatRegistry.register("brbiomesmod:butia_pampas", SummerHeat.HOT);
            SummerHeatRegistry.register("brbiomesmod:caatinga_shrubland", SummerHeat.SCHORCHING);
            SummerHeatRegistry.register("brbiomesmod:cerrado", SummerHeat.HOT);
            SummerHeatRegistry.register("brbiomesmod:pampas_hills", SummerHeat.WARM);
            SummerHeatRegistry.register("brbiomesmod:dunas_restinga", SummerHeat.HOT);
            SummerHeatRegistry.register("brbiomesmod:pampas", SummerHeat.HOT);
            SummerHeatRegistry.register("brbiomesmod:pampas_coastal_fields", SummerHeat.HOT);
            SummerHeatRegistry.register("brbiomesmod:pantanal", SummerHeat.HOT);
            SummerHeatRegistry.register("brbiomesmod:restinga_beach", SummerHeat.HOT);
        });
    }
}
