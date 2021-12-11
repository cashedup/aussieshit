
package net.mcreator.aussieshit.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.aussieshit.item.IgnorethisItem;
import net.mcreator.aussieshit.AussieShitModElements;

@AussieShitModElements.ModElement.Tag
public class AusshittabItemGroup extends AussieShitModElements.ModElement {
	public AusshittabItemGroup(AussieShitModElements instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabausshittab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(IgnorethisItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
