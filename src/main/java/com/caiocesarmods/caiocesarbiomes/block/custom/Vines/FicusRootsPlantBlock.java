package com.caiocesarmods.caiocesarbiomes.block.custom.Vines;

import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import net.minecraft.block.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Random;

public class FicusRootsPlantBlock extends Block implements IGrowable {
    public FicusRootsPlantBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        BlockPos down = pos.down();
        Biome biome = world.getBiome(pos);
        float temp = biome.getTemperature(pos);

        //Only in tropical and wet climates
        if (world.isAirBlock(down) && temp >= 0.9F && biome.getPrecipitation() == Biome.RainType.RAIN
                && random.nextFloat() < 0.001F) { //1% chance to grow
            world.setBlockState(down, this.getDefaultState(), 2);
        }

        if (temp <= 0.89F || biome.getPrecipitation() == Biome.RainType.NONE) {
            world.destroyBlock(pos, false); // no drop
        }

        if (random.nextFloat() < 0.78f) {
            BlockPos belowPos = pos.down();
            BlockState belowState = world.getBlockState(belowPos);

            // Check if the space below is air
            if (belowState.isAir()) {
                world.setBlockState(belowPos, TreeBlocks.FICUS_ROOTS_PLANT.get().getDefaultState(), 2);
            }
        }
    }

    @Override
    public BlockState updatePostPlacement(BlockState state,
                                          Direction facing,
                                          BlockState facingState,
                                          IWorld world,
                                          BlockPos currentPos,
                                          BlockPos facingPos) {

        // Only care when the block above changes
        if (facing == Direction.UP && !isValidPosition(state, world, currentPos)) {
            return Blocks.AIR.getDefaultState();
        }

        return super.updatePostPlacement(state, facing, facingState, world, currentPos, facingPos);
    }

    @Override
    public boolean isValidPosition(BlockState state, IWorldReader world, BlockPos pos) {
        BlockState above = world.getBlockState(pos.up());

        return above.getBlock() == TreeBlocks.FICUS_ROOTS_PLANT.get()
                || above.getBlock() == TreeBlocks.WEEPING_FIG_LEAVES.get()
                || above.getBlock() == TreeBlocks.INDIAN_LAUREL_LEAVES.get()
                || above.getBlock() == TreeBlocks.RUBBER_TREE_LEAVES.get();
    }

    @Override
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld worldIn, Random rand, BlockPos pos, BlockState state) {
        BlockPos down = pos.down();
        if (worldIn.isAirBlock(down)) {
            worldIn.setBlockState(down, TreeBlocks.FICUS_ROOTS_PLANT.get().getDefaultState(), 2);
        }
    }

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 80;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 60;
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(TreeBlocks.FICUS_ROOTS_PLANT.get(), RenderType.getCutout());
    }
}
