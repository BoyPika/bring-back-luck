package net.boypika.bring_back_luck.potion;

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
    public static final Potion UNLUCK_POTION;
    public static final Potion LONG_LUCK;
    public static final Potion LUCK2;
    static {
        UNLUCK_POTION = registerPotion("unlucky_potion", new Potion(new StatusEffectInstance(StatusEffects.UNLUCK, 3000, 0)));
        LONG_LUCK = registerPotion("luck_2", new Potion(new StatusEffectInstance(StatusEffects.LUCK, 3000, 1)));
        LUCK2 = registerPotion("long_luck_potion", new Potion(new StatusEffectInstance(StatusEffects.LUCK, 12000,0)));

    }
    public static Potion registerPotion(String name, Potion potion) {
        return Registry.register(Registry.POTION, new Identifier("bring_back_luck", name),
                potion);
    }

    public static void registerPotionRecipes() {
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
