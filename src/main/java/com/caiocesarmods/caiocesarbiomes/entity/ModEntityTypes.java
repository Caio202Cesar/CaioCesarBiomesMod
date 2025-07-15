package com.caiocesarmods.caiocesarbiomes.entity;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, CaioCesarBiomesMod.MOD_ID);

   /* public static final RegistryObject<EntityType<EarthlyHoglinEntity>> EARTHLY_HOGLIN =
            ENTITY_TYPES.register("earthly_hoglin",
                    () -> EntityType.Builder.create(EarthlyHoglinEntity::new,
                                    EntityClassification.CREATURE).size(1.2964844F, 1.3F).trackingRange(10)
                            .build(new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "earthly_hoglin").toString()));*/

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
