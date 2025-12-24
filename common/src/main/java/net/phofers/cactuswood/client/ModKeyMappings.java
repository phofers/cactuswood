package net.phofers.cactuswood.client;

import com.mojang.blaze3d.platform.InputConstants;
import net.blay09.mods.kuma.api.InputBinding;
import net.blay09.mods.kuma.api.Kuma;
import net.blay09.mods.kuma.api.ManagedKeyMapping;
import net.phofers.cactuswood.CactusWood;

import static net.phofers.cactuswood.CactusWood.id;

public class ModKeyMappings {

    public static ManagedKeyMapping yourKey;

    public static void initialize() {
        yourKey = Kuma.createKeyMapping(id("your_key"))
                .withDefault(InputBinding.key(InputConstants.KEY_B))
                .handleScreenInput(event -> {
                    CactusWood.logger.info("B was pressed - " + CactusWood.MOD_ID);
                    return true;
                })
                .build();
    }
}
