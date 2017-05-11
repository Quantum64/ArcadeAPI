package co.q64.arcade.base.api.net;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject
@FunctionalInterface
public interface SubjunctivePacketRequestHandler<T extends Frame, U extends Frame> extends PacketRequestHandler<T, U> {
	public boolean handle(T t, U u);
}
