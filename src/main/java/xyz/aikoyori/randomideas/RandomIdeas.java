package xyz.aikoyori.randomideas;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.aikoyori.randomideas.effects.TacoBelledEffect;
import xyz.aikoyori.randomideas.items.TacoBellFoodItem;

public class RandomIdeas implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    public static String MOD_ID = "aikorandomideas";
    public static final TacoBellFoodItem TACOBELLTACO = new TacoBellFoodItem(new FabricItemSettings().maxCount(16));
    public static final TacoBelledEffect TACO_BELLED_EFFECT = new TacoBelledEffect(StatusEffectCategory.HARMFUL,0x970fff);
    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM,makeID("taco_bell_taco"),TACOBELLTACO);
        Registry.register(Registries.STATUS_EFFECT,makeID("tacobelled"),TACO_BELLED_EFFECT);
    }

    public static Identifier makeID(String name)
    {
        return new Identifier(MOD_ID,name);
    }
}
