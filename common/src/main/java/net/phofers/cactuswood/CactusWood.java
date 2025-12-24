package net.phofers.cactuswood;

import net.blay09.mods.balm.Balm;
import net.blay09.mods.balm.core.BalmRegistrars;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.phofers.cactuswood.block.ModBlocks;
import net.phofers.cactuswood.item.ModItems;

public class CactusWood {

    public static final Logger logger = LoggerFactory.getLogger(CactusWood.class);

    public static final String MOD_ID = "cactuswood";

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }

    public static CactusWoodConfig config() {
        return Balm.config().getActiveConfig(CactusWoodConfig.class);
    }

    public static void initialize(BalmRegistrars registrars) {
        Balm.config().registerConfig(CactusWoodConfig.class);

        registrars.blocks(ModBlocks::initialize);
        registrars.items(ModItems::initialize);
        registrars.creativeModeTabs(ModItems::initialize);
    }

}
