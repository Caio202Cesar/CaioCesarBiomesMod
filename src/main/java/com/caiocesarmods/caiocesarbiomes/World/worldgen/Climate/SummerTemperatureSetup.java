package com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate;

import net.minecraft.util.ResourceLocation;

public class SummerTemperatureSetup {
    public static void register() {

        /// Minecraft Vanilla
        System.out.println("SummerTemperatureSetup.register()");
        System.out.println("Before: " + SummerTemperatureRegistry.size());

        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "warm_ocean"), 0.9F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "deep_warm_ocean"), 0.9F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "lukewarm_ocean"), 0.85F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "deep_lukewarm_ocean"), 0.85F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "ocean"), 0.8F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "deep_ocean"), 0.8F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "cold_ocean"), 0.6F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "deep_cold_ocean"), 0.6F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "frozen_ocean"), 0.2F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "deep_frozen_ocean"), 0.2F);

        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "frozen_river"), 0.2F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "snowy_tundra"), 0.2F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "snowy_mountains"), 0.2F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "snowy_beach"), 0.2F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "ice_spikes"), 0.15F);

        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "plains"), 0.95F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "sunflower_plains"), 0.95F);

        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "desert"), 1.5F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "desert_hills"), 1.5F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "desert_lakes"), 1.5F);

        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "mountains"), 0.7F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "mountain_edge"), 0.7F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "wooded_mountains"), 0.7F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "gravelly_mountains"), 0.5F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "modified_gravelly_mountains"), 0.5F);

        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "forest"), 0.85F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "wooded_hills"), 0.85F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "flower_forest"), 0.85F);

        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "taiga"), 0.6F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "taiga_hills"), 0.6F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "snowy_taiga"), 0.2F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "snowy_taiga_hills"), 0.2F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "giant_tree_taiga"), 0.6F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "giant_tree_taiga_hills"), 0.6F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "taiga_mountains"), 0.6F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "snowy_taiga_mountains"), 0.2F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "giant_spruce_taiga"), 0.6F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "giant_spruce_taiga_hills"), 0.6F);

        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "swamp"), 0.95F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "swamp_hills"), 0.95F);

        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "mushroom_fields"), 0.85F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "mushroom_fields_shore"), 0.85F);

        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "beach"), 0.85F); //Cfb temperate beach
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "stone_beach"), 0.6F); //taiga beach

        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "jungle"), 0.95F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "jungle_hills"), 0.95F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "jungle_edge"), 0.95F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "modified_jungle"), 0.95F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "modified_jungle_edge"), 0.95F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "bamboo_jungle"), 0.95F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "bamboo_jungle_hills"), 0.95F);

        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "birch_forest"), 0.7F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "birch_forest_hills"), 0.7F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "tall_birch_forest"), 0.7F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "tall_birch_hills"), 0.7F);

        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "dark_forest"), 0.85F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "dark_forest_hills"), 0.85F);

        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "savanna"), 0.95F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "savanna_plateau"), 0.95F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "shattered_savanna"), 0.95F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "shattered_savanna_plateau"), 0.95F);

        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "soul_sand_valley"), 4.0F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "crimson_forest"), 3.0F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "warped_forest"), 2.5F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "basalt_deltas"), 3.5F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "nether_wastes"), 4.0F);

        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "badlands"), 1.0F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "wooded_badlands_plateau"), 1.0F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "badlands_plateau"), 1.0F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "eroded_badlands"), 1.0F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "modified_wooded_badlands_plateau"), 1.0F);
        SummerTemperatureRegistry.register(new ResourceLocation("minecraft", "modified_badlands_plateau"), 1.0F);

        System.out.println("After: " + SummerTemperatureRegistry.size());

    }
}
