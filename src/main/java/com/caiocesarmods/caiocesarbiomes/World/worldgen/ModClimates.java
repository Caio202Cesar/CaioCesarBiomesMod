package com.caiocesarmods.caiocesarbiomes.World.worldgen;

import net.minecraft.world.biome.Biome;

public class ModClimates extends Biome.Climate {
    public ModClimates(Biome.RainType precipitation, float temperature, Biome.TemperatureModifier temperatureModifier, float downfall) {
        super(precipitation, temperature, temperatureModifier, downfall);
    }


}
