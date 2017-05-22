package co.q64.arcade.proxycore.api.executor;

import net.md_5.bungee.api.connection.ProxiedPlayer;

import co.q64.arcade.base.api.executor.ArgumentMap;

public interface PlayerArgumentMap extends ArgumentMap {
	@Override
	public ProxiedPlayer getArguments();
}
