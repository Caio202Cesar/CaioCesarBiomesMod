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

    @Override
    public void tick() {
        if (!this.world.isRemote) {
            for (int i = 0; i < this.getSizeInventory(); i++) {
                ItemStack stack = this.getStackInSlot(i);

                if (!stack.isEmpty() && stack.getItem() == ModItems.GREEN_MANGO.get()) {
                    if (this.world.rand.nextInt(200) == 0) {
                        ItemStack ripeStack = new ItemStack(ModItems.RIPE_MANGO.get(), stack.getCount());
                        if (stack.hasTag()) {
                            ripeStack.setTag(stack.getTag().copy());
                        }

                        this.setInventorySlotContents(i, ripeStack);
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
