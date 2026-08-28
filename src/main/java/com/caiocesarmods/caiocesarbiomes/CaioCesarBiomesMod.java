package com.caiocesarmods.caiocesarbiomes;

import com.caiocesarmods.caiocesarbiomes.Potions.ModPotions;
import com.caiocesarmods.caiocesarbiomes.Util.ModSoundEvents;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.ContinentalTemperateBiomes.GinkgoForestBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.ContinentalTemperateBiomes.HemiborealForestBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.ContinentalTemperateBiomes.HemiborealSteppeBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.ContinentalTemperateBiomes.JapaneseMapleGroveBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.MildDesertBiomes.CoastalSubtropicalDesertBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.MildDesertBiomes.CoastalSubtropicalDesertLomas;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.SpecialBiomes.InactiveVolcanicSiteBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.SpecialBiomes.SaltDesertBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.SpecialBiomes.VolcanicSiteBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.SubtropicalBiomes.*;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.TemperateBiomes.*;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.TropicalBiomes.*;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.TundraBiomes.GravelTundraBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.TundraBiomes.LushSouthernTundraBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.TundraBiomes.TussockTundraBeach;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.TundraBiomes.TussockTundraBiome;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.ModBiomeRelationships;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.FoliagePlacers.ModFoliagePlacer;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.TreeDecorators.ModTreeDecorators;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.ModBiomeGeneration;
import com.caiocesarmods.caiocesarbiomes.block.MiscBlocks;
import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
import com.caiocesarmods.caiocesarbiomes.block.ModWood;
import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import com.caiocesarmods.caiocesarbiomes.client.renderer.entity.DesertMerchantRenderer;
import com.caiocesarmods.caiocesarbiomes.client.renderer.entity.MediterraneanMerchantRenderer;
import com.caiocesarmods.caiocesarbiomes.container.ModContainers;
import com.caiocesarmods.caiocesarbiomes.data.recipes.ModRecipeTypes;
import com.caiocesarmods.caiocesarbiomes.entity.ModEntityTypes;
import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import com.caiocesarmods.caiocesarbiomes.screen.ButterMixerScreen;
import com.caiocesarmods.caiocesarbiomes.screen.ToasterScreen;
import com.caiocesarmods.caiocesarbiomes.tileentity.ModTileEntities;
import com.google.common.collect.ImmutableMap;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.AxeItem;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
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
        SubtropicalEucalyptusForestBiome.register(eventBus);
        EucalyptusPlainsBiome.register(eventBus);
        EucalyptusPlainsBeach.register(eventBus);
        EucalyptusPlainsRiver.register(eventBus);
        HotMediterraneanBeachBiome.register(eventBus);
        LaurelForestSubtropicalBeach.register(eventBus);
        EucalyptusSahelBiome.register(eventBus);
        MagellanicSubpolarForestBiome.register(eventBus);
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
        MediterraneanPineForestBiome.register(eventBus);
        EucalyptusSavanna.register(eventBus);
        TropicalDesertBiome.register(eventBus);
        GinkgoForestBiome.register(eventBus);
        MediterraneanConiferLimestoneBeach.register(eventBus);
        TemperateDesert.register(eventBus);
        TemperateDesertOasis.register(eventBus);
        TemperateDesertRiver.register(eventBus);
        HumidSubtropicalPineForest.register(eventBus);
        HumidSubtropicalPineBeach.register(eventBus);
        HumidSubtropicalPineRiver.register(eventBus);
        MediterraneanOakSparseWoodlandBiome.register(eventBus);
        TropicalIslandBiome.register(eventBus);
        CorkOakBeach.register(eventBus);
        OliveGroveBeach.register(eventBus);
        TropicalBambooMarshRiver.register(eventBus);
        MediterraneanScrublandRiver.register(eventBus);
        TropicalBambooBeachBiome.register(eventBus);
        TussockTundraBeach.register(eventBus);
        ValdivianTemperateRainforest.register(eventBus);
        ValdivianColunBeach.register(eventBus);
        SubtropicalEvergreenOakForestBeach.register(eventBus);
        SubtropicalEvergreenOakForestRiver.register(eventBus);
        MediterraneanSavannaRiver.register(eventBus);
        LaurelForestRiver.register(eventBus);
        LaurelJungleSubtropicalBeach.register(eventBus);
        MontaneCloudJungle.register(eventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        ModFoliagePlacer.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModEntityTypes.ENTITY_TYPES.register(eventBus);

    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {

            AxeItem.BLOCK_STRIPPING_MAP = new ImmutableMap.Builder<Block, Block>().putAll(AxeItem.BLOCK_STRIPPING_MAP)
                    .put(ModWood.LYCHEE_LOG.get(), ModWood.STRIPPED_LYCHEE_LOG.get())
                    .put(ModWood.LYCHEE_WOOD.get(), ModWood.STRIPPED_LYCHEE_WOOD.get())
                    .put(ModWood.LAUREL_LOG.get(), ModWood.STRIPPED_LAUREL_LOG.get())
                    .put(ModWood.LAUREL_WOOD.get(), ModWood.STRIPPED_LAUREL_WOOD.get())
                    .put(ModWood.CINNAMON_LOG.get(),  ModWood.STRIPPED_LAUREL_LOG.get())
                    .put(ModWood.CINNAMON_WOOD.get(), ModWood.STRIPPED_LAUREL_WOOD.get())
                    .put(ModWood.PRIVET_LOG.get(), ModWood.STRIPPED_PRIVET_LOG.get())
                    .put(ModWood.PRIVET_WOOD.get(), ModWood.STRIPPED_PRIVET_WOOD.get())
                    .put(ModWood.CAMPHOR_LOG.get(), ModWood.STRIPPED_CAMPHOR_LOG.get())
                    .put(ModWood.CAMPHOR_WOOD.get(), ModWood.STRIPPED_CAMPHOR_WOOD.get())
                    .put(ModWood.PATAGONIAN_CYPRESS_LOG.get(), ModWood.STRIPPED_CYPRESS_LOG.get())
                    .put(ModWood.PATAGONIAN_CYPRESS_WOOD.get(), ModWood.STRIPPED_CYPRESS_WOOD.get())
                    .put(ModWood.ITALIAN_CYPRESS_LOG.get(), ModWood.STRIPPED_CYPRESS_LOG.get())
                    .put(ModWood.ITALIAN_CYPRESS_WOOD.get(), ModWood.STRIPPED_CYPRESS_WOOD.get())
                    .put(ModWood.EUCALYPTUS_LOG.get(), ModWood.STRIPPED_MYRTACEAE_LOG.get())
                    .put(ModWood.EUCALYPTUS_WOOD.get(), ModWood.STRIPPED_MYRTACEAE_WOOD.get())
                    .put(ModWood.RAINBOW_EUCALYPTUS_LOG.get(), ModWood.STRIPPED_MYRTACEAE_LOG.get())
                    .put(ModWood.RAINBOW_EUCALYPTUS_WOOD.get(), ModWood.STRIPPED_MYRTACEAE_WOOD.get())
                    .put(ModWood.STONE_OAK_LOG.get(), ModWood.STRIPPED_STONE_OAK_LOG.get())
                    .put(ModWood.STONE_OAK_WOOD.get(), ModWood.STRIPPED_STONE_OAK_WOOD.get())
                    .put(ModWood.CASTANOPSIS_LOG.get(), ModWood.STRIPPED_CASTANOPSIS_LOG.get())
                    .put(ModWood.CASTANOPSIS_WOOD.get(), ModWood.STRIPPED_CASTANOPSIS_WOOD.get())
                    .put(ModWood.BAOBAB_LOG.get(), ModWood.STRIPPED_BAOBAB_LOG.get())
                    .put(ModWood.BAOBAB_WOOD.get(), ModWood.STRIPPED_BAOBAB_WOOD.get())
                    .put(ModWood.LAUREL_OAK_LOG.get(), ModWood.STRIPPED_LAUREL_OAK_LOG.get())
                    .put(ModWood.LAUREL_OAK_WOOD.get(), ModWood.STRIPPED_LAUREL_OAK_WOOD.get())
                    .put(ModWood.CHAMPAK_LOG.get(), ModWood.STRIPPED_CHAMPAK_LOG.get())
                    .put(ModWood.CHAMPAK_WOOD.get(), ModWood.STRIPPED_CHAMPAK_WOOD.get())
                    .put(ModWood.PAPERBARK_LOG.get(), ModWood.STRIPPED_MYRTACEAE_LOG.get())
                    .put(ModWood.PAPERBARK_WOOD.get(), ModWood.STRIPPED_MYRTACEAE_WOOD.get())
                    .put(ModWood.AGATHIS_LOG.get(), ModWood.STRIPPED_AGATHIS_LOG.get())
                    .put(ModWood.AGATHIS_WOOD.get(), ModWood.STRIPPED_AGATHIS_WOOD.get())
                    .put(ModWood.RING_CUPPED_OAK_LOG.get(), Blocks.STRIPPED_OAK_LOG)
                    .put(ModWood.RING_CUPPED_OAK_WOOD.get(), Blocks.STRIPPED_OAK_WOOD)
                    .put(ModWood.LIVE_OAK_LOG.get(), Blocks.STRIPPED_OAK_LOG)
                    .put(ModWood.LIVE_OAK_WOOD.get(), Blocks.STRIPPED_OAK_WOOD)
                    .put(ModWood.BLACKWOOD_ACACIA_LOG.get(), Blocks.STRIPPED_ACACIA_LOG)
                    .put(ModWood.BLACKWOOD_ACACIA_WOOD.get(), Blocks.STRIPPED_ACACIA_WOOD)
                    .put(ModWood.SAND_LAUREL_OAK_LOG.get(), Blocks.STRIPPED_OAK_LOG)
                    .put(ModWood.SAND_LAUREL_OAK_WOOD.get(), Blocks.STRIPPED_OAK_WOOD)
                    .put(ModWood.PODOCARPUS_LOG.get(), ModWood.STRIPPED_PODOCARPUS_LOG.get())
                    .put(ModWood.PODOCARPUS_WOOD.get(), ModWood.STRIPPED_PODOCARPUS_WOOD.get())
                    .put(ModWood.WEEPING_WILLOW_LOG.get(), ModWood.STRIPPED_WILLOW_LOG.get())
                    .put(ModWood.WEEPING_WILLOW_WOOD.get(), ModWood.STRIPPED_WILLOW_WOOD.get())
                    .put(ModWood.MYRTACEAE_LOG.get(), ModWood.STRIPPED_MYRTACEAE_LOG.get())
                    .put(ModWood.MYRTACEAE_WOOD.get(), ModWood.STRIPPED_MYRTACEAE_WOOD.get())
                    .put(ModWood.ARAUCARIA_LOG.get(), ModWood.STRIPPED_ARAUCARIA_LOG.get())
                    .put(ModWood.ARAUCARIA_WOOD.get(), ModWood.STRIPPED_ARAUCARIA_WOOD.get())
                    .put(ModWood.MESQUITE_LOG.get(), ModWood.STRIPPED_MESQUITE_LOG.get())
                    .put(ModWood.MESQUITE_WOOD.get(), ModWood.STRIPPED_MESQUITE_WOOD.get())
                    .put(ModWood.BAYBERRY_LOG.get(), ModWood.STRIPPED_BAYBERRY_LOG.get())
                    .put(ModWood.BAYBERRY_WOOD.get(), ModWood.STRIPPED_BAYBERRY_WOOD.get())
                    .put(ModWood.BALD_CYPRESS_LOG.get(), ModWood.STRIPPED_BALD_CYPRESS_LOG.get())
                    .put(ModWood.BALD_CYPRESS_WOOD.get(), ModWood.STRIPPED_BALD_CYPRESS_WOOD.get())
                    .put(ModWood.BEECH_LOG.get(), ModWood.STRIPPED_BEECH_LOG.get())
                    .put(ModWood.BEECH_WOOD.get(), ModWood.STRIPPED_BEECH_WOOD.get())
                    .put(ModWood.COTTONWOOD_LOG.get(), ModWood.STRIPPED_COTTONWOOD_LOG.get())
                    .put(ModWood.COTTONWOOD_WOOD.get(), ModWood.STRIPPED_COTTONWOOD_WOOD.get())
                    .put(ModWood.TEA_LOG.get(), ModWood.STRIPPED_TEA_LOG.get())
                    .put(ModWood.TEA_WOOD.get(), ModWood.STRIPPED_TEA_WOOD.get())
                    .put(ModWood.CAROB_LOG.get(), ModWood.STRIPPED_CAROB_LOG.get())
                    .put(ModWood.CAROB_WOOD.get(), ModWood.STRIPPED_CAROB_WOOD.get())
                    .put(ModWood.CANARY_PINE_LOG.get(), ModWood.STRIPPED_PINE_LOG.get())
                    .put(ModWood.CANARY_PINE_WOOD.get(), ModWood.STRIPPED_PINE_WOOD.get())
                    .put(ModWood.CASUARINA_LOG.get(), ModWood.STRIPPED_CASUARINA_LOG.get())
                    .put(ModWood.CASUARINA_WOOD.get(), ModWood.STRIPPED_CASUARINA_WOOD.get())
                    .put(ModWood.CITRUS_LOG.get(), ModWood.STRIPPED_CITRUS_LOG.get())
                    .put(ModWood.CITRUS_WOOD.get(), ModWood.STRIPPED_CITRUS_WOOD.get())
                    .put(ModWood.CHINESE_RED_PINE_LOG.get(), ModWood.STRIPPED_PINE_LOG.get())
                    .put(ModWood.CHINESE_RED_PINE_WOOD.get(), ModWood.STRIPPED_PINE_WOOD.get())
                    .put(ModWood.CRAPE_MYRTLE_LOG.get(), ModWood.STRIPPED_CRAPE_MYRTLE_LOG.get())
                    .put(ModWood.CRAPE_MYRTLE_WOOD.get(), ModWood.STRIPPED_CRAPE_MYRTLE_WOOD.get())
                    .put(ModWood.POMEGRANATE_LOG.get(), ModWood.STRIPPED_CRAPE_MYRTLE_LOG.get())
                    .put(ModWood.POMEGRANATE_WOOD.get(), ModWood.STRIPPED_CRAPE_MYRTLE_WOOD.get())
                    .put(ModWood.COAST_COTTONWOOD_LOG.get(), ModWood.STRIPPED_COAST_COTTONWOOD_LOG.get())
                    .put(ModWood.COAST_COTTONWOOD_WOOD.get(), ModWood.STRIPPED_COAST_COTTONWOOD_WOOD.get())
                    .put(ModWood.CORK_OAK_LOG.get(), ModWood.STRIPPED_CORK_OAK_LOG.get())
                    .put(ModWood.CORK_OAK_WOOD.get(), ModWood.STRIPPED_CORK_OAK_WOOD.get())
                    .build();

            ModBiomeGeneration.generateBiomes();
            ModBiomeRelationships.register();

        });
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        event.enqueueWork(()-> {
            RenderTypeLookup.setRenderLayer(MiscBlocks.TOASTER.get(), RenderType.getCutout());

            ScreenManager.registerFactory(ModContainers.TOASTER_CONTAINER.get(), ToasterScreen::new);

            ScreenManager.registerFactory(ModContainers.BUTTER_MIXER_CONTAINER.get(), ButterMixerScreen::new);

        });

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.MEDITERRANEAN_MERCHANT.get(), MediterraneanMerchantRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.DESERT_MERCHANT.get(), DesertMerchantRenderer::new);

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
