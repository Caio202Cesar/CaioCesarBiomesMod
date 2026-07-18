package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.RegistryObject;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class CustomBiomeIdRegistry {
    private static final Map<Integer, RegistryObject<Biome>> ID_TO_BIOME = new HashMap<>();
    private static final Map<ResourceLocation, Integer> BIOME_TO_ID = new HashMap<>();

    public static void register(int id, RegistryObject<Biome> biome) {
        ID_TO_BIOME.put(id, biome);
        BIOME_TO_ID.put(biome.getId(), id);
    }

    @Nullable
    public static Biome getBiome(int id) {
        RegistryObject<Biome> obj = ID_TO_BIOME.get(id);
        return obj == null ? null : obj.get();
    }

    public static int getId(Biome biome) {
        ResourceLocation key = biome.getRegistryName();

        if (key == null)
            return -1;

        return BIOME_TO_ID.getOrDefault(key, -1);
    }
}
