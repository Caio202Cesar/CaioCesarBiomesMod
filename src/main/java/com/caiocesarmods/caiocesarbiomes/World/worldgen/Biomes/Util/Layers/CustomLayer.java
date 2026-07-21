package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.Layers;

import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.area.IAreaFactory;
import net.minecraft.world.gen.area.LazyArea;

public class CustomLayer {

    private final LazyArea area;

    public CustomLayer(IAreaFactory<LazyArea> factory) {
        this.area = factory.make();
    }

    public Biome getBiome(int x, int z) {

        int id = area.getValue(x, z);

        Biome biome = WorldGenRegistries.BIOME.getByValue(id);

        if (biome != null) {
            return biome;
        }

        throw new IllegalStateException(
                "Unknown biome id: " + id +
                        " at (" + x + ", " + z + ")"
        );
    }
}