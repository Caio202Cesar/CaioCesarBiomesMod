package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.Util.ModSoundEvents;
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
      ModDefaultBiomeFeatures.withMediterraneanSavannaSmallTrees(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withMediterraneanShrubs(biomegenerationsettings$builder);
      ModDefaultBiomeFeatures.withMediterraneanSavannaFruitTrees(biomegenerationsettings$builder);

      biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.LAKES, Features.LAKE_LAVA);

      return (new Biome.Builder()).precipitation(Biome.RainType.NONE).category(Biome.Category.PLAINS).depth(depth).scale(scale)
              .temperature(0.89F).downfall(0.2F).setEffects((new BiomeAmbience.Builder()).setWaterColor(4159204)
                      .setWaterFogColor(4159204).withSkyColor(8103167).withFoliageColor(7441937)
                      .withGrassColor(12564309).setFogColor(14807295)
                      .setAmbientSound(ModSoundEvents.MEDITERRANEAN_AMBIENCE.get())
                      .setMusic(BackgroundMusicTracks.getDefaultBackgroundMusicSelector(SoundEvents.MUSIC_CREATIVE))
                      .build())
              .withMobSpawnSettings(mobspawninfo$builder.build()).withGenerationSettings(biomegenerationsettings$builder.build()).build();
   }

   public static void register(IEventBus eventBus) {
      BIOMES.register(eventBus);
   }
}
