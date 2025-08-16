package com.sector7dev.mekanism_replication.client;

import com.sector7dev.mekanism_replication.MekanismReplication;
import com.sector7dev.mekanism_replication.item.MRItems;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

@EventBusSubscriber(modid = MekanismReplication.MOD_ID, value = Dist.CLIENT)
public final class ClientRegistration {

    @SubscribeEvent
    public static void registerItemColors(RegisterColorHandlersEvent.Item event) {
        event.register((stack, tintIndex) -> {
            // We want to color layer2, which corresponds to tintIndex 2
            if (tintIndex == 0) {
                // Return your desired ARGB color
                // This is the same blue from your chemical
                return 0xFF323A40;
            }
            // Return -1 or 0xFFFFFF for no tint on other layers
            return -1;
        },
        // List all items you want this color handler to apply to:
        MRItems.DUST_REPLICA.get(),
        MRItems.DIRTY_DUST_REPLICA.get(),
        MRItems.CLUMP_REPLICA.get(),
        MRItems.SHARD_REPLICA.get(),
        MRItems.CRYSTAL_REPLICA.get());
    }
}