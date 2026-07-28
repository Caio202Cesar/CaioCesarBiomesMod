package com.caiocesarmods.caiocesarbiomes.mixin;

import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.BambooFeature;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

@Mixin(BambooFeature.class)
public class BambooFeatureMixin {

    @Inject(
            method = "generate(Lnet/minecraft/world/ISeedReader;Lnet/minecraft/world/gen/ChunkGenerator;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/gen/feature/ProbabilityConfig;)Z",
            at = @At("HEAD"),
            cancellable = true
    )
    private void preventBambooOnSand(ISeedReader level,
                                     ChunkGenerator generator,
                                     Random rand,
                                     BlockPos pos,
                                     ProbabilityConfig config,
                                     CallbackInfoReturnable<Boolean> cir) {

        if (level.getBlockState(pos.down()).equals(BlockTags.SAND)) {
            cir.setReturnValue(false);
        }
    }
}
