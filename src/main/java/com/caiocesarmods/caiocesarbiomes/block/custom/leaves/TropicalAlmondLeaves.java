package com.caiocesarmods.caiocesarbiomes.block.custom.leaves;

import com.caiocesarmods.caiocesarbiomes.Seasons.Season;
import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IForgeShearable;

import java.util.Random;
import java.util.function.Supplier;

public class TropicalAlmondLeaves extends LeavesBlock implements IForgeShearable {
    private final Supplier<Block> nextStage;

    public TropicalAlmondLeaves(Properties properties, Supplier<Block> nextStage) {
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

        //Pattern for  tropical biomes
        if (temp >= 0.9F && "SUMMER".equals(currentSeason) && nextStage != null && random.nextInt(45) == 0) {

            int dropCount = 1;

            ItemStack itemStack = new ItemStack(ModItems.TROPICAL_ALMOND.get(), dropCount);
            ItemEntity itemEntity = new ItemEntity(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, itemStack);

            worldIn.addEntity(itemEntity);

            int distance = state.get(LeavesBlock.DISTANCE);
            boolean persistent = state.get(LeavesBlock.PERSISTENT);

            BlockState newState = nextStage.get().getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent);

            worldIn.setBlockState(pos, newState, 2);

        }

        if (temp >= 0.9F && "FALL".equals(currentSeason) && nextStage != null && random.nextInt(5) == 0) {

            int distance = state.get(LeavesBlock.DISTANCE);
            boolean persistent = state.get(LeavesBlock.PERSISTENT);

            BlockState newState = nextStage.get().getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent);

            worldIn.setBlockState(pos, newState, 2);

        }

        //Pattern for  subtropical biomes
        if (temp <= 0.89F && "FALL".equals(currentSeason) && nextStage != null && random.nextInt(45) == 0) {

            int dropCount = 1;

            ItemStack itemStack = new ItemStack(ModItems.TROPICAL_ALMOND.get(), dropCount);
            ItemEntity itemEntity = new ItemEntity(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, itemStack);

            worldIn.addEntity(itemEntity);

            int distance = state.get(LeavesBlock.DISTANCE);
            boolean persistent = state.get(LeavesBlock.PERSISTENT);

            BlockState newState = nextStage.get().getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent);

            worldIn.setBlockState(pos, newState, 2);

        }

        if (temp <= 0.89F && "WINTER".equals(currentSeason) && nextStage != null && random.nextInt(5) == 0) {

            int distance = state.get(LeavesBlock.DISTANCE);
            boolean persistent = state.get(LeavesBlock.PERSISTENT);

            BlockState newState = nextStage.get().getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent);

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
