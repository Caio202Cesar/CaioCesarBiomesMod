package com.caiocesarmods.caiocesarbiomes.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.HoglinEntity;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.entity.passive.PolarBearEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

import java.util.function.Predicate;

/*public class EarthlyHoglinEntity extends HoglinEntity {
    public EarthlyHoglinEntity(EntityType<? extends HoglinEntity> p_i231569_1_, World p_i231569_2_) {
        super(p_i231569_1_, p_i231569_2_);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 30.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.3F)
                .createMutableAttribute(Attributes.ATTACK_KNOCKBACK, 1.0D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 6.0D)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 20.0D);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new PolarBearEntity.MeleeAttackGoal());
        this.goalSelector.addGoal(1, new PolarBearEntity.PanicGoal());
        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.25D));
        this.goalSelector.addGoal(5, new RandomWalkingGoal(this, 1.0D));
        this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.addGoal(7, new LookRandomlyGoal(this));
        this.targetSelector.addGoal(1, new PolarBearEntity.HurtByTargetGoal());
        this.targetSelector.addGoal(2, new PolarBearEntity.AttackPlayerGoal());
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, 10, true, false, this::func_233680_b_));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<>(this, FoxEntity.class, 10, true, true, (Predicate<LivingEntity>)null));
        this.targetSelector.addGoal(5, new ResetAngerGoal<>(this, false));
    }
}*/
