package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.TreeDecorators;

import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class PohutukawaBeardDecorator extends TreeDecorator {
    public static final Codec<PohutukawaBeardDecorator> CODEC = Codec.floatRange(0.0F, 1.0F).fieldOf("probability")
            .xmap(PohutukawaBeardDecorator::new, (p_236865_0_) -> {
        return p_236865_0_.probability;
    }).codec();

    private final float probability;

    public PohutukawaBeardDecorator(float probabilityIn) {
        this.probability = probabilityIn;
    }

    @Override
    protected TreeDecoratorType<?> getDecoratorType() {
        return ModTreeDecorators.POHUTUKAWA_HANGING_ROOTS.get();
    }


    @Override
    public void func_225576_a_(ISeedReader world, Random rand, List<BlockPos> logPositions, List<BlockPos> leafPositions, Set<BlockPos> changedBlocks, MutableBoundingBox boundingBox) {
        if (rand.nextFloat() < this.probability) {
            for (BlockPos pos : leafPositions) {
                BlockPos below = pos.down();

                if (world.isAirBlock(below)) {
                    if (rand.nextInt(2) == 0) {
                        world.setBlockState(below,
                                TreeBlocks.POHUTUKAWA_BEARD.get().getDefaultState(), 3);
                    }
                }
            }
        }
    }
}

