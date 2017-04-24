package co.q64.arcade.core.api.executor.argument;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.executor.ArgumentMap;
import co.q64.arcade.foundation.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.DATA)
public interface PlayerArgumentMap extends ArgumentMap {
	/**
	 * Gets the player from this map
	 * @return the returned arguments
	 */
	public Player getArguments();
}
