package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features;

import com.caiocesarmods.caiocesarbiomes.block.ModBlocks;
import com.mojang.serialization.Codec;
import net.minecraft.block.Blocks;
import net.minecraft.block.VineBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.VinesFeature;

import java.util.Random;

public class CreepingFigVinesFeature extends VinesFeature {

    private static final Direction[] DIRECTIONS = Direction.values();

    public CreepingFigVinesFeature(Codec<NoFeatureConfig> codec) {
        super(codec);
    }

    public boolean generate(ISeedReader reader, ChunkGenerator generator, Random rand, BlockPos pos, NoFeatureConfig config) {
        BlockPos.Mutable blockpos$mutable = pos.toMutable();

        for(int i = 64; i < 256; ++i) {
            blockpos$mutable.setPos(pos);
            blockpos$mutable.move(rand.nextInt(4) - rand.nextInt(4), 0, rand.nextInt(4) - rand.nextInt(4));
            blockpos$mutable.setY(i);
            if (reader.isAirBlock(blockpos$mutable)) {
                for(Direction direction : DIRECTIONS) {
                    if (direction != Direction.DOWN && VineBlock.canAttachTo(reader, blockpos$mutable, direction)) {
                        reader.setBlockState(blockpos$mutable, ModBlocks.CREEPING_FIG_VINE.get().getDefaultState()
                                .with(VineBlock.getPropertyFor(direction), Boolean.valueOf(true)), 2);
                        break;
                    }
                }
            }
        }

        return true;
    }
}
