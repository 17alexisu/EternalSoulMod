package com.carlosu.et.items;
import com.carlosu.et.Et;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Et.MODID);
//PROPITIATES
            public static final RegistryObject<Item> AlMA = ITEMS.register("soul",
                    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ETERNAL_SOUL)));

    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
