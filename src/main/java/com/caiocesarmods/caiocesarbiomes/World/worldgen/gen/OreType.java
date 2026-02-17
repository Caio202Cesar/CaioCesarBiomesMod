package com.caiocesarmods.caiocesarbiomes.World.worldgen.gen;

import net.minecraft.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType {
    SULPHUR(Lazy.of(com.caiocesarmods.caiocesarbiomes.block.MiscBlocks.SULPHUR_ORE), 17, 0, 128, 20),
    NETHER_SULPHUR(Lazy.of(com.caiocesarmods.caiocesarbiomes.block.MiscBlocks.SULPHUR_NETHER_ORE), 24, 0, 128, 40),
    SALTPETER(Lazy.of(com.caiocesarmods.caiocesarbiomes.block.MiscBlocks.SALTPETER_ORE), 12, 0, 128, 7);

    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;
    private final int veinsPerChunk;

    private OreType(Lazy block, int maxVeinSize, int minHeight, int maxHeight, int veinsPerChunk) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.veinsPerChunk = veinsPerChunk;
    }

    public int getVeinsPerChunk() {
        return this.veinsPerChunk;
    }

    public Lazy<Block> getBlock() {
        return this.block;
    }

    public int getMaxVeinSize() {
        return this.maxVeinSize;
    }

    public int getMinHeight() {
        return this.minHeight;
    }

    public int getMaxHeight() {
        return this.maxHeight;
    }

    public static OreType get(Block block) {
        OreType[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            OreType ore = var1[var3];
            if (block == ore.block) {
                return ore;
            }
        }

        return null;
    }
}
