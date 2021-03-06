package de.rinonline.korinskills.skills;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent;
import de.rinonline.korinskills.network.PacketDispatcher;
import de.rinonline.korinskills.network.SyncPlayerPropsMessage;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;


public class SpellEventHandler

{
	@SubscribeEvent
	public void onEntityConstructing(EntityConstructing event) {
		if (event.entity instanceof EntityPlayer) {
			if (PlayerSpells.get((EntityPlayer) event.entity) == null) {
				PlayerSpells.register((EntityPlayer) event.entity);
				}else{
					PacketDispatcher.sendTo(new SyncPlayerPropsMessage((EntityPlayer) event.entity), (EntityPlayerMP) event.entity);
					
				}
		}		
	}
	
	@SubscribeEvent
	public void onPlayerLogIn(PlayerLoggedInEvent event) {
		if (event.player instanceof EntityPlayer) {
			if (PlayerSpells.get((EntityPlayer) event.player) == null) {
				PlayerSpells.register((EntityPlayer) event.player);
				}else{
					PacketDispatcher.sendTo(new SyncPlayerPropsMessage((EntityPlayer) event.player), (EntityPlayerMP) event.player);
					
				}
		}
	}
	

	@SubscribeEvent
	public void onPlayerLogOut(PlayerLoggedOutEvent event) {
		if (event.player instanceof EntityPlayerMP) {
			PacketDispatcher.sendTo(new SyncPlayerPropsMessage((EntityPlayer) event.player), (EntityPlayerMP) event.player);
		}
	}
	
	@SubscribeEvent
	public void onJoinWorld(EntityJoinWorldEvent event) {
		if (event.entity instanceof EntityPlayerMP) 
		{
			if (PlayerSpells.get((EntityPlayer) event.entity) == null) {
			PlayerSpells.register((EntityPlayer) event.entity);
				}
			}
		}

		@SubscribeEvent
		public void onClonePlayer(PlayerEvent.Clone event) {
		PlayerSpells.get(event.entityPlayer).copy(PlayerSpells.get(event.original));
		PacketDispatcher.sendTo(new SyncPlayerPropsMessage((EntityPlayer) event.entityPlayer), (EntityPlayerMP) event.entityPlayer);
			//}
		}

		
		@SubscribeEvent
		public void onLivingUpdate(LivingUpdateEvent event) {
			if (event.entity instanceof EntityPlayer) {
				EntityPlayer player = (EntityPlayer) event.entity;
				PlayerSpells props = PlayerSpells.get(player);
				props.onUpdate();
			}
		}	
		
		 /**
		  * 	this event check the player, when he use an item and if , it update the playerspells
		  */
		@SubscribeEvent
		public void onPlayerUseItemEvent(PlayerInteractEvent event) {

			if(event.entityPlayer != null) {
			if(PlayerSpells.get(event.entityPlayer) != null) {
				PlayerSpells PlayerSpelllist = PlayerSpells.get(event.entityPlayer);
				if(event.entityPlayer.getHeldItem() != null) {
					PlayerSpelllist.onUseItem(event.entityPlayer.getHeldItem());
					}
				}
			}
		}
		
}