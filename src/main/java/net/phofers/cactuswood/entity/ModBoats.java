package net.phofers.cactuswood.entity;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.phofers.cactuswood.CactusWood;
import net.phofers.cactuswood.block.ModBlocks;
import net.phofers.cactuswood.item.ModItems;

public class ModBoats {

    public static final Identifier CACTUS_BOAT_ID = new Identifier(CactusWood.MOD_ID, "cactus_boat");
    public static final Identifier CACTUS_CHEST_BOAT_ID = new Identifier(CactusWood.MOD_ID, "cactus_chest_boat");

    public static final RegistryKey<TerraformBoatType> CACTUS_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CACTUS_BOAT_ID);

    public static void registerBoats() {
        TerraformBoatType cactusBoat = new TerraformBoatType.Builder()
                .item(ModItems.CACTUS_BOAT)
                .chestItem(ModItems.CACTUS_CHEST_BOAT)
                .planks(ModBlocks.CACTUS_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE,CACTUS_BOAT_KEY,cactusBoat);

        CactusWood.LOGGER.info("Registering ModBoats for: "+CactusWood.MOD_ID);
    }
}
