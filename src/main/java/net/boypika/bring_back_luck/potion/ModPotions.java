package net.boypika.bring_back_luck.potion;

import net.boypika.bring_back_luck.Bring_Back_Luck;
import net.boypika.bring_back_luck.mixin.BrewingRecipeRegistryMixin;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.boypika.bring_back_luck.item.ModItems;
import net.minecraft.entity.effect.StatusEffects;



public class ModPotions {
    public static Potion UNLUCK_POTION;
    public static Potion registerPotion(String name) {
        return Registry.register(Registry.POTION, new Identifier(Bring_Back_Luck.MOD_ID, name),
                new Potion(new StatusEffectInstance(StatusEffects.UNLUCK, 3000, 0)));
    }
    public static void registerPotions() {
        UNLUCK_POTION = registerPotion("unlucky_potion");

        registerPotionRecipes();
    }

    private static void registerPotionRecipes() {
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItems.LUCKY_CLOVER,
                Potions.LUCK);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.LUCK, Items.FERMENTED_SPIDER_EYE,
                ModPotions.UNLUCK_POTION);
    }
}
