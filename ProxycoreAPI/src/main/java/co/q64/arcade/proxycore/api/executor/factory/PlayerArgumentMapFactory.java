package co.q64.arcade.proxycore.api.executor.factory;

import net.md_5.bungee.api.connection.ProxiedPlayer;
import co.q64.arcade.proxycore.api.executor.PlayerArgumentMap;

public interface PlayerArgumentMapFactory {
	public PlayerArgumentMap create(ProxiedPlayer player);
}
