package com.caiocesarmods.caiocesarbiomes.World.worldgen.placers;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ItalianCypressTrunkPlacer extends StraightTrunkPlacer {
    public ItalianCypressTrunkPlacer(int baseHeight, int heightRandA, int heightRandB) {
        super(baseHeight, heightRandA, heightRandB);
    }

    protected List<FoliagePlacer.Foliage> func_230382_a_(IWorldGenerationReader world, Random random, int trunkHeight, BlockPos startPos, Set<BlockPos> trunkBlocks, MutableBoundingBox boundingBox, BaseTreeFeatureConfig config) {
        List<FoliagePlacer.Foliage> foliagePositions = new ArrayList<>();

        // Iterate through each block of the trunk height
        for (int y = 0; y < trunkHeight; y++) {
            BlockPos trunkPos = startPos.up(y);
            placeLog(world, random, trunkPos, trunkBlocks, boundingBox, config);

            // Place leaves around this trunk position
            placeLeavesAroundTrunk(world, random, trunkPos, boundingBox, config);
        }

        // Define the top foliage position
        foliagePositions.add(new FoliagePlacer.Foliage(startPos.up(trunkHeight), 0, false));
        return foliagePositions;
    }

    private void placeLog(IWorldGenerationReader world, Random random, BlockPos pos, Set<BlockPos> trunkBlocks, MutableBoundingBox boundingBox, BaseTreeFeatureConfig config) {
        if (world.hasBlockState(pos, state -> state.isAir((IBlockReader) world, pos))) { // Check if the position is air before placing the log
            world.setBlockState(pos, config.trunkProvider.getBlockState(random, pos), 19); // Place log block from the trunk provider
            trunkBlocks.add(pos); // Keep track of the trunk blocks for further use, like leaf placement
            boundingBox.expandTo(new MutableBoundingBox(pos, pos)); // Expand bounding box to include the log position
        }
    }

    private void placeLeavesAroundTrunk(IWorldGenerationReader world, Random random, BlockPos trunkPos, MutableBoundingBox boundingBox, BaseTreeFeatureConfig config) {
        // Surround the trunk position with leaves in a 3x3 column
        for (int dx = -1; dx <= 1; dx++) {
            for (int dz = -1; dz <= 1; dz++) {
                if (dx != 0 || dz != 0) { // Skip the trunk itself
                    BlockPos leafPos = trunkPos.add(dx, 0, dz);
                    placeLeafIfAir(world, random, config, leafPos, boundingBox);
                }
            }
        }
    }

    private void placeLeafIfAir(IWorldGenerationReader world, Random random, BaseTreeFeatureConfig config, BlockPos pos, MutableBoundingBox boundingBox) {
        if (world.hasBlockState(pos, state -> state.isAir((IBlockReader) world, pos))) {
            world.setBlockState(pos, config.leavesProvider.getBlockState(random, pos), 19);
            boundingBox.expandTo(new MutableBoundingBox(pos, pos));
        }
    }
}
