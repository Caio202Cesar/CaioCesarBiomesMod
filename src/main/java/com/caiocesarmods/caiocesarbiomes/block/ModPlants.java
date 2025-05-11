package com.caiocesarmods.caiocesarbiomes.block;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.block.custom.Saplings.*;
import com.caiocesarmods.caiocesarbiomes.block.custom.*;
import com.caiocesarmods.caiocesarbiomes.block.custom.crops.BlackCurrantCropBlock;
import com.caiocesarmods.caiocesarbiomes.block.custom.crops.FennelCropBlock;
import com.caiocesarmods.caiocesarbiomes.block.custom.crops.RedCurrantCropBlock;
import com.caiocesarmods.caiocesarbiomes.block.custom.tree.DatePalmTree;
import com.caiocesarmods.caiocesarbiomes.item.ModItemGroup;
import com.caiocesarmods.caiocesarbiomes.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModPlants {
    public static List<Block> blocksList = new ArrayList<>();

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, CaioCesarBiomesMod.MOD_ID);

    //Tall Plants
    public static final RegistryObject<Block> DESERT_ROSE_PLANT = registerBlock("desert_rose_plant",
            DesertRosePlant::new);
    public static final RegistryObject<Block> GARDENIA_BUSH = registerBlock("gardenia_bush",
            ModTallPlant::new);
    public static final RegistryObject<Block> CHINESE_HIBISCUS = registerBlock("chinese_hibiscus",
            ModTallPlant::new);
    public static final RegistryObject<Block> BAY_LAUREL = registerBlock("bay_laurel",
            ModTallPlant::new);
    public static final RegistryObject<Block> BAY_LAUREL_FLOWERING = registerBlock("bay_laurel_flowering",
            ModTallPlant::new);
    public static final RegistryObject<Block> SPIDER_LILY = registerBlock("spider_lily",
            ModTallPlant::new);
    public static final RegistryObject<Block> BLUEBERRY_BUSH = registerBlock("blueberry_bush",
            BlueberryBush::new);
    public static final RegistryObject<Block> BLUEBERRY_FLOWERING_BUSH = registerBlock("blueberry_flowering_bush",
            BlueberryFloweringBush::new);
    public static final RegistryObject<Block> BLUEBERRY_FRUITING_BUSH = registerBlock("blueberry_fruiting_bush",
            BlueberryFruitingBush::new);
    public static final RegistryObject<Block> MANZANITA_BUSH = registerBlock("manzanita_bush",
            ModTallPlant::new); //Badlands biomes

    //Vines
    public static final RegistryObject<Block> CREEPING_FIG_VINE = registerBlock("creeping_fig_vine",
            CreepingFigVine::new);
    public static final RegistryObject<Block> CREEPING_FIG_FRUITING_VINE = registerBlock("creeping_fig_fruiting_vine",
            CreepingFigFruitingVine::new);
    public static final RegistryObject<Block> CREEPING_FIG_RIPE_FRUITING_VINE = registerBlock("creeping_fig_ripe_fruiting_vine",
            CreepingFigRipeFruitingVine::new);

    public static final RegistryObject<Block> SPANISH_MOSS = registerBlock("spanish_moss",
            SpanishMoss::new);

    public static final RegistryObject<Block> IVY = registerBlock("ivy",
            IvyVine::new);

    public static final RegistryObject<Block> KIWI_VINE = registerBlock("kiwi_vine",
            KiwiVine::new);
    public static final RegistryObject<Block> KIWI_FLOWERING_VINE = registerBlock("kiwi_flowering_vine",
            KiwiFloweringVine::new);
    public static final RegistryObject<Block> KIWI_FRUITING_VINE = registerBlock("kiwi_fruiting_vine",
            KiwiFruitingVine::new);

    public static final RegistryObject<Block> PEPPERCORN_VINE = registerBlock("peppercorn_vine",
            PeppercornVine::new);
    public static final RegistryObject<Block> PEPPERCORN_FRUITING_VINE = registerBlock("peppercorn_fruiting_vine",
            PeppercornFruitingVine::new);
    public static final RegistryObject<Block> PEPPERCORN_RIPE_FRUITING_VINE = registerBlock("peppercorn_ripe_fruiting_vine",
            PeppercornRipeFruitingVine::new);

    public static final RegistryObject<Block> FICUS_ROOTS_PLANT = registerBlock("ficus_roots_plant",
            () -> new FicusRootsPlantBlock(AbstractBlock.Properties.create(Material.PLANTS, MaterialColor.BROWN).tickRandomly().
                    doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.VINE)));
    public static final RegistryObject<Block> SOCOTRA_CUCUMBER_LEAVES_VINE = registerBlock("socotra_cucumber_leaves_vine",
            () -> new SocotraCucumberLeavesVineBlock(AbstractBlock.Properties.create(Material.PLANTS, MaterialColor.GREEN_TERRACOTTA).tickRandomly().
                    doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.VINE)));

    //Crops
    public static final  RegistryObject<Block> RED_CURRANT_CROP = BLOCKS.register("red_currant_crop",
            () -> new RedCurrantCropBlock(AbstractBlock.Properties.from(Blocks.WHEAT).sound(SoundType.CROP)));
    public static final  RegistryObject<Block> BLACK_CURRANT_CROP = BLOCKS.register("black_currant_crop",
            () -> new BlackCurrantCropBlock(AbstractBlock.Properties.from(Blocks.WHEAT).sound(SoundType.CROP)));
    public static final  RegistryObject<Block> FENNEL_CROP = BLOCKS.register("fennel_crop",
            () -> new FennelCropBlock(AbstractBlock.Properties.from(Blocks.WHEAT).sound(SoundType.CROP)));

    //Plants
    public static final RegistryObject<Block> BUSH = registerBlock("bush",
            SubtropicalForestPlant::new);
    public static final RegistryObject<Block> ANIS = registerBlock("anis",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> BASIL = registerBlock("basil",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> PURPLE_BASIL = registerBlock("purple_basil",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> CINERARIA = registerBlock("cineraria",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> FENNEL = registerBlock("fennel",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> LAVENDER = registerBlock("lavender",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> MARJORAN = registerBlock("marjoran",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> OREGANO = registerBlock("oregano",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> ROSEMARY = registerBlock("rosemary",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> SAGE = registerBlock("sage",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> SANTOLINA = registerBlock("santolina",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> THYME = registerBlock("thyme",
            MediterraneanFlower::new);
    public static final RegistryObject<Block> AGAPANTHUS_PURPLE = registerBlock("agapanthus_purple",
            SubtropicalForestPlant::new);
    public static final RegistryObject<Block> AGAPANTHUS_WHITE = registerBlock("agapanthus_white",
            SubtropicalForestPlant::new);
    public static final RegistryObject<Block> TUSSOCK_GRASS = registerBlock("tussock_grass",
            ModGrasses::new);
    public static final RegistryObject<Block> WHITE_CISTUS = registerBlock("white_cistus",
            MediterraneanFlower::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_WHITE_CISTUS = BLOCKS.register("potted_white_cistus",
            () -> new FlowerPotBlock(ModPlants.WHITE_CISTUS.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> PINK_CISTUS = registerBlock("pink_cistus",
            MediterraneanFlower::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_PINK_CISTUS = BLOCKS.register("potted_pink_cistus",
            () -> new FlowerPotBlock(ModPlants.PINK_CISTUS.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> RED_CURRANT_SHRUB = registerBlock("red_currant_shrub",
            RibesShrub::new);
    public static final RegistryObject<Block> BLACK_CURRANT_SHRUB = registerBlock("black_currant_shrub",
            RibesShrub::new);

    public static final RegistryObject<Block> AZALEA_PURPLE = registerBlock("azalea_purple",
            AzaleaPlant::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_AZALEA_PURPLE = BLOCKS.register("potted_azalea_purple",
            () -> new FlowerPotBlock(ModPlants.AZALEA_PURPLE.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> AZALEA_RED = registerBlock("azalea_red",
            AzaleaPlant::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_AZALEA_RED = BLOCKS.register("potted_azalea_red",
            () -> new FlowerPotBlock(ModPlants.AZALEA_RED.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> AZALEA_PINK = registerBlock("azalea_pink",
            AzaleaPlant::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_AZALEA_PINK = BLOCKS.register("potted_azalea_pink",
            () -> new FlowerPotBlock(ModPlants.AZALEA_PINK.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> AZALEA_ORANGE = registerBlock("azalea_orange",
            AzaleaPlant::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_AZALEA_ORANGE = BLOCKS.register("potted_azalea_orange",
            () -> new FlowerPotBlock(ModPlants.AZALEA_ORANGE.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> AZALEA_MAGENTA = registerBlock("azalea_magenta",
            AzaleaPlant::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_AZALEA_MAGENTA = BLOCKS.register("potted_azalea_magenta",
            () -> new FlowerPotBlock(ModPlants.AZALEA_MAGENTA.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> AZALEA_GREEN = registerBlock("azalea_green",
            AzaleaPlant::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_AZALEA_GREEN = BLOCKS.register("potted_azalea_green",
            () -> new FlowerPotBlock(ModPlants.AZALEA_GREEN.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    public static final RegistryObject<Block> AZALEA_WHITE = registerBlock("azalea_white",
            AzaleaPlant::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_AZALEA_WHITE = BLOCKS.register("potted_azalea_white",
            () -> new FlowerPotBlock(ModPlants.AZALEA_WHITE.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));


    public static final RegistryObject<Block> SAW_PALMETTO = registerBlock("saw_palmetto",
            () -> new PlantFanBlock(AbstractBlock.Properties.create(Material.PLANTS, MaterialColor.GREEN)
                    .setRequiresTool().doesNotBlockMovement().zeroHardnessAndResistance()));


    //Culinary
    public static final RegistryObject<Block> SALT_BLOCK = registerBlock("salt_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.SNOW).
                    setRequiresTool().hardnessAndResistance(1.0F, 3.0F)));

    public static final RegistryObject<Block> TOASTER = registerBlock("toaster",
            () -> new ToasterBlock(AbstractBlock.Properties.create(Material.ANVIL).notSolid()));

    public static final RegistryObject<Block> BUTTER_MIXER = registerBlock("butter_mixer",
            () -> new ButterMixerBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).
                    setRequiresTool().hardnessAndResistance(1.0F, 3.0F)));


    //Planks
    public static final RegistryObject<Block> AVOCADO_PLANKS = registerBlock("avocado_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> COAST_COTTONWOOD_PLANKS = registerBlock("coast_cottonwood_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> FIG_PLANKS = registerBlock("fig_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> ITALIAN_CYPRESS_PLANKS = registerBlock("italian_cypress_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> LIVE_OAK_PLANKS = registerBlock("live_oak_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> MESQUITE_PLANKS = registerBlock("mesquite_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> MYRTLE_PLANKS = registerBlock("myrtle_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> OCOTEA_PLANKS = registerBlock("ocotea_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> OLEANDER_PLANKS = registerBlock("oleander_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> POMEGRANATE_PLANKS = registerBlock("pomegranate_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> SOUTHERN_MAGNOLIA_PLANKS = registerBlock("southern_magnolia_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> TROPICAL_ALMOND_PLANKS = registerBlock("tropical_almond_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> HOLM_OAK_PLANKS = registerBlock("holm_oak_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> CORK_OAK_PLANKS = registerBlock("cork_oak_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> PINE_PLANKS = registerBlock("stone_pine_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> OLIVE_PLANKS = registerBlock("olive_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> ERYTHRINA_PLANKS = registerBlock("erythrina_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> CRABAPPLE_PLANKS = registerBlock("crabapple_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> LOQUAT_PLANKS = registerBlock("loquat_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> ELDERBERRY_PLANKS = registerBlock("elderberry_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> STRAWBERRY_TREE_PLANKS = registerBlock("strawberry_tree_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> JAPANESE_MAPLE_PLANKS = registerBlock("japanese_maple_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> MULBERRY_PLANKS = registerBlock("mulberry_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> STARFRUIT_PLANKS = registerBlock("starfruit_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> ROYAL_POINCIANA_PLANKS = registerBlock("royal_poinciana_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> EUCALYPTUS_PLANKS = registerBlock("eucalyptus_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> PLUM_PLANKS = registerBlock("plum_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> TAMARIND_PLANKS = registerBlock("tamarind_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> POHUTUKAWA_PLANKS = registerBlock("pohutukawa_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> CAMELLIA_PLANKS = registerBlock("camellia_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> CASUARINA_PLANKS = registerBlock("casuarina_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> NOTHOFAGUS_PLANKS = registerBlock("nothofagus_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> ARAUCARIA_PLANKS = registerBlock("araucaria_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> CITRUS_PLANKS = registerBlock("citrus_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> BLACK_POPLAR_PLANKS = registerBlock("black_poplar_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> BEECH_PLANKS = registerBlock("beech_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> WESTERN_HEMLOCK_PLANKS = registerBlock("western_hemlock_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> YEW_PLANKS = registerBlock("yew_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> ILEX_PLANKS = registerBlock("ilex_planks",
            ModPlanks::new);
    public static final RegistryObject<Block> SWEET_CHESTNUT_PLANKS = registerBlock("sweet_chestnut_planks",
            ModLogs::new);


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



