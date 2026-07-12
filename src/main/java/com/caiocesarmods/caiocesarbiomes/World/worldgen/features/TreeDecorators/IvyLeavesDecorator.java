package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.TreeDecorators;

import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class IvyLeavesDecorator extends TreeDecorator {
    public static final IvyLeavesDecorator INSTANCE = new IvyLeavesDecorator();
    public static final Codec<IvyLeavesDecorator> CODEC = Codec.unit(IvyLeavesDecorator::new);

    @Override
    protected TreeDecoratorType<?> getDecoratorType() {
        return ModTreeDecorators.IVY_LEAVES_DECORATOR.get();
    }


    @Override
    public void func_225576_a_(ISeedReader world, Random rand, List<BlockPos> logPositions, List<BlockPos> leafPositions, Set<BlockPos> changedBlocks, MutableBoundingBox boundingBox) {
        for (BlockPos pos : leafPositions) {
            if (world.getBlockState(pos.down()).isAir()) {
                if (rand.nextInt(2) == 0) {
                    world.setBlockState(pos.down(), ModPlants.IVY.get().getDefaultState(), 3);
                }
            }
        }
    }
}

