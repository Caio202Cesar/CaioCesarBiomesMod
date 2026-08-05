package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.FoliagePlacers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.foliageplacer.FoliagePlacerType;
import java.util.Random;
import java.util.Set;

public class WeepingFoliagePlacer extends FoliagePlacer {
    public WeepingFoliagePlacer(FeatureSpread radius, FeatureSpread offset) {
        super(radius, offset);
    }

    public static final Codec<WeepingFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    FeatureSpread.CODEC.fieldOf("radius").forGetter(p -> p.radius),
                    FeatureSpread.CODEC.fieldOf("offset").forGetter(p -> p.offset)
            ).apply(instance, WeepingFoliagePlacer::new)
    );

    @Override
    protected FoliagePlacerType<?> getPlacerType() {
        return ModFoliagePlacer.WEEPING_FOLIAGE_PLACER.get();
    }

    @Override
    protected void func_230372_a_(IWorldGenerationReader world,
                                  Random rand,
                                  BaseTreeFeatureConfig config,
                                  int trunkHeight,
                                  Foliage foliage,
                                  int radius,
                                  int offset,
                                  Set<BlockPos> leaves,
                                  int height,
                                  MutableBoundingBox box) {

        BlockPos top = foliage.func_236763_a_();

        for (int y = -1; y <= 1; y++) {

            int layerRadius = radius + 1 - Math.abs(y);

            for (int x = -layerRadius; x <= layerRadius; x++) {
                for (int z = -layerRadius; z <= layerRadius; z++) {

                    if (x * x + z * z <= layerRadius * layerRadius) {

                        BlockPos leafPos = top.up(1).add(x, y, z);

                        placeLeaf(world, rand, config, leafPos, leaves, box);

                        if (Math.abs(x) >= layerRadius - 1 ||
                                Math.abs(z) >= layerRadius - 1) {

                            createHangingLeaves(
                                    world,
                                    rand,
                                    config,
                                    leafPos,
                                    leaves,
                                    box
                            );
                        }
                    }
                }
            }
        }
    }

    private void createHangingLeaves(IWorldGenerationReader world,
                                     Random rand,
                                     BaseTreeFeatureConfig config,
                                     BlockPos start,
                                     Set<BlockPos> leaves,
                                     MutableBoundingBox box
    ) {

        int length = 3 + rand.nextInt(5); // 3–7 blocks hanging

        for (int i = 1; i <= length; i++) {
            BlockPos pos = start.down(i);

            if (world.hasBlockState(pos, BlockState::isAir)) {
                placeLeaf(world, rand, config, pos, leaves, box);
            } else {
                break;
            }
        }
    }

    protected void placeLeaf(IWorldGenerationReader world,
                             Random rand,
                             BaseTreeFeatureConfig config,
                             BlockPos pos,
                             Set<BlockPos> leaves,
                             MutableBoundingBox box) {

        if (world.hasBlockState(pos, state ->
                state.isAir() || state.getBlock() instanceof LeavesBlock)) {

            BlockState leafState = config.leavesProvider
                    .getBlockState(rand, pos)
                    .with(LeavesBlock.PERSISTENT, true)
                    .with(LeavesBlock.DISTANCE, 1);

            world.setBlockState(pos, leafState, 19);

            leaves.add(pos);
            box.expandTo(new MutableBoundingBox(pos, pos));
        }
    }

    //Foliage Height
    @Override
    public int func_230374_a_(Random p_230374_1_, int p_230374_2_, BaseTreeFeatureConfig p_230374_3_) {
        return 4; // Crown thickness
    }

    @Override
    protected boolean func_230373_a_(Random p_230373_1_, int x, int y, int z, int radius, boolean large) {
        return x * x + z * z > radius * radius;
    }
}


