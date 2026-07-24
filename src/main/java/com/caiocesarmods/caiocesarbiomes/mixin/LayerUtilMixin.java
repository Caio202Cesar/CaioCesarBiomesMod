package com.caiocesarmods.caiocesarbiomes.mixin;

import net.minecraft.world.gen.layer.LayerUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LayerUtil.class)
public class LayerUtilMixin {

    @Inject(
            method = "setupOverworldLayer",
            at = @At("HEAD")
    )
    private static void onSetupOverworldLayer(
            boolean legacyBiomeInitLayer,
            int biomeSize,
            int riverSize,
            java.util.function.LongFunction<?> contextFactory,
            CallbackInfoReturnable<?> cir) {

        System.out.println("[CCB MIXIN] LayerUtil.setupOverworldLayer()");
    }
}
