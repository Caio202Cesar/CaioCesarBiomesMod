package com.caiocesarmods.caiocesarbiomes.block;

import net.minecraft.block.*;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.VoxelShape;

public class FicusRootsBlock extends AbstractBodyPlantBlock {
    public static final VoxelShape SHAPE = Block.makeCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);

    public FicusRootsBlock(AbstractBlock.Properties properties) {
        super(properties, Direction.DOWN, SHAPE, false);
    }

    protected AbstractTopPlantBlock getTopPlantBlock() {
        return (AbstractTopPlantBlock)ModBlocks.FICUS_ROOTS.get();
    }

}
