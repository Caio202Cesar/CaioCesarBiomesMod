package com.caiocesarmods.caiocesarbiomes.item.custom;

import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class MarulaItem extends Item {
    public MarulaItem(Properties properties) {
        super(properties);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isRemote && world.rand.nextFloat() < 0.01f) {
            entity.replaceItemInInventory(slot, new ItemStack(ModItems.RIPE_MARULA.get()));
        }
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add(new StringTextComponent("Eat before it ferments and you won't get sick.").mergeStyle(TextFormatting.GRAY));
        tooltip.add(new TranslationTextComponent("tooltip.caiocesarbiomes.marula").mergeStyle(TextFormatting.GOLD));

    }
}
