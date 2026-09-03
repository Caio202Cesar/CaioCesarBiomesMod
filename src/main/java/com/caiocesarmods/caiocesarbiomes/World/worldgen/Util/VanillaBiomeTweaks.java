package com.caiocesarmods.caiocesarbiomes.World.worldgen.Util;

import com.caiocesarmods.caiocesarbiomes.Util.ModSoundEvents;
import com.caiocesarmods.caiocesarbiomes.Util.MutableBiomeAmbience;
import com.caiocesarmods.caiocesarbiomes.Util.MutableBiomeEffects;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.Biomes;

import java.util.Optional;

public class VanillaBiomeTweaks {
    private VanillaBiomeTweaks() {}

    public static void apply(ResourceLocation id, Biome biome) {

        if (id.equals(new ResourceLocation("minecraft", "forest"))) {

            System.out.println("Found forest!");

            MutableBiomeEffects mutable =
                    (MutableBiomeEffects)(Object) biome;

            BiomeAmbience ambience = mutable.getEffects();

            MutableBiomeAmbience mutableAmbience =
                    (MutableBiomeAmbience)(Object) ambience;

            mutableAmbience.setAmbientSound(
                    Optional.of(ModSoundEvents.LAURISSILVA_AMBIENCE.get()));

            System.out.println("Changed forest ambience.");
        }

        if (id.equals(new ResourceLocation("minecraft", "beach"))) {

            System.out.println("Found beach!");

            MutableBiomeEffects mutable =
                    (MutableBiomeEffects)(Object) biome;

            BiomeAmbience ambience = mutable.getEffects();

            MutableBiomeAmbience mutableAmbience =
                    (MutableBiomeAmbience)(Object) ambience;

            mutableAmbience.setAmbientSound(
                    Optional.of(ModSoundEvents.BEACH_AMBIENCE.get()));

            System.out.println("Changed forest ambience.");
        }
    }
}
