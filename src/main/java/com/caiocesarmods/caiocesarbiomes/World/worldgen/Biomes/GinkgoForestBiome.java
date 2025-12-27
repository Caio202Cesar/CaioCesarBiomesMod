package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.Util.ModSoundEvents;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.ModDefaultBiomeFeatures;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.TreeFeatures;
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

public class GinkgoForestBiome {
    public static final DeferredRegister<Biome> BIOMES
            = DeferredRegister.create(ForgeRegistries.BIOMES, CaioCesarBiomesMod.MOD_ID);

    public static final RegistryObject<Biome> GINKGO_FOREST = BIOMES.register("ginkgo_forest",
            () -> makeGinkgoForestBiome(() -> ConfiguredSurfaceBuilders.MOUNTAIN, 0.125f, 0.35f));

    private static Biome makeGinkgoForestBiome(final Supplier<ConfiguredSurfaceBuilder<?>> surfaceBuilder, float depth, float scale) {

        MobSpawnInfo.Builder mobspawninfo$builder = new MobSpawnInfo.Builder();
        DefaultBiomeFeatures.withPassiveMobs(mobspawninfo$builder);
        DefaultBiomeFeatures.withBatsAndHostiles(mobspawninfo$builder);


        BiomeGenerationSettings.Builder biomegenerationsettings$builder =
                (new BiomeGenerationSettings.Builder()).withSurfaceBuilder(surfaceBuilder);

        biomegenerationsettings$builder.withStructure(StructureFeatures.MINESHAFT);
        biomegenerationsettings$builder.withStructure(StructureFeatures.RUINED_PORTAL);
        biomegenerationsettings$builder.withStructure(StructureFeatures.JUNGLE_PYRAMID);
        biomegenerationsettings$builder.withStructure(StructureFeatures.BURIED_TREASURE);
        biomegenerationsettings$builder.withStructure(StructureFeatures.VILLAGE_PLAINS);
        biomegenerationsettings$builder.withStructure(StructureFeatures.PILLAGER_OUTPOST);

        DefaultBiomeFeatures.withCavesAndCanyons(biomegenerationsettings$builder);

        DefaultBiomeFeatures.withLavaAndWaterLakes(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withMonsterRoom(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withCommonOverworldBlocks(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withOverworldOres(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withClayDisks(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withLavaAndWaterSprings(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withLargeFern(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withAllForestFlowerGeneration(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withForestBirchTrees(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withStrongholdAndMineshaft(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withFossils(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withForestRocks(biomegenerationsettings$builder);
        ModDefaultBiomeFeatures.withTemperateRainforestPlants(biomegenerationsettings$builder);
        ModDefaultBiomeFeatures.withTemperateTallPlants(biomegenerationsettings$builder);
        ModDefaultBiomeFeatures.withTemperateRainforestShrubs(biomegenerationsettings$builder);

        biomegenerationsettings$builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, TreeFeatures.GINKGO_TRESS);

        DefaultBiomeFeatures.withFrozenTopLayer(biomegenerationsettings$builder);

        //Hardiness zone 6: 0.6F - 0.69F
        return (new Biome.Builder()).precipitation(Biome.RainType.NONE).category(Biome.Category.PLAINS).depth(depth).scale(scale)
                .temperature(0.65F).downfall(0.8F).setEffects((new BiomeAmbience.Builder()).setWaterColor(4159204)
                        .setWaterFogColor(4159204).withSkyColor(7972607).withFoliageColor(5877296)
                        .withGrassColor(7979098).setFogColor(13494015)
                        .setAmbientSound(ModSoundEvents.MEDITERRANEAN_AMBIENCE.get())
                        .setMusic(BackgroundMusicTracks.getDefaultBackgroundMusicSelector(SoundEvents.MUSIC_CREATIVE))
                        .build())
                .withMobSpawnSettings(mobspawninfo$builder.build()).withGenerationSettings(biomegenerationsettings$builder.build()).build();
    }

    public static void register(IEventBus eventBus) {
        BIOMES.register(eventBus);
    }
}
