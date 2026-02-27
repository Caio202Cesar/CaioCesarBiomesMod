package com.caiocesarmods.caiocesarbiomes.client.renderer.entity;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.client.model.MerchantVillagerModel;
import com.caiocesarmods.caiocesarbiomes.entity.custom.MerchantEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.VillagerModel;
import net.minecraft.util.ResourceLocation;

public class MerchantVillagerRenderer extends MobRenderer<MerchantEntity, VillagerModel<MerchantEntity>> {

    private static final ResourceLocation TEXTURE =
            new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "textures/entity/merchant.png");

    public MerchantVillagerRenderer(EntityRendererManager renderManager) {
        super(renderManager, new MerchantVillagerModel(0.0F), 0.5F);
    }

    @Override
    public ResourceLocation getEntityTexture(MerchantEntity entity) {
        return TEXTURE;
    }
}
