package com.caiocesarmods.caiocesarbiomes.World.worldgen.Util;

import net.minecraft.util.ResourceLocation;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BiomeRelationship {
    private final ResourceLocation parent;
    private final ResourceLocation child;
    private final RelationshipType type;
    private final int chance;
    private final int edgeSize;     // optional
    private final int priority;     // optional
    private final int minNeighbourMatches;
    private final boolean beach;
    private final boolean river;
    private final Set<ResourceLocation> requiredNeighbours;
    private final MatchMode matchMode;

    public BiomeRelationship(ResourceLocation parent,
                             ResourceLocation child,
                             RelationshipType type,
                             int chance,
                             int edgeSize,
                             int priority,
                             int minNeighbourMatches,
                             boolean beach,
                             boolean river,
                             MatchMode matchMode,
                             ResourceLocation... requiredNeighbours) {

        this.parent = parent;
        this.child = child;
        this.type = type;
        this.chance = chance;
        this.edgeSize = edgeSize;
        this.priority = priority;
        this.minNeighbourMatches = minNeighbourMatches;
        this.beach = beach;
        this.river = river;
        this.matchMode = matchMode;
        this.requiredNeighbours = new HashSet<>();

        if (requiredNeighbours != null) {
            Collections.addAll(this.requiredNeighbours, requiredNeighbours);
        }
    }

    public Set<ResourceLocation> getRequiredNeighbours() {
        return requiredNeighbours;
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

    public MatchMode getMatchMode() {return matchMode;}

    public int getMinNeighbourMatches() {return minNeighbourMatches;}

    public int getChance() {
        return chance;
    }

    public boolean isBeach() {
        return beach;
    }

    public boolean isRiver() {
        return river;
    }
}
