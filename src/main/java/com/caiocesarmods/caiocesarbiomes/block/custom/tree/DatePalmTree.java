package com.caiocesarmods.caiocesarbiomes.block.custom.tree;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.TreeFeatures;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import javax.annotation.Nullable;
import java.util.Random;

public class DatePalmTree extends Tree {
    /**
     * Get a {@link ConfiguredFeature} of tree
     *
     * @param randomIn
     * @param largeHive
     */
    @Nullable
    @Override
    protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean largeHive) {
        return TreeFeatures.DATE_PALM_TREE;
    }
}
