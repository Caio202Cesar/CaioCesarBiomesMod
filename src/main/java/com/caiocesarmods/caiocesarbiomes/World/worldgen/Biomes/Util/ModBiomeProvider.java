package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import net.minecraft.data.BiomeProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

public class ModBiomeProvider extends BiomeProvider {

    private final Registry<Biome> registry;


    public ModBiomeProvider(Registry<Biome> registry) {

        super((DataGenerator) ModBiomeRegistry.getBiomes(registry));

        this.registry = registry;
    }


    public Biome getBiome(BlockPos pos) {

        ResourceLocation id = new ResourceLocation(
                CaioCesarBiomesMod.MOD_ID,
                "subtropical_laurel_forest"
        );

        return BiomeResolver.getBiome(registry, id);
    }
}