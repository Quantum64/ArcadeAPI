package co.q64.arcade.base.api.net;

import java.util.UUID;
import java.util.function.Function;

public interface PacketBuilder<T extends Frame, U extends Frame> {
	public PacketBuilder<T, U> to(PacketDestination dest);

	public PacketBuilder<T, U> waitForConnect(UUID uuid);

	public PacketBuilder<T, U> waitForJoin(UUID uuid);

	public PacketBuilder<T, U> data(Function<T, T> func);

	public PacketBuilder<T, U> handle(PacketResponseHandler<U> u);

	public ConstructedPacket<T, U> build();
}
