package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.IFeatureConfig;

public class ItalianCypressTreeConfig implements IFeatureConfig {
    public final BlockState log;
    public final BlockState leaves;

    public ItalianCypressTreeConfig(BlockState log, BlockState leaves) {
        this.log = log;
        this.leaves = leaves;
    }

    public static final Codec<ItalianCypressTreeConfig> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    BlockState.CODEC.fieldOf("log").forGetter(config -> config.log),
                    BlockState.CODEC.fieldOf("leaves").forGetter(config -> config.leaves)
            ).apply(instance, ItalianCypressTreeConfig::new)
    );
}
