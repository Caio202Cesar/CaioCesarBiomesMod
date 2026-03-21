package com.caiocesarmods.caiocesarbiomes.block.custom.Vines;

import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class IvyVine extends VineBlock {
    public IvyVine() {
        super(Properties.from(Blocks.VINE).tickRandomly().doesNotBlockMovement().notSolid()
                .zeroHardnessAndResistance().sound(SoundType.VINE).harvestTool(ToolType.HOE));
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(ModPlants.IVY.get(), RenderType.getCutout());
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
    public static final float MIN_TEMP = 0.4F;
    public static final float MAX_TEMP = 1.2F;

    //Hardiness Zone 4 to 12 (1.2F)
    @Override
    public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
        //Growth Logic
        float temp = worldIn.getBiome(pos).getTemperature();

        if (temp < MIN_TEMP || temp > MAX_TEMP) {
            if (random.nextFloat() < 0.25F) {
                worldIn.destroyBlock(pos, false); // no drop
            }

            return;
        }

        super.randomTick(state, worldIn, pos, random);
    }

    private boolean isUnderLeaves(ServerWorld world, BlockPos pos) {

        BlockPos.Mutable checkPos = new BlockPos.Mutable(pos.getX(), pos.getY() + 1, pos.getZ());

        while (checkPos.getY() < world.getHeight()) {

            BlockState stateAbove = world.getBlockState(checkPos);

            if (stateAbove.isAir() || stateAbove.getBlock() instanceof LeavesBlock) {
                checkPos.move(Direction.UP);
                continue;
            }

            // If this block is glass → protected
            if (stateAbove.getMaterial() == Material.LEAVES) {
                return true;
            }

            // Any other solid block blocks protection
            return false;
        }

        return false;
    }

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 90;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 85;
    }

    public PlantType getPlantType(IBlockReader world, BlockPos pos) {
        return PlantType.CAVE;
    }
}
