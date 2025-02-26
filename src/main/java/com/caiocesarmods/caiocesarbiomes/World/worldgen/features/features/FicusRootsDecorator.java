package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features;

import com.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.IWorldWriter;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class FicusRootsDecorator extends TreeDecorator {
    public static final FicusRootsDecorator INSTANCE = new FicusRootsDecorator();
    public static final Codec<FicusRootsDecorator> CODEC = Codec.unit(FicusRootsDecorator::new);

    @Override
    protected TreeDecoratorType<?> getDecoratorType() {
        return ModTreeDecorators.FICUS_HANGING_ROOTS.get();
    }


    @Override
    public void func_225576_a_(ISeedReader world, Random rand, List<BlockPos> logPositions, List<BlockPos> leafPositions, Set<BlockPos> changedBlocks, MutableBoundingBox boundingBox) {
        for (BlockPos leafPos : leafPositions) {
            BlockPos below = leafPos.down();

            // Ensure there’s air below before placing vines
            if (world.isAirBlock(below) && rand.nextFloat() < 0.3F) { // 30% chance per leaf
                placeHangingVines(world, below, rand);
            }
        }
    }

    public boolean isValidPosition(BlockState state, IWorldReader world, BlockPos pos) {
        if (world.getBlockState(pos.up()).getBlock().isIn(BlockTags.LEAVES))
            return true;
        return false;
    }

    private void placeHangingVines(IWorldWriter world, BlockPos pos, Random rand) {
        BlockPos below = pos.down();
        int maxLength = 3 + rand.nextInt(4); // Vines can hang between 3-6 blocks
        boolean firstBlock = true;

        for (int i = 0; i < maxLength; i++) {
            if (world instanceof ISeedReader && ((ISeedReader) world).isAirBlock(below)) {
                if (firstBlock) {
                    world.setBlockState(below, ModBlocks.FICUS_ROOTS.get().getDefaultState(), 2);
                    firstBlock = false;
                } else {
                    world.setBlockState(below, ModBlocks.FICUS_ROOTS_PLANT.get().getDefaultState(), 2);
                }
                below = below.down();
            }  // Stop placing if we hit a solid block
        }
    }
}

