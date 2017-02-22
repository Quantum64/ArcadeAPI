package co.q64.arcade.core.api.transact;

import org.bukkit.entity.Player;

/**
 * The result of a transaction attempt
 * @author Dylan
 *
 */
@FunctionalInterface
public interface Result<T> {
	public void onTransaction(Player p, boolean completed, T argument);
}
