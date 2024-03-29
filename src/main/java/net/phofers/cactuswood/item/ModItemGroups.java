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
                    .icon(() -> new ItemStack(Items.CACTUS)).entries((displayContext, entries) -> {
                        entries.add(Items.CACTUS);

                        entries.add(ModItems.CACTUS_RIBS);
                        entries.add(ModBlocks.CACTUS_PLANKS);


                    }).build());

    public static void registerItemGroups() {
        CactusWood.LOGGER.info("Registering ModItemGroups for: "+CactusWood.MOD_ID);
    }
}
