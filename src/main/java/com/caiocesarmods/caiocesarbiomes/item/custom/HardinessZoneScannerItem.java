package com.caiocesarmods.caiocesarbiomes.item.custom;

import com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate.SummerHeat;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate.SummerHeatRegistry;
import com.caiocesarmods.caiocesarbiomes.World.worldgen.Climate.HardinessZones;
import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.VineBlock;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

import javax.annotation.Nullable;
import java.util.List;

public class HardinessZoneScannerItem extends Item {
    public HardinessZoneScannerItem(Properties props) {
        super(props);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add(new TranslationTextComponent("tooltip.caiocesarbiomes.hardiness_scanner").mergeStyle(TextFormatting.GOLD));

    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getHeldItem(hand);

        if (!world.isRemote) {

            // Raytrace (what player is looking at)
            RayTraceResult result = player.pick(5.0D, 0.0F, false);

            if (result.getType() == RayTraceResult.Type.BLOCK) {

                BlockRayTraceResult blockHit = (BlockRayTraceResult) result;
                BlockPos pos = blockHit.getPos();
                BlockState state = world.getBlockState(pos);

                // Check if it's a plant type
                if (state.getBlock() instanceof SaplingBlock ||
                        state.getBlock() instanceof VineBlock) {

                    ResourceLocation id = state.getBlock().getRegistryName();

                    if (id != null) {
                        String zone = HardinessZones.getZoneForSapling(id);

                        player.sendMessage(
                                new StringTextComponent("§aScanned Plant Zone: §e" + zone),
                                player.getUniqueID()
                        );
                    }

                    return ActionResult.resultSuccess(stack);
                }
            }

            // If NOT looking at a valid plant → show biome info instead
            BlockPos pos = player.getPosition();
            Biome biome = world.getBiome(pos);

            int zone = HardinessZones.getZone(world, pos);
            SummerHeat summerHeat = SummerHeatRegistry.get(world, pos);
            float baseTemp = biome.getTemperature(pos);
            float downfall = biome.getDownfall();

            player.sendMessage(
                    new StringTextComponent(
                            "§aCold Hardiness Zone: §e" + zone +
                                    "\n§aSummer heat: §e" + summerHeat.name() +
                                    "\n§aBiome: §e" + biome.getRegistryName() +
                                    "\n§aBase temperature: §e" + String.format("%.2f", baseTemp) +
                                    "\n§aDownfall: §e" + String.format("%.2f", downfall)
                    ),
                    player.getUniqueID()
            );
        }

        return ActionResult.resultSuccess(stack);
    }
}

