package com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util;

import net.minecraft.util.ResourceLocation;

import java.util.ArrayList;
import java.util.List;

public class BiomeRelationship {
    private final ResourceLocation parent;
    private final ResourceLocation child;
    private final RelationshipType type;
    private final int chance;
    private final int edgeSize;     // optional
    private final int priority;     // optional

    public BiomeRelationship(ResourceLocation parent,
                             ResourceLocation child,
                             RelationshipType type,
                             int chance,
                             int edgeSize,
                             int priority) {

        this.parent = parent;
        this.child = child;
        this.type = type;
        this.chance = chance;
        this.edgeSize = edgeSize;
        this.priority = priority;
    }

    public ResourceLocation getParent() {
        return parent;
    }

    public ResourceLocation getChild() {
        return child;
    }

    public RelationshipType getType() {
        return type;
    }

    public int getChance() {
        return chance;
    }
}
