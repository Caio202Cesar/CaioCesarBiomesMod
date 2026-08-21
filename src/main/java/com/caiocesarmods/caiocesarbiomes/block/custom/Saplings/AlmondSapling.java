package com.caiocesarmods.caiocesarbiomes.block.custom.Saplings;

import com.caiocesarmods.caiocesarbiomes.Seasons.Season;
import com.caiocesarmods.caioclimates.Climate.SummerHeat.SummerHeat;
import com.caiocesarmods.caioclimates.Climate.SummerHeat.SummerHeatHelper;
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

public class AlmondSapling extends SaplingBlock {
    public AlmondSapling() {
        super(new AlmondSapling.AlmondTree(), Properties.from(Blocks.OAK_SAPLING).hardnessAndResistance(0.0f)
                .sound(SoundType.PLANT));
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(TreeBlocks.ALMOND_SAPLING.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TreeBlocks.POTTED_ALMOND_SAPLING.get(), RenderType.getCutout());

    }

    private static boolean isSummerAllowed(World world, BlockPos pos) {
        SummerHeat heat = SummerHeat.fromTemperature(SummerHeatHelper.get(world, pos));
        return heat == SummerHeat.SCORCHING || heat == SummerHeat.VERY_HOT || heat == SummerHeat.HOT || heat == SummerHeat.WARM;
    }

    //Hardy to zone 5 to 10
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        String currentSeason = Season.getSeason(world.getDayTime());

        Biome biome = world.getBiome(pos);

        float temp = biome.getTemperature(pos);
        float minTemp = 0.5f;
        float maxTemp = 0.89f;

        boolean validTemp = temp >= minTemp && temp <= maxTemp;
        boolean isDry = biome.getPrecipitation() != Biome.RainType.RAIN;
        boolean isSaplingSheltered = isPlantSheltered(world, pos);
        boolean isSummerAllowed = isSummerAllowed(world, pos);

        // 🌱 Growth logic
        if (validTemp || isDry || isSummerAllowed) {
            // Only attempt natural growth in suitable biomes
            super.randomTick(state, world, pos, random);
        }

        if (temp < minTemp && "WINTER".equals(currentSeason) && !isSaplingSheltered && random.nextInt(3) == 0) {
            world.setBlockState(pos, Blocks.DEAD_BUSH.getDefaultState());
        }
    }

    private boolean isPlantSheltered(ServerWorld world, BlockPos pos) {

        BlockPos.Mutable checkPos = new BlockPos.Mutable(pos.getX(), pos.getY() + 1, pos.getZ());

        while (checkPos.getY() < world.getHeight()) {

            BlockState stateAbove = world.getBlockState(checkPos);

            if (stateAbove.isAir() || stateAbove.getBlock() instanceof VineBlock) {
                checkPos.move(Direction.UP);
                continue;
            }

            // Any block overhead shelters the plant.
            return true;
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

        boolean noDry = biome.getPrecipitation() == Biome.RainType.RAIN;

        if (tooHot || tooCold || noDry || !isSummerAllowed(world, pos)) {
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

            if (biome.getPrecipitation() == Biome.RainType.RAIN) {
                player.sendMessage(
                        new StringTextComponent("This biome is too wet to this sapling."),
                        player.getUniqueID()
                );
                return ActionResultType.SUCCESS;
            }

            if (!isSummerAllowed(worldIn, pos)) {
                player.sendMessage(
                        new StringTextComponent("Summers are too cold for this sapling."),
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


    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {

        return 80;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {

        return 60;
    }

    private static class AlmondTree extends Tree {
        @Nullable
        @Override
        protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random random, boolean p_225546_2_) {
                return TreeFeatures.ALMOND_TREE;
        }
    }
}
