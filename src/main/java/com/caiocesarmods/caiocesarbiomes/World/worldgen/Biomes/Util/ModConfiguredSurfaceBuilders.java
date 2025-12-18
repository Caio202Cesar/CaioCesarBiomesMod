package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.block.MiscBlocks;
import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
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

    public static ConfiguredSurfaceBuilder<?> MEDITERRANEAN_STONY_SHORE_SURFACE = register("mediterranean_stony_shore_surface",
            SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(
                    Blocks.COBBLESTONE.getBlock().getDefaultState(), //top material
                    Blocks.COARSE_DIRT.getBlock().getDefaultState(), //under material
                    Blocks.SAND.getBlock().getDefaultState() //underwater material
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

    public static ConfiguredSurfaceBuilder<?> SALT_DESERT_SURFACE = register("salt_desert_surface",
            SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(
                    MiscBlocks.SALT_BLOCK.get().getDefaultState(),
                    Blocks.STONE.getDefaultState(),
                    MiscBlocks.SALT_BLOCK.get().getDefaultState()
            )));

    public static ConfiguredSurfaceBuilder<?> STEEPE_SURFACE = register("steepe_surface",
            SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(
                    Blocks.COARSE_DIRT.getDefaultState(),
                    Blocks.STONE.getDefaultState(),
                    Blocks.SAND.getDefaultState()
            )));

    public static ConfiguredSurfaceBuilder<?> VOLCANIC_SURFACE = register("volcanic_surface",
            SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(
                    Blocks.BASALT.getDefaultState(),
                    Blocks.BLACKSTONE.getDefaultState(),
                    Blocks.MAGMA_BLOCK.getDefaultState()
            )));

    private static <SC extends ISurfaceBuilderConfig>ConfiguredSurfaceBuilder<SC> register(String name,
                                                                                           ConfiguredSurfaceBuilder<SC> csb) {
        return WorldGenRegistries.register(WorldGenRegistries.CONFIGURED_SURFACE_BUILDER,
                new ResourceLocation(CaioCesarBiomesMod.MOD_ID, name), csb);
    }
}