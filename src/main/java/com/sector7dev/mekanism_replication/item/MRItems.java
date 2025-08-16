package com.sector7dev.mekanism_replication.item;

import com.sector7dev.mekanism_replication.MekanismReplication;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MRItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MekanismReplication.MOD_ID);

    public static final DeferredItem<Item> DUST_REPLICA = ITEMS.register("dust_replica", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIRTY_DUST_REPLICA = ITEMS.register("dirty_dust_replica", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CLUMP_REPLICA = ITEMS.register("clump_replica", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHARD_REPLICA = ITEMS.register("shard_replica", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRYSTAL_REPLICA = ITEMS.register("crystal_replica", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
