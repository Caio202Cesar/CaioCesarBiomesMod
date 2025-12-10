package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.ModConfiguredSurfaceBuilders;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.ModDefaultBiomeFeatures;
import net.minecraft.client.audio.BackgroundMusicTracks;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class TropicalSeasonalForestBiome {
   public static final DeferredRegister<Biome> BIOMES
           = DeferredRegister.create(ForgeRegistries.BIOMES, CaioCesarBiomesMod.MOD_ID);

   public static final RegistryObject<Biome> TROPICAL_SEASONAL_FOREST = BIOMES.register("tropical_seasonal_forest",
           () -> makeTropicalSeasonalForestBiome(() -> ModConfiguredSurfaceBuilders.MEDITERRANEAN_SURFACE, 0.125f, 0.3f));

   private static Biome makeTropicalSeasonalForestBiome(final Supplier<ConfiguredSurfaceBuilder<?>> surfaceBuilder, float depth, float scale) {
      MobSpawnInfo.Builder mobspawninfo$builder = new MobSpawnInfo.Builder();
      DefaultBiomeFeatures.withPassiveMobs(mobspawninfo$builder);
      DefaultBiomeFeatures.withBatsAndHostiles(mobspawninfo$builder);
      BiomeGenerationSettings.Builder biomegenerationsettings$builder =
              (new BiomeGenerationSettings.Builder()).withSurfaceBuilder(surfaceBuilder);

      biomegenerationsettings$builder.withStructure(StructureFeatures.MINESHAFT);
      biomegenerationsettings$builder.withStructure(StructureFeatures.RUINED_PORTAL_JUNGLE);
      biomegenerationsettings$builder.withStructure(StructureFeatures.BURIED_TREASURE);
      biomegenerationsettings$builder.withStructure(StructureFeatures.VILLAGE_SAVANNA);
      biomegenerationsettings$builder.withStructure(StructureFeatures.PILLAGER_OUTPOST);

      DefaultBiomeFeatures.withCavesAndCanyons(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withLavaAndWaterLakes(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withMonsterRoom(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withCommonOverworldBlocks(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withOverworldOres(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withClayDisks(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withNormalMushroomGeneration(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withLavaAndWaterSprings(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withWarmFlowers(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withStrongholdAndMineshaft(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withFossils(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withJungleGrass(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withTallGrass(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withMelonPatchesAndVines(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withCrapeMyrtles(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withIndianCoralTrees(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withTropicalForestDeciduousTrees(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withTropicalPlants(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withTropicalTallPlants(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withTropicalCitrusTrees(biomegenerationsettings$builder);

      biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.LAKES, Features.LAKE_LAVA);

      return (new Biome.Builder()).precipitation(Biome.RainType.NONE).category(Biome.Category.SAVANNA).depth(depth).scale(scale)
              .temperature(1.0F).downfall(0.5F).setEffects((new BiomeAmbience.Builder()).setWaterColor(4159204)
                      .setWaterFogColor(4159204).withSkyColor(7842047).withFoliageColor(6862863)
                      .withGrassColor(8832831).setFogColor(7907327)
                      .setAmbientSound(SoundEvents.MUSIC_CREATIVE)
                      .setMusic(BackgroundMusicTracks.getDefaultBackgroundMusicSelector(SoundEvents.MUSIC_CREATIVE))
                      .build())
              .withMobSpawnSettings(mobspawninfo$builder.build()).withGenerationSettings(biomegenerationsettings$builder.build()).build();
   }

   public static void register(IEventBus eventBus) {
      BIOMES.register(eventBus);
   }
}