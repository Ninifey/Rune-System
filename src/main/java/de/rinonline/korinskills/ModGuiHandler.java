package de.rinonline.korinskills;

import cpw.mods.fml.common.network.IGuiHandler;
import de.rinonline.korinskills.crafting.ContainerRunebench;
import de.rinonline.korinskills.crafting.GuiRunebench;
import de.rinonline.korinskills.crafting.TileEntityRunebench;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ModGuiHandler implements IGuiHandler {

	public ModGuiHandler(){
		
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == 0){
			TileEntityRunebench tileEntityFurnace = (TileEntityRunebench) world.getTileEntity(x, y, z);
			return new ContainerRunebench(player.inventory, tileEntityFurnace);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == 0){
			TileEntityRunebench tileEntityTestContainer = (TileEntityRunebench) world.getTileEntity(x, y, z);
			return new GuiRunebench(player.inventory, tileEntityTestContainer);
		}
		return null;
	}

}