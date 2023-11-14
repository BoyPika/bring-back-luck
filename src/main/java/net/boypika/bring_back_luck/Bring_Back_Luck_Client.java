package net.boypika.bring_back_luck;

import net.boypika.bring_back_luck.block.CloverBlock;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class Bring_Back_Luck_Client implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(CloverBlock.CLOVER, RenderLayer.getCutout());
    }
}
