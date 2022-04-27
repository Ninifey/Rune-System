package de.rinonline.korinskills.skills;

import java.util.ArrayList;

public class SpellRegistry {
	
	public static ArrayList<Spell> SpellList = new ArrayList<Spell>();

	public void load() {
		SpellList.add(new SpellExsample());
		
	}

	public static ArrayList<Spell> getSpellList() {
		return SpellList;
	}
}