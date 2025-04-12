package com.caiocesarmods.caiocesarbiomes.block.custom.leaves;

import com.caiocesarmods.caiocesarbiomes.Seasons.Season;
import com.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.block.Block;
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
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IForgeShearable;

import java.util.Random;
import java.util.function.Supplier;

public class SweetChestnutFruitingLeaves extends LeavesBlock implements IForgeShearable {
    private final Supplier<Block> nextStage;

    public SweetChestnutFruitingLeaves(Properties properties, Supplier<Block> nextStage) {
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

        if ("WINTER".equals(currentSeason) && nextStage != null && random.nextInt(15) == 0) {

            int dropCount = 5;

            ItemStack itemStack = new ItemStack(ModItems.CHERRY_PLUM.get(), dropCount);
            ItemEntity itemEntity = new ItemEntity(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, itemStack);

            worldIn.addEntity(itemEntity);

            int distance = state.get(LeavesBlock.DISTANCE);
            boolean persistent = state.get(LeavesBlock.PERSISTENT);

            BlockState newState = nextStage.get().getDefaultState().with(LeavesBlock.DISTANCE, distance).with(LeavesBlock.PERSISTENT, persistent);

            worldIn.setBlockState(pos, newState, 2);
        }
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (!worldIn.isRemote) {

            int dropCount = 5;

            ItemStack itemStack = new ItemStack(ModItems.CHERRY_PLUM.get(), dropCount);
            ItemEntity itemEntity = new ItemEntity(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, itemStack);

            worldIn.addEntity(itemEntity);

            worldIn.setBlockState(pos, ModBlocks.SWEET_CHESTNUT_LEAVES.get().getDefaultState());

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
