package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.Util.ModSoundEvents;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.DefaultBiomeTreeFeatures;
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

public class SubtropicalEvergreenOakForestBeach {
   public static final DeferredRegister<Biome> BIOMES
           = DeferredRegister.create(ForgeRegistries.BIOMES, CaioCesarBiomesMod.MOD_ID);

   private static ConfiguredSurfaceBuilder<?> DefaultSurfaceBuilder;
   public static final RegistryObject<Biome> SUBTROPICAL_LUCIDOPHYLLOUS_OAK_BEACH = BIOMES.register("subtropical_lucidophyll_oak_forest_beach",
           () -> makeSubtropicalEvergreenOakForestBeach(() -> ConfiguredSurfaceBuilders.DESERT, 0.0F, 0.025F));

   private static Biome makeSubtropicalEvergreenOakForestBeach(final Supplier<ConfiguredSurfaceBuilder<?>> surfaceBuilder, float depth, float scale) {
      MobSpawnInfo.Builder mobspawninfo$builder = new MobSpawnInfo.Builder();

      mobspawninfo$builder.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.TURTLE, 5, 2, 5));
      mobspawninfo$builder.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.PARROT, 10, 5, 7));
      DefaultBiomeFeatures.withBatsAndHostiles(mobspawninfo$builder);

      BiomeGenerationSettings.Builder biomegenerationsettings$builder =
              (new BiomeGenerationSettings.Builder()).withSurfaceBuilder(surfaceBuilder);

      biomegenerationsettings$builder.withStructure(StructureFeatures.MINESHAFT);
      biomegenerationsettings$builder.withStructure(StructureFeatures.BURIED_TREASURE);
      biomegenerationsettings$builder.withStructure(StructureFeatures.SHIPWRECK_BEACHED);

      DefaultBiomeFeatures.withCavesAndCanyons(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withSugarCaneAndPumpkins(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withLavaAndWaterLakes(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withMonsterRoom(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withCommonOverworldBlocks(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withOverworldOres(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withClayDisks(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withNormalMushroomGeneration(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withLavaAndWaterSprings(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withStrongholdAndMineshaft(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withFossils(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withForestGrass(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withLightBambooVegetation(biomegenerationsettings$builder);

      ModDefaultBiomeFeatures.withSubtropicalForestMiscTrees(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withSubtropicalOakForestTrees(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withCrapeMyrtles(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withSubtropicalCitrusTrees(biomegenerationsettings$builder);

      ModDefaultBiomeFeatures.withHumidSubtropicalPlants(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withSubtropicalTallPlants(biomegenerationsettings$builder);

      biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
              DefaultBiomeTreeFeatures.SUBTROPICAL_EVERGREEN_OAK_BEACH_TREES);

      biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.LAKES, Features.LAKE_LAVA);

      //Hardiness zone 9: 0.8F - 0.84F
      return (new Biome.Builder()).precipitation(Biome.RainType.RAIN).category(Biome.Category.BEACH).depth(depth).scale(scale)
              .temperature(0.84F).downfall(0.8F).setEffects((new BiomeAmbience.Builder()).setWaterColor(4159204)
                      .setWaterFogColor(4159204).withSkyColor(7907327).withFoliageColor(5216810)
                      .withGrassColor(2791997).setFogColor(7907327)
                      .setAmbientSound(ModSoundEvents.BEACH_AMBIENCE.get())
                      .setMusic(BackgroundMusicTracks.getDefaultBackgroundMusicSelector(SoundEvents.MUSIC_CREATIVE))
                      .build())
              .withMobSpawnSettings(mobspawninfo$builder.build()).withGenerationSettings(biomegenerationsettings$builder.build()).build();
   }

   public static void register(IEventBus eventBus) {
      BIOMES.register(eventBus);
   }
}

