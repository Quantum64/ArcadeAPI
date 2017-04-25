package co.q64.arcade.base.api.container.factory;

import java.util.Collection;
import java.util.UUID;

import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.base.api.container.BasePlayer;

@Injectable
public interface BasePlayerFactory {
	public BasePlayer getPlayer(UUID id);

	public BasePlayer getPlayer(String name);

	public Collection<BasePlayer> getOnlinePlayers();
}
