package co.q64.arcade.core.api.executor;

import co.q64.arcade.core.api.annotation.Noinject;

/**
 * The most basic argument map to be used with an Executable
 * @author Dylan
 *
 */
@Noinject
public abstract interface ArgumentMap {
	/**
	 * Gets the arguments from this map
	 * @return the returned arguments
	 */
	public Object getArguments();
}
