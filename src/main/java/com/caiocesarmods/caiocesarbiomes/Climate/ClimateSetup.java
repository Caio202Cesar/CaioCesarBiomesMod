package com.caiocesarmods.caiocesarbiomes.Climate;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClimateSetup {

    @SubscribeEvent
    public static void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            SummerHeatRegistry.register("minecraft:desert", SummerHeat.SCHORCHING);
            SummerHeatRegistry.register("minecraft:savanna", SummerHeat.HOT);
            SummerHeatRegistry.register("minecraft:jungle", SummerHeat.HOT);
            SummerHeatRegistry.register("minecraft:plains", SummerHeat.HOT);
            SummerHeatRegistry.register("minecraft:forest", SummerHeat.HOT);
            SummerHeatRegistry.register("minecraft:taiga", SummerHeat.COOLER);
            SummerHeatRegistry.register("minecraft:snowy_tundra", SummerHeat.COLD);
            SummerHeatRegistry.register("minecraft:dark_forest", SummerHeat.WARM);

            SummerHeatRegistry.register("caiocesarbiomes:bamboo_subtropical_laurel_jungle", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:bunya_subtropical_laurel_forest", SummerHeat.HOT);

            SummerHeatRegistry.register("caiocesarbiomes:coastal_subtropical_desert", SummerHeat.WARM);
            SummerHeatRegistry.register("caiocesarbiomes:coastal_subtropical_desert_lomas", SummerHeat.WARM);
            SummerHeatRegistry.register("caiocesarbiomes:tropical_pine_island", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:cork_oak_savanna", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:dry_tropical_beach", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:eucalyptus_plains", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:eucalyptus_sahel", SummerHeat.SCHORCHING);
            SummerHeatRegistry.register("caiocesarbiomes:eucalyptus_savanna", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:ginkgo_forest", SummerHeat.HOT);
            SummerHeatRegistry.register("caiocesarbiomes:gravel_tundra", SummerHeat.COLD);
            SummerHeatRegistry.register("caiocesarbiomes:hemiboreal_forest", SummerHeat.WARM);
            SummerHeatRegistry.register("caiocesarbiomes:hemiboreal_steppe", SummerHeat.WARM);


            SummerHeatRegistry.register("caiocesarbiomes:pewen_coniferous_grove", SummerHeat.WARM);


            SummerHeatRegistry.register("caiocesarbiomes:southern_beech_forest", SummerHeat.COOLER);

        });
    }
}
