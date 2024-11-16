package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.ModConfiguredSurfaceBuilders;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.ModDefaultBiomeFeatures;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.TreeFeatures;
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

public class MediterraneanConiferSavannaBiome {
   public static final DeferredRegister<Biome> BIOMES
           = DeferredRegister.create(ForgeRegistries.BIOMES, CaioCesarBiomesMod.MOD_ID);

   private static ConfiguredSurfaceBuilder<?> DefaultSurfaceBuilder;
   public static final RegistryObject<Biome> MEDITERRANEAN_CONIFER_SAVANNA = BIOMES.register("mediterranean_conifer_savanna",
           () -> makeMediterraneanConiferSavannaBiome(() -> ModConfiguredSurfaceBuilders.MEDITERRANEAN_SURFACE, 0.125f, 0.4f));


   private static Biome makeMediterraneanConiferSavannaBiome(final Supplier<ConfiguredSurfaceBuilder<?>> surfaceBuilder, float depth, float scale) {
      MobSpawnInfo.Builder mobspawninfo$builder = new MobSpawnInfo.Builder();
      DefaultBiomeFeatures.withPassiveMobs(mobspawninfo$builder);
      DefaultBiomeFeatures.withBatsAndHostiles(mobspawninfo$builder);
      mobspawninfo$builder.withSpawner(EntityClassification.MONSTER,
              new MobSpawnInfo.Spawners(EntityType.HUSK, 100, 7, 10));
      BiomeGenerationSettings.Builder biomegenerationsettings$builder =
              (new BiomeGenerationSettings.Builder()).withSurfaceBuilder(surfaceBuilder);

      biomegenerationsettings$builder.withStructure(StructureFeatures.MINESHAFT);
      biomegenerationsettings$builder.withStructure(StructureFeatures.RUINED_PORTAL_DESERT);
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
      DefaultBiomeFeatures.withDesertVegetation(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withLavaAndWaterSprings(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withSavannaGrass(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withMediterraneanConiferTrees(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withMediterraneanFlowers(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withDefaultFlowers(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withStrongholdAndMineshaft(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withFossils(biomegenerationsettings$builder);
      DefaultBiomeFeatures.withWarmFlowers(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withRockBoulder(biomegenerationsettings$builder);

      biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.LAKES, Features.LAKE_LAVA);
      biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.ELDERBERRY_TREE);

      return (new Biome.Builder()).precipitation(Biome.RainType.RAIN).category(Biome.Category.SAVANNA).depth(depth).scale(scale)
              .temperature(1.0F).downfall(0.2F).setEffects((new BiomeAmbience.Builder()).setWaterColor(4159204)
                      .setWaterFogColor(4159204).withSkyColor(getSkyColorWithTemperatureModifier(0.8F)).withFoliageColor(7441937)
                      .withGrassColor(12564309).setFogColor(14807295)
                      .setAmbientSound(SoundEvents.MUSIC_CREATIVE)
                      .setMusic(BackgroundMusicTracks.getDefaultBackgroundMusicSelector(SoundEvents.MUSIC_CREATIVE))
                      .build())
              .withMobSpawnSettings(mobspawninfo$builder.build()).withGenerationSettings(biomegenerationsettings$builder.build()).build();
   }

   private static int getSkyColorWithTemperatureModifier(float temperature) {
      float lvt_1_1_ = temperature / 3.0F;
      lvt_1_1_ = MathHelper.clamp(lvt_1_1_, -1.0F, 1.0F);
      return MathHelper.hsvToRGB(0.2460909F - lvt_1_1_ * 0.05F, 0.5F + lvt_1_1_ * 0.1F, 1.0F);
   }

   public static void register(IEventBus eventBus) {
      BIOMES.register(eventBus);
   }
}
