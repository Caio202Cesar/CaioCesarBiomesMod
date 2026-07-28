package com.caiocesarmods.caiocesarbiomes.mixin;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.BiomeAccessor;
import net.minecraft.world.biome.Biome;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Biome.class)
public class BiomeAcessorMixin implements BiomeAccessor {

    @Shadow
    @Final
    @Mutable
    private float temperature;

    @Shadow
    @Final @Mutable
    private float downfall;

    @Shadow
    @Final @Mutable
    private Biome.RainType precipitation;

    @Override
    public void setTemperature(float temperature) {

    }

    @Override
    public void setDownfall(float downfall) {

    }

    @Override
    public void setPrecipitation(Biome.RainType precipitation) {

    }
}
