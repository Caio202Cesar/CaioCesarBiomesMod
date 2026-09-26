package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.TemperateBiomes;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.DefaultBiomeTreeFeatures;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.ModDefaultBiomeFeatures;
import com.caiocesarmods.caioclimates.Features.ModFeatures;
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

public class PlainsRiver {
    public static final DeferredRegister<Biome> BIOMES
            = DeferredRegister.create(ForgeRegistries.BIOMES, CaioCesarBiomesMod.MOD_ID);

    private static ConfiguredSurfaceBuilder<?> DefaultSurfaceBuilder;
    public static final RegistryObject<Biome> PLAINS_RIVER = BIOMES.register("plains_river",
            () -> makeGenericRiver(() -> ConfiguredSurfaceBuilders.GRASS, -0.5F, 0.0f));

    private static Biome makeGenericRiver(final Supplier<ConfiguredSurfaceBuilder<?>> surfaceBuilder, float depth, float scale) {
        MobSpawnInfo.Builder mobspawninfo$builder = new MobSpawnInfo.Builder();
        DefaultBiomeFeatures.withBatsAndHostiles(mobspawninfo$builder);

        mobspawninfo$builder.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.DROWNED, 7, 5, 7));
        mobspawninfo$builder.withSpawner(EntityClassification.WATER_CREATURE, new MobSpawnInfo.Spawners(EntityType.SQUID, 7, 3, 7));

        BiomeGenerationSettings.Builder biomegenerationsettings$builder =
                (new BiomeGenerationSettings.Builder()).withSurfaceBuilder(surfaceBuilder);

        biomegenerationsettings$builder.withStructure(StructureFeatures.MINESHAFT);
        biomegenerationsettings$builder.withStructure(StructureFeatures.RUINED_PORTAL);

        DefaultBiomeFeatures.withCavesAndCanyons(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withLavaAndWaterLakes(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withMonsterRoom(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withNoiseTallGrass(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withCommonOverworldBlocks(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withOverworldOres(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withDisks(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withPlainGrassVegetation(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withTallGrass(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withNormalMushroomGeneration(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withSugarCaneAndPumpkins(biomegenerationsettings$builder);

        biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.PATCH_SUNFLOWER);
        biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.LAKES, Features.LAKE_LAVA);

        return (new Biome.Builder()).precipitation(Biome.RainType.RAIN).category(Biome.Category.RIVER).depth(depth).scale(scale)
                .temperature(0.74F).downfall(0.4F).setEffects((new BiomeAmbience.Builder()).setWaterColor(4159204)
                        .setWaterFogColor(329011).withSkyColor(8103167).withFoliageColor(4110351)
                        .withGrassColor(6604607).setFogColor(12638463)
                        .setAmbientSound(SoundEvents.MUSIC_CREATIVE)
                        .setMusic(BackgroundMusicTracks.getDefaultBackgroundMusicSelector(SoundEvents.MUSIC_CREATIVE))
                        .build())
                .withMobSpawnSettings(mobspawninfo$builder.build()).withGenerationSettings(biomegenerationsettings$builder.build()).build();
    }

    public static void register(IEventBus eventBus) {
        BIOMES.register(eventBus);
    }
}





