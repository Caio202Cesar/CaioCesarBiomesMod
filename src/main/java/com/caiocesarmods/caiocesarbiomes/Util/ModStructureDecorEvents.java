package com.caiocesarmods.caiocesarbiomes.Util;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.chunk.Chunk;
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
        if (!world.getChunkProvider().getChunkGenerator()
                .hasStructure(world, Structure.WITCH_HUT, chunk.getPos())) {
            return;
        }

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
                        if (rand.nextFloat() < 0.30f) { // 30% chance
                            world.setBlockState(
                                    pos,
                                    TreeBlocks.POTTED_OLEANDER_WHITE_SAPLING.get().getDefaultState(),
                                    2
                            );
                        }
                    }
                }
            }
        }
    }
}
