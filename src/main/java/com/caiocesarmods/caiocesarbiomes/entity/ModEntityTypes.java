package com.caiocesarmods.caiocesarbiomes.entity;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.entity.custom.MerchantEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod.MOD_ID;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, MOD_ID);

    public static final RegistryObject<EntityType<MerchantEntity>> MERCHANT =
            ENTITY_TYPES.register("merchant",
                    () -> EntityType.Builder
                            .create(MerchantEntity::new, EntityClassification.CREATURE)
                            .size(0.6F, 1.95F)
                            .trackingRange(8)
                            .build("fruit_merchant"));
}
