package com.caiocesarmods.caiocesarbiomes;

import com.caiocesarmods.caiocesarbiomes.Potions.ModPotions;
import com.caiocesarmods.caiocesarbiomes.Util.ModSoundEvents;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.*;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.FoliagePlacers.ModFoliagePlacer;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.TreeDecorators.ModTreeDecorators;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.gen.ModBiomeGeneration;
import com.caiocesarmods.caiocesarbiomes.block.MiscBlocks;
import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
import com.caiocesarmods.caiocesarbiomes.block.ModWood;
import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import com.caiocesarmods.caiocesarbiomes.container.ModContainers;
import com.caiocesarmods.caiocesarbiomes.data.recipes.ModRecipeTypes;
import com.caiocesarmods.caiocesarbiomes.entity.ModEntityTypes;
import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import com.caiocesarmods.caiocesarbiomes.screen.ButterMixerScreen;
import com.caiocesarmods.caiocesarbiomes.screen.ToasterScreen;
import com.caiocesarmods.caiocesarbiomes.tileentity.ModTileEntities;
import net.minecraft.block.Block;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CaioCesarBiomesMod.MOD_ID)
public class CaioCesarBiomesMod
{
    public static final String MOD_ID = "caiocesarbiomes";

    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    public CaioCesarBiomesMod() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModPlants.register(eventBus);
        TreeBlocks.register(eventBus);
        ModWood.register(eventBus);
        MiscBlocks.register(eventBus);
        ModTreeDecorators.register(eventBus);

        ModPotions.register(eventBus);

        ModTileEntities.register(eventBus);
        ModContainers.register(eventBus);
        ModRecipeTypes.register(eventBus);
        ModSoundEvents.register(eventBus);

        ModEntityTypes.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::enqueueIMC);
        eventBus.addListener(this::processIMC);
        eventBus.addListener(this::doClientStuff);

        //Biomes
        MediterraneanConiferSavannaBiome.register(eventBus);
        MediterraneanOakWoodlandBiome.register(eventBus);
        MediterraneanScrublandBiome.register(eventBus);
        OleanderGardensBiome.register(eventBus);
        OliveGroveBiome.register(eventBus);
        CorkOakSavannaBiome.register(eventBus);
        SubtropicalSeasonalForestBiome.register(eventBus);
        BunyaPineSubtropicalSeasonalForestBiome.register(eventBus);
        BunyaPineSubtropicalLaurelForestBiome.register(eventBus);
        BunyaPineSubtropicalLaurelJungleBiome.register(eventBus);
        TropicalSeasonalForestBiome.register(eventBus);
        SubtropicalLaurelForestBiome.register(eventBus);
        SubtropicalLaurelJungleBiome.register(eventBus);
        BambooSubtropicalLaurelJungleBiome.register(eventBus);
        CoastalSubtropicalDesertBiome.register(eventBus);
        CoastalSubtropicalDesertLomas.register(eventBus);
        MontaneLaurelGroveBiome.register(eventBus);
        GravelTundraBiome.register(eventBus);
        SahelBiome.register(eventBus);
        TropicalBeachBiome.register(eventBus);
        TropicalEucalyptusDryForestBiome.register(eventBus);
        JapaneseMapleGroveBiome.register(eventBus);
        TussockTundraBiome.register(eventBus);
        SubtropicalEucalyptusDryForestBiome.register(eventBus);
        EucalyptusPlainsBiome.register(eventBus);
        HotMediterraneanBeachBiome.register(eventBus);
        HumidSubtropicalBeachBiome.register(eventBus);
        EucalyptusSahelBiome.register(eventBus);
        SouthernBeechForestBiome.register(eventBus);
        LushSouthernTundraBiome.register(eventBus);
        DryTropicalBeachBiome.register(eventBus);
        StonyMediterraneanShoreBiome.register(eventBus);
        CookPineIslandBiome.register(eventBus);
        PewenConiferousGrove.register(eventBus);
        MonsoonFicusTropicalForest.register(eventBus);
        HemiborealSteppeBiome.register(eventBus);
        TemperateRainforest.register(eventBus);
        HemiborealForestBiome.register(eventBus);
        SocotraTropicalDryland.register(eventBus);
        TropicalBambooMarsh.register(eventBus);
        SubtropicalExtremeHillsBiome.register(eventBus);
        SaltDesertBiome.register(eventBus);
        VolcanicSiteBiome.register(eventBus);
        InactiveVolcanicSiteBiome.register(eventBus);
        SubtropicalPineDryForestBiome.register(eventBus);
        EucalyptusSavanna.register(eventBus);
        TropicalDesertBiome.register(eventBus);
        GinkgoForestBiome.register(eventBus);
        MediterraneanConiferSavannaBiomeBeach.register(eventBus);
        TemperateDesert.register(eventBus);
        HumidSubtropicalPineForest.register(eventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        ModFoliagePlacer.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {

            ModBiomeGeneration.generateBiomes();

        });
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        event.enqueueWork(()-> {
            RenderTypeLookup.setRenderLayer(MiscBlocks.TOASTER.get(), RenderType.getCutout());

            ScreenManager.registerFactory(ModContainers.TOASTER_CONTAINER.get(), ToasterScreen::new);

            ScreenManager.registerFactory(ModContainers.BUTTER_MIXER_CONTAINER.get(), ButterMixerScreen::new);

        });
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {
        InterModComms.sendTo("caiocesarbiomes", "helloworld", () -> {
            LOGGER.info("Hello world from the MDK");
            return "Hello world";
        });
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
}
