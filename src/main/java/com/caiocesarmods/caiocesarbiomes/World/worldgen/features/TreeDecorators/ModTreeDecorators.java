package com.caiocesarmods.caiocesarbiomes.World.worldgen.features.TreeDecorators;

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

    public static final RegistryObject<TreeDecoratorType<CucumberTreeVinesDecorator>> CUCUMBER_TREE_VINE =
            TREE_DECORATORS.register("cucumber_tree_vine",
                    () -> new TreeDecoratorType<>(CucumberTreeVinesDecorator.CODEC));

    public static final RegistryObject<TreeDecoratorType<SpanishMossLeavesDecorator>> SPANISH_MOSS_DECORATOR =
            TREE_DECORATORS.register("spanish_moss_decorator",
                    () -> new TreeDecoratorType<>(SpanishMossLeavesDecorator.CODEC));

    public static final RegistryObject<TreeDecoratorType<SpanishMossTrunkDecorator>> TRUNK_SPANISH_MOSS_DECORATOR =
            TREE_DECORATORS.register("spanish_moss_trunk_decorator",
                    () -> new TreeDecoratorType<>(SpanishMossTrunkDecorator.CODEC));

    public static final RegistryObject<TreeDecoratorType<CreepingFigLeavesDecorator>> CREEPING_FIG_LEAVES_DECORATOR =
            TREE_DECORATORS.register("creeping_fig_leaves_decorator",
                    () -> new TreeDecoratorType<>(CreepingFigLeavesDecorator.CODEC));

    public static final RegistryObject<TreeDecoratorType<CreepingFigTrunkDecorator>> TRUNK_CREEPING_FIG_DECORATOR =
            TREE_DECORATORS.register("creeping_fig_trunk_decorator",
                    () -> new TreeDecoratorType<>(CreepingFigTrunkDecorator.CODEC));

    public static final RegistryObject<TreeDecoratorType<IvyTrunkDecorator>> TRUNK_IVY_DECORATOR =
            TREE_DECORATORS.register("ivy_trunk_decorator",
                    () -> new TreeDecoratorType<>(IvyTrunkDecorator.CODEC));

    public static final RegistryObject<TreeDecoratorType<KiwiVineTrunkDecorator>> KIWI_VINE_TRUNK_DECORATOR =
            TREE_DECORATORS.register("kiwi_vine_trunk_decorator",
                    () -> new TreeDecoratorType<>(KiwiVineTrunkDecorator.CODEC));

    public static final RegistryObject<TreeDecoratorType<PeppercornVineTrunkDecorator>> PEPPERCORN_VINE_TRUNK_DECORATOR =
            TREE_DECORATORS.register("peppercorn_vine_trunk_decorator",
                    () -> new TreeDecoratorType<>(PeppercornVineTrunkDecorator.CODEC));

    public static void register(IEventBus eventBus) {
        TREE_DECORATORS.register(eventBus);
    }
}


