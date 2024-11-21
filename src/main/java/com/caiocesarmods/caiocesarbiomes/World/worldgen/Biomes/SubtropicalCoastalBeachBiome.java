package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.ModDefaultBiomeFeatures;
import net.minecraft.client.audio.BackgroundMusicTracks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilders;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class SubtropicalCoastalBeachBiome  {
   public static final DeferredRegister<Biome> BIOMES
           = DeferredRegister.create(ForgeRegistries.BIOMES, CaioCesarBiomesMod.MOD_ID);

   private static ConfiguredSurfaceBuilder<?> DefaultSurfaceBuilder;
   public static final RegistryObject<Biome> SUBTROPICAL_COASTAL_BEACH = BIOMES.register("subtropical_coastal_beach",
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
      biomegenerationsettings$builder.withStructure(StructureFeatures.RUINED_PORTAL);

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
      ModDefaultBiomeFeatures.withPohutukawaTrees(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withTropicalHibiscus(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withSubtropicalForestFlowers(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withHumidSubtropicalPlants(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withSubtropicalForestTrees(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withCrapeMyrtles(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withForestRocks(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withLargeFern(biomegenerationsettings$builder);

      return (new Biome.Builder()).precipitation(Biome.RainType.RAIN).category(Biome.Category.BEACH).depth(depth).scale(scale)
              .temperature(0.8F).downfall(0.6F).setEffects((new BiomeAmbience.Builder()).setWaterColor(4159204)
                      .setWaterFogColor(4159204).withSkyColor(12634835).withFoliageColor(5216810)
                      .withGrassColor(6604607).setFogColor(15658734)
                      .setAmbientSound(SoundEvents.MUSIC_CREATIVE)
                      .setMusic(BackgroundMusicTracks.getDefaultBackgroundMusicSelector(SoundEvents.MUSIC_CREATIVE))
                      .build())
              .withMobSpawnSettings(mobspawninfo$builder.build()).withGenerationSettings(biomegenerationsettings$builder.build()).build();
   }

   public static void register(IEventBus eventBus) {
      BIOMES.register(eventBus);
   }
}
