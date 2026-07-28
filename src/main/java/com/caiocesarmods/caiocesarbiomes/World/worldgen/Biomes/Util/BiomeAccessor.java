package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import net.minecraft.world.biome.Biome;

public interface BiomeAccessor {
    void setTemperature(float temperature);

    void setDownfall(float downfall);

    void setPrecipitation(Biome.RainType precipitation);
}
