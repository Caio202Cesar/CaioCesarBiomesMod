package com.caiocesarmods.caiocesarbiomes.block.custom.leaves;

import com.caiocesarmods.caioclimates.Seasons.Season;import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
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

public class MarulaLeaves extends LeavesBlock implements IForgeShearable {
    public MarulaLeaves(Properties properties) {
        super(properties);
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

        //Real life marula fruits on SUMMER, which corresponds to the wet season in most savanna climates (Koopen's Aw) in real life.
        //However, since Minecraft's season mods usually takes the SUMMER as these climates' dry season and the WINTER as the wet one, the mod's marula tree will fruit in the WINTER.
        if ("WINTER".equals(currentSeason) && random.nextInt(25) == 0) {

            int distance = state.get(LeavesBlock.DISTANCE);
            boolean persistent = state.get(LeavesBlock.PERSISTENT);

            worldIn.setBlockState(pos, TreeBlocks.MARULA_FRUITING_LEAVES.get()
                    .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);

        }

        if ("SUMMER".equals(currentSeason) && random.nextInt(10) == 0) {

            int distance = state.get(LeavesBlock.DISTANCE);
            boolean persistent = state.get(LeavesBlock.PERSISTENT);

            worldIn.setBlockState(pos, TreeBlocks.MARULA_DRIED_BRANCHES.get()
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
