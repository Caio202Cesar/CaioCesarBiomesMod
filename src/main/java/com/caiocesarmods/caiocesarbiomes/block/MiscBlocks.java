package com.caiocesarmods.caiocesarbiomes.block;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.block.custom.ButterMixerBlock;
import com.caiocesarmods.caiocesarbiomes.block.custom.ToasterBlock;
import com.caiocesarmods.caiocesarbiomes.item.ModItemGroup;
import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class MiscBlocks {
    public static List<Block> blocksList = new ArrayList<>();

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, CaioCesarBiomesMod.MOD_ID);

    //Culinary
    public static final RegistryObject<Block> SALT_BLOCK = registerBlock("salt_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.SNOW).
                    setRequiresTool().hardnessAndResistance(0.4F).sound(SoundType.NETHERRACK)));

    public static final RegistryObject<Block> TOASTER = registerBlock("toaster",
            () -> new ToasterBlock(AbstractBlock.Properties.create(Material.ANVIL).notSolid()));

    public static final RegistryObject<Block> BUTTER_MIXER = registerBlock("butter_mixer",
            () -> new ButterMixerBlock(AbstractBlock.Properties.create(Material.WOOD)
                    .hardnessAndResistance(1.0F, 3.0F).notSolid()));

    public static final RegistryObject<Block> SULPHUR_ORE = registerBlock("sulphur_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));

    public static final RegistryObject<Block> SULPHUR_NETHER_ORE = registerBlock("sulphur_nether_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));

    public static final RegistryObject<Block> SALTPETER_ORE = registerBlock("saltpeter_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));

    //Bog biome
    /*public static final RegistryObject<Block> PEAT_BLOCK = registerBlock("peat_block",
            () -> new Block(AbstractBlock.Properties.create(Material.CLAY).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));*/


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.CCB_GROUP)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

