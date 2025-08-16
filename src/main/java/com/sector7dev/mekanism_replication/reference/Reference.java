package com.sector7dev.mekanism_replication.reference;

import net.minecraft.resources.ResourceLocation;

public class Reference {
    public static final ResourceLocation ORETYPE = location("c:ores/replica");

    public static ResourceLocation location(String pathIn) {
        return ResourceLocation.tryParse(pathIn);
    }
    public static ResourceLocation forge(String path) {
        return ResourceLocation.fromNamespaceAndPath("c", path);
    }

    public static ResourceLocation ore(String path) {
        return forge("ores/" + path);
    }
}
