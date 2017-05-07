package co.q64.arcade.base.api.net;

import java.util.List;

import co.q64.arcade.base.api.annotation.packet.PacketDefinition;

public interface PacketJunction<T extends Frame, U extends Frame> {
	public void handle(PacketRequestHandler<T, U> t);

	public PacketBuilder<T, U> prepare();

	public List<PacketRequestHandler<T, U>> getHandlers();
	
	public PacketDefinition getDefinition();
}
