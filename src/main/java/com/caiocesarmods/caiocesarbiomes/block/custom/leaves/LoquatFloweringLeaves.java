package com.caiocesarmods.caiocesarbiomes.block.custom.leaves;

import com.caiocesarmods.caiocesarbiomes.Seasons.Season;
import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IForgeShearable;

import java.util.Random;

public class LoquatFloweringLeaves extends LeavesBlock implements IForgeShearable {
    public LoquatFloweringLeaves(Properties properties) {
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

        // Only operate in winter
        if (!"WINTER".equals(Season.getSeason(worldIn.getDayTime())))
            return;

        // Vanilla-style low frequency trigger
        if (random.nextInt(55) != 0)
            return;

        float temp = worldIn.getBiome(pos).getTemperature(pos);
        boolean underGlass = isUnderGlass(worldIn, pos);

        int distance = state.get(LeavesBlock.DISTANCE);
        boolean persistent = state.get(LeavesBlock.PERSISTENT);

        // --- ZONE 9+ (≥ 0.80F) → Full fruiting ---
        if (temp >= 0.80F) {
            setFruiting(worldIn, pos, distance, persistent);
            return;
        }

        // --- ZONE 8 (0.75F - 0.79F) ---
        if (temp >= 0.75F && temp <= 0.79F) {

            if (underGlass) {
                // Greenhouse = full fruiting
                setFruiting(worldIn, pos, distance, persistent);
            } else {
                // Outdoors = partial survival
                if (random.nextInt(4) == 0) {
                    setFruiting(worldIn, pos, distance, persistent);
                } else {
                    setNormal(worldIn, pos, distance, persistent);
                }
            }

            return;
        }

        // --- ZONE 7 or colder (< 0.75F) ---
        if (underGlass) {
            // Protected greenhouse → fruiting
            setFruiting(worldIn, pos, distance, persistent);
        } else {
            // Outdoor winter damage → blossom kill
            setNormal(worldIn, pos, distance, persistent);
        }
    }

    private void setFruiting(ServerWorld world, BlockPos pos, int distance, boolean persistent) {
        world.setBlockState(
                pos,
                TreeBlocks.LOQUAT_FRUITING_LEAVES.get()
                        .getDefaultState()
                        .with(LeavesBlock.DISTANCE, distance)
                        .with(LeavesBlock.PERSISTENT, persistent),
                3
        );
    }

    private void setNormal(ServerWorld world, BlockPos pos, int distance, boolean persistent) {
        world.setBlockState(
                pos,
                TreeBlocks.LOQUAT_LEAVES.get()
                        .getDefaultState()
                        .with(LeavesBlock.DISTANCE, distance)
                        .with(LeavesBlock.PERSISTENT, persistent),
                3
        );
    }

    private boolean isUnderGlass(ServerWorld worldIn, BlockPos pos) {
        BlockPos.Mutable checkPos = new BlockPos.Mutable(pos.getX(), pos.getY() + 1, pos.getZ());

        while (checkPos.getY() < worldIn.getHeight()) {
            BlockState stateAbove = worldIn.getBlockState(checkPos);

            if (stateAbove.isAir()) {
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

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 90;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 100;
    }
}
