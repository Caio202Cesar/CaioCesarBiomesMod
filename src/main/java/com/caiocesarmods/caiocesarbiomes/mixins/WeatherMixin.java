package com.caiocesarmods.caiocesarbiomes.mixins;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.Climate.ClimateType;
import com.caiocesarmods.caiocesarbiomes.Climate.SeasonalRainHelper;
import com.caiocesarmods.caiocesarbiomes.Climate.SeasonalRainType;
import com.caiocesarmods.caiocesarbiomes.Climate.SeasonalWeatherHandler;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.server.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerWorld.class)
public abstract class WeatherMixin {
    @Inject(method = "tick", at = @At("HEAD"), cancellable = true)
    private void modifyWeather(CallbackInfo ci) {
        ServerWorld world = (ServerWorld) (Object) this;
        long dayTime = world.getDayTime();
        String season = SeasonalWeatherHandler.getSeason(dayTime);

        for (ServerPlayerEntity player : world.getPlayers()) {
            BlockPos pos = player.getPosition();
            Biome biome = world.getBiomeManager().getBiome(pos);
            ClimateType climate = SeasonalWeatherHandler.getBiomeClimate(biome);

            boolean shouldRain = false;
            boolean shouldThunder = false;

            // Apply Mediterranean climate season effects
            if (climate == ClimateType.MEDITERRANEAN) {
                switch (season) {
                    case "SPRING":
                        shouldRain = false; // Dry summer, no rain
                        break;
                    case "WINTER":
                        shouldRain = true; // Wet winter, heavy rain
                        shouldThunder = false; // Optional: thunderstorms in winter
                        break;
                    default:
                        shouldRain = world.isRaining(); // Keep default behavior for other seasons
                }
            }

            // Apply weather changes
            world.setWeather(shouldRain ? 12000 : 0, 12000, shouldRain, shouldThunder);
        }
    }
}
