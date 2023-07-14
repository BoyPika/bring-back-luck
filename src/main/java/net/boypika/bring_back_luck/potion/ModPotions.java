package net.boypika.bring_back_luck.potion;

import net.boypika.bring_back_luck.Bring_Back_Luck;
import net.boypika.bring_back_luck.mixin.BrewingRecipeRegistryMixin;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.boypika.bring_back_luck.item.ModItems;
import net.minecraft.entity.effect.StatusEffects;



public class ModPotions {
    public static Potion UNLUCK_POTION;
    public static Potion registerPotion(String name) {
        return Registry.register(Registries.POTION, new Identifier(Bring_Back_Luck.MOD_ID, name),
                new Potion(new StatusEffectInstance(StatusEffects.UNLUCK, 3000, 0)));
    }
    public static Potion LONG_LUCK;
    public static Potion registerPotion2(String name) {
        return Registry.register(Registries.POTION, new Identifier(Bring_Back_Luck.MOD_ID, name),
                new Potion(new StatusEffectInstance(StatusEffects.LUCK, 12000, 0)));
    }
    public static Potion LUCK2;
    public static Potion registerPotion3(String name) {
        return Registry.register(Registries.POTION, new Identifier(Bring_Back_Luck.MOD_ID, name),
                new Potion(new StatusEffectInstance(StatusEffects.LUCK, 3000, 1)));
    }
    public static void registerPotions() {
        UNLUCK_POTION = registerPotion("unlucky_potion");
        LONG_LUCK = registerPotion2("long_luck_potion");
        LUCK2 = registerPotion3("luck_2");

        registerPotionRecipes();
    }

    private static void registerPotionRecipes() {
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItems.LUCKY_CLOVER,
                Potions.LUCK);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.LUCK, Items.FERMENTED_SPIDER_EYE,
                ModPotions.UNLUCK_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.LUCK, Items.REDSTONE,
                ModPotions.LONG_LUCK);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.LUCK, Items.GLOWSTONE_DUST,
                ModPotions.LUCK2);
    }
}
