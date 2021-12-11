
package net.mcreator.aussieshit.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.aussieshit.itemgroup.AusshittabItemGroup;
import net.mcreator.aussieshit.AussieShitModElements;

@AussieShitModElements.ModElement.Tag
public class DownunderItem extends AussieShitModElements.ModElement {
	@ObjectHolder("aussie_shit:downunder")
	public static final Item block = null;
	public DownunderItem(AussieShitModElements instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, AussieShitModElements.sounds.get(new ResourceLocation("aussie_shit:downunderrecord")),
					new Item.Properties().group(AusshittabItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("downunder");
		}
	}
}
