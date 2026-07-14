package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Layers;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.BiomeFamily;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.BiomeVariant;
import net.minecraft.util.ResourceLocation;

import java.util.EnumMap;

public class CustomBiomeLayer {

    private final ResourceLocation biome;
    private final BiomeFamily family;
    private final EnumMap<BiomeVariant, ResourceLocation> variants;

    // Cache the registry ID
    private int biomeId = -1;

    public int getBiomeId() {
        return biomeId;
    }

    public void setBiomeId(int biomeId) {
        this.biomeId = biomeId;
    }

}
