package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.TreeDecorators;

import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
import com.caiocesarmods.caiocesarbiomes.block.custom.Vines.ChileanBellflowerMagenta;
import com.caiocesarmods.caiocesarbiomes.block.custom.Vines.GloriosaLily;
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

import java.util.List;
import java.util.Random;
import java.util.Set;

public class ChileanBellflowerMagentaTrunkDecorator extends TreeDecorator {
    public static final Codec<ChileanBellflowerMagentaTrunkDecorator> CODEC =
            Codec.floatRange(0.0F, 1.0F)
                    .fieldOf("probability")
                    .xmap(ChileanBellflowerMagentaTrunkDecorator::new,
                            decorator -> decorator.probability)
                    .codec();

    private final float probability;

    public ChileanBellflowerMagentaTrunkDecorator(float probability) {
        this.probability = probability;
    }

    @Override
    protected TreeDecoratorType<?> getDecoratorType() {
        return ModTreeDecorators.CHILEAN_BELLFLOWER_MAGENTA_TRUNK_DECORATOR.get();
    }

    @Override
    public void func_225576_a_(ISeedReader world, Random rand,
                               List<BlockPos> trunkPositions,
                               List<BlockPos> leavesPositions,
                               Set<BlockPos> placed,
                               MutableBoundingBox boundingBox) {

        // Chance for the ENTIRE tree to receive vines.
        if (rand.nextFloat() >= this.probability) {
            return;
        }

        trunkPositions.forEach(pos -> {

            if (rand.nextInt(3) > 0) {
                BlockPos west = pos.west();
                if (Feature.isAirAt(world, west)) {
                    placeVine(world, west, ChileanBellflowerMagenta.EAST, placed, boundingBox);
                }
            }

            if (rand.nextInt(3) > 0) {
                BlockPos east = pos.east();
                if (Feature.isAirAt(world, east)) {
                    placeVine(world, east, ChileanBellflowerMagenta.WEST, placed, boundingBox);
                }
            }

            if (rand.nextInt(3) > 0) {
                BlockPos north = pos.north();
                if (Feature.isAirAt(world, north)) {
                    placeVine(world, north, ChileanBellflowerMagenta.SOUTH, placed, boundingBox);
                }
            }

            if (rand.nextInt(3) > 0) {
                BlockPos south = pos.south();
                if (Feature.isAirAt(world, south)) {
                    placeVine(world, south, ChileanBellflowerMagenta.NORTH, placed, boundingBox);
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

        BlockState vineState = ModPlants.CHILEAN_BELLFLOWER_MAGENTA.get()
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

