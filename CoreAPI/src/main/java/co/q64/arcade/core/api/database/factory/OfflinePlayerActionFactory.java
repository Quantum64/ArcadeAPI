package co.q64.arcade.core.api.database.factory;

import org.bukkit.command.CommandSender;

import co.q64.arcade.core.api.database.OfflinePlayerAction;
import co.q64.arcade.core.api.database.PlayerDataExecutor;
import co.q64.arcade.core.api.database.objects.PlayerData;
import co.q64.arcade.foundation.api.annotation.inject.Global;
import co.q64.arcade.foundation.api.annotation.inject.Injectable;

/**
 * Creates an object that allows a player's data to be accessed while they are offline
 * @author Dylan
 *
 * @param <T> the data bean class to get for the player
 */
@Injectable
@Global
public interface OfflinePlayerActionFactory {
	/**
	 * Gets a provider for offline data access
	 * @param sender the requester of this data, error messages are sent here
	 * @param name the name of the player to get the offline data of
	 * @param exec the place to send the data once it's been retrieved, will always execute on the server thread
	 * @param clazz the data bean class to get
	 * @return the offline data provider
	 */
	public <T extends PlayerData> OfflinePlayerAction<T> create(CommandSender sender, String name, PlayerDataExecutor<T> exec, Class<T> clazz);
}
