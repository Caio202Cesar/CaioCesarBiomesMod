package com.caiocesarmods.caiocesarbiomes.Climate;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.BambooSubtropicalLaurelJungleBiome;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClimateSetup {

    @SubscribeEvent
    public static void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            SummerHeatRegistry.register("minecraft:desert", SummerHeat.HOT);
            SummerHeatRegistry.register("minecraft:savanna", SummerHeat.HOT);
            SummerHeatRegistry.register("minecraft:jungle", SummerHeat.HOT);

            SummerHeatRegistry.register("minecraft:plains", SummerHeat.HOT);
            SummerHeatRegistry.register("minecraft:forest", SummerHeat.HOT);

            SummerHeatRegistry.register("minecraft:taiga", SummerHeat.COOLER);
            SummerHeatRegistry.register("minecraft:snowy_tundra", SummerHeat.COLD);
        });
    }
}
