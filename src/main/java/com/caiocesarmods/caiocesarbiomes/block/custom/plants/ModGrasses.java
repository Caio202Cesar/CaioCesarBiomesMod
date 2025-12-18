package com.caiocesarmods.caiocesarbiomes.block.custom.plants;

import com.caiocesarmods.caiocesarbiomes.block.ModPlants;
import net.minecraft.block.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.ToolType;

public class ModGrasses extends BushBlock {

    public ModGrasses() {
        super(Block.Properties.from(Blocks.GRASS).tickRandomly().doesNotBlockMovement().notSolid()
                .zeroHardnessAndResistance().sound(SoundType.PLANT).harvestTool(ToolType.HOE));
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        RenderTypeLookup.setRenderLayer(ModPlants.TUSSOCK_GRASS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.DRY_STEPPE_GRASS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.EDELWEISS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.LUPINUS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.CLUBMOSS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.SNAKE_PLANT.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.POTTED_SNAKE_PLANT.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.HYACINTH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.DAFFODIL_WHITE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModPlants.DAFFODIL_YELLOW.get(), RenderType.getCutout());

    }

    public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 80;
    }

    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 60;
    }

    public PlantType getPlantType(IBlockReader world, BlockPos pos) {
        return PlantType.PLAINS;
    }
}
