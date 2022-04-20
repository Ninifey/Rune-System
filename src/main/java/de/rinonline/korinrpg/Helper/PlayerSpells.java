package de.rinonline.korinrpg.Helper;

import java.util.ArrayList;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class PlayerSpells implements IExtendedEntityProperties
{
	public final static String PlayerSpells_NAME = "PlayerSpells";
	private final EntityPlayer player;
	private int timer,whitestate;
	 public ArrayList<Spell> PlayerSpellsList;
	
	public PlayerSpells(EntityPlayer player)
	{
		this.player = player;
	}
	
	public static final void register(EntityPlayer player)
	{
		player.registerExtendedProperties(PlayerSpells.PlayerSpells_NAME, new PlayerSpells(player));
	}
	
	public static final PlayerSpells get(EntityPlayer player)
	{
		return (PlayerSpells) player.getExtendedProperties(PlayerSpells_NAME);
	}

	public void copy(PlayerSpells props) {
	}

	
	@Override
	public void saveNBTData(NBTTagCompound compound)
	{
		NBTTagCompound properties = new NBTTagCompound();
		compound.setTag(PlayerSpells_NAME, properties);
		
	}

	@Override
	public void loadNBTData(NBTTagCompound compound)
	{
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(PlayerSpells_NAME);
		
	}
	

	/**
	 * on load it will get the current registered spells from the Registry and create a new list for each player
	 */
	@Override
	public void init(Entity entity, World world)
	{
		PlayerSpellsList = SpellRegistry.getSpellList();
	}
	
	/**
	 * here is the method which update every activ spell for the player
	 */
	public void onUpdate() {
		for(Spell element : PlayerSpellsList){ 
			if(element.isActiv) { 
				element.onSpellTimeUpdate(player);
			}
		}
	}
	
	/**
	 * this event is called by the main eventhandler for each player
	 */
	public void onUseItem(ItemStack item) {

		for(Spell element : PlayerSpellsList){ 
			element.onUseItem(item,this.player);
		}
	}
}