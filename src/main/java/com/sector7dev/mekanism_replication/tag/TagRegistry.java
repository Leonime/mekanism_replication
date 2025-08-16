package com.sector7dev.mekanism_replication.tag;

import com.sector7dev.mekanism_replication.reference.Reference;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class TagRegistry {
    public static final TagKey<Item> REPLICA = ItemTags.create(Reference.ore("replica"));
}
