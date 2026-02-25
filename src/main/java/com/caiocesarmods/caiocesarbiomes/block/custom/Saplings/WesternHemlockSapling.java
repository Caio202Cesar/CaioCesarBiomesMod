package com.caiocesarmods.caiocesarbiomes.block.custom.Saplings;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate.SummerHeat;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate.SummerHeatRegistry;
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

public class WesternHemlockSapling extends SaplingBlock {
    public WesternHemlockSapling() {
        super(new WesternHemlockSapling.WesternHemlockTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING).hardnessAndResistance(0.0f)
                .sound(SoundType.PLANT));
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(TreeBlocks.WESTERN_HEMLOCK_SAPLING.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TreeBlocks.POTTED_WESTERN_HEMLOCK_SAPLING.get(), RenderType.getCutout());

    }

    private static boolean isSummerAllowed(World world, BlockPos pos) {
        SummerHeat heat = SummerHeatRegistry.get(world, pos);
        return heat == SummerHeat.WARM || heat == SummerHeat.COOLER;
    }

    //Hardy from zone 6 to 9
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        Biome biome = world.getBiome(pos);

        float temp = biome.getTemperature(pos);
        float minTemp = 0.6f;
        float maxTemp = 0.84f;

        float downfall = biome.getDownfall();
        float minDownfall = 0.6f;

        boolean validTemp = temp >= minTemp && temp <= maxTemp;
        boolean suitableHumidity = downfall >= minDownfall;
        boolean isWet = biome.getPrecipitation() != Biome.RainType.NONE;

        // 🌱 Growth logic
        if (validTemp && isWet && suitableHumidity) {
            super.randomTick(state, world, pos, random);
        }

        if (!isSummerAllowed(world, pos)) return;

        super.randomTick(state, world, pos, random);

    }

    @Override
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        if (!(worldIn instanceof World)) {
            return false;
        }

        World world = (World) worldIn;
        Biome biome = world.getBiome(pos);
        float temp = biome.getTemperature(pos);
        float downfall = biome.getDownfall();

        boolean tooHot = temp > 0.84F;
        boolean tooCold = temp < 0.6F;
        boolean isDry = biome.getPrecipitation() == Biome.RainType.NONE;
        boolean tooDry = downfall < 0.6F;

        if (tooHot || tooCold || isDry || tooDry) {
            return false;
        }

        if (!isSummerAllowed(world, pos)) return false;

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
            float downfall = biome.getDownfall();
            float minTemp = 0.6f, maxTemp = 0.84f, minDownfall = 0.6F;

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

            if (biome.getPrecipitation() == Biome.RainType.NONE) {
                player.sendMessage(
                        new StringTextComponent("This biome is too dry to this sapling."),
                        player.getUniqueID()
                );
                return ActionResultType.SUCCESS;
            }

            if (!isSummerAllowed(worldIn, pos)) {
                player.sendMessage(
                        new StringTextComponent("Summers are too hot or too cold for this sapling."),
                        player.getUniqueID()
                );
                return ActionResultType.SUCCESS;
            }

            if (downfall < minDownfall) {
                player.sendMessage(
                        new StringTextComponent("This biome is too dry for this sapling."),
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

    private static class WesternHemlockTree extends Tree {
        @Nullable
        @Override
        protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random random, boolean p_225546_2_) {
            return TreeFeatures.WESTERN_HEMLOCK_TREE;
        }
    }
}
