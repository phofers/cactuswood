package net.phofers.cactuswood;

import net.fabricmc.api.ModInitializer;

import net.phofers.cactuswood.block.ModBlocks;
import net.phofers.cactuswood.item.ModItemGroups;
import net.phofers.cactuswood.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CactusWood implements ModInitializer {

	public static final String MOD_ID = "cactuswood";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}