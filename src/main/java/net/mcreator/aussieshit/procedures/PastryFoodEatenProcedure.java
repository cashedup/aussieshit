package net.mcreator.aussieshit.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.aussieshit.AussieShitMod;

import java.util.Map;

public class PastryFoodEatenProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AussieShitMod.LOGGER.warn("Failed to load dependency entity for procedure PastryFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.STARVE, (float) 1);
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 600, (int) 3));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WEAKNESS, (int) 60, (int) 3));
	}
}
