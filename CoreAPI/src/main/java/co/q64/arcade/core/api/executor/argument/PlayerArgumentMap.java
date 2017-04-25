package co.q64.arcade.core.api.executor.argument;

import org.bukkit.entity.Player;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.core.api.executor.ArgumentMap;

@Noinject(reason = Noinject.DATA)
public interface PlayerArgumentMap extends ArgumentMap {
	/**
	 * Gets the player from this map
	 * @return the returned arguments
	 */
	public Player getArguments();
}
