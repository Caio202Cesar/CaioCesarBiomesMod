package com.caiocesarmods.caiocesarbiomes.World.worldgen.gen;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.DimensionSettings;
import net.minecraftforge.common.world.ForgeWorldType;

public class LatitudeWorldType extends ForgeWorldType {
    public LatitudeWorldType() {
        super("latitude_climate"); // will appear in the Create World menu
    }

    @Override
    public ChunkGenerator createChunkGenerator(World world) {
        long seed = world.getSeed();

        // Get registries
        Registry<Biome> biomeRegistry = world.func_241828_r().getRegistry(Registry.BIOME_KEY);
        Registry<DimensionSettings> dimensionSettingsRegistry = world.func_241828_r().getRegistry(Registry.NOISE_SETTINGS_KEY);

        // Create and return your custom chunk generator
        return new LatitudeChunkGenerator(biomeRegistry, dimensionSettingsRegistry, seed);
    }
}