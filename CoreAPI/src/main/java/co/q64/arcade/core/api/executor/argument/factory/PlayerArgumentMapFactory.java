package co.q64.arcade.core.api.executor.argument.factory;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.executor.argument.PlayerArgumentMap;
import co.q64.arcade.foundation.api.annotation.inject.Global;
import co.q64.arcade.foundation.api.annotation.inject.Injectable;

@Injectable
@Global
public interface PlayerArgumentMapFactory {
	public PlayerArgumentMap create(Player player);
}
