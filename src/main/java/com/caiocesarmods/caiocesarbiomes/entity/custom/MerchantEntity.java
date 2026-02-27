package com.caiocesarmods.caiocesarbiomes.entity.custom;

import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.MerchantOffer;
import net.minecraft.item.MerchantOffers;
import net.minecraft.stats.Stats;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public class MerchantEntity extends AbstractVillagerEntity {
    private int despawnDelay = 24000; // 1 Minecraft day

    public MerchantEntity(EntityType<? extends AbstractVillagerEntity> type, World worldIn) {
        super(type, worldIn);
        this.forceSpawn = true;
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 20.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.33D)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 50.0D);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new TradeWithPlayerGoal(this));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, ZombieEntity.class, 8.0F, 0.5D, 0.5D));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, EvokerEntity.class, 12.0F, 0.5D, 0.5D));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, VindicatorEntity.class, 8.0F, 0.5D, 0.5D));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, VexEntity.class, 8.0F, 0.5D, 0.5D));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, PillagerEntity.class, 15.0F, 0.5D, 0.5D));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, IllusionerEntity.class, 12.0F, 0.5D, 0.5D));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, ZoglinEntity.class, 10.0F, 0.5D, 0.5D));
        this.goalSelector.addGoal(1, new PanicGoal(this, 0.8D));
        this.goalSelector.addGoal(1, new LookAtCustomerGoal(this));
        this.goalSelector.addGoal(2, new WaterAvoidingRandomWalkingGoal(this, 0.6D));
        this.goalSelector.addGoal(3, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
    }

    @Override
    protected void onVillagerTrade(MerchantOffer offer) {

    }

    //Recipes, like jams, are expensive = diamond, netherite (never). Raw products, like fruits, are cheap = iron
    @Override
    protected void populateTradeData() {
        MerchantOffers offers = this.getOffers();

        // 32 Mango -> 2 Emeralds
        offers.add(new MerchantOffer(
                new ItemStack(ModItems.MANGO.get(), 32),
                new ItemStack(Items.EMERALD, 2),
                10, 5, 0.05F
        ));

        // 64 Cloudberry -> 1 Diamond
        offers.add(new MerchantOffer(
                new ItemStack(ModItems.CLOUDBERRY.get(), 64),
                new ItemStack(Items.DIAMOND, 1),
                5, 10, 0.2F
        ));

        // 64 Pequi -> 1 Netherite Scrap
        offers.add(new MerchantOffer(
                new ItemStack(ModItems.CLOUDBERRY.get(), 64),
                new ItemStack(Items.NETHERITE_SCRAP, 1),
                3, 20, 0.4F
        ));
    }

    public ActionResultType getEntityInteractionResult(PlayerEntity playerIn, Hand hand) {
        ItemStack itemstack = playerIn.getHeldItem(hand);
        if (itemstack.getItem() != ModItems.MERCHANT_SPAWN_EGG.get() && this.isAlive() && !this.hasCustomer() && !this.isChild()) {
            if (hand == Hand.MAIN_HAND) {
                playerIn.addStat(Stats.TALKED_TO_VILLAGER);
            }

            if (this.getOffers().isEmpty()) {
                return ActionResultType.func_233537_a_(this.world.isRemote);
            } else {
                if (!this.world.isRemote) {
                    this.setCustomer(playerIn);
                    this.openMerchantContainer(playerIn, this.getDisplayName(), 1);
                }

                return ActionResultType.func_233537_a_(this.world.isRemote);
            }
        } else {
            return super.getEntityInteractionResult(playerIn, hand);
        }
    }

    @Override
    public void tick() {
        super.tick();

        if (!this.world.isRemote) {
            despawnDelay--;

            if (despawnDelay <= 0) {
                this.remove();
            }
        }
    }

    protected SoundEvent getAmbientSound() {
        return this.hasCustomer() ? SoundEvents.ENTITY_WANDERING_TRADER_TRADE : SoundEvents.ENTITY_WANDERING_TRADER_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.ENTITY_WANDERING_TRADER_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_WANDERING_TRADER_DEATH;
    }

    protected SoundEvent getVillagerYesNoSound(boolean getYesSound) {
        return getYesSound ? SoundEvents.ENTITY_WANDERING_TRADER_YES : SoundEvents.ENTITY_WANDERING_TRADER_NO;
    }

    @Override
    public boolean canDespawn(double distanceToClosestPlayer) {
        return false; // we control despawn manually
    }

    @Nullable
    @Override
    public AgeableEntity createChild(ServerWorld world, AgeableEntity mate) {
        return null;
    }

    public boolean hasXPBar() {
        return false;
    }

}
