package co.q64.arcade.base.api.net;

import java.util.Set;

public interface CompiledPacketRegistry {
	public String packetToName(Class<? extends Packet<? extends Frame, ? extends Frame>> packet);

	public String getRequestName(Class<? extends Packet<? extends Frame, ? extends Frame>> packet);

	public String getResponseName(Class<? extends Packet<? extends Frame, ? extends Frame>> packet);

	public Set<Class<? extends Packet<? extends Frame, ? extends Frame>>> getPackets();
}
