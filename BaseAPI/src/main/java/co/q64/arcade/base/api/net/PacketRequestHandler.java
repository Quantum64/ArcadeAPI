package co.q64.arcade.base.api.net;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject
@FunctionalInterface
public interface PacketRequestHandler<T extends Frame, U extends Frame> {
	public void handle(T t, U u);
}
