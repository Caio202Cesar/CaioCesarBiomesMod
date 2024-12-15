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
    public static final Food TAMARINDS = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food CHERRY_PLUM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food ROASTED_FENNEL_SEEDS = (new Food.Builder()).hunger(1).saturation(0.1F).build();
    public static final Food COOKED_FENNEL_STALK = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food CITRON = (new Food.Builder()).hunger(2).saturation(0.1F)
            .effect(new EffectInstance(Effects.HUNGER, 100, 0), 0.6F).build();
    public static final Food TAHITI_LIME = (new Food.Builder()).hunger(2).saturation(0.1F)
            .effect(new EffectInstance(Effects.HUNGER, 100, 0), 0.6F).build();
    public static final Food BUDDHA_HAND_CITRON = (new Food.Builder()).hunger(4).saturation(0.3F)
            .effect(new EffectInstance(Effects.HUNGER, 40, 0), 0.2F).build();
    public static final Food GRAPEFRUIT = (new Food.Builder()).hunger(4).saturation(0.3F).build();
}
