package co.q64.arcade.base.api.net;

public interface CompiledPacketContext<T extends Frame, U extends Frame> {
	public PacketRequestHandler<T, U> getHandler();
	
	public PacketContextOptions<T, U> getOptions();
}
