package co.q64.arcade.proxycore.api.container;

import net.md_5.bungee.api.connection.ProxiedPlayer;
import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.container.BasePlayer;

@Noinject
public interface BaseProxyPlayer extends BasePlayer {
	public ProxiedPlayer getPlayer();
}
