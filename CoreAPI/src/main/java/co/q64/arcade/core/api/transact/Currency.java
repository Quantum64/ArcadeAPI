package co.q64.arcade.core.api.transact;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.container.BasePlayer;

/**
 * Represents a currency that can be used for transactions
 * @author Dylan
 *
 */
@FunctionalInterface
@Noinject(reason = Noinject.DATA)
public interface Currency {
	/**
	 * Removes currency from this player's account
	 * @pram p the player to remove the currency from
	 * @param amount the amount of currency to remove
	 * @return a positive number with the player's new balance if the transaction passes,
	 *  or a negative number with what the player's new balance would be if the transaction failed
	 */
	public float remove(BasePlayer p, float amount);
}
