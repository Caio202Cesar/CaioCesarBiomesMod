package com.caiocesarmods.caiocesarbiomes.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.gen.feature.BambooFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(BambooFeature.class)
public class BambooFeatureMixin {

    @Redirect(
            method = "generate(Lnet/minecraft/world/ISeedReader;Lnet/minecraft/world/gen/ChunkGenerator;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/gen/feature/ProbabilityConfig;)Z",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/block/BlockState;isValidPosition(Lnet/minecraft/world/IWorldReader;Lnet/minecraft/util/math/BlockPos;)Z"
            )
    )
    private boolean preventBambooOnSand(BlockState state, IWorldReader world, BlockPos pos) {
        Block ground = world.getBlockState(pos.down()).getBlock();

        // Reject as the supporting block.
        if (ground == Blocks.SAND ||
                ground == Blocks.RED_SAND ||
                ground == Blocks.GRAVEL ||
                ground == Blocks.COARSE_DIRT) {
            return false;
        }

        // Otherwise, use vanilla logic.
        return state.isValidPosition(world, pos);
    }
}