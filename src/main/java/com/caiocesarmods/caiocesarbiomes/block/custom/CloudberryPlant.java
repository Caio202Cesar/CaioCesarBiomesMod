package com.caiocesarmods.caiocesarbiomes.block.custom;

import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BushBlock;
import net.minecraft.block.SoundType;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class CloudberryPlant extends BushBlock {
    public CloudberryPlant() {
        super(Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly().hardnessAndResistance(0.1f)
                .sound(SoundType.PLANT).harvestTool(ToolType.HOE));
    }

    public boolean ticksRandomly(BlockState state) {
        return true;
    }

    /**
     * Performs a random tick on a block.
     *
     * @param state
     * @param worldIn
     * @param pos
     * @param random
     */
    @Override
    public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
        super.randomTick(state, worldIn, pos, random);

        double chance = 0.07;

        if (random.nextDouble() < chance) {
            worldIn.setBlockState(pos, ModPlants.CLOUDBERRY_FLOWERING_PLANT.get().getDefaultState());

        }
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(ModPlants.CLOUDBERRY_PLANT.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.CLOUDBERRY_FLOWERING_PLANT.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.CLOUDBERRY_FRUITING_PLANT.get(), RenderType.getCutout());

    }

    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return state.matchesBlock(Blocks.DIRT) || state.matchesBlock(Blocks.FARMLAND) || state.matchesBlock(Blocks.GRASS_BLOCK)
                || state.matchesBlock(Blocks.PODZOL) || state.matchesBlock(Blocks.COARSE_DIRT);
    }

    public PlantType getPlantType(IBlockReader world, BlockPos pos) {
        return PlantType.PLAINS;
    }
}

