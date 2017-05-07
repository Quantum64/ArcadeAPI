package co.q64.arcade.base.api.net;

import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public interface ConstructedPacket<T extends Frame, U extends Frame> {
	public PacketDestination getDestination();

	public Optional<UUID> getWaitForConnect();

	public Optional<UUID> getWaitForJoin();

	public Optional<Function<T, T>> getRequestMutator();

	public Optional<PacketResponseHandler<U>> getHandler();
	
	public String getName();

	public void send();

	public void sendAsync();
}
