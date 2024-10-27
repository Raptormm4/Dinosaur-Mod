package com.raptormm4.dinomod.event;

import com.raptormm4.dinomod.DinoMod;
import com.raptormm4.dinomod.entity.ModEntities;
import com.raptormm4.dinomod.entity.custom.DodoEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DinoMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.DODO.get(), DodoEntity.setAttributes());
    }

}
