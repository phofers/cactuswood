package net.phofers.cactuswood.fabric;

import net.blay09.mods.balm.Balm;
import net.blay09.mods.balm.fabric.platform.runtime.FabricLoadContext;
import net.fabricmc.api.ModInitializer;
import net.phofers.cactuswood.CactusWood;

public class FabricCactusWood implements ModInitializer {
    @Override
    public void onInitialize() {
        Balm.initializeMod(CactusWood.MOD_ID, FabricLoadContext.INSTANCE, CactusWood::initialize);
    }
}
