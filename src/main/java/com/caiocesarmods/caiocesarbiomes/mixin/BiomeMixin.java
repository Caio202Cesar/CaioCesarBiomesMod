package com.caiocesarmods.caiocesarbiomes.mixin;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.ExtendedBiomeBuilder;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate.SummerTemperatureBuilder;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate.SummerHeat;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Biome.class)
public abstract class BiomeMixin implements SummerTemperatureBuilder {

    @Shadow
    public abstract float getTemperature();

    @Shadow
    public abstract float getTemperature(BlockPos pos);

    @Unique
    private float summerBaseTemperature;

    @Inject(method = "<init>", at = @At("TAIL"))
    private void injectSummerTemperature(Biome.Builder builder, CallbackInfo ci) {

        if (builder instanceof ExtendedBiomeBuilder) {
            this.summerBaseTemperature =
                    ((ExtendedBiomeBuilder) builder).getSummerBaseTemperature();
        } else {
            // Vanilla biomes
            this.summerBaseTemperature = this.getTemperature();
        }
    }

    @Override
    public SummerHeat getSummerHeat(BlockPos pos) {
        return SummerHeat.fromTemperature(getSummerTemperature(pos));
    }

    @Override
    public float getSummerBaseTemperature() {
        return this.summerBaseTemperature;
    }

    @Override
    public void setSummerBaseTemperature(float temperature) {
        this.summerBaseTemperature = temperature;
    }

    @Override
    public float getSummerTemperature(BlockPos pos) {
        float correction = this.getTemperature(pos) - this.getTemperature();
        return this.summerBaseTemperature + correction;
    }
}
