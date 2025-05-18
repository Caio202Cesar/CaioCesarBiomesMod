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
    public static final Food RED_CURRANT = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food BLACK_CURRANT = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food LOQUAT = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food ARBUTUS = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food OLIVES = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food POMEGRANATE = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food FENNEL_STALK = (new Food.Builder()).hunger(3).saturation(0.6F).build();
    public static final Food LEMON = (new Food.Builder()).hunger(2).saturation(0.1F)
            .effect(new EffectInstance(Effects.HUNGER, 100, 0), 0.6F).build();
    public static final Food ORANGE = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food MANDARIN = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food STARFRUIT = (new Food.Builder()).hunger(4).saturation(0.3F).build();
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
    public static final Food YEW_BERRIES = (new Food.Builder()).hunger(1).saturation(0.1F)
            .effect(new EffectInstance(Effects.POISON, 300, 3), 1.0F)
            .effect(new EffectInstance(Effects.NAUSEA, 300, 2), 1.0F).build();
    public static final Food YEW_ARILS = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food AIYU_JELLY = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food COCONUT = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food COCONUT_WATER = (new Food.Builder()).hunger(4).saturation(0.3F)
            .effect(new EffectInstance(Effects.HEALTH_BOOST, 100, 3), 1.0F)
            .effect(new EffectInstance(Effects.SATURATION, 100, 2), 1.0F)
            .effect(new EffectInstance(Effects.ABSORPTION, 100, 2), 1.0F)
            .effect(new EffectInstance(Effects.SPEED, 100, 2), 1.0F)
            .effect(new EffectInstance(Effects.JUMP_BOOST, 100, 2), 1.0F)
            .effect(new EffectInstance(Effects.HASTE, 100, 2), 1.0F).build();
    public static final Food DATES = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food GREEN_TEA = (new Food.Builder()).hunger(4).saturation(0.3F)
            .effect(new EffectInstance(Effects.HEALTH_BOOST, 100, 3), 1.0F).build();
    public static final Food MATCHA_TEA = (new Food.Builder()).hunger(4).saturation(0.3F)
            .effect(new EffectInstance(Effects.HASTE, 100, 3), 1.0F).build();
    public static final Food MATCHA_LATTE = (new Food.Builder()).hunger(4).saturation(0.3F)
            .effect(new EffectInstance(Effects.SPEED, 100, 3), 1.0F)
            .effect(new EffectInstance(Effects.NIGHT_VISION, 100, 3), 1.0F).build();
    public static final Food SAVORY_RABBIT = (new Food.Builder()).hunger(7).saturation(0.8F).meat().build();
    public static final Food SAVORY_CHICKEN = (new Food.Builder()).hunger(8).saturation(0.8F).meat().build();
    public static final Food SAVORY_COD = (new Food.Builder()).hunger(7).saturation(0.8F).build();
    public static final Food SAVORY_MUTTON = (new Food.Builder()).hunger(8).saturation(0.9F).meat().build();
    public static final Food SAVORY_PORKCHOP = (new Food.Builder()).hunger(9).saturation(0.9F).meat().build();
    public static final Food SAVORY_SALMON = (new Food.Builder()).hunger(8).saturation(0.9F).build();
    //The toast alone provides less than the bread. However, when crafted with jams, oils or pastes, it provides the same saturation and hunger
    // as a bread (or more, depending on the complement). It justifies one bread giving 10 toasts.
    public static final Food TOAST = (new Food.Builder()).hunger(3).saturation(0.2F).build();
    public static final Food RAW_TOAST = (new Food.Builder()).hunger(1).saturation(0.2F).build();
    public static final Food HAZELNUT_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food PISTACHIO_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food HAZELNUT_CREAM = (new Food.Builder()).hunger(2).saturation(0.3F)
            .effect(new EffectInstance(Effects.SPEED, 200, 3), 1.0F).build();
    public static final Food PISTACHIO_CREAM = (new Food.Builder()).hunger(2).saturation(0.3F)
            .effect(new EffectInstance(Effects.SPEED, 100, 3), 1.0F).build();
    public static final Food FENNEL_SOUP = buildStew(6);
    public static final Food WALNUT_BREAD = (new Food.Builder()).hunger(5).saturation(0.6F).build();
    public static final Food PECAN_BREAD = (new Food.Builder()).hunger(5).saturation(0.6F).build();
    public static final Food INKBERRIES = (new Food.Builder()).hunger(1).saturation(0.1F)
            .effect(new EffectInstance(Effects.POISON, 100, 3), 1.0F)
            .effect(new EffectInstance(Effects.NAUSEA, 300, 2), 1.0F)
                .effect(new EffectInstance(Effects.HUNGER, 300, 2), 1.0F).build();
    public static final Food MANGO = (new Food.Builder()).hunger(5).saturation(0.6F).build();
    public static final Food GREEN_MANGO = (new Food.Builder()).hunger(2).saturation(0.2F)
            .effect(new EffectInstance(Effects.HUNGER, 200, 2), 1.0F).build();
    public static final Food BLUEBERRIES = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food MARULA = (new Food.Builder()).hunger(2).saturation(0.3F).build();
    public static final Food RIPE_MARULA = (new Food.Builder()).hunger(2).saturation(0.3F)
            .effect(new EffectInstance(Effects.NAUSEA, 400, 5), 1.0F).build();
    public static final Food ROWAN_BERRIES = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food HAWTHORN_BERRIES = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food DURIAN = (new Food.Builder()).hunger(5).saturation(0.6F)
            .effect(new EffectInstance(Effects.NAUSEA, 200, 2), 1.0F).build();
    public static final Food KIWI = (new Food.Builder()).hunger(2).saturation(0.3F).build();
    public static final Food COCONUT_SPROUT = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food JUNIPER_BERRIES = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food CREEPING_FIG = (new Food.Builder()).hunger(3).saturation(0.3F)
            .effect(new EffectInstance(Effects.HUNGER, 100, 2), 1.0F).build();
    public static final Food PERSIMMON = (new Food.Builder()).hunger(5).saturation(0.6F).build();
    public static final Food JACKALBERRY = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food SALTY_MANGO = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food LEMON_PIE = (new Food.Builder()).hunger(8).saturation(0.3F).build();

    private static Food buildStew(int hunger) {
        return (new Food.Builder()).hunger(hunger).saturation(0.6F).build();
    }
}
