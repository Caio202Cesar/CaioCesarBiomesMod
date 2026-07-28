package com.caiocesarmods.caiocesarbiomes.mixin;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.MutableBiomeClimate;
import net.minecraft.world.biome.Biome;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Biome.class)
public abstract class MutableBiomeClimateMixin implements MutableBiomeClimate {

    @Shadow
    @Final
    @Mutable
    private Biome.Climate climate;

    @Override
    public Biome.Climate getClimate() {
        return this.climate;
    }

    @Override
    public void setClimate(Biome.Climate climate) {
        this.climate = climate;
    }
}
