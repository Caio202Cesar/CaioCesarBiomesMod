package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.TrunkPlacers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.trunkplacer.AbstractTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.TrunkPlacerType;

import java.util.*;

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

            int radius;

            // Swollen baobab base
            if (y < treeHeight * 0.15F) {
                radius = 5; // 11x11
            }
            // Main trunk
            else if (y < treeHeight * 0.60F) {
                radius = 4; // 9x9
            }
            // Upper trunk
            else if (y < treeHeight * 0.85F) {
                radius = 3; // 7x7
            }
            // Near canopy
            else {
                radius = 2; // 5x5
            }

            // Slight natural irregularity near the top
            if (y > treeHeight * 0.70F && rand.nextFloat() < 0.15F) {
                radius = Math.max(1, radius - 1);
            }

            for (int x = -radius; x <= radius; x++) {
                for (int z = -radius; z <= radius; z++) {

                    // Circular cross-section
                    if (x * x + z * z > radius * radius) {
                        continue;
                    }

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

        List<FoliagePlacer.Foliage> foliage = new ArrayList<>();

        BlockPos top = pos.up(treeHeight);

        // Central crown
        foliage.add(new FoliagePlacer.Foliage(
                top,
                0,
                false
        ));

        // Four side crowns
        foliage.add(new FoliagePlacer.Foliage(
                top.east(4),
                0,
                false
        ));

        foliage.add(new FoliagePlacer.Foliage(
                top.west(4),
                0,
                false
        ));

        foliage.add(new FoliagePlacer.Foliage(
                top.north(4),
                0,
                false
        ));

        foliage.add(new FoliagePlacer.Foliage(
                top.south(4),
                0,
                false
        ));

        return foliage;
    }
}
