package com.caiocesarmods.caiocesarbiomes.tags;

import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class ModItemTags {
    public static final ITag.INamedTag<Item> MILKY_SAP =
            ItemTags.makeWrapperTag(String.valueOf(new ResourceLocation("caiocesarbiomes", "milky_sap")));
}
