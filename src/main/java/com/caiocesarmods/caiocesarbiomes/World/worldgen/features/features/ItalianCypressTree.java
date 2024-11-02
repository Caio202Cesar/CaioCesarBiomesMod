package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.Feature;

import java.util.Random;

public class ItalianCypressTree extends Feature<BaseTreeFeatureConfig> {

    public ItalianCypressTree(Codec<BaseTreeFeatureConfig> codec) {
        super(codec);
    }

    @Override
    public boolean generate(ISeedReader reader, ChunkGenerator generator, Random rand, BlockPos pos, BaseTreeFeatureConfig config) {
        int trunkHeight = 10 + rand.nextInt(5); // Customizable height range
        BlockState log = config.trunkProvider.getBlockState(rand, pos); // Use configured log
        BlockState leaves = config.leavesProvider.getBlockState(rand, pos); // Use configured leaves

        // Generate the trunk
        for (int y = 0; y < trunkHeight; y++) {
            BlockPos trunkPos = pos.up(y);
            reader.setBlockState(trunkPos, log, 2);
        }

        // Generate the foliage
        for (int y = 1; y <= trunkHeight; y++) {
            BlockPos leafPos = pos.up(y);
            // Place leaves in cardinal directions starting from the second block
            placeCardinalLeaves(reader, leafPos, leaves);

            // Add corner leaves for the lower half of the trunk
            if (y < trunkHeight / 2) {
                placeCornerLeaves(reader, leafPos, leaves);
            }
        }

        // Create the top column of leaves
        for (int y = 0; y < 3; y++) {
            BlockPos topLeafPos = pos.up(trunkHeight + y);
            reader.setBlockState(topLeafPos, leaves, 2);
        }

        return true;
    }

    private void placeCardinalLeaves(IWorldGenerationReader reader, BlockPos leafPos, BlockState leaves) {
        BlockPos[] cardinalPositions = {
                leafPos.north(), leafPos.south(),
                leafPos.east(), leafPos.west()
        };

        for (BlockPos pos : cardinalPositions) {
            reader.setBlockState(pos, leaves, 2);
        }
    }

    private void placeCornerLeaves(IWorldGenerationReader reader, BlockPos leafPos, BlockState leaves) {
        BlockPos[] cornerPositions = {
                leafPos.north().east(), leafPos.north().west(),
                leafPos.south().east(), leafPos.south().west()
        };

        for (BlockPos pos : cornerPositions) {
            reader.setBlockState(pos, leaves, 2);
        }
    }
}
