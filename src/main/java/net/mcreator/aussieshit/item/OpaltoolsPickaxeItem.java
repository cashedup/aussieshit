
package net.mcreator.aussieshit.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.aussieshit.itemgroup.AusshittabItemGroup;
import net.mcreator.aussieshit.AussieShitModElements;

@AussieShitModElements.ModElement.Tag
public class OpaltoolsPickaxeItem extends AussieShitModElements.ModElement {
	@ObjectHolder("aussie_shit:opaltools_pickaxe")
	public static final Item block = null;
	public OpaltoolsPickaxeItem(AussieShitModElements instance) {
		super(instance, 51);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1720;
			}

			public float getEfficiency() {
				return 8.5f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(OpalItem.block));
			}
		}, 1, -2.4f, new Item.Properties().group(AusshittabItemGroup.tab)) {
		}.setRegistryName("opaltools_pickaxe"));
	}
}
