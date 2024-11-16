package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.BlockBlobFeature;
import net.minecraft.world.gen.feature.BlockStateFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;

public abstract class ModConfiguredFeature<FC extends IFeatureConfig> extends net.minecraftforge.registries
        .ForgeRegistryEntry<net.minecraft.world.gen.feature.Feature<?>> {

    public static final Feature<BlockStateFeatureConfig> ROCK_BOULDER = register("rock_boulder", new BlockBlobFeature(BlockStateFeatureConfig.CODEC));

    private static <C extends IFeatureConfig, F extends Feature<C>> F register(String key, F value) {
        return Registry.register(Registry.FEATURE, key, value);
    }
}
