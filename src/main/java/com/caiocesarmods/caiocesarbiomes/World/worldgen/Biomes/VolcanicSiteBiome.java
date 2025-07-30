package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.ModConfiguredSurfaceBuilders;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.ModDefaultBiomeFeatures;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.TreeFeatures;
import net.minecraft.client.audio.BackgroundMusicTracks;
import net.minecraft.particles.ParticleTypes;
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

public class VolcanicSiteBiome {
public static final DeferredRegister<Biome> BIOMES
        = DeferredRegister.create(ForgeRegistries.BIOMES, CaioCesarBiomesMod.MOD_ID);

private static ConfiguredSurfaceBuilder<?> DefaultSurfaceBuilder;
public static final RegistryObject<Biome> VOLCANIC_SITE = BIOMES.register("volcanic_site",
        () -> makeMontainBiome(() -> ConfiguredSurfaceBuilders.BASALT_DELTAS, 2F, 0.2F));


private static Biome makeMontainBiome(final Supplier<ConfiguredSurfaceBuilder<?>> surfaceBuilder, float depth, float scale) {
    MobSpawnInfo.Builder mobspawninfo$builder = new MobSpawnInfo.Builder();

    BiomeGenerationSettings.Builder biomegenerationsettings$builder =
            (new BiomeGenerationSettings.Builder()).withSurfaceBuilder(surfaceBuilder);

    biomegenerationsettings$builder.withStructure(StructureFeatures.RUINED_PORTAL_MOUNTAIN);
    biomegenerationsettings$builder.withStructure(StructureFeatures.BURIED_TREASURE);

    DefaultBiomeFeatures.withMonsterRoom(biomegenerationsettings$builder);
    DefaultBiomeFeatures.withCommonOverworldBlocks(biomegenerationsettings$builder);
    DefaultBiomeFeatures.withOverworldOres(biomegenerationsettings$builder);
    DefaultBiomeFeatures.withStrongholdAndMineshaft(biomegenerationsettings$builder);
    DefaultBiomeFeatures.withFossils(biomegenerationsettings$builder);
    DefaultBiomeFeatures.withEmeraldOre(biomegenerationsettings$builder);
    DefaultBiomeFeatures.withLavaLakes(biomegenerationsettings$builder);
    DefaultBiomeFeatures.withLavaAndWaterSprings(biomegenerationsettings$builder);

    biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.LAKES, Features.LAKE_LAVA);
    biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.SPRING_LAVA);
    DefaultBiomeFeatures.withFrozenTopLayer(biomegenerationsettings$builder);

    return (new Biome.Builder()).precipitation(Biome.RainType.NONE).category(Biome.Category.EXTREME_HILLS).depth(depth).scale(scale)
            .temperature(2.0F).downfall(0.1F).setEffects((new BiomeAmbience.Builder()).setWaterColor(993300)
                    .setWaterFogColor(993300).withSkyColor(13882323).withFoliageColor(6905399)
                    .withGrassColor(3617053).setFogColor(10526880)
                    .setAmbientSound(SoundEvents.AMBIENT_BASALT_DELTAS_LOOP)
                    .setMoodSound(new MoodSoundAmbience(SoundEvents.AMBIENT_BASALT_DELTAS_MOOD, 6000, 8, 2.0D))
                    .setMusic(BackgroundMusicTracks.getDefaultBackgroundMusicSelector(SoundEvents.MUSIC_NETHER_BASALT_DELTAS))
                    .setParticle(new ParticleEffectAmbience(ParticleTypes.ASH, 0.2F)).build())
            .withMobSpawnSettings(mobspawninfo$builder.build()).withGenerationSettings(biomegenerationsettings$builder.build()).build();
}

public static void register(IEventBus eventBus) {
    BIOMES.register(eventBus);
}
}
