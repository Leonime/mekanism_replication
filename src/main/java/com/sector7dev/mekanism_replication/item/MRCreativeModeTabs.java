package com.sector7dev.mekanism_replication.item;

import com.sector7dev.mekanism_replication.MekanismReplication;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class MRCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MekanismReplication.MOD_ID);

    public static final Supplier<CreativeModeTab> MR_CREATIVE_TAB = CREATIVE_MODE_TAB.register("mr_creative_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> MRItems.DUST_REPLICA.get().getDefaultInstance())
                    .title(Component.translatable("creative_tab.mekanism_replication.mr_creative_tab"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(MRItems.DUST_REPLICA);
                        output.accept(MRItems.DIRTY_DUST_REPLICA);
                        output.accept(MRItems.CLUMP_REPLICA);
                        output.accept(MRItems.SHARD_REPLICA);
                        output.accept(MRItems.CRYSTAL_REPLICA);
                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
