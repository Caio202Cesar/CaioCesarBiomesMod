package com.caiocesarmods.caiocesarbiomes.block.custom.Saplings;

import com.caiocesarmods.caiocesarbiomes.Climate.SummerHeat;
import com.caiocesarmods.caiocesarbiomes.Climate.SummerHeatRegistry;
import com.caiocesarmods.caiocesarbiomes.Seasons.Season;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.TreeFeatures;
import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import net.minecraft.block.*;
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

public class JapaneseMapleSapling extends SaplingBlock {
    public JapaneseMapleSapling() {
        super(new JapaneseMapleSapling.JapaneseMapleTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING).hardnessAndResistance(0.0f)
                .sound(SoundType.PLANT));
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(TreeBlocks.JAPANESE_MAPLE_SAPLING.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TreeBlocks.POTTED_JAPANESE_MAPLE_SAPLING.get(), RenderType.getCutout());

    }

    public boolean ticksRandomly(BlockState state) {
        return true;
    }

    /**
     * Performs a random tick on a block.
     *
     * @param state
     * @param world
     * @param pos
     * @param random
     */
    //Hardy from zone 5 to 10
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {

        String currentSeason = Season.getSeason(world.getDayTime());
        Biome biome = world.getBiome(pos);
        float temp = biome.getTemperature(pos);

        float minTemp = 0.5f;
        float maxTemp = 0.89f;

        boolean validTemp = temp >= minTemp && temp <= maxTemp;

        // 🌱 Growth logic
        if (validTemp) {
            super.randomTick(state, world, pos, random);
        }

        boolean protectedByLeaves = isProtectedByLeaves(world, pos);

        if ("SUMMER".equals(currentSeason) && isSummerHot(world, pos) && !protectedByLeaves) {
            if (random.nextInt(2) == 0) {
                world.setBlockState(pos, Blocks.DEAD_BUSH.getDefaultState(), 3);
            }
        }
    }

    private static boolean isSummerHot(World world, BlockPos pos) {
        SummerHeat heat = SummerHeatRegistry.get(world, pos);
        return heat == SummerHeat.HOT;
    }

    private boolean isProtectedByLeaves(ServerWorld world, BlockPos pos) {

        BlockPos.Mutable mutable = new BlockPos.Mutable();

        for (int y = pos.getY() + 1; y < world.getHeight(); y++) {
            mutable.setPos(pos.getX(), y, pos.getZ());
            BlockState state = world.getBlockState(mutable);

            if (state.getBlock() instanceof LeavesBlock) {
                return true; // Found canopy → protected
            }

            if (world.canSeeSky(mutable)) {
                return false; // Open sky → not protected
            }
        }

        return false;
    }

    @Override
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {

        if (!(worldIn instanceof World)) {
            return false;
        }

        World world = (World) worldIn;
        Biome biome = world.getBiome(pos);

        float temp = biome.getTemperature(pos);

        boolean tooHot = temp > 0.89F;
        boolean tooCold = temp < 0.5F;

        if (tooHot || tooCold) {
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
            Biome biome = worldIn.getBiome(pos);
            float temp = biome.getTemperature(pos);

            float minTemp = 0.5f, maxTemp = 0.89f;

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

            // If temp is in range, optionally allow normal processing:
            // return super.onBlockActivated(...);
            return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
        }
        return ActionResultType.SUCCESS;

    }

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {

        return 80;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {

        return 60;
    }

    private static class JapaneseMapleTree extends Tree {
        @Nullable
        @Override
        protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random random, boolean p_225546_2_) {
            return TreeFeatures.JAPANESE_MAPLE_TREE;
        }
    }
}
