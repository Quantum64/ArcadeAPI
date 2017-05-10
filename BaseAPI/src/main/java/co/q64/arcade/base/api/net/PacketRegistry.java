package co.q64.arcade.base.api.net;

import co.q64.arcade.base.api.annotation.inject.Injectable;

@Injectable
public interface PacketRegistry {
	public void register(String name, Class<? extends Packet<? extends Frame, ? extends Frame>> packet, Class<? extends Frame> request, Class<? extends Frame> response);
}
