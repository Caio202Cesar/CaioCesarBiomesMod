package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.TreeDecorators;

import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
import com.caiocesarmods.caiocesarbiomes.block.custom.PeppercornVine;
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

public class PeppercornVineTrunkDecorator extends TreeDecorator {
    public static final Codec<PeppercornVineTrunkDecorator> CODEC = Codec.unit(PeppercornVineTrunkDecorator::new);
    public static final PeppercornVineTrunkDecorator INSTANCE = new PeppercornVineTrunkDecorator();

    @Override
    protected TreeDecoratorType<?> getDecoratorType() {
        // Return your registered type. Replace with your custom type if desired.
        return ModTreeDecorators.PEPPERCORN_VINE_TRUNK_DECORATOR.get();
    }

    @Override
    public void func_225576_a_(ISeedReader world, Random rand, List<BlockPos> trunkPositions, List<BlockPos> leavesPositions, Set<BlockPos> placed, MutableBoundingBox boundingBox) {
        trunkPositions.forEach((pos) -> {
            if (rand.nextInt(3) > 0) {
                BlockPos blockpos = pos.west();
                if (Feature.isAirAt(world, blockpos)) {
                    this.placeVine(world, blockpos, PeppercornVine.EAST, placed, boundingBox);
                }
            }
            if (rand.nextInt(3) > 0) {
                BlockPos blockpos1 = pos.east();
                if (Feature.isAirAt(world, blockpos1)) {
                    this.placeVine(world, blockpos1, PeppercornVine.WEST, placed, boundingBox);
                }
            }
            if (rand.nextInt(3) > 0) {
                BlockPos blockpos2 = pos.north();
                if (Feature.isAirAt(world, blockpos2)) {
                    this.placeVine(world, blockpos2, PeppercornVine.SOUTH, placed, boundingBox);
                }
            }
            if (rand.nextInt(3) > 0) {
                BlockPos blockpos3 = pos.south();
                if (Feature.isAirAt(world, blockpos3)) {
                    this.placeVine(world, blockpos3, PeppercornVine.NORTH, placed, boundingBox);
                }
            }
        });
    }

    private void placeCustomVine(IWorldGenerationReader world, BlockPos pos, BlockState state, Set<BlockPos> placed, MutableBoundingBox boundingBox) {
        // Directly set your custom vine block at the position.
        world.setBlockState(pos, state, 19);
        placed.add(pos.toImmutable());
        // Optionally, update boundingBox here if needed.
    }

    private void placeVine(IWorldGenerationReader world, BlockPos pos, BooleanProperty property, Set<BlockPos> placed, MutableBoundingBox boundingBox) {
        // Get the passion fruit vine default state and apply the directional property.
        BlockState vineState = ModPlants.PEPPERCORN_VINE.get().getDefaultState().with(property, true);
        // Use our custom helper instead of the vanilla one.
        this.placeCustomVine(world, pos, vineState, placed, boundingBox);
        int i = 4;
        for (BlockPos downPos = pos.down(); Feature.isAirAt(world, downPos) && i > 0; --i) {
            this.placeCustomVine(world, downPos, vineState, placed, boundingBox);
            downPos = downPos.down();
        }
    }
}

