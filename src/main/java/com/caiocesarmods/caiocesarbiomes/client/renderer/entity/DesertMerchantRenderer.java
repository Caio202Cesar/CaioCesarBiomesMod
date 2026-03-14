package com.caiocesarmods.caiocesarbiomes.client.renderer.entity;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.client.model.DesertMerchantModel;
import com.caiocesarmods.caiocesarbiomes.client.model.MediterraneanMerchantModel;
import com.caiocesarmods.caiocesarbiomes.entity.custom.DesertMerchantEntity;
import com.caiocesarmods.caiocesarbiomes.entity.custom.MediterraneanMerchantEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.VillagerModel;
import net.minecraft.util.ResourceLocation;

public class DesertMerchantRenderer extends MobRenderer<DesertMerchantEntity, VillagerModel<DesertMerchantEntity>> {

    private static final ResourceLocation TEXTURE =
            new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "textures/entity/desert_merchant.png");

    public DesertMerchantRenderer(EntityRendererManager renderManager) {
        super(renderManager, new DesertMerchantModel(0.0F), 0.5F);
    }

    @Override
    public ResourceLocation getEntityTexture(DesertMerchantEntity entity) {
        return TEXTURE;
    }
}
