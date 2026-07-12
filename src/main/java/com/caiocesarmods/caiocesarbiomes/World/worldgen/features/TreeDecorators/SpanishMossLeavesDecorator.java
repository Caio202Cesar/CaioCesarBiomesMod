package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.TreeDecorators;

import com.caiocesarmods.caiocesarbiomes.block.custom.Vines.SpanishMoss;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.state.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import com.caiocesarmods.caiocesarbiomes.block.ModPlants;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class SpanishMossLeavesDecorator extends TreeDecorator {
    public static final Codec<SpanishMossLeavesDecorator> CODEC =
            Codec.floatRange(0.0F, 1.0F)
                    .fieldOf("probability")
                    .xmap(SpanishMossLeavesDecorator::new,
                            decorator -> decorator.probability)
                    .codec();

    private final float probability;

    public SpanishMossLeavesDecorator(float probability) {
        this.probability = probability;
    }

    @Override
    protected TreeDecoratorType<?> getDecoratorType() {
        return ModTreeDecorators.SPANISH_MOSS_DECORATOR.get();
    }

    @Override
    public void func_225576_a_(ISeedReader world, Random rand,
                               List<BlockPos> trunkPositions,
                               List<BlockPos> leavesPositions,
                               Set<BlockPos> placed,
                               MutableBoundingBox boundingBox) {

        // Chance for the whole tree to receive Spanish moss.
        if (rand.nextFloat() >= this.probability) {
            return;
        }

        leavesPositions.forEach(leafPos -> {

            if (rand.nextInt(4) == 0) {
                BlockPos target = leafPos.west();
                if (Feature.isAirAt(world, target)) {
                    placeVine(world, target, SpanishMoss.EAST, placed, boundingBox);
                }
            }

            if (rand.nextInt(4) == 0) {
                BlockPos target = leafPos.east();
                if (Feature.isAirAt(world, target)) {
                    placeVine(world, target, SpanishMoss.WEST, placed, boundingBox);
                }
            }

            if (rand.nextInt(4) == 0) {
                BlockPos target = leafPos.north();
                if (Feature.isAirAt(world, target)) {
                    placeVine(world, target, SpanishMoss.SOUTH, placed, boundingBox);
                }
            }

            if (rand.nextInt(4) == 0) {
                BlockPos target = leafPos.south();
                if (Feature.isAirAt(world, target)) {
                    placeVine(world, target, SpanishMoss.NORTH, placed, boundingBox);
                }
            }
        });
    }

    private void placeCustomVine(IWorldGenerationReader world, BlockPos pos,
                                 BlockState state, Set<BlockPos> placed,
                                 MutableBoundingBox boundingBox) {

        world.setBlockState(pos, state, 19);
        placed.add(pos.toImmutable());
    }

    private void placeVine(IWorldGenerationReader world, BlockPos pos,
                           BooleanProperty property, Set<BlockPos> placed,
                           MutableBoundingBox boundingBox) {

        BlockState vineState = ModPlants.SPANISH_MOSS.get()
                .getDefaultState()
                .with(property, true);

        placeCustomVine(world, pos, vineState, placed, boundingBox);

        int i = 4;

        for (BlockPos downPos = pos.down();
             Feature.isAirAt(world, downPos) && i > 0;
             downPos = downPos.down(), --i) {

            placeCustomVine(world, downPos, vineState, placed, boundingBox);
        }
    }
}
