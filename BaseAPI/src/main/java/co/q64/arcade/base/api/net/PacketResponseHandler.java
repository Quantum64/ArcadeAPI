package co.q64.arcade.base.api.net;

@FunctionalInterface
public interface PacketResponseHandler<U> {
	public void handle(U u);
}
