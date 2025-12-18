package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.TreeDecorators;

import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class CucumberTreeVinesDecorator extends TreeDecorator {
    public static final CucumberTreeVinesDecorator INSTANCE = new CucumberTreeVinesDecorator();
    public static final Codec<CucumberTreeVinesDecorator> CODEC = Codec.unit(CucumberTreeVinesDecorator::new);

    @Override
    protected TreeDecoratorType<?> getDecoratorType() {
        return ModTreeDecorators.CUCUMBER_TREE_VINE.get();
    }


    @Override
    public void func_225576_a_(ISeedReader world, Random rand, List<BlockPos> logPositions, List<BlockPos> leafPositions, Set<BlockPos> changedBlocks, MutableBoundingBox boundingBox) {
        for (BlockPos pos : leafPositions) {
            if (world.getBlockState(pos.down()).isAir()) {
                if (rand.nextInt(2) == 0) {
                    world.setBlockState(pos.down(), ModPlants.SOCOTRA_CUCUMBER_LEAVES_VINE.get().getDefaultState(), 3);
                }
            }
        }
    }
}

