package co.q64.arcade.base.api.net;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject
@FunctionalInterface
public interface PacketResponseHandler<U> {
	public void handle(U u);
}
