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
            SummerHeatRegistry.register(Biomes.DESERT, SummerHeat.HOT);
            SummerHeatRegistry.register(Biomes.SAVANNA, SummerHeat.HOT);
            SummerHeatRegistry.register(Biomes.JUNGLE, SummerHeat.HOT);
            SummerHeatRegistry.register(Biomes.PLAINS, SummerHeat.HOT);
            SummerHeatRegistry.register(Biomes.FOREST, SummerHeat.HOT);
            SummerHeatRegistry.register(Biomes.TAIGA, SummerHeat.COOLER);
            SummerHeatRegistry.register(Biomes.SNOWY_TUNDRA, SummerHeat.COLD);

        });
    }
}
