package co.q64.arcade.core.api.executor;

/**
 * The most basic argument map to be used with an Executable
 * @author Dylan
 *
 */
public abstract interface ArgumentMap {
	/**
	 * Gets the arguments from this map
	 * @return the returned arguments
	 */
	public Object getArguments();
}
