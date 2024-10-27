package com.raptormm4.dinomod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.raptormm4.dinomod.DinoMod;
import com.raptormm4.dinomod.entity.custom.DodoEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class DodoRenderer extends GeoEntityRenderer<DodoEntity> {
    public DodoRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new DodoModel());
    }

    @Override
    public ResourceLocation getTextureLocation(DodoEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(DinoMod.MOD_ID, "textures/entity/dodo.png");
    }

    @Override
    public void render(DodoEntity entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        if (entity.isBaby()) {
            poseStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
