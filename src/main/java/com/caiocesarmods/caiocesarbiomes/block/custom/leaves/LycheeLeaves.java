package com.caiocesarmods.caiocesarbiomes.block.custom.leaves;

import com.caiocesarmods.caioclimates.Seasons.Season;import net.minecraft.block.Block;
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

public class LycheeLeaves extends LeavesBlock implements IForgeShearable {
    private final Supplier<Block> nextStage;

    public LycheeLeaves(Properties properties, Supplier<Block> nextStage) {
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

        if ("SPRING".equals(currentSeason)) {

            //Zone 11 = challenging flowering due to lack of chill hours
            if (temp < 0.94F && temp > 0.89 && nextStage != null && random.nextInt(360) == 0) {

                int distance = state.get(LeavesBlock.DISTANCE);
                boolean persistent = state.get(LeavesBlock.PERSISTENT);

                BlockState newState = nextStage.get().getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent);

                worldIn.setBlockState(pos, newState, 2);

            }

            //Zone 10 and 9 = good flowering due to lack of chill hours
            if (temp < 0.89 && nextStage != null && random.nextInt(25) == 0) {

                int distance = state.get(LeavesBlock.DISTANCE);
                boolean persistent = state.get(LeavesBlock.PERSISTENT);

                BlockState newState = nextStage.get().getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent);

                worldIn.setBlockState(pos, newState, 2);

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
