package com.caiocesarmods.caiocesarbiomes.World.worldgen.placers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.foliageplacer.FoliagePlacerType;

import java.util.Random;
import java.util.Set;

public class ItalianCypressFoliagePlacer extends FoliagePlacer {
    public static final Codec<ItalianCypressFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    FeatureSpread.CODEC.fieldOf("radius").forGetter(placer -> placer.radius),
                    FeatureSpread.CODEC.fieldOf("offset").forGetter(placer -> placer.offset)
            ).apply(instance, ItalianCypressFoliagePlacer::new)
    );

    public ItalianCypressFoliagePlacer(FeatureSpread radius, FeatureSpread offset) {
        super(radius, offset);
    }

    @Override
    protected FoliagePlacerType<?> getPlacerType() {
        return ModFoliagePlacers.ITALIAN_CYPRESS_FOLIAGE_PLACER.get();
    }

    @Override
    protected void func_230372_a_(IWorldGenerationReader world, Random random, BaseTreeFeatureConfig config, int trunkHeight, Foliage foliage,
                                  int foliageHeight, int radius, Set<BlockPos> leaves, int offset, MutableBoundingBox boundingBox) {
        BlockPos foliagePos = foliage.func_236763_a_();

        // First half - 3x3 column foliage pattern
        for (int y = 0; y < foliageHeight / 2; y++) {
            BlockPos pos = foliagePos.up(y);
            placeLeaves(world, random, config, pos, leaves, boundingBox, 1); // Places 3x3 leaves around the trunk
        }

        // Second half - Cross pattern foliage
        for (int y = foliageHeight / 2; y < foliageHeight; y++) {
            BlockPos pos = foliagePos.up(y);
            placeCrossPatternLeaves(world, random, config, pos, leaves, boundingBox); // Places cross pattern
        }
    }

    @Override
    public int func_230374_a_(Random random, int trunkHeight, BaseTreeFeatureConfig config) {
        // Defines foliage height based on trunk height
        return Math.max(4, trunkHeight - 2); // Minimum foliage height of 4
    }

@Override
protected boolean func_230373_a_(Random random, int dx, int y, int dz, int radius, boolean large) {
    // Ensures uniform foliage placement without skipping
    return false;
}

private void placeLeaves(IWorldGenerationReader world, Random random, BaseTreeFeatureConfig config, BlockPos pos, Set<BlockPos> leaves,
                         MutableBoundingBox boundingBox, int range) {
    // 3x3 column pattern around the trunk
    for (int dx = -range; dx <= range; dx++) {
        for (int dz = -range; dz <= range; dz++) {
            if (dx != 0 || dz != 0) { // Avoid the trunk block itself
                BlockPos leafPos = pos.add(dx, 0, dz);
                placeLeafAt(world, random, config, leafPos, leaves, boundingBox);
            }
        }
    }
}

private void placeCrossPatternLeaves(IWorldGenerationReader world, Random random, BaseTreeFeatureConfig config, BlockPos pos, Set<BlockPos> leaves,
                                     MutableBoundingBox boundingBox) {
    // Cross pattern around the trunk for the second half
    placeLeafAt(world, random, config, pos.north(), leaves, boundingBox);
    placeLeafAt(world, random, config, pos.south(), leaves, boundingBox);
    placeLeafAt(world, random, config, pos.east(), leaves, boundingBox);
    placeLeafAt(world, random, config, pos.west(), leaves, boundingBox);
}

private void placeLeafAt(IWorldGenerationReader world, Random random, BaseTreeFeatureConfig config, BlockPos pos, Set<BlockPos> leaves, MutableBoundingBox boundingBox) {
    if (world.hasBlockState(pos, state -> state.isAir((IBlockReader) world, pos))) {
        world.setBlockState(pos, config.leavesProvider.getBlockState(random, pos), 19);
        leaves.add(pos);
        boundingBox.expandTo(new MutableBoundingBox(pos, pos));
    }
}
}