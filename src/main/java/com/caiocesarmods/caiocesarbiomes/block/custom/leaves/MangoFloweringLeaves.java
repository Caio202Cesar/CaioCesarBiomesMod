package com.caiocesarmods.caiocesarbiomes.block.custom.leaves;

import com.caiocesarmods.caiocesarbiomes.Seasons.Season;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate.SummerHeat;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate.SummerHeatRegistry;
import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
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

    private static boolean isSummerHot(World world, BlockPos pos) {
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
        boolean hotSummer = isSummerHot(worldIn, pos);

        int distance = state.get(LeavesBlock.DISTANCE);
        boolean persistent = state.get(LeavesBlock.PERSISTENT);

        //Warm summer biomes
        if(!hotSummer) {
            if ("SUMMER".equals(currentSeason)) {
                if (random.nextInt(30) == 0) {
                    setFruiting(worldIn, pos, distance, persistent);
                    return;
                }

                if (random.nextInt(60) == 0) {
                    setNormal(worldIn, pos, distance, persistent);
                }
            }

            if ("FALL".equals(currentSeason)) {

                if (random.nextInt(75) == 0) {
                    setFruiting(worldIn, pos, distance, persistent);
                    return;
                }

                if (random.nextInt(15) == 0) {
                    setNormal(worldIn, pos, distance, persistent);
                }
            }
        }

        //Hot summer biomes
        if(hotSummer) {
            if ("SUMMER".equals(currentSeason)) {
                if (random.nextInt(15) == 0) {
                    setFruiting(worldIn, pos, distance, persistent);
                    return;
                }

                if (random.nextInt(60) == 0) {
                    setNormal(worldIn, pos, distance, persistent);
                }
            }

            if ("FALL".equals(currentSeason)) {

                if (random.nextInt(45) == 0) {
                    setFruiting(worldIn, pos, distance, persistent);
                    return;
                }

                if (random.nextInt(20) == 0) {
                    setNormal(worldIn, pos, distance, persistent);
                }
            }
        }

        if ("WINTER".equals(currentSeason)) {
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
