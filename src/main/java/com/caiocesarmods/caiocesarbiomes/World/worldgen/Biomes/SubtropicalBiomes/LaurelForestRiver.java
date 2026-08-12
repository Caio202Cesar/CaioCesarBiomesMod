package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.SubtropicalBiomes;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.Util.ModSoundEvents;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.ModDefaultBiomeFeatures;
import net.minecraft.client.audio.BackgroundMusicTracks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilders;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class LaurelForestRiver {
   public static final DeferredRegister<Biome> BIOMES
           = DeferredRegister.create(ForgeRegistries.BIOMES, CaioCesarBiomesMod.MOD_ID);

   private static ConfiguredSurfaceBuilder<?> DefaultSurfaceBuilder;
   public static final RegistryObject<Biome> LAUREL_FOREST_RIVER = BIOMES.register("laurel_forest_river",
           () -> makeLaurelForestRiver(() -> ConfiguredSurfaceBuilders.GRASS, -0.5F, 0.0f));


   private static Biome makeLaurelForestRiver(final Supplier<ConfiguredSurfaceBuilder<?>> surfaceBuilder, float depth, float scale) {
      MobSpawnInfo.Builder mobspawninfo$builder = new MobSpawnInfo.Builder();
      BiomeGenerationSettings.Builder biomegenerationsettings$builder =
              (new BiomeGenerationSettings.Builder()).withSurfaceBuilder(surfaceBuilder);

      DefaultBiomeFeatures.withBatsAndHostiles(mobspawninfo$builder);

      mobspawninfo$builder.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.DROWNED, 7, 5, 7));
      mobspawninfo$builder.withSpawner(EntityClassification.WATER_CREATURE, new MobSpawnInfo.Spawners(EntityType.SQUID, 7, 3, 7));

      DefaultBiomeFeatures.withCavesAndCanyons(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withSugarCaneAndPumpkins(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withLavaAndWaterLakes(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withMonsterRoom(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withCommonOverworldBlocks(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withOverworldOres(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withClayDisks(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withNormalMushroomGeneration(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withLavaAndWaterSprings(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withLargeFern(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withForestRocks(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withStrongholdAndMineshaft(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withFossils(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withForestGrass(biomegenerationsettings$builder);

      ModDefaultBiomeFeatures.withSubtropicalForestMiscTrees(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withSubtropicalForestLauraceae(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withSubtropicalLaurelForestMiscTrees(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withSubtropicalCitrusTrees(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withCrapeMyrtles(biomegenerationsettings$builder);

      ModDefaultBiomeFeatures.withHumidSubtropicalPlants(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withSubtropicalTallPlants(biomegenerationsettings$builder);

      biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.LAKES, Features.LAKE_LAVA);

      //Hardiness zone 10: 0.85F - 0.89F
      return (new Biome.Builder()).precipitation(Biome.RainType.RAIN).category(Biome.Category.RIVER).depth(depth).scale(scale)
              .temperature(0.89F).downfall(0.85F).setEffects((new BiomeAmbience.Builder()).setWaterColor(4159204)
                      .setWaterFogColor(4159204).withSkyColor(7907327).withFoliageColor(5216810)
                      .withGrassColor(2791997).setFogColor(14807295)
                      .setAmbientSound(ModSoundEvents.LAURISSILVA_AMBIENCE.get())
                      .setMusic(BackgroundMusicTracks.getDefaultBackgroundMusicSelector(SoundEvents.MUSIC_CREATIVE))
                      .build())
              .withMobSpawnSettings(mobspawninfo$builder.build()).withGenerationSettings(biomegenerationsettings$builder.build()).build();
   }

   public static void register(IEventBus eventBus) {
      BIOMES.register(eventBus);
   }

   }