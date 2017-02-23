package co.q64.arcade.core.api.database.factory;

import java.util.UUID;

import co.q64.arcade.core.api.objects.MultiPlayerData;

/**
 * Factory for creating MegaPlayerData, an ease of use class for modifying many tables at once
 * @author Dylan
 *
 */
public interface PlayerDataFactory {
	public MultiPlayerData create(UUID player);
}