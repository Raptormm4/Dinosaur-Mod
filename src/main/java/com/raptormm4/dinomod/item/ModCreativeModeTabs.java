package com.raptormm4.dinomod.item;

import com.raptormm4.dinomod.DinoMod;
import com.raptormm4.dinomod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DinoMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ARCHEOLOGY_TAB = CREATIVE_MODE_TABS.register("archeology_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FOSSIL.get()))
                    .title(Component.translatable("creativetab.dinomod.archeology"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.FOSSIL.get());
                        output.accept(ModItems.PLANT_FOSSIL.get());
                        output.accept(ModItems.AMBER.get());

                        output.accept(ModBlocks.PETRIFIED_FOSSIL.get());
                        output.accept(ModBlocks.CARBON_FOSSIL.get());
                        output.accept(ModBlocks.AMBER_STONE.get());
                        output.accept(ModBlocks.AMBER_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
