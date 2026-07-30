package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.Layers;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.BiomeFamilyRegistry;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.BiomeRelationship;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.BiomeRelationshipRegistry;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.RelationshipType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.ICastleTransformer;

import java.util.Optional;

public enum HillsRelationshipLayer implements ICastleTransformer {

    INSTANCE;

    @Override
    public int apply(
            INoiseRandom random,
            int north,
            int west,
            int south,
            int east,
            int center) {

        Biome biome =
                WorldGenRegistries.BIOME.getByValue(center);

        if (biome == null)
            return center;

        ResourceLocation id =
                WorldGenRegistries.BIOME.getKey(biome);

        System.out.println(
                "[Hill] center="
                        + center
                        + " biome="
                        + id);

        if (id == null)
            return center;

        Optional<BiomeRelationship> relationship =
                BiomeRelationshipRegistry.getRelationship(
                        id,
                        RelationshipType.HILL);

        if (!relationship.isPresent())
            return center;

        if (random.random(relationship.get().getChance()) != 0)
            return center;

        ResourceLocation family =
                BiomeFamilyRegistry.getFamily(id);

        if (family == null)
            return center;

        int matches = 0;

        if (family.equals(family(north))) matches++;
        if (family.equals(family(south))) matches++;
        if (family.equals(family(east)))  matches++;
        if (family.equals(family(west)))  matches++;

        // Only inside large continuous patches.
        if (matches < 4)
            return center;

        System.out.println(
                "[Hill] " + id +
                        " -> " +
                        relationship.get().getChild());

        return WorldGenRegistries.BIOME
                .getOptional(relationship.get().getChild())
                .map(WorldGenRegistries.BIOME::getId)
                .orElse(center);
    }

    private ResourceLocation family(int biomeId) {

        Biome biome =
                WorldGenRegistries.BIOME.getByValue(biomeId);

        if (biome == null)
            return null;

        ResourceLocation id =
                WorldGenRegistries.BIOME.getKey(biome);

        if (id == null)
            return null;

        return BiomeFamilyRegistry.getFamily(id);
    }
}