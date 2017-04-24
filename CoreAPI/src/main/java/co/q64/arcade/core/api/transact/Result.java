package co.q64.arcade.core.api.transact;

import org.bukkit.entity.Player;

import co.q64.arcade.foundation.api.annotation.inject.Noinject;

/**
 * The result of a transaction attempt
 * @author Dylan
 *
 */
@FunctionalInterface
@Noinject(reason = Noinject.DATA)
public interface Result<T> {
	public void onTransaction(Player p, boolean completed, T argument);
}
