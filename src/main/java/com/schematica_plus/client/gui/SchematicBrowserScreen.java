package com.schematica_plus.client.gui;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import java.io.File;

public class SchematicBrowserScreen extends Screen {

    protected SchematicBrowserScreen() {
        super(Text.of("Schematics"));
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        // Basic UI rendering - in a full implementation, show file list, preview, and buttons.
        this.renderBackground(matrices);
        drawCenteredText(matrices, this.textRenderer, "SchematicaPlus - Schematic Browser (placeholder)", this.width/2, 20, 0xFFFFFF);
        super.render(matrices, mouseX, mouseY, delta);
    }

    @Override
    public boolean shouldCloseOnEsc() {
        return true;
    }

    @Override
    public void init() {
        // Load schematic files from the schematics folder
        File schemFolder = new File(System.getProperty("user.home"), ".minecraft/schematics");
        if (!schemFolder.exists()) schemFolder.mkdirs();
        // For simplicity, attempt to load an example file if present
        File example = new File(schemFolder, "example.litematic");
        if (example.exists()) {
            try {
                com.schematica_plus.common.SchematicManager.load(example);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
