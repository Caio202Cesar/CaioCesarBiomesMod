package com.caiocesarmods.caiocesarbiomes.block.custom.leaves;

import com.caiocesarmods.caiocesarbiomes.Climate.SummerHeat;
import com.caiocesarmods.caiocesarbiomes.Climate.SummerHeatRegistry;
import com.caiocesarmods.caiocesarbiomes.Seasons.Season;
import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IForgeShearable;

import java.util.Random;

public class PecanLeaves extends LeavesBlock implements IForgeShearable {
    public PecanLeaves(Properties properties) {
        super(properties);

    }

    private static boolean isSummerAllowed(World world, BlockPos pos) {
        SummerHeat heat = SummerHeatRegistry.get(world, pos);
        return heat == SummerHeat.HOT;
    }

    private void setNormal(ServerWorld world, BlockPos pos, int distance, boolean persistent) {
        world.setBlockState(
                pos,
                TreeBlocks.PECAN_LEAVES.get()
                        .getDefaultState()
                        .with(LeavesBlock.DISTANCE, distance)
                        .with(LeavesBlock.PERSISTENT, persistent),
                3
        );
    }

    private void setFruiting(ServerWorld world, BlockPos pos, int distance, boolean persistent) {
        world.setBlockState(
                pos,
                TreeBlocks.PECAN_FRUITING_LEAVES.get()
                        .getDefaultState()
                        .with(LeavesBlock.DISTANCE, distance)
                        .with(LeavesBlock.PERSISTENT, persistent),
                3
        );
    }

    public boolean ticksRandomly(BlockState state) {
        return true;
    }

    /**
     * Performs a random tick on a block.
     *
     * @param state
     * @param worldIn
     * @param pos
     * @param random
     */
    @Override
    public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
        String currentSeason = Season.getSeason(worldIn.getDayTime());
        Biome biome = worldIn.getBiome(pos);

        float temp = biome.getTemperature(pos);
        boolean hotSummer = isSummerAllowed(worldIn, pos);

        int distance = state.get(LeavesBlock.DISTANCE);
        boolean persistent = state.get(LeavesBlock.PERSISTENT);

        if ("SUMMER".equals(currentSeason) && random.nextInt(55) == 0) {
            //Pattern for zone 9 subtropical climates
            if (temp <= 0.84F) {
                if (hotSummer) {
                    setFruiting(worldIn, pos, distance, persistent);
                } else {
                    setNormal(worldIn, pos, distance, persistent);
                }
            }
        }

        //Pattern for subtropical biomes
        if (temp < 0.89F && temp > 0.8F && "FALL".equals(currentSeason) && random.nextInt(45) == 0) {

            worldIn.setBlockState(pos, TreeBlocks.PECAN_FALL_LEAVES.get()
                    .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
        }

        //Pattern for temperate biomes
        if (temp < 0.79F && "FALL".equals(currentSeason) && random.nextInt(25) == 0) {

            worldIn.setBlockState(pos, TreeBlocks.PECAN_FALL_LEAVES.get()
                    .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
        }

        if (temp < 0.89F && "WINTER".equals(currentSeason) && random.nextInt(5) == 0) {

            worldIn.setBlockState(pos, TreeBlocks.PECAN_FALL_LEAVES.get()
                    .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
        }
    }

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 90;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 100;
    }
}
