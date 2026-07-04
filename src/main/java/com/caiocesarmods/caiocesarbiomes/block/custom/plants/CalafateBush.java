package com.caiocesarmods.caiocesarbiomes.block.custom.plants;

import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
import net.minecraft.block.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.Random;

public class CalafateBush extends BushBlock {
    public CalafateBush() {
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
            worldIn.setBlockState(pos, ModPlants.CALAFATE_FLOWERING_BUSH.get().getDefaultState());

        }
    }

    @SuppressWarnings("deprecation")
    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
        entityIn.attackEntityFrom(DamageSource.SWEET_BERRY_BUSH, 3.0F);
    }

    @Nullable
    public PathNodeType getAiPathNodeType(BlockState state, IBlockReader world, BlockPos pos, @Nullable MobEntity entity) {
        return PathNodeType.DANGER_CACTUS;
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(ModPlants.CALAFATE_BUSH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.CALAFATE_FLOWERING_BUSH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.CALAFATE_FRUITING_BUSH.get(), RenderType.getCutout());

    }

    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return state.matchesBlock(Blocks.DIRT) || state.matchesBlock(Blocks.FARMLAND) || state.matchesBlock(Blocks.GRASS_BLOCK)
                || state.matchesBlock(Blocks.PODZOL) || state.matchesBlock(Blocks.COARSE_DIRT);
    }

    public PlantType getPlantType(IBlockReader world, BlockPos pos) {
        return PlantType.CROP;
    }
}

