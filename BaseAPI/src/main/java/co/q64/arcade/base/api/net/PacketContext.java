package co.q64.arcade.base.api.net;

import co.q64.arcade.base.api.annotation.inject.Noinject;

import com.google.common.base.Function;

@Noinject
public interface PacketContext<T extends Frame, U extends Frame> {
	public void handle(VoidPacketRequestHandler<T, U> t);
	
	public void subjunctiveHandle(SubjunctivePacketRequestHandler<T, U> t);

	public PacketContext<T, U> options(Function<PacketContextOptions<T, U>, PacketContextOptions<T, U>> func);
}
