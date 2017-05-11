package co.q64.arcade.base.api.net;

import java.util.List;
import java.util.Map;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject
public interface PacketJunction<T extends Frame, U extends Frame> {
	public PacketContext<T, U> context(PacketDestination dest);

	public PacketContext<T, U> current();

	public PacketBuilder<T, U> prepare();

	public Map<PacketDestination, List<CompiledPacketContext<? extends Frame, ? extends Frame>>> getHandlers();

	public Class<? extends Packet<T, U>> getDefinition();
}
