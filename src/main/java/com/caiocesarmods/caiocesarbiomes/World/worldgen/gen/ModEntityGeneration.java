package com.caiocesarmods.caiocesarbiomes.World.worldgen.gen;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.*;
import com.caiocesarmods.caiocesarbiomes.entity.ModEntityTypes;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CaioCesarBiomesMod.MOD_ID)
public class ModEntityGeneration {

    @SubscribeEvent
    public static void onEntitySpawn(final BiomeLoadingEvent event) {

        // Safety check
        if (event.getName() == null) return;

        // Mediterranean Merchant
        if (event.getName().equals(MediterraneanConiferSavannaBiomeBeach.MEDITERRANEAN_CONIFER_SAVANNA_BEACH.get().getRegistryName())) {

            event.getSpawns().getSpawner(
                    ModEntityTypes.MEDITERRANEAN_MERCHANT.get().getClassification()
            ).add(new MobSpawnInfo.Spawners(
                    ModEntityTypes.MEDITERRANEAN_MERCHANT.get(),
                    12, // weight
                    1,  // min
                    2   // max
            ));
        }

        if (event.getName().equals(MediterraneanScrublandBiome.MEDITERRANEAN_SCRUBLAND.get().getRegistryName())) {

            event.getSpawns().getSpawner(
                    ModEntityTypes.MEDITERRANEAN_MERCHANT.get().getClassification()
            ).add(new MobSpawnInfo.Spawners(
                    ModEntityTypes.MEDITERRANEAN_MERCHANT.get(),
                    12, // weight
                    1,  // min
                    2   // max
            ));
        }

        if (event.getName().equals(MediterraneanOakWoodlandBiome.MEDITERRANEAN_OAK_WOODLAND.get().getRegistryName())) {

            event.getSpawns().getSpawner(
                    ModEntityTypes.MEDITERRANEAN_MERCHANT.get().getClassification()
            ).add(new MobSpawnInfo.Spawners(
                    ModEntityTypes.MEDITERRANEAN_MERCHANT.get(),
                    12, // weight
                    1,  // min
                    2   // max
            ));
        }

        if (event.getName().equals(OliveGroveBiome.OLIVE_GROVE.get().getRegistryName())) {

            event.getSpawns().getSpawner(
                    ModEntityTypes.MEDITERRANEAN_MERCHANT.get().getClassification()
            ).add(new MobSpawnInfo.Spawners(
                    ModEntityTypes.MEDITERRANEAN_MERCHANT.get(),
                    12, // weight
                    1,  // min
                    2   // max
            ));
        }

        if (event.getName().equals(MediterraneanConiferSavannaBiomeBeach.MEDITERRANEAN_CONIFER_SAVANNA_BEACH.get().getRegistryName())) {

            event.getSpawns().getSpawner(
                    ModEntityTypes.MEDITERRANEAN_MERCHANT.get().getClassification()
            ).add(new MobSpawnInfo.Spawners(
                    ModEntityTypes.MEDITERRANEAN_MERCHANT.get(),
                    12, // weight
                    1,  // min
                    2   // max
            ));
        }

        if (event.getName().equals(HotMediterraneanBeachBiome.HOT_MEDITERRANEAN_BEACH.get().getRegistryName())) {

            event.getSpawns().getSpawner(
                    ModEntityTypes.MEDITERRANEAN_MERCHANT.get().getClassification()
            ).add(new MobSpawnInfo.Spawners(
                    ModEntityTypes.MEDITERRANEAN_MERCHANT.get(),
                    12, // weight
                    1,  // min
                    2   // max
            ));
        }

        if (event.getName().equals(StonyMediterraneanShoreBiome.STONY_MEDITERRANEAN_SHORE.get().getRegistryName())) {

            event.getSpawns().getSpawner(
                    ModEntityTypes.MEDITERRANEAN_MERCHANT.get().getClassification()
            ).add(new MobSpawnInfo.Spawners(
                    ModEntityTypes.MEDITERRANEAN_MERCHANT.get(),
                    12, // weight
                    1,  // min
                    2   // max
            ));
        }

        if (event.getName().equals(CorkOakSavannaBiome.CORK_OAK_SAVANNA.get().getRegistryName())) {

            event.getSpawns().getSpawner(
                    ModEntityTypes.MEDITERRANEAN_MERCHANT.get().getClassification()
            ).add(new MobSpawnInfo.Spawners(
                    ModEntityTypes.MEDITERRANEAN_MERCHANT.get(),
                    12, // weight
                    1,  // min
                    2   // max
            ));
        }

        if (event.getName().equals(OleanderGardensBiome.OLEANDER_GARDENS.get().getRegistryName())) {

            event.getSpawns().getSpawner(
                    ModEntityTypes.MEDITERRANEAN_MERCHANT.get().getClassification()
            ).add(new MobSpawnInfo.Spawners(
                    ModEntityTypes.MEDITERRANEAN_MERCHANT.get(),
                    12, // weight
                    1,  // min
                    2   // max
            ));
        }

        if (event.getName().equals(MediterraneanOakSparseWoodlandBiome.MEDITERRANEAN_OAK_SPARSE_WOODLAND.get().getRegistryName())) {

            event.getSpawns().getSpawner(
                    ModEntityTypes.MEDITERRANEAN_MERCHANT.get().getClassification()
            ).add(new MobSpawnInfo.Spawners(
                    ModEntityTypes.MEDITERRANEAN_MERCHANT.get(),
                    12, // weight
                    1,  // min
                    2   // max
            ));
        }

        // Desert Merchant
        if (event.getName().equals(TemperateDesert.TEMPERATE_DESERT.get().getRegistryName())) {

            event.getSpawns().getSpawner(
                    ModEntityTypes.DESERT_MERCHANT.get().getClassification()
            ).add(new MobSpawnInfo.Spawners(
                    ModEntityTypes.DESERT_MERCHANT.get(),
                    12, // weight
                    1,  // min
                    2   // max
            ));
        }

        if (event.getName().equals(TropicalDesertBiome.TROPICAL_DESERT.get().getRegistryName())) {

            event.getSpawns().getSpawner(
                    ModEntityTypes.DESERT_MERCHANT.get().getClassification()
            ).add(new MobSpawnInfo.Spawners(
                    ModEntityTypes.DESERT_MERCHANT.get(),
                    12, // weight
                    1,  // min
                    2   // max
            ));
        }

        if (event.getName().equals(SahelBiome.SAHEL.get().getRegistryName())) {

            event.getSpawns().getSpawner(
                    ModEntityTypes.DESERT_MERCHANT.get().getClassification()
            ).add(new MobSpawnInfo.Spawners(
                    ModEntityTypes.DESERT_MERCHANT.get(),
                    12, // weight
                    1,  // min
                    2   // max
            ));
        }

        if (event.getName().equals(EucalyptusSahelBiome.EUCALYPTUS_SAHEL.get().getRegistryName())) {

            event.getSpawns().getSpawner(
                    ModEntityTypes.DESERT_MERCHANT.get().getClassification()
            ).add(new MobSpawnInfo.Spawners(
                    ModEntityTypes.DESERT_MERCHANT.get(),
                    12, // weight
                    1,  // min
                    2   // max
            ));
        }

        if (event.getName().equals(HemiborealSteppeBiome.HEMIBOREAL_STEPPE.get().getRegistryName())) {

            event.getSpawns().getSpawner(
                    ModEntityTypes.DESERT_MERCHANT.get().getClassification()
            ).add(new MobSpawnInfo.Spawners(
                    ModEntityTypes.DESERT_MERCHANT.get(),
                    12, // weight
                    1,  // min
                    2   // max
            ));
        }

        if (event.getName().equals(SaltDesertBiome.SALT_DESERT.get().getRegistryName())) {

            event.getSpawns().getSpawner(
                    ModEntityTypes.DESERT_MERCHANT.get().getClassification()
            ).add(new MobSpawnInfo.Spawners(
                    ModEntityTypes.DESERT_MERCHANT.get(),
                    12, // weight
                    1,  // min
                    2   // max
            ));
        }
    }
}


