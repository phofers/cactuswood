package net.phofers.cactuswood;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryKey;
import net.phofers.cactuswood.datagen.ModBlockTagProvider;
import net.phofers.cactuswood.datagen.ModItemTagProvider;
import net.phofers.cactuswood.datagen.ModLootTableProvider;
import net.phofers.cactuswood.datagen.ModModelProvider;


public class CactusWoodDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);

	}
}
