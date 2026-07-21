package com.caiocesarmods.caiocesarbiomes.Util;

import com.caiocesarmods.caiocesarbiomes.block.TreeBlocks;
import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "caiocesarbiomes", bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CinnamonBarkHandler {

    @SubscribeEvent
    public static void onRightClickLog(PlayerInteractEvent.RightClickBlock event) {

        PlayerEntity player = event.getPlayer();
        World world = event.getWorld();
        BlockPos pos = event.getPos();

        ItemStack held = player.getHeldItem(event.getHand());

        // Only axes
        if (!(held.getItem() instanceof AxeItem))
            return;

        BlockState state = world.getBlockState(pos);

        // Check cinnamon log
        if (state.getBlock() != TreeBlocks.CINNAMON_LOG.get())
            return;


        if (!world.isRemote) {

            // Give cinnamon bark
            Block.spawnAsEntity(
                    world,
                    pos,
                    new ItemStack(ModItems.CINNAMON.get())
            );


            // Replace with stripped log
            world.setBlockState(
                    pos,
                    Blocks.STRIPPED_JUNGLE_LOG
                            .getDefaultState()
            );


            // Damage axe
            if (!player.isCreative()) {
                held.damageItem(1, player,
                        p -> p.sendBreakAnimation(event.getHand()));
            }
        }
    }
}
