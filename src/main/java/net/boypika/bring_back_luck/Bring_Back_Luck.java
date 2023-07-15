package net.boypika.bring_back_luck;

import net.fabricmc.api.ModInitializer;
import net.boypika.bring_back_luck.item.ModItems;
import net.boypika.bring_back_luck.potion.ModPotions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bring_Back_Luck implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("bring_back_luck");

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModPotions.registerPotionRecipes();
    }
}
