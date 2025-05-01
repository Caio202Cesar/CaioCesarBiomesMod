package com.caiocesarmods.caiocesarbiomes.container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.items.IItemHandler;

import javax.annotation.Nullable;
import javax.swing.plaf.basic.BasicComboBoxUI;

public class ToasterContainer extends Container {
    private final TileEntity tileEntity;
    private final PlayerEntity playerEntity;
    private final IItemHandler playerIventory;

    public ToasterContainer(int windowId, World world, BlockPos pos, PlayerInventory playerInventory,
                            PlayerEntity player) {

        super(type, windowId);
        this.tileEntity = world.getTileEntity(pos);
    }

    /**
     * Determines whether supplied player can use this container
     *
     * @param playerIn
     */
    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {

    }
}
