package com.caiocesarmods.caiocesarbiomes.mixin;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.Layers.RelationshipLayer;
import net.minecraft.world.gen.IExtendedNoiseRandom;
import net.minecraft.world.gen.area.IArea;
import net.minecraft.world.gen.area.IAreaFactory;
import net.minecraft.world.gen.layer.LayerUtil;
import net.minecraft.world.gen.layer.RareBiomeLayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(LayerUtil.class)
public class LayerUtilMixin {

    @Redirect(
            method = "setupOverworldLayer",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/gen/layer/RareBiomeLayer;apply(Lnet/minecraft/world/gen/IExtendedNoiseRandom;Lnet/minecraft/world/gen/area/IAreaFactory;)Lnet/minecraft/world/gen/area/IAreaFactory;"
            )
    )
    private static <T extends IArea> IAreaFactory<T> redirectRareBiome(
            RareBiomeLayer instance,
            IExtendedNoiseRandom<T> random,
            IAreaFactory<T> area) {

        System.out.println("[CCB] Injecting RelationshipLayer after RareBiomeLayer");

        IAreaFactory<T> result = instance.apply(random, area);

        return RelationshipLayer.INSTANCE.apply(random, result);
    }
}