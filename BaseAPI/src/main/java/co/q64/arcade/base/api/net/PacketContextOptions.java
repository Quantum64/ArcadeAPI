package co.q64.arcade.base.api.net;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject
public interface PacketContextOptions<T extends Frame, U extends Frame> {
	public PacketContextOptions<T, U> noReply();
	
	public boolean shouldReply();
}
