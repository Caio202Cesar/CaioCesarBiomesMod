package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import net.minecraft.world.gen.IExtendedNoiseRandom;
import net.minecraft.world.gen.LazyAreaLayerContext;
import net.minecraft.world.gen.area.IArea;
import net.minecraft.world.gen.area.IAreaFactory;
import net.minecraft.world.gen.area.LazyArea;
import net.minecraft.world.gen.layer.*;
import net.minecraft.world.gen.layer.traits.IAreaTransformer1;

import java.util.function.LongFunction;

public class CustomLayerUtil {
    public static Layer createLayers(long seed) {
        IAreaFactory<LazyArea> factory = buildOverworld(
                false,      // legacy
                4,          // biome size
                4,          // river size
                salt -> new LazyAreaLayerContext(25, seed, salt)
        );

        return new Layer(factory);
    }

    private static <T extends IArea, C extends IExtendedNoiseRandom<T>>
    IAreaFactory<T> buildOverworld(
            boolean legacy,
            int biomeSize,
            int riverSize,
            LongFunction<C> contextFactory)
    {
        IAreaFactory<T> iareafactory = IslandLayer.INSTANCE.apply(contextFactory.apply(1L));
        iareafactory = ZoomLayer.FUZZY.apply(contextFactory.apply(2000L), iareafactory);
        iareafactory = AddIslandLayer.INSTANCE.apply(contextFactory.apply(1L), iareafactory);
        iareafactory = ZoomLayer.NORMAL.apply(contextFactory.apply(2001L), iareafactory);
        iareafactory = AddIslandLayer.INSTANCE.apply(contextFactory.apply(2L), iareafactory);
        iareafactory = AddIslandLayer.INSTANCE.apply(contextFactory.apply(50L), iareafactory);
        iareafactory = AddIslandLayer.INSTANCE.apply(contextFactory.apply(70L), iareafactory);
        iareafactory = RemoveTooMuchOceanLayer.INSTANCE.apply(contextFactory.apply(2L), iareafactory);
        IAreaFactory<T> iareafactory1 = OceanLayer.INSTANCE.apply(contextFactory.apply(2L));
        iareafactory1 = repeat(2001L, ZoomLayer.NORMAL, iareafactory1, 6, contextFactory);
        iareafactory = AddSnowLayer.INSTANCE.apply(contextFactory.apply(2L), iareafactory);
        iareafactory = AddIslandLayer.INSTANCE.apply(contextFactory.apply(3L), iareafactory);
        iareafactory = EdgeLayer.CoolWarm.INSTANCE.apply(contextFactory.apply(2L), iareafactory);
        iareafactory = EdgeLayer.HeatIce.INSTANCE.apply(contextFactory.apply(2L), iareafactory);
        iareafactory = EdgeLayer.Special.INSTANCE.apply(contextFactory.apply(3L), iareafactory);
        iareafactory = ZoomLayer.NORMAL.apply(contextFactory.apply(2002L), iareafactory);
        iareafactory = ZoomLayer.NORMAL.apply(contextFactory.apply(2003L), iareafactory);
        iareafactory = AddIslandLayer.INSTANCE.apply(contextFactory.apply(4L), iareafactory);
        iareafactory = AddMushroomIslandLayer.INSTANCE.apply(contextFactory.apply(5L), iareafactory);
        iareafactory = DeepOceanLayer.INSTANCE.apply(contextFactory.apply(4L), iareafactory);
        iareafactory = repeat(1000L, ZoomLayer.NORMAL, iareafactory, 0, contextFactory);
        IAreaFactory<T> lvt_6_1_ = repeat(1000L, ZoomLayer.NORMAL, iareafactory, 0, contextFactory);
        lvt_6_1_ = StartRiverLayer.INSTANCE.apply(contextFactory.apply(100L), lvt_6_1_);
        IAreaFactory<T> lvt_7_1_ = (new BiomeLayer(legacy)).apply(contextFactory.apply(200L), iareafactory);
        lvt_7_1_ = AddBambooForestLayer.INSTANCE.apply(contextFactory.apply(1001L), lvt_7_1_);
        lvt_7_1_ = repeat(1000L, ZoomLayer.NORMAL, lvt_7_1_, 2, contextFactory);
        lvt_7_1_ = EdgeBiomeLayer.INSTANCE.apply(contextFactory.apply(1000L), lvt_7_1_);
        IAreaFactory<T> lvt_8_1_ = repeat(1000L, ZoomLayer.NORMAL, lvt_6_1_, 2, contextFactory);
        lvt_7_1_ = HillsLayer.INSTANCE.apply(contextFactory.apply(1000L), lvt_7_1_, lvt_8_1_);
        lvt_6_1_ = repeat(1000L, ZoomLayer.NORMAL, lvt_6_1_, 2, contextFactory);
        lvt_6_1_ = repeat(1000L, ZoomLayer.NORMAL, lvt_6_1_, riverSize, contextFactory);
        lvt_6_1_ = RiverLayer.INSTANCE.apply(contextFactory.apply(1L), lvt_6_1_);
        lvt_6_1_ = SmoothLayer.INSTANCE.apply(contextFactory.apply(1000L), lvt_6_1_);
        lvt_7_1_ = RareBiomeLayer.INSTANCE.apply(contextFactory.apply(1001L), lvt_7_1_);

        for(int i = 0; i < biomeSize; ++i) {
            lvt_7_1_ = ZoomLayer.NORMAL.apply(contextFactory.apply((long)(1000 + i)), lvt_7_1_);
            if (i == 0) {
                lvt_7_1_ = AddIslandLayer.INSTANCE.apply(contextFactory.apply(3L), lvt_7_1_);
            }

            if (i == 1 || biomeSize == 1) {
                lvt_7_1_ = ShoreLayer.INSTANCE.apply(contextFactory.apply(1000L), lvt_7_1_);
            }
        }

        lvt_7_1_ = SmoothLayer.INSTANCE.apply(contextFactory.apply(1000L), lvt_7_1_);
        lvt_7_1_ = MixRiverLayer.INSTANCE.apply(contextFactory.apply(100L), lvt_7_1_, lvt_6_1_);
        return MixOceansLayer.INSTANCE.apply(contextFactory.apply(100L), lvt_7_1_, iareafactory1);
    }

    public static <T extends IArea, C extends IExtendedNoiseRandom<T>>
    IAreaFactory<T> repeat(
            long seed,
            IAreaTransformer1 layer,
            IAreaFactory<T> factory,
            int count,
            LongFunction<C> contextFactory)
    {
        for (int i = 0; i < count; i++)
            factory = layer.apply(contextFactory.apply(seed + i), factory);

        return factory;
    }
}
