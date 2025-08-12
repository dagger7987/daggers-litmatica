package com.schematica_plus.common;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

// NOTE: This is a high-level manager. Litematic file parsing is implemented in SchematicIO.
public class SchematicManager {
    private static final Map<String, Schematic> schematics = new ConcurrentHashMap<>();
    private static File schematicsFolder;

    public static void init() {
        schematicsFolder = new File(System.getProperty("user.home"), ".minecraft/schematics");
        if (!schematicsFolder.exists()) {
            schematicsFolder.mkdirs();
        }
        System.out.println("Schematics folder: " + schematicsFolder.getAbsolutePath());
    }

    public static Schematic load(File file) throws IOException {
        Schematic s = SchematicIO.readLitematic(file);
        schematics.put(file.getName(), s);
        return s;
    }

    public static Schematic get(String name) {
        return schematics.get(name);
    }
}
