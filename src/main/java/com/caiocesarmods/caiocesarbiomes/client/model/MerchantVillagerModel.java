package com.caiocesarmods.caiocesarbiomes.client.model;

import com.caiocesarmods.caiocesarbiomes.entity.custom.MerchantEntity;
import net.minecraft.client.renderer.entity.model.VillagerModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class MerchantVillagerModel extends VillagerModel<MerchantEntity> {

    private final ModelRenderer merchantHat;

    public MerchantVillagerModel(float scale) {
        super(scale);

        // Create hat
        this.merchantHat = new ModelRenderer(this);

        // Attach to head
        this.villagerHead.addChild(merchantHat);

        // Position relative to head
        merchantHat.setRotationPoint(0.0F, 0.0F, 0.0F);

        // Add hat cube
        merchantHat.addBox(
                -5.0F,  // X offset
                -11.0F, // Y offset (above head)
                -5.0F,  // Z offset
                10,     // width
                3,      // height
                10      // depth
        );
    }
}
