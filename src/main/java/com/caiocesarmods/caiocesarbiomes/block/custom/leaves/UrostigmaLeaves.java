package com.caiocesarmods.caiocesarbiomes.block.custom.leaves;

import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import com.caiocesarmods.caioclimates.Climate.Drought.DroughtHandler;
import com.caiocesarmods.caioclimates.Climate.Drought.DroughtPattern;
import com.caiocesarmods.caioclimates.Climate.Drought.DroughtPatternRegistry;
import com.caiocesarmods.caioclimates.Climate.SummerHeat.SummerHeat;
import com.caiocesarmods.caioclimates.Climate.SummerHeat.SummerHeatHelper;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class UrostigmaLeaves extends LeavesBlock {
    public UrostigmaLeaves() {
        super(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                .notSolid().sound(SoundType.PLANT).harvestTool(ToolType.HOE));
    }

    public boolean ticksRandomly(BlockState state) {
        return true;
    }

    /*
    private static boolean isDroughtUnsuitable(World world, BlockPos pos) {
        Biome biome = world.getBiome(pos);
        DroughtPattern pattern = DroughtPatternRegistry.get(biome);
        return pattern == DroughtPattern.SEMI_ARID || pattern == DroughtPattern.ARID;
    }*/

    private static boolean isSummerAllowed(World world, BlockPos pos) {
        SummerHeat heat = SummerHeat.fromTemperature(SummerHeatHelper.get(world, pos));
        return heat == SummerHeat.WARM || heat == SummerHeat.MILD;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {

        BlockPos down = pos.down();
        Biome biome = world.getBiome(pos);

        float downfall = biome.getDownfall();
        float minDownfall = 0.7f;
        float maxDownfall = 1.0f;

        float temperature = biome.getTemperature(pos);
        float minTemperature = 0.8f;

        //Only in subtropical/tropical and wet climates
        if (world.isAirBlock(down) && temperature > minTemperature) {
            if (downfall random.nextInt(20) == 0) {

                BlockPos belowPos = pos.down();
                BlockState belowState = world.getBlockState(belowPos);

                // Check if the space below is air
                if (belowState.isAir()) {
                    world.setBlockState(belowPos, TreeBlocks.FICUS_ROOTS_PLANT.get().getDefaultState(), 2);
                }
            }

            if (biome.getPrecipitation() == Biome.RainType.NONE && !isDroughtUnsuitable(world, pos)
                    && random.nextFloat() < 0.38F) {

                BlockPos belowPos = pos.down();
                BlockState belowState = world.getBlockState(belowPos);

                // Check if the space below is air
                if (belowState.isAir()) {
                    world.setBlockState(belowPos, TreeBlocks.FICUS_ROOTS_PLANT.get().getDefaultState(), 2);
                }
            }
        }
    }

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 90;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 100;
    }
}

