package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.Feature;

import java.util.Random;

public class ItalianCypressTreeFeature extends Feature<BaseTreeFeatureConfig> {

    public ItalianCypressTreeFeature(Codec<BaseTreeFeatureConfig> codec) {
        super(codec);
    }

    @Override
    public boolean generate(ISeedReader reader, ChunkGenerator generator, Random rand, BlockPos pos, BaseTreeFeatureConfig config) {
        int trunkHeight = 10 + rand.nextInt(5); // Customizable height range
        BlockState log = config.trunkProvider.getBlockState(rand, pos); // Use configured log
        BlockState leaves = config.leavesProvider.getBlockState(rand, pos); // Use configured leaves

        // Generate the trunk with leaf placement adjustments
        for (int y = 0; y < trunkHeight; y++) {
            BlockPos trunkPos = pos.up(y);
            reader.setBlockState(trunkPos, log, 2);

            // Place leaves on the four cardinal directions starting from the second block
            if (y >= 1) { // Start placing leaves from the second block of the trunk
                BlockPos[] sideLeafPositions = {
                        trunkPos.north(), trunkPos.south(),
                        trunkPos.east(), trunkPos.west()
                };
                for (BlockPos leafPos : sideLeafPositions) {
                    if (reader.isAirBlock(leafPos)) {
                        reader.setBlockState(leafPos, leaves, 2);
                    }
                }

                // Add corner leaves only for the lower half of the trunk
                if (y < trunkHeight / 2) {
                    BlockPos[] cornerLeafPositions = {
                            trunkPos.north().east(), trunkPos.north().west(),
                            trunkPos.south().east(), trunkPos.south().west()
                    };
                    for (BlockPos leafPos : cornerLeafPositions) {
                        if (reader.isAirBlock(leafPos)) {
                            reader.setBlockState(leafPos, leaves, 2);
                        }
                    }
                }
            }
        }

        // Add a column of leaves extending three blocks above the last trunk block
        BlockPos topPos = pos.up(trunkHeight);
        for (int y = 0; y < 3; y++) { // Adds a column of leaves 3 blocks high
            BlockPos leafColumnPos = topPos.up(y);
            if (reader.isAirBlock(leafColumnPos)) {
                reader.setBlockState(leafColumnPos, leaves, 2);
            }
        }

        return true;
    }}

