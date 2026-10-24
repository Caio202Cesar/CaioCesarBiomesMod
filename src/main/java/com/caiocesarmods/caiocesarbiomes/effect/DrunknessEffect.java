package com.caiocesarmods.caiocesarbiomes.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class DrunknessEffect extends Effect {
    public DrunknessEffect(EffectType typeIn, int liquidColorIn) {
        super(EffectType.HARMFUL, 0x808080);
    }

    @Override
    public void performEffect(LivingEntity entity, int amplifier) {
        if ((entity instanceof PlayerEntity)) {

            entity.addPotionEffect(new EffectInstance(
                    Effects.HERO_OF_THE_VILLAGE,
                    40,
                    amplifier
            ));

            entity.addPotionEffect(new EffectInstance(
                    Effects.HUNGER,
                    40,
                    amplifier
            ));

            entity.addPotionEffect(new EffectInstance(
                    Effects.BLINDNESS,
                    40,
                    amplifier
            ));

            entity.addPotionEffect(new EffectInstance(
                    Effects.NAUSEA,
                    40,
                    amplifier
            ));

            entity.addPotionEffect(new EffectInstance(
                    Effects.SLOWNESS,
                    40,
                    amplifier
            ));

            entity.addPotionEffect(new EffectInstance(
                    Effects.POISON,
                    5,
                    amplifier
            ));
        }
    }

    @Override
    public boolean isReady(int duration, int amplifier) {
        return duration % 20 == 0;
    }
}
