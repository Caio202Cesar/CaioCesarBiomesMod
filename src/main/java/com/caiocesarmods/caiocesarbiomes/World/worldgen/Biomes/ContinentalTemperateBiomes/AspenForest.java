package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.ContinentalTemperateBiomes;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.DefaultBiomeTreeFeatures;
import net.minecraft.client.audio.BackgroundMusicTracks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilders;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

//A biome that marks transition between taiga (boreal forest) and hemiboreal steeppe.
public class AspenForest {
    public static final DeferredRegister<Biome> BIOMES
            = DeferredRegister.create(ForgeRegistries.BIOMES, CaioCesarBiomesMod.MOD_ID);

    public static final RegistryObject<Biome> ASPEN_FOREST = BIOMES.register("aspen_forest",
            () -> makeAspenForestBiome(() -> ConfiguredSurfaceBuilders.MOUNTAIN, 0.125f, 0.3f));

    private static Biome makeAspenForestBiome(final Supplier<ConfiguredSurfaceBuilder<?>> surfaceBuilder, float depth, float scale) {
        MobSpawnInfo.Builder mobspawninfo$builder = new MobSpawnInfo.Builder();
        DefaultBiomeFeatures.withPassiveMobs(mobspawninfo$builder);
        mobspawninfo$builder.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.WOLF, 8, 4, 4));
        mobspawninfo$builder.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.RABBIT, 4, 2, 3));
        mobspawninfo$builder.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.FOX, 8, 2, 4));
        DefaultBiomeFeatures.withBats(mobspawninfo$builder);
        DefaultBiomeFeatures.withHostileMobs(mobspawninfo$builder, 100, 25, 100);

        BiomeGenerationSettings.Builder biomegenerationsettings$builder =
                (new BiomeGenerationSettings.Builder()).withSurfaceBuilder(surfaceBuilder);

        DefaultBiomeFeatures.withStrongholdAndMineshaft(biomegenerationsettings$builder);
        biomegenerationsettings$builder.withStructure(StructureFeatures.RUINED_PORTAL);
        DefaultBiomeFeatures.withCavesAndCanyons(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withLavaAndWaterLakes(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withMonsterRoom(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withForestRocks(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withLargeFern(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withCommonOverworldBlocks(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withOverworldOres(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withDisks(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withDefaultFlowers(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withGiantTaigaGrassVegetation(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withNormalMushroomGeneration(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withSugarCaneAndPumpkins(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withLavaAndWaterSprings(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withSparseBerries(biomegenerationsettings$builder);

        biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, DefaultBiomeTreeFeatures.ASPEN_TREES);
        DefaultBiomeFeatures.withFrozenTopLayer(biomegenerationsettings$builder);

        //Hardiness zone 4: 0.4F - 0.49F
        return (new Biome.Builder()).precipitation(Biome.RainType.RAIN).category(Biome.Category.TAIGA).depth(depth).scale(scale)
                .temperature(0.4F).downfall(0.5F).setEffects((new BiomeAmbience.Builder()).setWaterColor(4159204)
                        .setWaterFogColor(4765085).withSkyColor(7907327).withFoliageColor(8960871)
                        .withGrassColor(11713383).setFogColor(14807295)
                        .setAmbientSound(SoundEvents.MUSIC_CREATIVE)
                        .setMusic(BackgroundMusicTracks.getDefaultBackgroundMusicSelector(SoundEvents.MUSIC_CREATIVE)).build())
                .withMobSpawnSettings(mobspawninfo$builder.build()).withGenerationSettings(biomegenerationsettings$builder.build()).build();
    }

    public static void register(IEventBus eventBus) {
        BIOMES.register(eventBus);
    }
}

