package com.caiocesarmods.caiocesarbiomes.block.custom.leaves;

import com.caiocesarmods.caioclimates.Seasons.Season;import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IForgeShearable;

import java.util.Random;

public class StarfruitFruitingLeaves extends LeavesBlock implements IForgeShearable {
    public StarfruitFruitingLeaves(Properties properties) {
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

        Biome biome = worldIn.getBiome(pos);
        float temp = biome.getTemperature(pos);

        //Pattern for tropical biomes
        if (random.nextInt(65) == 0) {

            int dropCount = 1 + random.nextInt(2);

            ItemStack itemStack = new ItemStack(ModItems.STARFRUIT.get(), dropCount);
            ItemEntity itemEntity = new ItemEntity(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, itemStack);

            worldIn.addEntity(itemEntity);

            int distance = state.get(LeavesBlock.DISTANCE);
            boolean persistent = state.get(LeavesBlock.PERSISTENT);

            worldIn.setBlockState(pos, TreeBlocks.STARFRUIT_LEAVES.get()
                    .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
            return;
        }

        // Pattern for subtropical biomes
        if (temp <= 0.89F && "SUMMER".equals(currentSeason) && random.nextInt(35) == 0) {

            int dropCount = 1 + random.nextInt(2);

            ItemStack itemStack = new ItemStack(ModItems.STARFRUIT.get(), dropCount);
            ItemEntity itemEntity = new ItemEntity(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, itemStack);

            worldIn.addEntity(itemEntity);

            int distance = state.get(LeavesBlock.DISTANCE);
            boolean persistent = state.get(LeavesBlock.PERSISTENT);

            worldIn.setBlockState(pos, TreeBlocks.STARFRUIT_LEAVES.get()
                    .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
        }

        if (temp <= 0.89F && "FALL".equals(currentSeason) && random.nextInt(35) == 0) {

            int dropCount = 1 + random.nextInt(2);

            ItemStack itemStack = new ItemStack(ModItems.STARFRUIT.get(), dropCount);
            ItemEntity itemEntity = new ItemEntity(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, itemStack);

            worldIn.addEntity(itemEntity);

            int distance = state.get(LeavesBlock.DISTANCE);
            boolean persistent = state.get(LeavesBlock.PERSISTENT);

            worldIn.setBlockState(pos, TreeBlocks.STARFRUIT_LEAVES.get()
                    .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
        }

        //Zone 9 only
        if (temp <= 0.84F && "WINTER".equals(currentSeason) && random.nextInt(25) == 0) {
            int distance = state.get(LeavesBlock.DISTANCE);
            boolean persistent = state.get(LeavesBlock.PERSISTENT);

            worldIn.setBlockState(pos, TreeBlocks.STARFRUIT_WINTER_FRUITING_LEAVES.get()
                    .getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent), 3);
        }
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (!worldIn.isRemote) {

            int dropCount = 1;

            ItemStack itemStack = new ItemStack(ModItems.STARFRUIT.get(), dropCount);
            ItemEntity itemEntity = new ItemEntity(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, itemStack);

            worldIn.addEntity(itemEntity);

            worldIn.setBlockState(pos, TreeBlocks.STARFRUIT_LEAVES.get().getDefaultState());

            worldIn.playSound(null, pos, SoundEvents.BLOCK_GRASS_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);

        }
        return ActionResultType.SUCCESS;
    }

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 90;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 100;
    }
}
