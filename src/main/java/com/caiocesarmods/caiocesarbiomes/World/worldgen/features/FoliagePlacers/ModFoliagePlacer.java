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

    public static final RegistryObject<FoliagePlacerType<BananaFoliagePlacer>> BANANA_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("banana_foliage_placer",
                    () -> new FoliagePlacerType<>(BananaFoliagePlacer.CODEC));

    public static final RegistryObject<FoliagePlacerType<WeepingFoliagePlacer>> WEEPING_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("weeping_foliage_placer",
                    () -> new FoliagePlacerType<>(WeepingFoliagePlacer.CODEC));

    public static final RegistryObject<FoliagePlacerType<VirginianaFoliagePlacer>> VIRGINIANA_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("virginiana_foliage_placer",
                    () -> new FoliagePlacerType<>(VirginianaFoliagePlacer.CODEC));

    public static final RegistryObject<FoliagePlacerType<DesertRoseFoliagePlacer>> DESERT_ROSE_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("desert_rose_foliage_placer",
                    () -> new FoliagePlacerType<>(DesertRoseFoliagePlacer.CODEC));

    public static final RegistryObject<FoliagePlacerType<YewFoliagePlacer>> YEW_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("yew_foliage_placer",
                    () -> new FoliagePlacerType<>(YewFoliagePlacer.CODEC));

    public static final RegistryObject<FoliagePlacerType<RoyalPoincianaFoliagePlacer>> ROYAL_POINCIANA_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("royal_poinciana_foliage_placer",
                    () -> new FoliagePlacerType<>(RoyalPoincianaFoliagePlacer.CODEC));

    public static final RegistryObject<FoliagePlacerType<JapanesePineFoliagePlacer>> JAPANESE_PINE_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("japanese_pine_foliage_placer",
                    () -> new FoliagePlacerType<>(JapanesePineFoliagePlacer.CODEC));

    public static void register(IEventBus eventBus) {
        FOLIAGE_PLACERS.register(eventBus);
    }
}

