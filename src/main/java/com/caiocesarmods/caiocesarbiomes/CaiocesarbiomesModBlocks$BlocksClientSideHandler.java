package com.caiocesarmods.caiocesarbiomes;

import com.caiocesarmods.caiocesarbiomes.block.*;
import com.caiocesarmods.caiocesarbiomes.block.Saplings.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(
        bus = Mod.EventBusSubscriber.Bus.MOD,
        value = {Dist.CLIENT}
)

public class CaiocesarbiomesModBlocks$BlocksClientSideHandler {
    public CaiocesarbiomesModBlocks$BlocksClientSideHandler() {
    }

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {

        DesertRosePlant.registerRenderLayer();
        CreepingFigVine.registerRenderLayer();
        SpanishMoss.registerRenderLayer();
        MediterraneanFlower.registerRenderLayer();
        SubtropicalForestPlant.registerRenderLayer();
        ModTallPlant.registerRenderLayer();
        ModGrasses.registerRenderLayer();

        AvocadoSapling.registerRenderLayer();
        BlueSpruceSapling.registerRenderLayer();
        CamelliaSapling.registerRenderLayer();
        CherryPlumSapling.registerRenderLayer();
        CoastCottonwoodSapling.registerRenderLayer();
        CorkOakSapling.registerRenderLayer();
        DarkPinkOleanderSapling.registerRenderLayer();
        EucalyptusSapling.registerRenderLayer();
        ElderberrySapling.registerRenderLayer();
        FigSapling.registerRenderLayer();
        HolmOakSapling.registerRenderLayer();
        IndianCoralSapling.registerRenderLayer();
        ItalianCypressSapling.registerRenderLayer();
        JapaneseMapleSapling.registerRenderLayer();
        LemonSapling.registerRenderLayer();
        LoquatSapling.registerRenderLayer();
        MandarinSapling.registerRenderLayer();
        MesquiteSapling.registerRenderLayer();
        MulberrySapling.registerRenderLayer();
        OcoteaForestSapling.registerRenderLayer();
        OcoteaJungleSapling.registerRenderLayer();
        OliveSapling.registerRenderLayer();
        OrangeSapling.registerRenderLayer();
        PinkCrabappleSapling.registerRenderLayer();
        PinkCrapeMyrtleSapling.registerRenderLayer();
        PinkOleanderSapling.registerRenderLayer();
        PomegranateSapling.registerRenderLayer();
        PohutukawaSapling.registerRenderLayer();
        PurpleCrapeMyrtleSapling.registerRenderLayer();
        RedCrapeMyrtleSapling.registerRenderLayer();
        RedKapokSapling.registerRenderLayer();
        RedOleanderSapling.registerRenderLayer();
        RoyalPoincianaSapling.registerRenderLayer();
        StarfruitSapling.registerRenderLayer();
        SouthernMagnoliaSapling.registerRenderLayer();
        SouthernWaxMyrtleSapling.registerRenderLayer();
        StonePineSapling.registerRenderLayer();
        StrawberryTreeSapling.registerRenderLayer();
        TamarindSapling.registerRenderLayer();
        TeaSapling.registerRenderLayer();
        TropicalAlmondSapling.registerRenderLayer();
        WhiteCrabappleSapling.registerRenderLayer();
        WhiteCrapeMyrtleSapling.registerRenderLayer();
        WhiteOleanderSapling.registerRenderLayer();
    }
}
