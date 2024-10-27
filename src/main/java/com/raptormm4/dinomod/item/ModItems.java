package com.raptormm4.dinomod.item;

import com.raptormm4.dinomod.DinoMod;
import com.raptormm4.dinomod.entity.ModEntities;
import net.minecraft.world.item.EggItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DinoMod.MOD_ID);

    public static final RegistryObject<Item> FOSSIL = ITEMS.register("fossil",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLANT_FOSSIL = ITEMS.register("plant_fossil",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<EggItem> DODO_EGG = ITEMS.register("dodo_egg",
            () -> new EggItem(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> DODO_SPAWN_EGG = ITEMS.register("dodo_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.DODO, 0xD57E36, 0x1D0D00,
                    new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
