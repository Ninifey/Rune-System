package de.rinonline.korinskills;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import net.minecraft.entity.player.EntityPlayer;

public class BasisCommonProxy {

	public void registerNeueRender(){
		//---- here nothing because the Server do not Render things
	}
	
	public EntityPlayer getPlayerEntity(MessageContext ctx) {

		 return ctx.getServerHandler().playerEntity;
	}
}
