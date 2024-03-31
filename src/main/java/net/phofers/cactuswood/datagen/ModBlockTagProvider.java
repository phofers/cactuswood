package net.phofers.cactuswood.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.phofers.cactuswood.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class    ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {


    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.CACTUS_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.CACTUS_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.CACTUS_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.CACTUS_FENCE);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.CACTUS_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.CACTUS_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.CACTUS_BUTTON);

        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                .add(ModBlocks.WALL_CACTUS_SIGN);

        getOrCreateTagBuilder(BlockTags.STANDING_SIGNS)
                .add(ModBlocks.STANDING_CACTUS_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS)
                .add(ModBlocks.WALL_HANGING_CACTUS_SIGN);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.CACTUS_STAIRS);
        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.CACTUS_SLAB);
        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(ModBlocks.CACTUS_BUTTON);
        getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.CACTUS_PRESSURE_PLATE);
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.CACTUS_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.CACTUS_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.DOORS)
                .add(ModBlocks.CACTUS_DOOR);
        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(ModBlocks.CACTUS_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.CACTUS_DOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.CACTUS_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.CACTUS_PLANKS);


    }
}
