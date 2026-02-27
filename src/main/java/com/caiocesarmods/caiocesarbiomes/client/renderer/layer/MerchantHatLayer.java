package com.caiocesarmods.caiocesarbiomes.client.renderer.layer;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.entity.custom.MerchantEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.VillagerModel;
import net.minecraft.util.ResourceLocation;

public class MerchantHatLayer extends LayerRenderer<MerchantEntity, VillagerModel<MerchantEntity>> {

    private static final ResourceLocation HAT_TEXTURE =
            new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "textures/entity/merchant_hat.png");

    public MerchantHatLayer(MobRenderer<MerchantEntity, VillagerModel<MerchantEntity>> renderer) {
        super(renderer);
    }

    @Override
    public void render(MatrixStack matrixStack,
                       IRenderTypeBuffer buffer,
                       int packedLight,
                       MerchantEntity entity,
                       float limbSwing,
                       float limbSwingAmount,
                       float partialTicks,
                       float ageInTicks,
                       float netHeadYaw,
                       float headPitch) {

        IVertexBuilder vertexBuilder = buffer.getBuffer(RenderType.getEntityCutoutNoCull(HAT_TEXTURE));

        this.getEntityModel().render(
                matrixStack,
                vertexBuilder,
                packedLight,
                net.minecraft.client.renderer.texture.OverlayTexture.NO_OVERLAY,
                1.0F, 1.0F, 1.0F, 1.0F
        );
    }
}
