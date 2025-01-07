package com.caiocesarmods.caiocesarbiomes.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class PoisonSwordItem extends SwordItem {
    public PoisonSwordItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    /**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     *
     * @param stack
     * @param target
     * @param attacker
     */
    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addPotionEffect(new EffectInstance(Effects.POISON, 200, 7));

        return super.hitEntity(stack, target, attacker);
    }
}
