package com.caiocesarmods.caiocesarbiomes.client.renderer.entity;

import com.caiocesarmods.caiocesarbiomes.CaioCesarBiomesMod;
import com.caiocesarmods.caiocesarbiomes.client.renderer.layer.MerchantHatLayer;
import com.caiocesarmods.caiocesarbiomes.entity.custom.MerchantEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.VillagerModel;
import net.minecraft.util.ResourceLocation;

public class MerchantVillagerRenderer extends MobRenderer<MerchantEntity, VillagerModel<MerchantEntity>> {

    private static final ResourceLocation TEXTURE =
            new ResourceLocation(CaioCesarBiomesMod.MOD_ID, "textures/entity/merchant.png");

    public MerchantVillagerRenderer(EntityRendererManager renderManager) {
        super(renderManager, new VillagerModel<>(0.0F), 0.5F);

        this.addLayer(new MerchantHatLayer(this));

    }

    @Override
    public ResourceLocation getEntityTexture(MerchantEntity entity) {
        return TEXTURE;
    }
}
