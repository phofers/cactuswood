package net.phofers.cactuswood.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.phofers.cactuswood.CactusWood;
import net.phofers.cactuswood.block.ModBlocks;

public class ModFlammableBlocks {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.CACTUS_PLANKS, 5, 20);
        registry.add(ModBlocks.CACTUS_STAIRS, 5, 20);
        registry.add(ModBlocks.CACTUS_SLAB, 5, 20);
        registry.add(ModBlocks.CACTUS_FENCE, 5, 20);
        registry.add(ModBlocks.CACTUS_FENCE_GATE, 5, 20);
        registry.add(ModBlocks.CACTUS_TILE, 5, 20);
        registry.add(ModBlocks.CACTUS_TILE_STAIRS, 5, 20);
        registry.add(ModBlocks.CACTUS_TILE_SLAB, 5, 20);
        registry.add(ModBlocks.SMOOTH_CACTUS, 5, 20);

        CactusWood.LOGGER.info("Registering ModFlammableBlocks for: "+CactusWood.MOD_ID);

    }
}
