package com.caiocesarmods.caiocesarbiomes.block;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.block.custom.TallPlants.*;
import com.caiocesarmods.caiocesarbiomes.block.custom.Vines.*;
import com.caiocesarmods.caiocesarbiomes.block.custom.crops.BlackCurrantCropBlock;
import com.caiocesarmods.caiocesarbiomes.block.custom.crops.FennelCropBlock;
import com.caiocesarmods.caiocesarbiomes.block.custom.crops.RedCurrantCropBlock;
import com.caiocesarmods.caiocesarbiomes.block.custom.plants.*;
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
            CropPlants::new);
    public static final RegistryObject<Block> BLACK_CURRANT_SHRUB = registerBlock("black_currant_shrub",
            CropPlants::new);

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

    public static final RegistryObject<Block> DRY_STEPPE_GRASS = registerBlock("dry_steppe_grass",
            ModGrasses::new);

    public static final RegistryObject<Block> SAW_PALMETTO = registerBlock("saw_palmetto",
            () -> new PlantFanBlock(AbstractBlock.Properties.create(Material.PLANTS, MaterialColor.GREEN)
                    .setRequiresTool().doesNotBlockMovement().zeroHardnessAndResistance()));

    public static final RegistryObject<Block> INKBERRY_BUSH = registerBlock("inkberry_bush",
            InkberryBush::new);
    public static final RegistryObject<Block> INKBERRY_FRUITING_BUSH = registerBlock("inkberry_fruiting_bush",
            InkberryFruitingBush::new);

    public static final RegistryObject<Block> CLOUDBERRY_PLANT = registerBlock("cloudberry_plant",
            CloudberryPlant::new);
    public static final RegistryObject<Block> CLOUDBERRY_FLOWERING_PLANT = registerBlock("cloudberry_flowering_plant",
            CloudberryFloweringPlant::new);
    public static final RegistryObject<Block> CLOUDBERRY_FRUITING_PLANT = registerBlock("cloudberry_fruiting_plant",
            CloudberryFruitingPlant::new);

    public static final RegistryObject<Block> BUNCHBERRY_PLANT = registerBlock("bunchberry_plant",
            BunchberryPlant::new);
    public static final RegistryObject<Block> BUNCHBERRY_FLOWERING_PLANT = registerBlock("bunchberry_flowering_plant",
            BunchberryFloweringPlant::new);
    public static final RegistryObject<Block> BUNCHBERRY_FRUITING_PLANT = registerBlock("bunchberry_fruiting_plant",
            BunchberryFruitingPlant::new);

    public static final RegistryObject<Block> EDELWEISS = registerBlock("edelweiss",
            ModGrasses::new);
    public static final RegistryObject<Block> LUPINUS = registerBlock("lupinus",
            ModGrasses::new);
    public static final RegistryObject<Block> CLUBMOSS = registerBlock("clubmoss",
            ModGrasses::new);

    public static final RegistryObject<Block> HYACINTH = registerBlock("hyacinth",
            ModGrasses::new);
    public static final RegistryObject<Block> DAFFODIL_YELLOW = registerBlock("daffodil_yellow",
            ModGrasses::new);
    public static final RegistryObject<Block> DAFFODIL_WHITE = registerBlock("daffodil_white",
            ModGrasses::new);

    public static final RegistryObject<Block> STUART_DESERT_PEA = registerBlock("stuart_desert_pea",
            ModDesertPlant::new);

    public static final RegistryObject<Block> BARREL_CACTUS = registerBlock("barrel_cactus",
            ModCactuses::new);

    /*public static final RegistryObject<Block> RASPBERRY_BUSH = registerBlock("raspberry_bush",
            () -> new RaspberryBushBlock(AbstractBlock.Properties.create(Material.PLANTS).
                    tickRandomly().doesNotBlockMovement().sound(SoundType.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> RASPBERRY_FRUITING_BUSH = registerBlock("raspberry_fruiting_bush",
            () -> new RaspberryFruitingBushBlock(AbstractBlock.Properties.create(Material.PLANTS).
                    tickRandomly().doesNotBlockMovement().sound(SoundType.SWEET_BERRY_BUSH)));

                    */

    public static final RegistryObject<Block> CREOSOTE_BUSH = registerBlock("creosote_bush",
            DesertTallPlant::new);
    public static final RegistryObject<Block> CREOSOTE_FLOWERING_BUSH = registerBlock("creosote_flowering_bush",
            DesertTallPlant::new);

    public static final RegistryObject<Block> PALM_LILY = registerBlock("palm_lily",
            ModTallPlant::new);

    public static final RegistryObject<Block> PENCIL_TREE = registerBlock("pencil_tree",
            DesertRosePlant::new);

    //Savannah Plants
    public static final RegistryObject<Block> ALOE_VERA = registerBlock("aloe_vera",
            ModTallPlant::new);
    public static final RegistryObject<Block> CALABASH_VINE = registerBlock("calabash_vine",
            CropPlants::new);
    public static final RegistryObject<Block> SNAKE_PLANT = registerBlock("snake_plant",
            ModGrasses::new);
    @SuppressWarnings("deprecation")
    public static final RegistryObject<Block> POTTED_SNAKE_PLANT = BLOCKS.register("potted_snake_plant",
            () -> new FlowerPotBlock(ModPlants.SNAKE_PLANT.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                    .zeroHardnessAndResistance().notSolid()));

    //Jungle
    public static final RegistryObject<Block> CANNA_LILY_RED = registerBlock("canna_lily_red",
            ModTallPlant::new);
    public static final RegistryObject<Block> CANNA_LILY_PURPLE_RED = registerBlock("canna_lily_purple_red",
            ModTallPlant::new);
    public static final RegistryObject<Block> CANNA_LILY_YELLOW = registerBlock("canna_lily_yellow",
            ModTallPlant::new);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.PLANTS)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}



