package com.caiocesarmods.caiocesarbiomes.item.custom;

import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import javax.annotation.Nullable;
import java.util.List;

public class MarulaItem extends Item {
    public MarulaItem(Properties properties) {
        super(properties);
    }

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        PlayerEntity player = event.player;

        if (!player.world.isRemote && event.phase == TickEvent.Phase.END) {
            for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
                ItemStack stack = player.inventory.getStackInSlot(i);

                if (!stack.isEmpty() && stack.getItem() == ModItems.MARULA.get()) {
                    if (player.getRNG().nextInt(100) == 70) { // ~30 in 100 chance per tick
                        ItemStack ripeStack = new ItemStack(ModItems.RIPE_MARULA.get(), stack.getCount());
                        if (stack.hasTag()) {
                            ripeStack.setTag(stack.getTag().copy());
                        }

                        player.inventory.setInventorySlotContents(i, ripeStack);
                    }
                }
            }
        }
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add(new StringTextComponent("Eat before it ferments and you won't get sick.").mergeStyle(TextFormatting.GRAY));
        tooltip.add(new TranslationTextComponent("tooltip.caiocesarbiomes.marula").mergeStyle(TextFormatting.GOLD));

    }
}
