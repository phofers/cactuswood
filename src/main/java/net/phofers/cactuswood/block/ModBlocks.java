package net.phofers.cactuswood.block;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.tutorial.TutorialManager;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.phofers.cactuswood.CactusWood;

public class ModBlocks {
    public static final Block CACTUS_PLANKS = registerBlock("cactus_planks",
           new Block(Block.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.PALE_GREEN).sounds(BlockSoundGroup.NETHER_WOOD)));


    public static final Block CACTUS_STAIRS = registerBlock("cactus_stairs",
            new StairsBlock(ModBlocks.CACTUS_PLANKS.getDefaultState(), Block.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.PALE_GREEN).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block CACTUS_SLAB = registerBlock("cactus_slab",
            new SlabBlock(Block.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.PALE_GREEN).sounds(BlockSoundGroup.NETHER_WOOD)));

    public static final Block CACTUS_BUTTON = registerBlock("cactus_button",
            new ButtonBlock(BlockSetType.OAK, 30, Block.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.PALE_GREEN).noCollision().sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block CACTUS_PRESSURE_PLATE = registerBlock("cactus_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, Block.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.PALE_GREEN).sounds(BlockSoundGroup.NETHER_WOOD)));

    public static final Block CACTUS_FENCE = registerBlock("cactus_fence",
            new FenceBlock(Block.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.PALE_GREEN).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block CACTUS_FENCE_GATE = registerBlock("cactus_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, Block.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.PALE_GREEN).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block CACTUS_DOOR = registerBlock("cactus_door",
            new DoorBlock(BlockSetType.OAK, Block.Settings.copy(Blocks.OAK_DOOR).nonOpaque().mapColor(MapColor.PALE_GREEN).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block CACTUS_TRAPDOOR = registerBlock("cactus_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, Block.Settings.copy(Blocks.OAK_PLANKS).nonOpaque().mapColor(MapColor.PALE_GREEN).sounds(BlockSoundGroup.NETHER_WOOD)));

    public static final Identifier CACTUS_SIGN_TEXTURE = new Identifier(CactusWood.MOD_ID, "entity/signs/cactus");
    public static final Identifier CACTUS_HANGING_SIGN_TEXTURE = new Identifier(CactusWood.MOD_ID, "entity/signs/hanging/cactus");
    public static final Identifier CACTUS_HANGING_GUI_SIGN_TEXTURE = new Identifier(CactusWood.MOD_ID, "textures/gui/hanging_signs/cactus");

    public static final Block STANDING_CACTUS_SIGN = Registry.register(Registries.BLOCK, new Identifier(CactusWood.MOD_ID, "cactus_standing_sign"),
            new TerraformSignBlock(CACTUS_SIGN_TEXTURE, Block.Settings.copy(Blocks.OAK_SIGN)));
    public static final Block WALL_CACTUS_SIGN = Registry.register(Registries.BLOCK, new Identifier(CactusWood.MOD_ID, "cactus_wall_sign"),
            new TerraformWallSignBlock(CACTUS_SIGN_TEXTURE, Block.Settings.copy(Blocks.OAK_WALL_SIGN).dropsLike(ModBlocks.STANDING_CACTUS_SIGN).mapColor(MapColor.PALE_GREEN).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block HANGING_CACTUS_SIGN = Registry.register(Registries.BLOCK, new Identifier(CactusWood.MOD_ID, "cactus_hanging_sign"),
            new TerraformHangingSignBlock(CACTUS_HANGING_SIGN_TEXTURE, CACTUS_HANGING_GUI_SIGN_TEXTURE, Block.Settings.copy(Blocks.OAK_HANGING_SIGN).noBlockBreakParticles().mapColor(MapColor.PALE_GREEN).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block WALL_HANGING_CACTUS_SIGN = Registry.register(Registries.BLOCK, new Identifier(CactusWood.MOD_ID, "cactus_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(CACTUS_HANGING_SIGN_TEXTURE, CACTUS_HANGING_GUI_SIGN_TEXTURE, Block.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(ModBlocks.HANGING_CACTUS_SIGN).noBlockBreakParticles().mapColor(MapColor.PALE_GREEN).sounds(BlockSoundGroup.NETHER_WOOD)));

    // Cactus tile stuff
    public static final Block CACTUS_TILE = registerBlock("cactus_tile",
            new Block(Block.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.PALE_GREEN).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block CACTUS_TILE_STAIRS = registerBlock("cactus_tile_stairs",
            new StairsBlock(ModBlocks.CACTUS_TILE.getDefaultState(), Block.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.PALE_GREEN).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block CACTUS_TILE_SLAB = registerBlock("cactus_tile_slab",
            new SlabBlock(Block.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.PALE_GREEN).sounds(BlockSoundGroup.NETHER_WOOD)));

    public static final BlockFamily CACTUS_FAMILY = BlockFamilies.register(ModBlocks.CACTUS_PLANKS)
            .sign(ModBlocks.STANDING_CACTUS_SIGN, ModBlocks.WALL_CACTUS_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CactusWood.MOD_ID, name), block);

    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(CactusWood.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));

    }

    public static void registerModBlocks() {
        CactusWood.LOGGER.info("Registering ModBlocks for: "+CactusWood.MOD_ID);
    }
}
