package com.caiocesarmods.caiocesarbiomes.mixin;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate.SummerTemperatureBuilder;
import net.minecraft.world.biome.Biome;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(Biome.Builder.class)
public abstract class BiomeBuilderMixin implements SummerTemperatureBuilder {

    @Unique
    private float summerBaseTemperature = Float.NaN;

    @Override
    public Biome.Builder summerBaseTemperature(float temperature) {
        this.summerBaseTemperature = temperature;
        return (Biome.Builder)(Object)this;
    }

    @Override
    public float getSummerBaseTemperature() {
        return this.summerBaseTemperature;
    }
}
