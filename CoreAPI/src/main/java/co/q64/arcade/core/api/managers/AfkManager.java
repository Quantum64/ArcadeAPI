package co.q64.arcade.core.api.managers;

import co.q64.arcade.core.api.annotation.Global;
import co.q64.arcade.core.api.annotation.Injectable;

/**
 * Enables the AFK system for kicking afk players
 * @author Dylan
 *
 */
@Injectable
@Global
public interface AfkManager extends Manager {
	/**
	 * Enables the /afk command for players to use
	 */
	void enableAfkCommand();
}