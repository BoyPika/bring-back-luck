package net.boypika.bring_back_luck;

import net.fabricmc.api.ModInitializer;
import net.boypika.bring_back_luck.item.ModItems;
import net.boypika.bring_back_luck.potion.ModPotions;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bring_Back_Luck implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("bring_back_luck");
    public static final RegistryKey<PlacedFeature> CLOVERFEATURE = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("bring_back_luck", "clover"));

    @Override
    public void onInitialize() {
        Bring_Back_Luck.LOGGER.info("Bring Back Luck Init");
        ModPotions.registerPotionRecipes();
        ModItems.addItemsToItemGroup();
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.VEGETAL_DECORATION, CLOVERFEATURE);
        if (FabricLoader.getInstance().isModLoaded("fstats-api")) {
            Bring_Back_Luck.LOGGER.warn("FStats is loaded. This can be disabled in the config for FStats.");
        }
    }
}
