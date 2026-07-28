package com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate;

public enum SummerHeat {

    ICY(Float.NEGATIVE_INFINITY, 0.3F),
    TUNDRA_COLD(0.3F, 0.5F),
    COOLER(0.5F, 0.7F),
    MILD(0.7F, 0.8F),
    WARM(0.8F, 0.85F),
    HOT(0.85F, 0.9F),
    VERY_HOT(0.9F, 1.0F),
    SCORCHING(1.0F, Float.POSITIVE_INFINITY);

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


