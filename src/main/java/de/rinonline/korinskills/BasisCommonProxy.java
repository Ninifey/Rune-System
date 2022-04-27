package de.rinonline.korinskills;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import net.minecraft.entity.player.EntityPlayer;

public class BasisCommonProxy {
	 
	public EntityPlayer getPlayerEntity(MessageContext ctx) {

		 return ctx.getServerHandler().playerEntity;
	}
}
