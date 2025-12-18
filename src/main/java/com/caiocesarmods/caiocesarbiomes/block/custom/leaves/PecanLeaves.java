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

import javax.xml.ws.Holder;
import java.util.Random;
import java.util.function.Supplier;

public class PecanLeaves extends LeavesBlock implements IForgeShearable {
    private final Supplier<Block> nextStage;

    public PecanLeaves(Properties properties, Supplier<Block> nextStage) {
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
        float baseTemp = biome.getTemperature();
        boolean coldEnough = baseTemp < 0.9F;

        int distance = state.get(LeavesBlock.DISTANCE);
        boolean persistent = state.get(LeavesBlock.PERSISTENT);

        // SUMMER → fruit leaves
        if ("SUMMER".equals(currentSeason)
                && coldEnough
                && random.nextInt(35) == 0) {

            worldIn.setBlockState(pos, TreeBlocks.PECAN_FRUITING_LEAVES.get()
                    .getDefaultState()
                    .with(LeavesBlock.DISTANCE, distance)
                    .with(LeavesBlock.PERSISTENT, persistent), 2);

            return;
        }

        // FALL → fall leaves
        if ("FALL".equals(currentSeason)
                && coldEnough
                && random.nextInt(15) == 0) {

            worldIn.setBlockState(pos, TreeBlocks.PECAN_FALL_LEAVES.get()
                    .getDefaultState()
                    .with(LeavesBlock.DISTANCE, distance)
                    .with(LeavesBlock.PERSISTENT, persistent), 2);
        }
    }


    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 90;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 100;
    }
}
