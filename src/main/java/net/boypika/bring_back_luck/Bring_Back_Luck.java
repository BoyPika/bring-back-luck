package net.boypika.bring_back_luck;

import net.fabricmc.api.ModInitializer;
import net.boypika.bring_back_luck.item.ModItems;
import net.boypika.bring_back_luck.potion.ModPotions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bring_Back_Luck implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("bring_back_luck");

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModPotions.registerPotionRecipes();
        ModItems.addItemsToItemGroup();

    }
}
