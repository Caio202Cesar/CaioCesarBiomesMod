package com.caiocesarmods.caiocesarbiomes.Potions;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import net.minecraft.advancements.criterion.MobEffectsPredicate;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.potion.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS
            = DeferredRegister.create(ForgeRegistries.POTION_TYPES, CaioCesarBiomesMod.MOD_ID);

    //public static final RegistryObject<Potion> GREEN_TEA = POTIONS.register("green_tea", () -> new Potion(new EffectInstance(Effects.HASTE, 200, 2)));
    //public static final RegistryObject<Potion> MATCHA_TEA = POTIONS.register("matcha_tea", () -> new Potion(new EffectInstance(Effects.REGENERATION, 200, 1)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
