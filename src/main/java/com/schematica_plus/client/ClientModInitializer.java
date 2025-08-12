package com.schematica_plus.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import org.lwjgl.glfw.GLFW;

public class ClientModInitializer implements ClientModInitializer {
    public static KeyBinding openGuiKey;

    @Override
    public void onInitializeClient() {
        System.out.println("SchematicaPlus client initialized.");
        // Register a keybinding to open the schematic browser
        openGuiKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.schematica_plus.open_browser",
            GLFW.GLFW_KEY_M,
            "category.schematica_plus"
        ));

        // Register render tick handler (simple)
        net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.END_CLIENT_TICK.register(client -> {
            try {
                com.schematica_plus.client.RenderTickHandler.onTick();
            } catch (Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
