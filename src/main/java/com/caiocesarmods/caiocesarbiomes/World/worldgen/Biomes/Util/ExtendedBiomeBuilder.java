package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.MobSpawnInfo;

public class ExtendedBiomeBuilder extends Biome.Builder {

    private float summerBaseTemperature = Float.NaN;

    @Override
    public ExtendedBiomeBuilder temperature(float temperature) {
        super.temperature(temperature);
        return this;
    }

    @Override
    public ExtendedBiomeBuilder downfall(float downfall) {
        super.downfall(downfall);
        return this;
    }

    @Override
    public ExtendedBiomeBuilder depth(float depth) {
        super.depth(depth);
        return this;
    }

    @Override
    public ExtendedBiomeBuilder scale(float scale) {
        super.scale(scale);
        return this;
    }

    @Override
    public ExtendedBiomeBuilder precipitation(Biome.RainType precipitationIn) {
        super.precipitation(precipitationIn);
        return this;
    }

    @Override
    public ExtendedBiomeBuilder category(Biome.Category biomeCategory) {
        super.category(biomeCategory);
        return this;
    }

    @Override
    public ExtendedBiomeBuilder setEffects(BiomeAmbience effects) {
        super.setEffects(effects);
        return this;
    }

    @Override
    public ExtendedBiomeBuilder withMobSpawnSettings(MobSpawnInfo mobSpawnSettings) {
        super.withMobSpawnSettings(mobSpawnSettings);
        return this;
    }

    @Override
    public ExtendedBiomeBuilder withGenerationSettings(BiomeGenerationSettings generationSettings) {
        super.withGenerationSettings(generationSettings);
        return this;
    }

    @Override
    public ExtendedBiomeBuilder withTemperatureModifier(Biome.TemperatureModifier temperatureSettings) {
        super.withTemperatureModifier(temperatureSettings);
        return this;
    }

    public ExtendedBiomeBuilder summerBaseTemperature(float temperature) {
        this.summerBaseTemperature = temperature;
        return this;
    }

    public float getSummerBaseTemperature() {
        return summerBaseTemperature;
    }
}
