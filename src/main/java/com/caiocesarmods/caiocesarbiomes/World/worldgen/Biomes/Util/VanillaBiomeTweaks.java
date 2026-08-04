package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import com.caiocesarmods.caiocesarbiomes.Util.ModSoundEvents;
import com.caiocesarmods.caiocesarbiomes.Util.MutableBiomeAmbience;
import com.caiocesarmods.caiocesarbiomes.Util.MutableBiomeEffects;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.Biomes;

import java.util.Optional;

public class VanillaBiomeTweaks {
    private VanillaBiomeTweaks() {}

    public static void apply(RegistryKey<Biome> key, Biome biome) {

        if (key == Biomes.BEACH) {
            System.out.println("Found beach!");

            MutableBiomeEffects mutable = (MutableBiomeEffects)(Object) biome;

            BiomeAmbience ambience = mutable.getEffects();

            MutableBiomeAmbience ambienceMutable =
                    (MutableBiomeAmbience)(Object) ambience;

            ambienceMutable.setAmbientSound(
                    Optional.of(ModSoundEvents.BEACH_AMBIENCE.get()));

            System.out.println("Changed beach ambience.");
        }
    }
}
