package co.q64.arcade.core.api.util.player;

import java.util.List;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import co.q64.arcade.core.api.annotation.Global;
import co.q64.arcade.core.api.annotation.Injectable;


/**
 * Filters online players
 * @author Dylan
 *
 */
@Injectable
@Global
public interface PlayerFilter {
	/**
	 * Gets all the players in the same world as entity p
	 * @param p the entity to filter by
	 * @return the list of filtered players
	 */
	public List<Player> getSameWorld(Entity p);
}
