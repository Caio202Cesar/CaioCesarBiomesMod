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
            .effect(new EffectInstance(Effects.POISON, 500, 6), 1.0F).build();
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
    public static final Food SAVORY_RABBIT = (new Food.Builder()).hunger(7).saturation(0.8F)
            .effect(new EffectInstance(Effects.STRENGTH, 100, 3), 1.0F)
            .meat().build();
    public static final Food SAVORY_CHICKEN = (new Food.Builder()).hunger(8).saturation(0.8F)
            .effect(new EffectInstance(Effects.STRENGTH, 100, 3), 1.0F)
            .meat().build();
    public static final Food SAVORY_PORKCHOP = (new Food.Builder()).hunger(9).saturation(0.9F)
            .effect(new EffectInstance(Effects.STRENGTH, 100, 3), 1.0F)
            .meat().build();
    public static final Food SAVORY_SALMON = (new Food.Builder()).hunger(9).saturation(0.9F)
            .effect(new EffectInstance(Effects.STRENGTH, 100, 3), 1.0F)
            .build();
    //The toast alone provides less than the bread. However, when crafted with jams, oils or pastes, it provides the same saturation and hunger
    // as a bread (or more, depending on the complement). It justifies one bread giving 10 toasts.
    public static final Food TOAST = (new Food.Builder()).hunger(3).saturation(0.2F).build();
    public static final Food RAW_TOAST = (new Food.Builder()).hunger(1).saturation(0.2F).build();
    public static final Food HAZELNUT_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food PISTACHIO_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food FENNEL_SOUP = buildStew(6);
    public static final Food WALNUT_BREAD = (new Food.Builder()).hunger(5).saturation(0.6F).build();
    public static final Food PECAN_BREAD = (new Food.Builder()).hunger(5).saturation(0.6F).build();
    public static final Food BANANA_BREAD = (new Food.Builder()).hunger(5).saturation(0.6F).build();
    public static final Food ARBUTUS_CAKE = (new Food.Builder()).hunger(5).saturation(0.6F).build();
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
    public static final Food CLOUDBERRY = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food WALNUT = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food PECAN = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food CHESTNUT = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food RAW_BREADFRUIT = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food BREADFRUIT = (new Food.Builder()).hunger(5).saturation(0.6F).build();
    public static final Food BANANA = (new Food.Builder()).hunger(5).saturation(0.4F).build();
    public static final Food COOKED_BANANA_FLOWER = (new Food.Builder()).hunger(5).saturation(0.6F).build();
    public static final Food RAW_BACON = (new Food.Builder()).hunger(6).saturation(0.6F).meat().build();
    public static final Food COOKED_BACON = (new Food.Builder()).hunger(8).saturation(0.8F).meat()
            .effect(new EffectInstance(Effects.SPEED, 100, 3), 1.0F)
            .effect(new EffectInstance(Effects.HASTE, 100, 3), 1.0F).build();
    public static final Food ICE_CREAM_CONE = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food ARBUTUS_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food AVOCADO_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food BACON_ICE_CREAM = (new Food.Builder()).hunger(6).saturation(0.7F).build();
    public static final Food BANANA_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food BLACK_CURRANT_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food BLUEBERRY_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food CHOCOLATE_COCONUT_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food CHOCOLATE_BANANA_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food CHOCOLATE_HAZELNUT_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food CHOCOLATE_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food CLOUDBERRY_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food COCONUT_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food ELDERBERRY_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food FIG_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food GRAPEFRUIT_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food HONEY_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food KIWI_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food LAVENDER_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food LEMON_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food LIME_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food LOQUAT_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food MANDARIN_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food MANGO_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food MANGO_BACON_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food MARULA_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food MATCHA_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food MILK_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food MULBERRY_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food ORANGE_CHOCOLATE_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food ORANGE_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food PERSIMMON_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food PISTACHIO_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food POMEGRANATE_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food RED_CURRANT_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food WATERMELON_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food CHORUS_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food SWEET_BERRY_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food COOKIE_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food GUACAMOLE = (new Food.Builder()).hunger(6).saturation(0.6F).build();
    public static final Food GUACAMOLE_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food GUACAMOLE_BREADFRUIT = (new Food.Builder()).hunger(5).saturation(0.8F).build();
    public static final Food EUCALYPTUS_CANDY = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food SPICED_CHICKEN = (new Food.Builder()).hunger(4).saturation(0.5F).meat().build();
    public static final Food SPICED_PORKCHOP = (new Food.Builder()).hunger(4).saturation(0.5F).meat().build();
    public static final Food SPICED_RABBIT = (new Food.Builder()).hunger(4).saturation(0.5F).meat().build();
    public static final Food SPICED_SALMON = (new Food.Builder()).hunger(4).saturation(0.5F).meat().build();
    public static final Food STARFRUIT_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food CRABAPPLES = (new Food.Builder()).hunger(2).saturation(0.2F).build();
    public static final Food PEACH = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food MARULA_DRINK = (new Food.Builder()).hunger(2).saturation(0.3F)
            .effect(new EffectInstance(Effects.NAUSEA, 250, 4), 1.0F)
            .effect(new EffectInstance(Effects.STRENGTH, 400, 3), 1.0F)
            .effect(new EffectInstance(Effects.HASTE, 350, 5), 1.0F)
            .effect(new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 350, 5), 1.0F)
            .effect(new EffectInstance(Effects.LUCK, 400, 5), 1.0F).build();
    public static final Food PEACH_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food PEACH_PIE = (new Food.Builder()).hunger(8).saturation(0.3F).build();
    public static final Food CANDIED_CITRON = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food PISTACHIO = (new Food.Builder()).hunger(1).saturation(0.2F).build();
    public static final Food HAZELNUTS = (new Food.Builder()).hunger(1).saturation(0.2F).build();
    public static final Food CAROB_BEANS = (new Food.Builder()).hunger(1).saturation(0.2F)
            .effect(new EffectInstance(Effects.SPEED, 100, 3), 1.0F)
            .effect(new EffectInstance(Effects.HASTE, 100, 3), 1.0F).build();
    public static final Food RAW_ALMOND = (new Food.Builder()).hunger(1).saturation(0.1F)
            .effect(new EffectInstance(Effects.POISON, 600, 3), 1.0F)
            .effect(new EffectInstance(Effects.NAUSEA, 300, 2), 1.0F)
            .effect(new EffectInstance(Effects.HUNGER, 300, 2), 1.0F).build();
    public static final Food UNRIPE_ALMOND = (new Food.Builder()).hunger(2).saturation(0.3F)
            .effect(new EffectInstance(Effects.HEALTH_BOOST, 450, 3), 1.0F).build();
    public static final Food ROASTED_ALMOND = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food PINK_IVORY_BERRIES = (new Food.Builder()).hunger(2).saturation(0.1F).build();
    public static final Food ACEROLA = (new Food.Builder()).hunger(2).saturation(0.1F)
            .effect(new EffectInstance(Effects.HEALTH_BOOST, 450, 3), 1.0F).build();
    public static final Food MACARONS = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food ARBUTUS_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food ARBUTUS_JUICE = (new Food.Builder()).hunger(4).saturation(0.1F).build();
    public static final Food ACEROLA_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food ACEROLA_JUICE = (new Food.Builder()).hunger(4).saturation(0.1F).build();
    public static final Food BLACK_CURRANT_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food BLACK_CURRANT_JUICE = (new Food.Builder()).hunger(4).saturation(0.1F).build();
    public static final Food ALOE_VERA_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food ALOE_VERA_JUICE = (new Food.Builder()).hunger(4).saturation(0.1F).build();
    public static final Food CHERRY_PLUM_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food CHERRY_PLUM_JUICE = (new Food.Builder()).hunger(4).saturation(0.1F).build();
    public static final Food CITRON_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food BLUEBERRY_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food BLUEBERRY_JUICE = (new Food.Builder()).hunger(4).saturation(0.1F).build();
    public static final Food CLOUDBERRY_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food CLOUDBERRY_JUICE = (new Food.Builder()).hunger(4).saturation(0.1F).build();
    public static final Food CRABAPPLE_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food CRABAPPLE_JUICE = (new Food.Builder()).hunger(4).saturation(0.1F).build();
    public static final Food ELDERBERRY_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food ELDERBERRY_JUICE = (new Food.Builder()).hunger(4).saturation(0.1F).build();
    public static final Food FIG_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food RED_CURRANT_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food ACEROLA_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F)
            .effect(new EffectInstance(Effects.HEALTH_BOOST, 400, 2), 1.0F) .build();
    public static final Food ALMOND_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food CHERRY_PLUM_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food GRAPEFRUIT_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food GRAPEFRUIT_JUICE = (new Food.Builder()).hunger(4).saturation(0.1F).build();
    public static final Food HAWTHORN_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food HAWTHORN_JUICE = (new Food.Builder()).hunger(4).saturation(0.1F).build();
    public static final Food HAWTHORN_TEA = (new Food.Builder()).hunger(4).saturation(0.3F)
            .effect(new EffectInstance(Effects.HASTE, 100, 3), 1.0F).build();
    public static final Food JACKALBERRY_ICE_CREAM = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food JACKALBERRY_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food JACKALBERRY_JUICE = (new Food.Builder()).hunger(4).saturation(0.1F).build();
    public static final Food LEMON_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food LEMON_JUICE = (new Food.Builder()).hunger(4).saturation(0.1F).build();
    public static final Food KIWI_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food KIWI_JUICE = (new Food.Builder()).hunger(4).saturation(0.1F).build();
    public static final Food LIME_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food LIME_JUICE = (new Food.Builder()).hunger(4).saturation(0.1F).build();
    public static final Food LOQUAT_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food LOQUAT_JUICE = (new Food.Builder()).hunger(4).saturation(0.1F).build();
    public static final Food MANGO_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food MANGO_JUICE = (new Food.Builder()).hunger(4).saturation(0.1F).build();
    public static final Food GREEN_MANGO_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food MANDARIN_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food MANDARIN_JUICE = (new Food.Builder()).hunger(4).saturation(0.1F).build();
    public static final Food MARULA_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food LAVENDER_TEA = (new Food.Builder()).hunger(4).saturation(0.3F)
            .effect(new EffectInstance(Effects.HASTE, 100, 3), 1.0F).build();
    public static final Food MULBERRY_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food ORANGE_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food PEACH_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food PERSIMMON_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food PINK_IVORY_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food POMEGRANATE_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food CREEPING_FIG_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food ROWAN_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food STARFRUIT_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food TAMARIND_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food GREEN_ALMOND_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food YEW_JAM_TOAST = (new Food.Builder()).hunger(4).saturation(0.5F).build();
    public static final Food MARRON_GLACE = (new Food.Builder()).hunger(2).saturation(0.3F).setAlwaysEdible().build();
    public static final Food BOILED_MILK = (new Food.Builder()).hunger(8).saturation(0.8F).meat().build();

    private static Food buildStew(int hunger) {
        return (new Food.Builder()).hunger(hunger).saturation(0.6F).build();
    }
}
