package net.phofers.cactuswood.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.phofers.cactuswood.CactusWood;

@Mixin(Minecraft.class)
public class MinecraftMixin {

    @Inject(at = @At("TAIL"), method = "<init>")
    private void init(CallbackInfo info) {
        CactusWood.logger.info("Hello from " + CactusWood.MOD_ID);
    }
}
