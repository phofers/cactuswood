package net.phofers.cactuswood.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.phofers.cactuswood.CactusWood;

public class ModBlocks {
    public static final Block CACTUS_PLANKS = registerBlock("cactus_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.PALE_GREEN)));

    public static final Block CACTUS_STAIRS = registerBlock("cactus_stairs",
            new StairsBlock(ModBlocks.CACTUS_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.PALE_GREEN)));
    public static final Block CACTUS_SLAB = registerBlock("cactus_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.PALE_GREEN)));

    public static final Block CACTUS_BUTTON = registerBlock("cactus_button",
            new ButtonBlock(BlockSetType.OAK, 15, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.PALE_GREEN).collidable(false)));
    public static final Block CACTUS_PRESSURE_PLATE = registerBlock("cactus_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.PALE_GREEN)));

    public static final Block CACTUS_FENCE = registerBlock("cactus_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.PALE_GREEN)));
    public static final Block CACTUS_FENCE_GATE = registerBlock("cactus_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.PALE_GREEN)));
    public static final Block CACTUS_DOOR = registerBlock("cactus_door",
            new DoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque().mapColor(MapColor.PALE_GREEN)));
    public static final Block CACTUS_TRAPDOOR = registerBlock("cactus_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque().mapColor(MapColor.PALE_GREEN)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CactusWood.MOD_ID, name), block);

    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(CactusWood.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));

    }

    public static void registerModBlocks() {
        CactusWood.LOGGER.info("Registering ModBlocks for: "+CactusWood.MOD_ID);
    }
}
