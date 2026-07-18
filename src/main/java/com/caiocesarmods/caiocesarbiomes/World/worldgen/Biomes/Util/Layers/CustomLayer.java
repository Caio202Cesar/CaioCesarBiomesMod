package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.Layers;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.CustomBiomeIdRegistry;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeRegistry;
import net.minecraft.world.gen.area.IAreaFactory;
import net.minecraft.world.gen.area.LazyArea;

public class CustomLayer {

    private final LazyArea area;

    public CustomLayer(IAreaFactory<LazyArea> factory) {
        this.area = factory.make();
    }

    public Biome getBiome(int x, int z) {

        int id = this.area.getValue(x, z);

        Biome biome = CustomBiomeIdRegistry.getBiome(id);

        if (biome != null) {
            return biome;
        }

        RegistryKey<Biome> key = BiomeRegistry.getKeyFromID(id);

        if (key == null) {
            throw new IllegalStateException("Unknown biome id: " + id);
        }

        biome = WorldGenRegistries.BIOME.getValueForKey(key);

        if (biome == null) {
            throw new IllegalStateException("Unknown biome: " + id);
        }

        return biome;
    }
}