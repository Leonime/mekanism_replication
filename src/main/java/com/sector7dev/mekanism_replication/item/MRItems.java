package com.sector7dev.mekanism_replication.item;

import com.sector7dev.mekanism_replication.MekanismReplication;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MRItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MekanismReplication.MOD_ID);

    public static final DeferredItem<Item> DUST_REPLICA = ITEMS.register("dust_replica", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
