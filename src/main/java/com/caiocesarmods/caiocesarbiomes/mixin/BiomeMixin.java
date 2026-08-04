package com.caiocesarmods.caiocesarbiomes.mixin;

import com.caiocesarmods.caiocesarbiomes.Util.MutableBiomeEffects;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeAmbience;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Biome.class)
public abstract class BiomeMixin implements MutableBiomeEffects {

@Shadow
    @Final
    @Mutable
    private BiomeAmbience effects;

    public BiomeAmbience getEffects() {
        return this.effects;
    }

    public void setEffects(BiomeAmbience effects) {
        this.effects = effects;
    }
}
