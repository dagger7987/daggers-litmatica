# SchematicaPlus - Full Source (Expanded)

This expanded project adds the main modules and skeleton implementations for:
- Schematic management and IO stubs (`SchematicManager`, `SchematicIO`)
- Client-side hook and simple ghost renderer (`GhostRenderer`)
- GUI screens (Schematic Browser, Placement)
- Async placement worker skeleton (PlacementManager)
- Keybinding to open the browser

## Important notes
- The SchematicIO currently contains stubs and TODOs for proper `.litematic` NBT parsing.
  To complete Litematica compatibility, integrate `net.minecraft.nbt` reading or an NBT library
  to parse the exact Litematic NBT layout (regions, palettes, block data, tile-entity NBT).
- The renderer currently logs and provides placeholders. Implement block model rendering by using
  `BlockRenderManager`, `WorldRenderer`, and proper `BufferBuilder` pipelines.
- PlacementManager contains a simulated worker. Implement chunk-based, permission-aware placement,
  with tile-entity queuing and retry logic for unloaded chunks.
- This code targets Fabric + Minecraft 1.21.1 using Yarn mappings. You must have Java 17 installed
  to build.

## Build
1. Extract the ZIP.
2. Run `./gradlew build` (or `gradlew.bat build` on Windows).
3. The jar will be in `build/libs/`.

## How I can continue
- I can implement full `.litematic` parsing (NBT schema) and add tests.
- I can implement a real ghost renderer that draws block models with translucency.
- I can implement full placement with tile-entity handling and chunk streaming.
- I can add a GitHub Actions workflow to build the jar remotely.

Reply with `implement-litematic` to have me implement the Litematic reader next,
`implement-renderer` to implement a proper ghost renderer,
`implement-placement` to flesh out the placement pipeline,
or `all` to continue implementing everything (this will be several large steps).
