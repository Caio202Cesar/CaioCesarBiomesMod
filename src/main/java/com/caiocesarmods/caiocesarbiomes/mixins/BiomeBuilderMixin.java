package com.caiocesarmods.caiocesarbiomes.mixins;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.Climate.ClimateType;
import com.caiocesarmods.caiocesarbiomes.Climate.SeasonalRainHelper;
import com.caiocesarmods.caiocesarbiomes.Climate.SeasonalRainType;
import com.caiocesarmods.caiocesarbiomes.Climate.SeasonalWeatherHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import javax.annotation.Nullable;

@Mixin(Biome.Builder.class)
public class BiomeBuilderMixin {
    @Shadow @Nullable private Biome.RainType precipitation;

    @Inject(method = "precipitation", at = @At("HEAD"), cancellable = true)
    private void modifyPrecipitation(Biome.RainType rainType, CallbackInfoReturnable<Biome.Builder> cir) {
        // Get world time and season
        long worldTime = Minecraft.getInstance().world.getDayTime();
        String season = SeasonalWeatherHandler.getSeason(worldTime);

        // Get biome instance
        Biome biome = ((Biome.Builder)(Object)this).build();
        ClimateType climate = SeasonalWeatherHandler.getBiomeClimate(biome);

        // Determine seasonal rain behavior
        SeasonalRainType seasonalRain = SeasonalRainHelper.getRainTypeForSeason(season, climate);

        // Apply precipitation change
        switch (seasonalRain) {
            case NONE:
                cir.setReturnValue((Biome.Builder) (Object) this.precipitation(Biome.RainType.NONE));
                break;
            case HEAVY:
            case NORMAL:
                cir.setReturnValue((Biome.Builder) (Object) this.precipitation(Biome.RainType.RAIN));
                break;
        }

        // Log for debugging
        CaioCesarBiomesMod.LOGGER.info("Applied Seasonal Rain: " + seasonalRain + " for biome " + biome.getRegistryName());
    }

    private Object precipitation(Biome.RainType rainType) {
        return rainType;
    }
}
