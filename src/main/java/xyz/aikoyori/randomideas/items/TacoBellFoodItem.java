package xyz.aikoyori.randomideas.items;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import org.jetbrains.annotations.Nullable;
import xyz.aikoyori.randomideas.RandomIdeas;
import xyz.aikoyori.randomideas.effects.TacoBelledEffect;

public class TacoBellFoodItem extends Item {
    public TacoBellFoodItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isFood() {
        return true;
    }

    @Nullable
    @Override
    public FoodComponent getFoodComponent() {
        return new FoodComponent.Builder().hunger(3).alwaysEdible().saturationModifier(1.5f).statusEffect(new StatusEffectInstance(RandomIdeas.TACO_BELLED_EFFECT,1200),1.0f).build();
    }

}
