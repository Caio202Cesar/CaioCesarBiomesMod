package com.caiocesarmods.caiocesarbiomes.Seasons;

import com.caiocesarmods.caioclimates.Seasons.Season;
import com.caiocesarmods.caioclimates.Seasons.SeasonalPhase;
import net.minecraft.world.server.ServerWorld;

public enum FruitSeason {

    APPLE(
            Season.SPRING, SeasonalPhase.LATE_SPRING,
            Season.SUMMER, SeasonalPhase.MID_SUMMER,
            Season.FALL, SeasonalPhase.EARLY_FALL
    );

    private final Season fruitGrowSeason;
    private final SeasonalPhase fruitGrowPhase;
    private final Season fruitRipeSeason;
    private final SeasonalPhase fruitRipePhase;
    private final Season harvestSeason;
    private final SeasonalPhase harvestPhase;

    FruitSeason(Season fruitGrowSeason, SeasonalPhase fruitGrowPhase,
                Season fruitRipeSeason, SeasonalPhase fruitRipePhase,
                Season harvestSeason, SeasonalPhase harvestPhase) {
        this.fruitGrowSeason = fruitGrowSeason;
        this.fruitGrowPhase = fruitGrowPhase;
        this.fruitRipeSeason = fruitRipeSeason;
        this.fruitRipePhase = fruitRipePhase;
        this.harvestSeason = harvestSeason;
        this.harvestPhase = harvestPhase;
    }

    public Season getFruitGrowSeason() {
        return fruitGrowSeason;
    }

    public SeasonalPhase getFruitGrowPhase() {
        return fruitGrowPhase;
    }

    public Season getFruitRipeSeason() {
        return fruitRipeSeason;
    }

    public SeasonalPhase getFruitRipePhase() {
        return fruitRipePhase;
    }

    public Season getHarvestSeason() {
        return harvestSeason;
    }

    public SeasonalPhase getHarvestPhase() {
        return harvestPhase;
    }

    public boolean isHarvestSeason(ServerWorld world) {
        return getHarvestPhase();
    }

    public boolean canGrow(ServerWorld world) {
    ...
    }

    public float getGrowthChance(ServerWorld world) {
    ...
    }
}
