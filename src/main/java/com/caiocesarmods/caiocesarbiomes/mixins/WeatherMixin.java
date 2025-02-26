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

            CaioCesarBiomesMod.LOGGER.info("Checking weather override: Season = " + season + ", Climate = " + climate + ", Biome = " + biome.getRegistryName());

            if (climate == ClimateType.MEDITERRANEAN) {
                if ("SPRING".equals(season)) {
                    world.setWeather(0, 12000, false, false);
                    CaioCesarBiomesMod.LOGGER.info("✅ Preventing rain in Mediterranean biome during SUMMER!");
                } else {
                    world.setWeather(12000, 12000, true, false);
                    CaioCesarBiomesMod.LOGGER.info("🌧️ Allowing rain in Mediterranean biome during WINTER.");
                }
            }
        }
    }
}
