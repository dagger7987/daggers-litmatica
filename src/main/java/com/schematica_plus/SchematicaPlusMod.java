package com.schematica_plus;

import net.fabricmc.api.ModInitializer;

public class SchematicaPlusMod implements ModInitializer {
    public static final String MODID = "schematica_plus";

    @Override
    public void onInitialize() {
        System.out.println(MODID + " loaded (server/common).");
        // Initialize common systems
        com.schematica_plus.common.SchematicManager.init();
        com.schematica_plus.common.PlacementManager.init();
    }
}
