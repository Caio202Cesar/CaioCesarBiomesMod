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
    public static final PohutukawaBeardDecorator INSTANCE = new PohutukawaBeardDecorator();
    public static final Codec<PohutukawaBeardDecorator> CODEC = Codec.unit(PohutukawaBeardDecorator::new);

    public static final Codec<BeehiveTreeDecorator> field_236863_a_ = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(BeehiveTreeDecorator::new, (p_236865_0_) -> {
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
        for (BlockPos pos : leafPositions) {
            if (world.getBlockState(pos.down()).isAir()) {
                if (rand.nextInt(2) == 0) {
                    world.setBlockState(pos.down(), TreeBlocks.POHUTUKAWA_BEARD.get().getDefaultState(), 3);
                }
            }
        }
    }
}

