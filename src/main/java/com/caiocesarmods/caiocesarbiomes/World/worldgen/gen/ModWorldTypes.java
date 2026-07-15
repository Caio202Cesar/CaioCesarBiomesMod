package com.caiocesarmods.caiocesarbiomes.World.worldgen.gen;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Biomes.Util.CustomBiomeProvider;
import net.minecraft.world.gen.DimensionSettings;
import net.minecraft.world.gen.NoiseChunkGenerator;
import net.minecraftforge.common.world.ForgeWorldType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModWorldTypes {
    public static final DeferredRegister<ForgeWorldType> WORLD_TYPES =
            DeferredRegister.create(ForgeRegistries.WORLD_TYPES, CaioCesarBiomesMod.MOD_ID);

    public static final RegistryObject<ForgeWorldType> CAIOCESAR =
            WORLD_TYPES.register("caio_cesar",
                    () -> new ForgeWorldType(
                            (biomeRegistry, settingsRegistry, seed) ->
                                    new NoiseChunkGenerator(
                                            new CustomBiomeProvider(seed),
                                            seed,
                                            () -> settingsRegistry.getOrThrow(DimensionSettings.OVERWORLD)
                                    )
                    ));



}