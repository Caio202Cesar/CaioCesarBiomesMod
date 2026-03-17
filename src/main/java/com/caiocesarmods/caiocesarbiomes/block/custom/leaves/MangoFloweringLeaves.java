package com.caiocesarmods.caiocesarbiomes.block.custom.leaves;

import com.caiocesarmods.caiocesarbiomes.Seasons.Season;
import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IForgeShearable;

import java.util.Random;
import java.util.function.Supplier;

public class MangoFloweringLeaves extends LeavesBlock implements IForgeShearable {
    private final Supplier<Block> nextStage;

    public MangoFloweringLeaves(Properties properties, Supplier<Block> nextStage) {
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

        if ("SUMMER".equals(currentSeason)) {

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

        if ("FALL".equals(currentSeason)) {

            int distance = state.get(LeavesBlock.DISTANCE);
            boolean persistent = state.get(LeavesBlock.PERSISTENT);

            if (random.nextInt(75) == 0) {
                setFruiting(worldIn, pos, distance, persistent);
                return;
            }

            if (random.nextInt(15) == 0) {
                setNormal(worldIn, pos, distance, persistent);
            }
        }

        if ("FALL".equals(currentSeason)) {

            int distance = state.get(LeavesBlock.DISTANCE);
            boolean persistent = state.get(LeavesBlock.PERSISTENT);

            setNormal(worldIn, pos, distance, persistent);

        }
    }

    private void setFruiting(ServerWorld world, BlockPos pos, int distance, boolean persistent) {
        world.setBlockState(
                pos,
                TreeBlocks.MANGO_FRUITING_LEAVES.get()
                        .getDefaultState()
                        .with(LeavesBlock.DISTANCE, distance)
                        .with(LeavesBlock.PERSISTENT, persistent),
                3
        );
    }

    private void setNormal(ServerWorld world, BlockPos pos, int distance, boolean persistent) {
        world.setBlockState(
                pos,
                TreeBlocks.MANGO_LEAVES.get()
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
