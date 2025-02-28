package com.caiocesarmods.caiocesarbiomes.Climate;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ClimateTypeHandler {

    public static ClimateType getBiomeClimate(Biome biome) {
        if (biome == null) {
            CaioCesarBiomesMod.LOGGER.warn("getBiomeClimate: Biome is NULL!");
            return null;
        }

        ResourceLocation biomeID = biome.getRegistryName();
        CaioCesarBiomesMod.LOGGER.info("getBiomeClimate: Checking biome " + biomeID);

        // Check if this biome matches Olive Grove
        ResourceLocation oliveGroveID = OliveGroveBiome.OLIVE_GROVE.get().getRegistryName();
        CaioCesarBiomesMod.LOGGER.info("getBiomeClimate: Olive Grove ID = " + oliveGroveID);
        ResourceLocation mediterraneanConiferSavannaID = MediterraneanConiferSavannaBiome.MEDITERRANEAN_CONIFER_SAVANNA.get().getRegistryName();
        CaioCesarBiomesMod.LOGGER.info("getBiomeClimate: Mediterranean Conifer Savanna ID = " + mediterraneanConiferSavannaID);
        ResourceLocation bambooSubtropicalLaurelJungleID = BambooSubtropicalLaurelJungleBiome.BAMBOO_SUBTROPICAL_LAUREL_JUNGLE.get().getRegistryName();
        CaioCesarBiomesMod.LOGGER.info("getBiomeClimate: Bamboo Laurel Jungle ID = " + bambooSubtropicalLaurelJungleID);
        ResourceLocation coastalSubtropicalDesertID = CoastalSubtropicalDesertBiome.COAST_SUBTROPICAL_DESERT.get().getRegistryName();
        CaioCesarBiomesMod.LOGGER.info("getBiomeClimate: Coastal Subtropical Desert ID = " + coastalSubtropicalDesertID);
        ResourceLocation cookPineIslandID = CookPineIslandBiome.COOK_PINE_ISLAND.get().getRegistryName();
        CaioCesarBiomesMod.LOGGER.info("getBiomeClimate: Cook Pine Island ID = " + cookPineIslandID);
        ResourceLocation corkOakSavannaID = CorkOakSavannaBiome.CORK_OAK_SAVANNA.get().getRegistryName();
        CaioCesarBiomesMod.LOGGER.info("getBiomeClimate: Cork Oak Savanna ID = " + corkOakSavannaID);
        ResourceLocation dryTropicalBeachID = DryTropicalBeachBiome.DRY_TROPICAL_BEACH.get().getRegistryName();
        CaioCesarBiomesMod.LOGGER.info("getBiomeClimate: Dry Tropical Beach ID = " + dryTropicalBeachID);
        ResourceLocation eucalyptusPlainsID = EucalyptusPlainsBiome.EUCALYPTUS_PLAINS.get().getRegistryName();
        CaioCesarBiomesMod.LOGGER.info("getBiomeClimate: Eucalyptus Plains ID = " + eucalyptusPlainsID);
        ResourceLocation eucalyptusSahelID = EucalyptusSahelBiome.EUCALYPTUS_SAHEL.get().getRegistryName();
        CaioCesarBiomesMod.LOGGER.info("getBiomeClimate: Eucalyptus Sahel ID = " + eucalyptusSahelID);
        ResourceLocation gravelTundraID = GravelTundraBiome.GRAVEL_TUNDRA.get().getRegistryName();
        CaioCesarBiomesMod.LOGGER.info("getBiomeClimate: Gravel Tundra ID = " + gravelTundraID);
        ResourceLocation hemiborealForestID = HemiborealForestBiome.HEMIBOREAL_FOREST.get().getRegistryName();
        CaioCesarBiomesMod.LOGGER.info("getBiomeClimate: Hemiboreal Forest ID = " + hemiborealForestID);

        if (biomeID.equals(oliveGroveID)) {
            return ClimateType.MEDITERRANEAN;
        } else if (biomeID.equals(mediterraneanConiferSavannaID)) {
            return ClimateType.MEDITERRANEAN;
        } else if (biomeID.equals(bambooSubtropicalLaurelJungleID)) {
            return ClimateType.HUMID_SUBTROPICAL;
        } else if (biomeID.equals(coastalSubtropicalDesertID)) {
            return ClimateType.MILD_COASTAL_DESERT;
        } else if (biomeID.equals(cookPineIslandID)) {
            return ClimateType.TROPICAL_JUNGLE_EDGE;
        } else if (biomeID.equals(corkOakSavannaID)) {
            return ClimateType.MEDITERRANEAN;
        } else if (biomeID.equals(dryTropicalBeachID)) {
            return ClimateType.TROPICAL_SAVANNA;
        } else if (biomeID.equals(eucalyptusPlainsID)) {
            return ClimateType.HUMID_SUBTROPICAL;
        } else if (biomeID.equals(eucalyptusSahelID)) {
            return ClimateType.TROPICAL_STEEPE;
        } else if (biomeID.equals(gravelTundraID)) {
            return ClimateType.TUNDRA;
        } else if (biomeID.equals(hemiborealForestID)) {
            return ClimateType.TEMPERATE_HEMIBOREAL;
        }
        return null;
    }
}
