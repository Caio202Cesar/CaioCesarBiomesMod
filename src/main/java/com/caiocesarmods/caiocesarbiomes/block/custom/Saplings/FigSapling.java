package com.caiocesarmods.caiocesarbiomes.block.custom.Saplings;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.TreeFeatures;
import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import com.caiocesarmods.caioclimates.block.ClimaticTree;
import com.caiocesarmods.caioclimates.block.Saplings.ClimaticSapling;
import net.minecraft.block.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.Random;

public class FigSapling extends ClimaticSapling {
    public FigSapling() {
        super(new FigTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING).hardnessAndResistance(0.0f)
                .sound(SoundType.PLANT));
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(TreeBlocks.FIG_SAPLING.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TreeBlocks.POTTED_FIG_SAPLING.get(), RenderType.getCutout());

    }

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 80;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 60;
    }

    private static class FigTree extends ClimaticTree {
        @Nullable
        @Override
        protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getClimaticTreeFeature(Random random, boolean b, World world, BlockPos blockPos) {

            Biome biome = world.getBiome(blockPos);
            float temp = biome.getTemperature(blockPos);

            if (temp > 0.75F) {
                if (random.nextInt(10) == 0) {
                    return TreeFeatures.WHITE_FIG_TREE;
                } else {
                    return TreeFeatures.FORKY_FIG_TREE;
                }
            } else {
                if (random.nextInt(10) == 0) {
                    return TreeFeatures.WHITE_FIG_BUSH;
                } else {
                    return TreeFeatures.FIG_BUSH;
                }
            }
        }
    }
}
