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

   private static ConfiguredSurfaceBuilder<?> DefaultSurfaceBuilder;
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
      biomegenerationsettings$builder.withStructure(StructureFeatures.VILLAGE_PLAINS);
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
      ModDefaultBiomeFeatures.withCrapeMyrtles(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withSavannaTrees(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withAvocadoTree(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withIndianCoralTrees(biomegenerationsettings$builder);

      biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.LAKES, Features.LAKE_LAVA);

      DefaultBiomeFeatures.withFrozenTopLayer(biomegenerationsettings$builder);

      return (new Biome.Builder()).precipitation(Biome.RainType.RAIN).category(Biome.Category.FOREST).depth(depth).scale(scale)
              .temperature(0.8F).downfall(0.8F).setEffects((new BiomeAmbience.Builder()).setWaterColor(4159204)
                      .setWaterFogColor(4159204).withSkyColor(getSkyColorWithTemperatureModifier(0.8F)).withFoliageColor(3168686)
                      .withGrassColor(7979098).setFogColor(7907327)
                      .setAmbientSound(SoundEvents.MUSIC_CREATIVE)
                      .setMusic(BackgroundMusicTracks.getDefaultBackgroundMusicSelector(SoundEvents.MUSIC_CREATIVE))
                      .build())
              .withMobSpawnSettings(mobspawninfo$builder.build()).withGenerationSettings(biomegenerationsettings$builder.build()).build();
   }

   private static int getSkyColorWithTemperatureModifier(float temperature) {
      float lvt_1_1_ = temperature / 0.8F;
      lvt_1_1_ = MathHelper.clamp(lvt_1_1_, -1.0F, 1.0F);
      return MathHelper.hsvToRGB(0.2460909F - lvt_1_1_ * 0.05F, 0.5F + lvt_1_1_ * 0.1F, 1.0F);
   }

   public static void register(IEventBus eventBus) {
      BIOMES.register(eventBus);
   }
}