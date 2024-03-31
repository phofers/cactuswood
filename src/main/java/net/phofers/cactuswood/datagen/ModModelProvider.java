package net.phofers.cactuswood.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.phofers.cactuswood.block.ModBlocks;
import net.phofers.cactuswood.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool cactusPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CACTUS_PLANKS);
        cactusPool.family(ModBlocks.CACTUS_FAMILY);

        BlockStateModelGenerator.BlockTexturePool cactusTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CACTUS_TILE);

        cactusTilePool.stairs(ModBlocks.CACTUS_TILE_STAIRS);
        cactusTilePool.slab(ModBlocks.CACTUS_TILE_SLAB);


        cactusPool.stairs(ModBlocks.CACTUS_STAIRS);
        cactusPool.button(ModBlocks.CACTUS_BUTTON);
        cactusPool.slab(ModBlocks.CACTUS_SLAB);
        cactusPool.pressurePlate(ModBlocks.CACTUS_PRESSURE_PLATE);
        cactusPool.fenceGate(ModBlocks.CACTUS_FENCE_GATE);
        cactusPool.fence(ModBlocks.CACTUS_FENCE);

        blockStateModelGenerator.registerDoor(ModBlocks.CACTUS_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CACTUS_TRAPDOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.CACTUS_RIBS, Models.GENERATED);
        itemModelGenerator.register(ModItems.HANGING_CACTUS_SIGN, Models.GENERATED);

        itemModelGenerator.register(ModItems.CACTUS_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CACTUS_CHEST_BOAT, Models.GENERATED);
    }
}
