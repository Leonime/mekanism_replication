package com.sector7dev.mekanism_replication.chemical;

import com.sector7dev.mekanism_replication.MekanismReplication;
import mekanism.api.chemical.Chemical;
import mekanism.common.registration.impl.SlurryRegistryObject;

import java.util.LinkedHashMap;
import java.util.Map;

public class MRSlurries {
    public static final SlurryRegistry SLURRIES = new SlurryRegistry(MekanismReplication.MOD_ID);

    public static final Map<MRResource, SlurryRegistryObject<Chemical, Chemical>> PROCESSED_RESOURCES = new LinkedHashMap<>();

    static {
        for (MRResource resource : EnumFunc.PRIMARY_RESOURCES) {
            PROCESSED_RESOURCES.put(resource, SLURRIES.register(resource));
        }
    }
}
