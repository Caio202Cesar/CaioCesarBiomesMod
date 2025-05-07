package com.caiocesarmods.caiocesarbiomes.block.custom.Saplings;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.TreeFeatures;
import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
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

public class WhiteCrapeMyrtleSapling extends SaplingBlock {
        public WhiteCrapeMyrtleSapling() {
            super(new WhiteCrapeMyrtleTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING).hardnessAndResistance(0.0f)
                    .sound(SoundType.PLANT));
        }

        @OnlyIn(Dist.CLIENT)
        public static void registerRenderLayer() {
            RenderTypeLookup.setRenderLayer(ModPlants.WHITE_CRAPE_MYRTLE_SAPLING.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(ModPlants.POTTED_WHITE_CRAPE_MYRTLE_SAPLING.get(), RenderType.getCutout());

        }

        public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
            return 80;
        }

        public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
            return 60;
        }

    private static class WhiteCrapeMyrtleTree extends Tree {
            @Nullable
            @Override
        protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random random, boolean p_225546_2_) {
            return TreeFeatures.WHITE_CRAPE_MYRTLE_TREE;
        }
    }
}
