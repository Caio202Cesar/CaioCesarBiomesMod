package com.caiocesarmods.caiocesarbiomes.client.renderer.entity;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.client.model.MediterraneanMerchantModel;
import com.caiocesarmods.caiocesarbiomes.entity.custom.MediterraneanMerchantEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.VillagerModel;
import net.minecraft.util.ResourceLocation;

public class MediterraneanMerchantRenderer extends MobRenderer<MediterraneanMerchantEntity, VillagerModel<MediterraneanMerchantEntity>> {

    private static final ResourceLocation TEXTURE =
            new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "textures/entity/mediterranean_merchant.png");

    public MediterraneanMerchantRenderer(EntityRendererManager renderManager) {
        super(renderManager, new MediterraneanMerchantModel(0.0F), 0.5F);
    }

    @Override
    public ResourceLocation getEntityTexture(MediterraneanMerchantEntity entity) {
        return TEXTURE;
    }
}
