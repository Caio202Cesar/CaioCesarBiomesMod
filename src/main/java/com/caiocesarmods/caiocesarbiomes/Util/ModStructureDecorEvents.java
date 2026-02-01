package com.caiocesarmods.caiocesarbiomes.Util;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.world.ChunkEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;

@Mod.EventBusSubscriber(modid = CaioCesarBiomesMod.MOD_ID)
public class ModStructureDecorEvents {
    @SubscribeEvent
    public static void onChunkLoad(ChunkEvent.Load event) {
        if (!(event.getWorld() instanceof ServerWorld)) return;
        if (!(event.getChunk() instanceof Chunk)) return;

        ServerWorld world = (ServerWorld) event.getWorld();
        Chunk chunk = (Chunk) event.getChunk();

        // Check structures in this chunk
        StructureStart<?> start =
                chunk.getStructureStarts().get(Structure.SWAMP_HUT);

        if (start == StructureStart.DUMMY) return;

        BlockPos.Mutable pos = new BlockPos.Mutable();
        Random rand = world.rand;

        int minY = 60; // witch hut base
        int maxY = 75; // roof area

        for (int x = 0; x < 16; x++) {
            for (int z = 0; z < 16; z++) {
                for (int y = minY; y <= maxY; y++) {

                    pos.setPos(
                            chunk.getPos().getXStart() + x,
                            y,
                            chunk.getPos().getZStart() + z
                    );

                    BlockState state = world.getBlockState(pos);

                    if (state.getBlock() == Blocks.POTTED_RED_MUSHROOM ||
                            state.getBlock() == Blocks.POTTED_BROWN_MUSHROOM) {

                        // 🎲 Chance-based replacement
                        if (rand.nextFloat() < 0.15f) { // 15% chance = rarest
                            world.setBlockState(
                                    pos,
                                    TreeBlocks.POTTED_OLEANDER_WHITE_SAPLING.get().getDefaultState(),
                                    2
                            );
                        }

                        if (rand.nextFloat() < 0.55f) { // 55% chance (most common)
                            world.setBlockState(
                                    pos,
                                    TreeBlocks.POTTED_OLEANDER_PINK_SAPLING.get().getDefaultState(),
                                    2
                            );
                        }

                        if (rand.nextFloat() < 0.45f) { // 45% chance - third common
                            world.setBlockState(
                                    pos,
                                    TreeBlocks.POTTED_OLEANDER_DARK_PINK_SAPLING.get().getDefaultState(),
                                    2
                            );
                        }

                        if (rand.nextFloat() < 0.25f) { // 20% chance = second rarer
                            world.setBlockState(
                                    pos,
                                    TreeBlocks.POTTED_OLEANDER_RED_SAPLING.get().getDefaultState(),
                                    2
                            );
                        }

                        if (rand.nextFloat() < 0.20f) { // 20% chance = third rarest
                            world.setBlockState(
                                    pos,
                                    TreeBlocks.POTTED_ORANGE_OLEANDER_SAPLING.get().getDefaultState(),
                                    2
                            );
                        }

                        if (rand.nextFloat() < 0.50f) { // 50% chance = second commonest
                            world.setBlockState(
                                    pos,
                                    TreeBlocks.POTTED_YELLOW_OLEANDER_SAPLING.get().getDefaultState(),
                                    2
                            );
                        }
                    }
                }
            }
        }
    }
}
