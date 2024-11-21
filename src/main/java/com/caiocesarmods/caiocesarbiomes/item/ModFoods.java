package com.caiocesarmods.caiocesarbiomes.item;

import net.minecraft.item.Food;
import net.minecraft.item.Foods;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

@SuppressWarnings("deprecation")
public class ModFoods extends Foods {
    public static final Food AVOCADO = (new Food.Builder()).hunger(5).saturation(0.6F).build();
    public static final Food FIGFRUIT = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food MULBERRIES = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food LOQUAT = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food ARBUTUS = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food OLIVES = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food POMEGRANATE = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food FENNEL_STALK = (new Food.Builder()).hunger(3).saturation(0.6F).build();
    public static final Food LEMON = (new Food.Builder()).hunger(2).saturation(0.1F)
            .effect(new EffectInstance(Effects.HUNGER, 100, 0), 0.6F).build();
    public static final Food ORANGE = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food MANDARIN = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food STARFRUIT = (new Food.Builder()).hunger(4).saturation(0.3F)
            .effect(new EffectInstance(Effects.HUNGER, 100, 0), 0.6F).build();
    public static final Food STARFRUIT_SLICE = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food ELDERBERRIES = (new Food.Builder()).hunger(2).saturation(0.1F).build();

}
