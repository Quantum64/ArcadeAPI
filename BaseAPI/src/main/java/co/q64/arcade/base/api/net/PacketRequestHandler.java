package co.q64.arcade.base.api.net;

@FunctionalInterface
public interface PacketRequestHandler<T extends Frame, U extends Frame> {
	public U handle(T t);
}
