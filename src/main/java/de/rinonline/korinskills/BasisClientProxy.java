package de.rinonline.korinskills;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import de.rinonline.korinskills.blocks.RenderStatue;
import de.rinonline.korinskills.blocks.TitleStatue;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

public class BasisClientProxy extends BasisCommonProxy {
	

	public void registerNeueRender(){
		ClientRegistry.bindTileEntitySpecialRenderer(TitleStatue.class, new RenderStatue());
	}
	
	
    @Override
    public EntityPlayer getPlayerEntity(MessageContext ctx) {
    	
     return (ctx.side.isClient() ? Minecraft.getMinecraft().thePlayer : super.getPlayerEntity(ctx));
    }
}
