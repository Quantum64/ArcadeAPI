package co.q64.arcade.core.api.executor.argument.factory;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.annotation.inject.Global;
import co.q64.arcade.core.api.annotation.inject.Injectable;
import co.q64.arcade.core.api.executor.argument.PlayerArgumentMap;

@Injectable
@Global
public interface PlayerArgumentMapFactory {
	public PlayerArgumentMap create(Player player);
}
