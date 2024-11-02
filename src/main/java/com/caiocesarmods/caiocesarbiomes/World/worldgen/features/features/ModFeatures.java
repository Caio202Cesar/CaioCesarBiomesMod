package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features;

import com.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import com.google.common.collect.ImmutableList;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.blockstateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.fml.RegistryObject;

public class ModFeatures extends Features implements IFeatureConfig {

    public static final ConfiguredFeature<?, ?> FLOWER_MEDITERRANEAN = register("flower_mediterranean",
            Feature.FLOWER.withConfiguration(ModFeatures.Configs.MEDITERRANEAN_FLOWER_CONFIG).withPlacement(Features.Placements.VEGETATION_PLACEMENT)
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(4));

    public static final ConfiguredFeature<?, ?> SUBTROPICAL_FOREST_OAKS = register("trees_giant",
            Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(OAK_BEES_002.withChance(0.025641026F),
                    FANCY_OAK.withChance(0.30769232F), FANCY_OAK_BEES_002.withChance(0.33333334F)), OAK)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));


    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String key, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, key, configuredFeature);
    }


    public static final class Configs {
        public static final BlockClusterFeatureConfig MEDITERRANEAN_FLOWER_CONFIG =
                (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider())
                        .addWeightedBlockstate(States.ANIS, 1)
                        .addWeightedBlockstate(States.CINERARIA, 1)
                        .addWeightedBlockstate(States.SAGE, 1)
                        .addWeightedBlockstate(States.FENNEL, 1)
                        .addWeightedBlockstate(States.LAVENDER, 1)
                        .addWeightedBlockstate(States.SANTOLINA, 1)
                        .addWeightedBlockstate(States.MARJORAN, 1)
                        .addWeightedBlockstate(States.OREGANO, 1)
                        .addWeightedBlockstate(States.ROSEMARY, 1)
                        .addWeightedBlockstate(States.THYME, 1),
                       SimpleBlockPlacer.PLACER)).tries(64).build();
    }

    public static final class States {
        protected static final BlockState ANIS = ModBlocks.ANIS.get().getDefaultState();
        protected static final BlockState SAGE = ModBlocks.SAGE.get().getDefaultState();
        protected static final BlockState CINERARIA = ModBlocks.CINERARIA.get().getDefaultState();
        protected static final BlockState FENNEL = ModBlocks.FENNEL.get().getDefaultState();
        protected static final BlockState LAVENDER = ModBlocks.LAVENDER.get().getDefaultState();
        protected static final BlockState SANTOLINA = ModBlocks.SANTOLINA.get().getDefaultState();
        protected static final BlockState MARJORAN = ModBlocks.MARJORAN.get().getDefaultState();
        protected static final BlockState OREGANO = ModBlocks.OREGANO.get().getDefaultState();
        protected static final BlockState ROSEMARY = ModBlocks.ROSEMARY.get().getDefaultState();
        protected static final BlockState THYME = ModBlocks.THYME.get().getDefaultState();

    }

}
