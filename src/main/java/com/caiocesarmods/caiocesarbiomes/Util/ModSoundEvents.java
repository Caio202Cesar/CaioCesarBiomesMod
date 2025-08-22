package com.caiocesarmods.caiocesarbiomes.Util;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSoundEvents {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CaioCesarBiomesMod.MOD_ID);


    public static final RegistryObject<SoundEvent> MEDITERRANEAN_AMBIENCE =
            registerSoundEvent("mediterranean_ambience");

    public static final RegistryObject<SoundEvent> BEACH_AMBIENCE =
            registerSoundEvent("beach_ambience");

    public static final RegistryObject<SoundEvent> LAURISSILVA_AMBIENCE =
            registerSoundEvent("laurissilva_ambience");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(CaioCesarBiomesMod.MOD_ID, name)));
    }


    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
