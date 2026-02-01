package com.caiocesarmods.caiocesarbiomes;

import com.caiocesarmods.caiocesarbiomes.Util.CompostingHelper;
import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = "caiocesarbiomes", bus = Mod.EventBusSubscriber.Bus.MOD)
public class ComposterHandler {
    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            CompostingHelper.registerCompostable(ModItems.AVOCADO.get(), 0.65F);
            CompostingHelper.registerCompostable(ModItems.FIGFRUIT.get(), 0.65F);
            CompostingHelper.registerCompostable(ModItems.WHITE_FIG.get(), 0.65F);
            CompostingHelper.registerCompostable(ModItems.SYCAMORE_FIG.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.POMEGRANATE.get(), 0.65F);
            CompostingHelper.registerCompostable(ModItems.OLIVES.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.ARBUTUS.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.MULBERRIES.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.LOQUAT.get(), 0.65F);
            CompostingHelper.registerCompostable(ModItems.MANDARIN.get(), 0.65F);
            CompostingHelper.registerCompostable(ModItems.ORANGE.get(), 0.65F);
            CompostingHelper.registerCompostable(ModItems.LEMON.get(), 0.65F);
            CompostingHelper.registerCompostable(ModItems.STARFRUIT.get(), 0.65F);
            CompostingHelper.registerCompostable(ModItems.STARFRUIT_SLICE.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.CITRON.get(), 0.65F);
            CompostingHelper.registerCompostable(ModItems.BUDDHA_HAND_CITRON.get(), 0.65F);
            CompostingHelper.registerCompostable(ModItems.TAHITI_LIME.get(), 0.65F);
            CompostingHelper.registerCompostable(ModItems.GRAPEFRUIT.get(), 0.65F);
            CompostingHelper.registerCompostable(ModItems.ELDERBERRIES.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.CHERRY_PLUM.get(), 0.65F);
            CompostingHelper.registerCompostable(ModItems.DATES.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.TAMARINDS.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.COCONUT.get(), 0.85F);
            CompostingHelper.registerCompostable(ModItems.GREEN_COCONUT.get(), 1.0F);
            CompostingHelper.registerCompostable(ModItems.PECAN_NUT.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.YEW_BERRIES.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.YEW_ARILS.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.SWEET_CHESTNUT.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.MANGO.get(), 0.65F);
            CompostingHelper.registerCompostable(ModItems.UNRIPE_MANGO.get(), 0.5F);
            CompostingHelper.registerCompostable(ModItems.BLUEBERRIES.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.PISTACHIO.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.WALNUT.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.BREADFRUIT.get(), 0.65F);
            CompostingHelper.registerCompostable(ModItems.MARULA.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.RIPE_MARULA.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.ROWAN_BERRIES.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.HAWTHORN_BERRIES.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.DURIAN.get(), 0.65F);
            CompostingHelper.registerCompostable(ModItems.KIWI_FRUITS.get(), 0.65F);
            CompostingHelper.registerCompostable(ModItems.HAZELNUTS.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.COCONUT_SPROUT.get(), 0.85F);
            CompostingHelper.registerCompostable(ModItems.CAROB_BEANS.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.JUNIPER_BERRIES.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.UNRIPE_CREEPING_FIG.get(), 0.5F);
            CompostingHelper.registerCompostable(ModItems.RIPE_CREEPING_FIG.get(), 0.65F);
            CompostingHelper.registerCompostable(ModItems.FENNEL_STALK.get(), 0.65F);
            CompostingHelper.registerCompostable(ModItems.PERSIMMON.get(), 0.65F);
            CompostingHelper.registerCompostable(ModItems.RED_CURRANT.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.BLACK_CURRANT.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.JACKALBERRY.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.PEPPERCORN.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.RIPE_PEPPERCORN.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.INKBERRY.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.CLOUDBERRY.get(), 0.3F);
            CompostingHelper.registerCompostable(ModItems.BANANA.get(), 0.65F);
            CompostingHelper.registerCompostable(ModItems.CALABASH.get(), 0.65F);
            CompostingHelper.registerCompostable(ModItems.CRABAPPLES.get(), 0.65F);
            CompostingHelper.registerCompostable(ModItems.PEACH.get(), 0.65F);

        });
    }
}
