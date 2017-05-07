package co.q64.arcade.base.api.net;

public enum DefaultPacketDestination implements PacketDestination {
	PROXY("proxy"), GAMES("games"), HUBS("hubs"), ALL("all");

	private String name;

	private DefaultPacketDestination(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
