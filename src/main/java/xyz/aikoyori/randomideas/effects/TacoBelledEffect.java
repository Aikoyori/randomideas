package xyz.aikoyori.randomideas.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import xyz.aikoyori.randomideas.RandomIdeas;

public class TacoBelledEffect extends StatusEffect {
    public TacoBelledEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // In our case, we just make it return true so that it applies the status effect every tick.
        return duration == 1;
    }

    // This method is called when it applies the status effect. We implement custom functionality here.
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if(!entity.world.isClient()){
            entity.world.createExplosion(null,entity.getX(),entity.getY(),entity.getZ(),(amplifier+1)*3,false, World.ExplosionSourceType.NONE);

        }
    }
    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {

        super.onRemoved(entity, attributes, amplifier);

    }
}
