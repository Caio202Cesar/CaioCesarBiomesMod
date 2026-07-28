package com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate;

public enum SummerHeat {

    ICY(Float.NEGATIVE_INFINITY, 0.15F),
    TUNDRA_COLD(0.15F, 0.40F),
    COOLER(0.40F, 0.70F),
    MILD(0.70F, 0.90F),
    WARM(0.90F, 1.20F),
    HOT(1.20F, 1.60F),
    VERY_HOT(1.60F, 2.00F),
    SCORCHING(2.00F, Float.POSITIVE_INFINITY);

    private final float min;
    private final float max;

    SummerHeat(float min, float max) {
        this.min = min;
        this.max = max;
    }

    public boolean contains(float value) {
        return value >= min && value < max;
    }

    public static SummerHeat fromTemperature(float value) {
        for (SummerHeat heat : values()) {
            if (heat.contains(value)) {
                return heat;
            }
        }
        return SCORCHING;
    }
}


