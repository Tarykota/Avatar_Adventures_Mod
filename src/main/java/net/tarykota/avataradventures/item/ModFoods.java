package net.tarykota.avataradventures.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties TEYLU = new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties COOKED_TEYLU = new FoodProperties.Builder().nutrition(6).saturationMod(0.8F).build();
    public static final FoodProperties GLOW_WORM = new FoodProperties.Builder().nutrition(2).saturationMod(0.3F)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 600, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1200, 2), 1.0F).build();
}
