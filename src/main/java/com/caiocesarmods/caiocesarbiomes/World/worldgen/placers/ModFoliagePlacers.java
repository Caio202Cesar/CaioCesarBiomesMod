package com.caiocesarmods.caiocesarbiomes.World.worldgen.placers;

import com.mojang.serialization.Codec;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.foliageplacer.FoliagePlacerType;

public class ModFoliagePlacers extends FoliagePlacerType {
    public ModFoliagePlacers(Codec codec) {
        super(codec);
    }

    public static final FoliagePlacerType<FoliagePlacer> ITALIAN_CYPRESS_FOLIAGE_PLACER_FOLIAGE_PLACER_TYPE =
            register("italian_cypress_foliage_placer", ItalianCypressFoliagePlacer.CODEC);

    private static <P extends FoliagePlacer> FoliagePlacerType<P> register(String name, Codec<P> codec) {
        return Registry.register(Registry.FOLIAGE_PLACER_TYPE, name, new FoliagePlacerType<>(codec));
    }
}
