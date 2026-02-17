package com.caiocesarmods.caiocesarbiomes.Util;

import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.entity.passive.ParrotEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "caiocesarbiomes", bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ParrotFoodHandler {

    @SubscribeEvent
    public static void onEntityInteract(PlayerInteractEvent.EntityInteract event) {
        if (!(event.getTarget() instanceof ParrotEntity)) return;

        ItemStack stack = event.getItemStack();
        if (stack.isEmpty()) return;

        if (stack.getItem() == ModItems.AVOCADO.get()) {
            ParrotEntity parrot = (ParrotEntity) event.getTarget();
            parrot.attackEntityFrom(DamageSource.MAGIC, Float.MAX_VALUE);

            if (!event.getPlayer().abilities.isCreativeMode) {
                stack.shrink(1);
            }

            event.setCanceled(true);
        }

        if (stack.getItem() == ModItems.AVOCADO_ICE_CREAM.get()) {
            ParrotEntity parrot = (ParrotEntity) event.getTarget();
            parrot.attackEntityFrom(DamageSource.MAGIC, Float.MAX_VALUE);

            if (!event.getPlayer().abilities.isCreativeMode) {
                stack.shrink(1);
            }

            event.setCanceled(true);
        }

        if (stack.getItem() == ModItems.GUACAMOLE.get()) {
            ParrotEntity parrot = (ParrotEntity) event.getTarget();
            parrot.attackEntityFrom(DamageSource.MAGIC, Float.MAX_VALUE);

            if (!event.getPlayer().abilities.isCreativeMode) {
                stack.shrink(1);
            }

            event.setCanceled(true);
        }

        if (stack.getItem() == ModItems.GUACAMOLE_BREADFRUIT.get()) {
            ParrotEntity parrot = (ParrotEntity) event.getTarget();
            parrot.attackEntityFrom(DamageSource.MAGIC, Float.MAX_VALUE);

            if (!event.getPlayer().abilities.isCreativeMode) {
                stack.shrink(1);
            }

            event.setCanceled(true);
        }

        if (stack.getItem() == ModItems.GUACAMOLE_TOAST.get()) {
            ParrotEntity parrot = (ParrotEntity) event.getTarget();
            parrot.attackEntityFrom(DamageSource.MAGIC, Float.MAX_VALUE);

            if (!event.getPlayer().abilities.isCreativeMode) {
                stack.shrink(1);
            }

            event.setCanceled(true);
        }

        if (stack.getItem() == ModItems.COOKIE_ICE_CREAM.get()) {
            ParrotEntity parrot = (ParrotEntity) event.getTarget();
            parrot.attackEntityFrom(DamageSource.MAGIC, Float.MAX_VALUE);

            if (!event.getPlayer().abilities.isCreativeMode) {
                stack.shrink(1);
            }

            event.setCanceled(true);
        }
    }
}
