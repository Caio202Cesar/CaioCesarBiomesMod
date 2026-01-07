package com.caiocesarmods.caiocesarbiomes.item.custom;

import com.caiocesarmods.caiocesarbiomes.World.HardinessZones;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class HardinessZoneScannerItem extends Item {
    public HardinessZoneScannerItem(Properties props) {
        super(props);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {

        if (!world.isRemote) {
            BlockPos pos = player.getPosition();
            Biome biome = world.getBiome(pos);

            int zone = HardinessZones.getZone(world, pos);
            float baseTemp = biome.getTemperature(pos);

            player.sendMessage(
                    new StringTextComponent(
                            "§aHardiness Zone: §e" + zone +
                                    "\n§aBiome: §e" + biome.getRegistryName() +
                                    "\n§aBase temperature: §e" + String.format("%.2f", baseTemp)
                    ),
                    player.getUniqueID()
            );
        }

        return ActionResult.resultSuccess(player.getHeldItem(hand));
    }
}

