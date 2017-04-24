package co.q64.arcade.core.api.database;

import co.q64.arcade.foundation.api.annotation.inject.Noinject;

/**
 * Represents an executable that that retrieves a player's data while they are offline
 * @author Dylan
 *
 * @param <T> the bean class of the data to get for the player
 */
@Noinject
public interface OfflinePlayerAction<T> extends Runnable {
	public void executeAsync();
}
