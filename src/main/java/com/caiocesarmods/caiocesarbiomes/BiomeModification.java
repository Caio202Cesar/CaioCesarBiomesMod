/*package com.caiocesarmods.caiocesarbiomes;

import net.minecraft.world.biome.Biomes;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = CaioCesarBiomesMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BiomeModification {

    @SubscribeEvent
    public static void onFMLCommonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {

            BiomeManager.removeBiome(
                    BiomeManager.BiomeType.WARM,
                    new BiomeManager.BiomeEntry(Biomes.JUNGLE_HILLS, 10)
            );

            BiomeManager.removeBiome(
                    BiomeManager.BiomeType.WARM,
                    new BiomeManager.BiomeEntry(Biomes.BAMBOO_JUNGLE_HILLS, 10)
            );

            BiomeManager.removeBiome(
                    BiomeManager.BiomeType.WARM,
                    new BiomeManager.BiomeEntry(Biomes.JUNGLE, 10)
            );

            BiomeManager.removeBiome(
                    BiomeManager.BiomeType.WARM,
                    new BiomeManager.BiomeEntry(Biomes.JUNGLE_HILLS, 10)
            );

        });
    }
}*/
