package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.features;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTreeDecorators {
    public static final DeferredRegister<TreeDecoratorType<?>> TREE_DECORATORS =
            DeferredRegister.create(ForgeRegistries.TREE_DECORATOR_TYPES, CaioCesarBiomesMod.MOD_ID);

    public static final RegistryObject<TreeDecoratorType<FicusRootsDecorator>> FICUS_HANGING_ROOTS =
            TREE_DECORATORS.register("ficus_hanging_roots",
                    () -> new TreeDecoratorType<>(FicusRootsDecorator.CODEC));

    public static final RegistryObject<TreeDecoratorType<SpanishMossLeavesDecorator>> SPANISH_MOSS_DECORATOR =
            TREE_DECORATORS.register("spanish_moss_decorator",
                    () -> new TreeDecoratorType<>(SpanishMossLeavesDecorator.CODEC));

    public static void register(IEventBus eventBus) {
        TREE_DECORATORS.register(eventBus);
    }
}


