package co.q64.arcade.core.api.managers;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.base.api.managers.Manager;

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