package com.caiocesarmods.caiocesarbiomes;

import com.caiocesarmods.caiocesarbiomes.block.custom.Saplings.*;
import com.caiocesarmods.caiocesarbiomes.block.custom.TallPlants.*;
import com.caiocesarmods.caiocesarbiomes.block.custom.Vines.*;
import com.caiocesarmods.caiocesarbiomes.block.custom.crops.BlackCurrantCropBlock;
import com.caiocesarmods.caiocesarbiomes.block.custom.crops.CalabashCropBlock;
import com.caiocesarmods.caiocesarbiomes.block.custom.crops.FennelCropBlock;
import com.caiocesarmods.caiocesarbiomes.block.custom.crops.RedCurrantCropBlock;
import com.caiocesarmods.caiocesarbiomes.block.custom.fruiting.*;
import com.caiocesarmods.caiocesarbiomes.block.custom.plants.*;
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
        MediterraneanBeachFlower.registerRenderLayer();
        CropPlants.registerRenderLayer();
        FicusRootsPlantBlock.registerRenderLayer();
        SocotraCucumberLeavesVineBlock.registerRenderLayer();
        CoconutBunchBlock.registerRenderLayer();
        IvyVine.registerRenderLayer();
        KiwiVine.registerRenderLayer();
        PlantFanBlock.registerRenderLayer();
        PeppercornVine.registerRenderLayer();
        BaldCypressAerialRoot.registerRenderLayer();
        DateBunchBlock.registerRenderLayer();
        BananaFlowerBlock.registerRenderLayer();
        BananaBunchBlock.registerRenderLayer();
        BananaStalkBlock.registerRenderLayer();
        BananaGreenBunchBlock.registerRenderLayer();
        BunchberryPlant.registerRenderLayer();
        ModDesertPlant.registerRenderLayer();

        ModCactuses.registerRenderLayer();

        BlueberryBush.registerRenderLayer();
        BlueberryFloweringBush.registerRenderLayer();
        BlueberryFruitingBush.registerRenderLayer();
        InkberryBush.registerRenderLayer();
        CloudberryPlant.registerRenderLayer();

        RedCurrantCropBlock.registerRenderLayer();
        BlackCurrantCropBlock.registerRenderLayer();
        FennelCropBlock.registerRenderLayer();
        CalabashCropBlock.registerRenderLayer();

        AvocadoSapling.registerRenderLayer();
        BlackPoplarSapling.registerRenderLayer();
        BananaSapling.registerRenderLayer();
        CamelliaSapling.registerRenderLayer();
        CasuarinaSapling.registerRenderLayer();
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
        JapanesePineSapling.registerRenderLayer();
        LemonSapling.registerRenderLayer();
        LoquatSapling.registerRenderLayer();
        MandarinSapling.registerRenderLayer();
        MesquiteSapling.registerRenderLayer();
        MulberrySapling.registerRenderLayer();
        OcoteaSapling.registerRenderLayer();
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
        SouthernBeechSapling.registerRenderLayer();
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
        TahitiLimeSapling.registerRenderLayer();
        CitronSapling.registerRenderLayer();
        BuddhaHandSapling.registerRenderLayer();
        MonkeyPuzzleSapling.registerRenderLayer();
        CookPineSapling.registerRenderLayer();
        WeepingFigSapling.registerRenderLayer();
        IndianLaurelSapling.registerRenderLayer();
        BunyaPineSapling.registerRenderLayer();
        GrapefruitSapling.registerRenderLayer();
        YewSapling.registerRenderLayer();
        HollySapling.registerRenderLayer();
        DragonBloodSapling.registerRenderLayer();
        NorfolkPineSapling.registerRenderLayer();
        LiveOakSapling.registerRenderLayer();
        CooperBeechSapling.registerRenderLayer();
        RedOakSapling.registerRenderLayer();
        SocotraDesertRoseSapling.registerRenderLayer();
        WesternHemlockSapling.registerRenderLayer();
        SocotraCucumberSapling.registerRenderLayer();
        CanaryDateSapling.registerRenderLayer();
        SabalSapling.registerRenderLayer();
        CoconutSapling.registerRenderLayer();
        MangoSapling.registerRenderLayer();
        SweetChestnutSapling.registerRenderLayer();
        PlaneSapling.registerRenderLayer();
        DouglasFirSapling.registerRenderLayer();
        ChineseRedPineSapling.registerRenderLayer();
        CanaryPineSapling.registerRenderLayer();
        CarobSapling.registerRenderLayer();
        PonderosaPineSapling.registerRenderLayer();
        RowanSapling.registerRenderLayer();
        SausageTreeSapling.registerRenderLayer();
        SlashPineSapling.registerRenderLayer();
        WalnutSapling.registerRenderLayer();
        PersimmonSapling.registerRenderLayer();
        PecanSapling.registerRenderLayer();
        JackalberrySapling.registerRenderLayer();
        PinyonSapling.registerRenderLayer();
        MarulaSapling.registerRenderLayer();
        MugoPineSapling.registerRenderLayer();
        PistachioSapling.registerRenderLayer();
        BaldCypressSapling.registerRenderLayer();
        BismarckPalmSapling.registerRenderLayer();
        FremontPoplarSapling.registerRenderLayer();
        MountainHemlockSapling.registerRenderLayer();
        BlueSpruceSapling.registerRenderLayer();
        SycamoreFigSapling.registerRenderLayer();
        SubalpineFirSapling.registerRenderLayer();
        WhiteFirSapling.registerRenderLayer();
        HawthornSapling.registerRenderLayer();
        HazelnutSapling.registerRenderLayer();
        DurianSapling.registerRenderLayer();
        JuniperSapling.registerRenderLayer();
        OilPalmSapling.registerRenderLayer();
        LarchSapling.registerRenderLayer();
        BreadfruitSapling.registerRenderLayer();
        RedMapleSapling.registerRenderLayer();
        AspenSapling.registerRenderLayer();
        DateSapling.registerRenderLayer();
        PeachSapling.registerRenderLayer();
    }
}
