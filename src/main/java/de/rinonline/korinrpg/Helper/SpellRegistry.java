package de.rinonline.korinrpg.Helper;

import java.util.ArrayList;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SpellRegistry {
	
	public static ArrayList<Spell> SpellList = new ArrayList<Spell>();

	public void load() {
		SpellList.add(new SpellExsample());
		
	}

	public static ArrayList<Spell> getSpellList() {
		return SpellList;
	}
}