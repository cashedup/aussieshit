package net.mcreator.aussieshit.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.aussieshit.AussieShitMod;

import java.util.Map;

public class LongneckFoodEatenProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AussieShitMod.LOGGER.warn("Failed to load dependency entity for procedure LongneckFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 600, (int) 0));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LUCK, (int) 1200, (int) 2));
	}
}
