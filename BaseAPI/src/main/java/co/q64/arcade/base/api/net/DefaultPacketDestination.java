package co.q64.arcade.base.api.net;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject
public enum DefaultPacketDestination implements PacketDestination {
	PROXY("proxy"), GAMES("games"), HUBS("hubs"), ALL("all"), DEFAULT("default");

	private String name;

	private DefaultPacketDestination(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
