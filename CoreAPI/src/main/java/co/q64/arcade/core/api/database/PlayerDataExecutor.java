package co.q64.arcade.core.api.database;

import co.q64.arcade.core.api.annotation.inject.Noinject;
import co.q64.arcade.core.api.database.objects.PlayerData;

/**
 * Runs an action given player data, usually used when the data is not directly
 * accessible, such as when the player is offline
 * Implement this class, do not inject it
 * @author Dylan
 *
 * @param <T> the type of player data to act on
 */
@Noinject
public interface PlayerDataExecutor<T extends PlayerData> {
	/**
	 * The action to perform on the data
	 * @param data the data to act on
	 */
	public void execute(T data);
}