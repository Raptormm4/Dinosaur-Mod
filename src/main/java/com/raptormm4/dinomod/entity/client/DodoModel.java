package com.raptormm4.dinomod.entity.client;

import com.raptormm4.dinomod.DinoMod;
import com.raptormm4.dinomod.entity.custom.DodoEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class DodoModel extends GeoModel<DodoEntity> {
    @Override
    public ResourceLocation getModelResource(DodoEntity dodoEntity) {
        return ResourceLocation.fromNamespaceAndPath(DinoMod.MOD_ID, "geo/dodo.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DodoEntity dodoEntity) {
        return ResourceLocation.fromNamespaceAndPath(DinoMod.MOD_ID, "textures/entity/dodo.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DodoEntity dodoEntity) {
        return ResourceLocation.fromNamespaceAndPath(DinoMod.MOD_ID, "animations/dodo.animations.json");
    }

    @Override
    public void setCustomAnimations(DodoEntity animatable, long instanceId, AnimationState<DodoEntity> animationState) {
        GeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
