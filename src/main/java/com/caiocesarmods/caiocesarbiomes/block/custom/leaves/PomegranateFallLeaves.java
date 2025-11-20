package com.caiocesarmods.caiocesarbiomes.block.custom.leaves;

import com.caiocesarmods.caiocesarbiomes.Seasons.Season;
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

public class PomegranateFallLeaves extends LeavesBlock implements IForgeShearable {
    private final Supplier<Block> floweringLeavesSupplier;
    private final Supplier<Block> fallLeavesSupplier;

    public PomegranateFallLeaves(Properties properties,
                                 Supplier<Block> floweringLeavesSupplier,
                                 Supplier<Block> fallLeavesSupplier) {
        super(properties);
        this.floweringLeavesSupplier = floweringLeavesSupplier;
        this.fallLeavesSupplier = fallLeavesSupplier;
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
        super.randomTick(state, worldIn, pos, random);

        String currentSeason = Season.getSeason(worldIn.getDayTime());

        int distance = state.get(LeavesBlock.DISTANCE);
        boolean persistent = state.get(LeavesBlock.PERSISTENT);

        // Only change in certain season (you pick when)
        if ("FALL".equals(currentSeason) && random.nextInt(30) == 0) {

            // Determine which block to go to based on temperature
            Biome biome = worldIn.getBiome(pos);
            float temp = biome.getTemperature();
            Block nextBlock;

            if (temp < 0.9F) {
                // colder → go to fall leaves
                nextBlock = fallLeavesSupplier.get();

            } else {
                // warm enough → stays the same
                nextBlock = state.getBlock();
            }

            BlockState newState = nextBlock.getDefaultState()
                    .with(LeavesBlock.DISTANCE, distance)
                    .with(LeavesBlock.PERSISTENT, persistent);

            worldIn.setBlockState(pos, newState, 2);
        }

        if ("SUMMER".equals(currentSeason) && random.nextInt(60) == 0) {

            BlockState newState = floweringLeavesSupplier.get()
                    .getDefaultState()
                    .with(LeavesBlock.DISTANCE, distance)
                    .with(LeavesBlock.PERSISTENT, persistent);

            worldIn.setBlockState(pos, newState, 2);
        }
    }

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 90;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 100;
    }
}
