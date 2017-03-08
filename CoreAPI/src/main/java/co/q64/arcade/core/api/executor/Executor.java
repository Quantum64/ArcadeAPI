package co.q64.arcade.core.api.executor;

import co.q64.arcade.core.api.annotation.Noinject;

/**
 * An executor which can accept handlers and be called with an argument map
 * @author Dylan
 *
 * @param <T> the type of argument map used
 */
@Noinject(reason = Noinject.IMPLEMENT)
public interface Executor<T extends ArgumentMap> {
	/**
	 * Gets the name of the executor
	 * @return the executor name
	 */
	public String getName();
}
