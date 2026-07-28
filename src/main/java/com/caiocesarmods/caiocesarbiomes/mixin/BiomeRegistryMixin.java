package com.caiocesarmods.caiocesarbiomes.mixin;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.VanillaBiomeTweaks;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BiomeRegistry.class)
public class BiomeRegistryMixin {
    @Inject(
            method = "register",
            at = @At("HEAD")
    )
    private static void onRegister(int id,
                                   RegistryKey<Biome> key,
                                   Biome biome,
                                   CallbackInfoReturnable<Biome> cir) {

        VanillaBiomeTweaks.apply(key, biome);
    }
}
