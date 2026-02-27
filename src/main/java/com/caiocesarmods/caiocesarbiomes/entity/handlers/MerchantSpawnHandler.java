package com.caiocesarmods.caiocesarbiomes.entity.handlers;

import com.caiocesarmods.caiocesarbiomes.entity.ModEntityTypes;
import com.caiocesarmods.caiocesarbiomes.entity.custom.MerchantEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.horse.LlamaEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID)
public class MerchantSpawnHandler {
    private static int spawnTimer = 0;

    @SubscribeEvent
    public static void onWorldTick(TickEvent.WorldTickEvent event) {

        if (event.world.isRemote || event.phase != TickEvent.Phase.END)
            return;

        spawnTimer++;

        // Try spawn every 12000 ticks (~10 minutes)
        if (spawnTimer >= 12000) {
            spawnTimer = 0;

            ServerWorld world = (ServerWorld) event.world;

            if (world.rand.nextFloat() < 0.3F) { // 30% chance
                PlayerEntity player = world.getRandomPlayer();

                if (player != null) {

                    BlockPos spawnPos = player.getPosition().add(
                            world.rand.nextInt(48) - 24,
                            0,
                            world.rand.nextInt(48) - 24
                    );

                    spawnMerchant(world, spawnPos);
                }
            }
        }
    }

    private static void spawnMerchant(ServerWorld world, BlockPos pos) {

        MerchantEntity merchant =
                ModEntityTypes.MERCHANT.get().create(world);

        if (merchant == null) return;

        merchant.setPosition(pos.getX(), pos.getY(), pos.getZ());

        world.addEntity(merchant);

        // Spawn llama caravan
        for (int i = 0; i < 2; i++) {
            LlamaEntity llama = EntityType.LLAMA.create(world);
            assert llama != null;
            llama.setPosition(pos.getX() + i + 1, pos.getY(), pos.getZ());
            llama.setLeashHolder(merchant, true);
            world.addEntity(llama);
        }
    }
}

