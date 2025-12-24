package net.phofers.cactuswood.fabric.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.*;
import net.phofers.cactuswood.block.ModBlocks;
import net.phofers.cactuswood.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        blockStateModelGenerator.createGenericCube(ModBlocks.yourBlock.asBlock());
        blockStateModelGenerator.registerSimpleItemModel(ModBlocks.yourBlock.asBlock(), ModelLocationUtils.getModelLocation(ModBlocks.yourBlock.asItem()));
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(ModItems.yourItem.asItem(), ModelTemplates.FLAT_ITEM);
    }

}
