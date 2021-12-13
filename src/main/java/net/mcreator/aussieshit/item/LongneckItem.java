
package net.mcreator.aussieshit.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import net.mcreator.aussieshit.procedures.LongneckFoodEatenProcedure;
import net.mcreator.aussieshit.itemgroup.AusshittabItemGroup;
import net.mcreator.aussieshit.AussieShitModElements;

import java.util.Map;
import java.util.HashMap;

@AussieShitModElements.ModElement.Tag
public class LongneckItem extends AussieShitModElements.ModElement {
	@ObjectHolder("aussie_shit:longneck")
	public static final Item block = null;
	public LongneckItem(AussieShitModElements instance) {
		super(instance, 36);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(AusshittabItemGroup.tab).maxStackSize(64).rarity(Rarity.UNCOMMON)
					.food((new Food.Builder()).hunger(0).saturation(0f).setAlwaysEdible().build()));
			setRegistryName("longneck");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.DRINK;
		}

		@Override
		public net.minecraft.util.SoundEvent getEatSound() {
			return net.minecraft.util.SoundEvents.ENTITY_GENERIC_DRINK;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				LongneckFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
