package net.missing.copper.sword;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.missing.copper.entity.ModEntities;

public class CopperSwordClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.COPPER_PEBBLE, FlyingItemEntityRenderer::new);

    }
}
