package com.caiocesarmods.caiocesarbiomes.entity.custom;

import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
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
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public class MediterraneanMerchantEntity extends AbstractVillagerEntity {
    private int despawnDelay = 24000; // 1 Minecraft day

    public MediterraneanMerchantEntity(EntityType<? extends AbstractVillagerEntity> type, World worldIn) {
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

        ///Fig
        // 64 Fig -> 5 Iron Ingot
        offers.add(new MerchantOffer(
                new ItemStack(ModItems.FIGFRUIT.get(), 64),
                new ItemStack(Items.IRON_INGOT, 5),
                10, 5, 0.2F
        ));

        offers.add(new MerchantOffer(
                new ItemStack(ModItems.WHITE_FIG.get(), 64),
                new ItemStack(Items.DIAMOND, 5),
                2, 5, 0.5F
        ));

        // 15 Fig Jams -> 3 Emerald
        offers.add(new MerchantOffer(
                new ItemStack(ModItems.FIG_JAM.get(), 15),
                new ItemStack(Items.EMERALD, 3),
                2, 10, 0.2F
        ));

        // 30 Fig Jams -> 1 Diamond
        offers.add(new MerchantOffer(
                new ItemStack(ModItems.FIG_JAM.get(), 30),
                new ItemStack(Items.DIAMOND, 1),
                1, 20, 0.5F
        ));

        // 50 Fig Jams -> 1 Nether Scrap
        offers.add(new MerchantOffer(
                new ItemStack(ModItems.FIG_JAM.get(), 50),
                new ItemStack(Items.NETHERITE_SCRAP, 1),
                1, 40, 0.7F
        ));

        // 14 Wheat -> 1 Fig Jam
        offers.add(new MerchantOffer(
                new ItemStack(Items.WHEAT, 14),
                new ItemStack(ModItems.FIG_JAM.get(), 1),
                3, 2, 0.4F
        ));

        offers.add(new MerchantOffer(
                new ItemStack(Items.CACTUS, 15),
                new ItemStack(ModItems.FIGFRUIT.get(), 35),
                5, 2, 0.4F
        ));

        ///Pomegranate
        // 64 Fig -> 5 Iron Ingot
        offers.add(new MerchantOffer(
                new ItemStack(ModItems.POMEGRANATE.get(), 64),
                new ItemStack(Items.IRON_INGOT, 5),
                10, 5, 0.2F
        ));

        // 15 Fig Jams -> 3 Emerald
        offers.add(new MerchantOffer(
                new ItemStack(ModItems.POMEGRANATE_JAM.get(), 15),
                new ItemStack(Items.EMERALD, 3),
                2, 10, 0.2F
        ));

        // 30 Fig Jams -> 1 Diamond
        offers.add(new MerchantOffer(
                new ItemStack(ModItems.POMEGRANATE_JAM.get(), 30),
                new ItemStack(Items.DIAMOND, 1),
                1, 20, 0.5F
        ));

        // 50 Fig Jams -> 1 Nether Scrap
        offers.add(new MerchantOffer(
                new ItemStack(ModItems.POMEGRANATE_JAM.get(), 50),
                new ItemStack(Items.NETHERITE_SCRAP, 1),
                1, 40, 0.7F
        ));

        // 14 Wheat -> 1 Fig Jam
        offers.add(new MerchantOffer(
                new ItemStack(Items.WHEAT, 14),
                new ItemStack(ModItems.POMEGRANATE_JAM.get(), 1),
                3, 2, 0.4F
        ));

        // 15 Carrots -> 15 Pomegranate
        offers.add(new MerchantOffer(
                new ItemStack(Items.BEETROOT, 15),
                new ItemStack(ModItems.POMEGRANATE.get(), 35),
                5, 2, 0.4F
        ));

        ///Arbutus
        // 64 Arbutus -> 5 Iron Ingot
        offers.add(new MerchantOffer(
                new ItemStack(ModItems.ARBUTUS.get(), 64),
                new ItemStack(Items.IRON_INGOT, 5),
                10, 5, 0.2F
        ));

        // 30 Arbutus Jams -> 1 Diamond
        offers.add(new MerchantOffer(
                new ItemStack(ModItems.ARBUTUS_JAM.get(), 30),
                new ItemStack(Items.DIAMOND, 1),
                1, 20, 0.5F
        ));

        // 50 Arbutus Jams -> 1 Nether Scrap
        offers.add(new MerchantOffer(
                new ItemStack(ModItems.ARBUTUS_JAM.get(), 50),
                new ItemStack(Items.NETHERITE_SCRAP, 1),
                1, 40, 0.7F
        ));

        // 14 Wheat -> 1 Arbutus Jam
        offers.add(new MerchantOffer(
                new ItemStack(Items.WHEAT, 14),
                new ItemStack(ModItems.ARBUTUS_JAM.get(), 1),
                3, 2, 0.4F
        ));

        ///Dates
        // 64 Dates -> 1 Emerald
        offers.add(new MerchantOffer(
                new ItemStack(ModItems.DATES.get(), 64),
                new ItemStack(Items.EMERALD, 1),
                10, 5, 0.2F
        ));

        offers.add(new MerchantOffer(
                new ItemStack(Items.WHEAT, 35),
                new ItemStack(ModItems.DATES.get(), 64),
                10, 5, 0.2F
        ));

        ///Oregano plant
        offers.add(new MerchantOffer(
                new ItemStack(ModPlants.OREGANO.get(), 20),
                new ItemStack(Items.EMERALD, 1),
                1, 20, 0.2F
        ));

        offers.add(new MerchantOffer(
                new ItemStack(Items.WHEAT_SEEDS, 10),
                new ItemStack(ModPlants.OREGANO.get(), 3),
                10, 20, 0.2F
        ));

        //Oregano stalk
        offers.add(new MerchantOffer(
                new ItemStack(ModItems.OREGANO_STALK.get(), 64),
                new ItemStack(Items.EMERALD, 1),
                1, 20, 0.4F
        ));

        offers.add(new MerchantOffer(
                new ItemStack(Items.WHEAT_SEEDS, 20),
                new ItemStack(ModItems.OREGANO_STALK.get(), 15),
                10, 20, 0.2F
        ));

        //Saplings
        offers.add(new MerchantOffer(
                new ItemStack(Items.EMERALD, 3),
                new ItemStack(TreeBlocks.CANARY_DATE_SAPLING.get(), 1),
                4, 20, 0.7F
        ));

        offers.add(new MerchantOffer(
                new ItemStack(Items.WHEAT, 25),
                new ItemStack(TreeBlocks.FIG_SAPLING.get(), 1),
                3, 20, 0.3F
        ));

        offers.add(new MerchantOffer(
                new ItemStack(Items.WHEAT, 10),
                new ItemStack(TreeBlocks.HOLM_OAK_SAPLING.get(), 1),
                5, 20, 0.01F
        ));

        offers.add(new MerchantOffer(
                new ItemStack(Items.WHEAT, 10),
                new ItemStack(TreeBlocks.CORK_OAK_SAPLING.get(), 1),
                5, 20, 0.01F
        ));

        /// Other plants
        offers.add(new MerchantOffer(
                new ItemStack(Items.EMERALD, 5),
                new ItemStack(ModPlants.BAY_LAUREL.get(), 2),
                2, 20, 0.5F
        ));

        offers.add(new MerchantOffer(
                new ItemStack(Items.EMERALD, 5),
                new ItemStack(ModPlants.BAY_LAUREL_FLOWERING.get(), 2),
                2, 20, 0.5F
        ));
    }

    public ActionResultType getEntityInteractionResult(PlayerEntity playerIn, Hand hand) {
        ItemStack itemstack = playerIn.getHeldItem(hand);
        if (itemstack.getItem() != ModItems.MEDITERRANEAN_MERCHANT_SPAWN_EGG.get() && this.isAlive() && !this.hasCustomer() && !this.isChild()) {
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
