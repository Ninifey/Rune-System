package de.rinonline.korinrpg.Helper.Network;

import java.io.IOException;

import cpw.mods.fml.relauncher.Side;
import de.rinonline.korinrpg.Helper.PlayerSpells;
import de.rinonline.korinrpg.Helper.Network.AbstractMessage.AbstractClientMessage;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;

public class SyncPlayerPropsMessage extends AbstractClientMessage<SyncPlayerPropsMessage>
{
	// Previously, we've been writing each field in our properties one at a time,
	// but that is really annoying, and we've already done it in the save and load
	// NBT methods anyway, so here's a slick way to efficiently send all of your
	// extended data, and no matter how much you add or remove, you'll never have
	// to change the packet / synchronization of your data.

	// this will store our ExtendedPlayer data, allowing us to easily read and write
	private NBTTagCompound data2;

	// The basic, no-argument constructor MUST be included to use the new automated handling
	public SyncPlayerPropsMessage() {}

	// We need to initialize our data, so provide a suitable constructor:
	public SyncPlayerPropsMessage(EntityPlayer player) {
		// create a new tag compound
		data2 = new NBTTagCompound();
		// and save our player's data into it
		PlayerSpells.get(player).saveNBTData(data2);
	}

	@Override
	protected void read(PacketBuffer buffer) throws IOException {
		data2 = buffer.readNBTTagCompoundFromBuffer();
	}

	@Override
	protected void write(PacketBuffer buffer) throws IOException {
		buffer.writeNBTTagCompoundToBuffer(data2);
	}

	@Override
	public void process(EntityPlayer player, Side side) {
		// now we can just load the NBTTagCompound data directly; one and done, folk
		PlayerSpells.get(player).loadNBTData(data2);
	}



}