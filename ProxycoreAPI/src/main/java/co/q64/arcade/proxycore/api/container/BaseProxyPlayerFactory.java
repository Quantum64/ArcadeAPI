package co.q64.arcade.proxycore.api.container;

import java.util.UUID;

import net.md_5.bungee.api.connection.ProxiedPlayer;
import co.q64.arcade.base.api.container.factory.BasePlayerFactory;

public interface BaseProxyPlayerFactory extends BasePlayerFactory {
	public BaseProxyPlayer getPlayer(UUID p);

	public BaseProxyPlayer getPlayer(String p);

	public BaseProxyPlayer getPlayer(ProxiedPlayer p);
}
