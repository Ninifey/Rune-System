package de.rinonline.korinskills.skills;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;

public class SpellExsample extends Spell {

	public SpellExsample() {
		
		// sets the 3 items to start the spell
		StartItemOne = Items.emerald;
		StartItemTwo = Items.bone;
		StartItemThree = Items.diamond;
		
		//damage of the spell (you should use this , because you so can change the balance easy
		BaseDamage = 5;
		
		//---- 20 = 1 secound , how long does the spell call the update method --------
		SpellMaxTime = 20;
	}
	
	/**
	 * called when the Spell is activated
	 */
	@Override
	public void onSpellStart(EntityPlayer player) {
		System.out.println("spell start");
	}
	
	/**
	 * called when the Spell is Updated
	 */
	@Override
	public void onSpellUpdate(EntityPlayer player) {
	

		System.out.println("spell update");
		
	}
	
	/**
	 * called when the Spell is finished
	 */
	@Override
	public void onSpellEnd(EntityPlayer player) {

		System.out.println("spell end");
		
		//--- important to reset the spell
		super.onSpellEnd(player);
	}
}
