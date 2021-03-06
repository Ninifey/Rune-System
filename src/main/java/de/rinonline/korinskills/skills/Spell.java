package de.rinonline.korinskills.skills;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Spell {

	public Item StartItemOne,StartItemTwo,StartItemThree;
	public int BaseDamage=0,SpellMaxTime=0;
	public boolean isActiv = false;
	private boolean I1 = false,I2 = false;
	private int time = 0;
	
	public void onUseItem(ItemStack item, EntityPlayer player) {
		if(StartItemOne != item.getItem() && StartItemTwo != item.getItem() && StartItemThree != item.getItem()) {
			I1 = false;
			I2 = false;
			time = 0;
			isActiv = false;
		}else {
			if(!I1 && StartItemOne == item.getItem()) {I1 = true;}
			if(!I2 && I1 && StartItemTwo == item.getItem()) {I2 = true;}
			if(I1 && I2 && StartItemThree == item.getItem()) { onSpellStart(player); isActiv  = true;}
		}
	}

	public void onSpellStart(EntityPlayer player) {}

	public void onSpellUpdate(EntityPlayer player) {}

	public void onSpellEnd(EntityPlayer player) {
		I1 = false;
		I2 = false;
		time = 0;
		isActiv = false;
	}

	public void onSpellTimeUpdate(EntityPlayer player) {
		if(++time > SpellMaxTime) {
			this.onSpellEnd(player);
		}else{
			this.onSpellUpdate(player);
		}
	}
}
