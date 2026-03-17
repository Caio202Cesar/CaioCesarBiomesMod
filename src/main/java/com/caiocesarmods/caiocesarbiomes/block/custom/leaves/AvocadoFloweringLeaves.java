package com.caiocesarmods.caiocesarbiomes.block.custom.leaves;

import com.caiocesarmods.caiocesarbiomes.Seasons.Season;
import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IForgeShearable;

import java.util.Random;
import java.util.function.Supplier;

public class AvocadoFloweringLeaves extends LeavesBlock implements IForgeShearable {
    private final Supplier<Block> nextStage;

    public AvocadoFloweringLeaves(Properties properties, Supplier<Block> nextStage) {
        super(properties);
        this.nextStage = nextStage;
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

        //Pattern for subtropical biomes
        if (temp <= 0.89F && "SUMMER".equals(currentSeason)) {

            int distance = state.get(LeavesBlock.DISTANCE);
            boolean persistent = state.get(LeavesBlock.PERSISTENT);

            if (random.nextInt(30) == 0) {
                setFruiting(worldIn, pos, distance, persistent);
                return;
            }

            if (random.nextInt(60) == 0) {
                setNormal(worldIn, pos, distance, persistent);
            }
        }

        if (temp <= 0.89F && "FALL".equals(currentSeason)) {

            int distance = state.get(LeavesBlock.DISTANCE);
            boolean persistent = state.get(LeavesBlock.PERSISTENT);

            if (random.nextInt(60) == 0) {
                setFruiting(worldIn, pos, distance, persistent);
                return;
            }

            if (random.nextInt(30) == 0) {
                setNormal(worldIn, pos, distance, persistent);
            }
        }

        //Pattern for tropical biomes = mid of wet season to early dry.
        if (temp >= 0.9F && "SPRING".equals(currentSeason)) {

            int distance = state.get(LeavesBlock.DISTANCE);
            boolean persistent = state.get(LeavesBlock.PERSISTENT);

            if (random.nextInt(30) == 0) {
                setFruiting(worldIn, pos, distance, persistent);
                return;
            }

            if (random.nextInt(60) == 0) {
                setNormal(worldIn, pos, distance, persistent);
            }

        }

        if (temp >= 0.9F && "SUMMER".equals(currentSeason)) {

            int distance = state.get(LeavesBlock.DISTANCE);
            boolean persistent = state.get(LeavesBlock.PERSISTENT);

            if (random.nextInt(60) == 0) {
                setFruiting(worldIn, pos, distance, persistent);
                return;
            }

            if (random.nextInt(30) == 0) {
                setNormal(worldIn, pos, distance, persistent);
            }
        }
    }

    private void setFruiting(ServerWorld world, BlockPos pos, int distance, boolean persistent) {
        world.setBlockState(
                pos,
                TreeBlocks.AVOCADO_FRUITING_LEAVES.get()
                        .getDefaultState()
                        .with(LeavesBlock.DISTANCE, distance)
                        .with(LeavesBlock.PERSISTENT, persistent),
                3
        );
    }

    private void setNormal(ServerWorld world, BlockPos pos, int distance, boolean persistent) {
        world.setBlockState(
                pos,
                TreeBlocks.AVOCADO_LEAVES.get()
                        .getDefaultState()
                        .with(LeavesBlock.DISTANCE, distance)
                        .with(LeavesBlock.PERSISTENT, persistent),
                3
        );
    }

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 90;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 100;
    }
}
