package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.TreeDecorators;

import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
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

public class IvyTrunkDecorator extends TreeDecorator {
    public static final Codec<IvyTrunkDecorator> CODEC = Codec.unit(IvyTrunkDecorator::new);
    public static final IvyTrunkDecorator INSTANCE = new IvyTrunkDecorator();

    @Override
    protected TreeDecoratorType<?> getDecoratorType() {
        return ModTreeDecorators.TRUNK_IVY_DECORATOR.get();
    }

    public void func_225576_a_(ISeedReader world, Random rand, List<BlockPos> trunkPositions,
                               List<BlockPos> leavesPositions, Set<BlockPos> placed, MutableBoundingBox boundingBox) {
        trunkPositions.forEach((pos) -> {
            if (rand.nextInt(3) > 0) {
                BlockPos blockpos = pos.west();
                if (Feature.isAirAt(world, blockpos)) {
                    this.placeVine(world, blockpos, CreepingFigVine.EAST, placed, boundingBox);


    }}

    private void placeCustomVine(IWorldGenerationReader world, BlockPos pos,
                                 BlockState state, Set<BlockPos> placed,
                                 MutableBoundingBox boundingBox) {

        world.setBlockState(pos, state, 19);
        placed.add(pos.toImmutable());
    }

    private void placeVine(IWorldGenerationReader world, BlockPos pos,
                           BooleanProperty property, Set<BlockPos> placed,
                           MutableBoundingBox boundingBox) {

        BlockState vineState = ModPlants.GLORIOSA_LILY.get()
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

