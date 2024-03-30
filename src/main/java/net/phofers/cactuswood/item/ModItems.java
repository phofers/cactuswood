package net.phofers.cactuswood.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.phofers.cactuswood.CactusWood;
import net.phofers.cactuswood.block.ModBlocks;

public class ModItems {
    public static final Item CACTUS_RIBS = registerItem("cactus_ribs", new Item(new FabricItemSettings()));
    public static final Item CACTUS_SIGN = registerItem("cactus_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_CACTUS_SIGN, ModBlocks.WALL_CACTUS_SIGN));
    public static final Item HANGING_CACTUS_SIGN = registerItem("cactus_hanging_sign",
                new HangingSignItem(ModBlocks.HANGING_CACTUS_SIGN, ModBlocks.WALL_HANGING_CACTUS_SIGN, new FabricItemSettings().maxCount(16)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CactusWood.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CactusWood.LOGGER.info("Registering ModItems for: "+CactusWood.MOD_ID);
    }

}
