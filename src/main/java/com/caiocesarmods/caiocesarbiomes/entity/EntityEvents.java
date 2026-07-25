package com.caiocesarmods.caiocesarbiomes.entity;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.entity.goals.AvoidCamphorGoal;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CaioCesarBiomesMod.MOD_ID)
public class EntityEvents {
    @SubscribeEvent
    public static void onEntityJoin(EntityJoinWorldEvent event) {

        if (!(event.getEntity() instanceof CreeperEntity))
            return;

        CreeperEntity creeper = (CreeperEntity) event.getEntity();

        //creeper.goalSelector.addGoal(1, new AvoidCamphorGoal(creeper, 1.0D, 1.25D));
    }
}
