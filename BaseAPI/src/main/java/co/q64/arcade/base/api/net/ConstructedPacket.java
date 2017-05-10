package co.q64.arcade.base.api.net;

import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.DATA)
public interface ConstructedPacket<T extends Frame, U extends Frame> {
	public PacketDestination getDestination();

	public Optional<UUID> getWaitForConnect();

	public Optional<UUID> getWaitForJoin();

	public Optional<Function<T, T>> getRequestMutator();

	public Optional<PacketResponseHandler<U>> getHandler();
	
	public Class<? extends Packet<T, U>> getDefinition();

	public void send();

	public void sendAsync();
}
