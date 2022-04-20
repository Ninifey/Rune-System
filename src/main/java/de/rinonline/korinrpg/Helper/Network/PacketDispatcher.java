package de.rinonline.korinrpg.Helper.Network;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import de.rinonline.korinrpg.RINMAIN;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketDispatcher
{
 private static byte packetId = 0;
 
 private static final SimpleNetworkWrapper dispatcher = NetworkRegistry.INSTANCE.newSimpleChannel(RINMAIN.MODID);

 public static final void registerPackets() {
	 PacketDispatcher.registerMessage(SyncPlayerPropsMessage.class, SyncPlayerPropsMessage.class, Side.CLIENT);
 	}

 private static final void registerMessage(Class handlerClass, Class messageClass, Side side) {
 PacketDispatcher.dispatcher.registerMessage(handlerClass, messageClass, packetId++, side);
 }
	private static final <T extends AbstractMessage<T> & IMessageHandler<T, IMessage>> void registerMessage(Class<T> clazz) {

		if (AbstractMessage.AbstractClientMessage.class.isAssignableFrom(clazz)) {
			PacketDispatcher.dispatcher.registerMessage(clazz, clazz, packetId++, Side.CLIENT);
		} else if (AbstractMessage.AbstractServerMessage.class.isAssignableFrom(clazz)) {
			PacketDispatcher.dispatcher.registerMessage(clazz, clazz, packetId++, Side.SERVER);
		} else {
			PacketDispatcher.dispatcher.registerMessage(clazz, clazz, packetId, Side.CLIENT);
			PacketDispatcher.dispatcher.registerMessage(clazz, clazz, packetId++, Side.SERVER);
		}
	}
 public static final void sendTo(IMessage message, EntityPlayerMP player) {
 PacketDispatcher.dispatcher.sendTo(message, player);
 }

 public static final void sendToAllAround(IMessage message, NetworkRegistry.TargetPoint point) {
 PacketDispatcher.dispatcher.sendToAllAround(message, point);
 }

 public static final void sendToAllAround(IMessage message, int dimension, double x, double y, double z, double range)
 {
 PacketDispatcher.sendToAllAround(message, new NetworkRegistry.TargetPoint(dimension, x, y, z, range));
 }

 public static final void sendToAllAround(IMessage message, EntityPlayer player, double range)
 {
 PacketDispatcher.sendToAllAround(message, player.worldObj.provider.dimensionId, player.posX, player.posY, player.posZ, range);
 }

 public static final void sendToDimension(IMessage message, int dimensionId) 
 {
 PacketDispatcher.dispatcher.sendToDimension(message, dimensionId);
 }

 public static final void sendToServer(IMessage message) 
 {
 PacketDispatcher.dispatcher.sendToServer(message);
 }
}