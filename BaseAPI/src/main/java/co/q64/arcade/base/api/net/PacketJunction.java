package co.q64.arcade.base.api.net;

import java.util.List;

public interface PacketJunction<T extends Frame, U extends Frame> {
	public void handle(PacketRequestHandler<T, U> t);

	public PacketBuilder<T, U> prepare();

	public List<PacketRequestHandler<T, U>> getHandlers();
	
	public String getName();
}
