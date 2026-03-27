package com.caiocesarmods.caiocesarbiomes.block.custom.Vines;

import com.caiocesarmods.caiocesarbiomes.Seasons.Season;
import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.VineBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IForgeShearable;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class KiwiGoldFloweringVine extends VineBlock implements IForgeShearable {
    public KiwiGoldFloweringVine() {
        super(Properties.from(Blocks.VINE).tickRandomly().doesNotBlockMovement().notSolid()
                .zeroHardnessAndResistance().sound(SoundType.VINE).harvestTool(ToolType.HOE));
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

    //Hardy from zone 8 to 10
    public static final float MIN_TEMP = 0.75F;
    public static final float MAX_TEMP = 0.89F;

    @Override
    public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
        String currentSeason = Season.getSeason(worldIn.getDayTime());

        Biome biome = worldIn.getBiome(pos);
        float temp = biome.getTemperature(pos);

        if ("SUMMER".equals(currentSeason) && random.nextInt(15) == 0) {

            BlockState currentState = state;
            BlockState newState = ModPlants.KIWI_GOLD_FRUITING_VINE.get().getDefaultState();

            worldIn.setBlockState(pos, ModPlants.KIWI_GOLD_FRUITING_VINE.get().getDefaultState());

            newState = newState.with(VineBlock.NORTH, currentState.get(VineBlock.NORTH)).with(VineBlock.EAST, currentState.get(VineBlock.EAST))
                    .with(VineBlock.SOUTH, currentState.get(VineBlock.SOUTH)).with(VineBlock.WEST, currentState.get(VineBlock.WEST));

            worldIn.setBlockState(pos, newState, 3);
        }

        if ("FALL".equals(currentSeason) && random.nextInt(2) == 0) {

            BlockState currentState = state;
            BlockState newState = ModPlants.KIWI_GOLD_FRUITING_VINE.get().getDefaultState();

            worldIn.setBlockState(pos, ModPlants.KIWI_GOLD_FRUITING_VINE.get().getDefaultState());

            newState = newState.with(VineBlock.NORTH, currentState.get(VineBlock.NORTH)).with(VineBlock.EAST, currentState.get(VineBlock.EAST))
                    .with(VineBlock.SOUTH, currentState.get(VineBlock.SOUTH)).with(VineBlock.WEST, currentState.get(VineBlock.WEST));

            worldIn.setBlockState(pos, newState, 3);
        }

        if ("WINTER".equals(currentSeason) && random.nextInt(2) == 0) {

            BlockState currentState = state;
            BlockState newState = ModPlants.KIWI_GOLD_WINTER_DRY_VINE.get().getDefaultState();

            worldIn.setBlockState(pos, ModPlants.KIWI_GOLD_WINTER_DRY_VINE.get().getDefaultState());

            newState = newState.with(VineBlock.NORTH, currentState.get(VineBlock.NORTH)).with(VineBlock.EAST, currentState.get(VineBlock.EAST))
                    .with(VineBlock.SOUTH, currentState.get(VineBlock.SOUTH)).with(VineBlock.WEST, currentState.get(VineBlock.WEST));

            worldIn.setBlockState(pos, newState, 3);
        }

        //Dies outside its hardiness zone
        if (temp < MIN_TEMP || temp > MAX_TEMP) {
            worldIn.destroyBlock(pos, false);
        }
    }

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 90;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 85;
    }

    public PlantType getPlantType(IBlockReader world, BlockPos pos) {
        return PlantType.CROP;
    }
}


