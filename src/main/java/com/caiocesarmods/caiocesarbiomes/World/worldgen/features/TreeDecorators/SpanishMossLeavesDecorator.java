package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.TreeDecorators;

import com.caiocesarmods.caiocesarbiomes.block.custom.SpanishMoss;
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
    // Create a unit codec for this decorator.
    public static final Codec<SpanishMossLeavesDecorator> CODEC = Codec.unit(SpanishMossLeavesDecorator::new);
    public static final SpanishMossLeavesDecorator INSTANCE = new SpanishMossLeavesDecorator();

    @Override
    protected TreeDecoratorType<?> getDecoratorType() {
        // Return your registered TreeDecoratorType – ensure you've registered it with your mod's modid.
        return ModTreeDecorators.SPANISH_MOSS_DECORATOR.get();
    }

    /**
     * This method is called during tree decoration.
     * p_225576_3_ is typically the trunk positions (unused here), while p_225576_4_ is the list of leaves positions.
     */
    @Override
    public void func_225576_a_(ISeedReader world, Random rand, List<BlockPos> trunkPositions, List<BlockPos> leavesPositions, Set<BlockPos> placed, MutableBoundingBox boundingBox) {
        leavesPositions.forEach((leafPos) -> {
            if (rand.nextInt(4) == 0) {
                BlockPos target = leafPos.west();
                if (Feature.isAirAt(world, target)) {
                    this.placeVine(world, target, SpanishMoss.EAST, placed, boundingBox);
                }
            }
            if (rand.nextInt(4) == 0) {
                BlockPos target = leafPos.east();
                if (Feature.isAirAt(world, target)) {
                    this.placeVine(world, target, SpanishMoss.WEST, placed, boundingBox);
                }
            }
            if (rand.nextInt(4) == 0) {
                BlockPos target = leafPos.north();
                if (Feature.isAirAt(world, target)) {
                    this.placeVine(world, target, SpanishMoss.SOUTH, placed, boundingBox);
                }
            }
            if (rand.nextInt(4) == 0) {
                BlockPos target = leafPos.south();
                if (Feature.isAirAt(world, target)) {
                    this.placeVine(world, target, SpanishMoss.NORTH, placed, boundingBox);
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
        BlockState vineState = ModPlants.SPANISH_MOSS.get().getDefaultState().with(property, true);
        // Use our custom helper instead of the vanilla one.
        this.placeCustomVine(world, pos, vineState, placed, boundingBox);
        int i = 4;
        for (BlockPos downPos = pos.down(); Feature.isAirAt(world, downPos) && i > 0; --i) {
            this.placeCustomVine(world, downPos, vineState, placed, boundingBox);
            downPos = downPos.down();
        }
    }
}
