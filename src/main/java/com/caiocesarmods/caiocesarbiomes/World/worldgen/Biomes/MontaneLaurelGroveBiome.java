package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.ModDefaultBiomeFeatures;
import net.minecraft.client.audio.BackgroundMusicTracks;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilders;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class MontaneLaurelGroveBiome {
public static final DeferredRegister<Biome> BIOMES
        = DeferredRegister.create(ForgeRegistries.BIOMES, CaioCesarBiomesMod.MOD_ID);

private static ConfiguredSurfaceBuilder<?> DefaultSurfaceBuilder;
public static final RegistryObject<Biome> MONTANE_LAUREL_GROVE = BIOMES.register("montane_laurel_grove",
        () -> makeMontaneLaurelGroveBiome(() -> ConfiguredSurfaceBuilders.MOUNTAIN, 1.7f, 0.060f));


private static Biome makeMontaneLaurelGroveBiome(final Supplier<ConfiguredSurfaceBuilder<?>> surfaceBuilder, float depth, float scale) {
    MobSpawnInfo.Builder mobspawninfo$builder = new MobSpawnInfo.Builder();
    DefaultBiomeFeatures.withPassiveMobs(mobspawninfo$builder);
    DefaultBiomeFeatures.withBatsAndHostiles(mobspawninfo$builder);

    BiomeGenerationSettings.Builder biomegenerationsettings$builder =
            (new BiomeGenerationSettings.Builder()).withSurfaceBuilder(surfaceBuilder);

    biomegenerationsettings$builder.withStructure(StructureFeatures.MINESHAFT);
    biomegenerationsettings$builder.withStructure(StructureFeatures.RUINED_PORTAL_JUNGLE);
    biomegenerationsettings$builder.withStructure(StructureFeatures.BURIED_TREASURE);
    biomegenerationsettings$builder.withStructure(StructureFeatures.PILLAGER_OUTPOST);
    biomegenerationsettings$builder.withStructure(StructureFeatures.JUNGLE_PYRAMID);

    DefaultBiomeFeatures.withCavesAndCanyons(biomegenerationsettings$builder);
    DefaultBiomeFeatures.withMonsterRoom(biomegenerationsettings$builder);
    DefaultBiomeFeatures.withCommonOverworldBlocks(biomegenerationsettings$builder);
    DefaultBiomeFeatures.withOverworldOres(biomegenerationsettings$builder);
    DefaultBiomeFeatures.withClayDisks(biomegenerationsettings$builder);
    DefaultBiomeFeatures.withStrongholdAndMineshaft(biomegenerationsettings$builder);
    DefaultBiomeFeatures.withFossils(biomegenerationsettings$builder);
    DefaultBiomeFeatures.withJungleGrass(biomegenerationsettings$builder);
    ModDefaultBiomeFeatures.withHighlandOcoteaTrees(biomegenerationsettings$builder);
    ModDefaultBiomeFeatures.withSubtropicalTallPlants(biomegenerationsettings$builder);
    ModDefaultBiomeFeatures.withHumidSubtropicalPlants(biomegenerationsettings$builder);
    DefaultBiomeFeatures.withLightBambooVegetation(biomegenerationsettings$builder);
    DefaultBiomeFeatures.withForestRocks(biomegenerationsettings$builder);
    DefaultBiomeFeatures.withEmeraldOre(biomegenerationsettings$builder);
    DefaultBiomeFeatures.withLargeFern(biomegenerationsettings$builder);
    ModDefaultBiomeFeatures.withCamelliaAndTeaTrees(biomegenerationsettings$builder);
    ModDefaultBiomeFeatures.withSubtropicalCitrusTrees(biomegenerationsettings$builder);
    ModDefaultBiomeFeatures.withRainforestChestnuts(biomegenerationsettings$builder);

    biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.LAKES, Features.LAKE_LAVA);
    DefaultBiomeFeatures.withFrozenTopLayer(biomegenerationsettings$builder);

    //Hardiness zone 10: 0.85F - 0.89F (but high altitude can make it reaches colder zones by the formula: (base temp - ((Y - 64)*0.0016))F
    //    //Y = your current height in blocks; 64 = sea level height.
    return (new Biome.Builder()).precipitation(Biome.RainType.RAIN).category(Biome.Category.EXTREME_HILLS).depth(depth).scale(scale)
            .temperature(0.89F).downfall(1.0F).setEffects((new BiomeAmbience.Builder()).setWaterColor(993300)
                    .setWaterFogColor(993300).withSkyColor(12966647).withFoliageColor(8293460)
                    .withGrassColor(8762696).setFogColor(14807295)
                    .setAmbientSound(SoundEvents.MUSIC_CREATIVE).setMoodSound(MoodSoundAmbience.DEFAULT_CAVE)
                    .setMusic(BackgroundMusicTracks.getDefaultBackgroundMusicSelector(SoundEvents.MUSIC_CREATIVE))
                    .build())
            .withMobSpawnSettings(mobspawninfo$builder.build()).withGenerationSettings(biomegenerationsettings$builder.build()).build();
}

public static void register(IEventBus eventBus) {
    BIOMES.register(eventBus);
}
}
