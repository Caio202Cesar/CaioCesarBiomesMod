package com.caiocesarmods.caiocesarbiomes;

import com.caiocesarmods.caiocesarbiomes.block.CreepingFigVine;
import com.caiocesarmods.caiocesarbiomes.block.DesertRosePlant;
import com.caiocesarmods.caiocesarbiomes.block.MediterraneanFlower;
import com.caiocesarmods.caiocesarbiomes.block.Saplings.*;
import com.caiocesarmods.caiocesarbiomes.block.SpanishMoss;
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

        AvocadoSapling.registerRenderLayer();
        BlueSpruceSapling.registerRenderLayer();
        CoastCottonwoodSapling.registerRenderLayer();
        CorkOakSapling.registerRenderLayer();
        DarkPinkOleanderSapling.registerRenderLayer();
        ElderberrySapling.registerRenderLayer();
        FigSapling.registerRenderLayer();
        HolmOakSapling.registerRenderLayer();
        IndianCoralSapling.registerRenderLayer();
        LoquatSapling.registerRenderLayer();
        MesquiteSapling.registerRenderLayer();
        OcoteaForestSapling.registerRenderLayer();
        OcoteaJungleSapling.registerRenderLayer();
        OliveSapling.registerRenderLayer();
        PinkCrabappleSapling.registerRenderLayer();
        PinkOleanderSapling.registerRenderLayer();
        PomegranateSapling.registerRenderLayer();
        PurpleCrapeMyrtleSapling.registerRenderLayer();
        RedCrapeMyrtleSapling.registerRenderLayer();
        RedOleanderSapling.registerRenderLayer();
        SouthernMagnoliaSapling.registerRenderLayer();
        SouthernWaxMyrtleSapling.registerRenderLayer();
        StonePineSapling.registerRenderLayer();
        StrawberryTreeSapling.registerRenderLayer();
        TropicalAlmondSapling.registerRenderLayer();
        WhiteCrabappleSapling.registerRenderLayer();
        WhiteCrapeMyrtleSapling.registerRenderLayer();
        WhiteOleanderSapling.registerRenderLayer();

    }
}
