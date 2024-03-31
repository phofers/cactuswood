package net.phofers.cactuswood.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.phofers.cactuswood.CactusWood;
import net.phofers.cactuswood.block.ModBlocks;
import net.phofers.cactuswood.entity.ModBoats;

public class ModItems {









    public static final Item CACTUS_RIBS = registerItem("cactus_ribs", new Item(new FabricItemSettings()));
    public static final Item CACTUS_SIGN = registerItem("cactus_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_CACTUS_SIGN, ModBlocks.WALL_CACTUS_SIGN));
    public static final Item HANGING_CACTUS_SIGN = registerItem("cactus_hanging_sign",
                new HangingSignItem(ModBlocks.HANGING_CACTUS_SIGN, ModBlocks.WALL_HANGING_CACTUS_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item CACTUS_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.CACTUS_BOAT_ID, ModBoats.CACTUS_BOAT_KEY, false);
    public static final Item CACTUS_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.CACTUS_CHEST_BOAT_ID, ModBoats.CACTUS_BOAT_KEY, true);


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CactusWood.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CactusWood.LOGGER.info("Registering ModItems for: "+CactusWood.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.addAfter(Items.BAMBOO_BUTTON, ModBlocks.CACTUS_PLANKS);
            content.addAfter(ModBlocks.CACTUS_PLANKS, ModBlocks.CACTUS_TILE);
            content.addAfter(ModBlocks.CACTUS_TILE, ModBlocks.CACTUS_STAIRS);
            content.addAfter(ModBlocks.CACTUS_STAIRS, ModBlocks.CACTUS_TILE_STAIRS);
            content.addAfter(ModBlocks.CACTUS_TILE_STAIRS, ModBlocks.CACTUS_SLAB);
            content.addAfter(ModBlocks.CACTUS_SLAB, ModBlocks.CACTUS_TILE_SLAB);
            content.addAfter(ModBlocks.CACTUS_TILE_SLAB, ModBlocks.CACTUS_FENCE);
            content.addAfter(ModBlocks.CACTUS_FENCE, ModBlocks.CACTUS_FENCE_GATE);
            content.addAfter(ModBlocks.CACTUS_FENCE_GATE, ModBlocks.CACTUS_DOOR);
            content.addAfter(ModBlocks.CACTUS_DOOR, ModBlocks.CACTUS_TRAPDOOR);
            content.addAfter(ModBlocks.CACTUS_TRAPDOOR, ModBlocks.CACTUS_PRESSURE_PLATE);
            content.addAfter(ModBlocks.CACTUS_PRESSURE_PLATE, ModBlocks.CACTUS_BUTTON);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.addAfter(Items.BAMBOO_CHEST_RAFT, ModItems.CACTUS_BOAT);
            content.addAfter(ModItems.CACTUS_BOAT, ModItems.CACTUS_CHEST_BOAT);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.addAfter(Items.WHEAT, ModItems.CACTUS_RIBS);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
            content.addAfter(Items.BAMBOO_HANGING_SIGN, ModItems.CACTUS_SIGN);
            content.addAfter(ModItems.CACTUS_SIGN, ModItems.HANGING_CACTUS_SIGN);
        });


    }

}
