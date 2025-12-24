package net.phofers.cactuswood.neoforge.client;

import net.blay09.mods.balm.client.BalmClient;
import net.blay09.mods.balm.neoforge.platform.runtime.NeoForgeLoadContext;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.phofers.cactuswood.CactusWood;
import net.phofers.cactuswood.client.CactusWoodClient;

@Mod(value = CactusWood.MOD_ID, dist = Dist.CLIENT)
public class NeoForgeCactusWoodClient {

    public NeoForgeCactusWoodClient(IEventBus modEventBus) {
        final var context = new NeoForgeLoadContext(modEventBus);
        BalmClient.initializeMod(CactusWood.MOD_ID, context, CactusWoodClient::initialize);
    }
}
