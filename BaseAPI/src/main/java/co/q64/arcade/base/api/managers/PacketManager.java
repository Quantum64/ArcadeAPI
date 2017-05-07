package co.q64.arcade.base.api.managers;

import java.util.Optional;

import co.q64.arcade.base.api.annotation.packet.PacketDefinition;
import co.q64.arcade.base.api.net.ConstructedPacket;
import co.q64.arcade.base.api.net.Frame;
import co.q64.arcade.base.api.net.Packet;
import co.q64.arcade.base.api.net.PacketJunction;

public interface PacketManager {
	public void enable();

	public void disable();
	
	public Optional<PacketDefinition> definitionFromName(String name);

	public <T extends Frame, U extends Frame> PacketJunction<T, U> getPacket(Class<? extends Packet<T, U>> clazz);

	public <T extends Frame, U extends Frame> void sendPacket(ConstructedPacket<T, U> packet, boolean async);
}
