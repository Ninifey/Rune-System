package de.rinonline.korinrpg;

import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

public class BasisClientProxy extends BasisCommonProxy {
	
	
    @Override
    public EntityPlayer getPlayerEntity(MessageContext ctx) {
    	
     return (ctx.side.isClient() ? Minecraft.getMinecraft().thePlayer : super.getPlayerEntity(ctx));
    }
}
