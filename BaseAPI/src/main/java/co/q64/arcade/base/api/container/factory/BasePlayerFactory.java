package co.q64.arcade.base.api.container.factory;

import java.util.Collection;
import java.util.UUID;

import co.q64.arcade.base.api.container.BasePlayer;

public interface BasePlayerFactory {
	public BasePlayer getPlayer(UUID id);

	public BasePlayer getPlayer(String name);

	public Collection<BasePlayer> getOnlinePlayers();
}
