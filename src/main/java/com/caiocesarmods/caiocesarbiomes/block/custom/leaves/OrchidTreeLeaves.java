package com.caiocesarmods.caiocesarbiomes.block.custom.leaves;

import com.caiocesarmods.caiocesarbiomes.Seasons.Season;
import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IForgeShearable;

import java.util.Random;

public class OrchidTreeLeaves extends LeavesBlock implements IForgeShearable {
    public OrchidTreeLeaves(Properties properties) {
        super(properties);

    }

    private boolean isUnderGlass(ServerWorld worldIn, BlockPos pos) {
        BlockPos.Mutable checkPos = new BlockPos.Mutable(pos.getX(), pos.getY() + 1, pos.getZ());

        while (checkPos.getY() < worldIn.getHeight()) {
            BlockState stateAbove = worldIn.getBlockState(checkPos);

            if (stateAbove.isAir()) {
                checkPos.move(Direction.UP);
                continue;
            }

            if (stateAbove.isTransparent()) {
                checkPos.move(Direction.UP);
                continue;
            }

            // Accept vanilla and modded glass
            if (stateAbove.getMaterial() == Material.GLASS) {
                return true;
            }

            // Hit something that is not glass → not protected
            return false;
        }

        return false;
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
        boolean underGlass = isUnderGlass(worldIn, pos);

        int distance = state.get(LeavesBlock.DISTANCE);
        boolean persistent = state.get(LeavesBlock.PERSISTENT);

        if ("FALL".equals(currentSeason) && random.nextInt(35) == 0) {
            //Pattern for zone 9 subtropical climates
            if (temp <= 0.84F) {
                if (underGlass) {
                    setNormal(worldIn, pos, distance, persistent);
                } else {
                    setDeciduous(worldIn, pos, distance, persistent);
                }
            }
        }

        if ("WINTER".equals(currentSeason)) {
            //Pattern for zone 9 subtropical climates
            if (temp <= 0.84F) {
                if (underGlass) {
                    setNormal(worldIn, pos, distance, persistent);
                } else {
                    setDeciduous(worldIn, pos, distance, persistent);
                }
            }

            if (temp >= 0.85F && temp <=0.89) {
                if (underGlass) {
                    setNormal(worldIn, pos, distance, persistent);
                } else {
                    setWinterFlowering(worldIn, pos, distance, persistent);
                }
            }
        }

        //Pattern for tropical climates
        if (temp >= 0.9F && "SUMMER".equals(currentSeason) && random.nextInt(35) == 0) {

            worldIn.setBlockState(pos, TreeBlocks.ORCHID_TREE_FLOWERING_BRANCHES.get()
                    .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
        }

        if (temp >= 0.9F && "FALL".equals(currentSeason) && random.nextInt(5) == 0) {

            worldIn.setBlockState(pos, TreeBlocks.ORCHID_TREE_FLOWERING_BRANCHES.get()
                    .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
        }
    }

    private void setDeciduous(ServerWorld world, BlockPos pos, int distance, boolean persistent) {
        world.setBlockState(
                pos,
                TreeBlocks.ORCHID_TREE_WINTER_BRANCHES.get()
                        .getDefaultState()
                        .with(LeavesBlock.DISTANCE, distance)
                        .with(LeavesBlock.PERSISTENT, persistent),
                3
        );
    }

    private void setNormal(ServerWorld world, BlockPos pos, int distance, boolean persistent) {
        world.setBlockState(
                pos,
                TreeBlocks.ORCHID_TREE_LEAVES.get()
                        .getDefaultState()
                        .with(LeavesBlock.DISTANCE, distance)
                        .with(LeavesBlock.PERSISTENT, persistent),
                3
        );
    }

    private void setWinterFlowering(ServerWorld world, BlockPos pos, int distance, boolean persistent) {
        world.setBlockState(
                pos,
                TreeBlocks.ORCHID_TREE_FLOWERING_BRANCHES.get()
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
