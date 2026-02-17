package com.caiocesarmods.caiocesarbiomes.block.custom.Saplings;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.TreeFeatures;
import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.trees.BigTree;
import net.minecraft.block.trees.Tree;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.Random;

public class WeepingWillowSapling extends SaplingBlock {
    public WeepingWillowSapling() {
        super(new WeepingWillowTree(), Properties.from(Blocks.OAK_SAPLING).hardnessAndResistance(0.0f)
                .sound(SoundType.PLANT));
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(TreeBlocks.WEEPING_WILLOW_SAPLING.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TreeBlocks.POTTED_WEEPING_WILLOW_SAPLING.get(), RenderType.getCutout());

    }

    //Hardy from zone 4 to 10
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        float biomeTemp = world.getBiome(pos).getTemperature(pos);
        float minTemp = 0.4f;
        float maxTemp = 0.89f;

        // Temperature constraint
        if (biomeTemp < minTemp || biomeTemp > maxTemp) {
            return; // block natural growth
        }

        // Water proximity constraint (🚫 forbid FAR from water)
        if (!isNearWater(world, pos, 4)) {
            return; // block natural growth
        }

        // All conditions satisfied → allow vanilla growth logic
        super.randomTick(state, world, pos, random);
    }

    @Override
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        if (!(worldIn instanceof World)) {
            return false;
        }

        World world = (World) worldIn;

        // ---- TEMPERATURE RESTRICTION (your existing logic) ----
        Biome biome = world.getBiome(pos);
        float temp = biome.getTemperature(pos);

        boolean tooHot = temp > 0.89F;
        boolean tooCold = temp < 0.4F;

        if (tooHot || tooCold) {
            return false;
        }

        // ---- WATER PROXIMITY RESTRICTION (new logic) ----
        int radius = 4; // blocks away from water (tune this)

        if (!isNearWater(world, pos, radius)) {
            return false;
        }

        return super.canGrow(worldIn, pos, state, isClient);
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random random, BlockPos pos, BlockState state) {
        // Always allow for the check, we'll block in grow()
        return true;
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (!worldIn.isRemote) {
            float temp = worldIn.getBiome(pos).getTemperature(pos);
            float minTemp = 0.4f, maxTemp = 0.89f;

            if (temp < minTemp) {
                player.sendMessage(
                        new StringTextComponent("This biome is too cold for this sapling."),
                        player.getUniqueID()
                );
                return ActionResultType.SUCCESS; // Prevent further processing if needed
            }

            if (temp > maxTemp) {
                player.sendMessage(
                        new StringTextComponent("This biome is too hot for this sapling."),
                        player.getUniqueID()
                );
                return ActionResultType.SUCCESS; // Prevent further processing if needed
            }

            int radius = 4;

            // Variant A: forbid being NEAR water (as discussed earlier)
            if (!isNearWater(worldIn, pos, radius)) {
                player.sendMessage(
                        new StringTextComponent("This sapling is too far from water."),
                        player.getUniqueID()
                );
                return ActionResultType.SUCCESS;
            }

            // If temp is in range, optionally allow normal processing:
            // return super.onBlockActivated(...);
            return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);

        }

        return ActionResultType.SUCCESS;
    }

    private boolean isNearWater(World world, BlockPos pos, int radius) {
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        for (int dx = -radius; dx <= radius; dx++) {
            for (int dz = -radius; dz <= radius; dz++) {
                for (int dy = -1; dy <= 1; dy++) {
                    mutable.setPos(pos.getX() + dx, pos.getY() + dy, pos.getZ() + dz);

                    if (world.getBlockState(mutable).getMaterial() == Material.WATER) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {

        return 80;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {

        return 60;
    }

    private static class WeepingWillowTree extends BigTree {
        @Nullable
        @Override
        protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random random, boolean p_225546_2_) {
            return TreeFeatures.WEEPING_WILLOW_FANCY;
        }

        /**
         * Get a {@link ConfiguredFeature} of the huge variant of this tree
         *
         * @param rand
         */
        @Nullable
        @Override
        protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getHugeTreeFeature(Random rand) {
            return TreeFeatures.WEEPING_WILLOW_BIG;
        }
    }
}


