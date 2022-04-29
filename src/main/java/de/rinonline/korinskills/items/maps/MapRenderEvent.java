package de.rinonline.korinskills.items.maps;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;

public class MapRenderEvent {
		
	@SubscribeEvent
	public void mapRender(RenderItemInFirstPersonEvent event) {
	    if (event.itemRenderer.itemToRender != null && event.itemRenderer.itemToRender.getItem() == TEST_ITEM) {
	        MapItemRenderer.renderItemAsMapInFirstPerson(event.itemRenderer, Minecraft.getMinecraft().timer.renderPartialTicks);
	        event.setCanceled(true);
	    }
	}
}
