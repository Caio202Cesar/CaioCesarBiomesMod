package com.caiocesarmods.caiocesarbiomes.item.custom;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate.SummerHeat;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate.SummerHeatRegistry;
import com.caiocesarmods.caiocesarbiomes.World.HardinessZones;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

import javax.annotation.Nullable;
import java.util.List;

public class HardinessZoneScannerItem extends Item {
    public HardinessZoneScannerItem(Properties props) {
        super(props);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add(new TranslationTextComponent("tooltip.caiocesarbiomes.hardiness_scanner").mergeStyle(TextFormatting.GOLD));

    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {

        if (!world.isRemote) {
            BlockPos pos = player.getPosition();
            Biome biome = world.getBiome(pos);

            int zone = HardinessZones.getZone(world, pos);
            SummerHeat summerHeat = SummerHeatRegistry.get(world, pos);
            float baseTemp = biome.getTemperature(pos);
            float downfall = biome.getDownfall();

            player.sendMessage(
                    new StringTextComponent(
                            "§aCold Hardiness Zone: §e" + zone +
                                    "\n§aSummer heat: §e" + summerHeat.name() +
                                    "\n§aBiome: §e" + biome.getRegistryName() +
                                    "\n§aBase temperature: §e" + String.format("%.2f", baseTemp) +
                                    "\n§aDownfall: §e" + String.format("%.2f", downfall)

                    ),
                    player.getUniqueID()
            );
        }

        return ActionResult.resultSuccess(player.getHeldItem(hand));
    }
}

