package com.caiocesarmods.caiocesarbiomes.World.worldgen.Util.Layers;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Util.BiomeRelationship;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Util.BiomeRelationshipRegistry;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.area.IArea;
import net.minecraft.world.gen.layer.traits.IAreaTransformer2;
import net.minecraft.world.gen.layer.traits.IDimOffset0Transformer;

import java.util.Optional;

public enum RiverRelationshipLayer implements IAreaTransformer2, IDimOffset0Transformer {

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

        // Vanilla didn't generate a river.
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
                BiomeRelationshipRegistry.getRiverRelationship(id);

        Biome afterBiome = WorldGenRegistries.BIOME.getByValue(after);

        ResourceLocation afterId =
                afterBiome == null
                        ? null
                        : WorldGenRegistries.BIOME.getKey(afterBiome);

        System.out.println(
                "[River]"
                        + " before=" + before
                        + " (" + id + ")"
                        + " after=" + after
                        + " (" + afterId + ")");

        if (!relationship.isPresent())
            return after;

        System.out.println(
                "[River] Replacing with " +
                        relationship.get().getChild());

        System.out.println(
                "[River] replacing "
                        + afterId
                        + " -> "
                        + relationship.get().getChild());

        return WorldGenRegistries.BIOME
                .getOptional(relationship.get().getChild())
                .map(WorldGenRegistries.BIOME::getId)
                .orElse(after);
    }
}
