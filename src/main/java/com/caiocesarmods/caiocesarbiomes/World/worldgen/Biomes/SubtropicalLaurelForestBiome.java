package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.ModConfiguredSurfaceBuilders;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.ModDefaultBiomeFeatures;
import net.minecraft.client.audio.BackgroundMusicTracks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
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

public class SubtropicalLaurelForestBiome {
   public static final DeferredRegister<Biome> BIOMES
           = DeferredRegister.create(ForgeRegistries.BIOMES, CaioCesarBiomesMod.MOD_ID);

   private static ConfiguredSurfaceBuilder<?> DefaultSurfaceBuilder;
   public static final RegistryObject<Biome> SUBTROPICAL_LAUREL_FOREST = BIOMES.register("subtropical_laurel_forest",
           () -> makeSubtropicalLaurelForestBiome(() -> ModConfiguredSurfaceBuilders.MEDITERRANEAN_SURFACE, 0.1f, 0.4f));


   private static Biome makeSubtropicalLaurelForestBiome(final Supplier<ConfiguredSurfaceBuilder<?>> surfaceBuilder, float depth, float scale) {
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
      ModDefaultBiomeFeatures.withForestOcoteaTrees(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withDeciduousSubtropicalForestTrees(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withSubtropicalForestTrees(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withHumidSubtropicalPlants(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withSubtropicalVanillaOak(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withSubtropicalForestFlowers(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withCamelliaAndTeaTrees(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withCitrusTrees(biomegenerationsettings$builder);

      biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.LAKES, Features.LAKE_LAVA);

      return (new Biome.Builder()).precipitation(Biome.RainType.RAIN).category(Biome.Category.FOREST).depth(depth).scale(scale)
              .temperature(0.8F).downfall(0.85F).setEffects((new BiomeAmbience.Builder()).setWaterColor(4159204)
                      .setWaterFogColor(4159204).withSkyColor(7907327).withFoliageColor(5216810)
                      .withGrassColor(2791997).setFogColor(14807295)
                      .setAmbientSound(SoundEvents.MUSIC_CREATIVE)
                      .setMusic(BackgroundMusicTracks.getDefaultBackgroundMusicSelector(SoundEvents.MUSIC_CREATIVE))
                      .build())
              .withMobSpawnSettings(mobspawninfo$builder.build()).withGenerationSettings(biomegenerationsettings$builder.build()).build();
   }

   public static void register(IEventBus eventBus) {
      BIOMES.register(eventBus);
   }

   }