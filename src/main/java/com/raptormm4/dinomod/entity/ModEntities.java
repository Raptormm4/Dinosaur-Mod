package com.raptormm4.dinomod.entity;

import com.raptormm4.dinomod.DinoMod;
import com.raptormm4.dinomod.entity.custom.DodoEntity;
import net.minecraft.ResourceLocationException;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DinoMod.MOD_ID);

    public static final RegistryObject<EntityType<DodoEntity>> DODO =
            ENTITY_TYPES.register("dodo",
                    () -> EntityType.Builder.of(DodoEntity::new, MobCategory.CREATURE)
                            .sized(1.1f, 1.1f)
                            .build(ResourceLocation.fromNamespaceAndPath(DinoMod.MOD_ID, "dodo").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
