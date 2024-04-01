package net.phofers.cactuswood.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.phofers.cactuswood.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CACTUS_PLANKS);
        addDrop(ModBlocks.CACTUS_STAIRS);
        addDrop(ModBlocks.CACTUS_BUTTON);
        addDrop(ModBlocks.CACTUS_PRESSURE_PLATE);
        addDrop(ModBlocks.CACTUS_FENCE_GATE);
        addDrop(ModBlocks.CACTUS_FENCE);
        addDrop(ModBlocks.CACTUS_TRAPDOOR);



        addDrop(ModBlocks.STANDING_CACTUS_SIGN);
        addDrop(ModBlocks.WALL_CACTUS_SIGN);
        addDrop(ModBlocks.HANGING_CACTUS_SIGN);
        addDrop(ModBlocks.WALL_HANGING_CACTUS_SIGN);

        addDrop(ModBlocks.SMOOTH_CACTUS);

        addDrop(ModBlocks.CACTUS_DOOR, doorDrops(ModBlocks.CACTUS_DOOR));
        addDrop(ModBlocks.CACTUS_SLAB, slabDrops(ModBlocks.CACTUS_SLAB));

        // Cactus tile stuff
        addDrop(ModBlocks.CACTUS_TILE_SLAB, slabDrops(ModBlocks.CACTUS_TILE_SLAB));
        addDrop(ModBlocks.CACTUS_TILE);
        addDrop(ModBlocks.CACTUS_TILE_STAIRS);

    }
}
