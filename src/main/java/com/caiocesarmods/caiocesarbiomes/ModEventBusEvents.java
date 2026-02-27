package com.caiocesarmods.caiocesarbiomes;

import com.caiocesarmods.caiocesarbiomes.entity.ModEntityTypes;
import com.caiocesarmods.caiocesarbiomes.entity.custom.MediterraneanMerchantEntity;
import com.caiocesarmods.caiocesarbiomes.item.custom.ModSpawnEgg;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CaioCesarBiomesMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.MEDITERRANEAN_MERCHANT.get(), MediterraneanMerchantEntity.setCustomAttributes().create());
    }

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
        ModSpawnEgg.initSpawnEggs();
    }
}
