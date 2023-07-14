package net.boypika.bring_back_luck.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.boypika.bring_back_luck.Bring_Back_Luck;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;


public class ModItems {
    public static final Item LUCKY_CLOVER = registerItem(
            new Item(new FabricItemSettings()));
    public static void registerModItems() {
        Bring_Back_Luck.LOGGER.info("[1.19.3 - 1.20.1] Bring Back Luck Init");
    }

    private static Item registerItem(Item item) {
        return Registry.register(Registries.ITEM, new Identifier("bring_back_luck", "lucky_clover"), item);
    }
    public static void addItemsToItemGroup(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register(content -> content.add(ModItems.LUCKY_CLOVER));
    }
}