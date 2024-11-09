package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class ModConfiguredSurfaceBuilders {
    public static ConfiguredSurfaceBuilder<?> MEDITERRANEAN_SURFACE = register("mediterranean_surface",
            SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(
                    Blocks.GRASS_BLOCK.getDefaultState(),
                    Blocks.STONE.getDefaultState(),
                    Blocks.SAND.getDefaultState()
            )));

    public static ConfiguredSurfaceBuilder<?> VEGETATION_TUNDRA_SURFACE = register("vegetation_tundra_surface",
            SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(
                    Blocks.GRASS_BLOCK.getDefaultState(),
                    Blocks.STONE.getDefaultState(),
                    Blocks.GRAVEL.getDefaultState()
            )));

    public static ConfiguredSurfaceBuilder<?> GRAVEL_TUNDRA_SURFACE = register("gravel_tundra_surface",
            SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(
                    Blocks.GRAVEL.getDefaultState(),
                    Blocks.STONE.getDefaultState(),
                    Blocks.GRAVEL.getDefaultState()
            )));

    public static ConfiguredSurfaceBuilder<?> MOSSY_TUNDRA_SURFACE = register("mossy_tundra_surface",
            SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(
                    Blocks.MOSSY_COBBLESTONE.getDefaultState(),
                    Blocks.STONE.getDefaultState(),
                    Blocks.GRAVEL.getDefaultState()
            )));

    private static <SC extends ISurfaceBuilderConfig>ConfiguredSurfaceBuilder<SC> register(String name,
                                                                                           ConfiguredSurfaceBuilder<SC> csb) {
        return WorldGenRegistries.register(WorldGenRegistries.CONFIGURED_SURFACE_BUILDER,
                new ResourceLocation(CaioCesarBiomesMod.MOD_ID, name), csb);
    }
}