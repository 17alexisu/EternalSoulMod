package com.carlosu.et.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
        public static final CreativeModeTab ETERNAL_SOUL = new CreativeModeTab("eternalsoultab") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(Moditems.AlMA.get());
            }
        };


}
