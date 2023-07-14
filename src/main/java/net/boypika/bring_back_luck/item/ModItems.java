package net.boypika.bring_back_luck.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.boypika.bring_back_luck.Bring_Back_Luck;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {
    public static final Item LUCKY_CLOVER = registerItem("lucky_clover",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static void registerModItems() {
        Bring_Back_Luck.LOGGER.info("[1.16.2 - 1.19.2] Bring Back Luck Init");
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Bring_Back_Luck.MOD_ID, name), item);
    }
}
