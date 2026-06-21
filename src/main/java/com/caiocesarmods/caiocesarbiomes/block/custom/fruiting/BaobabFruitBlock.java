package com.caiocesarmods.caiocesarbiomes.block.custom.fruiting;

import com.caiocesarmods.caiocesarbiomes.Seasons.Season;
import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.PushReaction;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class BaobabFruitBlock extends Block {
    public BaobabFruitBlock() {
        super(Properties.from(Blocks.BEEHIVE).zeroHardnessAndResistance().tickRandomly()
                .sound(SoundType.PLANT).notSolid().doesNotBlockMovement().harvestTool(ToolType.HOE));
    }

    public boolean ticksRandomly(BlockState state) {
        return true;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.randomTick(state, world, pos, random);

        String currentSeason = Season.getSeason(world.getDayTime());

        Biome biome = world.getBiome(pos);
        float temp = biome.getTemperature(pos);

        if (temp >= 0.9F && "SUMMER".equals(currentSeason) && random.nextInt(23) == 0) {
            world.destroyBlock(pos, true);

            int dropCount = 1;

            ItemStack itemStack = new ItemStack(ModItems.BAOBAB_FRUIT_ITEM.get(), dropCount);
            ItemEntity itemEntity = new ItemEntity(world, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, itemStack);

            world.addEntity(itemEntity);
        }

        if (temp <= 0.89F && "WINTER".equals(currentSeason) && random.nextInt(23) == 0) {
            world.destroyBlock(pos, true);

            int dropCount = 1;

            ItemStack itemStack = new ItemStack(ModItems.BAOBAB_FRUIT_ITEM.get(), dropCount);
            ItemEntity itemEntity = new ItemEntity(world, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, itemStack);

            world.addEntity(itemEntity);
        }
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(TreeBlocks.BAOBAB_FRUIT.get(), RenderType.getCutout());

    }

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 50;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 10;
    }

    public PushReaction getPushReaction(BlockState state) {
        return PushReaction.DESTROY;
    }
}

