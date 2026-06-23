package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.FoliagePlacers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.foliageplacer.FoliagePlacerType;

import java.util.Random;
import java.util.Set;

public class DesertRoseFoliagePlacer extends FoliagePlacer {

    public static final Codec<DesertRoseFoliagePlacer> CODEC =
            RecordCodecBuilder.create(instance ->
                    func_242830_b(instance)
                            .apply(instance, DesertRoseFoliagePlacer::new));

    public DesertRoseFoliagePlacer(
            FeatureSpread radius,
            FeatureSpread offset) {

        super(radius, offset);
    }

    @Override
    protected FoliagePlacerType<?> getPlacerType() {
        return ModFoliagePlacer.DESERT_ROSE_FOLIAGE_PLACER.get();
    }

    @Override
    protected void func_230372_a_(
            IWorldGenerationReader reader,
            Random rand,
            BaseTreeFeatureConfig config,
            int trunkHeight,
            Foliage foliage,
            int foliageHeight,
            int radius,
            Set<BlockPos> leaves,
            int offset,
            MutableBoundingBox box) {

        BlockPos center = foliage.func_236763_a_();

        // Main flower cushion
        generateLayer(
                reader,
                rand,
                config,
                center,
                leaves,
                box,
                2,
                0
        );

        // Smaller upper tuft
        generateLayer(
                reader,
                rand,
                config,
                center,
                leaves,
                box,
                1,
                1
        );

        // Occasional lower leaves
        if (rand.nextFloat() < 0.35F) {
            generateLayer(
                    reader,
                    rand,
                    config,
                    center,
                    leaves,
                    box,
                    1,
                    -1
            );
        }
    }

    private void generateLayer(
            IWorldGenerationReader reader,
            Random rand,
            BaseTreeFeatureConfig config,
            BlockPos center,
            Set<BlockPos> leaves,
            MutableBoundingBox box,
            int radius,
            int yOffset) {

        this.func_236753_a_(
                reader,
                rand,
                config,
                center.up(yOffset),
                radius,
                leaves,
                0,
                false,
                box
        );
    }

    @Override
    public int func_230374_a_(
            Random rand,
            int trunkHeight,
            BaseTreeFeatureConfig config) {

        return 2;
    }

    @Override
    protected boolean func_230373_a_(
            Random rand,
            int dx,
            int y,
            int dz,
            int radius,
            boolean giantTrunk) {

        return dx * dx + dz * dz > radius * radius;
    }
}
