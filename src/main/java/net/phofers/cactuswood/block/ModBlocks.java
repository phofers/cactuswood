package net.phofers.cactuswood.block;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.tutorial.TutorialManager;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
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
            new ButtonBlock(BlockSetType.OAK, 30, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.PALE_GREEN).collidable(false)));
    public static final Block CACTUS_PRESSURE_PLATE = registerBlock("cactus_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.PALE_GREEN)));

    public static final Block CACTUS_FENCE = registerBlock("cactus_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.PALE_GREEN)));
    public static final Block CACTUS_FENCE_GATE = registerBlock("cactus_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.PALE_GREEN)));
    public static final Block CACTUS_DOOR = registerBlock("cactus_door",
            new DoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_DOOR).nonOpaque().mapColor(MapColor.PALE_GREEN)));
    public static final Block CACTUS_TRAPDOOR = registerBlock("cactus_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque().mapColor(MapColor.PALE_GREEN)));

    public static final Identifier CACTUS_SIGN_TEXTURE = new Identifier(CactusWood.MOD_ID, "entity/signs/cactus");
    public static final Identifier CACTUS_HANGING_SIGN_TEXTURE = new Identifier(CactusWood.MOD_ID, "entity/signs/hanging/cactus");
    public static final Identifier CACTUS_HANGING_GUI_SIGN_TEXTURE = new Identifier(CactusWood.MOD_ID, "textures/gui/hanging_signs/cactus");

    public static final Block STANDING_CACTUS_SIGN = Registry.register(Registries.BLOCK, new Identifier(CactusWood.MOD_ID, "cactus_standing_sign"),
            new TerraformSignBlock(CACTUS_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN)));
    public static final Block WALL_CACTUS_SIGN = Registry.register(Registries.BLOCK, new Identifier(CactusWood.MOD_ID, "cactus_wall_sign"),
            new TerraformWallSignBlock(CACTUS_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN).dropsLike(ModBlocks.STANDING_CACTUS_SIGN)));
    public static final Block HANGING_CACTUS_SIGN = Registry.register(Registries.BLOCK, new Identifier(CactusWood.MOD_ID, "cactus_hanging_sign"),
            new TerraformHangingSignBlock(CACTUS_HANGING_SIGN_TEXTURE, CACTUS_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN).noBlockBreakParticles()));
    public static final Block WALL_HANGING_CACTUS_SIGN = Registry.register(Registries.BLOCK, new Identifier(CactusWood.MOD_ID, "cactus_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(CACTUS_HANGING_SIGN_TEXTURE, CACTUS_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(ModBlocks.HANGING_CACTUS_SIGN).noBlockBreakParticles()));

    public static final BlockFamily CACTUS_FAMILY = BlockFamilies.register(ModBlocks.CACTUS_PLANKS)
            .sign(ModBlocks.STANDING_CACTUS_SIGN, ModBlocks.WALL_CACTUS_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

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
