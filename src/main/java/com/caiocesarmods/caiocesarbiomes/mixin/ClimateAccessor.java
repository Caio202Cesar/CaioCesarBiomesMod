package com.caiocesarmods.caiocesarbiomes.mixin;

import net.minecraft.world.biome.Biome;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Biome.Climate.class)
public interface ClimateAccessor {

    @Accessor("temperature")
    float getTemperature();

    @Accessor("temperature")
    void setTemperature(float temperature);

    @Accessor("downfall")
    float getDownfall();

    @Accessor("downfall")
    void setDownfall(float downfall);

    @Accessor("precipitation")
    Biome.RainType getPrecipitation();

    @Accessor("precipitation")
    void setPrecipitation(Biome.RainType precipitation);
}
