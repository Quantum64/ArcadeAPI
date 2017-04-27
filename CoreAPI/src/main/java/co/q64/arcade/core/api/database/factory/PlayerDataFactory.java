package co.q64.arcade.core.api.database.factory;

import java.util.UUID;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.core.api.objects.MultiPlayerData;

/**
 * Factory for creating MegaPlayerData, an ease of use class for modifying many tables at once
 * @author Dylan
 *
 */
@Injectable
@Global
public interface PlayerDataFactory {
	/**
	 * Creates a MultiPlayerData from a player UUID
	 * @param player the UUID of the player's data
	 * @return the new MultiPlayerData
	 */
	public MultiPlayerData create(UUID player);
}
