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

public class PistachioLeaves extends LeavesBlock implements IForgeShearable {
    public PistachioLeaves(Properties properties) {
        super(properties);

    }

    private static boolean isSummerAllowed(World world, BlockPos pos) {
        SummerHeat heat = SummerHeatRegistry.get(world, pos);
        return heat == SummerHeat.HOT;
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

        if (temp <= 0.79F && "SUMMER".equals(currentSeason) && hotSummer && random.nextInt(55) == 0) {
            int distance = state.get(LeavesBlock.DISTANCE);
            boolean persistent = state.get(LeavesBlock.PERSISTENT);

            worldIn.setBlockState(pos, TreeBlocks.PISTACHIO_FRUITING_LEAVES.get()
                    .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
            return;
        }

        if ("WINTER".equals(currentSeason) && random.nextInt(15) == 0) {
            int distance = state.get(LeavesBlock.DISTANCE);
            boolean persistent = state.get(LeavesBlock.PERSISTENT);

            worldIn.setBlockState(pos, TreeBlocks.PISTACHIO_WINTER_BRANCHES.get()
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
