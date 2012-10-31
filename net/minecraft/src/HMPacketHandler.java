package net.minecraft.src;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Random;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.network.Player;

public class HMPacketHandler implements IPacketHandler {

	@Override
	public void onPacketData(NetworkManager manager, Packet250CustomPayload packet, Player player) {
		if(packet.channel.equals("HM-Mobs")) {
			handlePacket(packet);
		}
	}
	
	public void handlePacket(Packet250CustomPayload packet) {
		DataInputStream inputStream = new DataInputStream(new ByteArrayInputStream(packet.data));
		
		int randomInt1;
		int randomInt2;
		
		try {
			randomInt1 = inputStream.readInt();
			randomInt2 = inputStream.readInt();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

}
