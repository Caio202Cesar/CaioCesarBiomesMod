package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.FoliagePlacers;

import net.minecraft.world.gen.foliageplacer.FoliagePlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModFoliagePlacer {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS =
            DeferredRegister.create(ForgeRegistries.FOLIAGE_PLACER_TYPES, "caiocesarbiomes");

    public static final RegistryObject<FoliagePlacerType<CanaryDateFoliagePlacer>> CANARY_DATE_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("canary_date_foliage_placer",
                    () -> new FoliagePlacerType<>(CanaryDateFoliagePlacer.CODEC));

    public static final RegistryObject<FoliagePlacerType<CoconutFoliagePlacer>> COCONUT_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("coconut_foliage_placer",
                    () -> new FoliagePlacerType<>(CoconutFoliagePlacer.CODEC));

    public static void register(IEventBus eventBus) {
        FOLIAGE_PLACERS.register(eventBus);
    }
}

