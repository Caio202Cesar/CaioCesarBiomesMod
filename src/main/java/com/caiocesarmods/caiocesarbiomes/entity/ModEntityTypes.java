package com.caiocesarmods.caiocesarbiomes.entity;

import com.caiocesarmods.caiocesarbiomes.entity.custom.DesertMerchantEntity;
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

    public static final RegistryObject<EntityType<DesertMerchantEntity>> DESERT_MERCHANT =
            ENTITY_TYPES.register("desert_merchant",
                    () -> EntityType.Builder
                            .create(DesertMerchantEntity::new, EntityClassification.CREATURE)
                            .size(0.6F, 1.95F)
                            .trackingRange(8)
                            .build("desert_merchant"));

    public static final RegistryObject<EntityType<TaigaMerchantEntity>> TAIGA_MERCHANT =
            ENTITY_TYPES.register("taiga_merchant",
                    () -> EntityType.Builder
                            .create(TaigaMerchantEntity::new, EntityClassification.CREATURE)
                            .size(0.6F, 1.95F)
                            .trackingRange(8)
                            .build("taiga_merchant"));

    public static final RegistryObject<EntityType<TropicalMerchantEntity>> TROPICAL_MERCHANT =
            ENTITY_TYPES.register("tropical_merchant",
                    () -> EntityType.Builder
                            .create(TropicalMerchantEntity::new, EntityClassification.CREATURE)
                            .size(0.6F, 1.95F)
                            .trackingRange(8)
                            .build("tropical_merchant"));
}
