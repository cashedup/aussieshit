
package net.mcreator.aussieshit.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.aussieshit.itemgroup.AusshittabItemGroup;
import net.mcreator.aussieshit.AussieShitModElements;

@AussieShitModElements.ModElement.Tag
public class OpaltoolsAxeItem extends AussieShitModElements.ModElement {
	@ObjectHolder("aussie_shit:opaltools_axe")
	public static final Item block = null;
	public OpaltoolsAxeItem(AussieShitModElements instance) {
		super(instance, 52);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 8.5f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(OpalItem.block));
			}
		}, 1, 1f, new Item.Properties().group(AusshittabItemGroup.tab)) {
		}.setRegistryName("opaltools_axe"));
	}
}
