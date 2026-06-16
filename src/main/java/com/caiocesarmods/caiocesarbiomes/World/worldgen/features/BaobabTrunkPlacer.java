package com.caiocesarmods.caiocesarbiomes.World.worldgen.features;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.trunkplacer.AbstractTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.TrunkPlacerType;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class BaobabTrunkPlacer extends AbstractTrunkPlacer {
    private final int radius;

    public static final Codec<BaobabTrunkPlacer> CODEC =
            RecordCodecBuilder.create(instance ->
                    getAbstractTrunkCodec(instance)
                            .and(
                                    Codec.INT.fieldOf("radius")
                                            .forGetter(placer -> placer.radius)
                            )
                            .apply(instance, BaobabTrunkPlacer::new)
            );

    public BaobabTrunkPlacer(
            int baseHeight,
            int heightRandA,
            int heightRandB,
            int radius) {

        super(baseHeight, heightRandA, heightRandB);
        this.radius = radius;
    }

    @Override
    protected TrunkPlacerType<?> getPlacerType() {
        return ModTrunkPlacers.BAOBAB;
    }

    @Override
    public List<FoliagePlacer.Foliage> getFoliages(
            IWorldGenerationReader reader,
            Random rand,
            int treeHeight,
            BlockPos pos,
            Set<BlockPos> logs,
            MutableBoundingBox box,
            BaseTreeFeatureConfig config) {

        for (int y = 0; y < treeHeight; y++) {
            for (int x = -4; x <= 4; x++) {
                for (int z = -4; z <= 4; z++) {

                    func_236911_a_(
                            reader,
                            rand,
                            pos.add(x, y, z),
                            logs,
                            box,
                            config
                    );
                }
            }
        }

        return Collections.singletonList(
                new FoliagePlacer.Foliage(
                        pos.up(treeHeight),
                        0,
                        false
                )
        );
    }
}
