package net.boypika.bring_back_luck.item;

import net.boypika.bring_back_luck.block.CloverBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.boypika.bring_back_luck.Bring_Back_Luck;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;


public class ModItems {
    public static final Item LUCKY_CLOVER = Registry.register(Registries.ITEM, new Identifier("bring_back_luck", "lucky_clover"), new AliasedBlockItem(CloverBlock.CLOVER, new FabricItemSettings()));
    public static void addItemsToItemGroup(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register(content ->
                        content.add(ModItems.LUCKY_CLOVER));
    }
}