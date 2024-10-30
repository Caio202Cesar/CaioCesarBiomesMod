package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features;

import com.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.feature.*;

public class ModFeatures extends Features {
    public static final ConfiguredFeature<?, ?> FLOWER_WARM = register("flower_mediterranean", Feature.FLOWER.withConfiguration(Features.Configs.NORMAL_FLOWER_CONFIG).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(4));


    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String key, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, key, configuredFeature);
    }

    public static final class Configs {
        public static final BlockClusterFeatureConfig MEDITERRANEAN_FLOWER_CONFIG =
                (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider())
                        .addWeightedBlockstate(States.ANIS, 2)
                        .addWeightedBlockstate(States.CINERARIA, 1)
                        .addWeightedBlockstate(States.SAGE, 1)
                        .addWeightedBlockstate(States.FENNEL, 1)
                        .addWeightedBlockstate(States.LAVENDER, 1)
                        .addWeightedBlockstate(States.SANTOLINA, 1),
                       SimpleBlockPlacer.PLACER)).tries(64).build();
    }

    public static final class States {
        protected static final BlockState ANIS = ModBlocks.ANIS.get().getDefaultState();
        protected static final BlockState SAGE = ModBlocks.SAGE.get().getDefaultState();
        protected static final BlockState CINERARIA = ModBlocks.CINERARIA.get().getDefaultState();
        protected static final BlockState FENNEL = ModBlocks.FENNEL.get().getDefaultState();
        protected static final BlockState LAVENDER = ModBlocks.LAVENDER.get().getDefaultState();
        protected static final BlockState SANTOLINA = ModBlocks.SANTOLINA.get().getDefaultState();
    }
}
