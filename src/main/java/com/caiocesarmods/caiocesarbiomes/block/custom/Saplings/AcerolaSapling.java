package com.caiocesarmods.caiocesarbiomes.block.custom.Saplings;

import com.caiocesarmods.caiocesarbiomes.Seasons.Season;
import com.caiocesarmods.caioclimates.Climate.SummerHeat.SummerHeat;
import com.caiocesarmods.caioclimates.Climate.SummerHeat.SummerHeatHelper;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features.TreeFeatures;
import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import net.minecraft.block.*;
import net.minecraft.block.trees.Tree;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.Random;

public class AcerolaSapling extends SaplingBlock {
    public AcerolaSapling() {
        super(new AcerolaTree(), Properties.from(Blocks.OAK_SAPLING).hardnessAndResistance(0.0f)
                .sound(SoundType.PLANT));
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(TreeBlocks.ACEROLA_SAPLING.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TreeBlocks.POTTED_ACEROLA_SAPLING.get(), RenderType.getCutout());

    }

    public boolean ticksRandomly(BlockState state) {
        return true;
    }

    /**
     * Performs a random tick on a block.
     *
     * @param state
     * @param world
     * @param pos
     * @param random
     */
    //Hardy to zone 9
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        String currentSeason = Season.getSeason(world.getDayTime());

        Biome biome = world.getBiome(pos);

        float temp = biome.getTemperature(pos);
        float minTemp = 0.8f;

        boolean validTemp = temp >= minTemp;
        boolean isProtectedByGlass = isUnderGlass(world, pos);
        boolean isSaplingSheltered = isPlantSheltered(world, pos);

        //Tree growth condition
        if (validTemp || (temp < minTemp && isProtectedByGlass) || (isProtectedByGlass)) {
            super.randomTick(state, world, pos, random);
        }

        //Sapling kill
        if (temp < minTemp && "WINTER".equals(currentSeason) && !isSaplingSheltered && random.nextInt(3) == 0) {
            world.setBlockState(pos, Blocks.DEAD_BUSH.getDefaultState());
        }
    }

    private boolean isPlantSheltered(ServerWorld world, BlockPos pos) {

        BlockPos.Mutable checkPos = new BlockPos.Mutable(pos.getX(), pos.getY() + 1, pos.getZ());

        while (checkPos.getY() < world.getHeight()) {

            BlockState stateAbove = world.getBlockState(checkPos);

            if (stateAbove.isAir() || stateAbove.getBlock() instanceof VineBlock) {
                checkPos.move(Direction.UP);
                continue;
            }

            // Any block overhead shelters the plant.
            return true;
        }

        return false;
    }

    private boolean isUnderGlass(ServerWorld world, BlockPos pos) {

        BlockPos.Mutable mutable = new BlockPos.Mutable();

        // Step 1: Find the first block above that blocks the sky (roof height)
        int roofY = -1;

        for (int y = pos.getY() + 1; y < world.getHeight(); y++) {
            mutable.setPos(pos.getX(), y, pos.getZ());

            if (!world.isAirBlock(mutable)) {
                roofY = y;
                break;
            }
        }

        if (roofY == -1) {
            return false; // No roof found
        }

        // (radius 2 → 5x5 small green house)
        // (radius 3 → 7x7 medium green house)
        // (radius 4 → 9x9 large green house)
        int radius = 2;

        for (int x = -radius; x <= radius; x++) {
            for (int z = -radius; z <= radius; z++) {

                mutable.setPos(pos.getX() + x, roofY, pos.getZ() + z);
                BlockState state = world.getBlockState(mutable);

                if (!(state.getBlock() instanceof GlassBlock)) {
                    return false; // If any block is not glass → fail
                }
            }
        }

        return true; // Entire roof area is glass
    }

    @Override
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        if (!(worldIn instanceof World)) {
            return false;
        }

        World world = (World) worldIn;
        Biome biome = world.getBiome(pos);

        float temp = biome.getTemperature(pos);
        boolean tooCold = temp < 0.8F;

        boolean isProtectedByGlass = false;

        if (world instanceof ServerWorld) {
            isProtectedByGlass = isUnderGlass((ServerWorld) world, pos);
        }

        // If protected, ignore cold restriction
        if (!isProtectedByGlass) {
            if (tooCold) {
                return false;
            }
        }

        return super.canGrow(worldIn, pos, state, isClient);
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random random, BlockPos pos, BlockState state) {
        // Always allow for the check, we'll block in grow()
        return true;
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (!worldIn.isRemote) {
            Biome biome = worldIn.getBiome(pos);

            float temp = biome.getTemperature(pos);
            float minTemp = 0.8f;

            boolean isProtectedByGlass = false;

            if (worldIn instanceof ServerWorld) {
                isProtectedByGlass = isUnderGlass((ServerWorld) worldIn, pos);
            }

            if (temp < minTemp && !isProtectedByGlass) {
                player.sendMessage(
                        new StringTextComponent("This biome is too cold for this sapling."),
                        player.getUniqueID()
                );
                return ActionResultType.SUCCESS;
            }

            return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
        }

        return ActionResultType.SUCCESS;
    }

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {

        return 80;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {

        return 60;
    }

    private static class AcerolaTree extends Tree {
        @Nullable
        @Override
        protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random random, boolean p_225546_2_) {
            return TreeFeatures.ACEROLA_TREE;
        }
    }
}


