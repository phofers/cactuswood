package net.phofers.cactuswood.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.phofers.cactuswood.CactusWood;
import net.phofers.cactuswood.block.ModBlocks;
import net.phofers.cactuswood.item.ModItems;

public class ModFuels {
    public static void registerModFuels() {
        FuelRegistry.INSTANCE.add(ModBlocks.CACTUS_SLAB,300);
        FuelRegistry.INSTANCE.add(ModBlocks.CACTUS_STAIRS,300);
        FuelRegistry.INSTANCE.add(ModBlocks.CACTUS_PRESSURE_PLATE,300);
        FuelRegistry.INSTANCE.add(ModBlocks.CACTUS_BUTTON,100);
        FuelRegistry.INSTANCE.add(ModBlocks.CACTUS_TRAPDOOR,300);
        FuelRegistry.INSTANCE.add(ModBlocks.CACTUS_FENCE,300);
        FuelRegistry.INSTANCE.add(ModBlocks.CACTUS_FENCE_GATE,300);
        FuelRegistry.INSTANCE.add(ModBlocks.CACTUS_DOOR,200);
        FuelRegistry.INSTANCE.add(ModItems.CACTUS_SIGN,200);
        FuelRegistry.INSTANCE.add(ModItems.HANGING_CACTUS_SIGN,200);

        FuelRegistry.INSTANCE.add(ModItems.CACTUS_RIBS,100);

        FuelRegistry.INSTANCE.add(ModBlocks.CACTUS_TILE,300);
        FuelRegistry.INSTANCE.add(ModBlocks.CACTUS_TILE_SLAB,150);


        FuelRegistry.INSTANCE.add(ModBlocks.SMOOTH_CACTUS,300);

        CactusWood.LOGGER.info("Registering ModFuels for: "+CactusWood.MOD_ID);
    }
}
