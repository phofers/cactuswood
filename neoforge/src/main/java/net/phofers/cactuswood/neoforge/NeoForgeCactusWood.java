package net.phofers.cactuswood.neoforge;

import net.blay09.mods.balm.Balm;
import net.blay09.mods.balm.neoforge.platform.runtime.NeoForgeLoadContext;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.phofers.cactuswood.CactusWood;

@Mod(CactusWood.MOD_ID)
public class NeoForgeCactusWood {

    public NeoForgeCactusWood(IEventBus modEventBus) {
        final var context = new NeoForgeLoadContext(modEventBus);
        Balm.initializeMod(CactusWood.MOD_ID, context, CactusWood::initialize);
    }
}
