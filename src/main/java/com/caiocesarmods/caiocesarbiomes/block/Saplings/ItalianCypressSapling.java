package com.caiocesarmods.caiocesarbiomes.block.Saplings;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.TreeFeatures;
import com.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.block.trees.Tree;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.Random;

public class ItalianCypressSapling extends SaplingBlock {
    public ItalianCypressSapling() {
        super(new ItalianCypressSapling.ItalianCypressTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING).hardnessAndResistance(0.0f)
                .sound(SoundType.PLANT));
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(ModBlocks.ITALIAN_CYPRESS_SAPLING.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.POTTED_ITALIAN_CYPRESS_SAPLING.get(), RenderType.getCutout());

    }

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 80;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 60;
    }

    private static class ItalianCypressTree extends Tree {
        @Nullable
        @Override
        protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random random, boolean hasBees) {
            return TreeFeatures.ITALIAN_CYPRESS_TREE;
        }
    }
}


