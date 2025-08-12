package com.schematica_plus.client.gui;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

public class PlacementScreen extends Screen {

    protected PlacementScreen() {
        super(Text.of("Placement"));
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        this.renderBackground(matrices);
        drawCenteredText(matrices, this.textRenderer, "SchematicaPlus - Placement (placeholder)", this.width/2, 20, 0xFFFFFF);
        super.render(matrices, mouseX, mouseY, delta);
    }
}
