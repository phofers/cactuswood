package net.phofers.cactuswood.forge;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.client.BalmClient;
import net.blay09.mods.balm.forge.ForgeLoadContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.phofers.cactuswood.CactusWood;

@Mod(CactusWood.MOD_ID)
public class ForgeCactusWood {

    public ForgeCactusWood(FMLJavaModLoadingContext context) {
        final var loadContext = new ForgeLoadContext(context.getModBusGroup());
        Balm.initializeMod(CactusWood.MOD_ID, loadContext, CactusWood::initialize);
        if (FMLEnvironment.dist.isClient()) {
            BalmClient.initializeMod(CactusWood.MOD_ID, loadContext, CactusWoodClient::initialize);
        }
    }

}
