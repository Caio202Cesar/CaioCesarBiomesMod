package com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class SummerHeatHelper {

    public static float get(World world, BlockPos pos) {

        Biome biome = world.getBiome(pos);

        float summer = SummerTemperatureRegistry.get(world, pos);

        float altitudeModifier = (pos.getY() - 64) * -0.005F;

        return SummerTemperatureRegistry.get(world, pos) + altitudeModifier;
    }
}
