package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.ModConfiguredSurfaceBuilders;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.ModDefaultBiomeFeatures;
import net.minecraft.client.audio.BackgroundMusicTracks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
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

import static net.minecraft.world.biome.BiomeMaker.makeGenericBeachBiome;

public class TropicalBeachBiome {
    public static final DeferredRegister<Biome> BIOMES
            = DeferredRegister.create(ForgeRegistries.BIOMES, CaioCesarBiomesMod.MOD_ID);

    private static ConfiguredSurfaceBuilder<?> DefaultSurfaceBuilder;
    public static final RegistryObject<Biome> TROPICAL_BEACH = BIOMES.register("tropical_beach",
            () -> makeGenericBeachBiome(() -> ConfiguredSurfaceBuilders.DESERT, 0.1f, 0.12f));


    private static Biome makeGenericBeachBiome(final Supplier<ConfiguredSurfaceBuilder<?>> surfaceBuilder, float depth, float scale) {
        MobSpawnInfo.Builder mobspawninfo$builder = new MobSpawnInfo.Builder();
        mobspawninfo$builder.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.TURTLE, 5, 2, 5));
        DefaultBiomeFeatures.withBatsAndHostiles(mobspawninfo$builder);

        BiomeGenerationSettings.Builder biomegenerationsettings$builder =
                (new BiomeGenerationSettings.Builder()).withSurfaceBuilder(surfaceBuilder);

        biomegenerationsettings$builder.withStructure(StructureFeatures.MINESHAFT);
        biomegenerationsettings$builder.withStructure(StructureFeatures.BURIED_TREASURE);
        biomegenerationsettings$builder.withStructure(StructureFeatures.SHIPWRECK_BEACHED);
        biomegenerationsettings$builder.withStructure(StructureFeatures.RUINED_PORTAL_JUNGLE);

        DefaultBiomeFeatures.withCavesAndCanyons(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withLavaAndWaterLakes(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withMonsterRoom(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withCommonOverworldBlocks(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withOverworldOres(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withDisks(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withWarmFlowers(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withBadlandsGrass(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withNormalMushroomGeneration(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withSugarCaneAndPumpkins(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withLavaAndWaterSprings(biomegenerationsettings$builder);
        ModDefaultBiomeFeatures.withTropicalPlants(biomegenerationsettings$builder);
        ModDefaultBiomeFeatures.withTropicalBeachTrees(biomegenerationsettings$builder);

        return (new Biome.Builder()).precipitation(Biome.RainType.RAIN).category(Biome.Category.BEACH).depth(depth).scale(scale)
                .temperature(0.95F).downfall(0.8F).setEffects((new BiomeAmbience.Builder()).setWaterColor(4445678)
                        .setWaterFogColor(270131).withSkyColor(8103167).withFoliageColor(9153185)
                        .withGrassColor(10139053).setFogColor(13028309)
                        .setAmbientSound(SoundEvents.MUSIC_CREATIVE)
                        .setMusic(BackgroundMusicTracks.getDefaultBackgroundMusicSelector(SoundEvents.MUSIC_CREATIVE))
                        .build())
                .withMobSpawnSettings(mobspawninfo$builder.build()).withGenerationSettings(biomegenerationsettings$builder.build()).build();
    }

    public static void register(IEventBus eventBus) {
        BIOMES.register(eventBus);
    }
}