package co.q64.arcade.core.api.executor;

import co.q64.arcade.core.api.annotation.inject.Noinject;

/**
 * A handler for an executable that accepts an argument
 * @author Dylan
 *
 * @param <T> the type of argument map
 */
@FunctionalInterface
@Noinject(reason = Noinject.IMPLEMENT)
public interface Handler<T extends ArgumentMap> {
	/**
	 * Called when the executor itself is called
	 * @param argumentMap the provided argument map
	 */
	public void execute(T argumentMap);
}