package com.caiocesarmods.caiocesarbiomes.client.model;

import com.caiocesarmods.caiocesarbiomes.entity.custom.DesertMerchantEntity;
import com.caiocesarmods.caiocesarbiomes.entity.custom.MediterraneanMerchantEntity;
import net.minecraft.client.renderer.entity.model.VillagerModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class DesertMerchantModel extends VillagerModel<DesertMerchantEntity> {

    private final ModelRenderer merchantHat;

    public DesertMerchantModel(float scale) {
        super(scale);

        // Create hat
        this.merchantHat = new ModelRenderer(this);

        // Set UV offset for hat region
        merchantHat.setTextureOffset(32, 0).addBox(
                -5.0F,
                -11.0F,
                -5.0F,
                10,
                3,
                10,
                0.0F
        );
    }
}
