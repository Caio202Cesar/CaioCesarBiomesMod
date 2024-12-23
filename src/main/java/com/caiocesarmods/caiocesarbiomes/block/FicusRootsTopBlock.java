package com.caiocesarmods.caiocesarbiomes.block;

import net.minecraft.block.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Random;

public class FicusRootsTopBlock extends AbstractTopPlantBlock {
    protected static final VoxelShape SHAPE = Block.makeCuboidShape(4.0D, 9.0D, 4.0D, 12.0D, 16.0D, 12.0D);

    public FicusRootsTopBlock(AbstractBlock.Properties properties) {
        super(properties, Direction.DOWN, SHAPE, false, 0.1D);
    }

    protected int getGrowthAmount(Random rand) {
        return PlantBlockHelper.getGrowthAmount(rand);
    }

    protected Block getBodyPlantBlock() {
        return ModBlocks.FICUS_ROOTS_PLANT.get();
    }

    protected boolean canGrowIn(BlockState state) {
        return PlantBlockHelper.isAir(state);
    }
}
