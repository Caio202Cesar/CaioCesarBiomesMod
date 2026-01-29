package com.caiocesarmods.caiocesarbiomes.Climate;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public enum SummerHeat {
    ICY,
    TUNDRA_COLD, //Outside tree line (must not allow large trees after all), but not icy or snowy
    COOLER,
    WARM,
    HOT,
    SCHORCHING

}


