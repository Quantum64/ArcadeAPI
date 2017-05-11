package co.q64.arcade.base.api.net;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject
@FunctionalInterface
public interface VoidPacketRequestHandler<T extends Frame, U extends Frame> extends PacketRequestHandler<T, U> {
	public void handle(T t, U u);
}
