package com.caiocesarmods.caiocesarbiomes.block.Saplings;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.TreeFeatures;
import com.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.block.trees.BigTree;
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

public class RoyalPoincianaSapling extends SaplingBlock {
    public RoyalPoincianaSapling() {
        super(new RoyalPoincianaSapling.RoyalPoincianaTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING).hardnessAndResistance(0.0f)
                .sound(SoundType.PLANT));
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(ModBlocks.ROYAL_POINCIANA_SAPLING.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.POTTED_ROYAL_POINCIANA_SAPLING.get(), RenderType.getCutout());

    }

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 80;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 60;
    }

    private static class RoyalPoincianaTree extends BigTree {
        @Nullable
        @Override
        protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random random, boolean p_225546_2_) {
                return TreeFeatures.ROYAL_POINCIANA_TREE;
        }

        /**
         * Get a {@link ConfiguredFeature} of the huge variant of this tree
         *
         * @param rand
         */
        @Nullable
        @Override
        protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getHugeTreeFeature(Random rand) {
            return TreeFeatures.ROYAL_POINCIANA_BIG_TREE;
        }
    }
}
