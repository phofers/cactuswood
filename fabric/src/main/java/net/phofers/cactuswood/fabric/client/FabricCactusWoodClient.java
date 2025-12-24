package net.phofers.cactuswood.fabric.client;

import net.blay09.mods.balm.client.BalmClient;
import net.blay09.mods.balm.fabric.platform.runtime.FabricLoadContext;
import net.fabricmc.api.ClientModInitializer;
import net.phofers.cactuswood.CactusWood;
import net.phofers.cactuswood.client.CactusWoodClient;

public class FabricCactusWoodClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BalmClient.initializeMod(CactusWood.MOD_ID, FabricLoadContext.INSTANCE, CactusWoodClient::initialize);
    }
}
