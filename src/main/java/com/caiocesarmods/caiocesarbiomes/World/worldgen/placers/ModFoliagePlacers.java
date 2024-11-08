package com.caiocesarmods.caiocesarbiomes.World.worldgen.placers;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.foliageplacer.FoliagePlacerType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = CaioCesarBiomesMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModFoliagePlacers {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS = DeferredRegister.create(ForgeRegistries.FOLIAGE_PLACER_TYPES,
            CaioCesarBiomesMod.MOD_ID);

    // Register the Italian Cypress foliage placer
    public static final RegistryObject<FoliagePlacerType<ItalianCypressFoliagePlacer>> ITALIAN_CYPRESS_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("italian_cypress_foliage_placer",
                    () -> new FoliagePlacerType<>(ItalianCypressFoliagePlacer.CODEC));

    public static void register(IEventBus eventBus) {
        FOLIAGE_PLACERS.register(eventBus);
    }
}
