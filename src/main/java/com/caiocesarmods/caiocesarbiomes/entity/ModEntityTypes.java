package com.caiocesarmods.caiocesarbiomes.entity;

import com.caiocesarmods.caiocesarbiomes.entity.custom.MediterraneanMerchantEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod.MOD_ID;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, MOD_ID);

    public static final RegistryObject<EntityType<MediterraneanMerchantEntity>> MEDITERRANEAN_MERCHANT =
            ENTITY_TYPES.register("mediterranean_merchant",
                    () -> EntityType.Builder
                            .create(MediterraneanMerchantEntity::new, EntityClassification.CREATURE)
                            .size(0.6F, 1.95F)
                            .trackingRange(8)
                            .build("mediterranean_merchant"));
}
