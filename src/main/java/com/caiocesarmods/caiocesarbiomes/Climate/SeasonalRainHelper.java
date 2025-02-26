package com.caiocesarmods.caiocesarbiomes.Climate;

public class SeasonalRainHelper {
    public static SeasonalRainType getRainTypeForSeason(String season, ClimateType climate) {
        if (climate == ClimateType.MEDITERRANEAN) {
            switch (season) {
                case "SPRING": return SeasonalRainType.NONE;
                case "WINTER": return SeasonalRainType.NORMAL;
                default: return SeasonalRainType.NORMAL;
            }
        }
        return SeasonalRainType.NORMAL; // Default for other climates
    }
}
