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

public class JapanesePineFoliagePlacer extends FoliagePlacer {

    public static final Codec<JapanesePineFoliagePlacer> CODEC =
            RecordCodecBuilder.create(instance ->
                    func_242830_b(instance)
                            .apply(instance, JapanesePineFoliagePlacer::new));

    public JapanesePineFoliagePlacer(
            FeatureSpread radius,
            FeatureSpread offset) {

        super(radius, offset);
    }

    @Override
    protected FoliagePlacerType<?> getPlacerType() {
        return ModFoliagePlacer.JAPANESE_PINE_FOLIAGE_PLACER.get();
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
        boolean giant = foliage.func_236765_c_();

        // Main lower pad (the broad horizontal canopy)
        this.func_236753_a_(
                reader, rand, config,
                center,
                4,
                leaves,
                0,
                giant,
                box);

        // Upper pad, shifted one block up to create a second canopy layer
        this.func_236753_a_(
                reader, rand, config,
                center.up(),
                3,
                leaves,
                0,
                giant,
                box);

        // Small top pad that covers the terminal log completely
        this.func_236753_a_(
                reader, rand, config,
                center.up(2),
                2,
                leaves,
                0,
                giant,
                box);

        // Tiny apex tuft; radius 1 creates a 3x3 pad centered above the leader
        this.func_236753_a_(
                reader, rand, config,
                center.up(3),
                1,
                leaves,
                0,
                giant,
                box);
    }

    @Override
    protected boolean func_230373_a_(
            Random rand,
            int dx,
            int y,
            int dz,
            int radius,
            boolean giantTrunk) {

        /*
         * Horizontal ellipse.
         *
         * X radius is stretched to produce flattened foliage pads.
         */

        double rx = radius + 1.8;
        double rz = radius + 0.8;

        double nx = dx / rx;
        double nz = dz / rz;

        double d = nx * nx + nz * nz;

        // Outside ellipse
        if (d > 1.0)
            return true;

        // Ragged outer edge
        if (d > 0.82)
            return rand.nextFloat() < 0.45F;

        // Small random openings inside the pad
        if (d > 0.60)
            return rand.nextFloat() < 0.08F;

        return false;
    }

    @Override
    public int func_230374_a_(
            Random rand,
            int trunkHeight,
            BaseTreeFeatureConfig config) {

        return 3;
    }
}
