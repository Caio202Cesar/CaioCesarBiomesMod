package com.caiocesarmods.caiocesarbiomes.World;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.gen.ModOreGeneration;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.gen.ModPlantGeneration;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CaioCesarBiomesMod.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModPlantGeneration.generatePlants(event);
        ModTreeGeneration.generateTrees(event);
        ModOreGeneration.generateOres(event);
        //ModEntityGeneration.onEntitySpawn(event);
    }
}
