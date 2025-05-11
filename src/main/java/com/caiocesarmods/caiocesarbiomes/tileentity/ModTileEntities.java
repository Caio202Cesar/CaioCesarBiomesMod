package com.caiocesarmods.caiocesarbiomes.tileentity;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.block.MiscBlocks;
import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntities {
    public static DeferredRegister<TileEntityType<?>> TILE_ENTITIES =
            DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, CaioCesarBiomesMod.MOD_ID);

    public static RegistryObject<TileEntityType<ToasterTile>> TOASTER_TILE =
            TILE_ENTITIES.register("toaster_tile", () -> TileEntityType.Builder.create(
                    ToasterTile::new, MiscBlocks.TOASTER.get()).build(null));

    public static RegistryObject<TileEntityType<ButterMixerTile>> BUTTER_MIXER_TILE =
            TILE_ENTITIES.register("butter_mixer_tile", () -> TileEntityType.Builder.create(
                    ButterMixerTile::new, MiscBlocks.BUTTER_MIXER.get()).build(null));


    public static void register(IEventBus eventBus) {
        TILE_ENTITIES.register(eventBus);
    }
}

