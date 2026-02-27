package com.caiocesarmods.caiocesarbiomes.entity.custom;

import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.MerchantOffer;
import net.minecraft.item.MerchantOffers;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public class MerchantEntity extends AbstractVillagerEntity {

    private int despawnDelay = 24000; // 1 Minecraft day

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 0.8D));
        this.goalSelector.addGoal(2, new WaterAvoidingRandomWalkingGoal(this, 0.6D));
        this.goalSelector.addGoal(3, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
    }

    public MerchantEntity(EntityType<? extends AbstractVillagerEntity> type, World worldIn) {
        super(type, worldIn);
    }

    @Override
    protected void onVillagerTrade(MerchantOffer offer) {

    }

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

    @Override
    public boolean canDespawn(double distanceToClosestPlayer) {
        return false; // we control despawn manually
    }

    @Nullable
    @Override
    public AgeableEntity createChild(ServerWorld world, AgeableEntity mate) {
        return null;
    }
}
