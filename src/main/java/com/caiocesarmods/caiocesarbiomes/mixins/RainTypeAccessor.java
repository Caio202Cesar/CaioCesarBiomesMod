package com.caiocesarmods.caiocesarbiomes.mixins;

import net.minecraft.world.biome.Biome;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Biome.RainType.class)
public interface RainTypeAccessor {
    @Accessor("RAIN")
    static Biome.RainType getRain() {
        throw new UnsupportedOperationException();
    }
}
