package co.q64.arcade.core.api;

import org.bukkit.entity.Player;

/**
 * Finds players based on their commonly used chat name
 * @author Dylan
 *
 */
public interface PlayerFinder {
	/**
	 * Gets a player based on their chat name, even if that name is a nickname
	 * @param name the common name of the player
	 * @return the player object represented by this chat name, or null if none can be found
	 */
	public Player getPlayer(String name);
}
