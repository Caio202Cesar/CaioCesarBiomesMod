package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.TreeDecorators;

import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
import com.caiocesarmods.caiocesarbiomes.block.custom.Vines.ResurrectionFernBlock;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class ResurrectionFernTreeDecorator extends TreeDecorator {
    public static final Codec<ResurrectionFernTreeDecorator> CODEC =
            RecordCodecBuilder.create(instance ->
                    instance.group(
                            Codec.floatRange(0.0F, 1.0F)
                                    .fieldOf("probability")
                                    .forGetter(decorator -> decorator.probability),

                            Codec.INT
                                    .fieldOf("max_ferns")
                                    .forGetter(decorator -> decorator.maxFerns)

                    ).apply(instance, ResurrectionFernTreeDecorator::new)
            );

    private final float probability;
    private final int maxFerns;

    public ResurrectionFernTreeDecorator(float probability, int maxFerns) {
        this.probability = probability;
        this.maxFerns = maxFerns;
    }

    @Override
    protected TreeDecoratorType<?> getDecoratorType() {
        return ModTreeDecorators.RESURRECTION_FERN_TRUNK_DECORATOR.get();
    }

    @Override
    public void func_225576_a_(
            ISeedReader world,
            Random rand,
            List<BlockPos> logs,
            List<BlockPos> leaves,
            Set<BlockPos> changedBlocks,
            MutableBoundingBox box) {

        int placed = 0;

        for (BlockPos logPos : logs) {

            if (placed >= this.maxFerns)
                return;


            if (rand.nextFloat() > this.probability)
                continue;


            Direction direction =
                    Direction.Plane.HORIZONTAL.random(rand);


            BlockPos fernPos = logPos.offset(direction);


            BlockState existing = world.getBlockState(fernPos);


            if (!existing.isAir(world, fernPos)
                    && existing.getBlock() != ModPlants.RESURRECTION_FERN.get()) {
                continue;
            }


            BlockState fernState;


            if (existing.getBlock() == ModPlants.RESURRECTION_FERN.get()) {
                fernState = addFace(existing, direction);
            }
            else {
                fernState = createFernState(direction);
            }


            world.setBlockState(
                    fernPos,
                    fernState,
                    19
            );


            changedBlocks.add(fernPos);

            placed++;
        }
    }

    private BlockState addFace(BlockState state, Direction direction) {

        switch(direction) {

            case EAST:
                return state.with(
                        ResurrectionFernBlock.WEST,
                        true
                );

            case WEST:
                return state.with(
                        ResurrectionFernBlock.EAST,
                        true
                );

            case NORTH:
                return state.with(
                        ResurrectionFernBlock.SOUTH,
                        true
                );

            case SOUTH:
                return state.with(
                        ResurrectionFernBlock.NORTH,
                        true
                );

            default:
                return state;
        }
    }

    private BlockState createFernState(Direction direction) {

        BlockState state = ModPlants.RESURRECTION_FERN.get().getDefaultState();

        switch(direction) {

            case EAST:
                return state.with(
                        ResurrectionFernBlock.WEST,
                        true
                );

            case WEST:
                return state.with(
                        ResurrectionFernBlock.EAST,
                        true
                );

            case NORTH:
                return state.with(
                        ResurrectionFernBlock.SOUTH,
                        true
                );

            case SOUTH:
                return state.with(
                        ResurrectionFernBlock.NORTH,
                        true
                );

            default:
                return state;
        }
    }
}
