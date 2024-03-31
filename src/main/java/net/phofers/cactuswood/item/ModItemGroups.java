package net.phofers.cactuswood.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.phofers.cactuswood.CactusWood;
import net.phofers.cactuswood.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup CACTUS_WOOD_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(CactusWood.MOD_ID, "cactus_wood_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cactuswood.cactus_wood"))
                    .icon(() -> new ItemStack(ModBlocks.CACTUS_PLANKS)).entries((displayContext, entries) -> {

                        /*
                        entries.add(Items.CACTUS);

                        entries.add(ModItems.CACTUS_RIBS);
                        entries.add(ModBlocks.CACTUS_PLANKS);
                        entries.add(ModBlocks.CACTUS_STAIRS);
                        entries.add(ModBlocks.CACTUS_SLAB);
                        entries.add(ModBlocks.CACTUS_BUTTON);
                        entries.add(ModBlocks.CACTUS_PRESSURE_PLATE);
                        entries.add(ModBlocks.CACTUS_FENCE);
                        entries.add(ModBlocks.CACTUS_FENCE_GATE);
                        entries.add(ModBlocks.CACTUS_DOOR);
                        entries.add(ModBlocks.CACTUS_TRAPDOOR);

                        entries.add(ModItems.CACTUS_SIGN);
                        entries.add(ModItems.HANGING_CACTUS_SIGN);

                        entries.add(ModItems.CACTUS_BOAT);
                        entries.add(ModItems.CACTUS_CHEST_BOAT);
                        */

                        entries.add(ModBlocks.CACTUS_PLANKS);
                        entries.add(ModBlocks.CACTUS_STAIRS);
                        entries.add(ModBlocks.CACTUS_SLAB);
                        entries.add(ModBlocks.CACTUS_FENCE);
                        entries.add(ModBlocks.CACTUS_FENCE_GATE);
                        entries.add(ModBlocks.CACTUS_DOOR);
                        entries.add(ModBlocks.CACTUS_TRAPDOOR);
                        entries.add(ModBlocks.CACTUS_PRESSURE_PLATE);
                        entries.add(ModBlocks.CACTUS_BUTTON);
                        entries.add(ModItems.CACTUS_SIGN);
                        entries.add(ModItems.HANGING_CACTUS_SIGN);
                        entries.add(ModItems.CACTUS_BOAT);
                        entries.add(ModItems.CACTUS_CHEST_BOAT);
                        entries.add(ModItems.CACTUS_RIBS);


                    }).build());

    public static void registerItemGroups() {
        CactusWood.LOGGER.info("Registering ModItemGroups for: "+CactusWood.MOD_ID);
    }
}
