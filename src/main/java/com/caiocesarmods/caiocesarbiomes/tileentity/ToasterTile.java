package com.caiocesarmods.caiocesarbiomes.tileentity;

import com.caiocesarmods.caiocesarbiomes.data.recipes.ModRecipeTypes;
import com.caiocesarmods.caiocesarbiomes.data.recipes.ToastRecipe;
import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import java.util.Optional;

import static java.beans.XMLDecoder.createHandler;

public class ToasterTile extends TileEntity implements ITickableTileEntity {

    private final ItemStackHandler itemHandler = createHandler();
    private final LazyOptional<IItemHandler> handler = LazyOptional.of(() -> itemHandler);

    public ToasterTile(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    public ToasterTile() {
        this(ModTileEntities.TOASTER_TILE.get());
    }

    @Override
    public void read(BlockState state, CompoundNBT nbt) {
        itemHandler.deserializeNBT(nbt.getCompound("inv"));
        super.read(state, nbt);
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        compound.put("inv", itemHandler.serializeNBT());
        return super.write(compound);
    }

    private ItemStackHandler createHandler() {
        return new ItemStackHandler(2) {
            @Override
            protected void onContentsChanged(int slot) {
                markDirty();
            }

            @Override
            public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
                return slot == 0 && stack.getItem() == Items.BREAD;
            }

            @Override
            public int getSlotLimit(int slot) {
                return 2;
            }

            @Nonnull
            @Override
            public ItemStack insertItem(int slot, @Nonnull ItemStack stack, boolean simulate) {
                if (isItemValid(slot, stack)) {
                    return super.insertItem(slot, stack, simulate); // this allows the item to be inserted
                }
                return stack; // if invalid, do not insert
            }
        };
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if(cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return handler.cast();
        }

        return super.getCapability(cap, side);
    }

    public void hasRedstoneSignal() {
        boolean hasFocusOnTheFirstSlot = this.itemHandler.getStackInSlot(0).getCount() > 0
                && this.itemHandler.getStackInSlot(0).getItem() == Items.BREAD;

        if(hasFocusOnTheFirstSlot) {
            this.itemHandler.getStackInSlot(0).shrink(1);

            this.itemHandler.insertItem(1, new ItemStack(ModItems.TOAST.get()), false);
        }
    }

    private void spawnSmokeParticles() {
        if (!world.isRemote()) return; // Only spawn particles on client side

        for (int i = 0; i < 5; i++) {
            double x = pos.getX() + 0.5 + (world.rand.nextDouble() - 0.5);
            double y = pos.getY() + 1.0;
            double z = pos.getZ() + 0.5 + (world.rand.nextDouble() - 0.5);
            world.addParticle(ParticleTypes.SMOKE, x, y, z, 0.0, 0.05, 0.0);
        }
    }

    public void craft() {
        Inventory inv = new Inventory(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inv.setInventorySlotContents(i, itemHandler.getStackInSlot(i));
        }

        Optional<ToastRecipe> recipe = world.getRecipeManager()
                .getRecipe(ModRecipeTypes.TOAST_RECIPE, inv, world);

        recipe.ifPresent(iRecipe -> {
            ItemStack output = iRecipe.getRecipeOutput();

            if (world.isBlockPowered(pos)) {
                craftTheItem(output); // your logic to insert the output and consume input
            }

            markDirty();
        });
    }

    private void craftTheItem(ItemStack output) {
        itemHandler.extractItem(0, 1, false);
        itemHandler.extractItem(1, 1, false);
        itemHandler.insertItem(1, output, false);
    }

    @Override
    public void tick() {
        if (world == null || world.isRemote) return;

        if (world.isBlockPowered(pos)) {
            craft(); // Call your crafting logic
        }
    }
}
