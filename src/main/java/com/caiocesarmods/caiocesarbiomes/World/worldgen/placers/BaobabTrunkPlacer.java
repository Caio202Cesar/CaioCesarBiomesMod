package com.caiocesarmods.caiocesarbiomes.World.worldgen.placers;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.trunkplacer.MegaJungleTrunkPlacer;

import java.util.Random;
import java.util.Set;

public class BaobabTrunkPlacer extends MegaJungleTrunkPlacer {

    public BaobabTrunkPlacer(int baseHeight, int heightRandA, int heightRandB) {
        super(baseHeight, heightRandA, heightRandB);
    }

    protected void placeTrunk(IWorldGenerationReader world, Random random, int height, BlockPos position, Set<BlockPos> trunkBlocks,
                              MutableBoundingBox boundingBox, BaseTreeFeatureConfig config) {
        for (int y = 0; y < height; y++) {
            BlockPos currentPos = position.up(y);

            // Place a 3x3 trunk at each height
            for (int dx = -1; dx <= 2; dx++) {
                for (int dz = -1; dz <= 1; dz++) {
                    BlockPos trunkPos = currentPos.add(dx, 0, dz);
                    placeTrunk(world, random, height, trunkPos, trunkBlocks, boundingBox, config);
                }
            }
        }

        // (Optional) Add diagonal branches if needed, similar to MegaJungle logic
        int branchStart = height - random.nextInt(4) - 2;
        int branchCount = 2 + random.nextInt(2);

        for (int i = 0; i < branchCount; ++i) {
            int branchHeight = branchStart - i * 2;
            int branchLength = 1 + random.nextInt(2);
            float angle = random.nextFloat() * (float) Math.PI * 2.0F;

            int xOffset = Math.round((float) Math.cos(angle) * branchLength);
            int zOffset = Math.round((float) Math.sin(angle) * branchLength);

            BlockPos branchPos = position.add(xOffset, branchHeight, zOffset);
            placeTrunk(world, random, height, branchPos, trunkBlocks, boundingBox, config);
        }
    }
}
