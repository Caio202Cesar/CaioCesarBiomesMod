package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.Layers;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.BiomeFamilyRegistry;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.BiomeRelationship;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.BiomeRelationshipRegistry;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.RelationshipType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.area.IArea;
import net.minecraft.world.gen.layer.traits.IAreaTransformer2;
import net.minecraft.world.gen.layer.traits.IDimOffset0Transformer;

import java.util.Optional;

public enum HillsRelationshipLayer implements IAreaTransformer2, IDimOffset0Transformer {

    INSTANCE;

    @Override
    public int apply(
            INoiseRandom random,
            IArea previous,
            IArea current,
            int x,
            int z) {

        int before = previous.getValue(
                getOffsetX(x),
                getOffsetZ(z));

        int after = current.getValue(
                getOffsetX(x),
                getOffsetZ(z));

        // Vanilla didn't generate a hill here.
        if (before == after)
            return after;

        Biome beforeBiome =
                WorldGenRegistries.BIOME.getByValue(before);

        if (beforeBiome == null)
            return after;

        ResourceLocation id =
                WorldGenRegistries.BIOME.getKey(beforeBiome);

        if (id == null)
            return after;

        Optional<BiomeRelationship> relationship =
                BiomeRelationshipRegistry.getRelationship(
                        id,
                        RelationshipType.HILL);

        if (!relationship.isPresent())
            return after;

        // Chance failed
        if (random.random(relationship.get().getChance()) != 0)
            return after;

        ResourceLocation family =
                BiomeFamilyRegistry.getFamily(id);

        if (family == null)
            return after;

        int matches = 0;

        if (family.equals(family(previous.getValue(x, z - 1)))) matches++;
        if (family.equals(family(previous.getValue(x, z + 1)))) matches++;
        if (family.equals(family(previous.getValue(x - 1, z)))) matches++;
        if (family.equals(family(previous.getValue(x + 1, z)))) matches++;

        // Require all four neighbours to belong to the same family.
        if (matches < 4)
            return after;

        System.out.println(
                "[Hill] Replacing "
                        + id
                        + " -> "
                        + relationship.get().getChild());

        return WorldGenRegistries.BIOME
                .getOptional(relationship.get().getChild())
                .map(WorldGenRegistries.BIOME::getId)
                .orElse(after);
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