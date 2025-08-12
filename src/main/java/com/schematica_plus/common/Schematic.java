package com.schematica_plus.common;

import java.util.UUID;

// Simplified internal representation of a schematic
public class Schematic {
    private final UUID id;
    private final String name;
    private final int width, height, length;
    // For memory reasons, blocks are stored in a compressed or chunked structure in a full implementation
    // Here we provide a simple accessor model; actual implementations should use packed arrays or streaming.
    // TODO: implement efficient storage for very large schematics.
    public Schematic(UUID id, String name, int w, int h, int l) {
        this.id = id;
        this.name = name;
        this.width = w;
        this.height = h;
        this.length = l;
    }

    public String getName() { return name; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public int getLength() { return length; }
}
