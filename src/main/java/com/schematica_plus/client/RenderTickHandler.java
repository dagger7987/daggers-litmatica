package com.schematica_plus.client;

import net.minecraft.client.MinecraftClient;

public class RenderTickHandler {
    public static void onTick() {
        MinecraftClient mc = MinecraftClient.getInstance();
        if (mc.player == null) return;
        // Poll keybinding and open GUI if pressed
        if (ClientModInitializer.openGuiKey.wasPressed()) {
            mc.execute(() -> {
                mc.setScreen(new com.schematica_plus.client.gui.SchematicBrowserScreen());
            });
        }

        // Render schematics if any loaded
        com.schematica_plus.common.Schematic s = com.schematica_plus.common.SchematicManager.get("example.litematic");
        if (s != null) {
            // Render ghost - in a full implementation we would draw block models and translucent cuboids
            GhostRenderer.renderGhost(s, mc);
        }
    }
}
