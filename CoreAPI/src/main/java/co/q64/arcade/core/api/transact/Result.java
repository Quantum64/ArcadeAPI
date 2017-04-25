package co.q64.arcade.core.api.transact;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.container.BasePlayer;

/**
 * The result of a transaction attempt
 * @author Dylan
 *
 */
@FunctionalInterface
@Noinject(reason = Noinject.DATA)
public interface Result<T> {
	public void onTransaction(BasePlayer p, boolean completed, T argument);
}
