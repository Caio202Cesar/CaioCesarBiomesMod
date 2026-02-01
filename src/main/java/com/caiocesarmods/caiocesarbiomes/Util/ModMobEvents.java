package com.caiocesarmods.caiocesarbiomes.Util;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.monster.WitchEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CaioCesarBiomesMod.MOD_ID)
public class ModMobEvents {
    @SubscribeEvent
    public static void onLivingDrops(LivingDropsEvent event) {
        if (event.getEntityLiving() instanceof WitchEntity) {

            // Optional: only drop if killed by player
            if (event.getSource().getTrueSource() instanceof PlayerEntity) {

                // Chance-based drop (recommended)
                if (event.getEntityLiving().world.rand.nextFloat() < 0.55f) {
                    ItemStack sap = new ItemStack(ModItems.POISON_SAP.get());
                    event.getDrops().add(
                            new ItemEntity(
                                    event.getEntityLiving().world,
                                    event.getEntityLiving().getPosX(),
                                    event.getEntityLiving().getPosY(),
                                    event.getEntityLiving().getPosZ(),
                                    sap
                            )
                    );
                }
            }
        }
    }
}
