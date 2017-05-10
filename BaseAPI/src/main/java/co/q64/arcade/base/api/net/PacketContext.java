package co.q64.arcade.base.api.net;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject
public interface PacketContext<T extends Frame, U extends Frame> {
	public void handle(PacketRequestHandler<T, U> t);
}
