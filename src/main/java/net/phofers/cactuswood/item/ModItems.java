package net.phofers.cactuswood.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.phofers.cactuswood.CactusWood;

public class ModItems {
    public static final Item CACTUS_RIBS = registerItem("cactus_ribs", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CactusWood.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CactusWood.LOGGER.info("Registering ModItems for: "+CactusWood.MOD_ID);
    }

}
