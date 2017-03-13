package co.q64.arcade.core.api.database.objects;

import java.util.concurrent.atomic.AtomicBoolean;

import co.q64.arcade.core.api.annotation.Noinject;

/**
 * Represents a primitive player data that all player data objects must implement
 * to be saved using the arcade player data storage engine
 * @author Dylan
 *
 */
@Noinject(reason = Noinject.DATA)
public interface PlayerData {
	/**
	 * Gets the name of the player
	 * @return the player name
	 */
	public String getName();

	/**
	 * Sets the name of the player
	 * @param name the new name
	 */
	public void setName(String name);

	/**
	 * Gets the UUID of the player as produced by UUID#toString
	 * @return the player's UUID
	 */
	public String getPlayer();

	/**
	 * Sets the UUID of the player as would be produced by UUID#toString
	 * @param player the new UUID of the player
	 */
	public void setPlayer(String player);

	/**
	 * Provide an atomic boolean with a default value of false
	 * @return your boolean
	 */
	public AtomicBoolean needsUpdate();
}
